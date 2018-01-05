package com.google.android.finsky.actionbuttons;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.cw.C2454a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class C1014k implements OnClickListener {
    public final /* synthetic */ C2495w f6219a;
    public final /* synthetic */ ad f6220b;
    public final /* synthetic */ C3748a f6221c;
    public final /* synthetic */ C2454a f6222d;
    public final /* synthetic */ String f6223e;

    C1014k(C2495w c2495w, ad adVar, C3748a c3748a, C2454a c2454a, String str) {
        this.f6219a = c2495w;
        this.f6220b = adVar;
        this.f6221c = c3748a;
        this.f6222d = c2454a;
        this.f6223e = str;
    }

    public final void onClick(View view) {
        this.f6219a.m13379b(new C2475d(this.f6220b).m13256a(221));
        this.f6221c.mo3631a(this.f6222d.f13238i, this.f6222d.f13237h, this.f6222d.f13234e, this.f6222d.f13235f, this.f6223e, false, this.f6219a);
        if (view != null) {
            view.postDelayed(new C1015l(this), 300);
        }
    }
}
