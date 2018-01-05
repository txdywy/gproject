package com.google.android.finsky.search;

import com.android.volley.C0660x;
import com.google.android.finsky.cv.p177a.eu;
import com.google.android.finsky.cv.p177a.jd;
import com.google.android.finsky.cv.p177a.je;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.a.a.a.a.cn;

final class C4060f implements C0660x {
    public final /* synthetic */ C4063k f20399a;
    public final /* synthetic */ C4059e f20400b;

    C4060f(C4059e c4059e, C4063k c4063k) {
        this.f20400b = c4059e;
        this.f20399a = c4063k;
    }

    public final /* synthetic */ void b_(Object obj) {
        jd jdVar = (jd) obj;
        C4058d c4058d = this.f20400b.f20395g;
        String str = this.f20400b.k;
        int length = jdVar.f12759b.length;
        byte[] bArr = jdVar.f12760c;
        long j = this.f20400b.m;
        C2495w c2495w = this.f20400b.f20398j;
        j = System.currentTimeMillis() - j;
        cn i = C2482j.m13314i();
        C4058d.m18981a(str, 3, length, bArr, j, i);
        c4058d.f20388a.d();
        C4058d.m18980a(i, c4058d.f20388a);
        c2495w.m13367a(new C2474c(510).m13227a(i));
        for (je jeVar : jdVar.f12759b) {
            String str2;
            int i2;
            boolean z;
            C4065l c4065l = this.f20400b.f20391c;
            eu euVar = null;
            if (jeVar.f12768h != null) {
                str2 = jeVar.f12768h.f12096c;
            } else {
                str2 = null;
            }
            if (jeVar.f12763c == 3 || jeVar.f12763c == 4) {
                euVar = jeVar.f12766f;
            }
            if (((jeVar.f12762b & 8) != 0 ? 1 : null) != null) {
                i2 = jeVar.f12769i;
            } else {
                i2 = c4065l.f20410e;
            }
            if (((jeVar.f12762b & 32) != 0 ? 1 : null) != null) {
                z = jeVar.f12772l;
            } else {
                z = false;
            }
            c4065l.m18988a(jeVar.f12764d, z, str2, null, jeVar.f12765e, euVar, jeVar.f12767g, false, i2, jeVar.f12773m);
        }
        this.f20399a.mo3898a();
    }
}
