package com.google.android.finsky.billing.iab;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.providers.C3947d;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.HashMap;
import java.util.Map;

@Deprecated
public class FirstPartyInAppBillingService extends Service {
    public C1846c f9477a = new C1847b(this);
    public C2471a f9478b;
    public C1461c f9479c;
    public C0986a f9480d;
    public final C1848d f9481e = new C1848d(this);
    public final Map f9482f = new HashMap();

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
        ((C1354a) C3947d.m18649a(C1354a.class)).mo1740a(this);
    }

    public IBinder onBind(Intent intent) {
        return this.f9481e;
    }
}
