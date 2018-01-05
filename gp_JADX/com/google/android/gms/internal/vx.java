package com.google.android.gms.internal;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class vx extends AbstractSet {
    public /* synthetic */ vq f27583a;

    vx(vq vqVar) {
        this.f27583a = vqVar;
    }

    public final /* synthetic */ boolean add(Object obj) {
        Entry entry = (Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f27583a.m25799a((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f27583a.clear();
    }

    public final boolean contains(Object obj) {
        Entry entry = (Entry) obj;
        Object obj2 = this.f27583a.get(entry.getKey());
        Object value = entry.getValue();
        return obj2 == value || (obj2 != null && obj2.equals(value));
    }

    public final Iterator iterator() {
        return new vw(this.f27583a);
    }

    public final boolean remove(Object obj) {
        Entry entry = (Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f27583a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f27583a.size();
    }
}
