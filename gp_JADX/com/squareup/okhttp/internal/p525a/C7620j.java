package com.squareup.okhttp.internal.p525a;

import com.squareup.okhttp.internal.C7615d;
import java.io.IOException;

final class C7620j extends C7615d {
    public final /* synthetic */ int f39483b;
    public final /* synthetic */ C7614e f39484c;

    C7620j(C7614e c7614e, String str, Object[] objArr, int i) {
        this.f39484c = c7614e;
        this.f39483b = i;
        super(str, objArr);
    }

    public final void mo6443a() {
        this.f39484c.f39458l.mo6441b();
        try {
            this.f39484c.f39466t.mo6430a(this.f39483b, C7609a.CANCEL);
            synchronized (this.f39484c) {
                this.f39484c.f39468v.remove(Integer.valueOf(this.f39483b));
            }
        } catch (IOException e) {
        }
    }
}
