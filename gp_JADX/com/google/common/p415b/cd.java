package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.Iterator;

abstract class cd implements Iterator {
    public final Iterator f34296b;

    cd(Iterator it) {
        this.f34296b = (Iterator) C6937m.m31623a((Object) it);
    }

    abstract Object mo5896a(Object obj);

    public final boolean hasNext() {
        return this.f34296b.hasNext();
    }

    public final Object next() {
        return mo5896a(this.f34296b.next());
    }

    public final void remove() {
        this.f34296b.remove();
    }
}
