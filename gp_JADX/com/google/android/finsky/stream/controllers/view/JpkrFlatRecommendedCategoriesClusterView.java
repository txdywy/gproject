package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.view.C3688e;
import com.google.android.finsky.stream.controllers.ca;
import com.squareup.leakcanary.C7582R;

public class JpkrFlatRecommendedCategoriesClusterView extends C3688e {
    public int f22928a;
    public int f22929b;
    public View f22930c;
    public HorizontalScrollView f22931j;
    public LinearLayout f22932k;

    public JpkrFlatRecommendedCategoriesClusterView(Context context) {
        this(context, null);
    }

    public JpkrFlatRecommendedCategoriesClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo2006i();
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22932k = (LinearLayout) findViewById(C7582R.id.recommended_categories_cell_grid);
        this.f22931j = (HorizontalScrollView) findViewById(C7582R.id.recommended_categories_scrollview);
        this.f22930c = this.f22931j != null ? this.f22931j : this.f22932k;
        this.f22929b = this.f22932k.getChildCount();
        if (this.f22932k.getChildAt(0).getId() == C7582R.id.recommended_categories_column) {
            this.f22928a = ((ViewGroup) this.f22932k.getChildAt(0)).getChildCount();
        } else {
            this.f22928a = 1;
        }
    }

    public final void mo3581a(Bundle bundle) {
        super.mo3581a(bundle);
        for (int i = 0; i < this.f22928a * this.f22929b; i++) {
            m21015a(i).Z_();
        }
        if (this.f22931j != null) {
            bundle.putInt("RecommendedCategoriesClusterView.scrollPosition", this.f22931j.getScrollX());
        }
    }

    protected void onMeasure(int i, int i2) {
        if (this.f22928a > 1) {
            super.onMeasure(i, i2);
            return;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f22930c.getLayoutParams();
        int size = MeasureSpec.getSize(i) - (((marginLayoutParams.rightMargin + marginLayoutParams.leftMargin) + this.f22932k.getPaddingLeft()) + this.f22932k.getPaddingRight());
        int i3 = size / this.f22929b;
        int dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.jpkr_recommended_categories_min_item_width);
        if (i3 < dimensionPixelSize) {
            i3 = this.f22932k.getPaddingRight() + size;
            i3 = (int) (((float) i3) / (((float) Math.round(((float) i3) / ((float) dimensionPixelSize))) - 0.5f));
        }
        for (size = 0; size < this.f22929b; size++) {
            View a = m21015a(size);
            LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams.width == i3) {
                break;
            }
            layoutParams.width = i3;
            a.setLayoutParams(layoutParams);
        }
        super.onMeasure(i, i2);
    }

    protected int getPlayStoreUiElementType() {
        return 440;
    }

    public final JpkrRecommendedCategoriesItem m21015a(int i) {
        ViewGroup viewGroup = (ViewGroup) this.f22932k.getChildAt(i % this.f22929b);
        if (this.f22928a == 1) {
            return (JpkrRecommendedCategoriesItem) viewGroup;
        }
        return (JpkrRecommendedCategoriesItem) viewGroup.getChildAt(i / this.f22929b);
    }
}
