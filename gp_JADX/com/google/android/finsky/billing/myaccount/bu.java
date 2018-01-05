package com.google.android.finsky.billing.myaccount;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;

public final class bu extends C1089s {
    public C1287h f10275a;
    public String f10276b;
    public C1254c f10277c;

    protected static bu m10620a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        Fragment buVar = new bu();
        buVar.m600f(bundle);
        return buVar;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1756a(this);
        this.f10277c = this.f10275a.mo2016a(this.f760q.getString("authAccount"));
    }

    static void m10621a(int i, Throwable th, C2495w c2495w) {
        C2474c c2474c = new C2474c(346);
        if (i == 0) {
            c2474c.m13239a(true);
        } else {
            c2474c.m13239a(false).m13210a(i).m13238a(th);
        }
        c2495w.m13367a(c2474c);
    }
}
