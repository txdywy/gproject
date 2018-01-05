package com.google.common.p415b;

import java.util.List;
import java.util.ListIterator;

final class C6962t extends C6961r implements ListIterator {
    public final /* synthetic */ C6959s f34356d;

    C6962t(C6959s c6959s) {
        this.f34356d = c6959s;
        super(c6959s);
    }

    public C6962t(C6959s c6959s, int i) {
        this.f34356d = c6959s;
        super(c6959s, ((List) c6959s.f34348b).listIterator(i));
    }

    private final ListIterator m31810b() {
        m31809a();
        return (ListIterator) this.f34353a;
    }

    public final boolean hasPrevious() {
        return m31810b().hasPrevious();
    }

    public final Object previous() {
        return m31810b().previous();
    }

    public final int nextIndex() {
        return m31810b().nextIndex();
    }

    public final int previousIndex() {
        return m31810b().previousIndex();
    }

    public final void set(Object obj) {
        m31810b().set(obj);
    }

    public final void add(Object obj) {
        boolean isEmpty = this.f34356d.isEmpty();
        m31810b().add(obj);
        this.f34356d.f34352e.f34278b = this.f34356d.f34352e.f34278b + 1;
        if (isEmpty) {
            this.f34356d.m31808c();
        }
    }
}
