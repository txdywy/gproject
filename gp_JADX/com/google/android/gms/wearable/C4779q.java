package com.google.android.gms.wearable;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public class C4779q extends Service {
    public ComponentName f24747a;
    public C5656s f24748b;
    public IBinder f24749c;
    public Intent f24750d;
    public Looper f24751e;
    public final Object f24752f = new Object();
    public boolean f24753g;

    public void mo4383a(C5616d c5616d) {
    }

    public void mo4384a(C5650l c5650l) {
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

    public final IBinder onBind(Intent intent) {
        return "com.google.android.gms.wearable.BIND_LISTENER".equals(intent.getAction()) ? this.f24749c : null;
    }

    public void onCreate() {
        super.onCreate();
        this.f24747a = new ComponentName(this, getClass().getName());
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.f24747a);
            Log.d("WearableLS", new StringBuilder(String.valueOf(valueOf).length() + 10).append("onCreate: ").append(valueOf).toString());
        }
        if (this.f24751e == null) {
            HandlerThread handlerThread = new HandlerThread("WearableListenerService");
            handlerThread.start();
            this.f24751e = handlerThread.getLooper();
        }
        this.f24748b = new C5656s(this, this.f24751e);
        this.f24750d = new Intent("com.google.android.gms.wearable.BIND_LISTENER");
        this.f24750d.setComponent(this.f24747a);
        this.f24749c = new C5657t(this);
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    public void onDestroy() {
        if (Log.isLoggable("WearableLS", 3)) {
            String valueOf = String.valueOf(this.f24747a);
            Log.d("WearableLS", new StringBuilder(String.valueOf(valueOf).length() + 11).append("onDestroy: ").append(valueOf).toString());
        }
        synchronized (this.f24752f) {
            this.f24753g = true;
            if (this.f24748b == null) {
                String valueOf2 = String.valueOf(this.f24747a);
                throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf2).length() + 111).append("onDestroy: mServiceHandler not set, did you override onCreate() but forget to call super.onCreate()? component=").append(valueOf2).toString());
            }
            C5656s c5656s = this.f24748b;
            c5656s.getLooper().quit();
            c5656s.m26840a("quit");
        }
        super.onDestroy();
    }
}
