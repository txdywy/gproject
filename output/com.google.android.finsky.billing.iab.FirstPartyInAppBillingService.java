package com.google.android.finsky.billing.iab;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.IBinder;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.d.a;
import com.google.android.finsky.providers.d;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import java.util.HashMap;
import java.util.Map;

public class FirstPartyInAppBillingService extends Service
{

    public com.google.android.finsky.billing.iab.c a;
    public com.google.android.finsky.d.a b;
    public com.google.android.finsky.ba.c c;
    public com.google.android.finsky.accounts.a d;
    public final com.google.android.finsky.billing.iab.d e;
    public final Map f;

    FirstPartyInAppBillingService() {
        Service();
        this.a = new com.google.android.finsky.billing.iab.b(this);
        this.e = new com.google.android.finsky.billing.iab.d(this);
        this.f = new HashMap();
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
        return this.e;
    }

    public void onCreate() {
        super.onCreate();
        ((com.google.android.finsky.billing.iab.a)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.iab.a)).a(this);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
