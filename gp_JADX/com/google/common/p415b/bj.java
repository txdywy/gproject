package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class bj extends AbstractList {
    public final List f34307a;

    bj(List list) {
        this.f34307a = (List) C6937m.m31623a((Object) list);
    }

    private final int m31762b(int i) {
        int size = size();
        C6937m.m31622a(i, size);
        return (size - 1) - i;
    }

    final int m31763a(int i) {
        int size = size();
        C6937m.m31634b(i, size);
        return size - i;
    }

    public void add(int i, Object obj) {
        this.f34307a.add(m31763a(i), obj);
    }

    public void clear() {
        this.f34307a.clear();
    }

    public Object remove(int i) {
        return this.f34307a.remove(m31762b(i));
    }

    protected void removeRange(int i, int i2) {
        subList(i, i2).clear();
    }

    public Object set(int i, Object obj) {
        return this.f34307a.set(m31762b(i), obj);
    }

    public Object get(int i) {
        return this.f34307a.get(m31762b(i));
    }

    public int size() {
        return this.f34307a.size();
    }

    public List subList(int i, int i2) {
        C6937m.m31629a(i, i2, size());
        return bh.m31761a(this.f34307a.subList(m31763a(i2), m31763a(i)));
    }

    public Iterator iterator() {
        return listIterator();
    }

    public ListIterator listIterator(int i) {
        return new bk(this, this.f34307a.listIterator(m31763a(i)));
    }
}
