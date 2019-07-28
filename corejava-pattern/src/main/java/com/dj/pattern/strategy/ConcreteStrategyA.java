package com.dj.pattern.strategy;

//具体策略类A
public class ConcreteStrategyA implements Strategy {

	@Override
	public void strategyMethod() {
		 System.out.println("执行 ConcreteStrategyA 的策略方法。。。");
	}

}
