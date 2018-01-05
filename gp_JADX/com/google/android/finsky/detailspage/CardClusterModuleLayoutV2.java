package com.google.android.finsky.detailspage;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.detailscomponents.C2577b;
import com.google.android.finsky.detailscomponents.C2584j;
import com.google.android.finsky.detailscomponents.C2585k;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.playcluster.PlayCardClusterViewV2;
import com.squareup.leakcanary.C7582R;

public class CardClusterModuleLayoutV2 extends PlayCardClusterViewV2 implements C2584j, C2585k, ap, C2621k, C2622l {
    public final int f13955a;
    public C2577b f13956b;

    public CardClusterModuleLayoutV2(Context context) {
        this(context, null);
    }

    public CardClusterModuleLayoutV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        if (C1473m.f7980a.av().m9286k(resources)) {
            this.f13955a = -resources.getDimensionPixelSize(C7582R.dimen.play_card_inset);
        } else {
            this.f13955a = 0;
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1805a(this);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public int getMarginOffset() {
        return this.f13955a;
    }

    public int getMaxItemsPerPage() {
        return C1473m.f7980a.mo2245h().m18477a(getResources());
    }
}
