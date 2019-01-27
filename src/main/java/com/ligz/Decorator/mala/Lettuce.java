package com.ligz.Decorator.mala;

/**
 * 生菜
 * 生菜是一个装饰者，底料是一个被装饰者
 * 用抽象的装饰者将所有的描述，包括底料和配料
 * @author ligz
 */
public class Lettuce extends ComdimentDecorator{
	Primer primer;

	public Lettuce(Primer primer) {
		this.primer = primer;
	}

	@Override
	public String getDescription() {
		return primer.getDescription() + "加生菜";
	}

	@Override
	public double cost() {
		return primer.cost()+ 1;
	}
}
