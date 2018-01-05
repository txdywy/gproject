package com.google.android.finsky.updatechecker.impl;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ar.C1502a;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.updatechecker.C2239c;
import com.google.android.finsky.updatechecker.C4638a;
import com.google.android.finsky.updatechecker.C4640d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.a.a.a.a.aa;

public final class ReschedulerUsingAlarmManager implements C4638a {
    public final Context f23854a;
    public final C4661t f23855b;

    public class CheckWifiAndAutoUpdate extends Service implements C2239c {
        public C2471a f23852a;
        public C4661t f23853b;

        public Context createConfigurationContext(Configuration configuration) {
            return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
        }

        public AssetManager getAssets() {
            return C6331c.m28986b(this);
        }

        public Resources getResources() {
            return C6331c.m28981a(this);
        }

        public Theme getTheme() {
            return C6331c.m28987c(this);
        }

        public void setTheme(int i) {
            super.setTheme(i);
            C6331c.m28984a((Context) this, i);
        }

        public int onStartCommand(Intent intent, int i, int i2) {
            ((C1448f) C3947d.m18649a(C1448f.class)).mo1967a(this);
            C2495w a = this.f23852a.m13179a(intent.getExtras());
            if (this.f23853b.m21650b()) {
                FinskyLog.m21659a("Checking wifi: disabled, will check wifi again later.", new Object[0]);
                C4661t c4661t = this.f23853b;
                aa aaVar = new aa();
                aaVar.a |= 32768;
                aaVar.q = true;
                aaVar.b(c4661t.m21649a());
                aaVar.c(c4661t.m21650b());
                aaVar.a(false);
                a.m13367a(new C2474c(131).m13214a(aaVar).m13244b("wifi_checker").m13217a(c4661t.f23996g.m8828a()));
                ReschedulerUsingAlarmManager.m21597a(getApplicationContext(), a);
                stopSelf();
            } else {
                this.f23853b.m21648a(new C4648g(this, a));
            }
            return 2;
        }

        public IBinder onBind(Intent intent) {
            return null;
        }

        public final void mo2827a(boolean z) {
            stopSelf();
        }
    }

    public ReschedulerUsingAlarmManager(Context context, C2266a c2266a, C2206c c2206c, C3646a c3646a, C1627b c1627b, C4640d c4640d, C1502a c1502a, C3960a c3960a) {
        this.f23855b = new C4661t(context, c2266a, c2206c, c3646a, c1627b, c4640d, c1502a, c3960a);
        this.f23854a = context;
    }

    public final boolean mo4312a() {
        return (this.f23855b.f23994e.m9312b() || this.f23855b.m21650b()) ? false : true;
    }

    public final void mo4311a(C2495w c2495w) {
        ((AlarmManager) this.f23854a.getSystemService("alarm")).cancel(m21598b(this.f23854a, null));
        FinskyLog.m21659a("Canceling auto-update wifi check.", new Object[0]);
        m21597a(this.f23854a, c2495w);
        if (this.f23855b.m21650b()) {
            FinskyLog.m21659a("Checking wifi: disabled, will check wifi again later.", new Object[0]);
            C4661t c4661t = this.f23855b;
            aa aaVar = new aa();
            aaVar.a |= 32768;
            aaVar.q = true;
            aaVar.b(c4661t.m21649a());
            aaVar.c(c4661t.m21650b());
            aaVar.a(false);
            c2495w.m13367a(new C2474c(131).m13214a(aaVar).m13244b("wifi_checker").m13217a(c4661t.f23996g.m8828a()));
        }
    }

    @SuppressLint({"flib.log.FormatArgMismatch"})
    static void m21597a(Context context, C2495w c2495w) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b = m21598b(context, c2495w);
        Long l = (Long) C0955b.dp.m28964b();
        if (l.longValue() > 0) {
            alarmManager.set(3, SystemClock.elapsedRealtime() + l.longValue(), b);
        }
        FinskyLog.m21659a("Scheduling recheck in %d MS", l);
    }

    static PendingIntent m21598b(Context context, C2495w c2495w) {
        Intent intent = new Intent(context, CheckWifiAndAutoUpdate.class);
        if (c2495w != null) {
            Bundle bundle = new Bundle();
            c2495w.m13377a(bundle);
            intent.putExtras(bundle);
        }
        return PendingIntent.getService(context, 0, intent, 0);
    }
}
