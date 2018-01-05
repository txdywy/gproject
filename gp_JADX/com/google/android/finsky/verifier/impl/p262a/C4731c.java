package com.google.android.finsky.verifier.impl.p262a;

import android.content.Context;
import com.android.volley.C0700r;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.verifier.impl.ac;
import com.google.android.finsky.verifier.impl.bf;
import com.google.android.finsky.verifier.p259a.p260a.C4714r;
import com.google.android.finsky.verifier.p259a.p260a.ae;

public final class C4731c {
    public static C4731c f24360a;
    public Context f24361b;
    public C2471a f24362c;

    private C4731c() {
        ((ac) C3947d.m18649a(ac.class)).mo1979a(this);
    }

    public static synchronized C4731c m22039a() {
        C4731c c4731c;
        synchronized (C4731c.class) {
            if (f24360a == null) {
                f24360a = new C4731c();
            }
            c4731c = f24360a;
        }
        return c4731c;
    }

    public final void m22040a(C0700r c0700r, String str, int i, boolean z, boolean z2, boolean z3, byte[] bArr) {
        C4714r c4714r = new C4714r();
        if (bArr != null) {
            if (bArr == null) {
                throw new NullPointerException();
            }
            c4714r.f24245a |= 2;
            c4714r.f24247c = bArr;
        }
        c4714r.f24246b = i;
        c4714r.f24245a |= 1;
        if (z) {
            c4714r.f24245a |= 4;
            c4714r.f24248d = true;
        }
        if (z2) {
            c4714r.f24245a |= 8;
            c4714r.f24249e = true;
        }
        if (z3) {
            c4714r.f24245a |= 16;
            c4714r.f24250f = true;
        }
        if (((Boolean) C0955b.ch.m28964b()).booleanValue()) {
            Context context = this.f24361b;
            ae aeVar = new ae();
            aeVar.f24123a = c4714r;
            bf.m22118a(context, aeVar, false);
        }
        if (((Boolean) C0955b.cj.m28964b()).booleanValue()) {
            c0700r.m4510a(new C4736h(this.f24361b, "https://safebrowsing.google.com/safebrowsing/clientreport/download-stat", new C4732d(str), c4714r));
        }
    }
}
