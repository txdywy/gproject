package com.google.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Stack;

final class dc implements Iterator {
    public final Stack f35330a = new Stack();
    public C7210p f35331b;

    dc(C7203j c7203j) {
        this.f35331b = m33237a(c7203j);
    }

    private final C7210p m33237a(C7203j c7203j) {
        C7203j c7203j2 = c7203j;
        while (c7203j2 instanceof da) {
            da daVar = (da) c7203j2;
            this.f35330a.push(daVar);
            c7203j2 = daVar.f35325f;
        }
        return (C7210p) c7203j2;
    }

    private final C7210p m33236a() {
        while (!this.f35330a.isEmpty()) {
            Object obj;
            C7210p a = m33237a(((da) this.f35330a.pop()).f35326g);
            if (a.mo6170a() == 0) {
                obj = 1;
                continue;
            } else {
                obj = null;
                continue;
            }
            if (obj == null) {
                return a;
            }
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f35331b != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object next() {
        if (this.f35331b == null) {
            throw new NoSuchElementException();
        }
        C7210p c7210p = this.f35331b;
        this.f35331b = m33236a();
        return c7210p;
    }
}
