package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

final class cc extends aq implements Serializable, NavigableSet {
    public final NavigableSet f34324a;
    public final SortedSet f34325b;
    public transient cc f34326c;

    cc(NavigableSet navigableSet) {
        this.f34324a = (NavigableSet) C6937m.m31623a((Object) navigableSet);
        this.f34325b = Collections.unmodifiableSortedSet(navigableSet);
    }

    protected final SortedSet mo5900d() {
        return this.f34325b;
    }

    public final Object lower(Object obj) {
        return this.f34324a.lower(obj);
    }

    public final Object floor(Object obj) {
        return this.f34324a.floor(obj);
    }

    public final Object ceiling(Object obj) {
        return this.f34324a.ceiling(obj);
    }

    public final Object higher(Object obj) {
        return this.f34324a.higher(obj);
    }

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public final NavigableSet descendingSet() {
        NavigableSet navigableSet = this.f34326c;
        if (navigableSet != null) {
            return navigableSet;
        }
        navigableSet = new cc(this.f34324a.descendingSet());
        this.f34326c = navigableSet;
        navigableSet.f34326c = this;
        return navigableSet;
    }

    public final Iterator descendingIterator() {
        Object descendingIterator = this.f34324a.descendingIterator();
        C6937m.m31623a(descendingIterator);
        if (descendingIterator instanceof ce) {
            return (ce) descendingIterator;
        }
        return new bc(descendingIterator);
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return ca.m31780a(this.f34324a.subSet(obj, z, obj2, z2));
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return ca.m31780a(this.f34324a.headSet(obj, z));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return ca.m31780a(this.f34324a.tailSet(obj, z));
    }

    protected final /* synthetic */ Set mo5881c() {
        return mo5900d();
    }

    protected final /* synthetic */ Collection mo5880a() {
        return mo5900d();
    }

    protected final /* synthetic */ Object mo5879b() {
        return mo5900d();
    }
}
