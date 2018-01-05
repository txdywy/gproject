package com.google.android.finsky.p140i.p205a;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.google.android.finsky.aa.C0955b;

final class C3215c implements ActivityLifecycleCallbacks {
    public final /* synthetic */ C3213a f16541a;

    C3215c(C3213a c3213a) {
        this.f16541a = c3213a;
    }

    public final void onActivityResumed(Activity activity) {
        C3213a c3213a = this.f16541a;
        c3213a.f16537i++;
        c3213a.m16263b();
    }

    public final void onActivityPaused(Activity activity) {
        C3213a c3213a = this.f16541a;
        c3213a.f16537i--;
        c3213a.f16529a.removeCallbacks(c3213a.f16530b);
        c3213a.f16529a.postDelayed(c3213a.f16530b, ((Long) C0955b.gm.m28964b()).longValue());
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        int i = activity.getResources().getConfiguration().orientation;
        if (this.f16541a.f16539k == 0) {
            this.f16541a.f16539k = i;
        }
        this.f16541a.f16534f = this.f16541a.f16539k != i;
        this.f16541a.f16539k = i;
        m16264a();
    }

    public final void onActivityStarted(Activity activity) {
        m16264a();
        if (this.f16541a.f16533e) {
            this.f16541a.f16532d.dc().m13335l();
        }
        C3213a c3213a = this.f16541a;
        c3213a.f16536h++;
        this.f16541a.f16534f = false;
    }

    private final void m16264a() {
        if (this.f16541a.f16533e && !this.f16541a.f16535g && !this.f16541a.f16534f) {
            this.f16541a.f16532d.dc().m13334k();
            this.f16541a.f16535g = true;
        }
    }

    public final void onActivityStopped(Activity activity) {
        C3213a c3213a = this.f16541a;
        c3213a.f16536h--;
        if (this.f16541a.f16536h == 0) {
            this.f16541a.f16535g = false;
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
    }
}
