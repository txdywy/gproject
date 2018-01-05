package com.google.android.finsky.ay;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.IBinder;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.recoverymode.a;
import com.google.android.finsky.utils.am;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class com.google.android.finsky.ay.b extends Service
{

    public com.google.android.finsky.recoverymode.a a;

    b() {
        Service();
    }

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    public IBinder onBind(Intent p0) {
        return 0;
    }

    public void onCreate() {
        super.onCreate();
        ((com.google.android.finsky.ay.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.ay.a)).a(this);
    }

    public int onStartCommand(Intent p0, int p1, int p2) {
        if (this.a.b()) {
            try {
                this.startForeground(com.google.android.finsky.recoverymode.a.a, this.a.g());
            }
            catch (Exception ex) {
                com.google.android.finsky.utils.am.a(ex, "Emergency self update service failed to use foreground.");
            }
            this.a.e();
            this.stopForeground(1);
            this.stopSelf();
        }
        else {
            com.google.android.finsky.utils.am.b("Emergency self update service started, but not in recovery mode!");
            this.stopSelf();
        }
        return 2;
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
