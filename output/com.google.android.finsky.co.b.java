package com.google.android.finsky.co;

import android.content.pm.PackageStats;
import android.os.Handler;
import android.os.Process;

public final class com.google.android.finsky.co.b implements Runnable
{

    public final com.google.android.finsky.co.a a;
    public final String b;
    public final com.google.android.finsky.co.j c;

    b(com.google.android.finsky.co.a p0, String p1, com.google.android.finsky.co.j p2) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
    }

    public final void run() {
        try {
            v6 = new Object[3];
            v6[0] = com.google.android.finsky.co.a.a;
            v6[1] = this.b;
            v6[2] = Process.myUserHandle();
            v4 = this.a.d.invoke(this.a.c, v6);
        }
        catch (Exception ex) {
            this.a.j.post(new com.google.android.finsky.co.d(this.c, this.b, ex));
            return;
        }
        if (v4 != 0) {
            v5 = new PackageStats(this.b);
            v5.codeSize = ((Long)this.a.e.invoke(v4, new Object[0])).longValue();
            v5.dataSize = ((Long)this.a.f.invoke(v4, new Object[0])).longValue();
            v5.cacheSize = ((Long)this.a.g.invoke(v4, new Object[0])).longValue();
            this.a.j.post(new com.google.android.finsky.co.g(this.c, v5));
            return;
        }
        this.a.j.post(new com.google.android.finsky.co.e(this.c, this.b));
        return;
        v5 = new PackageStats(this.b);
        try {
            v5.codeSize = ((Long)this.a.e.invoke(v4, new Object[0])).longValue();
            v5.dataSize = ((Long)this.a.f.invoke(v4, new Object[0])).longValue();
            v5.cacheSize = ((Long)this.a.g.invoke(v4, new Object[0])).longValue();
        }
        catch (Exception ex) {
            this.a.j.post(new com.google.android.finsky.co.f(this.c, this.b, ex));
            return;
        }
        this.a.j.post(new com.google.android.finsky.co.g(this.c, v5));
    }

}
