package com.google.android.finsky.hygiene.p139a;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ac.C0972a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.da.C2498a;
import com.google.android.finsky.deviceconfig.C2691a;
import com.google.android.finsky.deviceconfig.C2708u;
import com.google.android.finsky.df.C2710a;
import com.google.android.finsky.eb.C2967b;
import com.google.android.finsky.heterodyne.C3172f;
import com.google.android.finsky.hygiene.C3175r;
import com.google.android.finsky.hygiene.DailyHygiene.DailyHygieneService;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p138h.C3156a;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.p238b.C4023a;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.scheduler.p238b.C4025c;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.di;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class C3186k implements C3175r {
    public final C2471a f16474a;
    public final C1461c f16475b;
    public final C3185j f16476c;
    public final C3179d f16477d;
    public final ba f16478e;
    public int f16479f;
    public C4023a f16480g;

    public C3186k(C3179d c3179d, C1461c c1461c, bb bbVar, C3185j c3185j, C2471a c2471a) {
        this.f16477d = c3179d;
        this.f16475b = c1461c;
        this.f16478e = bbVar.m18890a(10);
        this.f16476c = c3185j;
        this.f16474a = c2471a;
    }

    public final void mo3361a(C1254c c1254c, boolean z, C1552e c1552e, C2495w c2495w, boolean z2) {
        if (!z2) {
            int i;
            String str;
            boolean z3;
            int i2;
            C3179d c3179d;
            int i3;
            C3176a c3176a;
            Intent intent;
            boolean z4;
            Object obj;
            C2495w a;
            FinskyLog.m21662b("Routine Hygiene: dispatch hygiene tasks", new Object[0]);
            if (c1254c == null) {
                i = 3;
                str = null;
                z3 = false;
            } else if (TextUtils.isEmpty(c1254c.mo1636c())) {
                i = 2;
                str = null;
                z3 = true;
            } else {
                i = 1;
                str = c1254c.mo1636c();
                z3 = true;
            }
            long a2 = C4678i.m21812a();
            long abs = Math.abs(a2 - ((Long) C0954a.f5847q.m5760a()).longValue());
            long abs2 = Math.abs(a2 - ((Long) C0954a.f5848r.m5760a()).longValue());
            if (this.f16479f == 1 || this.f16479f == 2 || this.f16479f == 8 || this.f16479f == 9 || this.f16479f == 10) {
                C0954a.f5848r.m5763a(Long.valueOf(a2));
                C0954a.f5847q.m5763a(Long.valueOf(a2));
                i2 = 1;
            } else if (abs2 > ((Long) C0955b.aG.m28964b()).longValue() * 7) {
                C0954a.f5848r.m5763a(Long.valueOf(a2));
                C0954a.f5847q.m5763a(Long.valueOf(a2));
                i2 = 2;
            } else if (abs > ((Long) C0955b.aG.m28964b()).longValue()) {
                C0954a.f5847q.m5763a(Long.valueOf(a2));
                i2 = 3;
            } else {
                FinskyLog.m21669e("No hygiene task time conditions met, reason: %d, timeSinceLastDailyMs: %d", Integer.valueOf(this.f16479f), Long.valueOf(abs));
                c3179d = this.f16477d;
                i3 = this.f16479f;
                c3176a = c3179d.f16456b;
                intent = new Intent(c3176a.f16454i, DailyHygieneService.class);
                intent.putExtra("reason", i3);
                c2495w.m13376a(intent);
                z4 = c1254c == null;
                intent.putExtra("probed-uses-dfe-api", z4);
                if (z4) {
                    intent.putExtra("probed-account-name", c1254c.mo1636c());
                }
                intent.putExtra("probed-core-success", z);
                c3176a.f16454i.startService(intent);
            }
            C3185j c3185j = this.f16476c;
            List arrayList = new ArrayList();
            arrayList.add(new C3184i(1, C2710a.class, 3, 2));
            arrayList.add(new C3184i(2, C2708u.class, 1, 1));
            arrayList.add(new C3184i(4, C3156a.class, 3, 3));
            if (((Boolean) C0955b.is.m28964b()).booleanValue()) {
                arrayList.add(new C3184i(5, C3172f.class, 3, 2));
            }
            arrayList.add(new C3184i(6, C2691a.class, 3, 2));
            arrayList.add(new C3184i(7, C0972a.class, 3, 2));
            if (c3185j.f16472b.m8841d() && c3185j.f16471a.f8183g) {
                arrayList.addAll(Collections.emptyList());
            } else if (c3185j.f16472b.m8841d()) {
                r2 = new ArrayList();
                r2.add(new C3184i(8, di.class, 3, 3));
                arrayList.addAll(r2);
            } else if (c3185j.f16471a.f8183g) {
                arrayList.addAll(Collections.emptyList());
            } else if (c3185j.f16471a.f8181e) {
                arrayList.addAll(Collections.emptyList());
            } else if (c3185j.f16471a.f8184h) {
                r2 = new ArrayList();
                r2.add(new C3184i(8, di.class, 3, 3));
                arrayList.addAll(r2);
            } else if (c3185j.f16471a.f8182f) {
                r2 = new ArrayList();
                r2.add(new C3184i(8, di.class, 3, 3));
                arrayList.addAll(r2);
            } else {
                r2 = new ArrayList();
                r2.add(new C3184i(3, C2498a.class, 3, 2));
                r2.add(new C3184i(8, di.class, 3, 3));
                if (c3185j.f16473c.dj().mo2294a(12644633)) {
                    r2.add(new C3184i(9, C2967b.class, 3, 2));
                }
                arrayList.addAll(r2);
            }
            List arrayList2 = new ArrayList();
            ArrayList arrayList3 = (ArrayList) arrayList;
            int size = arrayList3.size();
            int i4 = 0;
            while (i4 < size) {
                obj = arrayList3.get(i4);
                i4++;
                C3184i c3184i = (C3184i) obj;
                if (c3184i.f16469c >= i2 && c3184i.f16470d >= r5) {
                    arrayList2.add(c3184i);
                }
            }
            arrayList3 = (ArrayList) arrayList2;
            i2 = arrayList3.size();
            i = 0;
            while (i < i2) {
                obj = arrayList3.get(i);
                i++;
                this.f16478e.m18887a(((C3184i) obj).f16467a).mo4398a(C3187l.f16481a);
            }
            C4023a a3 = new C4024b().m18839a(this.f16480g.f20246a.f20154b).m18843b(this.f16480g.f20246a.f20155c).m18838a(this.f16480g.f20246a.f20156d).m18840a(this.f16480g.f20246a.f20157e).m18844b(this.f16480g.f20246a.f20158f).m18837a();
            C4025c c4025c = new C4025c();
            c4025c.m18850a("use_dfe_api", z3);
            if (!TextUtils.isEmpty(str)) {
                c4025c.m18849a("account_name", str);
            }
            if (TextUtils.isEmpty(str)) {
                a = this.f16474a.m13184a(null);
            } else {
                a = this.f16474a.m13184a(null).m13380b(str);
            }
            c4025c.m18848a("logging_context", a);
            ArrayList arrayList4 = (ArrayList) arrayList2;
            size = arrayList4.size();
            i3 = 0;
            while (i3 < size) {
                int i5 = i3 + 1;
                C3184i c3184i2 = (C3184i) arrayList4.get(i3);
                this.f16478e.m18888a(c3184i2.f16467a, "", c3184i2.f16468b, a3, c4025c).mo4398a(C3188m.f16482a);
                i3 = i5;
            }
            c3179d = this.f16477d;
            i3 = this.f16479f;
            c3176a = c3179d.f16456b;
            intent = new Intent(c3176a.f16454i, DailyHygieneService.class);
            intent.putExtra("reason", i3);
            c2495w.m13376a(intent);
            if (c1254c == null) {
            }
            intent.putExtra("probed-uses-dfe-api", z4);
            if (z4) {
                intent.putExtra("probed-account-name", c1254c.mo1636c());
            }
            intent.putExtra("probed-core-success", z);
            c3176a.f16454i.startService(intent);
        }
        this.f16477d.mo3363a(this.f16479f, z, false, c2495w);
    }
}
