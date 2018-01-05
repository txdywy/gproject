package com.google.android.finsky.au;

import com.google.android.finsky.cj.C2284a;
import com.google.wireless.android.finsky.b.d;
import com.google.wireless.android.finsky.b.f;
import java.io.File;
import java.io.OutputStream;

public abstract class C1518d {
    public final String f8207e;
    public final String f8208f;
    public final long f8209g;
    public final String f8210h;
    public final String f8211i;
    public final String f8212j;
    public final f f8213k;
    public final d f8214l;

    public C1518d(String str, String str2, long j, String str3, String str4, String str5, f fVar, d dVar) {
        this.f8208f = str2;
        this.f8209g = j;
        this.f8210h = str3;
        this.f8211i = str4;
        this.f8212j = str5;
        this.f8213k = fVar;
        this.f8214l = dVar;
        this.f8207e = str;
    }

    public abstract String mo2273a(String str);

    public abstract void mo2278a(OutputStream outputStream);

    public abstract boolean mo2274a();

    public abstract boolean mo2279a(boolean z);

    public abstract File mo2275b();

    public abstract int mo2276c();

    public abstract boolean mo2277d();

    public abstract OutputStream mo2280e();

    public abstract void mo2281f();

    public abstract boolean mo2282g();

    public File mo2283h() {
        return null;
    }

    public C2284a mo2284i() {
        return null;
    }

    public boolean mo2285j() {
        return true;
    }
}
