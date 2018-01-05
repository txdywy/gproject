package com.google.android.finsky.layoutswitcher;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.cf.C2272b;
import p002a.C0002a;

public final class C3739j implements OnClickListener {
    public C0002a f18880a;
    public final ErrorIndicatorWithNotifyLayout f18881b;

    public C3739j(ErrorIndicatorWithNotifyLayout errorIndicatorWithNotifyLayout, C0002a c0002a) {
        this.f18881b = errorIndicatorWithNotifyLayout;
        this.f18880a = c0002a;
    }

    public final void onClick(View view) {
        C0954a.f5809E.m5763a(Boolean.TRUE);
        ((C2272b) this.f18880a.mo1a()).m11730a();
        this.f18881b.m17612a(C3735c.m17615a(2, 0));
    }
}
