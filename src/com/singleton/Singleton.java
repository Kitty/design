package com.singleton;

/**
 * 单例模式（懒汉式线程不安全）
 *
 * @author lzy
 * @date 2018-8-4
 */
public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

}
