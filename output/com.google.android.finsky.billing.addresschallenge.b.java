package com.google.android.finsky.billing.addresschallenge;

import android.widget.Filter;
import android.widget.Filter$FilterResults;
import java.util.List;

protected final class com.google.android.finsky.billing.addresschallenge.b extends Filter
{

    public final AddressAutoComplete a;

    b(AddressAutoComplete p0) {
        this.a = p0;
        Filter();
    }

    protected final Filter$FilterResults performFiltering(CharSequence p0) {
        v0 = 0;
        enter this.a;
        try {
            this.a.c = 0;
            exit this.a;
        }
        catch (Throwable ex) {
            try {
                exit this.a;
            }
            catch (Throwable ex) {
                exit this.a;
                throw ex;
            }
            throw ex;
        }
        if (this.a.b != 0 && this.a.c == 0) {
            v1 = this.a.b.a(p0);
            if (v1 != 0) {
                v0 = new Filter$FilterResults();
                v0.values = v1;
                v0.count = v1.size();
            }
        }
        return v0;
    }

    protected final void publishResults(CharSequence p0, Filter$FilterResults p1) {
        if (p1 != 0 && p1.count > 0) {
            this.a.a.a = (List)p1.values;
            this.a.a.notifyDataSetChanged();
        }
        else
            this.a.a.notifyDataSetInvalidated();
    }

}
