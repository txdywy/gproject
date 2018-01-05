package com.google.android.finsky.billing.profile;

import android.support.v4.app.Fragment;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.finsky.a.a.bg;
import com.google.wireless.android.finsky.dfe.nano.v;

final class C2058o implements OnClickListener {
    public final /* synthetic */ v f10570a;
    public final /* synthetic */ C2495w f10571b;
    public final /* synthetic */ ad f10572c;
    public final /* synthetic */ C2056m f10573d;

    C2058o(C2056m c2056m, v vVar, C2495w c2495w, ad adVar) {
        this.f10573d = c2056m;
        this.f10570a = vVar;
        this.f10571b = c2495w;
        this.f10572c = adVar;
    }

    public final void onClick(View view) {
        if (this.f10573d.as == null) {
            this.f10573d.as = this.f10570a.e;
            this.f10571b.m13379b(new C2475d(this.f10572c).m13256a(816).m13258a(this.f10570a.g));
            Fragment fragment = this.f10573d;
            bg bgVar = this.f10570a.j;
            byte[] bArr = this.f10570a.g;
            C2495w c2495w = this.f10571b;
            fragment.ax = bArr;
            fragment.startActivityForResult(fragment.f10565g.mo2639a(fragment.aw.name, bgVar.d, c2495w), 5);
        }
    }
}
