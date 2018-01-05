package com.google.android.gms.internal;

import java.util.List;

public final class lc extends nd {
    public List f27154a = null;

    public lc(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 31);
    }

    protected final void mo4764a() {
        this.g.f26603y = Long.valueOf(-1);
        this.g.f26604z = Long.valueOf(-1);
        if (this.f27154a == null) {
            this.f27154a = (List) this.h.invoke(null, new Object[]{this.d.f27072b});
        }
        if (this.f27154a != null && this.f27154a.size() == 2) {
            synchronized (this.g) {
                this.g.f26603y = Long.valueOf(((Long) this.f27154a.get(0)).longValue());
                this.g.f26604z = Long.valueOf(((Long) this.f27154a.get(1)).longValue());
            }
        }
    }
}
