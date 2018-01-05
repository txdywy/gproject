package com.google.common.p415b;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

class C6959s extends C6958q implements List {
    public final /* synthetic */ C6943c f34352e;

    C6959s(C6943c c6943c, Object obj, List list, C6958q c6958q) {
        this.f34352e = c6943c;
        super(c6943c, obj, list, c6958q);
    }

    public boolean addAll(int i, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f34348b).addAll(i, collection);
        if (!addAll) {
            return addAll;
        }
        C6943c.m31669a(this.f34352e, this.f34348b.size() - size);
        if (size != 0) {
            return addAll;
        }
        m31808c();
        return addAll;
    }

    public Object get(int i) {
        m31806a();
        return ((List) this.f34348b).get(i);
    }

    public Object set(int i, Object obj) {
        m31806a();
        return ((List) this.f34348b).set(i, obj);
    }

    public void add(int i, Object obj) {
        m31806a();
        boolean isEmpty = this.f34348b.isEmpty();
        ((List) this.f34348b).add(i, obj);
        this.f34352e.f34278b = this.f34352e.f34278b + 1;
        if (isEmpty) {
            m31808c();
        }
    }

    public Object remove(int i) {
        m31806a();
        Object remove = ((List) this.f34348b).remove(i);
        this.f34352e.f34278b = this.f34352e.f34278b - 1;
        m31807b();
        return remove;
    }

    public int indexOf(Object obj) {
        m31806a();
        return ((List) this.f34348b).indexOf(obj);
    }

    public int lastIndexOf(Object obj) {
        m31806a();
        return ((List) this.f34348b).lastIndexOf(obj);
    }

    public ListIterator listIterator() {
        m31806a();
        return new C6962t(this);
    }

    public ListIterator listIterator(int i) {
        m31806a();
        return new C6962t(this, i);
    }

    public List subList(int i, int i2) {
        C6958q c6958q;
        m31806a();
        C6943c c6943c = this.f34352e;
        Object obj = this.f34347a;
        List subList = ((List) this.f34348b).subList(i, i2);
        if (this.f34349c != null) {
            c6958q = this.f34349c;
        }
        return c6943c.m31673a(obj, subList, c6958q);
    }
}
