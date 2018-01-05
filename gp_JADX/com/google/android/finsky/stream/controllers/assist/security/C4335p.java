package com.google.android.finsky.stream.controllers.assist.security;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p028a.C0221j;
import android.view.View;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.verifier.C4726d;
import com.squareup.leakcanary.C7582R;

final class C4335p extends C4325v {
    public boolean f21818a = false;
    public BroadcastReceiver f21819b;
    public Handler f21820c = new Handler(Looper.getMainLooper());
    public Runnable f21821d = new C4336q(this);
    public Runnable f21822e = new C4337r(this);

    C4335p(ad adVar, Context context, C4726d c4726d) {
        super(adVar, context, c4726d);
    }

    public final int mo4118b() {
        return C7582R.layout.my_apps_security_scanning_in_progress;
    }

    public final void mo4116a(View view) {
    }

    public final void mo4115a() {
        this.f21819b = new C4338s(this);
        C0221j.m1129a(this.h).m1132a(this.f21819b, new IntentFilter("verify_installed_packages_finished"));
        this.f21820c.postDelayed(this.f21821d, ((Long) C0955b.ib.m28964b()).longValue());
        this.f21820c.postDelayed(this.f21822e, ((Long) C0955b.ia.m28964b()).longValue());
    }

    public final void mo4120d() {
        super.mo4120d();
        if (this.f21819b != null) {
            C0221j.m1129a(this.h).m1131a(this.f21819b);
            this.f21819b = null;
        }
        this.f21820c.removeCallbacks(this.f21821d);
        this.f21820c.removeCallbacks(this.f21822e);
    }

    public final void mo4121e() {
        if (this.f21818a) {
            super.mo4121e();
        }
    }
}
