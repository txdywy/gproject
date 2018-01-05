package com.google.android.finsky.billing;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.CheckBox;
import android.widget.RadioButton;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.p111d.C2474c;
import com.google.wireless.android.a.a.a.a.an;

final class C1872k implements OnClickListener {
    public final /* synthetic */ RadioButton f9568a;
    public final /* synthetic */ RadioButton f9569b;
    public final /* synthetic */ CheckBox f9570c;
    public final /* synthetic */ int f9571d;
    public final /* synthetic */ C1835g f9572e;

    C1872k(C1835g c1835g, RadioButton radioButton, RadioButton radioButton2, CheckBox checkBox, int i) {
        this.f9572e = c1835g;
        this.f9568a = radioButton;
        this.f9569b = radioButton2;
        this.f9570c = checkBox;
        this.f9571d = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9572e.m9864a(6328);
        int i2 = this.f9568a.isChecked() ? 3 : this.f9569b.isChecked() ? 4 : 1;
        boolean isChecked = this.f9570c.isChecked();
        an anVar = new an();
        anVar.a(this.f9571d);
        anVar.b(i2);
        anVar.a |= 4;
        anVar.d = isChecked;
        C2474c c2474c = new C2474c(2002);
        c2474c.m13219a(anVar);
        this.f9572e.ah.m13367a(c2474c);
        if (isChecked) {
            C1789d.f9315b.m5763a(Integer.valueOf(i2));
        } else {
            C1789d.f9315b.m5763a(Integer.valueOf(2));
        }
        if (!((Boolean) C1789d.f9316c.m5760a()).booleanValue()) {
            C1789d.f9316c.m5763a(Boolean.TRUE);
        }
        this.f9572e.mo968W().mo2499a(i2, isChecked);
    }
}
