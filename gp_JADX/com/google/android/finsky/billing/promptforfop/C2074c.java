package com.google.android.finsky.billing.promptforfop;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;

final class C2074c implements OnClickListener {
    public final /* synthetic */ C2073b f10618a;

    C2074c(C2073b c2073b) {
        this.f10618a = c2073b;
    }

    public final void onClick(View view) {
        this.f10618a.af.m13379b(new C2475d(this.f10618a).m13256a(1008));
        C2070e al = this.f10618a.al();
        if (al != null) {
            al.mo2612o();
        }
    }
}
