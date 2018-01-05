package com.google.android.finsky.inlinedetails;

import android.content.Intent;
import android.content.RestrictionsManager;
import android.os.Build.VERSION;
import com.google.android.finsky.as.C1124c;

final class C3252g implements C1124c {
    public final /* synthetic */ C3251f f16766a;

    C3252g(C3251f c3251f) {
        this.f16766a = c3251f;
    }

    public final void mo1442a(boolean z) {
        if (z) {
            if (!this.f16766a.f16758d.mo2294a(12603770) || VERSION.SDK_INT < 21) {
                this.f16766a.f16755a.startActivity(this.f16766a.f16763i.mo2763c(this.f16766a.f16755a));
                this.f16766a.f16755a.finish();
                return;
            } else if (((RestrictionsManager) this.f16766a.f16755a.getSystemService("restrictions")).hasRestrictionsProvider()) {
                Intent a = this.f16766a.f16760f.m8836a(this.f16766a.f16755a);
                if (a != null) {
                    this.f16766a.f16755a.startActivityForResult(a, 20);
                    return;
                }
            } else {
                this.f16766a.f16755a.startActivity(this.f16766a.f16763i.mo2763c(this.f16766a.f16755a));
                this.f16766a.f16755a.finish();
                return;
            }
        }
        this.f16766a.m16363a();
    }
}
