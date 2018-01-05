package com.google.android.finsky.billing.addresschallenge;

import android.widget.Filter;
import android.widget.Filter.FilterResults;
import java.util.List;

final class C1731b extends Filter {
    public final /* synthetic */ AddressAutoComplete f9019a;

    C1731b(AddressAutoComplete addressAutoComplete) {
        this.f9019a = addressAutoComplete;
    }

    protected final FilterResults performFiltering(CharSequence charSequence) {
        synchronized (this.f9019a) {
            boolean z = this.f9019a.f8752c;
            C1741m c1741m = this.f9019a.f8751b;
            this.f9019a.f8752c = false;
        }
        if (c1741m == null || z) {
            return null;
        }
        List a = c1741m.mo2426a(charSequence);
        if (a == null) {
            return null;
        }
        FilterResults filterResults = new FilterResults();
        filterResults.values = a;
        filterResults.count = a.size();
        return filterResults;
    }

    protected final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        if (filterResults == null || filterResults.count <= 0) {
            this.f9019a.f8750a.notifyDataSetInvalidated();
            return;
        }
        this.f9019a.f8750a.f9017a = (List) filterResults.values;
        this.f9019a.f8750a.notifyDataSetChanged();
    }
}
