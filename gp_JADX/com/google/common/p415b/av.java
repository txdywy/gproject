package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.List;

final class av extends at {
    public final transient at f34291c;

    av(at atVar) {
        this.f34291c = atVar;
    }

    private final int m31747a(int i) {
        return (size() - 1) - i;
    }

    public final at mo5892e() {
        return this.f34291c;
    }

    public final boolean contains(Object obj) {
        return this.f34291c.contains(obj);
    }

    public final int indexOf(Object obj) {
        int lastIndexOf = this.f34291c.lastIndexOf(obj);
        return lastIndexOf >= 0 ? m31747a(lastIndexOf) : -1;
    }

    public final int lastIndexOf(Object obj) {
        int indexOf = this.f34291c.indexOf(obj);
        return indexOf >= 0 ? m31747a(indexOf) : -1;
    }

    public final at mo5889a(int i, int i2) {
        C6937m.m31629a(i, i2, size());
        return ((at) this.f34291c.subList(size() - i2, size() - i)).mo5892e();
    }

    public final Object get(int i) {
        C6937m.m31622a(i, size());
        return this.f34291c.get(m31747a(i));
    }

    public final int size() {
        return this.f34291c.size();
    }

    final boolean mo5890c() {
        return this.f34291c.mo5890c();
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return mo5889a(i, i2);
    }
}
