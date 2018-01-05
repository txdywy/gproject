package com.google.android.gms.gcm;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import com.google.android.gms.common.util.j;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;

public class com.google.android.gms.gcm.b extends Service
{

    public final Object h;
    public int i;
    public ExecutorService j;
    public Messenger k;
    public ComponentName l;
    public com.google.android.gms.gcm.a m;
    public final String n;

    b() {
        Service();
        this.h = new Object();
        this.n = this.getClass().getName();
    }

    private final void a(int p0) {
        enter this.h;
        try {
            this.i = p0;
            if (!this.m.c(this.n))
                this.stopSelf(this.i);
            exit this.h;
            return;
            exit this.h;
        }
        catch (Throwable ex) {
            exit this.h;
            throw ex;
        }
    }

    public abstract int a(com.google.android.gms.gcm.l p0);

    final void a(com.google.android.gms.gcm.d p0) {
        try {
            this.j.execute(p0);
        }
        catch (RejectedExecutionException ex) {
            Log.e("GcmTaskService", "Executor is shutdown. onDestroy was called but main looper had an unprocessed start task message. The task will be retried with backoff delay.", ex);
            p0.a(1);
        }
    }

    final boolean a(String p0) {
        enter this.h;
        try {
            if (!this.m.a(p0, this.n))
                v0 = 1;
            else
                v0 = 0;
            if (v0 != 0) {
                v3 = this.getPackageName();
                Log.w("GcmTaskService", (String.valueOf(v3).length() + 44 + String.valueOf(p0).length()) + v3 + " " + p0 + ": Task already running, won't start another");
            }
            exit this.h;
            return v0;
            exit this.h;
        }
        catch (Throwable ex) {
            exit this.h;
            throw ex;
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
        if (p0 == 0 || (!com.google.android.gms.common.util.j.b()) || !"com.google.android.gms.gcm.ACTION_TASK_READY".equals(p0.getAction()))
            v0 = 0;
        else
            v0 = this.k.getBinder();
        return v0;
    }

    public void onCreate() {
        super.onCreate();
        this.m = com.google.android.gms.gcm.a.a(this);
        this.j = Executors.newFixedThreadPool(2, new com.google.android.gms.gcm.m());
        this.k = new Messenger(new com.google.android.gms.gcm.c(this, Looper.getMainLooper()));
        this.l = new ComponentName(this, this.getClass());
    }

    public void onDestroy() {
        super.onDestroy();
        v0 = this.j.shutdownNow();
        if (!v0.isEmpty())
            Log.e("GcmTaskService", 79 + "Shutting down, but not all tasks are finished executing. Remaining: " + v0.size());
    }

    public int onStartCommand(Intent p0, int p1, int p2) {
        if (p0 == 0)
            this.a(p2);
        else {
            try {
                p0.setExtrasClassLoader(PendingCallback.getClassLoader());
                v0 = p0.getAction();
                if ("com.google.android.gms.gcm.ACTION_TASK_READY".equals(v0)) {
                    v1 = p0.getStringExtra("tag");
                    v0 = p0.getParcelableExtra("callback");
                    p0.getParcelableArrayListExtra("triggered_uris");
                    if (!(v0 instanceof PendingCallback)) {
                        v2 = this.getPackageName();
                        Log.e("GcmTaskService", (String.valueOf(v2).length() + 47 + String.valueOf(v1).length()) + v2 + " " + v1 + ": Could not process request, invalid callback.");
                        this.a(p2);
                        return 2;
                    }
                    try {
                        if (this.a(v1)) {
                            this.a(p2);
                            return 2;
                        }
                    }
                    catch (Throwable ex) {
                        this.a(p2);
                        throw ex;
                    }
                    try {
                        this.a(new com.google.android.gms.gcm.d(this, v1, ((PendingCallback)v0).a, p0.getBundleExtra("extras")));
                    }
                    catch (Throwable ex) {
                        this.a(p2);
                        throw ex;
                    }
                }
                else {
                    try {
                        if (!"com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(v0))
                            Log.e("GcmTaskService", (String.valueOf(v0).length() + 37) + "Unknown action received " + v0 + ", terminating");
                    }
                    catch (Throwable ex) {
                        this.a(p2);
                        throw ex;
                    }
                }
            }
            catch (Throwable ex) {
                this.a(p2);
                throw ex;
            }
            this.a(p2);
        }
        return 2;
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
