package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.NoSuchElementException;

abstract class C6940a extends cf {
    public final int f34269a;
    public int f34270b;

    protected C6940a(int i) {
        this(i, 0);
    }

    protected abstract Object mo5878a(int i);

    protected C6940a(int i, int i2) {
        C6937m.m31634b(i2, i);
        this.f34269a = i;
        this.f34270b = i2;
    }

    public final boolean hasNext() {
        return this.f34270b < this.f34269a;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f34270b;
            this.f34270b = i + 1;
            return mo5878a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f34270b;
    }

    public final boolean hasPrevious() {
        return this.f34270b > 0;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f34270b - 1;
            this.f34270b = i;
            return mo5878a(i);
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f34270b - 1;
    }
}
