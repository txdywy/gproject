package com.google.android.finsky.stream.controllers.assist.security;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.p254g.p255a.C4319f;

final class ah extends C4319f {
    public final ad f21793a;
    public C4317u f21794b;

    ah(ad adVar) {
        this.f21793a = adVar;
    }

    public final void mo4122a(boolean z, Bundle bundle) {
        if (z && this.f21794b != null) {
            ad adVar = this.f21793a;
            new Handler(Looper.getMainLooper()).post(new ai(this, new ae(bundle, adVar.f21783b, adVar.f21785d)));
        }
    }
}
