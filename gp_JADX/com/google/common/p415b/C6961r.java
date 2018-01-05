package com.google.common.p415b;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

class C6961r implements Iterator {
    public final Iterator f34353a;
    public final Collection f34354b = this.f34355c.f34348b;
    public final /* synthetic */ C6958q f34355c;

    C6961r(C6958q c6958q) {
        Iterator listIterator;
        this.f34355c = c6958q;
        Collection collection = c6958q.f34348b;
        if (collection instanceof List) {
            listIterator = ((List) collection).listIterator();
        } else {
            listIterator = collection.iterator();
        }
        this.f34353a = listIterator;
    }

    C6961r(C6958q c6958q, Iterator it) {
        this.f34355c = c6958q;
        this.f34353a = it;
    }

    final void m31809a() {
        this.f34355c.m31806a();
        if (this.f34355c.f34348b != this.f34354b) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean hasNext() {
        m31809a();
        return this.f34353a.hasNext();
    }

    public Object next() {
        m31809a();
        return this.f34353a.next();
    }

    public void remove() {
        this.f34353a.remove();
        this.f34355c.f34351e.f34278b = this.f34355c.f34351e.f34278b - 1;
        this.f34355c.m31807b();
    }
}
