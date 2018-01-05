package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.ListIterator;
import java.util.NoSuchElementException;

final class bk implements ListIterator {
    public boolean f34308a;
    public final /* synthetic */ ListIterator f34309b;
    public final /* synthetic */ bj f34310c;

    bk(bj bjVar, ListIterator listIterator) {
        this.f34310c = bjVar;
        this.f34309b = listIterator;
    }

    public final void add(Object obj) {
        this.f34309b.add(obj);
        this.f34309b.previous();
        this.f34308a = false;
    }

    public final boolean hasNext() {
        return this.f34309b.hasPrevious();
    }

    public final boolean hasPrevious() {
        return this.f34309b.hasNext();
    }

    public final Object next() {
        if (hasNext()) {
            this.f34308a = true;
            return this.f34309b.previous();
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f34310c.m31763a(this.f34309b.nextIndex());
    }

    public final Object previous() {
        if (hasPrevious()) {
            this.f34308a = true;
            return this.f34309b.next();
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return nextIndex() - 1;
    }

    public final void remove() {
        C6937m.m31631a(this.f34308a, (Object) "no calls to next() since the last call to remove()");
        this.f34309b.remove();
        this.f34308a = false;
    }

    public final void set(Object obj) {
        C6937m.m31635b(this.f34308a);
        this.f34309b.set(obj);
    }
}
