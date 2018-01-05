package org.chromium.base;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class C7898m implements Iterator {
    public int f40536a;
    public int f40537b;
    public boolean f40538c;
    public final /* synthetic */ C7895l f40539d;

    C7898m(C7895l c7895l) {
        this.f40539d = c7895l;
        c7895l.f40529b++;
        this.f40536a = c7895l.f40528a.size();
    }

    public final boolean hasNext() {
        int i = this.f40537b;
        while (i < this.f40536a && this.f40539d.f40528a.get(i) == null) {
            i++;
        }
        if (i < this.f40536a) {
            return true;
        }
        m37820a();
        return false;
    }

    public final Object next() {
        while (this.f40537b < this.f40536a) {
            C7895l c7895l = this.f40539d;
            if (c7895l.f40528a.get(this.f40537b) != null) {
                break;
            }
            this.f40537b++;
        }
        if (this.f40537b < this.f40536a) {
            c7895l = this.f40539d;
            int i = this.f40537b;
            this.f40537b = i + 1;
            return c7895l.f40528a.get(i);
        }
        m37820a();
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    private final void m37820a() {
        if (!this.f40538c) {
            this.f40538c = true;
            C7895l c7895l = this.f40539d;
            c7895l.f40529b--;
            if (c7895l.f40529b <= 0 && c7895l.f40531d) {
                c7895l.f40531d = false;
                for (int size = c7895l.f40528a.size() - 1; size >= 0; size--) {
                    if (c7895l.f40528a.get(size) == null) {
                        c7895l.f40528a.remove(size);
                    }
                }
            }
        }
    }
}
