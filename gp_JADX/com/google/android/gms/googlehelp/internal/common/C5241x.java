package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.util.C5152g;
import com.google.android.gms.googlehelp.GoogleHelp;

final class C5241x implements Runnable {
    public /* synthetic */ GoogleHelp f26340a;
    public /* synthetic */ C5223f f26341b;
    public /* synthetic */ Activity f26342c;
    public /* synthetic */ Intent f26343d;
    public /* synthetic */ C5234q f26344e;

    C5241x(C5234q c5234q, GoogleHelp googleHelp, C5223f c5223f, Activity activity, Intent intent) {
        this.f26344e = c5234q;
        this.f26340a = googleHelp;
        this.f26341b = c5223f;
        this.f26342c = activity;
        this.f26343d = intent;
    }

    public final void run() {
        if (this.f26344e.m24058a()) {
            Log.w("gH_GoogleHelpApiImpl", "Getting sync help psd timed out.");
            this.f26340a.m23992a(C5152g.m23883a(Pair.create("gms:googlehelp:sync_help_psd_failure", "timeout")));
            C5234q.m24051a(this.f26341b, this.f26342c, this.f26343d, this.f26340a);
        }
    }
}
