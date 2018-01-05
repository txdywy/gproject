package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.layout.DateSpinner;
import com.google.android.finsky.dialogbuilder.p154b.C2788c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.layout.PlayTextView;
import com.google.wireless.android.finsky.dfe.c.a.bw;
import com.squareup.leakcanary.C7582R;

public final class C2771j extends C1666l {
    public C2798j f15047a;
    public final bw f15048b;
    public final C2788c f15049c;
    public DateSpinner f15050d;
    public PlayTextView f15051e;

    public C2771j(LayoutInflater layoutInflater, bw bwVar, C2788c c2788c) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1825a(this);
        this.f15048b = bwVar;
        this.f15049c = c2788c;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        this.f15050d = (DateSpinner) view.findViewById(C7582R.id.date_spinner);
        this.f15051e = (PlayTextView) view.findViewById(C7582R.id.error_message);
        if (this.f15049c.f15083c != null) {
            this.f15050d.setCalendarDate(this.f15049c.f15083c);
        } else {
            this.f15047a.m14904a(this.f15048b.b, this.f15051e, c2797e, new Object[0]);
        }
        this.f15050d.setOnDateChangedListener(new C2772k(this));
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_datespinner;
    }
}
