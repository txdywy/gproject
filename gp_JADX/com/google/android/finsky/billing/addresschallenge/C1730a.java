package com.google.android.finsky.billing.addresschallenge;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.google.android.finsky.billing.addresschallenge.placesapi.C1749e;
import com.squareup.leakcanary.C7582R;
import java.util.List;

final class C1730a extends ArrayAdapter implements Filterable {
    public List f9017a;
    public final /* synthetic */ AddressAutoComplete f9018b;

    public C1730a(AddressAutoComplete addressAutoComplete, Context context) {
        this.f9018b = addressAutoComplete;
        super(context, C7582R.layout.address_suggestion_item);
    }

    public final int getCount() {
        return this.f9017a != null ? this.f9017a.size() : 0;
    }

    public final Filter getFilter() {
        return new C1731b(this.f9018b);
    }

    public final /* synthetic */ Object getItem(int i) {
        return ((C1749e) this.f9017a.get(i)).f9065a;
    }
}
