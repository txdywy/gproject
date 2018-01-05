package com.google.android.finsky.appdiscoveryservice.p128b;

import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.a.a.a.a.ax;
import com.google.wireless.android.a.a.a.a.cn;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;

public final class C1314e {
    public C2495w f7801a;

    public C1314e(C2495w c2495w) {
        this.f7801a = c2495w;
    }

    public final void m7791a(int i, int i2, String str, int i3, String str2, boolean z, int i4, boolean z2) {
        ax axVar = new ax();
        axVar.a |= 1;
        axVar.b = i;
        axVar.a |= 2;
        axVar.c = i2;
        if (str == null) {
            throw new NullPointerException();
        }
        axVar.a |= 4;
        axVar.d = str;
        axVar.a |= 8;
        axVar.e = i3;
        if (str2 == null) {
            throw new NullPointerException();
        }
        axVar.a |= 16;
        axVar.f = str2;
        axVar.a |= 32;
        axVar.g = z;
        axVar.a |= 64;
        axVar.h = i4;
        axVar.a |= 128;
        axVar.i = z2;
        bo boVar = new C2474c(2300).f13342a;
        boVar.ah = axVar;
        this.f7801a.m13371a(boVar, null);
    }

    public final void m7792a(String str, long j, int i) {
        this.f7801a.m13371a(new C2474c(2301).m13227a(new cn().a(5).a(str).a(j).b(i)).f13342a, null);
    }
}
