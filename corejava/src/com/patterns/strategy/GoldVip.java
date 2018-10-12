package com.patterns.strategy;

/** 
 * @ClassName GoldVip  
 * @Description GoldVip 
 * @author dingj 
 * @date 2018年10月12日  
 *   
 */
public class GoldVip implements CalPrice {

	@Override
	public Double calPrice(Double orgnicPrice) {
		return orgnicPrice * 0.7;
	}

}
