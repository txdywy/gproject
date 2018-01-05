package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.h.u;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;

public class com.firebase.jobdispatcher.aa extends Service
{

    public static final Handler a;
    public final android.support.v4.h.u b;
    public final com.firebase.jobdispatcher.r c;

    static {
        com.firebase.jobdispatcher.aa.a = new Handler(Looper.getMainLooper());
    }

    aa() {
        Service();
        this.b = new android.support.v4.h.u(1);
        this.c = new com.firebase.jobdispatcher.ab(this);
    }

    public abstract boolean a();

    public abstract boolean a(com.firebase.jobdispatcher.z p0);

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

    public final IBinder onBind(Intent p0) {
        return this.c;
    }

    public final void onStart(Intent p0, int p1) {
    }

    public final int onStartCommand(Intent p0, int p1, int p2) {
        this.stopSelf(p2);
        return 2;
    }

    public final boolean onUnbind(Intent p0) {
        enter this.b;
        try {
            v1 = this.b.size() - 1;
            while (v1 >= 0) {
                v0 = this.b.remove(this.b.b(v1));
                if ((com.firebase.jobdispatcher.ae)v0 != 0) {
                    this.a();
                    ((com.firebase.jobdispatcher.ae)v0).a(2);
                }
                v1 = v1 - 1;
            }
            exit this.b;
        }
        catch (Throwable ex) {
            try {
                exit this.b;
            }
            catch (Throwable ex) {
                exit this.b;
                throw ex;
            }
            throw ex;
        }
        return super.onUnbind(p0);
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
