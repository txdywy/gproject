package com.google.android.finsky.setup.p240a;

import android.os.Bundle;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.ci;

public final class C4122i implements C2918a {
    public final /* synthetic */ Object mo3197a(Object obj) {
        String str = null;
        ci ciVar = (ci) obj;
        if (ciVar == null) {
            return null;
        }
        if (ciVar.c != null) {
            str = ciVar.c.f11833b;
        }
        Bundle bundle = new Bundle();
        bundle.putString("package_name", str);
        bundle.putInt("version_code", ciVar.e);
        bundle.putString("title", ciVar.d);
        return bundle;
    }
}
