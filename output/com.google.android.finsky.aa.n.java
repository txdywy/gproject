package com.google.android.finsky.aa;

import android.content.SharedPreferences;
import android.content.SharedPreferences$Editor;

public final class com.google.android.finsky.aa.n
{

    public com.google.android.finsky.aa.c a;
    public final String b;
    public final Object c;

    n(com.google.android.finsky.aa.c p0, String p1, Object p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final Object a() {
        return this.a(this.a.a());
    }

    protected abstract Object a(SharedPreferences p0);

    protected abstract void a(SharedPreferences$Editor p0, Object p1);

    public final void a(Object p0) {
        v0 = this.a.a().edit();
        this.a(v0, p0);
        v0.apply();
    }

    public final boolean b() {
        return this.a.a().contains(this.b);
    }

    public final void c() {
        this.a.a().edit().remove(this.b).apply();
    }

}
