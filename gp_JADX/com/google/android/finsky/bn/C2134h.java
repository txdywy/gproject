package com.google.android.finsky.bn;

import android.os.Handler;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.wireless.android.finsky.b.a;
import java.util.ArrayList;
import java.util.Collection;

public final class C2134h implements C2127b {
    public final C2127b f10839a;
    public final C2127b f10840b;
    public final Handler f10841c;
    public final Handler f10842d;
    public boolean f10843e;
    public Collection f10844f = new ArrayList();

    public C2134h(C2127b c2127b, C2127b c2127b2, Handler handler, Handler handler2) {
        this.f10839a = c2127b;
        this.f10840b = c2127b2;
        this.f10841c = handler;
        this.f10842d = handler2;
    }

    public final synchronized boolean m11208b() {
        return this.f10843e;
    }

    public final synchronized void m11209c() {
        if (!this.f10843e) {
            for (C2129c a : this.f10840b.mo2658a()) {
                this.f10839a.mo2659a(a);
            }
            this.f10843e = true;
        }
        for (Runnable runnable : this.f10844f) {
            if (runnable != null) {
                this.f10842d.post(runnable);
            }
        }
        this.f10844f.clear();
    }

    public final synchronized boolean m11204a(Runnable runnable) {
        boolean z;
        if (this.f10843e) {
            if (runnable != null) {
                this.f10842d.post(runnable);
            }
            z = true;
        } else {
            this.f10844f.add(runnable);
            if (this.f10844f.size() < 2) {
                this.f10841c.post(new C2135i(this));
            }
            z = false;
        }
        return z;
    }

    public final synchronized C2129c mo2657a(String str) {
        return this.f10839a.mo2657a(str);
    }

    public final synchronized Collection mo2658a() {
        return this.f10839a.mo2658a();
    }

    public final synchronized void mo2659a(C2129c c2129c) {
        this.f10839a.mo2659a(c2129c);
        this.f10841c.post(new C2143q(this, c2129c));
    }

    public final synchronized void mo2660a(C2131e c2131e) {
        this.f10839a.mo2660a(c2131e);
        this.f10841c.post(new aa(this, c2131e));
    }

    public final synchronized void mo2661a(String str, int i) {
        this.f10839a.mo2661a(str, i);
        this.f10841c.post(new ac(this, str, i));
    }

    public final synchronized void mo2669b(String str, int i) {
        this.f10839a.mo2669b(str, i);
        this.f10841c.post(new ad(this, str, i));
    }

    public final synchronized void mo2672c(String str, int i) {
        this.f10839a.mo2672c(str, i);
        this.f10841c.post(new ae(this, str, i));
    }

    public final synchronized void mo2665a(String str, a aVar, long j) {
        this.f10839a.mo2665a(str, aVar, j);
        this.f10841c.post(new af(this, str, aVar, j));
    }

    public final synchronized void mo2662a(String str, int i, String str2) {
        this.f10839a.mo2662a(str, i, str2);
        this.f10841c.post(new C2136j(this, str, i, str2));
    }

    public final synchronized void mo2663a(String str, long j) {
        this.f10839a.mo2663a(str, j);
        this.f10841c.post(new C2137k(this, str, j));
    }

    public final synchronized void mo2666a(String str, String str2) {
        this.f10839a.mo2666a(str, str2);
        this.f10841c.post(new C2138l(this, str, str2));
    }

    public final synchronized void mo2675d(String str, int i) {
        this.f10839a.mo2675d(str, i);
        this.f10841c.post(new C2139m(this, str, i));
    }

    public final synchronized void mo2671b(String str, String str2) {
        this.f10839a.mo2671b(str, str2);
        this.f10841c.post(new C2140n(this, str, str2));
    }

    public final synchronized void mo2674c(String str, String str2) {
        this.f10839a.mo2674c(str, str2);
        this.f10841c.post(new C2141o(this, str, str2));
    }

    public final synchronized void mo2670b(String str, long j) {
        this.f10839a.mo2670b(str, j);
        this.f10841c.post(new C2142p(this, str, j));
    }

    public final synchronized void mo2678e(String str, int i) {
        this.f10839a.mo2678e(str, i);
        this.f10841c.post(new C2144r(this, str, i));
    }

    public final synchronized void mo2681f(String str, int i) {
        this.f10839a.mo2681f(str, i);
        this.f10841c.post(new C2145s(this, str, i));
    }

    public final synchronized void mo2677d(String str, String str2) {
        this.f10839a.mo2677d(str, str2);
        this.f10841c.post(new C2146t(this, str, str2));
    }

    public final synchronized void mo2668a(String str, String[] strArr) {
        this.f10839a.mo2668a(str, strArr);
        this.f10841c.post(new C2147u(this, str, strArr));
    }

    public final synchronized void mo2680e(String str, String str2) {
        this.f10839a.mo2680e(str, str2);
        this.f10841c.post(new C2148v(this, str, str2));
    }

    public final synchronized void mo2667a(String str, byte[] bArr) {
        this.f10839a.mo2667a(str, bArr);
        this.f10841c.post(new C2149w(this, str, bArr));
    }

    public final synchronized void mo2673c(String str, long j) {
        this.f10839a.mo2673c(str, j);
        this.f10841c.post(new C2150x(this, str, j));
    }

    public final synchronized void mo2664a(String str, C2441n c2441n) {
        this.f10839a.mo2664a(str, c2441n);
        this.f10841c.post(new C2151y(this, str, c2441n));
    }

    public final synchronized void mo2676d(String str, long j) {
        this.f10839a.mo2676d(str, j);
        this.f10841c.post(new C2152z(this, str, j));
    }

    public final synchronized void mo2679e(String str, long j) {
        this.f10839a.mo2679e(str, j);
        this.f10841c.post(new ab(this, str, j));
    }
}
