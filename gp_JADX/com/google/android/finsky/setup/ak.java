package com.google.android.finsky.setup;

import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.packagemanager.C3849a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ad;

public final class ak {
    public final ao f20772a;
    public final bs f20773b;
    public final C3340g f20774c;
    public final C2320a f20775d;
    public final C1461c f20776e;
    public final C3849a f20777f;
    public int f20778g = 0;
    public int f20779h = 0;
    public int f20780i = 0;

    public ak(ao aoVar, bs bsVar, C3340g c3340g, C2320a c2320a, C1461c c1461c, C3849a c3849a) {
        this.f20772a = aoVar;
        this.f20773b = bsVar;
        this.f20774c = c3340g;
        this.f20775d = c2320a;
        this.f20776e = c1461c;
        this.f20777f = c3849a;
    }

    public final int m19191a(PackageSetupStatus packageSetupStatus) {
        if (packageSetupStatus == null) {
            FinskyLog.m21669e("Skipping restore of null", new Object[0]);
            return 1;
        }
        String a = packageSetupStatus.m19066a();
        if (TextUtils.isEmpty(a)) {
            String str = "Skipping restore of package with %s name";
            Object[] objArr = new Object[1];
            objArr[0] = a == null ? "null" : "empty";
            FinskyLog.m21669e(str, objArr);
            return 2;
        }
        int i = packageSetupStatus.f20546a.f20890d;
        PackageSetupStatus b = this.f20772a.m19232b(a);
        if (b != null && !ad.m21692a(packageSetupStatus.m19068b(), b.m19068b())) {
            this.f20778g++;
            this.f20773b.mo3947a(packageSetupStatus, "other-account");
            FinskyLog.m21659a("Skipping restore of %s v:%d for account %s because already restoring for account %s", a, Integer.valueOf(i), FinskyLog.m21655a(packageSetupStatus.m19068b()), FinskyLog.m21655a(b.m19068b()));
            return 3;
        } else if (C3028c.m15628a(this.f20774c.mo3482b(a))) {
            this.f20779h++;
            this.f20773b.mo3947a(packageSetupStatus, "is-tracked");
            FinskyLog.m21659a("Skipping restore of %s because already restoring", a);
            return 4;
        } else {
            C2322b a2 = this.f20775d.mo2854a(a);
            if (new C3654j(this.f20776e).m17260a(i, packageSetupStatus.f20546a.f20899m, null).m17262a(a2).m17269e()) {
                this.f20777f.mo3823a(a);
                this.f20780i++;
                this.f20773b.mo3959b(packageSetupStatus, a2.f11419d);
                FinskyLog.m21659a("Skipping restore of %s v:%d because v:%d is installed", a, Integer.valueOf(i), Integer.valueOf(a2.f11419d));
                return 5;
            } else if (a2 == null || ((Boolean) C0955b.gu.m28964b()).booleanValue() || !C3028c.m15629a(a2)) {
                FinskyLog.m21659a("Should attempt restore of %s", a);
                return 0;
            } else {
                this.f20773b.mo3947a(packageSetupStatus, "is-preview");
                FinskyLog.m21659a("Skipping restore of %s because installed v=%d is preview (targetSdk=%d)", a, Integer.valueOf(a2.f11419d), Integer.valueOf(a2.f11427l));
                return 6;
            }
        }
    }
}
