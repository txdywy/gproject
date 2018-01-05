package com.google.android.finsky.settings;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.billing.common.C1789d;

final class C4094c implements OnClickListener {
    public final /* synthetic */ C4092a f20504a;

    C4094c(C4092a c4092a) {
        this.f20504a = c4092a;
    }

    public final void onClick(View view) {
        this.f20504a.m19039a(6331);
        if (!((Boolean) C1789d.f9316c.m5760a()).booleanValue()) {
            C1789d.f9316c.m5763a(Boolean.TRUE);
        }
    }
}
