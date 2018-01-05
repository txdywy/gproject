package com.google.android.finsky.billing.acquire;

import android.accounts.Account;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.ab;
import android.support.v4.app.aw;
import android.support.v4.app.u;
import android.support.v7.app.aa;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.acquire.a.a;
import com.google.android.finsky.billing.b.f;
import com.google.android.finsky.billing.b.r;
import com.google.android.finsky.dialogbuilder.c;
import com.google.android.finsky.dialogbuilder.e;
import com.google.android.finsky.dialogbuilder.g;
import com.google.android.finsky.dialogbuilder.layout.n;
import com.google.android.finsky.dialogbuilder.layout.o;
import com.google.android.wallet.common.pub.e;

protected final class AcquireActivity extends com.google.android.finsky.billing.acquire.i
{

    public final Rect q;
    public com.google.android.finsky.dialogbuilder.layout.n r;
    public View s;
    public boolean t;

    AcquireActivity() {
        com.google.android.finsky.billing.acquire.i();
        this.q = new Rect();
    }

    protected final com.google.android.finsky.billing.b.f a(Account p0, Bundle p1) {
        new com.google.android.wallet.common.pub.e();
        return new com.google.android.finsky.billing.b.f(this.J, p1, this.P, this.S, new com.google.android.finsky.billing.b.r(p0, this.r));
    }

    public boolean dispatchTouchEvent(MotionEvent p0) {
        v0 = 1;
        this.getWindow().getDecorView().getHitRect(this.q);
        if (p0.getAction() == 0 && !this.q.contains((int)p0.getX(), (int)p0.getY()))
            this.N.a(1);
        else
            v0 = super.dispatchTouchEvent(p0);
        return v0;
    }

    protected final void k() {
        if (!this.R.a(12636167) && this.T == 0)
            v0 = 1;
        else
            v0 = 0;
        this.t = v0;
        v0 = this.getLayoutInflater().inflate(this.l(), 0);
        this.s = v0.findViewById(2131755313);
        if (this.t != 0) {
            this.getWindow().clearFlags(2);
            this.s.setVisibility(8);
        }
        this.setContentView(v0);
        this.r = (com.google.android.finsky.dialogbuilder.layout.n)this.H_().a(2131755313);
        if (this.r == 0) {
            this.r = this.m();
            this.H_().a().a(2131755313, this.r).c();
        }
    }

    protected int l() {
        return 2130968613;
    }

    protected com.google.android.finsky.dialogbuilder.layout.n m() {
        return new com.google.android.finsky.dialogbuilder.layout.o();
    }

    protected final com.google.android.finsky.dialogbuilder.g n() {
        v9 = new com.google.android.finsky.billing.acquire.e;
        v9.<init>(this.J, this.r, this.s, this.t, new com.google.android.finsky.billing.acquire.a.a(this.J, this.K, this.L, this.M, new com.google.android.finsky.dialogbuilder.c(this.getLayoutInflater()), this.O, this.P, this.Q), this.P, this.Q);
        return v9;
    }

}
