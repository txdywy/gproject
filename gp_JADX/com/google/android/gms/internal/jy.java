package com.google.android.gms.internal;

public final class jy extends nd {
    public static volatile String f27116a = null;
    public static final Object f27117b = new Object();

    public jy(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 29);
    }

    protected final void mo4764a() {
        this.g.f26602x = "E";
        if (f27116a == null) {
            synchronized (f27117b) {
                if (f27116a == null) {
                    f27116a = (String) this.h.invoke(null, new Object[]{this.d.f27072b});
                }
            }
        }
        synchronized (this.g) {
            this.g.f26602x = eb.m24315a(f27116a.getBytes(), true);
        }
    }
}
