package com.google.android.finsky.contentfilterui;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.IBinder;
import com.android.vending.c.b;
import com.google.android.finsky.accounts.c;
import com.google.android.finsky.api.h;
import com.google.android.finsky.d.g;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.volley.e;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import com.google.wireless.android.finsky.dfe.nano.bi;

public class ContentFiltersService extends Service
{

    public com.google.android.finsky.accounts.c a;
    public com.google.android.finsky.api.h b;
    public com.google.android.finsky.d.g c;
    public com.google.android.finsky.volley.e d;
    public final com.android.vending.c.b e;

    ContentFiltersService() {
        Service();
        this.e = new com.google.android.finsky.contentfilterui.m(this);
    }

    static boolean a(bi[] p0, int[] p1) {
        v0 = 0;
        v3 = 0;
        while (true) {
            if (v3 >= p0.length)
                return v0;
            v2 = 0;
            while (v2 < p1.length) {
                v1 = 0;
                while (v1 < p0[v3].c.length) {
                    if (p0[v3].c[v1] == p1[v2]) {
                        v0 = 1;
                        return v0;
                    }
                    v1 = v1 + 1;
                }
                v2 = v2 + 1;
            }
            v3 = v3 + 1;
        }
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
        ((com.google.android.finsky.contentfilterui.d)com.google.android.finsky.providers.d.a(com.google.android.finsky.contentfilterui.d)).a(this);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
