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
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1613m;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.utils.C4671b;
import com.squareup.leakcanary.C7582R;

public final class cb implements bz {
    public final Service f20910a;
    public final NotificationManager f20911b = ((NotificationManager) this.f20910a.getSystemService("notification"));
    public final C2171b f20912c;
    public final al f20913d;
    public boolean f20914e = C4671b.m21788e();

    public cb(Service service, C2171b c2171b, al alVar) {
        this.f20910a = service;
        this.f20912c = c2171b;
        this.f20913d = alVar;
    }

    public final synchronized void mo3963a(int i, int i2, int i3) {
        if (i3 <= 0) {
            m19387b();
        } else if (i + i2 >= i3) {
            r1 = m19385a();
            r2 = this.f20910a.getResources();
            PendingIntent service = PendingIntent.getService(this.f20910a, 0, this.f20913d.mo3933c(this.f20910a), 268435456);
            int i4 = i + i2;
            if (i2 == 0) {
                r0 = r2.getString(C7582R.string.b_and_r_installed_x_of_y, new Object[]{Integer.valueOf(i), Integer.valueOf(i4)});
            } else {
                r0 = r2.getString(C7582R.string.b_and_r_installed_x_of_y_with_failures, new Object[]{Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i2)});
            }
            r1.m1422a(r2.getString(C7582R.string.b_and_r_setup_completed)).m1415a((int) C7582R.drawable.stat_notify_installed).m1425b(r0).m1419a(service).m1423a(true);
            Notification a = r1.m1414a();
            m19387b();
            this.f20911b.notify(-555892993, a);
        } else {
            r1 = m19385a();
            r2 = this.f20910a.getResources();
            int i5 = i + i2;
            if (i2 == 0) {
                r0 = r2.getString(C7582R.string.b_and_r_installed_x_of_y, new Object[]{Integer.valueOf(i), Integer.valueOf(i3)});
            } else {
                r0 = r2.getString(C7582R.string.b_and_r_installed_x_of_y_with_failures, new Object[]{Integer.valueOf(i), Integer.valueOf(i3), Integer.valueOf(i2)});
            }
            r1.m1422a(r2.getString(C7582R.string.b_and_r_button_setup)).m1416a(i3, i5).m1415a(17301633).m1425b(r0).m1424a(2, true);
            m19386a(r1.m1414a());
        }
    }

    public final synchronized void mo3964a(int i, long j) {
        if (i <= 0) {
            m19387b();
        } else {
            cg a = m19385a();
            Resources resources = this.f20910a.getResources();
            int b = C1608h.m9251b(3);
            Bitmap decodeResource = BitmapFactory.decodeResource(resources, C7582R.drawable.ic_no_wifi);
            CharSequence string = resources.getString(C7582R.string.b_and_r_paused_notification_text_with_size, new Object[]{C1613m.m9289a(j, resources)});
            cg a2 = a.m1422a(resources.getString(C7582R.string.b_and_r_paused_notification_title)).m1415a((int) C7582R.drawable.ic_play_store);
            a2.f1484B = C0216d.m1116c(this.f20910a, b);
            a2.f1504h = decodeResource;
            a2.m1425b(string).m1424a(2, true);
            a.m1417a(0, this.f20910a.getResources().getString(C7582R.string.b_and_r_paused_notification_data_button), PendingIntent.getService(this.f20910a, 0, this.f20913d.mo3931b(this.f20910a), 268435456));
            m19386a(a.m1414a());
        }
    }

    private final cg m19385a() {
        cg cgVar = new cg(this.f20910a);
        PendingIntent activity = PendingIntent.getActivity(this.f20910a, -555892993, this.f20912c.mo2734a(this.f20910a), 268435456);
        cgVar.f1484B = this.f20910a.getResources().getColor(C7582R.color.restore_notification);
        cgVar.f1485C = 0;
        cgVar.f1519w = true;
        cgVar.f1522z = "status";
        cgVar.f1501e = activity;
        return cgVar;
    }

    private final void m19386a(Notification notification) {
        if (this.f20914e) {
            this.f20910a.startForeground(-555892993, notification);
        } else {
            this.f20911b.notify(-555892993, notification);
        }
    }

    private final synchronized void m19387b() {
        if (this.f20914e) {
            this.f20910a.stopForeground(true);
        } else {
            this.f20911b.cancel(-555892993);
        }
    }
}
