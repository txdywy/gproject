package android.support.v4.widget;

import android.database.Cursor;
import android.widget.Filter;
import android.widget.Filter.FilterResults;

final class C0386r extends Filter {
    public C0369s f2187a;

    C0386r(C0369s c0369s) {
        this.f2187a = c0369s;
    }

    public final CharSequence convertResultToString(Object obj) {
        return this.f2187a.mo473b((Cursor) obj);
    }

    protected final FilterResults performFiltering(CharSequence charSequence) {
        Cursor a = this.f2187a.mo471a(charSequence);
        FilterResults filterResults = new FilterResults();
        if (a != null) {
            filterResults.count = a.getCount();
            filterResults.values = a;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    protected final void publishResults(CharSequence charSequence, FilterResults filterResults) {
        Cursor a = this.f2187a.mo470a();
        if (filterResults.values != null && filterResults.values != a) {
            this.f2187a.mo472a((Cursor) filterResults.values);
        }
    }
}
