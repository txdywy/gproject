package com.google.android.finsky.setup.p240a;

import android.content.Context;
import android.os.Bundle;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ec.C2968a;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.ee;

public final class C4124k implements C2918a {
    public final Context f20743a;
    public final C2918a f20744b;
    public final String f20745c;
    public final boolean f20746d = true;

    public C4124k(Context context, String str, C4121h c4121h) {
        this.f20743a = context;
        this.f20745c = str;
        this.f20744b = c4121h;
    }

    public final Bundle m19172a(ee eeVar) {
        int i = 1;
        if (eeVar == null) {
            return null;
        }
        Bundle bundle = (Bundle) this.f20744b.mo3197a(eeVar.n);
        if (bundle == null) {
            return null;
        }
        boolean z;
        int i2;
        bundle.putInt("doc_type", 1);
        bundle.putString("authAccount", this.f20745c);
        String str = "is_required";
        if (((eeVar.b & 8) != 0 ? 1 : 0) == 0 || !eeVar.h) {
            z = false;
        } else {
            z = true;
        }
        bundle.putBoolean(str, z);
        str = "is_default";
        if ((eeVar.b & 16) != 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (i2 == 0 || !eeVar.i) {
            z = false;
        } else {
            z = true;
        }
        bundle.putBoolean(str, z);
        bundle.putInt("priority", C4124k.m19171b(eeVar));
        String str2 = "network_type";
        int b = C4124k.m19171b(eeVar);
        if ((C1503a.m8831b(this.f20743a) && C2968a.m15380a(this.f20743a).m15384c() && b != 1) || !(eeVar.p || b == 1)) {
            i = 0;
        }
        bundle.putInt(str2, i);
        bundle.putBoolean("is_visible", this.f20746d);
        bundle.putString("delivery_token", eeVar.g);
        return bundle;
    }

    private static int m19171b(ee eeVar) {
        if (!eeVar.e()) {
            return 2;
        }
        if (eeVar.l < 100) {
            return 1;
        }
        if (eeVar.l >= 200) {
            return 3;
        }
        return 2;
    }
}
