package com.google.android.finsky.wear;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.bi.C1641a;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;
import java.util.List;

final class cf implements C1031w {
    public final /* synthetic */ ce f24946a;

    cf(ce ceVar) {
        this.f24946a = ceVar;
    }

    public final void m_() {
        if (this.f24946a.f24945e.f24933f.mo2817b() != this.f24946a.f24942b) {
            FinskyLog.m21665c("Skip update check for node %s - account hash changed.", this.f24946a.f24945e.f24932e);
            cd.m22508a(this.f24946a.f24943c, false);
            return;
        }
        boolean z;
        List list = this.f24946a.f24945e.f24939l.f15421r;
        cd cdVar = this.f24946a.f24945e;
        String[] strArr = this.f24946a.f24944d;
        if (((Boolean) C0955b.et.m28964b()).booleanValue()) {
            if (cdVar.f24936i.m22544a(cdVar.f24932e, "com.google.android.gms") == 0) {
                FinskyLog.m21659a("Current installed GMS core version %d", Integer.valueOf(cdVar.f24934g.f18023c.mo2859g("com.google.android.gms")));
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    Document document = (Document) list.get(i);
                    if (C1641a.m9335a(document.m14625N()) && document.m14625N().f13163c > r3) {
                        cdVar.m22509a(list, cd.f24928a, C1473m.f7980a.mo2029I().f18022b);
                        z = true;
                        break;
                    }
                }
            } else {
                FinskyLog.m21659a("GMS core update is pending", new Object[0]);
                z = true;
            }
            if (!(z || cdVar.f24936i.m22544a(cdVar.f24932e, "com.android.vending") == 0)) {
                z = true;
            }
            if (!z && cdVar.f24937j > 0) {
                if (cdVar.f24937j <= cdVar.f24934g.f18023c.mo2859g("com.android.vending")) {
                    cdVar.f24936i.m22550a(cdVar.f24932e, "com.android.vending", cdVar.f24937j, cdVar.f24938k, cdVar.f24931d.getString(C7582R.string.app_name), cdVar.f24940m.m22450a(cdVar.f24932e));
                    z = true;
                } else {
                    FinskyLog.m21665c("Skip unexpected self-update for node %s, %d less than installed %d", cdVar.f24932e, Integer.valueOf(cdVar.f24937j), Integer.valueOf(cdVar.f24934g.f18023c.mo2859g("com.android.vending")));
                }
            }
            if (!z) {
                z = cdVar.m22509a(list, strArr, C1473m.f7980a.mo2029I().f18022b);
            }
            cd.m22508a(this.f24946a.f24943c, z);
        }
        z = false;
        z = true;
        if (cdVar.f24937j <= cdVar.f24934g.f18023c.mo2859g("com.android.vending")) {
            FinskyLog.m21665c("Skip unexpected self-update for node %s, %d less than installed %d", cdVar.f24932e, Integer.valueOf(cdVar.f24937j), Integer.valueOf(cdVar.f24934g.f18023c.mo2859g("com.android.vending")));
        } else {
            cdVar.f24936i.m22550a(cdVar.f24932e, "com.android.vending", cdVar.f24937j, cdVar.f24938k, cdVar.f24931d.getString(C7582R.string.app_name), cdVar.f24940m.m22450a(cdVar.f24932e));
            z = true;
        }
        if (z) {
            z = cdVar.m22509a(list, strArr, C1473m.f7980a.mo2029I().f18022b);
        }
        cd.m22508a(this.f24946a.f24943c, z);
    }
}
