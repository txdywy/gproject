package com.google.protobuf;

import java.util.ListIterator;

final class dy implements ListIterator {
    public ListIterator f35372a = this.f35374c.f35371a.listIterator(this.f35373b);
    public final /* synthetic */ int f35373b;
    public final /* synthetic */ dx f35374c;

    dy(dx dxVar, int i) {
        this.f35374c = dxVar;
        this.f35373b = i;
    }

    public final boolean hasNext() {
        return this.f35372a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f35372a.hasPrevious();
    }

    public final int nextIndex() {
        return this.f35372a.nextIndex();
    }

    public final int previousIndex() {
        return this.f35372a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object previous() {
        return (String) this.f35372a.previous();
    }

    public final /* synthetic */ Object next() {
        return (String) this.f35372a.next();
    }
}
