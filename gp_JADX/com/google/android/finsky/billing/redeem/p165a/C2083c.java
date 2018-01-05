package com.google.android.finsky.billing.redeem.p165a;

import android.os.Bundle;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.payments.C1924e;
import com.google.android.finsky.billing.redeem.C2088a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public final class C2083c extends C1924e {
    public ce f10634a = C2482j.m13283a(1106);

    public final void m10914a(int i, Bundle bundle) {
        C2088a c2088a = (C2088a) aa();
        if (C1924e.m10271a(i)) {
            C1089s c1089s = c2088a.f10646d;
            C2495w c2495w = c2088a.aJ;
            if (c1089s.f6948l != 5) {
                FinskyLog.m21669e("Invalid state: %d", Integer.valueOf(c1089s.f6948l));
                return;
            }
            c1089s.m10947a(c2495w);
            return;
        }
        c2088a.m10936Y();
    }

    public final void m10915b(int i, Bundle bundle) {
    }

    public final ce getPlayStoreUiElement() {
        return this.f10634a;
    }
}
