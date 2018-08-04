package com.singleton;

/**
 * 单例模式
 *
 * @author lzy
 * @date 2018-8-4
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
