package com.google.common.p415b;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

final class C6964u extends C6963w implements NavigableSet {
    public final /* synthetic */ C6943c f34358e;

    C6964u(C6943c c6943c, Object obj, NavigableSet navigableSet, C6958q c6958q) {
        this.f34358e = c6943c;
        super(c6943c, obj, navigableSet, c6958q);
    }

    public final Object lower(Object obj) {
        return ((NavigableSet) super.mo5921d()).lower(obj);
    }

    public final Object floor(Object obj) {
        return ((NavigableSet) super.mo5921d()).floor(obj);
    }

    public final Object ceiling(Object obj) {
        return ((NavigableSet) super.mo5921d()).ceiling(obj);
    }

    public final Object higher(Object obj) {
        return ((NavigableSet) super.mo5921d()).higher(obj);
    }

    public final Object pollFirst() {
        return bb.m31754a(iterator());
    }

    public final Object pollLast() {
        return bb.m31754a(descendingIterator());
    }

    private final NavigableSet m31812a(NavigableSet navigableSet) {
        C6958q c6958q;
        C6943c c6943c = this.f34358e;
        Object obj = this.a;
        if (this.f34349c != null) {
            c6958q = this.f34349c;
        }
        return new C6964u(c6943c, obj, navigableSet, c6958q);
    }

    public final NavigableSet descendingSet() {
        return m31812a(((NavigableSet) super.mo5921d()).descendingSet());
    }

    public final Iterator descendingIterator() {
        return new C6961r(this, ((NavigableSet) super.mo5921d()).descendingIterator());
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return m31812a(((NavigableSet) super.mo5921d()).subSet(obj, z, obj2, z2));
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return m31812a(((NavigableSet) super.mo5921d()).headSet(obj, z));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return m31812a(((NavigableSet) super.mo5921d()).tailSet(obj, z));
    }

    final /* synthetic */ SortedSet mo5921d() {
        return (NavigableSet) super.mo5921d();
    }
}
