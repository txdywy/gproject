package com.google.android.finsky.billing.acquire.p152a;

import android.os.CancellationSignal;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.billing.p130b.C1763d;
import com.google.android.finsky.billing.p131e.C1673i;
import com.google.android.finsky.billing.p131e.C1818f;
import com.google.android.finsky.dialogbuilder.C2797e;
import com.google.android.finsky.dialogbuilder.p137a.C1666l;
import com.google.android.finsky.dialogbuilder.p137a.C1671n;
import com.google.wireless.android.finsky.dfe.c.a.s;
import com.squareup.leakcanary.C7582R;

public final class C1672f extends C1666l implements C1671n {
    public final s f8690a;
    public C1818f f8691b;
    public final C1763d f8692c;

    public C1672f(LayoutInflater layoutInflater, s sVar, C1763d c1763d) {
        super(layoutInflater);
        this.f8690a = sVar;
        this.f8692c = c1763d;
    }

    public final void mo2379b() {
        this.f8691b.m9829a();
    }

    public final void mo2380c() {
        C1818f c1818f = this.f8691b;
        if (!c1818f.f9385g.m9821a()) {
            c1818f.f9383e.mo2382b();
        } else if (c1818f.f9384f == null) {
            c1818f.f9384f = new CancellationSignal();
            c1818f.f9386h = false;
            c1818f.f9380b.authenticate(null, c1818f.f9384f, 0, c1818f, null);
            c1818f.f9382d.setTextColor(c1818f.f9382d.getResources().getColor(C7582R.color.fingerprint_hint_color, null));
            c1818f.f9382d.setText(c1818f.f9382d.getResources().getString(C7582R.string.fingerprint_scanning));
            c1818f.f9381c.setImageResource(C7582R.drawable.ic_fp_dialog_initial);
        }
    }

    public final void mo2378a(C2797e c2797e, View view) {
        C1673i c1674g = new C1674g(this, c2797e);
        if (this.f8691b != null) {
            this.f8691b.m9829a();
        }
        this.f8691b = new C1818f(this.f.getContext(), (ImageView) view.findViewById(16908294), (TextView) view.findViewById(16908308), c1674g);
    }

    public final int mo2377a() {
        return C7582R.layout.viewcomponent_fingerprint;
    }
}
