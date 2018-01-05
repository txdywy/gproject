package com.google.android.finsky.av;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;

final class C1528b implements OnClickListener {
    public final /* synthetic */ C2495w f8234a;
    public final /* synthetic */ ad f8235b;
    public final /* synthetic */ C3300k f8236c;
    public final /* synthetic */ String f8237d;
    public final /* synthetic */ View f8238e;

    C1528b(C2495w c2495w, ad adVar, C3300k c3300k, String str, View view) {
        this.f8234a = c2495w;
        this.f8235b = adVar;
        this.f8236c = c3300k;
        this.f8237d = str;
        this.f8238e = view;
    }

    public final void onClick(View view) {
        this.f8234a.m13379b(new C2475d(this.f8235b).m13256a(2911));
        this.f8236c.mo3462p(this.f8237d);
        this.f8238e.setVisibility(8);
    }
}
