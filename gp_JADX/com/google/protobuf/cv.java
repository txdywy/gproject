package com.google.protobuf;

import java.util.ArrayList;
import java.util.List;

public final class cv extends C7198f {
    public static final cv f35287b;
    public final List f35288c;

    cv() {
        this(new ArrayList(10));
    }

    private cv(List list) {
        this.f35288c = list;
    }

    public final void add(int i, Object obj) {
        m32868c();
        this.f35288c.add(i, obj);
        this.modCount++;
    }

    public final Object get(int i) {
        return this.f35288c.get(i);
    }

    public final Object remove(int i) {
        m32868c();
        Object remove = this.f35288c.remove(i);
        this.modCount++;
        return remove;
    }

    public final Object set(int i, Object obj) {
        m32868c();
        Object obj2 = this.f35288c.set(i, obj);
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f35288c.size();
    }

    public final /* synthetic */ bh mo6094a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        List arrayList = new ArrayList(i);
        arrayList.addAll(this.f35288c);
        return new cv(arrayList);
    }

    static {
        C7198f cvVar = new cv();
        f35287b = cvVar;
        cvVar.f35102a = false;
    }
}
