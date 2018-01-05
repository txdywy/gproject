package com.google.android.finsky.billing.profile;

import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.v;

public final class com.google.android.finsky.billing.profile.f implements View$OnClickListener
{

    public final com.google.wireless.android.finsky.dfe.nano.v a;
    public final com.google.android.finsky.billing.profile.c b;

    f(com.google.android.finsky.billing.profile.c p0, com.google.wireless.android.finsky.dfe.nano.v p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onClick(View p0) {
        this.b.af.b(new com.google.android.finsky.d.d(this.b).a(809).a(this.a.g));
        if (this.b.h() instanceof com.google.android.finsky.billing.profile.k)
            v0 = (com.google.android.finsky.billing.profile.k)this.b.h();
        else {
            FinskyLog.e("No listener registered.", new Object[0]);
            v0 = 0;
        }
        if (v0 != 0)
            v0.a();
    }

}
