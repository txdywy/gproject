package com.google.android.finsky.stream.controllers.minicategories.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.C0361r;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4257k;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4269h;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4275j;
import com.google.android.finsky.stream.base.horizontalclusters.view.HorizontalClusterRecyclerView;
import com.google.android.finsky.stream.base.view.C3687d;
import com.google.android.finsky.stream.base.view.FlatCardClusterViewHeader;
import com.google.android.play.p184e.C2629a;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class MiniCategoriesClusterView extends LinearLayout implements ad, ae, C2621k, C2622l, C4269h, C4275j, C3687d, C2629a {
    public HorizontalClusterRecyclerView f22591a;
    public C4447c f22592b;
    public C4257k f22593c;
    public FlatCardClusterViewHeader f22594d;
    public ce f22595e;
    public ad f22596f;
    public C1611k f22597g;
    public C1461c f22598h;

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public MiniCategoriesClusterView(Context context) {
        this(context, null);
    }

    public MiniCategoriesClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, 0);
    }

    protected void onFinishInflate() {
        ((C1436e) C3947d.m18649a(C1436e.class)).mo1940a(this);
        super.onFinishInflate();
        this.f22594d = (FlatCardClusterViewHeader) findViewById(C7582R.id.cluster_header);
        this.f22591a = (HorizontalClusterRecyclerView) findViewById(C7582R.id.cluster_content);
        this.f22591a.setSupportsSnapping(true);
        this.f22591a.setChildPeekingAmount(0.5f);
        this.f22591a.setChildWidthPolicy(2);
        this.f22591a.mo3606i(this.f22597g.m9275a(getResources()) + getResources().getDimensionPixelSize(C7582R.dimen.mini_categories_card_horizontal_padding));
        if (this.f22598h.dj().mo2294a(12632714)) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_content_bottom_padding_large_tablet));
        }
        int a = this.f22597g.m9275a(getResources());
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) getLayoutParams();
        C0361r.m2050a(marginLayoutParams, a);
        C0361r.m2052b(marginLayoutParams, a);
        setLayoutParams(marginLayoutParams);
    }

    protected void onMeasure(int i, int i2) {
        boolean z = (this.f22594d == null || this.f22594d.getVisibility() == 8) ? false : true;
        if (z) {
            z = this.f22591a.bg;
            this.f22594d.m17561a(z);
            m20799a(i, true, true);
            boolean z2 = this.f22591a.bg;
            if (z != z2) {
                this.f22594d.m17561a(z2);
                m20799a(i, true, false);
                return;
            }
            return;
        }
        m20799a(i, false, true);
    }

    private final void m20799a(int i, boolean z, boolean z2) {
        int measuredHeight;
        if (z) {
            this.f22594d.measure(i, 0);
            measuredHeight = this.f22594d.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f22591a.getLayoutParams();
        if (z2 && marginLayoutParams.height != -1) {
            this.f22591a.measure(i, 0);
        }
        setMeasuredDimension(MeasureSpec.getSize(i), ((((measuredHeight + getPaddingTop()) + getPaddingBottom()) + marginLayoutParams.topMargin) + this.f22591a.getMeasuredHeight()) + marginLayoutParams.bottomMargin);
        if (marginLayoutParams.height == -1) {
            this.f22591a.measure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
    }

    public final void Z_() {
        this.f22592b = null;
        this.f22593c = null;
        this.f22591a.Z_();
    }

    public final void m20802a(Bundle bundle) {
        this.f22591a.m19812a(bundle);
    }

    public final boolean mo2996a(float f, float f2) {
        return f >= ((float) this.f22591a.getLeft()) && f < ((float) this.f22591a.getRight()) && f2 >= ((float) this.f22591a.getTop()) && f2 < ((float) this.f22591a.getBottom());
    }

    public final void as_() {
        this.f22591a.aT = true;
    }

    public int getHorizontalScrollerTop() {
        return this.f22591a.getTop();
    }

    public int getHorizontalScrollerBottom() {
        return this.f22591a.getBottom();
    }

    public final int mo4085a(int i) {
        return getResources().getDimensionPixelSize(C7582R.dimen.mini_categories_card_height);
    }

    public final int mo4084a() {
        return getResources().getDimensionPixelSize(C7582R.dimen.mini_categories_card_width);
    }

    public final void mo4190c() {
        this.f22592b.mo4213a(this);
    }

    public final void mo3579a(View view) {
        this.f22592b.mo4212a((ad) this);
    }

    public final void mo3580c(View view) {
        this.f22592b.mo4212a((ad) this);
    }

    public ce getPlayStoreUiElement() {
        return this.f22595e;
    }

    public ad getParentNode() {
        return this.f22596f;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
