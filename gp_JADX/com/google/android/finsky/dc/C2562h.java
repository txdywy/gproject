package com.google.android.finsky.dc;

import android.os.Environment;
import com.android.volley.C0660x;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.download.C2106x;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.download.C2841d;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.b.a;
import com.google.wireless.android.finsky.dfe.nano.bs;

final class C2562h implements C0660x {
    public final /* synthetic */ C1552e f13673a;
    public final /* synthetic */ C2561g f13674b;

    C2562h(C2561g c2561g, C1552e c1552e) {
        this.f13674b = c2561g;
        this.f13673a = c1552e;
    }

    public final /* synthetic */ void b_(Object obj) {
        bs bsVar = (bs) obj;
        int i = bsVar.b;
        if (i != 1) {
            this.f13674b.f13662e = false;
            FinskyLog.m21665c("SelfUpdate non-OK response - %d", Integer.valueOf(i));
            C3322j c3322j = this.f13674b.f13659b;
            this.f13674b.f13668l.m13367a(this.f13674b.m13558b(104).m13210a(C3322j.m16691a(i)));
        } else if (bsVar.c == null) {
            this.f13674b.f13662e = false;
            FinskyLog.m21665c("SelfUpdate response missing appDeliveryData", new Object[0]);
            this.f13674b.f13668l.m13367a(this.f13674b.m13558b(104).m13244b("missing-delivery-data"));
        } else {
            long j;
            String str;
            boolean z;
            a aVar = bsVar.c;
            if (aVar.d()) {
                j = aVar.b;
            } else {
                j = -1;
            }
            if (aVar.e()) {
                str = aVar.d;
            } else {
                str = null;
            }
            C2106x c2106x = this.f13674b;
            String str2 = aVar.f;
            C1552e c1552e = this.f13673a;
            if (j <= 0) {
                z = true;
            } else if (c1552e.mo2294a(12604524)) {
                z = c2106x.f13659b.m16694a(j, Environment.getDataDirectory());
            } else {
                z = true;
            }
            if (z) {
                c2106x.f13664g = j;
                c2106x.f13665h = str;
                C2839b a = C2841d.m15020a(c2106x.f13670n, str2, true);
                c2106x.f13666i = a;
                c2106x.f13658a.mo3176a(c2106x);
                c2106x.f13658a.mo3173a(a);
                c2106x.f13668l.m13367a(c2106x.m13558b(100));
                return;
            }
            c2106x.f13662e = false;
            c2106x.f13668l.m13367a(c2106x.m13558b(112).m13210a(908));
            FinskyLog.m21659a("Self-update ignore download due to lack of free space", new Object[0]);
        }
    }
}
