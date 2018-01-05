package com.google.android.libraries.performance.primes;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.performance.primes.metriccapture.C6016h;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

final class C6020t implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public final List f30078a = new CopyOnWriteArrayList();
    public final List f30079b = new CopyOnWriteArrayList();
    public final List f30080c = new CopyOnWriteArrayList();
    public final List f30081d = new CopyOnWriteArrayList();
    public final List f30082e = new CopyOnWriteArrayList();
    public final List f30083f = new CopyOnWriteArrayList();
    public final List f30084g = new CopyOnWriteArrayList();
    public final List f30085h = new CopyOnWriteArrayList();
    public final List f30086i = new CopyOnWriteArrayList();
    public final List f30087j = new CopyOnWriteArrayList();
    public Boolean f30088k;

    C6020t() {
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        C6020t.m27899a("onActivityCreated", activity.getApplicationContext());
        for (C5985h a : this.f30078a) {
            a.mo5250a();
        }
    }

    public final void onActivityStarted(Activity activity) {
        C6020t.m27899a("onActivityStarted", activity.getApplicationContext());
        m27898a(activity);
        for (C5951m a : this.f30079b) {
            a.mo5225a(activity);
        }
    }

    public final void onActivityResumed(Activity activity) {
        C6020t.m27899a("onActivityResumed", activity.getApplicationContext());
        activity.getClass().getSimpleName();
        for (C5954k b : this.f30080c) {
            b.mo5231b(activity);
        }
    }

    public final void onActivityPaused(Activity activity) {
        C6020t.m27899a("onActivityPaused", activity.getApplicationContext());
        for (C5953j a : this.f30081d) {
            a.mo5230a(activity);
        }
    }

    public final void onActivityStopped(Activity activity) {
        C6020t.m27899a("onActivityStopped", activity.getApplicationContext());
        for (C6017n a : this.f30082e) {
            a.m27893a();
        }
        m27898a(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        C6020t.m27899a("onActivitySaveInstanceState", activity.getApplicationContext());
        for (C6008l a : this.f30083f) {
            a.m27870a();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        C6020t.m27899a("onActivityDestroyed", activity.getApplicationContext());
        for (C5975i a : this.f30084g) {
            a.mo5241a(activity);
        }
    }

    public final void onTrimMemory(int i) {
        if (Log.isLoggable("AppLifecycleTracker", 2)) {
            C5989do.m27824a(2, "AppLifecycleTracker", "%s: ", "onTrimMemory", "level: " + i);
        }
        for (C5993q a : this.f30085h) {
            a.mo5256a(i);
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    private final void m27898a(Activity activity) {
        Boolean valueOf = Boolean.valueOf(C6016h.m27890b(activity.getApplicationContext()));
        if (!valueOf.equals(this.f30088k)) {
            this.f30088k = valueOf;
            if (valueOf.booleanValue()) {
                C5989do.m27824a(3, "AppLifecycleTracker", "App transition to foreground", new Object[0]);
                for (C5974p a : this.f30086i) {
                    a.mo5240a(activity);
                }
                return;
            }
            C5989do.m27824a(3, "AppLifecycleTracker", "App transition to background", new Object[0]);
            for (C5952o b : this.f30087j) {
                b.mo5226b(activity);
            }
        }
    }

    private static void m27899a(String str, Context context) {
        if (Log.isLoggable("AppLifecycleTracker", 2)) {
            C5989do.m27824a(2, "AppLifecycleTracker", "%s: ", str, Boolean.valueOf(C6016h.m27890b(context)));
        }
    }
}
