package com.google.android.gms.internal;

public final class kb extends nd {
    public static volatile Long f27122a = null;
    public static final Object f27123b = new Object();

    public kb(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 44);
    }

    protected final void mo4764a() {
        if (f27122a == null) {
            synchronized (f27123b) {
                if (f27122a == null) {
                    f27122a = (Long) this.h.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.g) {
            this.g.f26563K = f27122a;
        }
    }
}
