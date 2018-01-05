package com.squareup.okhttp.internal.p525a;

import com.squareup.okhttp.internal.C7615d;
import java.io.IOException;

final class C7618h extends C7615d {
    public final /* synthetic */ boolean f39476b = true;
    public final /* synthetic */ int f39477c;
    public final /* synthetic */ int f39478d;
    public final /* synthetic */ am f39479e;
    public final /* synthetic */ C7614e f39480f;

    C7618h(C7614e c7614e, String str, Object[] objArr, int i, int i2) {
        this.f39480f = c7614e;
        this.f39477c = i;
        this.f39478d = i2;
        this.f39479e = null;
        super(str, objArr);
    }

    public final void mo6443a() {
        try {
            C7614e c7614e = this.f39480f;
            boolean z = this.f39476b;
            int i = this.f39477c;
            int i2 = this.f39478d;
            am amVar = this.f39479e;
            synchronized (c7614e.f39466t) {
                if (amVar != null) {
                    if (amVar.f39431b != -1) {
                        throw new IllegalStateException();
                    }
                    amVar.f39431b = System.nanoTime();
                }
                c7614e.f39466t.mo6433a(z, i, i2);
            }
        } catch (IOException e) {
        }
    }
}
