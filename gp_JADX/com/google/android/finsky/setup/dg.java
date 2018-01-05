package com.google.android.finsky.setup;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.support.v4.app.cg;
import android.support.v4.p028a.C0216d;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;
import com.squareup.leakcanary.C7582R;

final class dg implements dp {
    public final /* synthetic */ VpaService f21065a;

    dg(VpaService vpaService) {
        this.f21065a = vpaService;
    }

    public final void mo3935a(String str, ee[] eeVarArr, ef[] efVarArr) {
        if (eeVarArr != null) {
            C4174g a = this.f21065a.f20703d.m19495a(eeVarArr);
            if (a.f21089a.isEmpty()) {
                FinskyLog.m21659a("Updating %d preloads in lieu of deferred PAI notification.", Integer.valueOf(a.f21090b.size()));
                this.f21065a.m19150a(str, a.f21090b);
            } else {
                Context context = this.f21065a;
                C2162a c2162a = this.f21065a.f20710k;
                bn bnVar = this.f21065a.f20716q;
                cg cgVar = new cg(context);
                Resources resources = context.getResources();
                int b = C1608h.m9251b(3);
                PendingIntent activity = PendingIntent.getActivity(context, 0, bnVar.mo3942a(str, eeVarArr, efVarArr), 268435456);
                PendingIntent service = PendingIntent.getService(context, 0, c2162a.mo2708b(context.getApplicationContext(), VpaService.class, "playsetupservice", "installdefault"), 268435456);
                cgVar.f1484B = C0216d.m1116c(context, b);
                cgVar.f1485C = 0;
                cgVar.f1519w = true;
                cgVar.f1522z = "sys";
                cg b2 = cgVar.m1415a((int) C7582R.drawable.stat_notify_update).m1422a(resources.getString(C7582R.string.vpa_install_notification_title)).m1425b(resources.getString(C7582R.string.vpa_install_notification_text));
                b2.f1501e = activity;
                b2.m1424a(2, true);
                b2.m1417a(0, resources.getString(C7582R.string.vpa_install_notification_review_button), activity).m1417a(0, resources.getString(C7582R.string.vpa_install_notification_install_all_button), service);
                ((NotificationManager) context.getSystemService("notification")).notify(-555892737, cgVar.m1414a());
            }
        }
        VpaService vpaService = this.f21065a;
        bb.m21791a();
        if (vpaService.f20719t == 0 && !vpaService.f20720u && VpaService.f20697b == 0) {
            vpaService.stopForeground(true);
            vpaService.m19149a(1);
            vpaService.stopSelf(vpaService.f20718s);
        }
    }
}
