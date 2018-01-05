package com.google.android.finsky.setup;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.cg;
import android.support.v4.p028a.C0216d;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1613m;
import com.google.android.finsky.utils.C4671b;
import com.squareup.leakcanary.C7582R;

public final class az {
    public final Service f20820a;
    public final NotificationManager f20821b = ((NotificationManager) this.f20820a.getSystemService("notification"));
    public boolean f20822c = C4671b.m21788e();

    public az(Service service) {
        this.f20820a = service;
    }

    public final synchronized void m19239a(int i, int i2) {
        if (i2 <= 0) {
            m19238b();
        } else if (i == i2) {
            r0 = m19236a();
            r1 = this.f20820a.getResources();
            r0.m1422a(r1.getString(C7582R.string.b_and_r_setup_completed)).m1415a((int) C7582R.drawable.stat_notify_installed).m1425b(r1.getString(C7582R.string.b_and_r_installed_x_of_y, new Object[]{Integer.valueOf(i2), Integer.valueOf(i2)})).m1419a(PendingIntent.getService(this.f20820a, 0, C1473m.f7980a.cK().mo3933c(this.f20820a), 268435456));
            Notification a = r0.m1414a();
            m19238b();
            this.f20821b.notify(-555892993, a);
        } else {
            r0 = m19236a();
            r1 = this.f20820a.getResources();
            r0.m1422a(r1.getString(C7582R.string.b_and_r_button_setup)).m1416a(i2, i).m1415a(17301633).m1425b(r1.getString(C7582R.string.b_and_r_installed_x_of_y, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)})).m1424a(2, true);
            m19237a(r0.m1414a());
        }
    }

    public final synchronized void m19240a(int i, long j) {
        if (i <= 0) {
            m19238b();
        } else {
            cg a = m19236a();
            Resources resources = this.f20820a.getResources();
            int b = C1608h.m9251b(3);
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, C7582R.drawable.ic_no_wifi);
            CharSequence string = resources.getString(C7582R.string.b_and_r_paused_notification_text_with_size, new Object[]{C1613m.m9289a(j, resources)});
            cg a2 = a.m1422a(resources.getString(C7582R.string.b_and_r_paused_notification_title)).m1415a((int) C7582R.drawable.ic_play_store);
            a2.f1484B = C0216d.m1116c(this.f20820a, b);
            a2.f1504h = decodeResource;
            a2.m1425b(string).m1424a(2, true);
            a.m1417a(0, this.f20820a.getResources().getString(C7582R.string.b_and_r_paused_notification_data_button), PendingIntent.getService(this.f20820a, 0, C1473m.f7980a.cK().mo3931b(this.f20820a), 268435456));
            m19237a(a.m1414a());
        }
    }

    private final cg m19236a() {
        cg cgVar = new cg(this.f20820a);
        PendingIntent activity = PendingIntent.getActivity(this.f20820a, -555892993, C1473m.f7980a.bo().mo2734a(this.f20820a), 268435456);
        cgVar.f1484B = this.f20820a.getResources().getColor(C7582R.color.restore_notification);
        cgVar.f1485C = 0;
        cgVar.f1519w = true;
        cgVar.f1522z = "status";
        cgVar.f1501e = activity;
        return cgVar;
    }

    private final void m19237a(Notification notification) {
        if (this.f20822c) {
            this.f20820a.startForeground(-555892993, notification);
        } else {
            this.f20821b.notify(-555892993, notification);
        }
    }

    private final synchronized void m19238b() {
        if (this.f20822c) {
            this.f20820a.stopForeground(true);
        } else {
            this.f20821b.cancel(-555892993);
        }
    }
}
