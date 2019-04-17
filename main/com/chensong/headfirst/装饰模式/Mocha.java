package com.chensong.headfirst.装饰模式;

public class Mocha extends CondimentDecorator {
	Beverage beverage;// 用一个实例变量记录饮料，即被装饰者
	
	/**
	 * 想办法让被装饰者（饮料）被记录到实例变量中
	 * 
	 */
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}

}
