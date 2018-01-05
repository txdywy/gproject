package com.google.android.finsky.stream.base.view;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
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
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.frameworkviews.C3075q;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4685p;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.layout.b;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import java.util.Locale;

public class FlatCardClusterViewHeader extends b implements OnClickListener, C3075q {
    public C1503a f18675a;
    public C1461c f18676b;
    public C1612l f18677c;
    public TextView f18678d;
    public TextView f18679e;
    public FifeImageView f18680f;
    public TextView f18681g;
    public View f18682h;
    public View f18683i;
    public TextView f18684j;
    public int f18685k;
    public C3687d f18686l;
    public final int f18687m;
    public final int f18688n;
    public final int f18689o;
    public final int f18690p;
    public final int f18691q;
    public boolean f18692r;
    public int f18693s;
    public String f18694t;
    public OnClickListener f18695u;
    public int f18696v;
    public int f18697w;

    public FlatCardClusterViewHeader(Context context) {
        this(context, null);
    }

    public FlatCardClusterViewHeader(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18693s = -1;
        this.f18697w = 0;
        Resources resources = context.getResources();
        this.f18696v = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.PlayCardClusterViewHeader);
        this.f18689o = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f18688n = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_header_xpadding_v2);
        this.f18690p = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_header_height_large_tablet);
        this.f18691q = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f18687m = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_header_icon_size);
        obtainStyledAttributes.recycle();
    }

    public void onFinishInflate() {
        int i;
        ((C1420i) C3947d.m18649a(C1420i.class)).mo1921a(this);
        super.onFinishInflate();
        setTag(C7582R.id.accept_page_margin, "");
        if (this.f18676b.dj().mo2294a(12632714)) {
            i = this.f18690p;
        } else {
            i = this.f18691q;
        }
        this.f18685k = i;
        if (this.f18676b.dj().mo2294a(12631598)) {
            i = this.f18688n;
        } else {
            i = this.f18689o;
        }
        ai.m1823a(this, i, 0, i, 0);
        this.f18680f = (FifeImageView) findViewById(C7582R.id.cluster_image);
        this.f18681g = (TextView) findViewById(C7582R.id.li_ad_label_v2);
        this.f18682h = findViewById(C7582R.id.li_ad_label_container);
        this.f18683i = findViewById(C7582R.id.cluster_title);
        this.f18678d = (TextView) this.f18683i.findViewById(C7582R.id.header_title_main);
        this.f18684j = (TextView) this.f18683i.findViewById(C7582R.id.header_title_secondary);
        this.f18679e = (TextView) findViewById(C7582R.id.header_more);
        if (this.f18676b.dj().mo2294a(12632714)) {
            Resources resources = getResources();
            this.f18678d.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_header_title_size_large_tablet));
            this.f18684j.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_header_subtitle_size_large_tablet));
            this.f18679e.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_header_more_size_large_tablet));
        }
        this.f18680f.setScaleType(ScaleType.FIT_CENTER);
        LayoutParams layoutParams = this.f18680f.getLayoutParams();
        layoutParams.height = this.f18687m;
        layoutParams.width = this.f18687m;
        boolean z = this.f18675a.f8184h && this.f18676b.dj().mo2294a(12638116);
        this.f18692r = z;
        if (this.f18692r) {
            setForeground(null);
        }
        this.f18695u = new C4294b(this);
    }

    public void mo3611a(C4295c c4295c, C3687d c3687d) {
        int i;
        int i2 = C7582R.color.flat_card_cluster_header_title_text_color;
        this.f18686l = c3687d;
        if (c4295c.f21661e != null) {
            this.f18677c.m9288a(this.f18680f, c4295c.f21661e.f11860f, c4295c.f21661e.f11863i);
            this.f18680f.setVisibility(0);
        } else {
            this.f18680f.setVisibility(8);
        }
        ae.m9216a(this.f18681g, c4295c.f21662f);
        this.f18678d.setText(c4295c.f21658b);
        if (c4295c.f21659c != null) {
            ae.m9216a(this.f18684j, C4685p.m21831a(c4295c.f21659c));
        } else {
            this.f18684j.setVisibility(8);
        }
        if (this.f18686l == null || TextUtils.isEmpty(c4295c.f21660d)) {
            this.f18694t = null;
            this.f18679e.setVisibility(8);
        } else {
            this.f18679e.setVisibility(0);
            if (this.f18694t == null || c4295c.f21660d.compareToIgnoreCase(this.f18694t) != 0) {
                this.f18679e.setText(c4295c.f21660d.toUpperCase(Locale.getDefault()));
                this.f18694t = c4295c.f21660d;
            }
            if (this.f18693s != c4295c.f21657a) {
                if (this.f18692r) {
                    if (c4295c.f21657a == 13) {
                        i = C7582R.color.flat_card_cluster_header_title_text_color_stateful;
                    } else {
                        i = C1608h.m9254c(c4295c.f21657a);
                    }
                    this.f18679e.setTextColor(C0216d.m1115b(getContext(), i));
                    this.f18679e.setClickable(true);
                    this.f18679e.setOnClickListener(this.f18695u);
                } else {
                    this.f18679e.setTextColor(C0216d.m1116c(getContext(), c4295c.f21657a == 13 ? C7582R.color.flat_card_cluster_header_title_text_color : C1608h.m9251b(c4295c.f21657a)));
                }
                this.f18693s = c4295c.f21657a;
            }
            setOnClickListener(this);
            setClickable(true);
        }
        switch (this.f18697w) {
            case 0:
                break;
            case 1:
                i2 = C7582R.color.flat_card_cluster_header_title_text_color_dark_theme;
                break;
            case 2:
                i2 = C7582R.color.flat_card_cluster_header_title_text_color_black;
                break;
            default:
                i2 = 0;
                break;
        }
        i = C0216d.m1116c(getContext(), i2);
        this.f18678d.setTextColor(i);
        this.f18684j.setTextColor(i);
    }

    public void setTextShade(int i) {
        this.f18697w = i;
    }

    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        int size = MeasureSpec.getSize(i);
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        if (this.f18680f.getVisibility() != 8) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f18680f.getLayoutParams();
            this.f18680f.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(marginLayoutParams.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
            measuredHeight = this.f18680f.getMeasuredHeight();
            int i4 = measuredHeight;
            measuredHeight = paddingLeft - (marginLayoutParams.rightMargin + this.f18680f.getMeasuredWidth());
            i3 = i4;
        } else {
            i3 = 0;
            measuredHeight = paddingLeft;
        }
        if (this.f18681g.getVisibility() != 8) {
            this.f18682h.setVisibility(0);
            this.f18682h.measure(0, 0);
            i3 = Math.max(i3, this.f18682h.getMeasuredHeight());
            measuredHeight -= this.f18682h.getWidth();
        } else {
            this.f18682h.setVisibility(8);
        }
        if (this.f18679e.getVisibility() != 8) {
            this.f18679e.measure(0, 0);
            i3 = Math.max(i3, this.f18679e.getMeasuredHeight());
            measuredHeight -= this.f18679e.getMeasuredWidth();
        }
        this.f18683i.measure(MeasureSpec.makeMeasureSpec(measuredHeight, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        setMeasuredDimension(size, (Math.max(Math.max(i3, this.f18683i.getMeasuredHeight()), this.f18685k) + getPaddingTop()) + getPaddingBottom());
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
        if (this.f18680f.getVisibility() != 8) {
            measuredWidth = this.f18680f.getMeasuredWidth();
            measuredHeight = this.f18680f.getMeasuredHeight();
            int i5 = ((((height - measuredHeight) - paddingTop) - paddingBottom) / 2) + paddingTop;
            int a = k.a(width, measuredWidth, z2, l);
            this.f18680f.layout(a, i5, a + measuredWidth, measuredHeight + i5);
            l = (C0361r.m2051b((MarginLayoutParams) this.f18680f.getLayoutParams()) + measuredWidth) + l;
        }
        measuredHeight = 0;
        if (this.f18682h.getVisibility() != 8) {
            measuredWidth = this.f18682h.getMeasuredWidth();
            measuredHeight = this.f18682h.getMeasuredHeight();
            i5 = k.a(width, measuredWidth, z2, l);
            a = ((height - measuredHeight) / 2) + paddingTop;
            this.f18682h.layout(i5, a, i5 + measuredWidth, measuredHeight + a);
            l += C0361r.m2051b((MarginLayoutParams) this.f18680f.getLayoutParams());
            measuredHeight = measuredWidth;
        }
        measuredWidth = this.f18683i.getMeasuredWidth();
        measuredHeight = k.a(width, measuredWidth, z2, measuredHeight + l);
        this.f18683i.layout(measuredHeight, paddingTop, measuredWidth + measuredHeight, height - paddingBottom);
        if (this.f18679e.getVisibility() != 8) {
            measuredHeight = this.f18679e.getMeasuredWidth();
            l = this.f18679e.getMeasuredHeight();
            measuredWidth = ((((height - l) - paddingTop) - paddingBottom) / 2) + paddingTop;
            int b = k.b(width, measuredHeight, z2, ai.f1848a.mo402m(this));
            this.f18679e.layout(b, measuredWidth, measuredHeight + b, l + measuredWidth);
        }
    }

    public final void m17561a(boolean z) {
        if (z) {
            this.f18679e.setVisibility(8);
        } else if (this.f18694t != null) {
            this.f18679e.setVisibility(0);
        }
    }

    public final boolean ap_() {
        return true;
    }

    public final boolean aq_() {
        return false;
    }

    public int getDividerSize() {
        return 0;
    }

    public int getSectionBottomSpacerSize() {
        return this.f18696v;
    }

    public void onClick(View view) {
        if (this.f18686l != null) {
            this.f18686l.mo3579a(view);
        }
    }
}
