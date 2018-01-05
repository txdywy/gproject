package com.google.android.wallet.ui.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.wallet.p383e.C6622f;
import com.google.android.wallet.p383e.C6623g;
import java.util.ArrayList;

public final class C6794t extends ArrayAdapter {
    public final LayoutInflater f33698a;

    public C6794t(Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.f33698a = LayoutInflater.from(context);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return m30928a(i, view, viewGroup);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return m30928a(i, view, viewGroup);
    }

    private final View m30928a(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f33698a.inflate(C6623g.view_drop_down_button, viewGroup, false);
        }
        C6795u c6795u = (C6795u) getItem(i);
        TextView textView = (TextView) view.findViewById(C6622f.dropdown_button_text);
        textView.setText(c6795u.f33700b);
        Context context = getContext();
        if (c6795u.f33702d == null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{c6795u.f33699a});
            c6795u.f33702d = obtainStyledAttributes.getDrawable(0);
            obtainStyledAttributes.recycle();
        }
        textView.setCompoundDrawablesWithIntrinsicBounds(c6795u.f33702d, null, null, null);
        return view;
    }
}
