package com.google.android.finsky.dialogbuilder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.wireless.android.finsky.dfe.c.a.de;

public final class C2814m extends ArrayAdapter {
    public final /* synthetic */ C2797e f15178a;
    public final /* synthetic */ C2798j f15179b;

    public C2814m(C2798j c2798j, Context context, de[] deVarArr, C2797e c2797e) {
        this.f15179b = c2798j;
        this.f15178a = c2797e;
        super(context, 17367048, deVarArr);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        this.f15179b.m14904a((de) getItem(i), (TextView) view2, this.f15178a, new Object[0]);
        return view2;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        this.f15179b.m14904a((de) getItem(i), (TextView) dropDownView, this.f15178a, new Object[0]);
        return dropDownView;
    }
}
