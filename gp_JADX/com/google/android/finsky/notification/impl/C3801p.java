package com.google.android.finsky.notification.impl;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.notification.C3800x;
import com.google.android.finsky.notification.C3820u;
import com.google.android.finsky.notification.C3822w;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;

public final class C3801p implements C3800x {
    public final Context f19091a;
    public final C2171b f19092b;

    public C3801p(Context context, C2171b c2171b) {
        this.f19091a = context;
        this.f19092b = c2171b;
    }

    public final PendingIntent mo3770a(C3820u c3820u, int i, C2495w c2495w) {
        PendingIntent a = NotificationReceiver.m18048a(c3820u, this.f19091a, i, c2495w);
        if (a == null) {
            a = this.f19092b.mo2724a(c3820u, this.f19091a, i, c2495w);
        }
        if (a != null) {
            return a;
        }
        String str = "unrecognized intent: ";
        String valueOf = String.valueOf(c3820u.f19148a);
        FinskyLog.m21669e(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        return C3822w.m18271a(this.f19092b.mo2738a(this.f19091a, c2495w), this.f19091a, i);
    }
}
