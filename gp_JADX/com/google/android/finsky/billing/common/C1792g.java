package com.google.android.finsky.billing.common;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public abstract class C1792g extends Fragment implements ad {
    public C2471a f9320a;
    public String f9321b;
    public C2495w f9322c;
    public ce f9323d;

    public abstract int mo968W();

    public final void mo1292a(Activity activity) {
        ((C1351c) C3947d.m18649a(C1351c.class)).mo1733a(this);
        super.mo1292a(activity);
        if (!(activity instanceof ad)) {
            throw new IllegalStateException("Parent activity must implement PlayStoreUiElementNode.");
        }
    }

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f9323d = C2482j.m13283a(mo968W());
        this.f9321b = this.f760q.getString("authAccount");
        if (this.f9321b == null) {
            FinskyLog.m21669e("authAccount argument not set.", new Object[0]);
        }
        if (bundle == null) {
            this.f9322c = this.f9320a.m13179a(this.f760q);
            this.f9322c.m13370a(new C2488p().m13345b(this));
            return;
        }
        this.f9322c = this.f9320a.m13179a(bundle);
    }

    public final void m9758a(int i) {
        this.f9322c.m13379b(new C2475d(this).m13256a(i));
    }

    public ce getPlayStoreUiElement() {
        return this.f9323d;
    }

    public ad getParentNode() {
        return (ad) m603h();
    }

    public final void mo1219a(ad adVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }
}
