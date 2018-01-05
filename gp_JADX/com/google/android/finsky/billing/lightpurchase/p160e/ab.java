package com.google.android.finsky.billing.lightpurchase.p160e;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.C1925w;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.lightpurchase.aq;
import com.google.android.finsky.p111d.C2482j;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class ab extends C1925w {
    public final ce aj = C2482j.m13283a(775);

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        C1473m.f7980a.aH().m9782a(this.f760q, a, this.i, this.af, null, null, null, ((aq) aa()).ao());
        return a;
    }

    public final void mo1405X() {
        m6694a(778, null);
        if (ab()) {
            ((aq) aa()).ac();
        } else {
            mo2540Y();
        }
    }

    public final void mo2535Z() {
        m6694a(779, null);
        ((aq) aa()).ac();
    }

    protected final void mo2540Y() {
        ((aq) aa()).ag();
    }

    public final String mo1406a(Resources resources) {
        if (ab()) {
            return resources.getString(C7582R.string.ok);
        }
        return super.mo1406a(resources);
    }

    public final ce getPlayStoreUiElement() {
        return this.aj;
    }

    private final boolean ab() {
        if (aa() == null || ((aq) aa()).m6732h() == null || ((aq) aa()).m6732h().getIntent() == null) {
            return false;
        }
        PurchaseParams purchaseParams = (PurchaseParams) ((aq) aa()).m6732h().getIntent().getParcelableExtra("PurchaseActivity.params");
        return purchaseParams != null && purchaseParams.f9303s;
    }
}
