package com.google.android.finsky.bn;

import com.google.android.finsky.cv.p177a.C2441n;
import com.google.wireless.android.finsky.b.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public final class C2128a implements C2127b {
    public final Map f10774a = new HashMap();

    public final synchronized C2129c mo2657a(String str) {
        return (C2129c) this.f10774a.get(str);
    }

    public final synchronized Collection mo2658a() {
        return new ArrayList(this.f10774a.values());
    }

    public final synchronized void mo2659a(C2129c c2129c) {
        this.f10774a.put(c2129c.f10807a, c2129c);
    }

    public final synchronized void mo2660a(C2131e c2131e) {
        String str = c2131e.f10835b;
        this.f10774a.put(str, c2131e.m11158a((C2129c) this.f10774a.get(str)));
    }

    public final synchronized void mo2661a(String str, int i) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11122a(i).f10833a);
    }

    public final synchronized void mo2665a(String str, a aVar, long j) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11126a(aVar, j).f10833a);
    }

    public final synchronized void mo2669b(String str, int i) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11130b(i).f10833a);
    }

    public final synchronized void mo2672c(String str, int i) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11137d(i).f10833a);
    }

    public final synchronized void mo2662a(String str, int i, String str2) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11140e(i).m11127a(str2).f10833a);
    }

    public final synchronized void mo2663a(String str, long j) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11123a(j).f10833a);
    }

    public final synchronized void mo2666a(String str, String str2) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11132b(str2).f10833a);
    }

    public final synchronized void mo2675d(String str, int i) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11143f(i).f10833a);
    }

    public final synchronized void mo2671b(String str, String str2) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11142e(str2).f10833a);
    }

    public final synchronized void mo2674c(String str, String str2) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11145f(str2).f10833a);
    }

    public final synchronized void mo2670b(String str, long j) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11131b(j).f10833a);
    }

    public final synchronized void mo2678e(String str, int i) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11146g(i).f10833a);
    }

    public final synchronized void mo2681f(String str, int i) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11148h(i).f10833a);
    }

    public final synchronized void mo2677d(String str, String str2) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11147g(str2).f10833a);
    }

    public final synchronized void mo2668a(String str, String[] strArr) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11129a(strArr).f10833a);
    }

    public final synchronized void mo2680e(String str, String str2) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11149h(str2).f10833a);
    }

    public final synchronized void mo2667a(String str, byte[] bArr) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11128a(bArr).f10833a);
    }

    public final synchronized void mo2673c(String str, long j) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11135c(j).f10833a);
    }

    public final synchronized void mo2664a(String str, C2441n c2441n) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11124a(c2441n).f10833a);
    }

    public final synchronized void mo2676d(String str, long j) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11138d(j).f10833a);
    }

    public final synchronized void mo2679e(String str, long j) {
        this.f10774a.put(str, C2130d.m11121a(mo2657a(str), str).m11141e(j).f10833a);
    }
}
