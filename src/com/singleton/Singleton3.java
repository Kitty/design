package com.singleton;

/**
 * 单例模式（饿汉式）
 *
 * @author lzy
 * @date 2018-8-4
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();

    private Singleton3() {
    }

    private static Singleton3 getInstance() {
        return instance;
    }
}
