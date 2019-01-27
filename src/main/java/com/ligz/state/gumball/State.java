package com.ligz.state.gumball;

/**
 * 状态模式
 * 你需要确认流程中有哪些状态
 * @author ligz
 */
public interface State {
	void insertQuarter();//放入25分钱
	void ejectQuarter();//退回
	void trunCrank();//转动把手
	void dispense();//发放糖果
}
