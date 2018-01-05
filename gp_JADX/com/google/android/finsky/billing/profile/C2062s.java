package com.google.android.finsky.billing.profile;

import android.support.v4.app.Fragment;
import com.android.volley.C0660x;
import com.google.android.finsky.p111d.C2495w;
import com.google.wireless.android.finsky.dfe.nano.ap;
import com.squareup.leakcanary.C7582R;

final class C2062s implements C0660x {
    public final C2495w f10586a;
    public final int f10587b;
    public final int f10588c;
    public final /* synthetic */ C2056m f10589d;

    public C2062s(C2056m c2056m, C2495w c2495w, int i, int i2) {
        this.f10589d = c2056m;
        this.f10586a = c2495w;
        this.f10587b = i;
        this.f10588c = i2;
    }

    public final /* synthetic */ void b_(Object obj) {
        ap apVar = (ap) obj;
        Fragment fragment = this.f10589d;
        C2495w c2495w = this.f10586a;
        int i = this.f10587b;
        int i2 = this.f10588c;
        switch (apVar.b) {
            case 1:
                fragment.m10813a(0, null, c2495w);
                fragment.al = apVar.c;
                if (fragment.al.b != null && fragment.al.b.length > 0) {
                    C2063t.m10824c(fragment.at.mo1620b().name);
                }
                fragment.m6758b(i, 0);
                return;
            case 2:
                fragment.m10813a(2, null, c2495w);
                fragment.am = apVar.d;
                fragment.m6758b(i2, 1);
                return;
            default:
                fragment.m10813a(3, null, c2495w);
                fragment.am = fragment.m592c((int) C7582R.string.error);
                fragment.m6758b(i2, 1);
                return;
        }
    }
}
