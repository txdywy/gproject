package com.google.android.finsky.dialogbuilder.p137a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.p154b.C2791f;
import com.google.android.finsky.dialogbuilder.p154b.C2792h;
import com.google.android.finsky.providers.C3947d;
import com.google.wireless.android.finsky.dfe.c.a.cv;
import com.squareup.leakcanary.C7582R;

public final class aa extends C1666l {
    public C2798j f15005a;
    public final cv f15006b;
    public final C2792h f15007c;
    public final C2791f f15008d;

    public aa(LayoutInflater layoutInflater, cv cvVar, C2792h c2792h, C2791f c2791f) {
        super(layoutInflater);
        ((C1379m) C3947d.m18649a(C1379m.class)).mo1818a(this);
        this.f15006b = cvVar;
        this.f15007c = c2792h;
        this.f15008d = c2791f;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        RadioGroup radioGroup = (RadioGroup) view;
        if ((this.f15006b.a & 4) != 0) {
            this.f15008d.m14868a(this.f15006b.e, false);
        }
        int i = 0;
        while (i < this.f15006b.b.length) {
            RadioButton radioButton = (RadioButton) this.f.inflate(C7582R.layout.viewcomponent_radiobutton, radioGroup, false);
            this.f15005a.m14904a(this.f15006b.b[i].c, radioButton, c2797e, new Object[0]);
            radioButton.setOnCheckedChangeListener(new ab(this.f15006b, i, this.f15007c, this.f15008d));
            radioGroup.addView(radioButton);
            if (((this.f15006b.a & 2) != 0) && i == this.f15006b.d) {
                radioGroup.check(radioButton.getId());
            }
            if (this.f15006b.b[i].d != null) {
                TextView textView = (TextView) this.f.inflate(C7582R.layout.viewcomponent_text, radioGroup, false);
                this.f15005a.m14904a(this.f15006b.b[i].d, textView, c2797e, new Object[0]);
                radioGroup.addView(textView);
            }
            i++;
        }
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_radiogroup;
    }
}
