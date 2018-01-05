package com.google.android.finsky.stream.controllers.inlinetopcharts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.finsky.cv.p177a.ji;
import com.squareup.leakcanary.C7582R;
import java.util.List;

public final class C4417a extends ArrayAdapter {
    public int f22432a;

    public C4417a(Context context, List list) {
        super(context, 17367049, list);
        this.f22432a = context.getResources().getDimensionPixelSize(C7582R.dimen.spinner_min_width);
    }

    @SuppressLint({"ViewHolder"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(getContext()).inflate(C7582R.layout.top_charts_spinner_selected_item, viewGroup, false);
        ((TextView) inflate).setText(((ji) getItem(i)).by_().f12781b);
        return inflate;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(17367049, viewGroup, false);
        }
        TextView textView = (TextView) view.findViewById(16908308);
        textView.setText(((ji) getItem(i)).by_().f12781b);
        textView.setMinWidth(this.f22432a);
        return view;
    }
}
