package com.google.firebase.iid;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Binder;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.support.v4.a.w;
import android.util.Log;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class C7127f extends Service {
    public final ExecutorService f34836d = Executors.newSingleThreadExecutor();
    public Binder f34837e;
    public final Object f34838f = new Object();
    public int f34839g;
    public int f34840h = 0;

    public boolean mo6017a(Intent intent) {
        return false;
    }

    public abstract void mo6018b(Intent intent);

    protected Intent mo6019c(Intent intent) {
        return intent;
    }

    public Context createConfigurationContext(Configuration configuration) {
        return VERSION.SDK_INT >= 17 ? new e(super.createConfigurationContext(configuration)) : null;
    }

    final void m32362d(Intent intent) {
        if (intent != null) {
            w.a(intent);
        }
        synchronized (this.f34838f) {
            this.f34840h--;
            if (this.f34840h == 0) {
                stopSelfResult(this.f34839g);
            }
        }
    }

    public AssetManager getAssets() {
        return c.b(this);
    }

    public Resources getResources() {
        return c.a(this);
    }

    public Theme getTheme() {
        return c.c(this);
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f34837e == null) {
            this.f34837e = new C7136j(this);
        }
        return this.f34837e;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.f34838f) {
            this.f34839g = i2;
            this.f34840h++;
        }
        Intent c = mo6019c(intent);
        if (c == null) {
            m32362d(intent);
            return 2;
        } else if (mo6017a(c)) {
            m32362d(intent);
            return 2;
        } else {
            this.f34836d.execute(new C7133g(this, c, intent));
            return 3;
        }
    }

    public void setTheme(int i) {
        super.setTheme(i);
        c.a(this, i);
    }
}
