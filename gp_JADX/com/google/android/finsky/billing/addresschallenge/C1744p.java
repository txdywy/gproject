package com.google.android.finsky.billing.addresschallenge;

import android.view.View;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.C0700r;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.billing.addresschallenge.p156a.C1704a;
import com.google.android.finsky.billing.addresschallenge.p156a.C1709d;
import com.google.android.finsky.billing.addresschallenge.p156a.C1715j;
import com.google.android.finsky.billing.addresschallenge.placesapi.C1749e;
import com.google.android.finsky.billing.addresschallenge.placesapi.C1750f;
import com.google.android.finsky.billing.addresschallenge.placesapi.C1753h;
import com.google.android.finsky.billing.addresschallenge.placesapi.C1754i;
import com.google.android.finsky.billing.addresschallenge.placesapi.C1756k;
import com.google.android.finsky.billing.addresschallenge.placesapi.C1757m;
import com.google.android.finsky.utils.be;
import java.util.List;
import java.util.concurrent.ExecutionException;

final class C1744p implements C0657w, C0660x, C1741m {
    public C1757m f9044a;
    public C0700r f9045b;
    public String f9046c;
    public final /* synthetic */ BillingAddress f9047d;

    C1744p(BillingAddress billingAddress, C1757m c1757m, C0700r c0700r) {
        this.f9047d = billingAddress;
        this.f9044a = c1757m;
        this.f9045b = c0700r;
    }

    public final List mo2426a(CharSequence charSequence) {
        if (charSequence == null || this.f9046c == null) {
            return null;
        }
        ag agVar = new ag();
        C1757m c1757m = this.f9044a;
        String charSequence2 = charSequence.toString();
        String str = this.f9046c;
        StringBuilder stringBuilder = new StringBuilder("/maps/api/place/autocomplete/json?input=");
        stringBuilder.append(be.m21800a(charSequence2.trim()));
        stringBuilder.append("&language=").append(c1757m.f9073b);
        stringBuilder.append("&types=address");
        stringBuilder.append("&components=country:").append(str);
        this.f9045b.m4510a(new C1750f(c1757m.m9658a(stringBuilder), agVar, agVar));
        try {
            return ((C1753h) agVar.get()).f9069a;
        } catch (ExecutionException e) {
            return null;
        } catch (InterruptedException e2) {
            return null;
        }
    }

    public final void mo2427a(C1749e c1749e) {
        C0700r c0700r = this.f9045b;
        C1757m c1757m = this.f9044a;
        c0700r.m4510a(new C1754i(c1757m.m9658a(new StringBuilder("/maps/api/place/details/json?reference=").append(c1749e.f9066b).append("&language=").append(c1757m.f9073b)), c1757m.f9074c, this, this));
        this.f9047d.f8779l.f8967b.mo2404a();
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f9047d.f8779l.f8967b.mo2405b();
    }

    public final /* synthetic */ void b_(Object obj) {
        C1756k c1756k = (C1756k) obj;
        this.f9047d.f8779l.f8967b.mo2405b();
        C1715j c1715j = this.f9047d.f8779l;
        C1704a a = C1742n.m9644a(c1756k.f9071a);
        View b = c1715j.m9599b(C1709d.ADDRESS_LINE_1);
        AddressAutoComplete addressAutoComplete = b instanceof AddressAutoComplete ? (AddressAutoComplete) b : null;
        if (addressAutoComplete != null) {
            addressAutoComplete.m9485a();
        }
        c1715j.m9596a(a, false);
        if (addressAutoComplete != null) {
            addressAutoComplete.setSelection(addressAutoComplete.getText().length());
        }
    }
}
