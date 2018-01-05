package com.google.android.finsky.api.p125a;

import android.os.Handler;
import android.os.Looper;
import com.android.volley.C0656n;
import com.android.volley.C0659a;
import com.android.volley.C0697m;
import com.android.volley.C0699q;
import com.android.volley.C0704v;

public final class cn extends C0656n {
    public final C0659a f7456q;
    public final Runnable f7457r = null;
    public final String f7458s;
    public final boolean f7459t = true;

    public cn(C0659a c0659a, String str) {
        super(0, null, null);
        this.f7456q = c0659a;
        this.f7458s = str;
    }

    public final boolean mo1073g() {
        this.f7456q.mo1067a(this.f7458s, this.f7459t);
        if (this.f7457r != null) {
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(this.f7457r);
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
