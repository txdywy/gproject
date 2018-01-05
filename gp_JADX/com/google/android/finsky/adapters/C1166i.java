package com.google.android.finsky.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.finsky.cv.p177a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C1166i extends ArrayAdapter {
    public int f7201a;

    public C1166i(Context context, List list) {
        super(context, 17367049, list);
        this.f7201a = context.getResources().getDimensionPixelSize(C7582R.dimen.spinner_min_width);
    }

    @SuppressLint({"ViewHolder"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(getContext()).inflate(C7582R.layout.top_charts_spinner_selected_item, viewGroup, false);
        ((TextView) inflate).setText(((ce) getItem(i)).f12027d);
        return inflate;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(17367049, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(16908308);
        textView.setText(((ce) getItem(i)).f12027d);
        textView.setMinWidth(this.f7201a);
        return view;
    }
}
