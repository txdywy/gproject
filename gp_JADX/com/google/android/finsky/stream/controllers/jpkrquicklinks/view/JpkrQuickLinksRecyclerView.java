package com.google.android.finsky.stream.controllers.jpkrquicklinks.view;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.controllers.quicklinks.view.QuickLinksBannerRecyclerView;
import com.squareup.leakcanary.C7582R;

public class JpkrQuickLinksRecyclerView extends QuickLinksBannerRecyclerView {
    public C4436d aN;
    public int aO;

    public JpkrQuickLinksRecyclerView(Context context) {
        this(context, null);
    }

    public JpkrQuickLinksRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((C1434c) C3947d.m18649a(C1434c.class)).mo1937a(this);
        super.onFinishInflate();
        this.aO = getResources().getDimensionPixelOffset(C7582R.dimen.jpkr_quicklink_cluster_xpadding);
        setPadding(this.aO, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Resources resources = getResources();
        int measuredWidth = getMeasuredWidth() - this.aO;
        int a = measuredWidth / getAdapter().mo1039a();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.jpkr_min_quicklink_item_width);
        if (a < dimensionPixelSize) {
            a = (measuredWidth * 2) / dimensionPixelSize;
            if (a % 2 == 0) {
                a--;
            }
            a = (measuredWidth * 2) / a;
            m20762h(a);
        } else {
            a = Math.min(a, resources.getDimensionPixelSize(C7582R.dimen.jpkr_max_quicklink_item_width));
            m20762h(a);
            measuredWidth = (getMeasuredWidth() - (getChildCount() * a)) / 2;
            setPadding(measuredWidth, getPaddingTop(), measuredWidth, getPaddingBottom());
        }
        this.aN.f22540f = a;
        ((MarginLayoutParams) getLayoutParams()).bottomMargin = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
    }

    private final void m20762h(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            LayoutParams layoutParams = getChildAt(i2).getLayoutParams();
            if (layoutParams.width != i) {
                layoutParams.width = i;
            }
        }
    }

    protected final boolean mo2965v() {
        return false;
    }

    public final void Z_() {
        super.Z_();
        if (this.aN != null) {
            C4436d c4436d = this.aN;
            c4436d.f22539e = null;
            c4436d.f22538d = null;
            c4436d.f22541g = null;
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((JpkrQuickLinksBannerItem) getChildAt(i)).Z_();
        }
    }
}
