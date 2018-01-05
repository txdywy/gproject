package com.firebase.jobdispatcher;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.p037h.C0304u;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;

public abstract class aa extends Service {
    public static final Handler f4648a = new Handler(Looper.getMainLooper());
    public final C0304u f4649b = new C0304u(1);
    public final C0734r f4650c = new ab(this);

    public abstract boolean mo3883a();

    public abstract boolean mo3884a(C0751z c0751z);

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

    public final int onStartCommand(Intent intent, int i, int i2) {
        stopSelf(i2);
        return 2;
    }

    public final IBinder onBind(Intent intent) {
        return this.f4650c;
    }

    public final boolean onUnbind(Intent intent) {
        synchronized (this.f4649b) {
            for (int size = this.f4649b.size() - 1; size >= 0; size--) {
                ae aeVar = (ae) this.f4649b.remove(this.f4649b.m1629b(size));
                if (aeVar != null) {
                    mo3883a();
                    aeVar.m4818a(2);
                }
            }
        }
        return super.onUnbind(intent);
    }

    public final void onStart(Intent intent, int i) {
    }
}
