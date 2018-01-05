package com.google.android.finsky.dv;

import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.bn.C2131e;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ad;

public final class C2904f {
    public final C2127b f15442a;

    public C2904f(C2127b c2127b) {
        this.f15442a = c2127b;
    }

    public final void m15159a(Document document, String str, C2320a c2320a, C1461c c1461c) {
        int i;
        Object obj;
        long j;
        long j2 = 0;
        String cf = document.cf();
        String cf2 = document.cf();
        int i2 = document.m14625N().f13178r ? 1 : 0;
        C2129c a = this.f15442a.mo2657a(cf2);
        if (a == null) {
            i = 0;
        } else {
            i = a.f10824r;
        }
        if (!(i2 == (i & 1) || (a == null && i2 == 0))) {
            this.f15442a.mo2678e(cf2, i2 | (i & -2));
        }
        C2129c a2 = this.f15442a.mo2657a(cf);
        if (a2 == null) {
            obj = null;
        } else {
            obj = a2.f10822p;
        }
        if (!ad.m21692a(obj, str)) {
            FinskyLog.m21659a("Capture account %s for next update of %s", FinskyLog.m21655a(str), cf);
            this.f15442a.mo2674c(cf, str);
        }
        C2441n c2441n = new C2441n();
        c2441n.f13174n = document.m14625N().f13174n;
        c2441n.f13153B = document.m14671z();
        this.f15442a.mo2664a(document.m14625N().f13171k, c2441n);
        String str2 = document.m14625N().f13171k;
        C2322b a3 = c2320a.mo2854a(str2);
        C2129c a4 = this.f15442a.mo2657a(str2);
        if (a4 == null) {
            j = 0;
        } else {
            j = a4.f10797D;
        }
        if (!new C3654j(c1461c).m17264a(document.m14625N()).m17262a(a3).m17269e()) {
            j2 = j == 0 ? System.currentTimeMillis() : j;
        }
        if (j2 != j) {
            FinskyLog.m21659a("Package %s staleness changed from %d to %d", str2, Long.valueOf(j), Long.valueOf(j2));
            this.f15442a.mo2660a(new C2131e(str2).m11160a(j2));
        }
    }
}
