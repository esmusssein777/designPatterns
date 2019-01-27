package com.ligz.state.gumball;

/**
 * @author ligz
 */
public class HasQuarterState implements State{
	GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("里面已经有钱了");
	}

	public void ejectQuarter() {
		System.out.println("退款成功");
	}

	public void trunCrank() {
		System.out.println("你转动了，开始准备糖果");
		gumballMachine.setState(gumballMachine.getSoldState());
	}

	public void dispense() {
		System.out.println("糖果正在准备");
	}
}
