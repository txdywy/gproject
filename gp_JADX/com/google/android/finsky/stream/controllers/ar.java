package com.google.android.finsky.stream.controllers;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;

final class ar implements ActivityLifecycleCallbacks {
    public final C3748a f21744a;
    public final Document f21745b;
    public final C2495w f21746c;
    public final Handler f21747d = new Handler(Looper.getMainLooper());
    public final Application f21748e;

    ar(C3748a c3748a, Document document, C2495w c2495w, Application application) {
        this.f21744a = c3748a;
        this.f21745b = document;
        this.f21746c = c2495w;
        this.f21748e = application;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        this.f21748e.unregisterActivityLifecycleCallbacks(this);
        this.f21747d.post(new as(this));
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }
}
