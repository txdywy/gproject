package com.google.android.gms.internal;

public final class kz extends nd {
    public static volatile Long f27149a = null;
    public static final Object f27150b = new Object();

    public kz(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 22);
    }

    protected final void mo4764a() {
        if (f27149a == null) {
            synchronized (f27150b) {
                if (f27149a == null) {
                    f27149a = (Long) this.h.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            this.g.f26599u = f27149a;
        }
    }
}
