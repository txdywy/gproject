package com.google.android.finsky.billing;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.C0141p;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public abstract class C1834t extends C0141p implements ad {
    public final ce af = C2482j.m13283a(mo2460X());
    public final C2471a ag = C1473m.f7980a.aR();
    public C2495w ah;

    protected abstract int mo2460X();

    public final void mo1292a(Activity activity) {
        super.mo1292a(activity);
        if (!(activity instanceof ad)) {
            throw new IllegalStateException("Parent activity must implement PlayStoreUiElementNode.");
        }
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        if (this.f760q.getString("authAccount") == null) {
            FinskyLog.m21669e("authAccount argument not set.", new Object[0]);
        }
        if (bundle == null) {
            this.ah = this.ag.m13179a(this.f760q);
            this.ah.m13370a(new C2488p().m13345b(this));
            return;
        }
        this.ah = this.ag.m13179a(bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.ah != null) {
            this.ah.m13370a(new C2488p().m13345b(this).m13340a(603));
        }
        super.onDismiss(dialogInterface);
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        this.ah.m13377a(bundle);
    }

    public static Bundle m9862a(String str, C2495w c2495w) {
        Bundle bundle = new Bundle();
        bundle.putString("authAccount", str);
        c2495w.m13380b(str).m13377a(bundle);
        return bundle;
    }

    protected final void m9864a(int i) {
        this.ah.m13379b(new C2475d(this).m13256a(i));
    }

    public ce getPlayStoreUiElement() {
        return this.af;
    }

    public ad getParentNode() {
        return (ad) m603h();
    }

    public final void mo1219a(ad adVar) {
        throw new UnsupportedOperationException("Unwanted children.");
    }
}
