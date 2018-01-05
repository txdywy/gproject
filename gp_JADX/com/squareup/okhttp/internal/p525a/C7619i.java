package com.squareup.okhttp.internal.p525a;

import com.squareup.okhttp.internal.C7615d;
import java.io.IOException;

final class C7619i extends C7615d {
    public final /* synthetic */ int f39481b;
    public final /* synthetic */ C7614e f39482c;

    C7619i(C7614e c7614e, String str, Object[] objArr, int i) {
        this.f39482c = c7614e;
        this.f39481b = i;
        super(str, objArr);
    }

    public final void mo6443a() {
        this.f39482c.f39458l.mo6439a();
        try {
            this.f39482c.f39466t.mo6430a(this.f39481b, C7609a.CANCEL);
            synchronized (this.f39482c) {
                this.f39482c.f39468v.remove(Integer.valueOf(this.f39481b));
            }
        } catch (IOException e) {
        }
    }
}
