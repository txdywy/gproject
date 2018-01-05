package com.google.android.finsky.wear;

import android.accounts.Account;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2718h;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.wearable.C5613a;
import com.google.android.gms.wearable.C5620h;
import com.google.android.gms.wearable.C5651m;
import com.google.android.gms.wearable.C5652n;
import com.google.android.gms.wearable.PutDataRequest;
import java.util.Arrays;

final class cb implements Runnable {
    public final /* synthetic */ ca f24927a;

    cb(ca caVar) {
        this.f24927a = caVar;
    }

    public final void run() {
        this.f24927a.f24926c.f24760g = this.f24927a.f24926c.f24760g - 1;
        if ("auto_install".equals(this.f24927a.f24924a)) {
            WearSupportService wearSupportService = this.f24927a.f24926c;
            String str = this.f24927a.f24925b;
            FinskyLog.m21659a("Begin wear auto install for package %s", str);
            for (String str2 : wearSupportService.f24758e.m22521a()) {
                wearSupportService.m22420a(str2);
                C1473m c1473m = C1473m.f7980a;
                cd cdVar = new cd(c1473m.f7981b, str2, c1473m.ah(), wearSupportService.f24756c.f24797g.m22484a(str2), C1473m.f7980a.mo2222d(str2), wearSupportService.f24756c.f24798h, 0, null, wearSupportService.f24756c, new bm(wearSupportService, str2));
                cj boVar = new bo(wearSupportService, str2, str);
                if (C1473m.f7980a.mo2035O().m8838a()) {
                    Account cY = C1473m.f7980a.cY();
                    if (cY == null) {
                        cd.m22508a(boVar, false);
                    } else if (!cdVar.f24934g.f18022b.m11208b()) {
                        FinskyLog.m21669e("Require loaded app states to perform update check.", new Object[0]);
                        cd.m22508a(boVar, false);
                    } else if (cdVar.f24933f.mo2816a()) {
                        int b = cdVar.f24933f.mo2817b();
                        String a = C1473m.f7980a.bt().m15626a(str).m15620a(cY.name);
                        FinskyLog.m21659a("Checking wear apk for account %s package %s node %s", a, str, cdVar.f24932e);
                        C2335k c2718h = new C2718h(cdVar.f24935h.mo2016a(a), Arrays.asList(new C1283d[]{new C1283d(str)}), false);
                        c2718h.m11918a(new ch(cdVar, c2718h, b, str, boVar, a));
                        c2718h.m11917a(new ci(cdVar, str, boVar));
                    } else {
                        FinskyLog.m21669e("Require loaded libraries to perform update check.", new Object[0]);
                        cd.m22508a(boVar, false);
                    }
                } else {
                    FinskyLog.m21662b("Skip update checks for node %s because the store is invalid.", cdVar.f24932e);
                    cd.m22508a(boVar, false);
                }
            }
        } else if ("auto_uninstall".equals(this.f24927a.f24924a)) {
            WearSupportService wearSupportService2 = this.f24927a.f24926c;
            String str3 = this.f24927a.f24925b;
            FinskyLog.m21659a("Begin wear auto uninstall for package %s", str3);
            if (C1473m.f7980a.ah().mo2812a(str3).isEmpty()) {
                FinskyLog.m21659a("Skipping uninstall for package %s, not owned", str3);
                return;
            }
            for (String str4 : wearSupportService2.f24758e.m22521a()) {
                long currentTimeMillis = System.currentTimeMillis();
                String a2 = ck.m22512a(str4, currentTimeMillis);
                FinskyLog.m21659a("Writing Uninstall Request for package %s (%s) to %s", str3, str4, new StringBuilder((String.valueOf(str3).length() + 21) + String.valueOf(a2).length()).append("/uninstall_wearable/").append(str3).append("/").append(a2).toString());
                C5651m a3 = C5651m.m26837a(r2);
                C5620h c5620h = a3.f28707b;
                c5620h.m26652a("nodeIds", new String[]{str4});
                c5620h.m26643a("timestamp", currentTimeMillis);
                C4789j b2 = new C4789j(114, wearSupportService2.f24758e).m22537b(str3);
                b2.f24996b = str4;
                C1473m.f7980a.dc().m13319a(b2.m22535a(a2).m22536a(), null);
                C5613a c5613a = C5652n.f28708a;
                C5058o c5058o = wearSupportService2.f24756c.f24792b;
                PutDataRequest a4 = a3.m26838a();
                a4.f28571e = 0;
                c5613a.mo5117a(c5058o, a4).mo4490a(new bp(wearSupportService2, a3, str3, str4, a2));
            }
        }
    }
}
