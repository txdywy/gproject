package com.google.vr.p479a.p480a.p481a;

import android.os.Handler;
import android.os.Looper;
import com.google.vr.p479a.p480a.C7238c;
import com.google.vr.p479a.p480a.C7245h;

public final class C7239e extends C7238c {
    public static final Handler f35519a = new Handler(Looper.getMainLooper());
    public final C7236d f35520b;

    public C7239e(C7236d c7236d) {
        this.f35520b = c7236d;
    }

    public final void mo6307a(C7245h c7245h) {
        C7235c c7235c = c7245h != null ? new C7235c(c7245h) : null;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            this.f35520b.m33832a(c7235c);
        } else {
            f35519a.post(new C7240f(this, c7235c));
        }
    }
}
