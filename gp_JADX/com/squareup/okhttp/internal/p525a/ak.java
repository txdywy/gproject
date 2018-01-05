package com.squareup.okhttp.internal.p525a;

import p526e.C7612l;
import p526e.C7726f;
import p526e.aa;

final class ak extends C7612l {
    public final /* synthetic */ aj f39429a;

    ak(aj ajVar, aa aaVar) {
        this.f39429a = ajVar;
        super(aaVar);
    }

    public final long mo6423a(C7726f c7726f, long j) {
        if (this.f39429a.f39426b == 0) {
            return -1;
        }
        long a = super.mo6423a(c7726f, Math.min(j, (long) this.f39429a.f39426b));
        if (a == -1) {
            return -1;
        }
        this.f39429a.f39426b = (int) (((long) this.f39429a.f39426b) - a);
        return a;
    }
}
