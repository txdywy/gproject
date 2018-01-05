package com.google.android.finsky.splitinstallservice;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.finsky.providers.C3947d;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import p000c.p001a.C0000a;

public class SplitInstallService extends Service {
    public C0000a f21134a;
    public C4215q f21135b;

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
        ((aq) C3947d.m18649a(aq.class)).mo1911a(this);
        this.f21135b = (C4215q) this.f21134a.mo1a();
        C4215q c4215q = this.f21135b;
        c4215q.f21270j.m19583a();
        c4215q.f21277q = new Handler(Looper.getMainLooper());
    }

    public IBinder onBind(Intent intent) {
        return this.f21135b;
    }
}
