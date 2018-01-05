package com.google.android.finsky.contentfilterui;

import android.widget.Toast;
import com.squareup.leakcanary.C7582R;

final class C2340f implements Runnable {
    public final /* synthetic */ C2339e f11521a;

    C2340f(C2339e c2339e) {
        this.f11521a = c2339e;
    }

    public final void run() {
        if (this.f11521a.m610k()) {
            Toast.makeText(this.f11521a.m601g(), C7582R.string.settings_saved, 0).show();
            if (this.f11521a.at()) {
                this.f11521a.f730B.mo293d();
            } else {
                this.f11521a.O_();
            }
        }
    }
}
