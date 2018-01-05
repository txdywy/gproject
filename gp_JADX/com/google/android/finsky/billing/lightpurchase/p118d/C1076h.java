package com.google.android.finsky.billing.lightpurchase.p118d;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.cf;

public abstract class C1076h extends Fragment implements ad {
    public C1085g ai;

    public abstract void mo1405X();

    public abstract String mo1406a(Resources resources);

    public final void mo1292a(Activity activity) {
        super.mo1292a(activity);
        if (!(activity instanceof ad)) {
            throw new IllegalStateException("Activity must implement PlayStoreUiElementNode");
        }
    }

    public void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        if (bundle == null && aa() != null) {
            aa().mo1412a((ad) this);
        }
    }

    public void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putBoolean("StepFragment.exists", true);
    }

    public String mo2536b(Resources resources) {
        return null;
    }

    public boolean mo968W() {
        return true;
    }

    public void mo2535Z() {
    }

    public final C1085g aa() {
        return this.ai == null ? (C1085g) this.f734F : this.ai;
    }

    public final void m6694a(int i, cf cfVar) {
        aa().mo1409a(i, cfVar, this);
    }

    public ad getParentNode() {
        return (ad) m603h();
    }

    public final void mo1219a(ad adVar) {
        FinskyLog.m21669e("Not using tree impressions.", new Object[0]);
    }
}
