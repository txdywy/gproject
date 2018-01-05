package com.google.android.finsky.appdiscoveryservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.IBinder;
import android.support.v4.h.a;
import com.google.android.finsky.appdiscoveryservice.b.i;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.a;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aj;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import java.util.concurrent.Executor;

public class AppDiscoveryService extends Service
{

    public com.google.android.finsky.ba.c a;
    public Executor b;
    public com.google.android.finsky.appdiscoveryservice.b.i c;
    public com.google.android.finsky.appdiscoveryservice.o d;
    public com.google.android.finsky.d.a e;
    public PackageManager f;
    public com.google.android.finsky.appdiscoveryservice.l g;

    AppDiscoveryService() {
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
        v0 = 0;
        if (p0.getAction() != 0 && p0.getAction().equals("com.android.vending.appdiscoveryservice.IAppDiscoveryService.BIND"))
            v1 = 1;
        else
            v1 = 0;
        if (v1 == 0) {
            v2 = new Object[1];
            v2[0] = p0;
            FinskyLog.b("Received invalid intent in onBind. Intent: %s", v2);
        }
        else if (this.a.dj().a(12628776))
            FinskyLog.b("App attempted to bind AppDiscoveryService after kill switch flipped", new Object[0]);
        else
            v0 = (IBinder)com.google.android.finsky.utils.aj.a(this.g);
        return v0;
    }

    public void onCreate() {
        ((com.google.android.finsky.appdiscoveryservice.n)com.google.android.finsky.providers.d.a(com.google.android.finsky.appdiscoveryservice.n)).a(this);
        this.g = new com.google.android.finsky.appdiscoveryservice.l(this, this.b, this.c, new android.support.v4.h.a(), this.a, this.d, this.e, this.f);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
