package com.google.android.finsky.dialogbuilder.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;
import java.util.Locale;

final class C2811m extends BaseAdapter {
    public final LayoutInflater f15167a;
    public final Locale f15168b;
    public final int f15169c;
    public final int f15170d;
    public int f15171e;
    public final int f15172f;

    C2811m(Context context, int i, int i2, int i3, int i4) {
        this.f15167a = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f15168b = context.getResources().getConfiguration().locale;
        this.f15169c = i;
        this.f15170d = i2;
        this.f15171e = i3;
        this.f15172f = i4;
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2;
        if (view instanceof TextView) {
            view2 = view;
        } else {
            view2 = this.f15167a.inflate(C7582R.layout.date_spinner_item, viewGroup, false);
        }
        TextView textView = (TextView) view2;
        if (i == 0) {
            textView.setText(null);
            textView.setHint(this.f15169c);
        } else {
            textView.setText(String.format(this.f15168b, "%d", new Object[]{(Integer) getItem(i)}));
        }
        return view2;
    }

    public final int getCount() {
        return ((this.f15171e - this.f15170d) / this.f15172f) + 2;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (i == 0) {
            return new View(viewGroup.getContext());
        }
        View view2;
        if (view instanceof TextView) {
            view2 = view;
        } else {
            view2 = this.f15167a.inflate(17367049, viewGroup, false);
        }
        TextView textView = (TextView) view2;
        textView.setText(String.format(this.f15168b, "%d", new Object[]{(Integer) getItem(i)}));
        return textView;
    }

    public final /* synthetic */ Object getItem(int i) {
        if (i == 0) {
            return null;
        }
        return Integer.valueOf(this.f15170d + ((i - 1) * this.f15172f));
    }
}
