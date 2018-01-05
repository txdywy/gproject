package com.squareup.okhttp.internal.p525a;

import com.squareup.okhttp.internal.C7615d;
import java.io.IOException;
import p526e.C7726f;

final class C7621k extends C7615d {
    public final /* synthetic */ int f39485b;
    public final /* synthetic */ C7726f f39486c;
    public final /* synthetic */ int f39487d;
    public final /* synthetic */ C7614e f39488e;

    C7621k(C7614e c7614e, String str, Object[] objArr, int i, C7726f c7726f, int i2) {
        this.f39488e = c7614e;
        this.f39485b = i;
        this.f39486c = c7726f;
        this.f39487d = i2;
        super(str, objArr);
    }

    public final void mo6443a() {
        try {
            this.f39488e.f39458l.mo6440a(this.f39486c, this.f39487d);
            this.f39488e.f39466t.mo6430a(this.f39485b, C7609a.CANCEL);
            synchronized (this.f39488e) {
                this.f39488e.f39468v.remove(Integer.valueOf(this.f39485b));
            }
        } catch (IOException e) {
        }
    }
}
