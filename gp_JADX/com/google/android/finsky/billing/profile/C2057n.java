package com.google.android.finsky.billing.profile;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.finsky.dfe.nano.v;

final class C2057n implements OnClickListener {
    public final /* synthetic */ v f10566a;
    public final /* synthetic */ C2495w f10567b;
    public final /* synthetic */ ad f10568c;
    public final /* synthetic */ C2056m f10569d;

    C2057n(C2056m c2056m, v vVar, C2495w c2495w, ad adVar) {
        this.f10569d = c2056m;
        this.f10566a = vVar;
        this.f10567b = c2495w;
        this.f10568c = adVar;
    }

    public final void onClick(View view) {
        if (this.f10569d.as == null) {
            this.f10569d.as = this.f10566a.e;
            this.f10567b.m13379b(new C2475d(this.f10568c).m13256a(815).m13258a(this.f10566a.g));
            Fragment fragment = this.f10569d;
            byte[] bArr = this.f10566a.g;
            C2495w c2495w = this.f10567b;
            fragment.ax = bArr;
            c2495w.m13376a(fragment.ak);
            fragment.startActivityForResult(fragment.ak, 4);
        }
    }
}
