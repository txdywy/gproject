package com.google.android.finsky.contentfilterui;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.android.vending.p057c.C0639b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.volley.C4774e;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.finsky.dfe.nano.bi;

public class ContentFiltersService extends Service {
    public C0988c f11491a;
    public C1287h f11492b;
    public C1463g f11493c;
    public C4774e f11494d;
    public final C0639b f11495e = new C2349m(this);

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
        ((C1367d) C3947d.m18649a(C1367d.class)).mo1786a(this);
    }

    public IBinder onBind(Intent intent) {
        return this.f11495e;
    }

    static boolean m11912a(bi[] biVarArr, int[] iArr) {
        for (bi biVar : biVarArr) {
            for (int i : iArr) {
                for (int i2 : biVar.c) {
                    if (i2 == i) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
