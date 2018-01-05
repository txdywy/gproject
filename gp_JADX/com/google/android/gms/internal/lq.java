package com.google.android.gms.internal;

public final class lq extends nd {
    public static volatile Long f27159a = null;
    public static final Object f27160b = new Object();

    public lq(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 33);
    }

    protected final void mo4764a() {
        if (f27159a == null) {
            synchronized (f27160b) {
                if (f27159a == null) {
                    f27159a = (Long) this.h.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            this.g.f26553A = f27159a;
        }
    }
}
