package com.android.volley;

public final class C0704v {
    public final Object f4191a;
    public final C0684b f4192b;
    public final VolleyError f4193c;
    public boolean f4194d;

    public static C0704v m4517a(Object obj, C0684b c0684b) {
        return new C0704v(obj, c0684b);
    }

    public static C0704v m4516a(VolleyError volleyError) {
        return new C0704v(volleyError);
    }

    public final boolean m4518a() {
        return this.f4193c == null;
    }

    private C0704v(Object obj, C0684b c0684b) {
        this.f4194d = false;
        this.f4191a = obj;
        this.f4192b = c0684b;
        this.f4193c = null;
    }

    private C0704v(VolleyError volleyError) {
        this.f4194d = false;
        this.f4191a = null;
        this.f4192b = null;
        this.f4193c = volleyError;
    }
}
