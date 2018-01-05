package com.google.android.finsky.bj;

import android.app.Activity;
import com.google.android.gms.googlehelp.C5211b;
import com.google.android.gms.googlehelp.GoogleHelp;

final class C2105c implements Runnable {
    public final /* synthetic */ String f10709a;
    public final /* synthetic */ Activity f10710b;
    public final /* synthetic */ C2104b f10711c;

    C2105c(C2104b c2104b, String str, Activity activity) {
        this.f10711c = c2104b;
        this.f10709a = str;
        this.f10710b = activity;
    }

    public final void run() {
        GoogleHelp googleHelp = new GoogleHelp(this.f10709a);
        googleHelp.f26266c = this.f10711c.f10708b.cY();
        googleHelp.f26280q = C2104b.f10707a;
        new C5211b(this.f10710b).m23993a(googleHelp.m23991a(C2104b.m10991a(this.f10710b), this.f10710b.getCacheDir()).m23990a());
    }
}
