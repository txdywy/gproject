package com.google.android.finsky.billing;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public class com.google.android.finsky.billing.t extends android.support.v4.app.p implements com.google.android.finsky.d.ad
{

    public final com.google.wireless.android.a.a.a.a.ce af;
    public final com.google.android.finsky.d.a ag;
    public com.google.android.finsky.d.w ah;

    t() {
        android.support.v4.app.p();
        this.af = com.google.android.finsky.d.j.a(this.X());
        this.ag = com.google.android.finsky.m.a.aR();
    }

    public static Bundle a(String p0, com.google.android.finsky.d.w p1) {
        v0 = new Bundle();
        v0.putString("authAccount", p0);
        p1.b(p0).a(v0);
        return v0;
    }

    protected abstract int X();

    protected final void a(int p0) {
        this.ah.b(new com.google.android.finsky.d.d(this).a(p0));
    }

    public final void a(Activity p0) {
        super.a(p0);
        if (!(p0 instanceof com.google.android.finsky.d.ad))
            throw new IllegalStateException("Parent activity must implement PlayStoreUiElementNode.");
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        throw new UnsupportedOperationException("Unwanted children.");
    }

    public final void b(Bundle p0) {
        super.b(p0);
        if (this.q.getString("authAccount") == 0)
            FinskyLog.e("authAccount argument not set.", new Object[0]);
        if (p0 == 0) {
            this.ah = this.ag.a(this.q);
            this.ah.a(new com.google.android.finsky.d.p().b(this));
        }
        else
            this.ah = this.ag.a(p0);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        this.ah.a(p0);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return (com.google.android.finsky.d.ad)this.h();
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.af;
    }

    public void onDismiss(DialogInterface p0) {
        if (this.ah != 0)
            this.ah.a(new com.google.android.finsky.d.p().b(this).a(603));
        super.onDismiss(p0);
    }

}
