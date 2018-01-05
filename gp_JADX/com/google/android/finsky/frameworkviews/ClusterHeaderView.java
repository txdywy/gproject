package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1606f;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.layout.b;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public final class ClusterHeaderView extends b implements OnClickListener, ae {
    public C1461c f16164a;
    public C1612l f16165b;
    public C1606f f16166c;
    public CircularImageView f16167d;
    public View f16168e;
    public TextView f16169f;
    public View f16170g;
    public TextView f16171h;
    public TextView f16172i;
    public TextView f16173j;
    public final int f16174k;
    public final int f16175l;
    public final int f16176m;
    public final int f16177n;
    public final int f16178o;
    public int f16179p;
    public String f16180q;
    public int f16181r;
    public int f16182s;
    public int f16183t;
    public C3142g f16184u;

    public ClusterHeaderView(Context context) {
        this(context, null);
    }

    public ClusterHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.PlayCardClusterViewHeader);
        this.f16178o = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f16174k = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f16176m = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_icon_size);
        this.f16177n = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_icon_background_size);
        this.f16175l = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_vpadding);
        obtainStyledAttributes.recycle();
        ai.m1823a(this, this.f16174k, 0, this.f16174k, 0);
    }

    protected final void onFinishInflate() {
        int dimensionPixelSize;
        ((C1387u) C3947d.m18649a(C1387u.class)).mo1843a(this);
        super.onFinishInflate();
        if (this.f16164a.dj().mo2294a(12632714)) {
            dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_header_height_large_tablet);
        } else {
            dimensionPixelSize = this.f16178o;
        }
        this.f16179p = dimensionPixelSize;
        this.f16167d = (CircularImageView) findViewById(C7582R.id.cluster_image);
        this.f16169f = (TextView) findViewById(C7582R.id.li_ad_label);
        this.f16168e = findViewById(C7582R.id.li_ad_label_container);
        this.f16170g = findViewById(C7582R.id.cluster_title);
        this.f16171h = (TextView) this.f16170g.findViewById(C7582R.id.header_title_main);
        this.f16172i = (TextView) this.f16170g.findViewById(C7582R.id.header_title_secondary);
        Resources resources = getResources();
        this.f16173j = (TextView) findViewById(C7582R.id.header_more);
        dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_more_xpadding_v2);
        ai.m1823a(this.f16173j, dimensionPixelSize, this.f16173j.getPaddingTop(), dimensionPixelSize, this.f16173j.getPaddingBottom());
        if (this.f16166c.m9233a()) {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_title_vpadding_v2);
            ai.m1823a(this.f16170g, ai.f1848a.mo401l(this.f16170g), dimensionPixelSize, ai.f1848a.mo402m(this.f16170g), dimensionPixelSize);
            this.f16171h.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_title_size_v2));
            this.f16172i.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_subtitle_size_v2));
            this.f16173j.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_more_size_v2));
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f16172i.getLayoutParams();
            marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            this.f16172i.setLayoutParams(marginLayoutParams);
        }
        this.f16181r = getPaddingTop();
        this.f16182s = getPaddingLeft();
        this.f16183t = getPaddingRight();
        setOnClickListener(this);
    }

    protected final void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        int size = MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.f16167d.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f16167d.getLayoutParams();
            this.f16167d.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(marginLayoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
            measuredHeight = this.f16167d.getMeasuredHeight();
            int i4 = measuredHeight;
            measuredHeight = paddingLeft - (marginLayoutParams.rightMargin + this.f16167d.getMeasuredWidth());
            i3 = i4;
        } else {
            i3 = 0;
            measuredHeight = paddingLeft;
        }
        if (this.f16169f.getVisibility() != 8) {
            this.f16168e.setVisibility(0);
            this.f16168e.measure(0, 0);
            i3 = Math.max(i3, this.f16168e.getMeasuredHeight());
            measuredHeight -= this.f16168e.getMeasuredWidth();
        } else {
            this.f16168e.setVisibility(8);
        }
        if (this.f16173j.getVisibility() != 8) {
            this.f16173j.measure(0, 0);
            i3 = Math.max(i3, this.f16173j.getMeasuredHeight());
            measuredHeight -= this.f16173j.getMeasuredWidth();
        }
        this.f16170g.measure(MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        measuredHeight = Math.max(i3, this.f16170g.getMeasuredHeight());
        i3 = this.f16179p;
        if (this.f16166c.m9233a()) {
            Resources resources = getResources();
            if (this.f16172i.getVisibility() == 8) {
                i3 = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_height_v2);
            } else {
                i3 = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_height_with_subtitle_v2);
            }
        }
        setMeasuredDimension(size, (Math.max(measuredHeight, i3) + getPaddingTop()) + getPaddingBottom());
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int measuredHeight;
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int height = getHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int l = ai.f1848a.mo401l(this);
        if (this.f16167d.getVisibility() != 8) {
            measuredWidth = this.f16167d.getMeasuredWidth();
            measuredHeight = this.f16167d.getMeasuredHeight();
            int i5 = ((((height - measuredHeight) - paddingTop) - paddingBottom) / 2) + paddingTop;
            int a = k.a(width, measuredWidth, z2, l);
            this.f16167d.layout(a, i5, a + measuredWidth, measuredHeight + i5);
            l = (C0361r.m2051b((MarginLayoutParams) this.f16167d.getLayoutParams()) + measuredWidth) + l;
        }
        measuredHeight = 0;
        if (this.f16168e.getVisibility() != 8) {
            measuredWidth = this.f16168e.getMeasuredWidth();
            measuredHeight = this.f16168e.getMeasuredHeight();
            i5 = k.a(width, measuredWidth, z2, l);
            a = ((height - measuredHeight) / 2) + paddingTop;
            this.f16168e.layout(i5, a, i5 + measuredWidth, measuredHeight + a);
            l += C0361r.m2051b((MarginLayoutParams) this.f16167d.getLayoutParams());
            measuredHeight = measuredWidth;
        }
        measuredWidth = this.f16170g.getMeasuredWidth();
        l = k.a(width, measuredWidth, z2, l);
        this.f16170g.layout(l + measuredHeight, paddingTop, (measuredHeight + l) + measuredWidth, height - paddingBottom);
        if (this.f16173j.getVisibility() != 8) {
            measuredHeight = this.f16173j.getMeasuredWidth();
            l = this.f16173j.getMeasuredHeight();
            measuredWidth = ((((height - l) - paddingTop) - paddingBottom) / 2) + paddingTop;
            int b = k.b(width, measuredHeight, z2, ai.f1848a.mo402m(this));
            this.f16173j.layout(b, measuredWidth, measuredHeight + b, l + measuredWidth);
        }
    }

    public final void onClick(View view) {
        if (this.f16184u != null) {
            this.f16184u.m16042a();
        }
    }

    public final void Z_() {
        this.f16184u = null;
    }
}
