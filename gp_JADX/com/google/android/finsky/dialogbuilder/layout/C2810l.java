package com.google.android.finsky.dialogbuilder.layout;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.squareup.leakcanary.C7582R;
import java.util.List;

final class C2810l extends ArrayAdapter {
    public final LayoutInflater f15165a;
    public final int f15166b = C7582R.string.month;

    C2810l(Context context, List list) {
        super(context, C7582R.layout.date_spinner_item, list);
        this.f15165a = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public final Object getItem(int i) {
        if (i == 0) {
            return null;
        }
        return super.getItem(i - 1);
    }

    public final int getPosition(Object obj) {
        return super.getPosition(obj) + 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (i != 0) {
            return super.getView(i, view, viewGroup);
        }
        View view2;
        if (view instanceof TextView) {
            view2 = view;
        } else {
            view2 = this.f15165a.inflate(C7582R.layout.date_spinner_item, viewGroup, false);
        }
        TextView textView = (TextView) view2;
        textView.setText(null);
        textView.setHint(this.f15166b);
        return textView;
    }

    public final int getCount() {
        return super.getCount() + 1;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (i == 0) {
            return new View(viewGroup.getContext());
        }
        if (!(view instanceof TextView)) {
            view = this.f15165a.inflate(17367049, viewGroup, false);
        }
        return super.getDropDownView(i, view, viewGroup);
    }
}
