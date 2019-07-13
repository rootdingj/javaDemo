package com.dj.pattern.singleton;
/**
 * 
    * @ClassName: EnumSingleton
    * @Description: 枚举实现单例
    * @author Steven
    * @date 2018年7月13日
    *
 */
public enum EnumSingleton implements SingletonInterface {
	INSTANCE {
        @Override
        public void doSomething() {
            System.out.println("complete singleton");
        }
    };

    public static EnumSingleton getInstance() {
        return EnumSingleton.INSTANCE;
    }
}
