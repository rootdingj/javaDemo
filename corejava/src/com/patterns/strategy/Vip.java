package com.patterns.strategy;

/** 
 * @ClassName Vip  
 * @Description Vip 
 * @author dingj 
 * @date 2018年10月12日  
 *   
 */
public class Vip implements CalPrice {

	@Override
	public Double calPrice(Double orgnicPrice) {
		return orgnicPrice * 0.9;
	}

}
