package com.google.android.wallet.ui.common;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public final class bh extends LinearLayout implements C6756y {
    public TextView f33561a;

    public final void addView(View view, int i, LayoutParams layoutParams) {
        throw new NoSuchMethodError();
    }

    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setEnabled(z);
        }
    }

    public final View getInnerFieldView() {
        return this.f33561a;
    }
}
