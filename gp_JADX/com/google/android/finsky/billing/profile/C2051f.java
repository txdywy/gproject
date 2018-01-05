package com.google.android.finsky.billing.profile;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.dfe.nano.v;

final class C2051f implements OnClickListener {
    public final /* synthetic */ v f10549a;
    public final /* synthetic */ C2048c f10550b;

    C2051f(C2048c c2048c, v vVar) {
        this.f10550b = c2048c;
        this.f10549a = vVar;
    }

    public final void onClick(View view) {
        C2055k c2055k;
        this.f10550b.af.m13379b(new C2475d(this.f10550b).m13256a(809).m13258a(this.f10549a.g));
        Fragment fragment = this.f10550b;
        if (fragment.m603h() instanceof C2055k) {
            c2055k = (C2055k) fragment.m603h();
        } else {
            FinskyLog.m21669e("No listener registered.", new Object[0]);
            c2055k = null;
        }
        if (c2055k != null) {
            c2055k.mo2640a();
        }
    }
}
