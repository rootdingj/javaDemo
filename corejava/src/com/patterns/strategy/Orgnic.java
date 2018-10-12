package com.patterns.strategy;

/** 
 * @ClassName Orgnic  
 * @Description  原价 
 * @author dingj 
 * @date 2018年10月12日  
 *   
 */
public class Orgnic implements CalPrice {

	@Override
	public Double calPrice(Double orgnicPrice) {
		return orgnicPrice;
	}

}
