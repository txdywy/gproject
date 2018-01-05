package com.google.common.p415b;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

class C6956p extends C6952j implements SortedSet {
    public final /* synthetic */ C6943c f34345a;

    C6956p(C6943c c6943c, SortedMap sortedMap) {
        this.f34345a = c6943c;
        super(c6943c, sortedMap);
    }

    SortedMap mo5917a() {
        return (SortedMap) this.f34314b;
    }

    public Comparator comparator() {
        return mo5917a().comparator();
    }

    public Object first() {
        return mo5917a().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new C6956p(this.f34345a, mo5917a().headMap(obj));
    }

    public Object last() {
        return mo5917a().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new C6956p(this.f34345a, mo5917a().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new C6956p(this.f34345a, mo5917a().tailMap(obj));
    }
}
