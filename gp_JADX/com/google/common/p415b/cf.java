package com.google.common.p415b;

import java.util.ListIterator;

public abstract class cf extends ce implements ListIterator {
    protected cf() {
    }

    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
