package com.google.android.finsky.billing.updatesubscriptioninstrument;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.billing.profile.C2048c;
import com.google.android.finsky.billing.profile.C2056m;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.ParcelableProto;

public final class C2099b extends C2048c {
    public C1461c aj;

    public static C2099b m10984a(Account account, ax axVar, int i) {
        Bundle a = C2048c.m10781a(account, null, axVar, i, 12, 7, null, null, false);
        Fragment c2099b = new C2099b();
        c2099b.m600f(a);
        return c2099b;
    }

    public final void mo1292a(Activity activity) {
        ((C1359a) C3947d.m18649a(C1359a.class)).mo1774a(this);
        super.mo1292a(activity);
    }

    protected final void ae() {
        C2056m c2056m = this.e;
        c2056m.m10816a(c2056m.mo968W(), (ax) ParcelableProto.m21673a(this.f760q, "BillingProfileFragment.docid"), this.f760q.getInt("BillingProfileFragment.instrumentRank"), this.af);
    }

    protected final int ad() {
        return 5;
    }

    protected final int af() {
        return 5581;
    }
}
