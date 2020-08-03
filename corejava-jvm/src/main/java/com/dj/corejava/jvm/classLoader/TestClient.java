 package com.dj.corejava.jvm.classLoader;

 public class TestClient {

    public static void main(String[] args) throws Exception {
        CustomClassLoader loader = new CustomClassLoader();
        loader.setBasePath("D:\\resource\\git-steven\\corejava\\corejava-jvm\\target\\classes\\");
        Class<?> userClass = loader.findClass("com.dj.corejava.jvm.classLoader.User");
        System.out.println(userClass.getClassLoader());
        Object instance = userClass.newInstance();
        System.out.println(instance);
    }

}
