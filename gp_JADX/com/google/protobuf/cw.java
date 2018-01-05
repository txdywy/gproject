package com.google.protobuf;

public final class cw implements cd {
    public final cf f35289a;
    public final cx f35290b;

    public cw(cf cfVar, String str, Object[] objArr) {
        this.f35289a = cfVar;
        this.f35290b = new cx(cfVar.getClass(), str, objArr);
    }

    public final ct mo6165a() {
        return (this.f35290b.f35295d & 1) == 1 ? ct.PROTO2 : ct.PROTO3;
    }

    public final boolean mo6166b() {
        return (this.f35290b.f35295d & 2) == 2;
    }

    public final cf mo6167c() {
        return this.f35289a;
    }

    public final boolean mo6168d() {
        return dg.m33254a(this.f35290b.f35299h, this.f35290b.f35300i, this.f35290b.f35296e);
    }
}
