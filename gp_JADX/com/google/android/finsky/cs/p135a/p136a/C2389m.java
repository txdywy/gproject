package com.google.android.finsky.cs.p135a.p136a;

import android.content.Context;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.cs.C2409f;
import com.google.android.finsky.cs.p135a.C2372d;
import com.google.android.finsky.cs.p135a.C2374e;
import com.google.android.finsky.cs.p135a.C2384l;
import com.google.android.finsky.cs.p135a.C2398f;
import com.google.android.finsky.cs.p135a.C2401i;
import com.google.android.finsky.cs.p135a.C2404o;
import com.google.android.finsky.p140i.C3216c;
import com.google.android.finsky.utils.ad;
import com.google.android.gms.phenotype.core.p304a.C5505c;
import com.google.android.play.p179a.p352a.C6201l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class C2389m extends C2371a {
    public final C2398f f11675i;
    public final C3216c f11676j;
    public final C2404o f11677k;

    public C2389m(C2390p c2390p, C5505c c5505c, Context context, String str, String[] strArr, int i, String str2, byte[] bArr, C2398f c2398f, C3216c c3216c, C2404o c2404o) {
        super(c2390p, c5505c, context, str, strArr, i, str2, bArr);
        this.f11675i = c2398f;
        this.f11676j = c3216c;
        this.f11677k = c2404o;
    }

    protected final String mo2896a(String str) {
        C2409f a = this.f11675i.m12089a();
        if (a == null) {
            return null;
        }
        return a.f11710d;
    }

    protected final boolean mo2897a(C2374e c2374e, C6201l c6201l, String str) {
        boolean z;
        if (C2401i.m12095a(c2374e, c6201l, this.f11675i.f11692a.f11701a.getFilesDir(), "experiment-flags-process-stable") == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Map emptyMap;
            boolean z2;
            C0954a.aA.m5763a(Boolean.valueOf(true));
            C0957n c0957n = C0954a.aB;
            C2404o c2404o = this.f11677k;
            C2409f a = this.f11675i.m12089a();
            if (a == null) {
                emptyMap = Collections.emptyMap();
            } else {
                emptyMap = a.f11707a;
            }
            Map hashMap = new HashMap();
            for (C2372d a2 : c2374e.mo2874c()) {
                for (C2384l c2384l : a2.mo2871a()) {
                    Object valueOf;
                    String a3 = c2384l.mo2889a();
                    switch (c2384l.mo2895g()) {
                        case 2:
                            valueOf = Long.valueOf(c2384l.mo2890b());
                            break;
                        case 3:
                            valueOf = Boolean.valueOf(c2384l.mo2891c());
                            break;
                        case 4:
                            valueOf = Double.valueOf(c2384l.mo2892d());
                            break;
                        case 5:
                            valueOf = c2384l.mo2893e();
                            break;
                        case 6:
                            valueOf = c2384l.mo2894f();
                            break;
                        default:
                            valueOf = null;
                            break;
                    }
                    hashMap.put(a3, valueOf);
                }
            }
            for (String str2 : c2404o.f11703a) {
                if (!ad.m21692a(hashMap.get(str2), emptyMap.get(str2))) {
                    z2 = true;
                    c0957n.m5763a(Boolean.valueOf(z2));
                    this.f11676j.m16265a();
                }
            }
            z2 = false;
            c0957n.m5763a(Boolean.valueOf(z2));
            this.f11676j.m16265a();
        }
        return z;
    }
}
