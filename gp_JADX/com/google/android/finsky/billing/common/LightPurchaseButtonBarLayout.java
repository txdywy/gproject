package com.google.android.finsky.billing.common;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.finsky.bg.ag;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;

public class LightPurchaseButtonBarLayout extends ViewGroup {
    public View f9258a;
    public View f9259b;
    public View f9260c;
    public View f9261d;
    public View f9262e;
    public boolean f9263f;
    public int f9264g;
    public final int f9265h;
    public final int f9266i;
    public final int f9267j;
    public int f9268k;
    public int f9269l;
    public int f9270m;
    public int f9271n;
    public int f9272o;
    public int f9273p;
    public final int f9274q;
    public final int f9275r;
    public final int f9276s;
    public final Rect f9277t;
    public final Rect f9278u;
    public final Rect f9279v;
    public final Rect f9280w;

    public LightPurchaseButtonBarLayout(Context context) {
        this(context, null);
    }

    public LightPurchaseButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9263f = true;
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.light_purchase_dialog_footer_top_bottom_padding);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7582R.dimen.light_purchase_dialog_footer_left_right_padding);
        this.f9265h = resources.getDimensionPixelOffset(C7582R.dimen.standard_button_minheight);
        this.f9266i = resources.getDimensionPixelOffset(C7582R.dimen.standard_button_minwidth);
        this.f9267j = resources.getDimensionPixelOffset(C7582R.dimen.standard_button_xpadding);
        ai.m1823a(this, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        this.f9274q = resources.getDimensionPixelSize(C7582R.dimen.light_purchase_dialog_footer_horizontal_item_gap);
        this.f9275r = resources.getDimensionPixelSize(C7582R.dimen.light_purchase_dialog_footer_vertical_item_gap);
        this.f9276s = resources.getDimensionPixelSize(C7582R.dimen.standard_button_touch_target_minsize);
        this.f9277t = new Rect();
        this.f9278u = new Rect();
        this.f9279v = new Rect();
        this.f9280w = new Rect();
    }

    public void setShouldShowLogo(boolean z) {
        this.f9263f = z;
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        this.f9268k = i2;
        this.f9270m = i4;
        this.f9272o = i;
        this.f9273p = i3;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        this.f9268k = i2;
        this.f9270m = i4;
        this.f9272o = i;
        this.f9273p = i3;
        super.setPaddingRelative(i, i2, i3, i4);
    }

    public int getPaddingTop() {
        return this.f9268k;
    }

    public int getPaddingBottom() {
        return this.f9270m;
    }

    public int getPaddingStart() {
        return this.f9272o;
    }

    public int getPaddingEnd() {
        return this.f9273p;
    }

    public int getPaddingLeft() {
        return this.f9272o;
    }

    public int getPaddingRight() {
        return this.f9273p;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f9258a = findViewById(C7582R.id.logo);
        this.f9259b = findViewById(C7582R.id.continue_button_frame);
        this.f9260c = (Button) findViewById(C7582R.id.continue_button);
        this.f9261d = findViewById(C7582R.id.secondary_button_frame);
        this.f9262e = (Button) findViewById(C7582R.id.secondary_button);
    }

    protected void onMeasure(int i, int i2) {
        int measuredWidth;
        int measuredHeight;
        int i3 = 0;
        this.f9259b.setVisibility(this.f9260c.getVisibility());
        if (!(this.f9261d == null || this.f9262e == null)) {
            this.f9261d.setVisibility(this.f9262e.getVisibility());
            if (!this.f9263f || (this.f9260c.getVisibility() == 0 && this.f9262e.getVisibility() == 0)) {
                this.f9258a.setVisibility(8);
            } else {
                this.f9258a.setVisibility(0);
            }
        }
        int size = MeasureSpec.getSize(i);
        int i4 = (size - this.f9272o) - this.f9273p;
        if (m9742a()) {
            this.f9258a.measure(0, 0);
            measuredWidth = this.f9274q + this.f9258a.getMeasuredWidth();
            measuredHeight = this.f9258a.getMeasuredHeight();
        } else {
            measuredHeight = 0;
            measuredWidth = 0;
        }
        if (this.f9260c.getVisibility() == 0) {
            this.f9260c.setMinimumHeight(this.f9265h);
            this.f9260c.setMinimumWidth(this.f9266i);
            ai.m1823a(this.f9260c, this.f9267j, this.f9260c.getPaddingTop(), this.f9267j, this.f9260c.getPaddingBottom());
        }
        if (this.f9262e.getVisibility() == 0) {
            this.f9262e.setMinimumHeight(this.f9265h);
            this.f9262e.setMinimumWidth(this.f9266i);
            ai.m1823a(this.f9262e, this.f9267j, this.f9262e.getPaddingTop(), this.f9267j, this.f9262e.getPaddingBottom());
        }
        this.f9259b.measure(0, 0);
        int measuredWidth2 = this.f9259b.getMeasuredWidth();
        int measuredHeight2 = this.f9259b.getMeasuredHeight();
        int measuredHeight3 = this.f9260c.getMeasuredHeight();
        if (m9743b()) {
            this.f9261d.measure(0, 0);
            int measuredWidth3 = this.f9261d.getMeasuredWidth();
            measuredHeight2 = Math.max(measuredHeight2, this.f9261d.getMeasuredHeight());
            measuredHeight3 = Math.max(measuredHeight3, this.f9262e.getMeasuredHeight());
            measuredWidth2 += measuredWidth3 + this.f9274q;
        }
        if (measuredWidth + measuredWidth2 <= i4) {
            this.f9264g = 0;
            if (measuredHeight < measuredHeight2) {
                m9741a(measuredHeight2, measuredHeight3);
            }
            measuredHeight = Math.max(measuredHeight, measuredHeight2);
        } else if (m9743b()) {
            this.f9259b.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            this.f9261d.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            this.f9264g = 2;
            measuredHeight = this.f9259b.getMeasuredHeight();
            measuredWidth = this.f9261d.getMeasuredHeight();
            measuredHeight3 = (measuredHeight - this.f9260c.getMeasuredHeight()) / 2;
            this.f9269l = this.f9268k > measuredHeight3 ? this.f9268k - measuredHeight3 : 0;
            measuredWidth = (measuredWidth - this.f9262e.getMeasuredHeight()) / 2;
            if (this.f9270m > measuredWidth) {
                measuredHeight = this.f9270m - measuredWidth;
            } else {
                measuredHeight = 0;
            }
            this.f9271n = measuredHeight;
            measuredHeight = measuredHeight3 + measuredWidth;
            if (this.f9275r > measuredHeight) {
                i3 = this.f9275r - measuredHeight;
            }
            measuredHeight = (this.f9259b.getMeasuredHeight() + i3) + this.f9261d.getMeasuredHeight();
        } else {
            this.f9259b.measure(MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE), 0);
            if (this.f9264g != 3) {
                this.f9264g = 4;
                this.f9258a.setVisibility(8);
                m9741a(this.f9259b.getMeasuredHeight(), this.f9260c.getMeasuredHeight());
                measuredHeight = this.f9259b.getMeasuredHeight();
            } else {
                LightPurchaseButtonBarLayout lightPurchaseButtonBarLayout;
                this.f9269l = this.f9268k;
                measuredHeight3 = (measuredHeight2 - measuredHeight3) / 2;
                measuredWidth = this.f9275r > measuredHeight3 ? this.f9275r - measuredHeight3 : 0;
                if (this.f9264g == 3) {
                    if (this.f9268k > measuredHeight3) {
                        i3 = this.f9268k - measuredHeight3;
                    }
                    this.f9269l = i3;
                    i3 = this.f9270m;
                    lightPurchaseButtonBarLayout = this;
                } else if (this.f9270m > measuredHeight3) {
                    i3 = this.f9270m - measuredHeight3;
                    lightPurchaseButtonBarLayout = this;
                } else {
                    lightPurchaseButtonBarLayout = this;
                }
                lightPurchaseButtonBarLayout.f9271n = i3;
                measuredHeight = (measuredHeight + this.f9259b.getMeasuredHeight()) + measuredWidth;
            }
        }
        setMeasuredDimension(size, (measuredHeight + this.f9269l) + this.f9271n);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int measuredHeight;
        int i5;
        int a;
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int i6 = (width - this.f9272o) - this.f9273p;
        int height = (getHeight() - this.f9269l) - this.f9271n;
        if (m9742a()) {
            measuredWidth = this.f9258a.getMeasuredWidth();
            measuredHeight = this.f9258a.getMeasuredHeight();
            if (this.f9264g == 0) {
                i5 = this.f9269l + ((height - measuredHeight) / 2);
            } else if (this.f9264g == 3) {
                i5 = (this.f9259b.getMeasuredHeight() - this.f9260c.getMeasuredHeight()) / 2;
                i5 = (this.f9275r > i5 ? this.f9275r - i5 : 0) + (this.f9269l + this.f9259b.getMeasuredHeight());
            } else {
                i5 = this.f9269l;
            }
            a = k.a(width, measuredWidth, z2, this.f9272o);
            if (this.f9264g == 3) {
                a += (i6 - measuredWidth) / 2;
            }
            this.f9258a.layout(a, i5, measuredWidth + a, measuredHeight + i5);
        }
        measuredWidth = this.f9259b.getMeasuredWidth();
        measuredHeight = this.f9259b.getMeasuredHeight();
        switch (this.f9264g) {
            case 0:
            case 4:
                i5 = this.f9269l + ((height - measuredHeight) / 2);
                break;
            case 1:
                i5 = (measuredHeight - this.f9260c.getMeasuredHeight()) / 2;
                i5 = (this.f9275r > i5 ? this.f9275r - i5 : 0) + (this.f9269l + this.f9258a.getMeasuredHeight());
                break;
            case 2:
                i5 = this.f9269l;
                break;
            case 3:
                i5 = this.f9269l;
                break;
            default:
                throw new IllegalStateException(String.format("Unknown ContentFormat for button bar: %d", new Object[]{Integer.valueOf(this.f9264g)}));
        }
        a = k.b(width, measuredWidth, z2, this.f9273p);
        this.f9259b.layout(a, i5, a + measuredWidth, i5 + measuredHeight);
        if (m9743b()) {
            i6 = this.f9261d.getMeasuredWidth();
            int measuredHeight2 = this.f9261d.getMeasuredHeight();
            if (this.f9264g == 0) {
                a = ((height - measuredHeight2) / 2) + this.f9269l;
                i5 = (this.f9274q + i6) + measuredWidth;
            } else {
                a = ((measuredHeight - this.f9260c.getMeasuredHeight()) / 2) + ((measuredHeight2 - this.f9262e.getMeasuredHeight()) / 2);
                a = (i5 + measuredHeight) + (this.f9275r > a ? this.f9275r - a : 0);
                i5 = i6;
            }
            int b = k.b(width, i5, z2, this.f9273p);
            this.f9261d.layout(b, a, i6 + b, a + measuredHeight2);
        }
        ag.m9226a(this.f9260c, this.f9277t, this.f9278u, this.f9276s);
        ag.m9226a(this.f9262e, this.f9279v, this.f9280w, this.f9276s);
    }

    private final void m9741a(int i, int i2) {
        int i3;
        int i4 = 0;
        int i5 = (i - i2) / 2;
        if (this.f9268k > i5) {
            i3 = this.f9268k - i5;
        } else {
            i3 = 0;
        }
        this.f9269l = i3;
        if (this.f9270m > i5) {
            i4 = this.f9270m - i5;
        }
        this.f9271n = i4;
    }

    private final boolean m9742a() {
        return this.f9258a.getVisibility() == 0;
    }

    private final boolean m9743b() {
        return this.f9261d != null && this.f9261d.getVisibility() == 0;
    }
}
