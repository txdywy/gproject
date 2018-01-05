package com.google.android.wallet.ui.common;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.LinearLayout.LayoutParams;

final class bs implements OnGlobalLayoutListener {
    public final /* synthetic */ br f33577a;

    bs(br brVar) {
        this.f33577a = brVar;
    }

    public final void onGlobalLayout() {
        if (this.f33577a.f32923c.getHeight() != 0) {
            LayoutParams layoutParams = (LayoutParams) this.f33577a.f32924d.getLayoutParams();
            layoutParams.setMargins(0, (this.f33577a.f32923c.getTop() + this.f33577a.f32923c.getHeight()) - this.f33577a.f32924d.getHeight(), 0, 0);
            this.f33577a.f32924d.setLayoutParams(layoutParams);
            this.f33577a.f32924d.getViewTreeObserver().removeGlobalOnLayoutListener(this);
        }
    }
}
