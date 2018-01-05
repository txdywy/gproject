package com.google.common.p415b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

class C6952j extends bq {
    public final /* synthetic */ C6943c f34338a;

    C6952j(C6943c c6943c, Map map) {
        this.f34338a = c6943c;
        super(map);
    }

    public Iterator iterator() {
        return new C6953k(this, this.f34314b.entrySet().iterator());
    }

    public boolean remove(Object obj) {
        int i;
        Collection collection = (Collection) this.f34314b.remove(obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            C6943c.m31671b(this.f34338a, size);
            i = size;
        } else {
            i = 0;
        }
        return i > 0;
    }

    public void clear() {
        bb.m31756b(iterator());
    }

    public boolean containsAll(Collection collection) {
        return this.f34314b.keySet().containsAll(collection);
    }

    public boolean equals(Object obj) {
        return this == obj || this.f34314b.keySet().equals(obj);
    }

    public int hashCode() {
        return this.f34314b.keySet().hashCode();
    }
}
