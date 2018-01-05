package com.google.android.finsky.installqueue.p141a;

import android.text.TextUtils;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.InstallConstraint;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class ab implements Runnable {
    public final C3342k f17180a;
    public final InstallRequest f17181b;

    ab(C3342k c3342k, InstallRequest installRequest) {
        this.f17180a = c3342k;
        this.f17181b = installRequest;
    }

    public final void run() {
        String str;
        String str2;
        C3342k c3342k = this.f17180a;
        InstallRequest installRequest = this.f17181b;
        FinskyLog.m21659a("Requesting install for %s", installRequest);
        InstallConstraint installConstraint = (InstallConstraint) installRequest.f17172b.get(0);
        C3300k c3300k = (C3300k) c3342k.f17214c.mo1a();
        c3300k.mo3440a(installRequest.f17171a.f17133c, installRequest.m16702a().f17270d.f17161b, installRequest.m16702a().f17270d.f17162c, installRequest.m16702a().f17270d.f17163d);
        c3300k.mo3439a(installRequest.f17171a.f17133c, installRequest.f17171a.f17142l);
        if (installRequest.f17171a.f17143m) {
            c3300k.mo3454h(installRequest.f17171a.f17133c);
        }
        if (installRequest.f17171a.f17144n) {
            c3300k.mo3451e(installRequest.f17171a.f17133c);
        }
        if (installRequest.f17171a.f17146p != null) {
            c3300k.mo3437a(installRequest.f17171a.f17133c, installRequest.f17171a.f17146p);
        }
        switch (installConstraint.f17169b.f17119c) {
            case 1:
                c3300k.mo3431a(installRequest.f17171a.f17133c);
                break;
            case 2:
                c3300k.mo3444b(installRequest.f17171a.f17133c);
                break;
            default:
                FinskyLog.m21669e("Constraint has unexpected network type: %d", Integer.valueOf(installConstraint.f17169b.f17119c));
                break;
        }
        if (installConstraint.f17169b.f17123g == 0) {
            c3300k.mo3452f(installRequest.f17171a.f17133c);
        }
        if (installConstraint.f17169b.f17124h == 0) {
            c3300k.mo3456j(installRequest.f17171a.f17133c);
        }
        if (installConstraint.f17169b.f17126j < 100) {
            c3300k.mo3453g(installRequest.f17171a.f17133c);
        }
        if (installConstraint.f17169b.f17127k == 0) {
            c3300k.mo3455i(installRequest.f17171a.f17133c);
        }
        C2495w a = ((C2471a) c3342k.f17218g.mo1a()).m13183a(installRequest.f17171a.f17132b);
        if (TextUtils.isEmpty(installRequest.f17171a.f17147q)) {
            str = a.f13432b;
        } else {
            str = installRequest.f17171a.f17147q;
        }
        String str3 = installRequest.f17171a.f17133c;
        int i = installRequest.f17171a.f17134d;
        if (TextUtils.isEmpty(installRequest.f17171a.f17137g)) {
            str2 = null;
        } else {
            str2 = installRequest.f17171a.f17137g;
        }
        c3300k.mo3435a(str3, i, str2, installRequest.f17171a.f17138h, installConstraint.f17169b.f17122f, installRequest.f17171a.f17139i, installRequest.f17171a.f17140j, installRequest.f17171a.f17141k, a, str, installRequest.f17171a);
    }
}
