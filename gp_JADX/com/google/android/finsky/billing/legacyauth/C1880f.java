package com.google.android.finsky.billing.legacyauth;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.p030c.p031a.C0282a;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.p131e.C1817e;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.bb;
import com.squareup.leakcanary.C7582R;

public final class C1880f extends C1089s implements C1879g {
    public final int f9603a = ((Integer) C0955b.dd.m28964b()).intValue();
    public int ah;
    public String ai;
    public C1817e f9604b;
    public Context f9605c;
    public C0988c f9606d;
    public AuthState f9607e;
    public String f9608f;
    public String f9609g;

    public static C1880f m10016a(String str, AuthState authState) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        bundle.putParcelable("AuthChallengeSidecar.authState", authState);
        Fragment c1880f = new C1880f();
        c1880f.m600f(bundle);
        return c1880f;
    }

    public final void mo136b(Bundle bundle) {
        ((C1355j) C3947d.m18649a(C1355j.class)).mo1745a(this);
        this.f9604b = new C1817e(C0282a.m1599a(this.f9605c));
        this.f9607e = (AuthState) this.f760q.getParcelable("AuthChallengeSidecar.authState");
        this.ah = 0;
        super.mo136b(bundle);
    }

    public final void m10020a(String str, String str2, C2495w c2495w) {
        m10021a(str, str2, null, c2495w);
    }

    public final void m10021a(String str, String str2, String str3, C2495w c2495w) {
        boolean z = true;
        C1874a c1874a = new C1874a(this.f9606d.mo2240e(str), c2495w);
        if (!TextUtils.isEmpty(str2)) {
            if (this.f9607e.m10001a() != 2) {
                z = false;
            }
            bb.m21792a(new C1875b(c1874a, str2, z, str3, this), new Void[0]);
        } else if (this.f9607e.m10001a() == 2) {
            m10017c(C7582R.string.blank_account_pin_purchase_flow, 2);
        } else {
            m10017c(C7582R.string.blank_account_password_purchase_flow, 1);
        }
        this.ai = str3;
    }

    private final void m10017c(int i, int i2) {
        Context g = m601g();
        this.f9608f = g == null ? "" : g.getString(i);
        this.ah++;
        if (this.ah >= this.f9603a) {
            i2 = 3;
        }
        m6758b(3, i2);
    }

    public final void mo2491a(String str) {
        this.f9608f = "";
        this.f9609g = str;
        this.f9604b.m9825d();
        m6758b(2, 0);
    }

    public final void mo2490a(int i) {
        switch (i) {
            case 909:
                m10017c(C7582R.string.generic_account_error, 4);
                return;
            case 910:
                m10017c(C7582R.string.network_error, 0);
                return;
            case 1003:
                m10017c(C7582R.string.invalid_account_pin_purchase_flow, 2);
                return;
            case 1100:
                m10017c(C7582R.string.invalid_account_password_purchase_flow, 1);
                return;
            default:
                m10017c(C7582R.string.generic_purchase_prepare_error, 0);
                return;
        }
    }
}
