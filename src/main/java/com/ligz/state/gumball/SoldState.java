package com.ligz.state.gumball;

/**
 * @author ligz
 */
public class SoldState implements State{
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("稍等，正在发放糖果");
	}

	public void ejectQuarter() {
		System.out.println("你已经转动，不能退款");
	}

	public void trunCrank() {
		System.out.println("转动两次并不会有两个糖果");
	}

	public void dispense() {
		System.out.println("发放糖果");
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() > 0) {
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}
}
