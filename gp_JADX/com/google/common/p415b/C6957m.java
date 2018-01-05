package com.google.common.p415b;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

final class C6957m extends C6956p implements NavigableSet {
    public final /* synthetic */ C6943c f34346a;

    C6957m(C6943c c6943c, NavigableMap navigableMap) {
        this.f34346a = c6943c;
        super(c6943c, navigableMap);
    }

    public final Object lower(Object obj) {
        return ((NavigableMap) super.mo5917a()).lowerKey(obj);
    }

    public final Object floor(Object obj) {
        return ((NavigableMap) super.mo5917a()).floorKey(obj);
    }

    public final Object ceiling(Object obj) {
        return ((NavigableMap) super.mo5917a()).ceilingKey(obj);
    }

    public final Object higher(Object obj) {
        return ((NavigableMap) super.mo5917a()).higherKey(obj);
    }

    public final Object pollFirst() {
        return bb.m31754a(iterator());
    }

    public final Object pollLast() {
        return bb.m31754a(descendingIterator());
    }

    public final NavigableSet descendingSet() {
        return new C6957m(this.f34346a, ((NavigableMap) super.mo5917a()).descendingMap());
    }

    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    public final NavigableSet headSet(Object obj, boolean z) {
        return new C6957m(this.f34346a, ((NavigableMap) super.mo5917a()).headMap(obj, z));
    }

    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return new C6957m(this.f34346a, ((NavigableMap) super.mo5917a()).subMap(obj, z, obj2, z2));
    }

    public final NavigableSet tailSet(Object obj, boolean z) {
        return new C6957m(this.f34346a, ((NavigableMap) super.mo5917a()).tailMap(obj, z));
    }

    public final /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    public final /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    public final /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    final /* synthetic */ SortedMap mo5917a() {
        return (NavigableMap) super.mo5917a();
    }
}
