package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.am;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class C5101f implements Iterator {
    public final C4974b f25961a;
    public int f25962b = -1;

    public C5101f(C4974b c4974b) {
        this.f25961a = (C4974b) am.m23733a((Object) c4974b);
    }

    public final boolean hasNext() {
        return this.f25962b < this.f25961a.mo4501c() + -1;
    }

    public final Object next() {
        if (hasNext()) {
            C4974b c4974b = this.f25961a;
            int i = this.f25962b + 1;
            this.f25962b = i;
            return c4974b.mo4502a(i);
        }
        throw new NoSuchElementException("Cannot advance the iterator beyond " + this.f25962b);
    }

    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
