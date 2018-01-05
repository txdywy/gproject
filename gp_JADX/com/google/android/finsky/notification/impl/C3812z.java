package com.google.android.finsky.notification.impl;

import android.app.Notification;
import android.app.NotificationManager;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.as.C1124c;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.notification.C2182z;
import com.google.android.finsky.notification.C3781e;

final class C3812z implements C1124c {
    public final /* synthetic */ int f19130a;
    public final /* synthetic */ Notification f19131b;
    public final /* synthetic */ C3781e f19132c;
    public final /* synthetic */ C3803r f19133d;

    C3812z(C3803r c3803r, int i, Notification notification, C3781e c3781e) {
        this.f19133d = c3803r;
        this.f19130a = i;
        this.f19131b = notification;
        this.f19132c = c3781e;
    }

    public final void mo1442a(boolean z) {
        boolean z2 = false;
        NotificationManager notificationManager = (NotificationManager) this.f19133d.f19097a.getSystemService("notification");
        if (!z) {
            notificationManager.notify(this.f19130a, this.f19131b);
            C3803r c3803r = this.f19133d;
            int i = this.f19130a;
            for (int i2 = 0; i2 < c3803r.f19099e.size(); i2++) {
                ((C2182z) c3803r.f19099e.get(i2)).mo2770a(i);
            }
            if (C1473m.f7980a.dj().mo2294a(12637790)) {
                C3803r c3803r2 = this.f19133d;
                boolean z3 = (C1503a.m8831b(c3803r2.f19097a) || C1503a.m8830a(c3803r2.f19097a) || C1503a.m8833d(c3803r2.f19097a)) ? false : true;
                if (z3 && this.f19132c.f18987a.f18996h != 2) {
                    ((au) this.f19133d.f19101g.mo1a()).f19030a.m18086a(this.f19132c);
                }
            }
        }
        C3781e c3781e = this.f19132c;
        if (!z) {
            z2 = true;
        }
        C3803r.m18175a(c3781e, z2);
    }
}
