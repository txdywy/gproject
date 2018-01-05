package com.google.protobuf;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

class dq extends AbstractSet {
    public final /* synthetic */ dh f35353a;

    dq(dh dhVar) {
        this.f35353a = dhVar;
    }

    public Iterator iterator() {
        return new dp(this.f35353a);
    }

    public int size() {
        return this.f35353a.size();
    }

    public boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f35353a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f35353a.remove(entry.getKey());
        return true;
    }

    public void clear() {
        this.f35353a.clear();
    }

    public /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f35353a.m33288a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }
}
