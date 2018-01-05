package com.google.android.finsky.externalreferrer;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.providers.C3947d;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class GetInstallReferrerService extends Service {
    public static final Long f15751a = Long.valueOf(0);
    public C1461c f15752b;
    public C3011c f15753c;
    public C2127b f15754d;
    public C1500a f15755e;
    public C0988c f15756f;
    public C1463g f15757g;
    public C3024o f15758h;

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
        ((C1383p) C3947d.m18649a(C1383p.class)).mo1837a(this);
        if (this.f15752b.dj().mo2294a(12639060)) {
            this.f15758h = new C3024o(this, this.f15753c, this.f15754d, this.f15755e, this.f15756f, this.f15757g);
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f15758h;
    }
}
