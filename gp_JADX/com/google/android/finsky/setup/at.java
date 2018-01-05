package com.google.android.finsky.setup;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;

final class at implements C0657w {
    public final /* synthetic */ String f20798a;
    public final /* synthetic */ String f20799b;
    public final /* synthetic */ RestoreService f20800c;

    at(RestoreService restoreService, String str, String str2) {
        this.f20800c = restoreService;
        this.f20798a = str;
        this.f20799b = str2;
    }

    public final void mo1062a(VolleyError volleyError) {
        boolean z;
        this.f20800c.f20572e.m19259a(this.f20798a, false);
        C1473m.f7980a.aS().mo3950a(this.f20798a, this.f20800c.f20572e.m19255a(this.f20798a), volleyError);
        FinskyLog.m21665c("Error while getting list of applications to restore from server: %s", volleyError.getMessage());
        bb bbVar = this.f20800c.f20572e;
        String str = this.f20798a;
        aw awVar = (aw) bbVar.f20854c.get(str);
        if (awVar == null || awVar.f20804a < ((Integer) C0955b.bj.m28964b()).intValue()) {
            z = true;
        } else {
            FinskyLog.m21659a("Reached limit %d for %s", Integer.valueOf(awVar.f20804a), FinskyLog.m21655a(str));
            bbVar.f20854c.remove(str);
            bbVar.m19261b(str);
            z = false;
        }
        if (z) {
            C1473m.f7980a.cK().mo3924a(this.f20800c, this.f20799b, this.f20798a, (long) (((double) ((Long) C0955b.bk.m28964b()).longValue()) * (0.75d + (Math.random() / 2.0d))));
        }
    }
}
