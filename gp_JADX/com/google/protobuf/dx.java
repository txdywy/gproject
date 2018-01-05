package com.google.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class dx extends AbstractList implements bo, RandomAccess {
    public final bo f35371a;

    public dx(bo boVar) {
        this.f35371a = boVar;
    }

    public final Object mo6137b(int i) {
        return this.f35371a.mo6137b(i);
    }

    public final int size() {
        return this.f35371a.size();
    }

    public final void mo6135a(C7203j c7203j) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator listIterator(int i) {
        return new dy(this, i);
    }

    public final Iterator iterator() {
        return new dz(this);
    }

    public final List mo6139d() {
        return this.f35371a.mo6139d();
    }

    public final bo mo6140e() {
        return this;
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f35371a.get(i);
    }
}
