package com.patterns.strategy;

/** 
 * @ClassName SuperVip  
 * @Description SuperVip 
 * @author dingj 
 * @date 2018年10月12日  
 *   
 */
public class SuperVip implements CalPrice {

	@Override
	public Double calPrice(Double orgnicPrice) {
		return orgnicPrice * 0.8;
	}

}
