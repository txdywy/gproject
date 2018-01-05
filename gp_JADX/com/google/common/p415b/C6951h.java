package com.google.common.p415b;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class C6951h implements Iterator {
    public final Iterator f34335a = this.f34337c.f34332a.entrySet().iterator();
    public Collection f34336b;
    public final /* synthetic */ C6949f f34337c;

    C6951h(C6949f c6949f) {
        this.f34337c = c6949f;
    }

    public final boolean hasNext() {
        return this.f34335a.hasNext();
    }

    public final void remove() {
        this.f34335a.remove();
        C6943c.m31671b(this.f34337c.f34333b, this.f34336b.size());
        this.f34336b.clear();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.f34335a.next();
        this.f34336b = (Collection) entry.getValue();
        return this.f34337c.m31791a(entry);
    }
}
