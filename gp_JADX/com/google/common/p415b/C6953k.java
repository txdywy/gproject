package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class C6953k implements Iterator {
    public Entry f34339a;
    public final /* synthetic */ Iterator f34340b;
    public final /* synthetic */ C6952j f34341c;

    C6953k(C6952j c6952j, Iterator it) {
        this.f34341c = c6952j;
        this.f34340b = it;
    }

    public final boolean hasNext() {
        return this.f34340b.hasNext();
    }

    public final Object next() {
        this.f34339a = (Entry) this.f34340b.next();
        return this.f34339a.getKey();
    }

    public final void remove() {
        C6937m.m31631a(this.f34339a != null, (Object) "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.f34339a.getValue();
        this.f34340b.remove();
        C6943c.m31671b(this.f34341c.f34338a, collection.size());
        collection.clear();
    }
}
