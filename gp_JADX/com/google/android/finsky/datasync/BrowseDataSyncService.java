package com.google.android.finsky.datasync;

import android.accounts.Account;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.dp.C2866c;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.dfe.api.C1460g;
import com.google.android.play.dfe.api.C6287d;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class BrowseDataSyncService extends Service {
    public int f13456a;
    public boolean f13457b;
    public C0986a f13458c;
    public C1287h f13459d;
    public C1463g f13460e;
    public C1460g f13461f;
    public C2866c f13462g;

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
        ((C1374t) C3947d.m18649a(C1374t.class)).mo1796a(this);
        super.onCreate();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f13460e.dc().m13319a(new C2474c(531).f13342a, null);
        FinskyLog.m21659a("Fetch browse data initiated", new Object[0]);
        for (Account account : this.f13458c.mo1188d()) {
            Account account2;
            C1254c a = this.f13459d.mo2016a(account2.name);
            C6287d a2 = this.f13461f.mo2019a(account2);
            this.f13456a++;
            if (!(a == null || a.mo1620b() == null)) {
                Object obj;
                account2 = a.mo1620b();
                if (TextUtils.isEmpty(account2.name)) {
                    obj = null;
                } else {
                    obj = (String) C0954a.aR.m5777b(account2.name).m5760a();
                }
                if (TextUtils.isEmpty(obj)) {
                    this.f13462g.m15108a(a, false, false, new C2525k(this, a));
                } else {
                    m13402a(obj, a);
                }
                if (a2 != null) {
                    this.f13456a++;
                    a2.mo5377a(new C2526l(this), new C2527m(this), false);
                }
            }
        }
        return 2;
    }

    final void m13402a(String str, C1254c c1254c) {
        c1254c.mo1584a(str, new C2528n(this), new C2529o(this));
    }
}
