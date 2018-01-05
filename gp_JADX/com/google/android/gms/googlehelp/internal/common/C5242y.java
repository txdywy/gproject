package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.util.C5152g;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.List;

final class C5242y implements Runnable {
    public /* synthetic */ Handler f26345a;
    public /* synthetic */ Runnable f26346b;
    public /* synthetic */ GoogleHelp f26347c;
    public /* synthetic */ C5223f f26348d;
    public /* synthetic */ Activity f26349e;
    public /* synthetic */ Intent f26350f;
    public /* synthetic */ C5234q f26351g;

    C5242y(C5234q c5234q, Handler handler, Runnable runnable, GoogleHelp googleHelp, C5223f c5223f, Activity activity, Intent intent) {
        this.f26351g = c5234q;
        this.f26345a = handler;
        this.f26346b = runnable;
        this.f26347c = googleHelp;
        this.f26348d = c5223f;
        this.f26349e = activity;
        this.f26350f = intent;
    }

    public final void run() {
        try {
            C5234q.m24053b().m24338a();
            throw new NoSuchMethodError();
        } catch (Throwable e) {
            Log.w("gH_GoogleHelpApiImpl", "Failed to get sync help psd.", e);
            List a = C5152g.m23883a(Pair.create("gms:googlehelp:sync_help_psd_failure", "exception"));
            if (this.f26351g.m24058a()) {
                this.f26345a.removeCallbacks(this.f26346b);
                this.f26347c.m23992a(a);
                C5234q.m24051a(this.f26348d, this.f26349e, this.f26350f, this.f26347c);
            }
        }
    }
}
