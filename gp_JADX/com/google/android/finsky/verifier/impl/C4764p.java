package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.aq;
import com.google.android.finsky.dy.as;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import java.util.Arrays;

final /* synthetic */ class C4764p implements aq {
    public final String f24694a;
    public final byte[] f24695b;
    public final String[] f24696c;

    C4764p(String str, byte[] bArr, String[] strArr) {
        this.f24694a = str;
        this.f24695b = bArr;
        this.f24696c = strArr;
    }

    public final Object mo4346a(as asVar) {
        Object obj = this.f24694a;
        byte[] bArr = this.f24695b;
        String[] strArr = this.f24696c;
        obj = (C4722z) ag.m15236a(asVar.mo3202d().mo1521a(obj));
        if (obj != null && Arrays.equals(obj.f24294d, bArr)) {
            obj.f24297g = strArr;
            ag.m15236a(asVar.mo3202d().mo1524b(obj));
        }
        return null;
    }
}
