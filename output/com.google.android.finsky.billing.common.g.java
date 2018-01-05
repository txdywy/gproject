package com.google.android.finsky.billing.common;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.d;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;

public class com.google.android.finsky.billing.common.g extends Fragment implements com.google.android.finsky.d.ad
{

    public com.google.android.finsky.d.a a;
    public String b;
    public com.google.android.finsky.d.w c;
    public com.google.wireless.android.a.a.a.a.ce d;

    g() {
        Fragment();
    }

    public abstract int W();

    public final void a(int p0) {
        this.c.b(new com.google.android.finsky.d.d(this).a(p0));
    }

    public final void a(Activity p0) {
        ((com.google.android.finsky.billing.common.c)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.common.c)).a(this);
        super.a(p0);
        if (!(p0 instanceof com.google.android.finsky.d.ad))
            throw new IllegalStateException("Parent activity must implement PlayStoreUiElementNode.");
    }

    public final void a(com.google.android.finsky.d.ad p0) {
        throw new UnsupportedOperationException("Unwanted children.");
    }

    public void b(Bundle p0) {
        super.b(p0);
        this.d = com.google.android.finsky.d.j.a(this.W());
        this.b = this.q.getString("authAccount");
        if (this.b == 0)
            FinskyLog.e("authAccount argument not set.", new Object[0]);
        if (p0 == 0) {
            this.c = this.a.a(this.q);
            this.c.a(new com.google.android.finsky.d.p().b(this));
        }
        else
            this.c = this.a.a(p0);
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return (com.google.android.finsky.d.ad)this.h();
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.d;
    }

}
