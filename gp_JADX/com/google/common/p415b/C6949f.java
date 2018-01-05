package com.google.common.p415b;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

class C6949f extends bs {
    public final transient Map f34332a;
    public final /* synthetic */ C6943c f34333b;

    C6949f(C6943c c6943c, Map map) {
        this.f34333b = c6943c;
        this.f34332a = map;
    }

    protected final Set mo5902a() {
        return new C6950g(this);
    }

    public boolean containsKey(Object obj) {
        return bl.m31766b(this.f34332a, obj);
    }

    public Set keySet() {
        return this.f34333b.mo5869j();
    }

    public int size() {
        return this.f34332a.size();
    }

    public boolean equals(Object obj) {
        return this == obj || this.f34332a.equals(obj);
    }

    public int hashCode() {
        return this.f34332a.hashCode();
    }

    public String toString() {
        return this.f34332a.toString();
    }

    public void clear() {
        if (this.f34332a == this.f34333b.f34277a) {
            this.f34333b.mo5857d();
        } else {
            bb.m31756b(new C6951h(this));
        }
    }

    final Entry m31791a(Entry entry) {
        Object key = entry.getKey();
        return bl.m31765a(key, this.f34333b.m31672a(key, (Collection) entry.getValue()));
    }

    public /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.f34332a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection b = this.f34333b.mo5862b();
        b.addAll(collection);
        C6943c.m31671b(this.f34333b, collection.size());
        collection.clear();
        return b;
    }

    public /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) bl.m31764a(this.f34332a, obj);
        if (collection == null) {
            return null;
        }
        return this.f34333b.m31672a(obj, collection);
    }
}
