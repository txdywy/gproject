package com.google.android.finsky.family.remoteescalation;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.familycommon.FamilyEducationCard;
import com.google.android.finsky.stream.base.C1169s;
import com.google.wireless.android.finsky.dfe.h.a.ab;
import com.google.wireless.android.finsky.dfe.nano.gq;
import com.squareup.leakcanary.C7582R;

public final class C3090f extends C1169s implements OnClickListener {
    public ab f16021a;

    public final int mo1508a() {
        return this.f16021a == null ? 0 : 1;
    }

    public final int mo1509a(int i) {
        return C7582R.layout.family_education_card;
    }

    public final void mo1510a(View view, int i) {
        ((FamilyEducationCard) view).m15887a(0, this.f16021a.c, this.f16021a.d, this.f16021a.e, this);
    }

    public final void mo1511b(View view, int i) {
    }

    public final void onClick(View view) {
        C2910a au = C1473m.f7980a.au();
        String cZ = C1473m.f7980a.cZ();
        gq gqVar = new gq();
        gqVar.d = 3;
        gqVar.a |= 1;
        au.m15187a(cZ, gqVar, 4, null, null);
        this.f16021a = null;
        this.C.mo4088b(this, 0, 1);
    }
}
