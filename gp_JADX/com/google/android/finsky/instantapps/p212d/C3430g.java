package com.google.android.finsky.instantapps.p212d;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.support.v4.app.ce;
import android.support.v4.app.cf;
import android.support.v4.app.cg;
import com.squareup.leakcanary.C7582R;

final class C3430g implements OnClickListener {
    public final /* synthetic */ String f17563a;
    public final /* synthetic */ String f17564b;
    public final /* synthetic */ C3425c f17565c;

    C3430g(C3425c c3425c, String str, String str2) {
        this.f17565c = c3425c;
        this.f17563a = str;
        this.f17564b = str2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f17565c.f17547b.mo5136a(2904);
        this.f17565c.f17550e.m16894a(this.f17563a);
        this.f17565c.m16971a(this.f17563a, Long.valueOf(Long.MAX_VALUE));
        dialogInterface.dismiss();
        C3425c c3425c = this.f17565c;
        String str = this.f17564b;
        CharSequence string = c3425c.f17555j.getString(C7582R.string.aia_app_disabled_notification_text, new Object[]{str});
        cg a = new cg(c3425c.f17555j).m1415a((int) C7582R.drawable.ic_play_prism);
        a.f1484B = c3425c.f17555j.getResources().getColor(C7582R.color.play_apps_primary);
        cg a2 = a.m1422a(c3425c.f17555j.getString(C7582R.string.aia_app_disabled_notification_title)).m1425b(string).m1421a(new cf().m1412b(string));
        a2.m1424a(8, true);
        a2.f1507k = 1;
        a2.f1495M.defaults = -1;
        Notification notification = a2.f1495M;
        notification.flags |= 1;
        Intent intent = new Intent("com.google.android.instantapps.SNOOZED_APPS");
        intent.setPackage("com.android.vending");
        intent.putExtra("com.google.android.finsky.instantapps.launch.gotowebdelegate.SOURCE", "gotoweb_settings_reminder_notification");
        a = a2.m1420a(new ce(C7582R.drawable.ic_settings_48px, c3425c.f17555j.getString(C7582R.string.aia_app_disable_notification_action_text), PendingIntent.getActivity(c3425c.f17555j, 0, intent, 134217728)).m1408a());
        NotificationManager notificationManager = (NotificationManager) c3425c.f17555j.getSystemService("notification");
        notificationManager.cancel(170285722);
        notificationManager.notify(170285722, a.m1414a());
        c3425c.f17547b.mo5136a(2906);
        this.f17565c.m16970a(this.f17563a);
    }
}
