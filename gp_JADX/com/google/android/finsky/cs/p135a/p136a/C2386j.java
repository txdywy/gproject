package com.google.android.finsky.cs.p135a.p136a;

import android.content.Context;
import com.google.android.finsky.cs.C2409f;
import com.google.android.finsky.cs.p135a.C2374e;
import com.google.android.finsky.cs.p135a.C2398f;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.android.play.p179a.p352a.C6201l;

public final class C2386j extends C2371a {
    public final C2398f f11665i;

    public C2386j(C2390p c2390p, C5505c c5505c, Context context, String str, String[] strArr, int i, String str2, byte[] bArr, C2398f c2398f) {
        super(c2390p, c5505c, context, str, strArr, i, str2, bArr);
        this.f11665i = c2398f;
    }

    protected final String mo2896a(String str) {
        C2409f b = this.f11665i.m12092b(str);
        if (b == null) {
            return null;
        }
        return b.f11710d;
    }

    protected final boolean mo2897a(C2374e c2374e, C6201l c6201l, String str) {
        return this.f11665i.m12091a(c2374e, c6201l, str);
    }
}
