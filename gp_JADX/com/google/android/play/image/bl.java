package com.google.android.play.image;

import java.util.Iterator;
import java.util.NoSuchElementException;

abstract class bl implements Iterator {
    public bm f32059b = bm.NOT_READY;
    public Object f32060c;

    bl() {
    }

    protected abstract Object mo5407a();

    public final boolean hasNext() {
        if (this.f32059b == bm.FAILED) {
            throw new IllegalStateException();
        }
        switch (this.f32059b.ordinal()) {
            case 0:
                return true;
            case 2:
                return false;
            default:
                this.f32059b = bm.FAILED;
                this.f32060c = mo5407a();
                if (this.f32059b == bm.DONE) {
                    return false;
                }
                this.f32059b = bm.READY;
                return true;
        }
    }

    public final Object next() {
        if (hasNext()) {
            this.f32059b = bm.NOT_READY;
            return this.f32060c;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
