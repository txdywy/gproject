package com.google.android.gms.internal;

import java.util.HashMap;

public final class jn extends ea {
    public Long f27066b;
    public Boolean f27067c;
    public Boolean f27068d;

    public jn(String str) {
        mo4716a(str);
    }

    protected final HashMap mo4715a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f27066b);
        hashMap.put(Integer.valueOf(1), this.f27067c);
        hashMap.put(Integer.valueOf(2), this.f27068d);
        return hashMap;
    }

    protected final void mo4716a(String str) {
        HashMap b = ea.m24312b(str);
        if (b != null) {
            this.f27066b = (Long) b.get(Integer.valueOf(0));
            this.f27067c = (Boolean) b.get(Integer.valueOf(1));
            this.f27068d = (Boolean) b.get(Integer.valueOf(2));
        }
    }
}
