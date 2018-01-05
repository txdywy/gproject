package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class C7198f extends AbstractList implements bh {
    public boolean f35102a = true;

    C7198f() {
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < size(); i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    public boolean add(Object obj) {
        m32868c();
        return super.add(obj);
    }

    public void add(int i, Object obj) {
        m32868c();
        super.add(i, obj);
    }

    public boolean addAll(Collection collection) {
        m32868c();
        return super.addAll(collection);
    }

    public boolean addAll(int i, Collection collection) {
        m32868c();
        return super.addAll(i, collection);
    }

    public void clear() {
        m32868c();
        super.clear();
    }

    public boolean mo6092a() {
        return this.f35102a;
    }

    public final void mo6093b() {
        this.f35102a = false;
    }

    public Object remove(int i) {
        m32868c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        m32868c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        m32868c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        m32868c();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        m32868c();
        return super.set(i, obj);
    }

    protected final void m32868c() {
        if (!this.f35102a) {
            throw new UnsupportedOperationException();
        }
    }
}
