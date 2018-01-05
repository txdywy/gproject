package com.google.android.finsky.bx;

import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C2194a;
import java.util.HashSet;
import java.util.Set;

public enum C2195a implements C2194a {
    ;
    
    public final Set f10986b;

    private C2195a(String str) {
        this.f10986b = new HashSet();
    }

    public final void mo2779a(long j, String str) {
        for (C1459b a : this.f10986b) {
            a.mo2014a(j, str);
        }
    }

    public final void mo2778a(long j) {
        for (C1459b a : this.f10986b) {
            a.mo2013a(j);
        }
    }
}
