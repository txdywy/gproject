package com.google.android.finsky.stream.controllers.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.detailscomponents.C2584j;
import com.google.android.finsky.detailscomponents.C2585k;
import com.google.android.finsky.frameworkviews.C2621k;
import com.google.android.finsky.frameworkviews.C2622l;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4257k;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4269h;
import com.google.android.finsky.stream.base.horizontalclusters.view.C4275j;
import com.google.android.finsky.stream.base.horizontalclusters.view.HorizontalClusterRecyclerView;
import com.google.android.finsky.stream.base.view.C3687d;
import com.google.android.finsky.stream.base.view.C4295c;
import com.google.android.finsky.stream.base.view.FlatCardClusterViewHeader;
import com.google.android.finsky.stream.controllers.ca;
import com.google.android.play.p184e.C2629a;
import com.google.android.play.p203b.C3918i;
import com.google.android.play.p203b.C6270j;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatCardScreenshotClusterViewV2 extends RelativeLayout implements C2584j, C2585k, ae, C2621k, C2622l, C4269h, C4275j, C3687d, C2629a {
    public HorizontalClusterRecyclerView f22885a;
    public int f22886b;
    public int f22887c;
    public float f22888d;
    public C4303e f22889e;
    public C4257k f22890f;
    public FlatCardClusterViewHeader f22891g;
    public C2473o f22892h;
    public boolean f22893i;
    public C1461c f22894j;

    public C3918i getCardViewGroupDelegate() {
        return C6270j.f31324a;
    }

    public FlatCardScreenshotClusterViewV2(Context context) {
        this(context, null);
    }

    public FlatCardScreenshotClusterViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C4295c c4295c = new C4295c();
        getCardViewGroupDelegate().mo3865a(this, context, attributeSet, 0);
        Resources resources = getContext().getResources();
        this.f22886b = resources.getDimensionPixelSize(C7582R.dimen.flat_feature_graphic_card_xpadding);
        this.f22887c = resources.getDimensionPixelSize(C7582R.dimen.flat_feature_graphic_card_content_height);
    }

    protected void onFinishInflate() {
        ((ca) C3947d.m18649a(ca.class)).mo1950a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22891g = (FlatCardClusterViewHeader) findViewById(C7582R.id.cluster_header);
        this.f22885a = (HorizontalClusterRecyclerView) findViewById(C7582R.id.cluster_content);
        if (this.f22894j.dj().mo2294a(12632714)) {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_content_bottom_padding_large_tablet));
        }
        this.f22885a.setBaseWidthMultiplier(2.0f);
    }

    public final void Z_() {
        this.f22889e = null;
        this.f22890f = null;
        this.f22885a.Z_();
    }

    public final void m21004a(Bundle bundle) {
        this.f22885a.m19812a(bundle);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.f22891g == null || this.f22891g.getVisibility() == 8) {
            i5 = paddingTop;
        } else {
            this.f22891g.layout(0, paddingTop, width, this.f22891g.getMeasuredHeight() + paddingTop);
            i5 = paddingTop + this.f22891g.getMeasuredHeight();
        }
        paddingTop = ((MarginLayoutParams) this.f22885a.getLayoutParams()).topMargin + i5;
        this.f22885a.layout(0, paddingTop, width, this.f22885a.getMeasuredHeight() + paddingTop);
    }

    protected void onMeasure(int i, int i2) {
        boolean z = (this.f22891g == null || this.f22891g.getVisibility() == 8) ? false : true;
        if (z) {
            z = this.f22885a.bg;
            this.f22891g.m17561a(z);
            m21001a(i, i2, true, true);
            boolean z2 = this.f22885a.bg;
            if (z != z2) {
                this.f22891g.m17561a(z2);
                m21001a(i, i2, true, false);
                return;
            }
            return;
        }
        m21001a(i, i2, false, true);
    }

    private final void m21001a(int i, int i2, boolean z, boolean z2) {
        int measuredHeight;
        if (z) {
            this.f22891g.measure(i, 0);
            measuredHeight = this.f22891g.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f22885a.getLayoutParams();
        if (z2 && marginLayoutParams.height != -1) {
            this.f22885a.measure(i, 0);
        }
        if (MeasureSpec.getMode(i2) == MemoryMappedFileBuffer.DEFAULT_SIZE) {
            measuredHeight = MeasureSpec.getSize(i2);
        } else {
            measuredHeight = ((((measuredHeight + getPaddingTop()) + getPaddingBottom()) + marginLayoutParams.topMargin) + this.f22885a.getMeasuredHeight()) + marginLayoutParams.bottomMargin;
        }
        setMeasuredDimension(MeasureSpec.getSize(i), measuredHeight);
        if (marginLayoutParams.height == -1) {
            this.f22885a.measure(i, MeasureSpec.makeMeasureSpec(getMeasuredHeight(), MemoryMappedFileBuffer.DEFAULT_SIZE));
        }
    }

    public final boolean mo2996a(float f, float f2) {
        return f >= ((float) this.f22885a.getLeft()) && f < ((float) this.f22885a.getRight()) && f2 >= ((float) this.f22885a.getTop()) && f2 < ((float) this.f22885a.getBottom());
    }

    public final void as_() {
        this.f22885a.aT = true;
    }

    public int getHorizontalScrollerTop() {
        return this.f22885a.getTop();
    }

    public int getHorizontalScrollerBottom() {
        return this.f22885a.getBottom();
    }

    public int getMarginOffset() {
        return 0;
    }

    public ad getPlayStoreUiElementNode() {
        return this.f22892h;
    }

    public final void mo4190c() {
        this.f22889e.mo4107a(this);
    }

    public final int mo4085a(int i) {
        return ((int) (((float) (i - (this.f22886b * 2))) * this.f22888d)) + this.f22887c;
    }

    public final int mo4084a() {
        throw new IllegalStateException("Not implemented");
    }

    public final void mo3579a(View view) {
        this.f22889e.mo4106a(this.f22892h);
    }

    public final void mo3580c(View view) {
        this.f22889e.mo4106a(this.f22892h);
    }
}
