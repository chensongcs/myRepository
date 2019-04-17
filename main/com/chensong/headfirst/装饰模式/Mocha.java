package com.chensong.headfirst.װ��ģʽ;

public class Mocha extends CondimentDecorator {
	Beverage beverage;// ��һ��ʵ��������¼���ϣ�����װ����
	
	/**
	 * ��취�ñ�װ���ߣ����ϣ�����¼��ʵ��������
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
