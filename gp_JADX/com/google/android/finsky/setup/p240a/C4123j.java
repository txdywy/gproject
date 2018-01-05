package com.google.android.finsky.setup.p240a;

import com.google.android.finsky.setup.PackageSetupStatus;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.ee;

public final class C4123j implements C2918a {
    public String f20742a;

    public C4123j(String str) {
        this.f20742a = str;
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        ee eeVar = (ee) obj;
        if (eeVar == null) {
            return null;
        }
        String str = eeVar.c == null ? null : eeVar.c.f11833b;
        return new PackageSetupStatus(this.f20742a, str, eeVar.d, str, 1, eeVar.g, false, null, true, 1, eeVar.k);
    }
}
