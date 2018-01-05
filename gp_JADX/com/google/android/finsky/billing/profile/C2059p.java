package com.google.android.finsky.billing.profile;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.finsky.dfe.nano.v;

final class C2059p implements OnClickListener {
    public final /* synthetic */ v f10574a;
    public final /* synthetic */ C2495w f10575b;
    public final /* synthetic */ ad f10576c;
    public final /* synthetic */ byte[] f10577d;
    public final /* synthetic */ C2056m f10578e;

    C2059p(C2056m c2056m, v vVar, C2495w c2495w, ad adVar, byte[] bArr) {
        this.f10578e = c2056m;
        this.f10574a = vVar;
        this.f10575b = c2495w;
        this.f10576c = adVar;
        this.f10577d = bArr;
    }

    public final void onClick(View view) {
        if (this.f10578e.as == null) {
            this.f10578e.as = this.f10574a.e;
            this.f10575b.m13379b(new C2475d(this.f10576c).m13256a(817).m13258a(this.f10574a.g));
            Fragment fragment = this.f10578e;
            byte[] bArr = this.f10577d;
            byte[] bArr2 = this.f10574a.k;
            byte[] bArr3 = this.f10574a.g;
            C2495w c2495w = this.f10575b;
            fragment.ax = bArr3;
            fragment.f10563e.mo2593a(fragment, fragment.aw.name, bArr, bArr2, fragment.aj, c2495w, fragment.av);
        }
    }
}
