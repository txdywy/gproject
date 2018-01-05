package com.google.android.finsky.detailspage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.detailspage.TextModule.ExpandedData;
import com.google.android.finsky.p111d.C2475d;
import com.squareup.leakcanary.C7582R;

final class di implements OnClickListener {
    public final /* synthetic */ dg f14422a;

    di(dg dgVar) {
        this.f14422a = dgVar;
    }

    public final void onClick(View view) {
        this.f14422a.J.m13379b(new C2475d(this.f14422a).m13256a(1868));
        dg dgVar = this.f14422a;
        if (dgVar.z.mo3700d()) {
            ExpandedData expandedData = new ExpandedData();
            expandedData.f14123a = ((dj) dgVar.b).f14423a.f14885a.f12099f;
            expandedData.f14124b = dgVar.t.getString(C7582R.string.preregistration_terms_and_conditions_title);
            expandedData.f14125c = dgVar.mo3069b();
            expandedData.f14126d = 3;
            dgVar.z.mo3630a(14, null, cd.m14024a(expandedData, dgVar.v, dgVar.J), false, new View[0]);
        }
    }
}
