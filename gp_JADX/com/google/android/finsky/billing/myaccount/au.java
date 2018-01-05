package com.google.android.finsky.billing.myaccount;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.google.android.finsky.p111d.C2475d;
import com.google.wireless.android.finsky.dfe.nano.cl;
import com.squareup.leakcanary.C7582R;

final class au implements OnClickListener {
    public final /* synthetic */ cl f10224a;
    public final /* synthetic */ Button f10225b;
    public final /* synthetic */ an f10226c;

    au(an anVar, cl clVar, Button button) {
        this.f10226c = anVar;
        this.f10224a = clVar;
        this.f10225b = button;
    }

    public final void onClick(View view) {
        this.f10226c.j.m13379b(new C2475d(this.f10226c.l).m13256a(2696));
        this.f10226c.m10587a(this.f10224a.b, this.f10225b, C7582R.string.contact_email_resending, new av(this));
    }
}
