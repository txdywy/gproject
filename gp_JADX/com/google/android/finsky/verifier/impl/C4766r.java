package com.google.android.finsky.verifier.impl;

import android.content.pm.PackageInfo;
import com.google.android.finsky.dy.C2917a;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.ap;
import com.google.android.finsky.utils.C4691w;
import com.google.android.finsky.verifier.p259a.p260a.C4697a;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import java.util.ArrayList;
import java.util.Arrays;

final class C4766r extends ap {
    public final /* synthetic */ PackageInfo f24698a;
    public final /* synthetic */ byte[] f24699b;
    public final /* synthetic */ String f24700c;
    public final /* synthetic */ String f24701d;
    public final /* synthetic */ C4756h f24702e;

    C4766r(C4756h c4756h, ag agVar, PackageInfo packageInfo, byte[] bArr, String str, String str2) {
        this.f24702e = c4756h;
        this.f24698a = packageInfo;
        this.f24699b = bArr;
        this.f24700c = str;
        this.f24701d = str2;
        super(agVar);
    }

    public final /* synthetic */ Object call() {
        C4722z c4722z = (C4722z) ag.m15236a(this.f15542f.f15534k.mo3202d().mo1521a(this.f24698a.packageName));
        C4697a c4697a = (C4697a) ag.m15236a(this.f15542f.f15534k.mo3200b().mo1521a(C4691w.m21842a(this.f24699b)));
        Iterable arrayList = new ArrayList();
        if (c4697a == null) {
            C2917a a = new C2917a().m15207a(this.f24699b).m15206a(this.f24698a.packageName).m15205a(this.f24698a.versionCode);
            if (!(this.f24700c == null || this.f24701d == null)) {
                a.m15208b(this.f24700c);
                a.m15209c(this.f24701d);
            }
            arrayList.add(this.f15542f.f15534k.mo3200b().mo1524b(a.f15486a));
        }
        if (c4722z == null || c4722z.f24293c != this.f24698a.lastUpdateTime) {
            Object c4722z2 = new C4722z();
            c4722z2.m21969a(this.f24699b);
            c4722z2.m21967a(this.f24698a.packageName);
            c4722z2.m21966a(this.f24698a.lastUpdateTime);
            if (c4722z != null && Arrays.equals(this.f24699b, c4722z.f24294d)) {
                c4722z2.m21968a(c4722z.f24295e);
            }
            arrayList.add(this.f15542f.f15534k.mo3202d().mo1524b(c4722z2));
        }
        return this.f24702e.f24680c.mo4400a(arrayList);
    }
}
