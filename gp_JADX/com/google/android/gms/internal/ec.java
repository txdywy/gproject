package com.google.android.gms.internal;

import java.util.HashMap;

public final class ec extends ea {
    public String f26673b;
    public long f26674c;
    public String f26675d;
    public String f26676e;
    public String f26677f;

    public ec() {
        this.f26673b = "E";
        this.f26674c = -1;
        this.f26675d = "E";
        this.f26676e = "E";
        this.f26677f = "E";
    }

    public ec(String str) {
        this();
        mo4716a(str);
    }

    protected final HashMap mo4715a() {
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(0), this.f26673b);
        hashMap.put(Integer.valueOf(4), this.f26677f);
        hashMap.put(Integer.valueOf(3), this.f26676e);
        hashMap.put(Integer.valueOf(2), this.f26675d);
        hashMap.put(Integer.valueOf(1), Long.valueOf(this.f26674c));
        return hashMap;
    }

    protected final void mo4716a(String str) {
        HashMap b = ea.m24312b(str);
        if (b != null) {
            this.f26673b = b.get(Integer.valueOf(0)) == null ? "E" : (String) b.get(Integer.valueOf(0));
            this.f26674c = b.get(Integer.valueOf(1)) == null ? -1 : ((Long) b.get(Integer.valueOf(1))).longValue();
            this.f26675d = b.get(Integer.valueOf(2)) == null ? "E" : (String) b.get(Integer.valueOf(2));
            this.f26676e = b.get(Integer.valueOf(3)) == null ? "E" : (String) b.get(Integer.valueOf(3));
            this.f26677f = b.get(Integer.valueOf(4)) == null ? "E" : (String) b.get(Integer.valueOf(4));
        }
    }
}
