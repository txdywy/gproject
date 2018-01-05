package com.google.android.finsky.appdiscoveryservice;

import com.google.android.finsky.appdiscoveryservice.b.f;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public final class com.google.android.finsky.appdiscoveryservice.a
{

    public final String a;
    public final int b;
    public final boolean c;
    public final int d;
    public final ConcurrentMap e;

    a(String p0, int p1, int p2, boolean p3) {
        this.a = p0;
        this.b = p1;
        this.c = p3;
        this.d = p2;
        this.e = new ConcurrentHashMap();
    }

    public final com.google.android.finsky.appdiscoveryservice.b.f a(int p0) {
        return (com.google.android.finsky.appdiscoveryservice.b.f)this.e.remove(Integer.valueOf(p0));
    }

}
