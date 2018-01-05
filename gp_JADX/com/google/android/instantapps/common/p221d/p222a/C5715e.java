package com.google.android.instantapps.common.p221d.p222a;

import android.util.Log;

final class C5715e implements C5713v {
    public final /* synthetic */ Runnable f28936a;
    public final /* synthetic */ C5710a f28937b;

    C5715e(C5710a c5710a, Runnable runnable) {
        this.f28937b = c5710a;
        this.f28936a = runnable;
    }

    public final void mo5141a(C5724n c5724n) {
        try {
            c5724n.m27020a(this.f28936a);
            this.f28937b.f28891o.mo3542b();
        } catch (Throwable e) {
            Log.e("LoggingContext", "Failed to flush.", e);
        }
    }

    public final void mo5142a(Throwable th) {
        Log.e("LoggingContext", "Failed to get EventLogger.", th);
    }
}
