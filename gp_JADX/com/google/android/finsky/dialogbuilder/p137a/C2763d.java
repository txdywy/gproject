package com.google.android.finsky.dialogbuilder.p137a;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.dialogbuilder.p154b.C2793j;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.br;
import com.squareup.leakcanary.C7582R;

public final class C2763d extends C1666l {
    public C2798j f15028a;
    public final br f15029b;
    public final C2793j f15030c;
    public final C2792h f15031d;

    public C2763d(LayoutInflater layoutInflater, br brVar, C2793j c2793j, C2792h c2792h) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1822a(this);
        this.f15029b = brVar;
        this.f15030c = c2793j;
        this.f15031d = c2792h;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        int i;
        CheckBox checkBox = (CheckBox) view;
        this.f15028a.m14904a(this.f15029b.b, checkBox, c2797e, new Object[0]);
        checkBox.setChecked(this.f15029b.c);
        String str = this.f15029b.e;
        if (!TextUtils.isEmpty(str) && this.f15031d.m14874c(str)) {
            checkBox.setChecked(Boolean.parseBoolean(this.f15031d.m14872b(str)));
        }
        if (checkBox.isChecked()) {
            str = this.f15029b.h;
        } else {
            str = this.f15029b.g;
        }
        OnCheckedChangeListener c2764e = new C2764e(this, c2797e);
        if (!TextUtils.isEmpty(str)) {
            this.f15030c.m14879a(str);
        }
        if ((this.f15029b.a & 8) != 0) {
            i = 1;
        } else {
            i = 0;
        }
        if (i != 0) {
            this.f15030c.m14880a(this.f15029b.g, new C2766f(checkBox, c2764e));
        }
        checkBox.setOnCheckedChangeListener(c2764e);
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_checkbox;
    }
}
