package com.google.android.finsky.billing.profile;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.finsky.a.a.ao;

public final class C2060q implements OnClickListener {
    public final /* synthetic */ ao f10579a;
    public final /* synthetic */ C2495w f10580b;
    public final /* synthetic */ ad f10581c;
    public final /* synthetic */ C2056m f10582d;

    public C2060q(C2056m c2056m, ao aoVar, C2495w c2495w, ad adVar) {
        this.f10582d = c2056m;
        this.f10579a = aoVar;
        this.f10580b = c2495w;
        this.f10581c = adVar;
    }

    public final void onClick(View view) {
        if (this.f10582d.as == null) {
            this.f10582d.as = this.f10579a.d;
            this.f10580b.m13379b(new C2475d(this.f10581c).m13256a(819).m13258a(this.f10579a.v));
            this.f10582d.m10817a(this.f10579a.t, this.f10582d.al.e, this.f10579a.v, this.f10580b);
        }
    }
}
