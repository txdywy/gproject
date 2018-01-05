package com.google.android.gms.internal;

import java.util.HashMap;

public final class jo extends ea {
    public Long f27069b;
    public Long f27070c;

    public jo(String str) {
        mo4716a(str);
    }

    protected final HashMap mo4715a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f27069b);
        hashMap.put(Integer.valueOf(1), this.f27070c);
        return hashMap;
    }

    protected final void mo4716a(String str) {
        HashMap b = ea.m24312b(str);
        if (b != null) {
            this.f27069b = (Long) b.get(Integer.valueOf(0));
            this.f27070c = (Long) b.get(Integer.valueOf(1));
        }
    }
}
