package com.google.android.wallet.ui.common;

import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class bg extends Filter {
    public final /* synthetic */ bf f33560a;

    bg(bf bfVar) {
        this.f33560a = bfVar;
    }

    protected final FilterResults performFiltering(CharSequence charSequence) {
        FilterResults filterResults = new FilterResults();
        filterResults.count = this.f33560a.f33558a.size();
        filterResults.values = this.f33560a.f33558a;
        return filterResults;
    }

    protected final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        this.f33560a.notifyDataSetChanged();
    }
}
