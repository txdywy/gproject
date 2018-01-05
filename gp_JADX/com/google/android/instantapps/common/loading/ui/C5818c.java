package com.google.android.instantapps.common.loading.ui;

import android.support.v4.app.Fragment;

final /* synthetic */ class C5818c implements Runnable {
    public final C5816a f29280a;

    C5818c(C5816a c5816a) {
        this.f29280a = c5816a;
    }

    public final void run() {
        Fragment fragment = this.f29280a;
        Object obj = (!fragment.m610k() || fragment.f738J || fragment.f746R == null || fragment.f746R.getWindowToken() == null || fragment.f746R.getVisibility() != 0) ? null : 1;
        if (obj != null) {
            fragment.f29275b.setVisibility(8);
        }
    }
}
