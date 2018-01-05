package com.google.common.p415b;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

class C6954o extends C6949f implements SortedMap {
    public final /* synthetic */ C6943c f34342b;
    public SortedSet f34343c;

    C6954o(C6943c c6943c, SortedMap sortedMap) {
        this.f34342b = c6943c;
        super(c6943c, sortedMap);
    }

    SortedMap mo5913d() {
        return (SortedMap) this.a;
    }

    public Comparator comparator() {
        return mo5913d().comparator();
    }

    public Object firstKey() {
        return mo5913d().firstKey();
    }

    public Object lastKey() {
        return mo5913d().lastKey();
    }

    public SortedMap headMap(Object obj) {
        return new C6954o(this.f34342b, mo5913d().headMap(obj));
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new C6954o(this.f34342b, mo5913d().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new C6954o(this.f34342b, mo5913d().tailMap(obj));
    }

    public SortedSet mo5912c() {
        SortedSet sortedSet = this.f34343c;
        if (sortedSet != null) {
            return sortedSet;
        }
        sortedSet = mo5911b();
        this.f34343c = sortedSet;
        return sortedSet;
    }

    SortedSet mo5911b() {
        return new C6956p(this.f34342b, mo5913d());
    }

    public /* synthetic */ Set keySet() {
        return mo5912c();
    }

    /* synthetic */ Set mo5910e() {
        return mo5911b();
    }
}
