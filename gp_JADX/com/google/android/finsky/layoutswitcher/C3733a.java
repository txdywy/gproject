package com.google.android.finsky.layoutswitcher;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.google.android.finsky.aa.C0954a;
import com.squareup.leakcanary.C7582R;

public final class C3733a {
    public static void m17614a(View view, ErrorIndicatorWithNotifyLayout errorIndicatorWithNotifyLayout, OnClickListener onClickListener, boolean z, String str) {
        if (z) {
            int i;
            if (((Boolean) C0954a.f5809E.m5760a()).booleanValue()) {
                i = 1;
            } else {
                i = 5;
            }
            errorIndicatorWithNotifyLayout.m17613a(C3735c.m17615a(i, 0), onClickListener);
            errorIndicatorWithNotifyLayout.setVisibility(0);
            view.setVisibility(8);
            return;
        }
        ((TextView) view.findViewById(C7582R.id.error_msg)).setText(str);
        view.findViewById(C7582R.id.retry_button).setOnClickListener(onClickListener);
        view.setVisibility(0);
        errorIndicatorWithNotifyLayout.setVisibility(8);
    }
}
