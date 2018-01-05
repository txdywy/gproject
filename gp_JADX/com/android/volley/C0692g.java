package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

public final class C0692g implements C0691y {
    public final Executor f4154a;

    public C0692g(Handler handler) {
        this.f4154a = new C0693h(handler);
    }

    public final void mo1081a(C0656n c0656n, C0704v c0704v) {
        mo1082a(c0656n, c0704v, null);
    }

    public final void mo1082a(C0656n c0656n, C0704v c0704v, Runnable runnable) {
        c0656n.mo1538p();
        c0656n.m4366a("post-response");
        this.f4154a.execute(new C0694i(c0656n, c0704v, runnable));
    }

    public final void mo1080a(C0656n c0656n, VolleyError volleyError) {
        c0656n.m4366a("post-error");
        this.f4154a.execute(new C0694i(c0656n, C0704v.m4516a(volleyError), null));
    }
}
