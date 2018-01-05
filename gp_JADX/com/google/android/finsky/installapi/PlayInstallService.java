package com.google.android.finsky.installapi;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.di.C2748d;
import com.google.android.finsky.providers.C3947d;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class PlayInstallService extends Service {
    public C3273h f16773a;
    public C3270d f16774b;
    public C2748d f16775c;

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
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1855a(this);
        this.f16773a = new C3273h(this, this.f16774b, this.f16775c);
    }

    public IBinder onBind(Intent intent) {
        return this.f16773a;
    }
}
