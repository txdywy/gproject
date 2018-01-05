package com.android.volley.p060a;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.C0656n;
import com.android.volley.C0659a;
import com.android.volley.C0697m;
import com.android.volley.C0699q;
import com.android.volley.C0704v;

public final class C0667h extends C0656n {
    public final C0659a f4074q;
    public final Runnable f4075r;

    public C0667h(C0659a c0659a, Runnable runnable) {
        super(0, null, null);
        this.f4074q = c0659a;
        this.f4075r = runnable;
    }

    public final boolean mo1073g() {
        this.f4074q.mo1068b();
        if (this.f4075r != null) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.f4075r);
        }
        return true;
    }

    public final C0699q mo1074n() {
        return C0699q.IMMEDIATE;
    }

    protected final C0704v mo1055a(C0697m c0697m) {
        return null;
    }

    protected final void mo1056a(Object obj) {
    }
}
