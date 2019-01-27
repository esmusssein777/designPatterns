package com.ligz.state.gumball;

/**
 * @author ligz
 */
public class SoldOutState implements State{
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	public void insertQuarter() {
		System.out.println("已经售罄了");
	}

	public void ejectQuarter() {
		System.out.println("里面没有钱，已经售罄了");
		
	}

	public void trunCrank() {
		System.out.println("你转动了，但是没有糖果,已经售罄了");
	}

	public void dispense() {
		System.out.println("已经售罄了不发放糖果");
	}
}
