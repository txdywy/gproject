package com.google.android.finsky.billing.acquire.p152a;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dialogbuilder.C2797e;

final class C1677j implements OnClickListener {
    public final /* synthetic */ C2797e f8701a;
    public final /* synthetic */ C1676i f8702b;

    C1677j(C1676i c1676i, C2797e c2797e) {
        this.f8702b = c1676i;
        this.f8701a = c2797e;
    }

    public final void onClick(View view) {
        if (this.f8702b.f8699c.getVisibility() == 0) {
            this.f8702b.f8699c.setVisibility(8);
            this.f8702b.f8697a.m14902a(this.f8702b.f8698b.d, this.f8702b.f8700d, this.f8701a);
            return;
        }
        this.f8702b.f8699c.setVisibility(0);
        this.f8702b.f8697a.m14902a(this.f8702b.f8698b.e, this.f8702b.f8700d, this.f8701a);
    }
}
