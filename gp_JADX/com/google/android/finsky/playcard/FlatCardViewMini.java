package com.google.android.finsky.playcard;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatCardViewMini extends C3893r implements cn, co, cp {
    public C1611k f19387a;
    public int f19388b;
    public int f19389c;
    public boolean f19390d;
    public boolean f19391e;
    public boolean f19392f;
    public Drawable f19393g;
    public Drawable f19394h;
    public boolean f19395i;
    public FadingEdgeTextView f19396j;
    public TextView f19397k;

    public FlatCardViewMini(Context context) {
        this(context, null);
    }

    public FlatCardViewMini(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19388b = -1;
        this.f19390d = false;
        this.f19391e = false;
        ((ae) C3947d.m18649a(ae.class)).mo1878a(this);
        this.f19388b = this.f19387a.m9280e(context.getResources());
        this.f19389c = 2;
        this.f19393g = m18405c(false);
        this.f19394h = m18405c(true);
    }

    public void setTitleVisibility(int i) {
        if (this.f19396j != null) {
            this.f19396j.setVisibility(i);
        } else {
            super.setTitleVisibility(i);
        }
    }

    public void setTitleText(CharSequence charSequence) {
        if (this.f19396j != null) {
            this.f19396j.setText(charSequence);
        } else {
            super.setTitleText(charSequence);
        }
    }

    public void setTitleContentDescription(String str) {
        if (this.f19396j != null) {
            this.f19396j.setContentDescription(str);
        } else {
            super.setTitleContentDescription(str);
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        Resources resources = getResources();
        if (this.q.dj().mo2294a(12631598)) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(C7582R.dimen.flat_mini_card_side_padding_v2);
            setPadding(dimensionPixelSize, getPaddingTop(), dimensionPixelSize, getPaddingBottom());
        }
        if (this.q.dj().mo2294a(12632714)) {
            LayoutParams layoutParams = (LayoutParams) this.V.getLayoutParams();
            layoutParams.topMargin = resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_title_top_margin_large_tablet);
            this.V.setLayoutParams(layoutParams);
            this.V.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_title_size_large_tablet));
            this.ab.setTextSize(0, (float) resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_subtitle_size_large_tablet));
            this.ah.setTextSize((float) resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_label_size_large_tablet));
            this.ad.setTextSize(resources.getDimensionPixelSize(C7582R.dimen.flat_rating_bar_text_size_large_tablet));
            layoutParams = (LayoutParams) this.af.getLayoutParams();
            layoutParams.topMargin = resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_overflow_top_margin_large_tablet);
            layoutParams.height = resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_overflow_height);
            layoutParams.width = resources.getDimensionPixelSize(C7582R.dimen.flat_mini_card_overflow_width);
            this.af.setLayoutParams(layoutParams);
        }
        if (this.q.dj().mo2294a(12632790)) {
            this.f19396j = (FadingEdgeTextView) findViewById(C7582R.id.li_fading_edge_title);
        }
        this.af.setImageDrawable(this.f19393g);
        this.f19397k = (TextView) findViewById(C7582R.id.li_app_download_size);
    }

    public final void mo3836a(CharSequence charSequence) {
        this.f19397k.setVisibility(0);
        this.f19397k.setText(charSequence);
    }

    public final void ar_() {
        this.f19397k.setVisibility(8);
    }

    public void setTitleMaxLines(int i) {
        if (this.f19389c != i) {
            this.f19389c = i;
            if (this.f19396j != null) {
                this.f19396j.setMaxLines(i);
            } else {
                this.V.setMaxLines(i);
            }
        }
    }

    public final void mo3837a(boolean z) {
        this.f19391e = z;
    }

    public final boolean mo3839b(boolean z) {
        return false;
    }

    public void setAlwaysShowSubtitle(boolean z) {
        this.f19390d = z;
    }

    private final int m18428f() {
        if (this.f19388b == -1) {
            this.f19388b = this.f19387a.m9280e(getResources());
        }
        return this.f19388b;
    }

    public void setIsPartOfMixedContentCluster(boolean z) {
        this.f19392f = z;
    }

    private static boolean m18427b(int i) {
        return i <= 1;
    }

    public final boolean at_() {
        if (m18427b(this.f19389c)) {
            return true;
        }
        return super.at_();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m18429a(int r5) {
        /*
        r4 = this;
        r1 = android.view.View.MeasureSpec.getSize(r5);
        r0 = r4.U;
        r0 = r0.getLayoutParams();
        r0 = (android.view.ViewGroup.MarginLayoutParams) r0;
        r2 = r4.U;
        r2 = r2.getVisibility();
        r3 = 8;
        if (r2 == r3) goto L_0x0051;
    L_0x0016:
        r2 = r4.getPaddingTop();
        r1 = r1 - r2;
        r2 = r4.getPaddingBottom();
        r1 = r1 - r2;
        r2 = r0.topMargin;
        r1 = r1 - r2;
        r2 = r0.bottomMargin;
        r1 = r1 - r2;
        r2 = r4.m18428f();
        r1 = r1 - r2;
        r0.height = r1;
        r2 = r4.am;
        r1 = r4.U;
        r1 = r1.getImageView();
        r3 = r1 instanceof com.google.android.finsky.detailscomponents.DocImageView;
        if (r3 == 0) goto L_0x0055;
    L_0x0039:
        r1 = (com.google.android.finsky.detailscomponents.DocImageView) r1;
        r1 = r1.getAspectRatio();
        r3 = java.lang.Float.isNaN(r1);
        if (r3 != 0) goto L_0x0055;
    L_0x0045:
        r2 = r0.height;
        r2 = (float) r2;
        r1 = r2 / r1;
        r1 = java.lang.Math.round(r1);
        r0.width = r1;
    L_0x0050:
        return;
    L_0x0051:
        r1 = 0;
        r0.width = r1;
        goto L_0x0050;
    L_0x0055:
        r1 = r2;
        goto L_0x0045;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.playcard.FlatCardViewMini.a(int):void");
    }

    protected void onMeasure(int i, int i2) {
        View view;
        if (this.f19392f) {
            a(i2);
        } else {
            c(i);
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        int i3 = marginLayoutParams.height;
        int f = ((m18428f() + i3) + getPaddingTop()) + getPaddingBottom();
        if (mode == MemoryMappedFileBuffer.DEFAULT_SIZE && size > 0) {
            f = size;
        }
        size = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f19392f) {
            mode = (marginLayoutParams.width + size) + paddingRight;
        } else {
            mode = MeasureSpec.getSize(i);
        }
        int i4 = (mode - size) - paddingRight;
        this.U.measure(MeasureSpec.makeMeasureSpec(i4, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(i3, MemoryMappedFileBuffer.DEFAULT_SIZE));
        int a = k.a(this.ab);
        int dimension = (int) getResources().getDimension(C7582R.dimen.play_card_mini_label_margin);
        if (this.o != null) {
            if (this.W == null || this.W.getVisibility() == 8) {
                this.o.setVisibility(8);
            } else {
                this.o.setVisibility(0);
                this.o.measure(MeasureSpec.makeMeasureSpec((i4 - this.U.getPaddingLeft()) - this.U.getPaddingRight(), Integer.MIN_VALUE), 0);
            }
        }
        if (this.ah.getVisibility() != 8) {
            this.ah.measure(MeasureSpec.makeMeasureSpec(i4 - dimension, Integer.MIN_VALUE), 0);
        } else {
            this.ah.measure(MeasureSpec.makeMeasureSpec(0, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        }
        int measuredWidth = this.ah.getMeasuredWidth() + dimension;
        if (this.f19396j != null) {
            view = this.f19396j;
        } else {
            view = this.V;
        }
        marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        paddingRight = C0361r.m2051b(marginLayoutParams);
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.af.getLayoutParams();
        this.af.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams2.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(marginLayoutParams2.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
        if (this.af.getVisibility() != 8) {
            size = Math.max(paddingRight, (C0361r.m2051b(marginLayoutParams2) + this.af.getMeasuredWidth()) - getResources().getDimensionPixelSize(C7582R.dimen.flat_mini_card_title_overflow_overlap));
        } else {
            size = paddingRight;
        }
        view.measure(MeasureSpec.makeMeasureSpec((i4 - C0361r.m2049a(marginLayoutParams)) - size, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        this.al.measure(0, 0);
        setMeasuredDimension(mode, f);
        if (this.al.getVisibility() != 0) {
            Object obj = this.ab.getVisibility() != 8 ? 1 : null;
            Object obj2 = this.f19397k.getVisibility() != 8 ? 1 : null;
            Object obj3 = this.ad.getVisibility() != 8 ? 1 : null;
            if (this.f19396j != null) {
                mode = this.f19396j.getLineCount();
            } else {
                mode = this.V.getLineCount();
            }
            if (obj != null && m18427b(r3)) {
                this.ab.measure(MeasureSpec.makeMeasureSpec(i4 - a, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                obj = null;
            }
            mode = i4 - measuredWidth;
            if (obj != null) {
                mode = Math.max(mode - a, 0);
                if (this.f19390d || mode >= i4 / 2) {
                    this.ab.measure(MeasureSpec.makeMeasureSpec(mode, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                    obj = null;
                }
            } else if (obj2 != null) {
                this.f19397k.measure(0, 0);
                if (this.f19397k.getMeasuredWidth() + k.a(this.f19397k) <= mode) {
                    obj2 = null;
                }
            } else if (obj3 != null) {
                this.ad.measure(0, 0);
                if (this.ad.getMeasuredWidth() + k.a(this.ad) <= mode) {
                    obj3 = null;
                }
            }
            if (obj != null) {
                this.ab.setVisibility(4);
            }
            if (obj2 != null) {
                this.f19397k.setVisibility(4);
            }
            if (obj3 != null) {
                this.ad.setVisibility(4);
            }
        }
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        int lineCount;
        View view;
        MarginLayoutParams marginLayoutParams;
        int i5;
        int dimension;
        int measuredHeight;
        int measuredWidth;
        if (ai.f1848a.mo400k(this) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int width = getWidth();
        int height = getHeight();
        View view2;
        if (this.f19396j != null) {
            view2 = this.f19396j;
            lineCount = this.f19396j.getLineCount();
            view = view2;
        } else {
            view2 = this.V;
            lineCount = this.V.getLineCount();
            view = view2;
        }
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) view.getLayoutParams();
        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) this.ab.getLayoutParams();
        MarginLayoutParams marginLayoutParams4 = (MarginLayoutParams) this.ad.getLayoutParams();
        MarginLayoutParams marginLayoutParams5 = (MarginLayoutParams) this.f19397k.getLayoutParams();
        MarginLayoutParams marginLayoutParams6 = (MarginLayoutParams) this.ah.getLayoutParams();
        MarginLayoutParams marginLayoutParams7 = (MarginLayoutParams) this.af.getLayoutParams();
        if (this.o != null) {
            marginLayoutParams = (MarginLayoutParams) this.o.getLayoutParams();
        } else {
            marginLayoutParams = null;
        }
        int measuredWidth2 = this.U.getMeasuredWidth();
        int measuredHeight2 = this.U.getMeasuredHeight();
        int a = k.a(width, measuredWidth2, z2, l);
        this.U.layout(a, paddingTop, measuredWidth2 + a, paddingTop + measuredHeight2);
        if (!(this.o == null || this.o.getVisibility() == 8)) {
            measuredWidth2 = this.o.getMeasuredWidth();
            a = C0361r.m2049a(marginLayoutParams);
            int i6 = paddingTop + measuredHeight2;
            if (this.ax) {
                i5 = 0;
            } else {
                i5 = this.U.getPaddingTop();
            }
            i5 = (i6 - i5) - this.o.getMeasuredHeight();
            measuredWidth2 = k.a(width, measuredWidth2, z2, a + (ai.f1848a.mo401l(this.U) + l));
            this.o.layout(measuredWidth2, i5, this.o.getMeasuredWidth() + measuredWidth2, this.o.getMeasuredHeight() + i5);
        }
        i5 = C0361r.m2049a(marginLayoutParams2);
        measuredWidth2 = view.getMeasuredWidth();
        measuredHeight2 = (measuredHeight2 + paddingTop) + marginLayoutParams2.topMargin;
        i5 = k.a(width, measuredWidth2, z2, i5 + l);
        view.layout(i5, measuredHeight2, measuredWidth2 + i5, view.getMeasuredHeight() + measuredHeight2);
        i5 = C0361r.m2051b(marginLayoutParams7);
        measuredWidth2 = this.af.getMeasuredWidth();
        int i7 = marginLayoutParams7.topMargin + measuredHeight2;
        i5 = k.b(width, measuredWidth2, z2, i5 + m);
        this.af.layout(i5, i7, measuredWidth2 + i5, this.af.getMeasuredHeight() + i7);
        i7 = this.ah.getMeasuredWidth();
        i5 = (height - paddingBottom) - marginLayoutParams6.bottomMargin;
        if (this.f19391e) {
            dimension = (int) getResources().getDimension(C7582R.dimen.play_card_mini_label_margin);
            measuredWidth2 = k.a(width, i7, z2, l);
            this.ah.layout(measuredWidth2, i5 - this.ah.getMeasuredHeight(), measuredWidth2 + i7, i5);
            if (i7 != 0) {
                dimension += i7 + l;
            }
            dimension = l;
        } else {
            dimension = k.b(width, i7, z2, m);
            this.ah.layout(dimension, i5 - this.ah.getMeasuredHeight(), i7 + dimension, i5);
            dimension = l;
        }
        if (this.ab.getVisibility() == 0) {
            i7 = C0361r.m2049a(marginLayoutParams3);
            measuredWidth2 = this.ab.getMeasuredWidth();
            i7 = k.a(width, measuredWidth2, z2, i7 + dimension);
            if (m18427b(lineCount)) {
                measuredHeight = (marginLayoutParams2.bottomMargin + (view.getMeasuredHeight() + measuredHeight2)) + marginLayoutParams3.topMargin;
                this.ab.layout(i7, measuredHeight, i7 + measuredWidth2, this.ab.getMeasuredHeight() + measuredHeight);
            } else {
                measuredHeight = ((i5 - this.ah.getMeasuredHeight()) + this.ah.getBaseline()) - this.ab.getBaseline();
                this.ab.layout(i7, measuredHeight, i7 + measuredWidth2, this.ab.getMeasuredHeight() + measuredHeight);
            }
        }
        if (this.f19397k.getVisibility() == 0) {
            measuredHeight = C0361r.m2049a(marginLayoutParams5);
            measuredWidth = this.f19397k.getMeasuredWidth();
            int top = (this.ah.getTop() + this.ah.getBaseline()) - this.f19397k.getBaseline();
            measuredHeight = k.a(width, measuredWidth, z2, measuredHeight + dimension);
            this.f19397k.layout(measuredHeight, top, measuredWidth + measuredHeight, this.f19397k.getMeasuredHeight() + top);
        }
        if (this.ad.getVisibility() == 0) {
            measuredHeight = C0361r.m2049a(marginLayoutParams4);
            measuredWidth = this.ad.getMeasuredWidth();
            int top2 = (this.ah.getTop() + this.ah.getBaseline()) - this.ad.getBaseline();
            measuredHeight = k.a(width, measuredWidth, z2, measuredHeight + dimension);
            this.ad.layout(measuredHeight, top2, measuredWidth + measuredHeight, this.ad.getMeasuredHeight() + top2);
        }
        measuredHeight = ((((width - l) - m) - this.al.getMeasuredWidth()) / 2) + l;
        measuredWidth = ((((height - paddingTop) - paddingBottom) - this.al.getMeasuredHeight()) / 2) + paddingTop;
        this.al.layout(measuredHeight, measuredWidth, this.al.getMeasuredWidth() + measuredHeight, this.al.getMeasuredHeight() + measuredWidth);
        e();
    }

    public int getCardType() {
        return 29;
    }

    public void setUseDarkTheme(boolean z) {
        if (this.f19395i != z) {
            int i;
            this.f19395i = z;
            Context context = getContext();
            if (z) {
                i = C7582R.color.flat_card_title_text_color_dark_theme;
            } else {
                i = C7582R.color.flat_card_title_text_color;
            }
            i = C0216d.m1116c(context, i);
            if (this.f19396j != null) {
                this.f19396j.setTextColor(i);
            } else {
                this.V.setTextColor(i);
            }
            context = getContext();
            if (z) {
                i = C7582R.color.flat_card_subtitle_text_color_dark_theme;
            } else {
                i = C7582R.color.flat_card_subtitle_text_color;
            }
            i = C0216d.m1116c(context, i);
            this.ab.setTextColor(i);
            this.f19397k.setTextColor(i);
            this.af.setImageDrawable(z ? this.f19394h : this.f19393g);
            ((FlatCardStarRatingBar) this.ad).setUseDarkTheme(z);
        }
    }

    public boolean getUseDarkTheme() {
        return this.f19395i;
    }
}
