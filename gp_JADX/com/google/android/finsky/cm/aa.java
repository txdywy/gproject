package com.google.android.finsky.cm;

import com.google.android.finsky.packagemanager.C2294c;

final class aa implements C2294c {
    public final /* synthetic */ C2297d f11324a;
    public final /* synthetic */ String f11325b;
    public final /* synthetic */ C2318y f11326c;

    aa(C2318y c2318y, C2297d c2297d, String str) {
        this.f11326c = c2318y;
        this.f11324a = c2297d;
        this.f11325b = str;
    }

    public final void mo2836a() {
        m11804b();
        this.f11324a.mo2939a();
    }

    public final void mo2837a(int i, Throwable th) {
        synchronized (this.f11326c) {
            m11804b();
            this.f11324a.mo2940a(i, th);
        }
    }

    private final void m11804b() {
        synchronized (this.f11326c) {
            this.f11326c.m11865c(this.f11325b);
        }
    }
}
