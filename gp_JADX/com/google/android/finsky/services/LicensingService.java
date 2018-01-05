package com.google.android.finsky.services;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.RemoteException;
import com.android.vending.licensing.C0645a;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class LicensingService extends Service {
    public C4077k f20418a;

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
        this.f20418a = new C4077k(this, C1473m.f7980a.aK());
    }

    public IBinder onBind(Intent intent) {
        return this.f20418a;
    }

    static void m18993a(C0645a c0645a, int i, String str, String str2) {
        try {
            c0645a.mo1052a(i, str, str2);
        } catch (RemoteException e) {
            FinskyLog.m21667d("Unable to send license information", new Object[0]);
        }
    }
}
