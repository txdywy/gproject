package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.utils.C4678i;

final class fd implements OnClickListener {
    public final /* synthetic */ fa f6782a;

    fd(fa faVar) {
        this.f6782a = faVar;
    }

    public final void onClick(View view) {
        this.f6782a.m626a(false);
        C0954a.bk.m5763a(Long.valueOf(C4678i.m21812a() + fa.ak));
        ad adVar = this.f6782a;
        adVar.ap.m13379b(new C2475d(adVar).m13256a(2936));
    }
}
