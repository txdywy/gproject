package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.play.utils.m;

final class gl implements m {
    public final /* synthetic */ TextModuleLayout f14632a;

    gl(TextModuleLayout textModuleLayout) {
        this.f14632a = textModuleLayout;
    }

    public final void m14386a(View view, String str) {
        this.f14632a.f14169n = true;
        if (this.f14632a.f14168m != null) {
            this.f14632a.f14168m.a(view, str);
        }
    }
}
