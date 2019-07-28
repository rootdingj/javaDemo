package com.dj.pattern.strategy;

// 环境类
public class Context {

	private Strategy strategy;
	
	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	// 通过 set 不同的 strategy 对象，而动态地改变调用的策略方法
	public void operation() {
		strategy.strategyMethod();
	}

}
