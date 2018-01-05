package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.p154b.C2788c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4683n;
import com.google.android.play.layout.PlayTextView;
import com.google.wireless.android.finsky.dfe.c.a.bv;
import com.google.wireless.android.finsky.dfe.c.a.de;
import com.squareup.leakcanary.C7582R;
import java.util.Calendar;
import java.util.GregorianCalendar;

public final class C2770i extends C1666l {
    public C2798j f15044a;
    public final bv f15045b;
    public final C2788c f15046c;

    public C2770i(LayoutInflater layoutInflater, bv bvVar, C2788c c2788c) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1824a(this);
        this.f15045b = bvVar;
        this.f15046c = c2788c;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        int i;
        C2798j c2798j = this.f15044a;
        de deVar = this.f15045b.b;
        PlayTextView playTextView = (PlayTextView) view;
        Object[] objArr = new Object[1];
        C2788c c2788c = this.f15046c;
        long j = this.f15045b.c;
        if (c2788c.f15083c == null) {
            i = -1;
        } else {
            Calendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTimeInMillis(j);
            i = C4683n.m21822a(c2788c.f15083c, gregorianCalendar);
        }
        objArr[0] = Integer.valueOf(i);
        c2798j.m14904a(deVar, playTextView, c2797e, objArr);
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_text;
    }
}
