package com.google.android.wallet.ui.common;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.List;

public class cr extends ArrayAdapter {
    public String f33194c;

    public cr(Context context, int i, int i2, List list) {
        super(context, i, i2, list);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        return WalletCheckedTextView.m30692a(super.getDropDownView(i, view, viewGroup), this.f33194c);
    }
}
