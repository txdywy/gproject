package com.google.android.finsky.layout.play;

import android.os.Bundle;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.p111d.C2495w;

public final class C3718z implements Runnable {
    public final /* synthetic */ MainActivity f18802a;
    public final /* synthetic */ Bundle f18803b;
    public final /* synthetic */ C2495w f18804c;
    public final /* synthetic */ FinskyDrawerLayout f18805d;

    public C3718z(FinskyDrawerLayout finskyDrawerLayout, MainActivity mainActivity, Bundle bundle, C2495w c2495w) {
        this.f18805d = finskyDrawerLayout;
        this.f18802a = mainActivity;
        this.f18803b = bundle;
        this.f18804c = c2495w;
    }

    public final void run() {
        if (!this.f18805d.ap) {
            this.f18805d.m17531a(this.f18802a, this.f18803b, this.f18804c);
        }
    }
}
