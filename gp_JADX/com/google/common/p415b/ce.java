package com.google.common.p415b;

import java.util.Iterator;

public abstract class ce implements Iterator {
    protected ce() {
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
