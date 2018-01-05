package com.google.android.finsky.verifier.impl;

import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.aq;
import com.google.android.finsky.dy.as;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import java.util.Arrays;

final /* synthetic */ class C4762n implements aq {
    public final String f24690a;
    public final byte[] f24691b;
    public final boolean f24692c;

    C4762n(String str, byte[] bArr, boolean z) {
        this.f24690a = str;
        this.f24691b = bArr;
        this.f24692c = z;
    }

    public final Object mo4346a(as asVar) {
        Object obj = this.f24690a;
        byte[] bArr = this.f24691b;
        boolean z = this.f24692c;
        obj = (C4722z) ag.m15236a(asVar.mo3202d().mo1521a(obj));
        if (obj != null && Arrays.equals(obj.f24294d, bArr)) {
            obj.m21973b(z);
            ag.m15236a(asVar.mo3202d().mo1524b(obj));
        }
        return null;
    }
}
