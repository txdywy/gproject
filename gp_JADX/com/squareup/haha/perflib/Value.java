package com.squareup.haha.perflib;

public class Value {
    public final Instance instance;
    public Object mValue;

    public Value(Instance instance) {
        this.instance = instance;
    }

    public Object getValue() {
        return this.mValue;
    }

    public void setValue(Object obj) {
        this.mValue = obj;
        if (obj instanceof Instance) {
            ((Instance) obj).addReference(null, this.instance);
        }
    }
}
