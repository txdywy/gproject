package com.google.android.finsky.billing.acquire.a;

import android.text.Editable;
import android.view.View;
import com.google.android.finsky.dialogbuilder.b.f;
import com.google.android.play.layout.PlayTextView;
import com.google.wireless.android.finsky.dfe.c.a.cj;
import com.google.wireless.android.finsky.dfe.c.a.dm;
import com.google.wireless.android.finsky.dfe.c.a.z;

public final class com.google.android.finsky.billing.acquire.a.l implements TextWatcher
{

    public final View a;
    public final com.google.android.finsky.billing.acquire.a.k b;

    l(com.google.android.finsky.billing.acquire.a.k p0, View p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void afterTextChanged(Editable p0) {
        ((PlayTextView)this.a.findViewById(2131755736)).setVisibility(4);
        if (p0.length() > 0)
            v0 = 1;
        else
            v0 = 0;
        this.b.d.a(this.b.b.a.d.b, v0);
    }

    public final void beforeTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

    public final void onTextChanged(CharSequence p0, int p1, int p2, int p3) {
    }

}
