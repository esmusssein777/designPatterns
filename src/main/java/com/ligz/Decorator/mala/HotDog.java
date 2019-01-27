package com.ligz.Decorator.mala;

/**
 * 热狗
 * 热狗是一个装饰者，底料是一个被装饰者
 * 用抽象的装饰者将所有的描述，包括底料和配料
 * @author ligz
 */
public class HotDog extends ComdimentDecorator{
	Primer primer;

	public HotDog(Primer primer) {
		this.primer = primer;
	}

	@Override
	public String getDescription() {
		return primer.getDescription() + "加一根热狗";
	}

	@Override
	public double cost() {
		return primer.cost()+ 2;
	}

}
