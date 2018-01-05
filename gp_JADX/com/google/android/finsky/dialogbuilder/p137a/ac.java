package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.C2814m;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.dc;
import com.google.wireless.android.finsky.dfe.c.a.de;
import com.squareup.leakcanary.C7582R;

public final class ac extends C1666l {
    public C2798j f15014a;
    public final dc f15015b;
    public final C2792h f15016c;

    public ac(LayoutInflater layoutInflater, dc dcVar, C2792h c2792h) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1819a(this);
        this.f15015b = dcVar;
        this.f15016c = c2792h;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        Integer valueOf;
        Spinner spinner = (Spinner) view;
        String b = this.f15016c.m14872b(this.f15015b.d);
        if (b != null) {
            for (int i = 0; i < this.f15015b.c.length; i++) {
                if (b.equals(this.f15015b.c[i])) {
                    valueOf = Integer.valueOf(i);
                    break;
                }
            }
        }
        valueOf = null;
        spinner.setOnItemSelectedListener(new ad(c2797e, this.f15016c, this.f15015b, valueOf));
        C2798j c2798j = this.f15014a;
        de[] deVarArr = this.f15015b.b;
        if (deVarArr.length != 0) {
            SpinnerAdapter c2814m = new C2814m(c2798j, spinner.getContext(), deVarArr, c2797e);
            c2814m.setDropDownViewResource(17367049);
            spinner.setAdapter(c2814m);
        }
        if (valueOf != null) {
            spinner.setSelection(valueOf.intValue());
        }
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_spinner;
    }
}
