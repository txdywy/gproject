package com.google.android.gms.internal;

import java.util.HashMap;

public final class jv extends ea {
    public Long f27106b;
    public Long f27107c;
    public Long f27108d;

    public jv(String str) {
        mo4716a(str);
    }

    protected final HashMap mo4715a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f27106b);
        hashMap.put(Integer.valueOf(1), this.f27107c);
        hashMap.put(Integer.valueOf(2), this.f27108d);
        return hashMap;
    }

    protected final void mo4716a(String str) {
        HashMap b = ea.m24312b(str);
        if (b != null) {
            this.f27106b = (Long) b.get(Integer.valueOf(0));
            this.f27107c = (Long) b.get(Integer.valueOf(1));
            this.f27108d = (Long) b.get(Integer.valueOf(2));
        }
    }
}
