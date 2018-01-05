package com.google.android.finsky.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.finsky.cv.a.ce;
import java.util.List;

public final class com.google.android.finsky.adapters.i extends ArrayAdapter
{

    public int a;

    i(Context p0, List p1) {
        ArrayAdapter(p0, 17367049, p1);
        this.a = p0.getResources().getDimensionPixelSize(2131625399);
    }

    public final View getDropDownView(int p0, View p1, ViewGroup p2) {
        if (p1 == 0)
            p1 = LayoutInflater.from(this.getContext()).inflate(17367049, p2, 0);
        v1 = (TextView)p1.findViewById(16908308);
        v1.setText(((com.google.android.finsky.cv.a.ce)this.getItem(p0)).d);
        v1.setMinWidth(this.a);
        return p1;
    }

    public final View getView(int p0, View p1, ViewGroup p2) {
        v2 = LayoutInflater.from(this.getContext()).inflate(2130969466, p2, 0);
        ((TextView)v2).setText(((com.google.android.finsky.cv.a.ce)this.getItem(p0)).d);
        return v2;
    }

}
