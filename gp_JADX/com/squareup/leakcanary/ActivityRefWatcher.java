package com.squareup.leakcanary;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

public final class ActivityRefWatcher {
    public final Application application;
    public final ActivityLifecycleCallbacks lifecycleCallbacks = new C75561();
    public final RefWatcher refWatcher;

    class C75561 implements ActivityLifecycleCallbacks {
        C75561() {
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
            ActivityRefWatcher.this.onActivityDestroyed(activity);
        }
    }

    @Deprecated
    public static void installOnIcsPlus(Application application, RefWatcher refWatcher) {
        install(application, refWatcher);
    }

    public static void install(Application application, RefWatcher refWatcher) {
        new ActivityRefWatcher(application, refWatcher).watchActivities();
    }

    public ActivityRefWatcher(Application application, RefWatcher refWatcher) {
        this.application = (Application) Preconditions.checkNotNull(application, "application");
        this.refWatcher = (RefWatcher) Preconditions.checkNotNull(refWatcher, "refWatcher");
    }

    final void onActivityDestroyed(Activity activity) {
        this.refWatcher.watch(activity);
    }

    public final void watchActivities() {
        stopWatchingActivities();
        this.application.registerActivityLifecycleCallbacks(this.lifecycleCallbacks);
    }

    public final void stopWatchingActivities() {
        this.application.unregisterActivityLifecycleCallbacks(this.lifecycleCallbacks);
    }
}
