package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class C7207k implements Iterator {
    public int f35428a = 0;
    public final int f35429b = this.f35430c.mo6170a();
    public final /* synthetic */ C7203j f35430c;

    C7207k(C7203j c7203j) {
        this.f35430c = c7203j;
    }

    public final boolean hasNext() {
        return this.f35428a < this.f35429b;
    }

    private final byte m33467a() {
        try {
            C7203j c7203j = this.f35430c;
            int i = this.f35428a;
            this.f35428a = i + 1;
            return c7203j.mo6169a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(m33467a());
    }
}
