package com.google.android.finsky.stream.controllers.genericcluster.view;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.detailscomponents.C2584j;
import com.google.android.finsky.detailscomponents.C2585k;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4257k;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4270c;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4275j;
import com.google.android.finsky.stream.base.horizontalclusters.view.HorizontalClusterRecyclerView;
import com.google.android.finsky.stream.base.view.C3687d;
import com.google.android.finsky.stream.base.view.FlatCardClusterViewHeader;
import com.google.android.play.p184e.C2629a;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatGenericClusterView extends RelativeLayout implements C2584j, C2585k, ae, C2621k, C2622l, C4275j, C3687d, C2629a {
    public HorizontalClusterRecyclerView f22374a;
    public int f22375b;
    public float f22376c;
    public C4408b f22377d;
    public C4257k f22378e;
    public FlatCardClusterViewHeader f22379f;
    public C2473o f22380g;
    public boolean f22381h;
    public C4270c f22382i;
    public C1611k f22383j;
    public C1461c f22384k;

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public FlatGenericClusterView(Context context) {
        this(context, null);
    }

    public FlatGenericClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, 0);
    }

    protected void onFinishInflate() {
        ((C1431c) C3947d.m18649a(C1431c.class)).mo1933a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22379f = (FlatCardClusterViewHeader) findViewById(C7582R.id.cluster_header);
        this.f22374a = (HorizontalClusterRecyclerView) findViewById(C7582R.id.cluster_content);
        if (this.f22384k.dj().mo2294a(12632714)) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_content_bottom_padding_large_tablet));
        }
    }

    public final void Z_() {
        if (this.f22380g != null) {
            this.f22380g.m13200a(0, null, null);
        }
        if (this.f22381h) {
            this.f22381h = false;
            this.f22380g = null;
        }
        this.f22377d = null;
        this.f22378e = null;
        this.f22374a.Z_();
    }

    public final void m20644a(Bundle bundle) {
        this.f22374a.m19812a(bundle);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.f22379f == null || this.f22379f.getVisibility() == 8) {
            i5 = paddingTop;
        } else {
            this.f22379f.layout(0, paddingTop, width, this.f22379f.getMeasuredHeight() + paddingTop);
            i5 = paddingTop + this.f22379f.getMeasuredHeight();
        }
        paddingTop = ((MarginLayoutParams) this.f22374a.getLayoutParams()).topMargin + i5;
        this.f22374a.layout(0, paddingTop, width, this.f22374a.getMeasuredHeight() + paddingTop);
    }

    protected void onMeasure(int i, int i2) {
        boolean z = (this.f22379f == null || this.f22379f.getVisibility() == 8) ? false : true;
        if (z) {
            z = this.f22374a.bg;
            this.f22379f.m17561a(z);
            m20643a(i, i2, true, true);
            boolean z2 = this.f22374a.bg;
            if (z != z2) {
                this.f22379f.m17561a(z2);
                m20643a(i, i2, true, false);
                return;
            }
            return;
        }
        m20643a(i, i2, false, true);
    }

    private final void m20643a(int i, int i2, boolean z, boolean z2) {
        int measuredHeight;
        if (z) {
            this.f22379f.measure(i, 0);
            measuredHeight = this.f22379f.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f22374a.getLayoutParams();
        if (z2 && marginLayoutParams.height != -1) {
            this.f22374a.measure(i, 0);
        }
        if (MeasureSpec.getMode(i2) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            measuredHeight = MeasureSpec.getSize(i2);
        } else {
            measuredHeight = ((((measuredHeight + getPaddingTop()) + getPaddingBottom()) + marginLayoutParams.topMargin) + this.f22374a.getMeasuredHeight()) + marginLayoutParams.bottomMargin;
        }
        setMeasuredDimension(MeasureSpec.getSize(i), measuredHeight);
        if (marginLayoutParams.height == -1) {
            this.f22374a.measure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
    }

    public final boolean mo2996a(float f, float f2) {
        return f >= ((float) this.f22374a.getLeft()) && f < ((float) this.f22374a.getRight()) && f2 >= ((float) this.f22374a.getTop()) && f2 < ((float) this.f22374a.getBottom());
    }

    public final void as_() {
        this.f22374a.aT = true;
    }

    public int getHorizontalScrollerTop() {
        return this.f22374a.getTop();
    }

    public int getHorizontalScrollerBottom() {
        return this.f22374a.getBottom();
    }

    public int getMarginOffset() {
        return 0;
    }

    public ad getPlayStoreUiElementNode() {
        return this.f22380g;
    }

    public final void mo4190c() {
        this.f22377d.mo4195a(this);
    }

    public final void mo3579a(View view) {
        this.f22377d.mo4194a(this.f22380g);
    }

    public final void mo3580c(View view) {
        this.f22377d.mo4194a(this.f22380g);
    }
}
