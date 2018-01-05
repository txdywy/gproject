package com.google.common.p415b;

import com.google.common.p414a.C6937m;
import java.util.List;

final class aw extends at {
    public final transient int f34292c;
    public final transient int f34293d;
    public final /* synthetic */ at f34294e;

    aw(at atVar, int i, int i2) {
        this.f34294e = atVar;
        this.f34292c = i;
        this.f34293d = i2;
    }

    public final int size() {
        return this.f34293d;
    }

    public final Object get(int i) {
        C6937m.m31622a(i, this.f34293d);
        return this.f34294e.get(this.f34292c + i);
    }

    public final at mo5889a(int i, int i2) {
        C6937m.m31629a(i, i2, this.f34293d);
        return (at) this.f34294e.subList(this.f34292c + i, this.f34292c + i2);
    }

    final boolean mo5890c() {
        return true;
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return mo5889a(i, i2);
    }
}
