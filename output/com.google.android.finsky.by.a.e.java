package com.google.android.finsky.by.a;

import com.google.android.finsky.by.g;

public final class com.google.android.finsky.by.a.e implements com.google.android.finsky.by.e
{

    public final com.google.android.finsky.by.a.m f;

    e(com.google.android.finsky.by.a.m p0) {
        this.f = p0;
    }

    public void a() {
        this.f.b();
    }

    public abstract void a(String p0, String p1);

    public void c(com.google.android.finsky.by.g p0) {
        v0 = this.b(p0);
        if (v0 != 0)
            this.f.b(v0.n);
    }

    public void d(com.google.android.finsky.by.g p0) {
        if (!this.a(p0))
            this.f.a(p0.n);
    }

    public final long h() {
        return this.f.a();
    }

}
