package com.google.android.wallet.ui.common;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.wallet.common.p376a.C6553f;

final class bw extends ArrayAdapter {
    public final int f33587a;
    public int f33588b;
    public final int f33589c;
    public final LayoutInflater f33590d;
    public String f33591e;

    public bw(ContextThemeWrapper contextThemeWrapper, int i, int i2, Integer[] numArr) {
        super(contextThemeWrapper, i, i2, numArr);
        this.f33587a = i;
        this.f33589c = i2;
        this.f33590d = LayoutInflater.from(contextThemeWrapper);
    }

    public final void setDropDownViewResource(int i) {
        super.setDropDownViewResource(i);
        this.f33588b = i;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return WalletCheckedTextView.m30692a(m30780a(i, view, viewGroup, this.f33588b), this.f33591e);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        return m30780a(i, view, viewGroup, this.f33587a);
    }

    private final View m30780a(int i, View view, ViewGroup viewGroup, int i2) {
        if (view == null) {
            view = this.f33590d.inflate(i2, viewGroup, false);
        }
        Integer num = (Integer) getItem(i);
        TextView textView = (TextView) view.findViewById(this.f33589c);
        if (num.intValue() != 0) {
            textView.setText(C6553f.m29741b(num.intValue()));
        } else {
            textView.setText(null);
        }
        return view;
    }
}
