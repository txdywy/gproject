package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public final class cl implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final cl f25812a = new cl();
    public final AtomicBoolean f25813b = new AtomicBoolean();
    public final AtomicBoolean f25814c = new AtomicBoolean();
    public final ArrayList f25815d = new ArrayList();
    public boolean f25816e = false;

    private cl() {
    }

    private final void m23548a(boolean z) {
        synchronized (f25812a) {
            ArrayList arrayList = this.f25815d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((cm) obj).mo4579a(z);
            }
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f25813b.compareAndSet(true, false);
        this.f25814c.set(true);
        if (compareAndSet) {
            m23548a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.f25813b.compareAndSet(true, false);
        this.f25814c.set(true);
        if (compareAndSet) {
            m23548a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.f25813b.compareAndSet(false, true)) {
            this.f25814c.set(true);
            m23548a(true);
        }
    }
}
