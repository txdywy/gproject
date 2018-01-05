package com.google.android.finsky.billing.addresschallenge;

import android.text.Editable;
import com.android.volley.VolleyError;
import com.android.volley.a.ag;
import com.android.volley.r;
import com.google.android.finsky.billing.addresschallenge.a.d;
import com.google.android.finsky.billing.addresschallenge.a.j;
import com.google.android.finsky.billing.addresschallenge.placesapi.e;
import com.google.android.finsky.billing.addresschallenge.placesapi.f;
import com.google.android.finsky.billing.addresschallenge.placesapi.h;
import com.google.android.finsky.billing.addresschallenge.placesapi.i;
import com.google.android.finsky.billing.addresschallenge.placesapi.k;
import com.google.android.finsky.billing.addresschallenge.placesapi.m;
import com.google.android.finsky.utils.be;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class com.google.android.finsky.billing.addresschallenge.p implements com.android.volley.w, com.android.volley.x, com.google.android.finsky.billing.addresschallenge.m
{

    public com.google.android.finsky.billing.addresschallenge.placesapi.m a;
    public com.android.volley.r b;
    public String c;
    public final BillingAddress d;

    p(BillingAddress p0, com.google.android.finsky.billing.addresschallenge.placesapi.m p1, com.android.volley.r p2) {
        this.d = p0;
        this.a = p1;
        this.b = p2;
    }

    public final List a(CharSequence p0) {
        if (p0 != 0 && this.c != 0) {
            v0 = new com.android.volley.a.ag();
            v6 = new StringBuilder("/maps/api/place/autocomplete/json?input=");
            v6.append(com.google.android.finsky.utils.be.a(p0.toString().trim()));
            v6.append("&language=").append(this.a.b);
            v6.append("&types=address");
            v6.append("&components=country:").append(this.c);
            this.b.a(new com.google.android.finsky.billing.addresschallenge.placesapi.f(this.a.a(v6), v0, v0));
            try {
                v0 = ((com.google.android.finsky.billing.addresschallenge.placesapi.h)v0.get()).a;
            }
            catch (ExecutionException ex) {
                v0 = 0;
            }
            catch (InterruptedException ex) {
                v0 = 0;
            }
        }
        else
            v0 = 0;
        return v0;
    }

    public final void a(VolleyError p0) {
        this.d.l.b.b();
    }

    public final void a(com.google.android.finsky.billing.addresschallenge.placesapi.e p0) {
        this.b.a(new com.google.android.finsky.billing.addresschallenge.placesapi.i(this.a.a(new StringBuilder("/maps/api/place/details/json?reference=").append(p0.b).append("&language=").append(this.a.b)), this.a.c, this, this));
        this.d.l.b.a();
    }

    public final void b_(Object p0) {
        this.d.l.b.b();
        v0 = this.d.l.b(com.google.android.finsky.billing.addresschallenge.a.d.e);
        if (v0 instanceof AddressAutoComplete)
            v0 = (AddressAutoComplete)v0;
        else
            v0 = 0;
        if (v0 != 0)
            v0.a();
        this.d.l.a(com.google.android.finsky.billing.addresschallenge.n.a(((com.google.android.finsky.billing.addresschallenge.placesapi.k)p0).a), 0);
        if (v0 != 0)
            v0.setSelection(v0.getText().length());
    }

}
