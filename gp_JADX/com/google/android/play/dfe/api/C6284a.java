package com.google.android.play.dfe.api;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.C0656n;
import com.android.volley.C0659a;
import com.android.volley.C0697m;
import com.android.volley.C0699q;
import com.android.volley.C0704v;

public final class C6284a extends C0656n {
    public final C0659a f31339q;
    public final Runnable f31340r = null;
    public final String f31341s;
    public final boolean f31342t = true;

    public C6284a(C0659a c0659a, String str) {
        super(0, null, null);
        this.f31339q = c0659a;
        this.f31341s = str;
    }

    public final boolean mo1073g() {
        this.f31339q.mo1067a(this.f31341s, this.f31342t);
        if (this.f31340r != null) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.f31340r);
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
