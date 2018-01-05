package com.google.android.finsky.setup;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.squareup.leakcanary.C7582R;

public final class C4135b extends BaseAdapter {
    public final fp[] f20847a;
    public final LayoutInflater f20848b;
    public final String f20849c;

    public C4135b(Context context, fp[] fpVarArr) {
        this.f20847a = fpVarArr;
        this.f20848b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f20849c = context.getResources().getString(C7582R.string.setup_wizard_all_apps);
    }

    public final int getCount() {
        return this.f20847a.length + 1;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f20848b.inflate(C7582R.layout.restore_apps_row_entry, viewGroup, false);
        }
        ((TextView) view.findViewById(C7582R.id.checkable_item)).setText((String) getItem(i));
        return view;
    }

    public final /* synthetic */ Object getItem(int i) {
        if (i <= 0) {
            return this.f20849c;
        }
        return this.f20847a[i - 1].f;
    }
}
