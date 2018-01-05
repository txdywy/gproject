package com.google.android.finsky.wear;

import android.content.Context;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cv.p177a.C2441n;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dv.C2899a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Arrays;
import java.util.List;

public final class cd {
    public static final String[] f24928a = new String[]{"com.google.android.gms"};
    public final C2471a f24929b = C1473m.f7980a.aR();
    public final Runnable f24930c;
    public final Context f24931d;
    public final String f24932e;
    public final C2206c f24933f;
    public final C3646a f24934g;
    public final C1287h f24935h;
    public final C4790k f24936i;
    public final int f24937j;
    public final String f24938k;
    public C2899a f24939l;
    public ak f24940m;

    public cd(Context context, String str, C2206c c2206c, C3646a c3646a, C1287h c1287h, C4790k c4790k, int i, String str2, ak akVar, Runnable runnable) {
        this.f24931d = context;
        this.f24932e = str;
        this.f24933f = c2206c;
        this.f24934g = c3646a;
        this.f24935h = c1287h;
        this.f24936i = c4790k;
        this.f24937j = i;
        this.f24938k = str2;
        this.f24940m = akVar;
        this.f24930c = runnable;
    }

    static void m22508a(cj cjVar, boolean z) {
        if (cjVar != null) {
            cjVar.mo4393a(z);
        }
    }

    protected final boolean m22509a(List list, String[] strArr, C2127b c2127b) {
        boolean z = false;
        FinskyLog.m21659a("*** BulkDetails node %s returned %d documents", this.f24932e, Integer.valueOf(list.size()));
        String[] a = C4680k.m21818a((String) C0955b.ey.m28964b());
        for (Document document : list) {
            boolean z2;
            boolean z3;
            C2441n N = document.m14625N();
            if (!((Boolean) C0955b.ew.m28964b()).booleanValue() || Arrays.equals(f24928a, strArr)) {
                z2 = !ck.m22514a(N.f13171k, strArr);
            } else {
                String str = N.f13171k;
                z2 = (!ck.m22514a(str, a) ? 1 : 0) | ck.m22513a(str);
            }
            if (((Boolean) C0955b.ew.m28964b()).booleanValue() && !r2) {
                C2129c a2 = c2127b.mo2657a(N.f13171k);
                if (a2 != null && a2.f10808b == 2) {
                    FinskyLog.m21659a("Skipping update %s on node %s, auto update disabled", N.f13171k, this.f24932e);
                    z2 = true;
                }
            }
            FinskyLog.m21659a("***  pkg=%s v=%d blocked=%b", N.f13171k, Integer.valueOf(N.f13163c), Boolean.valueOf(z2));
            if (z2) {
                z3 = z;
            } else {
                this.f24936i.m22550a(this.f24932e, N.f13171k, N.f13163c, null, document.f14885a.f12100g, this.f24940m.m22450a(this.f24932e));
                z3 = true;
            }
            z = z3;
        }
        return z;
    }
}
