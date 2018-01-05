package com.google.android.finsky.billing.addresschallenge;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.google.wireless.android.finsky.a.a.p;

final class C1743o implements OnItemSelectedListener {
    public final /* synthetic */ BillingAddress f9043a;

    C1743o(BillingAddress billingAddress) {
        this.f9043a = billingAddress;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        p pVar = (p) this.f9043a.f8776i.get(i);
        if ((this.f9043a.f8777j == null || !this.f9043a.f8777j.c.equals(pVar.c)) && this.f9043a.f8783p != null) {
            this.f9043a.f8783p.mo2425a(pVar);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
        onItemSelected(adapterView, null, 0, 0);
    }
}
