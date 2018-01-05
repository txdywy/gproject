package com.google.android.finsky.heterodyne;

import android.accounts.Account;
import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.phenotype.core.p176c.C3168b;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class HeterodyneSyncService extends IntentService {
    public Context f16397a;
    public C3170c f16398b;
    public C0986a f16399c;
    public C2471a f16400d;

    public HeterodyneSyncService() {
        super("HeterodyneSyncService");
    }

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
        ((C1390e) C3947d.m18649a(C1390e.class)).mo1850a(this);
    }

    protected void onHandleIntent(Intent intent) {
        int i = 0;
        FinskyLog.m21659a("Triggered Heterodyne Sync.", new Object[0]);
        C3168b a = this.f16398b.m16168a(this, this.f16400d.m13179a(intent.getExtras()));
        String packageName = this.f16397a.getPackageName();
        Account[] d = this.f16399c.mo1188d();
        String[] strArr = new String[d.length];
        while (i < d.length) {
            strArr[i] = d[i].name;
            i++;
        }
        a.m16156a(packageName, strArr);
    }
}
