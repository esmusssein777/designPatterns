package com.ligz.state.gumball;

/**
 * @author ligz
 */
public class NoQuarterState implements State{
	GumballMachine gumballMachine;
	
	public NoQuarterState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("你放入了钱");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
	}

	public void ejectQuarter() {
		System.out.println("里面没有钱，不能退");
		
	}

	public void trunCrank() {
		System.out.println("你转动了，但是没钱没有糖果");
	}

	public void dispense() {
		System.out.println("没钱不发放糖果");
	}
	

}
