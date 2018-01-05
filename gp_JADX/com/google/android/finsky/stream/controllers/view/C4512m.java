package com.google.android.finsky.stream.controllers.view;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.google.android.finsky.utils.C4682m;

final class C4512m implements ActivityLifecycleCallbacks {
    public final /* synthetic */ JpkrHighlightsBannerClusterView f23116a;

    C4512m(JpkrHighlightsBannerClusterView jpkrHighlightsBannerClusterView) {
        this.f23116a = jpkrHighlightsBannerClusterView;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        if (activity == C4682m.m21821a(this.f23116a.getContext(), Activity.class)) {
            this.f23116a.m21019c();
        }
    }

    public final void onActivityPaused(Activity activity) {
        this.f23116a.m21020d();
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }
}
