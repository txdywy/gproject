package com.google.android.gms.internal;

public final class lr extends nd {
    public lr(jp jpVar, String str, String str2, ci ciVar, int i) {
        super(jpVar, str, str2, ciVar, i, 48);
    }

    protected final void mo4764a() {
        this.g.f26567O = Integer.valueOf(2);
        boolean booleanValue = ((Boolean) this.h.invoke(null, new Object[]{this.d.f27073c})).booleanValue();
        synchronized (this.g) {
            if (booleanValue) {
                this.g.f26567O = Integer.valueOf(1);
            } else {
                this.g.f26567O = Integer.valueOf(0);
            }
        }
    }
}
