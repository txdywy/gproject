package com.google.android.finsky.detailspage;

import android.content.Context;
import android.support.v4.view.ai;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import com.google.android.finsky.bg.ab;
import com.google.android.finsky.bg.ac;
import com.google.android.finsky.frameworkviews.C2572y;
import com.google.android.finsky.frameworkviews.C2573z;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.frameworkviews.C2625e;
import com.squareup.leakcanary.C7582R;

public class VettedAppFeaturesModuleLayout extends LinearLayout implements ac, C2625e, C2621k, C2622l, C2572y, C2573z {
    public RecyclerView f14202a;
    public gv f14203b;
    public ab f14204c;
    public int f14205d;

    public VettedAppFeaturesModuleLayout(Context context) {
        this(context, null);
    }

    public VettedAppFeaturesModuleLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14205d = context.getResources().getDimensionPixelOffset(C7582R.dimen.vetted_app_feature_text_padding);
    }

    protected void onFinishInflate() {
        boolean z;
        super.onFinishInflate();
        this.f14202a = (RecyclerView) findViewById(C7582R.id.features_container);
        getContext();
        if (ai.f1848a.mo400k(this) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f14202a.setLayoutManager(new LinearLayoutManager(0, z));
        this.f14204c = new ab(true, 0, 0, 0);
    }

    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f14204c.m9204a(this, ai.f1848a.mo401l(this.f14202a), MeasureSpec.getSize(i) - ai.f1848a.mo401l(this));
        measureChildren(i, i2);
    }

    public int getScrollPosition() {
        return this.f14202a.getScrollX();
    }

    public int getPeekableChildCount() {
        return this.f14202a.getChildCount();
    }

    public final int mo3019a(int i) {
        View childAt = this.f14202a.getChildAt(i);
        getPeekableChildCount();
        return childAt.getMeasuredWidth();
    }

    public final void mo3020a(int i, int i2) {
        if (i <= 0) {
            int i3 = (i2 / 2) + this.f14205d;
            this.f14203b.f14658f = i3;
            for (int i4 = 0; i4 < getPeekableChildCount(); i4++) {
                View childAt = this.f14202a.getChildAt(i4);
                childAt.setPadding(i3, childAt.getPaddingTop(), i3, childAt.getPaddingBottom());
            }
        }
    }

    public final void a_(int i, int i2) {
        this.f14202a.setPadding(i, this.f14202a.getPaddingTop(), i2, this.f14202a.getPaddingBottom());
    }

    public final int mo3022b(int i) {
        return ai.f1848a.mo401l(this.f14202a.getChildAt(i));
    }

    public final void bX_() {
    }

    public final boolean mo3023b() {
        return true;
    }
}
