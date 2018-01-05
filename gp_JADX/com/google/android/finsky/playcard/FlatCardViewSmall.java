package com.google.android.finsky.playcard;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.p028a.C0216d;
import android.support.v4.view.C0361r;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.play.utils.k;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class FlatCardViewSmall extends C3893r implements cn, co, cp {
    public int f19411a;
    public View f19412b;
    public int f19413c;
    public boolean f19414d;
    public Drawable f19415e;
    public Drawable f19416f;
    public boolean f19417g;
    public FadingEdgeTextView f19418h;
    public TextView f19419i;

    public FlatCardViewSmall(Context context) {
        this(context, null);
    }

    public FlatCardViewSmall(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19411a = 1;
        this.f19413c = -1;
        this.f19413c = context.getResources().getDimensionPixelSize(C7582R.dimen.flat_small_card_content_min_height);
        this.f19415e = m18405c(false);
        this.f19416f = m18405c(true);
    }

    public void setTitleVisibility(int i) {
        if (this.f19418h != null) {
            this.f19418h.setVisibility(i);
        } else {
            super.setTitleVisibility(i);
        }
    }

    public void setTitleText(CharSequence charSequence) {
        if (this.f19418h != null) {
            this.f19418h.setText(charSequence);
        } else {
            super.setTitleText(charSequence);
        }
    }

    public void setTitleContentDescription(String str) {
        if (this.f19418h != null) {
            this.f19418h.setContentDescription(str);
        } else {
            super.setTitleContentDescription(str);
        }
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f19412b = findViewById(C7582R.id.rating_badge_container);
        ((TextView) findViewById(C7582R.id.li_snippet_text)).setTextSize(0, (float) getResources().getDimensionPixelSize(C7582R.dimen.flat_small_card_snippet_size));
        if (this.q.dj().mo2294a(12632790)) {
            this.f19418h = (FadingEdgeTextView) findViewById(C7582R.id.li_fading_edge_title);
        }
        this.af.setImageDrawable(this.f19415e);
        this.f19419i = (TextView) findViewById(C7582R.id.li_app_download_size);
    }

    public final void mo3836a(CharSequence charSequence) {
        this.f19419i.setVisibility(0);
        this.f19419i.setText(charSequence);
    }

    public final void ar_() {
        this.f19419i.setVisibility(8);
    }

    public final void mo3837a(boolean z) {
    }

    public final boolean mo3839b(boolean z) {
        return !z;
    }

    private final boolean m18436b(int i) {
        return (this.f19411a & i) != 0;
    }

    public void setTextContentFlags(int i) {
        boolean z = true;
        if (i != this.f19411a) {
            this.f19411a = i;
            boolean b = m18436b(2);
            this.at = !b;
            int i2 = b ? 1 : m18436b(4) ? 3 : 2;
            if (this.f19418h != null) {
                this.f19418h.setMaxLines(i2);
            } else {
                TextView textView = this.V;
                if (i2 != 1) {
                    z = false;
                }
                textView.setSingleLine(z);
                this.V.setMaxLines(i2);
            }
            this.f19413c = -1;
        }
    }

    private final int m18437f() {
        if (this.f19413c == -1) {
            this.f19413c = getResources().getDimensionPixelSize(C7582R.dimen.flat_small_card_content_min_height);
        }
        return this.f19413c;
    }

    public void setIsPartOfMixedContentCluster(boolean z) {
        this.f19414d = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected final void m18438a(int r5) {
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
        r2 = r4.m18437f();
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.playcard.FlatCardViewSmall.a(int):void");
    }

    protected void onMeasure(int i, int i2) {
        int i3;
        View view;
        int max;
        Object obj;
        if (this.f19414d) {
            a(i2);
        } else {
            c(i);
        }
        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.U.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f19414d) {
            i3 = (marginLayoutParams.width + paddingLeft) + paddingRight;
        } else {
            i3 = MeasureSpec.getSize(i);
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i4 = (i3 - paddingLeft) - paddingRight;
        paddingRight = marginLayoutParams.height;
        int mode = MeasureSpec.getMode(i2);
        int size = MeasureSpec.getSize(i2);
        paddingLeft = ((paddingTop + paddingRight) + Math.max(m18437f(), i4 / 2)) + paddingBottom;
        if (mode != MemoryMappedFileBuffer.DEFAULT_SIZE || size <= 0) {
            paddingBottom = paddingLeft;
        } else {
            paddingBottom = size;
        }
        int i5 = (i4 - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        this.U.measure(MeasureSpec.makeMeasureSpec(i5, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(paddingRight, MemoryMappedFileBuffer.DEFAULT_SIZE));
        if (this.f19418h != null) {
            view = this.f19418h;
        } else {
            view = this.V;
        }
        marginLayoutParams = (MarginLayoutParams) view.getLayoutParams();
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.ab.getLayoutParams();
        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) this.ah.getLayoutParams();
        MarginLayoutParams marginLayoutParams4 = (MarginLayoutParams) this.f19412b.getLayoutParams();
        MarginLayoutParams marginLayoutParams5 = null;
        if (this.ak != null) {
            marginLayoutParams5 = (MarginLayoutParams) this.ak.getLayoutParams();
        }
        if (this.o != null) {
            if (this.W == null || this.W.getVisibility() == 8) {
                this.o.setVisibility(8);
            } else {
                this.o.setVisibility(0);
                this.o.measure(MeasureSpec.makeMeasureSpec((i5 - this.U.getPaddingLeft()) - this.U.getPaddingRight(), Integer.MIN_VALUE), 0);
            }
        }
        this.ah.measure(MeasureSpec.makeMeasureSpec((i4 - marginLayoutParams3.leftMargin) - marginLayoutParams3.rightMargin, Integer.MIN_VALUE), 0);
        int measuredWidth = (this.ah.getMeasuredWidth() + marginLayoutParams3.leftMargin) + marginLayoutParams3.rightMargin;
        i5 = C0361r.m2051b(marginLayoutParams);
        if (this.af != null) {
            marginLayoutParams3 = (MarginLayoutParams) this.af.getLayoutParams();
            this.af.measure(MeasureSpec.makeMeasureSpec(marginLayoutParams3.width, MemoryMappedFileBuffer.DEFAULT_SIZE), MeasureSpec.makeMeasureSpec(marginLayoutParams3.height, MemoryMappedFileBuffer.DEFAULT_SIZE));
            if (this.af.getVisibility() != 8) {
                paddingLeft = Math.max(i5, (C0361r.m2051b(marginLayoutParams3) + this.af.getMeasuredWidth()) - getResources().getDimensionPixelSize(C7582R.dimen.flat_small_card_title_overflow_overlap));
                view.measure(MeasureSpec.makeMeasureSpec((i4 - C0361r.m2049a(marginLayoutParams)) - paddingLeft, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                if (this.al.getVisibility() != 0) {
                    max = Math.max(0, ((i4 - measuredWidth) - marginLayoutParams4.leftMargin) - marginLayoutParams4.rightMargin);
                    if (this.f19419i.getVisibility() != 8) {
                        this.f19419i.measure(MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), 0);
                    } else if (this.f19412b.getVisibility() != 8) {
                        this.f19412b.measure(MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), 0);
                    }
                    obj = m18436b(2) ? 1 : null;
                    if (this.ab.getVisibility() != 8) {
                        if (obj == null) {
                            max = (i4 - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
                        } else {
                            max = (i4 - marginLayoutParams2.leftMargin) - measuredWidth;
                        }
                        if (max < 0) {
                            max = 0;
                        }
                        if (m18436b(16)) {
                            this.ab.measure(0, 0);
                            if (this.ab.getMeasuredWidth() > max) {
                                this.ab.measure(MeasureSpec.makeMeasureSpec(max, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                            }
                        } else {
                            this.ab.measure(MeasureSpec.makeMeasureSpec(max, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                        }
                    }
                    if (!(this.ak == null || this.ak.getVisibility() == 8)) {
                        this.ak.measure(MeasureSpec.makeMeasureSpec((i4 - marginLayoutParams5.leftMargin) - marginLayoutParams5.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), MemoryMappedFileBuffer.DEFAULT_SIZE);
                    }
                }
                this.al.measure(0, 0);
                setMeasuredDimension(i3, paddingBottom);
            }
        }
        paddingLeft = i5;
        view.measure(MeasureSpec.makeMeasureSpec((i4 - C0361r.m2049a(marginLayoutParams)) - paddingLeft, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
        if (this.al.getVisibility() != 0) {
            max = Math.max(0, ((i4 - measuredWidth) - marginLayoutParams4.leftMargin) - marginLayoutParams4.rightMargin);
            if (this.f19419i.getVisibility() != 8) {
                this.f19419i.measure(MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), 0);
            } else if (this.f19412b.getVisibility() != 8) {
                this.f19412b.measure(MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE), 0);
            }
            if (m18436b(2)) {
            }
            if (this.ab.getVisibility() != 8) {
                if (obj == null) {
                    max = (i4 - marginLayoutParams2.leftMargin) - measuredWidth;
                } else {
                    max = (i4 - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
                }
                if (max < 0) {
                    max = 0;
                }
                if (m18436b(16)) {
                    this.ab.measure(0, 0);
                    if (this.ab.getMeasuredWidth() > max) {
                        this.ab.measure(MeasureSpec.makeMeasureSpec(max, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                    }
                } else {
                    this.ab.measure(MeasureSpec.makeMeasureSpec(max, MemoryMappedFileBuffer.DEFAULT_SIZE), 0);
                }
            }
            this.ak.measure(MeasureSpec.makeMeasureSpec((i4 - marginLayoutParams5.leftMargin) - marginLayoutParams5.rightMargin, MemoryMappedFileBuffer.DEFAULT_SIZE), MemoryMappedFileBuffer.DEFAULT_SIZE);
        }
        this.al.measure(0, 0);
        setMeasuredDimension(i3, paddingBottom);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        View view;
        MarginLayoutParams marginLayoutParams;
        int i5;
        int i6;
        int i7;
        int a;
        int baseline;
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
        MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) this.U.getLayoutParams();
        if (this.f19418h != null) {
            view = this.f19418h;
        } else {
            view = this.V;
        }
        MarginLayoutParams marginLayoutParams3 = (MarginLayoutParams) view.getLayoutParams();
        MarginLayoutParams marginLayoutParams4 = (MarginLayoutParams) this.ab.getLayoutParams();
        MarginLayoutParams marginLayoutParams5 = (MarginLayoutParams) this.f19412b.getLayoutParams();
        MarginLayoutParams marginLayoutParams6 = (MarginLayoutParams) this.f19419i.getLayoutParams();
        MarginLayoutParams marginLayoutParams7 = (MarginLayoutParams) this.ah.getLayoutParams();
        if (this.af != null) {
            marginLayoutParams = (MarginLayoutParams) this.af.getLayoutParams();
        } else {
            marginLayoutParams = null;
        }
        MarginLayoutParams marginLayoutParams8 = null;
        if (this.ak != null) {
            marginLayoutParams8 = (MarginLayoutParams) this.ak.getLayoutParams();
        }
        int measuredWidth = this.U.getMeasuredWidth();
        int a2 = C0361r.m2049a(marginLayoutParams2);
        int measuredHeight = this.U.getMeasuredHeight();
        int a3 = k.a(width, measuredWidth, z2, l + a2);
        this.U.layout(a3, marginLayoutParams2.topMargin + paddingTop, measuredWidth + a3, (marginLayoutParams2.topMargin + paddingTop) + measuredHeight);
        if (!(this.o == null || this.o.getVisibility() == 8)) {
            measuredWidth = this.o.getMeasuredWidth();
            a3 = ai.f1848a.mo401l(this.U);
            int i8 = paddingTop + measuredHeight;
            if (this.ax) {
                i5 = 0;
            } else {
                i5 = this.U.getPaddingTop();
            }
            i5 = (i8 - i5) - this.o.getMeasuredHeight();
            a2 = k.a(width, measuredWidth, z2, a2 + (a3 + l));
            this.o.layout(a2, i5, measuredWidth + a2, this.o.getMeasuredHeight() + i5);
        }
        i5 = view.getMeasuredWidth();
        a2 = (paddingTop + measuredHeight) + marginLayoutParams3.topMargin;
        measuredWidth = k.a(width, i5, z2, C0361r.m2049a(marginLayoutParams3) + l);
        measuredHeight = view.getMeasuredHeight();
        view.layout(measuredWidth, a2, i5 + measuredWidth, a2 + measuredHeight);
        if (!(this.af == null || this.af.getVisibility() == 8)) {
            i5 = this.af.getMeasuredWidth();
            measuredWidth = C0361r.m2051b(marginLayoutParams);
            i6 = marginLayoutParams.topMargin + a2;
            measuredWidth = k.b(width, i5, z2, measuredWidth + m);
            this.af.layout(measuredWidth, i6, i5 + measuredWidth, this.af.getMeasuredHeight() + i6);
        }
        Object obj = !m18436b(2) ? 1 : null;
        i6 = this.ah.getMeasuredWidth();
        measuredWidth = this.ah.getMeasuredHeight();
        if (obj != null) {
            i7 = ((height - paddingBottom) - marginLayoutParams7.bottomMargin) - measuredWidth;
        } else {
            i7 = view.getBottom() + marginLayoutParams7.topMargin;
        }
        int b = k.b(width, i6, z2, C0361r.m2051b(marginLayoutParams7) + m);
        this.ah.layout(b, i7, i6 + b, measuredWidth + i7);
        if (this.ab.getVisibility() != 8) {
            b = this.ab.getMeasuredWidth();
            i6 = C0361r.m2049a(marginLayoutParams4);
            if (obj != null) {
                i5 = ((a2 + measuredHeight) + marginLayoutParams3.bottomMargin) + marginLayoutParams4.topMargin;
            } else {
                i5 = (this.ah.getBaseline() + i7) - this.ab.getBaseline();
            }
            a = k.a(width, b, z2, l + i6);
            this.ab.layout(a, i5, b + a, this.ab.getMeasuredHeight() + i5);
        }
        if (this.f19419i.getVisibility() != 8) {
            i5 = this.f19419i.getMeasuredWidth();
            baseline = (this.ah.getBaseline() + i7) - this.f19419i.getBaseline();
            a = k.a(width, i5, z2, C0361r.m2049a(marginLayoutParams6) + l);
            this.f19419i.layout(a, baseline, i5 + a, this.f19419i.getMeasuredHeight() + baseline);
        } else if (this.f19412b.getVisibility() != 8) {
            i5 = this.f19412b.getMeasuredWidth();
            baseline = (this.ah.getBaseline() + i7) - this.f19412b.getBaseline();
            a = k.a(width, i5, z2, C0361r.m2049a(marginLayoutParams5) + l);
            this.f19412b.layout(a, baseline, i5 + a, this.f19412b.getMeasuredHeight() + baseline);
        }
        if (!(this.ak == null || this.ak.getVisibility() == 8)) {
            i5 = this.ak.getMeasuredWidth();
            baseline = (height - paddingBottom) - marginLayoutParams8.bottomMargin;
            a = k.a(width, i5, z2, C0361r.m2049a(marginLayoutParams8) + l);
            this.ak.layout(a, baseline - this.ak.getMeasuredHeight(), i5 + a, baseline);
        }
        i5 = ((((width - l) - m) - this.al.getMeasuredWidth()) / 2) + l;
        a = ((((height - paddingTop) - paddingBottom) - this.al.getMeasuredHeight()) / 2) + paddingTop;
        this.al.layout(i5, a, this.al.getMeasuredWidth() + i5, this.al.getMeasuredHeight() + a);
        e();
    }

    public int getCardType() {
        return 31;
    }

    public void setUseDarkTheme(boolean z) {
        if (this.f19417g != z) {
            int i;
            this.f19417g = z;
            Context context = getContext();
            if (z) {
                i = C7582R.color.flat_card_title_text_color_dark_theme;
            } else {
                i = C7582R.color.flat_card_title_text_color;
            }
            i = C0216d.m1116c(context, i);
            if (this.f19418h != null) {
                this.f19418h.setTextColor(i);
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
            this.f19419i.setTextColor(i);
            this.af.setImageDrawable(z ? this.f19416f : this.f19415e);
            ((FlatCardStarRatingBar) this.ad).setUseDarkTheme(z);
        }
    }

    public boolean getUseDarkTheme() {
        return this.f19417g;
    }
}
