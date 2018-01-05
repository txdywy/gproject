package com.google.android.finsky.activities;

import android.content.Intent;
import android.content.RestrictionsManager;
import android.os.Build.VERSION;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.as.C1124c;

final class C1125o implements C1124c {
    public final /* synthetic */ boolean f7083a;
    public final /* synthetic */ C1036b f7084b;

    C1125o(C1036b c1036b, boolean z) {
        this.f7084b = c1036b;
        this.f7083a = z;
    }

    public final void mo1442a(boolean z) {
        if (z) {
            if (!C1473m.f7980a.dj().mo2294a(12603770) || VERSION.SDK_INT < 21) {
                this.f7084b.startActivity(C1473m.f7980a.bo().mo2763c(this.f7084b));
                this.f7084b.finish();
                return;
            } else if (((RestrictionsManager) this.f7084b.getSystemService("restrictions")).hasRestrictionsProvider()) {
                Intent a = C1473m.f7980a.mo2037Q().m8836a(this.f7084b);
                if (a != null) {
                    this.f7084b.startActivityForResult(a, 24);
                    return;
                }
            } else {
                this.f7084b.startActivity(C1473m.f7980a.bo().mo2763c(this.f7084b));
                this.f7084b.finish();
                return;
            }
        }
        this.f7084b.m6066f(this.f7083a);
    }
}
