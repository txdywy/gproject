package com.google.android.finsky.billing.lightpurchase.p160e;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ScrollView;
import com.google.android.finsky.bg.ah;
import com.squareup.leakcanary.C7582R;

final class C1946y implements OnGlobalLayoutListener {
    public final /* synthetic */ ScrollView f9933a;
    public final /* synthetic */ C1945x f9934b;

    C1946y(C1945x c1945x, ScrollView scrollView) {
        this.f9934b = c1945x;
        this.f9933a = scrollView;
    }

    public final void onGlobalLayout() {
        if (!this.f9934b.m612l()) {
            return;
        }
        if (this.f9933a.getHeight() < this.f9933a.getChildAt(0).getHeight()) {
            ah.m9227a(this.f9933a, this.f9934b.m605i().getDrawable(C7582R.drawable.bottom_border));
        } else {
            ah.m9227a(this.f9933a, null);
        }
    }
}
