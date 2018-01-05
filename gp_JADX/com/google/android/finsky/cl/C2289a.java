package com.google.android.finsky.cl;

import android.text.TextUtils;
import com.android.volley.C0660x;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3361d;
import com.google.android.finsky.installqueue.C3363f;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.InstallConstraint;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.installqueue.TimeWindow;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ab;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.l.a.a;
import com.google.wireless.android.finsky.dfe.l.a.b;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p002a.C0002a;

public final class C2289a implements C0660x {
    public C0002a f11313a;

    public C2289a(C0002a c0002a) {
        this.f11313a = c0002a;
    }

    public static InstallRequest m11791a(InstallRequest installRequest, a aVar) {
        InstallConstraint e = new C3361d().m16793a(2).m16799e();
        long toMillis = TimeUnit.SECONDS.toMillis(aVar.e);
        long toMillis2 = TimeUnit.SECONDS.toMillis(aVar.f);
        C3361d a = new C3361d().m16793a(3);
        a.f17257b = new TimeWindow(toMillis, toMillis2);
        InstallConstraint e2 = a.m16799e();
        return new C3366j(installRequest).m16807a(1).m16813a(e, e2).m16810a("offpeak").m16806a();
    }

    public static a m11792a() {
        b bVar;
        String str = (String) C0954a.aV.m5760a();
        if (TextUtils.isEmpty(str)) {
            bVar = null;
        } else {
            C0757i bVar2 = new b();
            if (ab.m21686a(str, bVar2)) {
                C0757i c0757i = bVar2;
            } else {
                FinskyLog.m21669e("Could not de-serialize the cached DataPlanResponse.", new Object[0]);
                bVar = null;
            }
        }
        if (bVar == null) {
            FinskyLog.m21665c("Cannot get next flex time window. Cache is empty.", new Object[0]);
            return null;
        }
        long a = C4678i.m21812a();
        for (a aVar : bVar.a) {
            if (a < aVar.f) {
                int i;
                if (aVar.f - a >= TimeUnit.MINUTES.toSeconds((long) ((Integer) C0955b.id.m28964b()).intValue())) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (i != 0) {
                    return aVar;
                }
            }
        }
        return null;
    }

    public final /* synthetic */ void b_(Object obj) {
        a a = C2289a.m11792a();
        if (a != null) {
            C3363f a2 = new C3363f().m16801a("offpeak");
            a2.f17262b = Collections.singleton(Integer.valueOf(0));
            ((C3340g) this.f11313a.mo1a()).mo3479a(a2.m16800a()).mo4398a(new C2290b(this, a));
        }
    }
}
