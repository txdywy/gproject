package com.google.android.gms.ads.p239b;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.IBinder;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class C4066d extends Service {
    public volatile int f20411a = -1;
    public ExecutorService f20412b;
    public IBinder f20413c;
    public final Object f20414d = new Object();
    public boolean f20415e;

    public abstract void mo3899a(C4893b c4893b);

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

    public final IBinder onBind(Intent intent) {
        return "com.google.android.gms.ads.identifier.BIND_LISTENER".equals(intent.getAction()) ? this.f20413c : null;
    }

    public void onCreate() {
        super.onCreate();
        this.f20412b = Executors.newSingleThreadExecutor();
        this.f20413c = new C4895e(this);
    }

    public void onDestroy() {
        synchronized (this.f20414d) {
            this.f20415e = true;
            this.f20412b.shutdown();
        }
        super.onDestroy();
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }
}
