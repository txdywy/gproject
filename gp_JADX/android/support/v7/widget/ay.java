package android.support.v7.widget;

import android.content.res.Resources.Theme;
import android.database.DataSetObserver;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

final class ay implements ListAdapter, SpinnerAdapter {
    public SpinnerAdapter f3138a;
    public ListAdapter f3139b;

    public ay(SpinnerAdapter spinnerAdapter, Theme theme) {
        this.f3138a = spinnerAdapter;
        if (spinnerAdapter instanceof ListAdapter) {
            this.f3139b = (ListAdapter) spinnerAdapter;
        }
        if (theme == null) {
            return;
        }
        if (VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
            ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
            if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        } else if (spinnerAdapter instanceof gy) {
            gy gyVar = (gy) spinnerAdapter;
            if (gyVar.m3764b() == null) {
                gyVar.m3763a();
            }
        }
    }

    public final int getCount() {
        return this.f3138a == null ? 0 : this.f3138a.getCount();
    }

    public final Object getItem(int i) {
        return this.f3138a == null ? null : this.f3138a.getItem(i);
    }

    public final long getItemId(int i) {
        return this.f3138a == null ? -1 : this.f3138a.getItemId(i);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return getDropDownView(i, view, viewGroup);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f3138a == null) {
            return null;
        }
        return this.f3138a.getDropDownView(i, view, viewGroup);
    }

    public final boolean hasStableIds() {
        return this.f3138a != null && this.f3138a.hasStableIds();
    }

    public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f3138a != null) {
            this.f3138a.registerDataSetObserver(dataSetObserver);
        }
    }

    public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
        if (this.f3138a != null) {
            this.f3138a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public final boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f3139b;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    public final boolean isEnabled(int i) {
        ListAdapter listAdapter = this.f3139b;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i);
        }
        return true;
    }

    public final int getItemViewType(int i) {
        return 0;
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public final boolean isEmpty() {
        return getCount() == 0;
    }
}
