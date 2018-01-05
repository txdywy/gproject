package com.google.android.gms.gcm;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.util.C5155j;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class C0946b extends Service {
    public final Object f5754h = new Object();
    public int f5755i;
    public ExecutorService f5756j;
    public Messenger f5757k;
    public ComponentName f5758l;
    public C5195a f5759m;
    public final String f5760n = getClass().getName();

    private final void m5694a(int i) {
        synchronized (this.f5754h) {
            this.f5755i = i;
            if (!this.f5759m.m23976c(this.f5760n)) {
                stopSelf(this.f5755i);
            }
        }
    }

    public abstract int mo1162a(C5205l c5205l);

    final boolean m5697a(String str) {
        boolean z;
        synchronized (this.f5754h) {
            z = !this.f5759m.m23973a(str, this.f5760n);
            if (z) {
                String packageName = getPackageName();
                Log.w("GcmTaskService", new StringBuilder((String.valueOf(packageName).length() + 44) + String.valueOf(str).length()).append(packageName).append(" ").append(str).append(": Task already running, won't start another").toString());
            }
        }
        return z;
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

    public IBinder onBind(Intent intent) {
        return (intent != null && C5155j.m23889b() && "com.google.android.gms.gcm.ACTION_TASK_READY".equals(intent.getAction())) ? this.f5757k.getBinder() : null;
    }

    public void onCreate() {
        super.onCreate();
        this.f5759m = C5195a.m23967a((Context) this);
        this.f5756j = Executors.newFixedThreadPool(2, new C5206m());
        this.f5757k = new Messenger(new C5196c(this, Looper.getMainLooper()));
        this.f5758l = new ComponentName(this, getClass());
    }

    public void onDestroy() {
        super.onDestroy();
        List shutdownNow = this.f5756j.shutdownNow();
        if (!shutdownNow.isEmpty()) {
            Log.e("GcmTaskService", "Shutting down, but not all tasks are finished executing. Remaining: " + shutdownNow.size());
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            m5694a(i2);
        } else {
            try {
                intent.setExtrasClassLoader(PendingCallback.class.getClassLoader());
                String action = intent.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(action)) {
                    String stringExtra = intent.getStringExtra("tag");
                    Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                    Bundle bundleExtra = intent.getBundleExtra("extras");
                    intent.getParcelableArrayListExtra("triggered_uris");
                    if (!(parcelableExtra instanceof PendingCallback)) {
                        String packageName = getPackageName();
                        Log.e("GcmTaskService", new StringBuilder((String.valueOf(packageName).length() + 47) + String.valueOf(stringExtra).length()).append(packageName).append(" ").append(stringExtra).append(": Could not process request, invalid callback.").toString());
                    } else if (m5697a(stringExtra)) {
                        m5694a(i2);
                    } else {
                        m5696a(new C5197d(this, stringExtra, ((PendingCallback) parcelableExtra).f26224a, bundleExtra));
                    }
                } else if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(action)) {
                    Log.e("GcmTaskService", new StringBuilder(String.valueOf(action).length() + 37).append("Unknown action received ").append(action).append(", terminating").toString());
                }
                m5694a(i2);
            } finally {
                m5694a(i2);
            }
        }
        return 2;
    }

    public void setTheme(int i) {
        super.setTheme(i);
        C6331c.m28984a((Context) this, i);
    }

    final void m5696a(C5197d c5197d) {
        try {
            this.f5756j.execute(c5197d);
        } catch (Throwable e) {
            Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", e);
            c5197d.m23979a(1);
        }
    }
}
