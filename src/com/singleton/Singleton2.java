package com.singleton;

/**
 * 单例模式（懒汉式线程安全）
 *
 * @author lzy
 * @date 2018-8-4
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
