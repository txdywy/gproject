package com.google.android.finsky.billing.iab;

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
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.a.a.a.a.bk;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class InAppBillingService extends Service {
    public static final C1868x f9483a = C1868x.RESULT_BILLING_UNAVAILABLE;
    public static final C1868x f9484b = C1868x.RESULT_ERROR;
    public C1461c f9485c;
    public C1867w f9486d;
    public C2471a f9487e;
    public final C1863s f9488f = new C1863s(this);
    public final Map f9489g = new HashMap();
    public boolean f9490h;
    public C1857q f9491i = new C1858m();
    public C1859p f9492j = new C1860n(this);
    public C1861r f9493k = new C1862o(this);

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
        ((C1354a) C3947d.m18649a(C1354a.class)).mo1741a(this);
    }

    public IBinder onBind(Intent intent) {
        if (intent == null || !"dp-1".equals(intent.getStringExtra("libraryVersion"))) {
            this.f9490h = false;
        } else {
            this.f9490h = true;
        }
        return this.f9488f;
    }

    final C1868x m9914a(String str, Account account, int i) {
        return C1867w.m9983a(str, (Context) this, i, account == null ? null : this.f9485c.mo2249j(account.name));
    }

    final C2495w m9915a(String str) {
        C2495w c2495w = (C2495w) this.f9489g.get(str);
        if (c2495w != null) {
            return c2495w;
        }
        c2495w = this.f9493k.mo2476a();
        this.f9489g.put(str, c2495w);
        return c2495w;
    }

    private final void m9910a(Account account, Throwable th, String str, int i) {
        m9911a(account, th, str, i, null);
    }

    private final void m9911a(Account account, Throwable th, String str, int i, bk bkVar) {
        C2474c a = new C2474c(i).m13238a(th).m13247c(str).m13210a(f9484b.f9566l);
        if (!this.f9485c.dj().mo2294a(12641356)) {
            a.m13253f(Arrays.toString(th.getStackTrace()));
        }
        if (bkVar != null) {
            a.m13223a(bkVar);
        }
        m9915a(str).m13366a(account).m13371a(a.f13342a, null);
    }
}
