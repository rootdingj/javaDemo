package com.patterns.singleton.lazy;

/** 
 * enum枚举实现单例模式
 * 不暴露枚举类实现细节的封装代码 
 * */
public enum EnumFactory {
	
	singletonFactory;
    
    private MySingleton08 instance;
    
    private EnumFactory(){//枚举类的构造方法在类加载是被实例化
        instance = new MySingleton08 ();
    }
        
    public MySingleton08 getInstance(){
        return instance;
    }
}

class MySingleton08{//需要获实现单例的类，比如数据库连接Connection
    public MySingleton08(){} 
}
