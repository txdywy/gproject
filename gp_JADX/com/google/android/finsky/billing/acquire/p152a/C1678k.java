package com.google.android.finsky.billing.acquire.p152a;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.google.android.finsky.billing.acquire.C1348d;
import com.google.android.finsky.billing.p153c.C1680g;
import com.google.android.finsky.billing.p153c.C1780b;
import com.google.android.finsky.billing.p153c.C1782d;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.C2798j;
import com.google.android.finsky.dialogbuilder.p137a.C1666l;
import com.google.android.finsky.dialogbuilder.p154b.C2791f;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.layout.PlayTextView;
import com.google.wireless.android.finsky.dfe.c.a.z;
import com.squareup.leakcanary.C7582R;

public final class C1678k extends C1666l {
    public C2798j f8703a;
    public final z f8704b;
    public final C1780b f8705c;
    public final C2791f f8706d;

    public C1678k(LayoutInflater layoutInflater, z zVar, C1780b c1780b, C2791f c2791f) {
        super(layoutInflater);
        ((C1348d) C3947d.m18649a(C1348d.class)).mo1725a(this);
        this.f8704b = zVar;
        this.f8705c = c1780b;
        this.f8706d = c2791f;
    }

    public final void mo2378a(C2797e c2797e, View view) {
        EditText editText = (EditText) view.findViewById(C7582R.id.input);
        this.f8703a.m14903a(this.f8704b.a, editText, c2797e);
        C1780b c1780b = this.f8705c;
        boolean z = (c1780b.f9220e == null || c1780b.f9220e.booleanValue()) ? false : true;
        if (z) {
            PlayTextView playTextView = (PlayTextView) view.findViewById(C7582R.id.error_message);
            if (this.f8705c.f9226k) {
                this.f8703a.m14904a(this.f8704b.e, playTextView, c2797e, new Object[0]);
            } else {
                boolean z2;
                C1780b c1780b2 = this.f8705c;
                if (c1780b2.f9223h == 1100 || c1780b2.f9223h == 1003) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.f8703a.m14904a(this.f8704b.b, playTextView, c2797e, new Object[0]);
                } else if (this.f8705c.f9223h == 910) {
                    this.f8703a.m14904a(this.f8704b.c, playTextView, c2797e, new Object[0]);
                } else {
                    this.f8703a.m14904a(this.f8704b.d, playTextView, c2797e, new Object[0]);
                }
            }
        }
        if (!(this.f8704b.a == null || this.f8704b.a.d == null || !this.f8704b.a.d.d())) {
            this.f8706d.m14868a(this.f8704b.a.d.b, false);
            editText.addTextChangedListener(new C1679l(this, view));
        }
        c1780b = this.f8705c;
        C1680g c1681m = new C1681m(editText);
        c1780b.f9219d = c1681m;
        c1681m.mo2385a(c1780b.f9224i);
        if (!c1780b.f9227l) {
            new C1782d(c1780b).execute(new Void[0]);
            c1780b.f9227l = true;
        }
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_password;
    }
}
