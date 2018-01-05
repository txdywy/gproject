package com.google.android.finsky.cm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.finsky.utils.FinskyLog;

final class C2303j extends BroadcastReceiver {
    public final /* synthetic */ String f11347a;
    public final /* synthetic */ int f11348b;
    public final /* synthetic */ C2297d f11349c;
    public final /* synthetic */ C2298e f11350d;

    C2303j(C2298e c2298e, String str, int i, C2297d c2297d) {
        this.f11350d = c2298e;
        this.f11347a = str;
        this.f11348b = i;
        this.f11349c = c2297d;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f11350d.f11330a.unregisterReceiver(this);
        C2298e c2298e = this.f11350d;
        String str = this.f11347a;
        int i = this.f11348b;
        C2297d c2297d = this.f11349c;
        String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
        int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", Integer.MIN_VALUE);
        if (intExtra == 0) {
            c2298e.f11336g.mo2856b(str);
            c2298e.m11830a(i, str);
            c2298e.m11832a(new C2305l(c2297d));
        } else if (intExtra == -1) {
            c2298e.m11830a(i, str);
            c2298e.m11832a(new C2306m(c2297d));
        } else {
            c2298e.m11830a(i, str);
            if (intExtra == Integer.MIN_VALUE) {
                i = 977;
            } else {
                i = -500 - intExtra;
            }
            FinskyLog.m21667d("Error %d while installing %s: %s", Integer.valueOf(i), str, stringExtra);
            c2298e.m11832a(new C2307n(c2297d, i));
        }
    }
}
