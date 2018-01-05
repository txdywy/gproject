package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class dm implements Iterator {
    dm() {
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
