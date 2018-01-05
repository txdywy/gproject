package com.google.android.finsky.setup.p240a;

import android.os.Bundle;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.fp;

public final class C4115b implements C2918a {
    public final C2918a f20727a;
    public final String f20728b;

    public C4115b(String str, C4121h c4121h) {
        this.f20728b = str;
        this.f20727a = c4121h;
    }

    private static int m19156a(fp fpVar) {
        if (!fpVar.e() || fpVar.d >= 100) {
            return 3;
        }
        return 1;
    }

    public final /* synthetic */ Object mo3197a(Object obj) {
        int i = 0;
        fp fpVar = (fp) obj;
        if (fpVar == null) {
            return null;
        }
        Bundle bundle = (Bundle) this.f20727a.mo3197a(fpVar.c);
        if (bundle == null) {
            return null;
        }
        bundle.putInt("doc_type", 2);
        bundle.putString("authAccount", this.f20728b);
        bundle.putBoolean("is_required", false);
        bundle.putBoolean("is_default", true);
        bundle.putInt("priority", C4115b.m19156a(fpVar));
        String str = "network_type";
        if (C4115b.m19156a(fpVar) == 1) {
            i = 1;
        }
        bundle.putInt(str, i);
        bundle.putBoolean("is_visible", true);
        return bundle;
    }
}
