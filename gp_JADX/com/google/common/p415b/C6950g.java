package com.google.common.p415b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

final class C6950g extends bp {
    public final /* synthetic */ C6949f f34334a;

    C6950g(C6949f c6949f) {
        this.f34334a = c6949f;
    }

    final Map mo5904a() {
        return this.f34334a;
    }

    public final Iterator iterator() {
        return new C6951h(this.f34334a);
    }

    public final boolean contains(Object obj) {
        return af.m31701a(this.f34334a.f34332a.entrySet(), obj);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Entry entry = (Entry) obj;
        C6943c c6943c = this.f34334a.f34333b;
        Collection collection = (Collection) bl.m31767c(c6943c.f34277a, entry.getKey());
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            c6943c.f34278b -= size;
        }
        return true;
    }
}
