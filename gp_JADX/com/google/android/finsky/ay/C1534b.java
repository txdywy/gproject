package com.google.android.finsky.ay;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.utils.am;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class C1534b extends Service {
    public C3982a f8269a;

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
        ((C1344a) C3947d.m18649a(C1344a.class)).mo1710a(this);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f8269a.mo3875b()) {
            try {
                startForeground(C3982a.f20072a, this.f8269a.mo3880g());
            } catch (Throwable e) {
                am.m21704a(e, "Emergency self update service failed to use foreground.");
            }
            this.f8269a.mo3878e();
            stopForeground(true);
            stopSelf();
        } else {
            am.m21705b("Emergency self update service started, but not in recovery mode!");
            stopSelf();
        }
        return 2;
    }
}
