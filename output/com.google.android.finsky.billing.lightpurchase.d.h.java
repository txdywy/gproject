package com.google.android.finsky.billing.lightpurchase.d;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.cf;

public class com.google.android.finsky.billing.lightpurchase.d.h extends Fragment implements com.google.android.finsky.d.ad
{

    public com.google.android.finsky.billing.lightpurchase.d.g ai;

    h() {
        Fragment();
    }

    public boolean W() {
        return 1;
    }

    public abstract void X();

    public void Z() {
    }

    public abstract String a(Resources p0);

    public final void a(int p0, com.google.wireless.android.a.a.a.a.cf p1) {
        this.aa().a(p0, p1, this);
    }

    public final void a(Activity p0) {
        super.a(p0);
        if (!(p0 instanceof com.google.android.finsky.d.ad))
            throw new IllegalStateException("Activity must implement PlayStoreUiElementNode");
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        FinskyLog.e("Not using tree impressions.", new Object[0]);
    }

    public final com.google.android.finsky.billing.lightpurchase.d.g aa() {
        if (this.ai == 0)
            v0 = (com.google.android.finsky.billing.lightpurchase.d.g)this.F;
        else
            v0 = this.ai;
        return v0;
    }

    public String b(Resources p0) {
        return 0;
    }

    public void b(Bundle p0) {
        super.b(p0);
        if (p0 == 0 && this.aa() != 0)
            this.aa().a(this);
    }

    public void e(Bundle p0) {
        super.e(p0);
        p0.putBoolean("StepFragment.exists", 1);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return (com.google.android.finsky.d.ad)this.h();
    }

}
