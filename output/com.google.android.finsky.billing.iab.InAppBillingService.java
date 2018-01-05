package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.IBinder;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.providers.d;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import com.google.wireless.android.a.a.a.a.bk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InAppBillingService extends Service
{

    public static final com.google.android.finsky.billing.iab.x a;
    public static final com.google.android.finsky.billing.iab.x b;
    public com.google.android.finsky.ba.c c;
    public com.google.android.finsky.billing.iab.w d;
    public com.google.android.finsky.d.a e;
    public final com.google.android.finsky.billing.iab.s f;
    public final Map g;
    public boolean h;
    public com.google.android.finsky.billing.iab.q i;
    public com.google.android.finsky.billing.iab.p j;
    public com.google.android.finsky.billing.iab.r k;

    static {
        InAppBillingService.a = com.google.android.finsky.billing.iab.x.d;
        InAppBillingService.b = com.google.android.finsky.billing.iab.x.g;
    }

    InAppBillingService() {
        Service();
        this.f = new com.google.android.finsky.billing.iab.s(this);
        this.g = new HashMap();
        this.i = new com.google.android.finsky.billing.iab.m();
        this.j = new com.google.android.finsky.billing.iab.n(this);
        this.k = new com.google.android.finsky.billing.iab.o(this);
    }

    private final void a(Account p0, Throwable p1, String p2, int p3) {
        this.a(p0, p1, p2, p3, 0);
    }

    private final void a(Account p0, Throwable p1, String p2, int p3, com.google.wireless.android.a.a.a.a.bk p4) {
        v0 = new com.google.android.finsky.d.c(p3).a(p1).c(p2).a(InAppBillingService.b.l);
        if (!this.c.dj().a(12641356))
            v0.f(Arrays.toString(p1.getStackTrace()));
        if (p4 != 0)
            v0.a(p4);
        this.a(p2).a(p0).a(v0.a, 0);
    }

    static void a(InAppBillingService p0, Account p1, Throwable p2, String p3, int p4) {
        p0.a(p1, p2, p3, p4);
    }

    static void a(InAppBillingService p0, Account p1, Throwable p2, String p3, int p4, com.google.wireless.android.a.a.a.a.bk p5) {
        p0.a(p1, p2, p3, p4, p5);
    }

    final com.google.android.finsky.billing.iab.x a(String p0, Account p1, int p2) {
        if (p1 == 0)
            v0 = 0;
        else
            v0 = this.c.j(p1.name);
        return com.google.android.finsky.billing.iab.w.a(p0, this, p2, v0);
    }

    final com.google.android.finsky.d.w a(String p0) {
        v0 = (com.google.android.finsky.d.w)this.g.get(p0);
        if (v0 == 0) {
            v0 = this.k.a();
            this.g.put(p0, v0);
        }
        return v0;
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
        if (p0 != 0 && "dp-1".equals(p0.getStringExtra("libraryVersion")))
            this.h = 1;
        else
            this.h = 0;
        return this.f;
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
