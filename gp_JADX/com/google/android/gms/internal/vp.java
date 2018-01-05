package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

final class vp extends ub {
    public static final vp f27566b;
    public final List f27567c;

    static {
        ub vpVar = new vp();
        f27566b = vpVar;
        vpVar.f27510a = false;
    }

    vp() {
        this(new ArrayList(10));
    }

    private vp(List list) {
        this.f27567c = list;
    }

    public final /* synthetic */ vf mo4937a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        List arrayList = new ArrayList(i);
        arrayList.addAll(this.f27567c);
        return new vp(arrayList);
    }

    public final void add(int i, Object obj) {
        m25649c();
        this.f27567c.add(i, obj);
        this.modCount++;
    }

    public final Object get(int i) {
        return this.f27567c.get(i);
    }

    public final Object remove(int i) {
        m25649c();
        Object remove = this.f27567c.remove(i);
        this.modCount++;
        return remove;
    }

    public final Object set(int i, Object obj) {
        m25649c();
        Object obj2 = this.f27567c.set(i, obj);
        this.modCount++;
        return obj2;
    }

    public final int size() {
        return this.f27567c.size();
    }
}
