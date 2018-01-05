package com.google.android.finsky.appdiscoveryservice;

import com.google.android.finsky.appdiscoveryservice.p128b.C1308f;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class C1307a {
    public final String f7754a;
    public final int f7755b;
    public final boolean f7756c;
    public final int f7757d;
    public final ConcurrentMap f7758e = new ConcurrentHashMap();

    public C1307a(String str, int i, int i2, boolean z) {
        this.f7754a = str;
        this.f7755b = i;
        this.f7756c = z;
        this.f7757d = i2;
    }

    public final C1308f m7766a(int i) {
        return (C1308f) this.f7758e.remove(Integer.valueOf(i));
    }
}
