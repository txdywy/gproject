package com.google.android.finsky.stream.controllers.emptycluster.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.frameworkviews.ClusterHeaderView;
import com.google.android.finsky.frameworkviews.ae;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class EmptyClusterView extends RelativeLayout implements ad, ae {
    public C1612l f22260a;
    public ClusterHeaderView f22261b;
    public FifeImageView f22262c;
    public TextView f22263d;
    public ad f22264e;
    public ce f22265f;

    public EmptyClusterView(Context context) {
        this(context, null);
    }

    public EmptyClusterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        ((C1429b) C3947d.m18649a(C1429b.class)).mo1930a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        this.f22261b = (ClusterHeaderView) findViewById(C7582R.id.cluster_header);
        this.f22262c = (FifeImageView) findViewById(C7582R.id.empty_image);
        this.f22263d = (TextView) findViewById(C7582R.id.empty_text);
        this.f22265f = C2482j.m13283a(416);
    }

    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        int size = MeasureSpec.getSize(i);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.f22261b.getVisibility() != 8) {
            this.f22261b.measure(i, 0);
            measuredHeight = paddingTop + this.f22261b.getMeasuredHeight();
        } else {
            measuredHeight = paddingTop;
        }
        if (this.f22262c.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f22262c.getLayoutParams();
            this.f22262c.measure(i, MeasureSpec.makeMeasureSpec(marginLayoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
            measuredHeight += marginLayoutParams.bottomMargin + (marginLayoutParams.topMargin + this.f22262c.getMeasuredHeight());
        }
        this.f22263d.measure(MeasureSpec.makeMeasureSpec(size / 2, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        setMeasuredDimension(size, this.f22263d.getMeasuredHeight() + measuredHeight);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredHeight;
        int width = getWidth();
        int paddingTop = getPaddingTop();
        if (this.f22261b.getVisibility() != 8) {
            this.f22261b.layout(0, paddingTop, width, this.f22261b.getMeasuredHeight() + paddingTop);
            measuredHeight = paddingTop + this.f22261b.getMeasuredHeight();
        } else {
            measuredHeight = paddingTop;
        }
        if (this.f22262c.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f22262c.getLayoutParams();
            measuredHeight += marginLayoutParams.topMargin;
            this.f22262c.layout(0, measuredHeight, width, this.f22262c.getMeasuredHeight() + measuredHeight);
            measuredHeight += marginLayoutParams.bottomMargin + this.f22262c.getMeasuredHeight();
        }
        paddingTop = this.f22263d.getMeasuredWidth();
        width = (width - paddingTop) / 2;
        this.f22263d.layout(width, measuredHeight, paddingTop + width, this.f22263d.getMeasuredHeight() + measuredHeight);
    }

    public final void Z_() {
        this.f22261b.Z_();
        this.f22262c.a();
        this.f22264e = null;
    }

    public ce getPlayStoreUiElement() {
        return this.f22265f;
    }

    public ad getParentNode() {
        return this.f22264e;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }
}
