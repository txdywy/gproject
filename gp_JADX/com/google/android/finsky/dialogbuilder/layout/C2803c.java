package com.google.android.finsky.dialogbuilder.layout;

import android.view.View;
import android.view.View.OnClickListener;

final class C2803c implements OnClickListener {
    public final /* synthetic */ CheckedView f15150a;

    C2803c(CheckedView checkedView) {
        this.f15150a = checkedView;
    }

    public final void onClick(View view) {
        if (this.f15150a.f15130b != null) {
            this.f15150a.f15130b.onClick(view);
        }
        this.f15150a.toggle();
    }
}
