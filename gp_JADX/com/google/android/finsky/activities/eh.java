package com.google.android.finsky.activities;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.dfemodel.C2712a;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.ad;

final class eh implements OnClickListener {
    public final /* synthetic */ String f6705a;
    public final /* synthetic */ ad f6706b;
    public final /* synthetic */ ef f6707c;

    eh(ef efVar, String str, ad adVar) {
        this.f6707c = efVar;
        this.f6705a = str;
        this.f6706b = adVar;
    }

    public final void onClick(View view) {
        int i;
        C3748a c3748a = this.f6707c.bp;
        String str = this.f6707c.ai.f12779f;
        String str2 = this.f6705a;
        C2712a c2712a = this.f6707c.aj;
        if (c2712a.m14707c()) {
            i = c2712a.f14908a.f14885a.f12099f;
        } else {
            i = 0;
        }
        c3748a.mo3673a(str, str2, i, 0, this.f6707c.k_, this.f6706b, this.f6707c.bw);
    }
}
