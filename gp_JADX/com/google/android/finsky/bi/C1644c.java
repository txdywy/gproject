package com.google.android.finsky.bi;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C1643x;
import com.google.android.gms.common.api.C4980w;
import com.google.android.gms.common.data.C4975a;
import com.google.android.gms.p277c.C4981b;
import com.google.android.gms.p277c.p278a.C4972a;
import com.google.android.gms.p277c.p278a.C4978c;
import com.google.wireless.android.a.a.a.a.ah;
import com.google.wireless.android.a.a.a.a.ai;
import java.util.ArrayList;
import java.util.List;

final class C1644c implements C1643x {
    public final /* synthetic */ C1642b f8573a;

    C1644c(C1642b c1642b) {
        this.f8573a = c1642b;
    }

    public final /* synthetic */ void mo2367a(C4980w c4980w) {
        C4981b c4981b = (C4981b) c4980w;
        if (c4981b.mo4505b().m23271a()) {
            if (this.f8573a.f8571d && this.f8573a.f8570c != null) {
                this.f8573a.f8570c.m9341a();
            }
            C4975a c = c4981b.mo4506c();
            try {
                C1642b c1642b = this.f8573a;
                if (!(c.mo4501c() == 0 || c1642b.f8572e == null)) {
                    ah ahVar;
                    List arrayList = new ArrayList();
                    long longValue = ((Long) C0954a.f5841k.m5760a()).longValue();
                    for (int i = 0; i < c.mo4501c(); i++) {
                        C4972a c4978c = new C4978c(c.a, i);
                        long b = c4978c.mo4504b();
                        if (b >= longValue) {
                            ai aiVar = new ai();
                            String a = c4978c.mo4503a();
                            if (a == null) {
                                throw new NullPointerException();
                            }
                            aiVar.b |= 1;
                            aiVar.c = a;
                            aiVar.b |= 2;
                            aiVar.d = b;
                            arrayList.add(aiVar);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ahVar = null;
                    } else {
                        ahVar = new ah();
                        ahVar.a = new ai[arrayList.size()];
                        arrayList.toArray(ahVar.a);
                    }
                    if (ahVar == null) {
                        C0954a.f5841k.m5763a(Long.valueOf(System.currentTimeMillis()));
                    } else {
                        FinskyLog.m21659a("Logging %d device features.", Integer.valueOf(ahVar.a.length));
                        C2474c c2474c = new C2474c(4);
                        c2474c.f13342a.f31726z = ahVar;
                        C1473m.f7980a.mo2049a(c1642b.f8572e).m13319a(c2474c.f13342a, null);
                        C0954a.f5841k.m5763a(Long.valueOf(System.currentTimeMillis()));
                        c1642b.f8569b.mo4559g();
                    }
                }
                c.mo4500a();
            } catch (Throwable th) {
                c.mo4500a();
            }
        }
    }
}
