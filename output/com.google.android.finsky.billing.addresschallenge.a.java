package com.google.android.finsky.billing.addresschallenge;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import com.google.android.finsky.billing.addresschallenge.placesapi.e;
import java.util.List;

public final class com.google.android.finsky.billing.addresschallenge.a extends ArrayAdapter implements Filterable
{

    public List a;
    public final AddressAutoComplete b;

    a(AddressAutoComplete p0, Context p1) {
        this.b = p0;
        ArrayAdapter(p1, 2130968628);
    }

    public final int getCount() {
        if (this.a != 0)
            v0 = this.a.size();
        else
            v0 = 0;
        return v0;
    }

    public final Filter getFilter() {
        return new com.google.android.finsky.billing.addresschallenge.b(this.b);
    }

    public final Object getItem(int p0) {
        return ((com.google.android.finsky.billing.addresschallenge.placesapi.e)this.a.get(p0)).a;
    }

}
