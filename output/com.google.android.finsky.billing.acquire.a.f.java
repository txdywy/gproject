package com.google.android.finsky.billing.acquire.a;

import android.content.res.Resources;
import android.hardware.fingerprint.FingerprintManager;
import android.os.CancellationSignal;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.finsky.billing.b.d;
import com.google.android.finsky.billing.e.e;
import com.google.android.finsky.billing.e.f;
import com.google.android.finsky.billing.e.i;
import com.google.android.finsky.dialogbuilder.a.l;
import com.google.android.finsky.dialogbuilder.e;
import com.google.wireless.android.finsky.dfe.c.a.s;

public final class com.google.android.finsky.billing.acquire.a.f extends com.google.android.finsky.dialogbuilder.a.l implements com.google.android.finsky.dialogbuilder.a.n
{

    public final com.google.wireless.android.finsky.dfe.c.a.s a;
    public com.google.android.finsky.billing.e.f b;
    public final com.google.android.finsky.billing.b.d c;

    f(LayoutInflater p0, com.google.wireless.android.finsky.dfe.c.a.s p1, com.google.android.finsky.billing.b.d p2) {
        com.google.android.finsky.dialogbuilder.a.l(p0);
        this.a = p1;
        this.c = p2;
    }

    public final int a() {
        return 2130969571;
    }

    public final void a(com.google.android.finsky.dialogbuilder.e p0, View p1) {
        if (this.b != 0)
            this.b.a();
        this.b = new com.google.android.finsky.billing.e.f(this.f.getContext(), (ImageView)p1.findViewById(16908294), (TextView)p1.findViewById(16908308), new com.google.android.finsky.billing.acquire.a.g(this, p0));
    }

    public final void b() {
        this.b.a();
    }

    public final void c() {
        if (!this.b.g.a())
            this.b.e.b();
        else if (this.b.f == 0) {
            this.b.f = new CancellationSignal();
            this.b.h = 0;
            this.b.b.authenticate(0, this.b.f, 0, this.b, 0);
            this.b.d.setTextColor(this.b.d.getResources().getColor(2131558503, 0));
            this.b.d.setText(this.b.d.getResources().getString(2131952199));
            this.b.c.setImageResource(2130837715);
        }
    }

}
