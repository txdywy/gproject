package com.google.android.gms.internal;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

abstract class ub extends AbstractList implements vf {
    public boolean f27510a = true;

    ub() {
    }

    public final boolean mo4888a() {
        return this.f27510a;
    }

    public void add(int i, Object obj) {
        m25649c();
        super.add(i, obj);
    }

    public boolean add(Object obj) {
        m25649c();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        m25649c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        m25649c();
        return super.addAll(collection);
    }

    public final void mo4889b() {
        this.f27510a = false;
    }

    protected final void m25649c() {
        if (!this.f27510a) {
            throw new UnsupportedOperationException();
        }
    }

    public void clear() {
        m25649c();
        super.clear();
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

    public Object remove(int i) {
        m25649c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        m25649c();
        return super.remove(obj);
    }

    public boolean removeAll(Collection collection) {
        m25649c();
        return super.removeAll(collection);
    }

    public boolean retainAll(Collection collection) {
        m25649c();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        m25649c();
        return super.set(i, obj);
    }
}
