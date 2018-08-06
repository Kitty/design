package com.prototype;

/**
 * 原型模式
 *
 * @author lzy
 * @date 2018-8-6
 */
public abstract class Shap implements Cloneable {
    private String id;
    private String type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        clone = super.clone();
        return clone();
    }
}
