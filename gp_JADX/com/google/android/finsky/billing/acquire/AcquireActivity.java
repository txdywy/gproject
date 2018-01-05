package com.google.android.finsky.billing.acquire;

import android.accounts.Account;
import android.graphics.Rect;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.finsky.billing.acquire.p152a.C1665a;
import com.google.android.finsky.billing.p130b.C1763d;
import com.google.android.finsky.billing.p130b.C1764f;
import com.google.android.finsky.billing.p130b.C1777r;
import com.google.android.finsky.dialogbuilder.C1688g;
import com.google.android.finsky.dialogbuilder.C2795c;
import com.google.android.finsky.dialogbuilder.layout.C2806n;
import com.google.android.finsky.dialogbuilder.layout.C2812o;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.wallet.common.pub.e;
import com.squareup.leakcanary.C7582R;

public class AcquireActivity extends C1664i {
    public final Rect f8667q = new Rect();
    public C2806n f8668r;
    public View f8669s;
    public boolean f8670t;

    protected final void mo2372k() {
        boolean z = (this.R.mo2294a(12636167) || this.T) ? false : true;
        this.f8670t = z;
        View inflate = getLayoutInflater().inflate(mo2373l(), null);
        this.f8669s = inflate.findViewById(C7582R.id.content_frame);
        if (this.f8670t) {
            getWindow().clearFlags(2);
            this.f8669s.setVisibility(8);
        }
        setContentView(inflate);
        this.f8668r = (C2806n) H_().mo281a((int) C7582R.id.content_frame);
        if (this.f8668r == null) {
            this.f8668r = mo2376m();
            H_().mo284a().mo325a((int) C7582R.id.content_frame, this.f8668r).mo334c();
        }
    }

    protected int mo2373l() {
        return C7582R.layout.acquire_activity;
    }

    protected C2806n mo2376m() {
        return new C2812o();
    }

    protected final C1688g mo2374n() {
        C1763d c1763d = this.J;
        C2806n c2806n = this.f8668r;
        View view = this.f8669s;
        boolean z = this.f8670t;
        C1665a c1665a = new C1665a(this.J, this.K, this.L, this.M, new C2795c(getLayoutInflater()), this.O, this.P, this.Q);
        return new C1689e(c1763d, c2806n, view, z, c1665a, this.P, this.Q);
    }

    protected final C1764f mo2371a(Account account, Bundle bundle) {
        C1763d c1763d = this.J;
        C2792h c2792h = this.P;
        C2495w c2495w = this.S;
        Fragment fragment = this.f8668r;
        e eVar = new e();
        return new C1764f(c1763d, bundle, c2792h, c2495w, new C1777r(account, fragment));
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getWindow().getDecorView().getHitRect(this.f8667q);
        if (motionEvent.getAction() != 0 || this.f8667q.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return super.dispatchTouchEvent(motionEvent);
        }
        this.N.m14889a(true);
        return true;
    }
}
