package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class ue implements Iterator {
    public int f27514a = 0;
    public final int f27515b = this.f27516c.mo4892a();
    public /* synthetic */ ud f27516c;

    ue(ud udVar) {
        this.f27516c = udVar;
    }

    private final byte m25666a() {
        try {
            ud udVar = this.f27516c;
            int i = this.f27514a;
            this.f27514a = i + 1;
            return udVar.mo4891a(i);
        } catch (IndexOutOfBoundsException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final boolean hasNext() {
        return this.f27514a < this.f27515b;
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(m25666a());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
