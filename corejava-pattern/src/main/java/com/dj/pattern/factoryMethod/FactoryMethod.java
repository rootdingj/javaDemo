package com.dj.pattern.factoryMethod;

import com.dj.pattern.simpleFactory.Product;

/**
 * 
 * @ClassName: FactoryMethod
 * @Description: 提供了工厂的接口
 * @author Steven
 * @date 2018年7月13日
 *
 */
public interface FactoryMethod {
	
	Product createProduct();
}
