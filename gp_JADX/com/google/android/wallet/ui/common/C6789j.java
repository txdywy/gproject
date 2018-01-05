package com.google.android.wallet.ui.common;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.wallet.p383e.C6622f;
import java.util.List;

public final class C6789j extends cr {
    public C6789j(Context context, int i, int i2, List list) {
        super(context, i, i2, list);
    }

    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        View dropDownView = super.getDropDownView(i, view, viewGroup);
        TextView textView = (TextView) dropDownView.findViewById(C6622f.description);
        C6790k c6790k = (C6790k) getItem(i);
        if (c6790k != null) {
            textView.setText(c6790k.f33678e);
        }
        return dropDownView;
    }
}
