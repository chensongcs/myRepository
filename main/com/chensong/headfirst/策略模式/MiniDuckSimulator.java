package com.chensong.headfirst.²ßÂÔÄ£Ê½;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallarDuck =  new MallardDuck();
		mallarDuck.performFly();
		mallarDuck.performQuack();
		
		Duck modelDuck = new ModelDuck();
		modelDuck.performFly();
		modelDuck.setFlyBehavior(new FlyRocketPowered());
		modelDuck.performFly();
	}
}
