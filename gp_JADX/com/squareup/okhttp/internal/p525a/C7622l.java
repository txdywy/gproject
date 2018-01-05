package com.squareup.okhttp.internal.p525a;

import com.squareup.okhttp.internal.C7615d;

final class C7622l extends C7615d {
    public final /* synthetic */ int f39489b;
    public final /* synthetic */ C7614e f39490c;

    C7622l(C7614e c7614e, String str, Object[] objArr, int i) {
        this.f39490c = c7614e;
        this.f39489b = i;
        super(str, objArr);
    }

    public final void mo6443a() {
        this.f39490c.f39458l.mo6442c();
        synchronized (this.f39490c) {
            this.f39490c.f39468v.remove(Integer.valueOf(this.f39489b));
        }
    }
}
