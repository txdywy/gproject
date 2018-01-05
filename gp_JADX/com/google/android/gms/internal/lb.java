package com.google.android.gms.internal;

public final class lb extends nd {
    public static volatile String f27152a = null;
    public static final Object f27153b = new Object();

    public lb(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 1);
    }

    protected final void mo4764a() {
        this.g.f26579a = "E";
        if (f27152a == null) {
            synchronized (f27153b) {
                if (f27152a == null) {
                    f27152a = (String) this.h.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            this.g.f26579a = f27152a;
        }
    }
}
