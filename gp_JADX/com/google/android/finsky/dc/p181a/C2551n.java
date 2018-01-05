package com.google.android.finsky.dc.p181a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.cm.C2297d;
import com.google.android.finsky.utils.FinskyLog;

final class C2551n extends BroadcastReceiver {
    public final /* synthetic */ C2297d f13634a;
    public final /* synthetic */ C2549l f13635b;

    C2551n(C2549l c2549l, C2297d c2297d) {
        this.f13635b = c2549l;
        this.f13634a = c2297d;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f13635b.f13627a.f13594a.unregisterReceiver(this);
        C2549l c2549l = this.f13635b;
        C2297d c2297d = this.f13634a;
        String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
        int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", Integer.MIN_VALUE);
        c2549l.f13630d.close();
        try {
            c2549l.f13628b.abandonSession(c2549l.f13629c);
        } catch (SecurityException e) {
            FinskyLog.m21665c("Unable to abandon session %d: %s", Integer.valueOf(c2549l.f13629c), e);
        }
        if (intExtra == 0) {
            c2297d.mo2939a();
        } else if (intExtra == -1) {
            c2297d.mo2940a(976, null);
        } else {
            int i;
            if (intExtra == Integer.MIN_VALUE) {
                i = 977;
            } else {
                i = -500 - intExtra;
            }
            FinskyLog.m21667d("Error %d while installing %s: %s", Integer.valueOf(i), c2549l.f13627a.f13600g, stringExtra);
            c2297d.mo2940a(i, null);
        }
    }
}
