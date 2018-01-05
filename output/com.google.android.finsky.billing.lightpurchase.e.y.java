package com.google.android.finsky.billing.lightpurchase.e;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.ScrollView;
import com.google.android.finsky.bg.ah;

public final class com.google.android.finsky.billing.lightpurchase.e.y implements ViewTreeObserver$OnGlobalLayoutListener
{

    public final ScrollView a;
    public final com.google.android.finsky.billing.lightpurchase.e.x b;

    y(com.google.android.finsky.billing.lightpurchase.e.x p0, ScrollView p1) {
        this.b = p0;
        this.a = p1;
    }

    public final void onGlobalLayout() {
        if (this.b.l()) {
            if (this.a.getHeight() < this.a.getChildAt(0).getHeight())
                com.google.android.finsky.bg.ah.a(this.a, this.b.i().getDrawable(2130837605));
            else
                com.google.android.finsky.bg.ah.a(this.a, 0);
        }
    }

}
