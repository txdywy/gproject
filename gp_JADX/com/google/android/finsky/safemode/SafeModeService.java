package com.google.android.finsky.safemode;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.dc.C1465m;
import com.google.android.finsky.de.C2568a;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.am;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class SafeModeService extends Service {
    public C2568a f20122a;
    public C1287h f20123b;
    public C3982a f20124c;
    public C1465m f20125d;
    public C1461c f20126e;
    public C2471a f20127f;

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

    public void onCreate() {
        super.onCreate();
        ((C1412a) C3947d.m18649a(C1412a.class)).mo1897a(this);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f20124c.mo3875b()) {
            try {
                startForeground(C3982a.f20072a, this.f20124c.mo3880g());
            } catch (Throwable e) {
                am.m21704a(e, "Safe mode service failed to use foreground.");
            }
            boolean z = !((Boolean) C0955b.ga.m28964b()).booleanValue();
            C1254c a = z ? this.f20123b.mo2015a() : this.f20123b.mo2017b();
            if (a == null) {
                m18754a();
            } else {
                this.f20122a.m13571a(a, C2693e.m14552a(), new C4010b(this, z, a));
            }
        } else {
            am.m21705b("Safe mode service started, but not in recovery mode!");
            stopSelf();
        }
        return 2;
    }

    final void m18754a() {
        this.f20124c.mo3878e();
        stopForeground(true);
        stopSelf();
    }
}
