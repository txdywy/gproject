package com.google.android.finsky.billing.addresschallenge;

import android.view.View;
import android.widget.AdapterView;
import com.google.wireless.android.finsky.a.a.p;
import java.util.List;

public final class com.google.android.finsky.billing.addresschallenge.o implements AdapterView$OnItemSelectedListener
{

    public final BillingAddress a;

    o(BillingAddress p0) {
        this.a = p0;
    }

    public final void onItemSelected(AdapterView p0, View p1, int p2, long p3) {
        v0 = (com.google.wireless.android.finsky.a.a.p)this.a.i.get(p2);
        if ((this.a.j == 0 || !this.a.j.c.equals(v0.c)) && this.a.p != 0)
            this.a.p.a(v0);
    }

    public final void onNothingSelected(AdapterView p0) {
        this.onItemSelected(p0, 0, 0, 0);
    }

}
