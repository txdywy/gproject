package com.google.android.finsky.stream.base.playcluster;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import com.android.vending.C0629a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1606f;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.frameworkviews.CircularImageView;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.stream.base.C1419m;
import com.google.android.finsky.utils.C4685p;
import com.google.android.play.layout.b;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class PlayCardClusterViewHeader extends b {
    public C1461c f21609a;
    public C1612l f21610b;
    public C1606f f21611c;
    public CircularImageView f21612d;
    public TextView f21613e;
    public View f21614f;
    public View f21615g;
    public TextView f21616h;
    public TextView f21617i;
    public TextView f21618j;
    public final int f21619k;
    public final int f21620l;
    public final int f21621m;
    public final int f21622n;
    public int f21623o;
    public int f21624p;
    public String f21625q;

    public PlayCardClusterViewHeader(Context context) {
        this(context, null);
    }

    public PlayCardClusterViewHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21624p = -1;
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.PlayCardClusterViewHeader);
        this.f21622n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f21619k = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f21620l = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_icon_size);
        this.f21621m = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_icon_background_size);
        resources.getDimensionPixelSize(C7582R.dimen.play_cluster_vpadding);
        obtainStyledAttributes.recycle();
        ai.m1823a(this, this.f21619k, 0, this.f21619k, 0);
    }

    protected void onFinishInflate() {
        int dimensionPixelSize;
        ((C1419m) C3947d.m18649a(C1419m.class)).mo1917a(this);
        super.onFinishInflate();
        if (this.f21609a.dj().mo2294a(12632714)) {
            dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_header_height_large_tablet);
        } else {
            dimensionPixelSize = this.f21622n;
        }
        this.f21623o = dimensionPixelSize;
        this.f21612d = (CircularImageView) findViewById(C7582R.id.cluster_image);
        this.f21613e = (TextView) findViewById(C7582R.id.li_ad_label);
        this.f21614f = findViewById(C7582R.id.li_ad_label_container);
        this.f21615g = findViewById(C7582R.id.cluster_title);
        this.f21616h = (TextView) this.f21615g.findViewById(C7582R.id.header_title_main);
        this.f21617i = (TextView) this.f21615g.findViewById(C7582R.id.header_title_secondary);
        Resources resources = getResources();
        this.f21618j = (TextView) findViewById(C7582R.id.header_more);
        dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_more_xpadding_v2);
        ai.m1823a(this.f21618j, dimensionPixelSize, this.f21618j.getPaddingTop(), dimensionPixelSize, this.f21618j.getPaddingBottom());
        if (this.f21611c.m9233a()) {
            dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_title_vpadding_v2);
            ai.m1823a(this.f21615g, ai.f1848a.mo401l(this.f21615g), dimensionPixelSize, ai.f1848a.mo402m(this.f21615g), dimensionPixelSize);
            this.f21616h.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_title_size_v2));
            this.f21617i.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_subtitle_size_v2));
            this.f21618j.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_more_size_v2));
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f21617i.getLayoutParams();
            marginLayoutParams.setMargins(0, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            this.f21617i.setLayoutParams(marginLayoutParams);
        }
    }

    public final void m19879a(int i, String str, String str2, String str3, OnClickListener onClickListener) {
        m19880a(i, str, str2, str3, onClickListener, null, null, null);
    }

    public TextView getTitleView() {
        return this.f21616h;
    }

    public final void m19880a(int i, String str, String str2, String str3, OnClickListener onClickListener, bd bdVar, Integer num, CharSequence charSequence) {
        getContext();
        if (bdVar != null) {
            this.f21610b.m9288a(this.f21612d, bdVar.f11860f, bdVar.f11863i);
            this.f21612d.setVisibility(0);
        } else {
            this.f21612d.setVisibility(8);
        }
        LayoutParams layoutParams;
        if (this.f21612d.getVisibility() != 0 || num == null) {
            this.f21612d.setScaleType(ScaleType.FIT_CENTER);
            layoutParams = this.f21612d.getLayoutParams();
            layoutParams.height = this.f21620l;
            layoutParams.width = this.f21620l;
        } else {
            this.f21612d.setBackgroundPaintColor(num.intValue());
            layoutParams = this.f21612d.getLayoutParams();
            layoutParams.height = this.f21621m;
            layoutParams.width = this.f21621m;
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.f21613e.setVisibility(8);
        } else {
            this.f21613e.setVisibility(0);
            this.f21613e.setText(charSequence);
            C0259a.m1514a(this.f21613e.getBackground(), Integer.valueOf(C0216d.m1116c(getContext(), C7582R.color.ad_badge_cluster_color)).intValue());
        }
        this.f21616h.setText(str);
        if (TextUtils.isEmpty(str2)) {
            this.f21617i.setVisibility(8);
        } else {
            this.f21617i.setText(C4685p.m21831a(str2));
            this.f21617i.setVisibility(0);
        }
        if (onClickListener == null || TextUtils.isEmpty(str3)) {
            this.f21625q = null;
            this.f21618j.setVisibility(8);
            return;
        }
        this.f21618j.setVisibility(0);
        if (this.f21625q == null || str3.compareToIgnoreCase(this.f21625q) != 0) {
            this.f21618j.setText(str3.toUpperCase());
            this.f21625q = str3;
        }
        if (this.f21624p != i) {
            this.f21618j.setTextColor(getResources().getColor(C1608h.m9256d(i)));
            this.f21624p = i;
        }
        setOnClickListener(onClickListener);
        setClickable(true);
    }

    public void setExtraHorizontalPadding(int i) {
        ai.m1823a(this, this.f21619k + i, 0, this.f21619k + i, 0);
    }

    public final void m19878a(int i, String str, int i2) {
        m19879a(i, str, null, null, null);
        setExtraHorizontalPadding(i2);
    }

    public final void m19881a(CharSequence charSequence, CharSequence charSequence2) {
        int i;
        int i2 = 8;
        this.f21616h.setText(charSequence);
        TextView textView = this.f21616h;
        if (TextUtils.isEmpty(charSequence)) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        this.f21617i.setText(charSequence2);
        TextView textView2 = this.f21617i;
        if (!TextUtils.isEmpty(charSequence2)) {
            i2 = 0;
        }
        textView2.setVisibility(i2);
    }

    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        int size = MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.f21612d.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f21612d.getLayoutParams();
            this.f21612d.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(marginLayoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
            measuredHeight = this.f21612d.getMeasuredHeight();
            int i4 = measuredHeight;
            measuredHeight = paddingLeft - (marginLayoutParams.rightMargin + this.f21612d.getMeasuredWidth());
            i3 = i4;
        } else {
            i3 = 0;
            measuredHeight = paddingLeft;
        }
        if (this.f21613e.getVisibility() != 8) {
            this.f21614f.setVisibility(0);
            this.f21614f.measure(0, 0);
            i3 = Math.max(i3, this.f21614f.getMeasuredHeight());
            measuredHeight -= this.f21614f.getWidth();
        } else {
            this.f21614f.setVisibility(8);
        }
        if (this.f21618j.getVisibility() != 8) {
            this.f21618j.measure(0, 0);
            i3 = Math.max(i3, this.f21618j.getMeasuredHeight());
            measuredHeight -= this.f21618j.getMeasuredWidth();
        }
        this.f21615g.measure(MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        measuredHeight = Math.max(i3, this.f21615g.getMeasuredHeight());
        i3 = this.f21623o;
        if (this.f21611c.m9233a()) {
            Resources resources = getResources();
            if (this.f21617i.getVisibility() == 8) {
                i3 = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_height_v2);
            } else {
                i3 = resources.getDimensionPixelSize(C7582R.dimen.play_cluster_header_height_with_subtitle_v2);
            }
        }
        setMeasuredDimension(size, (Math.max(measuredHeight, i3) + getPaddingTop()) + getPaddingBottom());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int measuredHeight;
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int height = getHeight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int l = ai.f1848a.mo401l(this);
        if (this.f21612d.getVisibility() != 8) {
            measuredWidth = this.f21612d.getMeasuredWidth();
            measuredHeight = this.f21612d.getMeasuredHeight();
            int i5 = ((((height - measuredHeight) - paddingTop) - paddingBottom) / 2) + paddingTop;
            int a = k.a(width, measuredWidth, z2, l);
            this.f21612d.layout(a, i5, a + measuredWidth, measuredHeight + i5);
            l = (C0361r.m2051b((MarginLayoutParams) this.f21612d.getLayoutParams()) + measuredWidth) + l;
        }
        measuredHeight = 0;
        if (this.f21614f.getVisibility() != 8) {
            measuredWidth = this.f21614f.getMeasuredWidth();
            measuredHeight = this.f21614f.getMeasuredHeight();
            i5 = k.a(width, measuredWidth, z2, l);
            a = ((height - measuredHeight) / 2) + paddingTop;
            this.f21614f.layout(i5, a, i5 + measuredWidth, measuredHeight + a);
            l += C0361r.m2051b((MarginLayoutParams) this.f21612d.getLayoutParams());
            measuredHeight = measuredWidth;
        }
        measuredWidth = this.f21615g.getMeasuredWidth();
        l = k.a(width, measuredWidth, z2, l);
        this.f21615g.layout(l + measuredHeight, paddingTop, (measuredHeight + l) + measuredWidth, height - paddingBottom);
        if (this.f21618j.getVisibility() != 8) {
            measuredHeight = this.f21618j.getMeasuredWidth();
            l = this.f21618j.getMeasuredHeight();
            measuredWidth = ((((height - l) - paddingTop) - paddingBottom) / 2) + paddingTop;
            int b = k.b(width, measuredHeight, z2, ai.f1848a.mo402m(this));
            this.f21618j.layout(b, measuredWidth, measuredHeight + b, l + measuredWidth);
        }
    }

    public final void m19882a(boolean z) {
        if (z) {
            this.f21618j.setVisibility(8);
        } else if (this.f21625q != null) {
            this.f21618j.setVisibility(0);
        }
    }
}
