package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.Iterator;
import java.util.NoSuchElementException;

enum bg implements Iterator {
    ;

    private bg(String str) {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        C6937m.m31631a(false, (Object) "no calls to next() since the last call to remove()");
    }
}
