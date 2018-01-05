package com.google.android.finsky.appdiscoveryservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.v4.p037h.C0305a;
import com.google.android.finsky.appdiscoveryservice.p128b.C1317i;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.aj;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.concurrent.Executor;

public class AppDiscoveryService extends Service {
    public C1461c f7739a;
    public Executor f7740b;
    public C1317i f7741c;
    public C1333o f7742d;
    public C2471a f7743e;
    public PackageManager f7744f;
    public C1330l f7745g;

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
        ((C1332n) C3947d.m18649a(C1332n.class)).mo1708a(this);
        this.f7745g = new C1330l(this, this.f7740b, this.f7741c, new C0305a(), this.f7739a, this.f7742d, this.f7743e, this.f7744f);
    }

    public IBinder onBind(Intent intent) {
        int i = (intent.getAction() == null || !intent.getAction().equals("com.android.vending.appdiscoveryservice.IAppDiscoveryService.BIND")) ? 0 : 1;
        if (i == 0) {
            FinskyLog.m21662b("Received invalid intent in onBind. Intent: %s", intent);
            return null;
        } else if (!this.f7739a.dj().mo2294a(12628776)) {
            return (IBinder) aj.m21700a(this.f7745g);
        } else {
            FinskyLog.m21662b("App attempted to bind AppDiscoveryService after kill switch flipped", new Object[0]);
            return null;
        }
    }
}
