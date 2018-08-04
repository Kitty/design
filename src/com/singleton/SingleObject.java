package com.singleton;

/**
 * 单例模式
 *
 * @author lzy
 * @date 2018-8-4
 */
public class SingleObject {
    private static SingleObject instance = new SingleObject();

    private SingleObject(){};

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("hello singleton");
    }
}
