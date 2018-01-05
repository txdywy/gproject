package com.google.android.gms.internal;

public final class kc extends nd {
    public long f27124a;

    public kc(jp jpVar, String str, String str2, ci ciVar, long j, int i) {
        super(jpVar, str, str2, ciVar, i, 25);
        this.f27124a = j;
    }

    protected final void mo4764a() {
        long longValue = ((Long) this.h.invoke(null, new Object[0])).longValue();
        synchronized (this.g) {
            this.g.af = Long.valueOf(longValue);
            if (this.f27124a != 0) {
                this.g.f26595q = Long.valueOf(longValue - this.f27124a);
                this.g.f26600v = Long.valueOf(this.f27124a);
            }
        }
    }
}
