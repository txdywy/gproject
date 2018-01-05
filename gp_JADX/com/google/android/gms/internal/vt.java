package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class vt implements Iterator {
    vt() {
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
