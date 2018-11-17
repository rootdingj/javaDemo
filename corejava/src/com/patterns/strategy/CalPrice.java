package com.patterns.strategy;

/** 
 * @ClassName CalPrice  
 * @Description TODO 
 * @author dingj 
 * @date 2018年10月12日  
 *   
 */
public interface CalPrice {
	//根据原价返回一个最终的价格
    Double calPrice(Double orgnicPrice);

}
