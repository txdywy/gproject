package com.google.android.finsky.ca;

import android.content.Intent;
import com.android.volley.C0660x;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.finsky.dfe.nano.dc;
import com.google.wireless.android.finsky.dfe.nano.de;

final class C2254f implements C0660x {
    public final /* synthetic */ String f11193a;
    public final /* synthetic */ Runnable f11194b;
    public final /* synthetic */ C2251c f11195c;

    C2254f(C2251c c2251c, String str, Runnable runnable) {
        this.f11195c = c2251c;
        this.f11193a = str;
        this.f11194b = runnable;
    }

    public final /* synthetic */ void b_(Object obj) {
        de deVar = (de) obj;
        this.f11195c.m11685a(this.f11193a, 1301, null, 0, null, null);
        C2249a c2249a = this.f11195c.f11182e;
        Object obj2 = deVar.a;
        String str = this.f11193a;
        aj.m21700a(str);
        if (!(obj2 == null || obj2.length == 0)) {
            if (c2249a.m11682b()) {
                aj.m21700a(obj2);
                aj.m21700a(str);
                for (dc dcVar : obj2) {
                    String str2 = dcVar.c;
                    c2249a.f11170a.setApplicationRestrictions(null, str2, c2249a.m11679a(dcVar.d));
                    c2249a.f11172c.mo2667a(str2, dcVar.e);
                    c2249a.m11680a(str, 1302, "via-dpm", 0, null, str2);
                }
            } else if (c2249a.f11174e != null) {
                Intent intent = c2249a.f11174e;
                aj.m21700a(obj2);
                aj.m21700a(str);
                aj.m21700a(intent);
                try {
                    if (!c2249a.f11171b.bindService(intent, new C2250b(c2249a, obj2, str), 1)) {
                        c2249a.m11680a(str, 1304, "via-dpc-proxy", 2, null, null);
                    }
                } catch (Exception e) {
                    c2249a.m11680a(str, 1304, "via-dpc-proxy", 3, e, null);
                }
            } else {
                throw new RuntimeException("Not initialized.");
            }
        }
        ForegroundCoordinator.m16015a(this.f11195c.f11186i);
        if (this.f11194b != null) {
            this.f11194b.run();
        }
    }
}
