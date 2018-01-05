package com.google.android.finsky.family.remoteescalation;

import android.support.v7.p045f.C0443j;
import android.support.v7.p045f.C0445b;
import android.support.v7.p045f.C0447d;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.wireless.android.finsky.dfe.h.a.ac;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;

public final class C3088d extends C3087j implements OnClickListener, C3086g {
    public C3088d(C3091h c3091h, C3748a c3748a, C2495w c2495w, ad adVar) {
        super(c3091h, c3748a, c2495w, adVar);
    }

    public final int mo1508a() {
        return this.h.size();
    }

    public final int mo1509a(int i) {
        return C7582R.layout.family_remote_escalation_flat_card_view;
    }

    public final void mo1510a(View view, int i) {
        ((RemoteEscalationFlatCard) view).m15794a((ac) this.h.get(i), this);
    }

    public final void mo3306a(com.google.wireless.android.finsky.dfe.h.a.ad adVar) {
        C0447d c3089e = new C3089e(this, this.h, mo1508a());
        this.g = adVar;
        this.h = new ArrayList(Arrays.asList(adVar.d));
        C0445b.m2665a(c3089e).m2678a((C0443j) this);
    }

    final boolean mo3307a(ac acVar) {
        throw new UnsupportedOperationException();
    }
}
