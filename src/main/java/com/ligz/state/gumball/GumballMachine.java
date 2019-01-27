package com.ligz.state.gumball;

/**
 * @author ligz
 */
public class GumballMachine {
	State noQuarterState;
	
	State hasQuarterState;
	
	State soldOutState;
	
	State soldState;
	
	
	int count = 0;
	State state = soldOutState;
	
	public GumballMachine(int count) {
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		soldOutState = new SoldOutState(this);
		this.count = count;
		if(count > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.trunCrank();
		state.dispense();
	}
	
	void releaseBall() {
		System.out.println("成功发放了一个糖果");
		if(count > 0 ) {
			count = count - 1;
		}
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}
	
	

	
	
	
	
}
