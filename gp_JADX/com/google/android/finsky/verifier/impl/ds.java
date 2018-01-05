package com.google.android.finsky.verifier.impl;

import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0700r;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.verifier.impl.p262a.C4731c;
import com.google.android.finsky.verifier.impl.p262a.C4733e;
import com.google.android.finsky.verifier.p259a.p260a.C4698b;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.google.android.finsky.verifier.p259a.p260a.C4715s;
import java.util.Collection;
import java.util.List;

final class ds implements Runnable {
    public final /* synthetic */ List f24632a;
    public final /* synthetic */ boolean f24633b;
    public final /* synthetic */ C4698b f24634c;
    public final /* synthetic */ C0660x f24635d;
    public final /* synthetic */ C0657w f24636e;
    public final /* synthetic */ dk f24637f;

    ds(dk dkVar, List list, boolean z, C4698b c4698b, C0660x c0660x, C0657w c0657w) {
        this.f24637f = dkVar;
        this.f24632a = list;
        this.f24633b = z;
        this.f24634c = c4698b;
        this.f24635d = c0660x;
        this.f24636e = c0657w;
    }

    public final void run() {
        C2495w c2495w = null;
        C4731c a = C4731c.m22039a();
        C0700r c0700r = (C0700r) this.f24637f.f24598b.mo1a();
        Collection collection = this.f24632a;
        boolean z = this.f24633b;
        boolean z2 = this.f24637f.f24610p;
        boolean z3 = this.f24637f.f24612r;
        boolean z4 = this.f24637f.f24613s;
        C4698b c4698b = this.f24634c;
        C0660x c0660x = this.f24635d;
        C0657w c0657w = this.f24636e;
        C4715s c4715s = new C4715s();
        if (z2) {
            c4715s.f24251a |= 8;
            c4715s.f24256f = true;
        }
        if (z3) {
            c4715s.f24251a |= 16;
            c4715s.f24257g = true;
        }
        if (z4) {
            c4715s.f24251a |= 32;
            c4715s.f24259i = true;
        }
        if (c4698b != null) {
            c4715s.f24258h = c4698b;
        }
        c4715s.f24252b = (C4699c[]) collection.toArray(new C4699c[collection.size()]);
        c4715s.f24251a |= 1;
        c4715s.f24253c = z;
        long longValue = ((Long) C0954a.f5814J.m5760a()).longValue();
        if (longValue > 0) {
            longValue = System.currentTimeMillis() - longValue;
            c4715s.f24251a |= 2;
            c4715s.f24254d = longValue;
        }
        longValue = ((Long) C0955b.bM.m28964b()).longValue();
        c4715s.f24251a |= 4;
        c4715s.f24255e = longValue;
        if (((Boolean) C0955b.cC.m28964b()).booleanValue()) {
            c2495w = a.f24362c.m13178a(null);
        }
        c0700r.m4510a(new C4733e(a.f24361b, c2495w, "https://safebrowsing.google.com/safebrowsing/clientreport/download-multi", c0660x, c0657w, c4715s));
    }
}
