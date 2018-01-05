package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.google.android.finsky.bg.ag;
import com.google.android.play.utils.j;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;

public class AuthChoicesButtonBarLayout extends ViewGroup {
    public View f18082a;
    public View f18083b;
    public View f18084c;
    public View f18085d;
    public final int f18086e;
    public final int f18087f;
    public final int f18088g;
    public final int f18089h;
    public final Rect f18090i;
    public final Rect f18091j;
    public final Rect f18092k;
    public final Rect f18093l;

    public AuthChoicesButtonBarLayout(Context context) {
        this(context, null);
    }

    public AuthChoicesButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.f18086e = resources.getDimensionPixelSize(C7582R.dimen.light_purchase_dialog_footer_top_bottom_padding);
        this.f18087f = resources.getDimensionPixelSize(C7582R.dimen.light_purchase_dialog_footer_vertical_item_gap);
        this.f18088g = resources.getDimensionPixelSize(C7582R.dimen.light_purchase_dialog_footer_horizontal_item_gap);
        this.f18089h = getResources().getDimensionPixelSize(C7582R.dimen.standard_button_touch_target_minsize);
        this.f18090i = new Rect();
        this.f18091j = new Rect();
        this.f18092k = new Rect();
        this.f18093l = new Rect();
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f18082a = findViewById(C7582R.id.choice_everytime_frame);
        this.f18083b = findViewById(C7582R.id.choice_everytime_button);
        this.f18084c = findViewById(C7582R.id.choice_session_frame);
        this.f18085d = findViewById(C7582R.id.choice_session_button);
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i);
        int l = (size - ai.f1848a.mo401l(this)) - ai.f1848a.mo402m(this);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        this.f18084c.measure(0, 0);
        this.f18082a.measure(0, 0);
        if ((this.f18084c.getMeasuredWidth() + this.f18088g) + this.f18082a.getMeasuredWidth() <= l) {
            this.f18084c.setPadding(this.f18084c.getPaddingLeft(), this.f18086e, this.f18084c.getPaddingRight(), this.f18086e);
            this.f18082a.setPadding(this.f18082a.getPaddingLeft(), this.f18086e, this.f18082a.getPaddingRight(), this.f18086e);
            this.f18084c.measure(0, 0);
            this.f18082a.measure(0, 0);
            setMeasuredDimension(size, Math.max(this.f18084c.getMeasuredHeight(), this.f18082a.getMeasuredHeight()) + paddingTop);
            return;
        }
        this.f18084c.setPadding(this.f18084c.getPaddingLeft(), this.f18086e, this.f18084c.getPaddingRight(), this.f18087f / 2);
        this.f18082a.setPadding(this.f18082a.getPaddingLeft(), this.f18087f / 2, this.f18082a.getPaddingRight(), this.f18086e);
        l = MeasureSpec.makeMeasureSpec(l, Integer.MIN_VALUE);
        this.f18084c.measure(l, 0);
        this.f18082a.measure(l, 0);
        setMeasuredDimension(size, (this.f18084c.getMeasuredHeight() + paddingTop) + this.f18082a.getMeasuredHeight());
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2 = ai.f1848a.mo400k(this) == 0;
        int width = getWidth();
        int l = ai.f1848a.mo401l(this);
        int m = ai.f1848a.mo402m(this);
        l = (width - l) - m;
        int height = getHeight();
        int paddingTop = getPaddingTop();
        height = (height - paddingTop) - getPaddingBottom();
        int measuredWidth = this.f18082a.getMeasuredWidth();
        int measuredHeight = this.f18082a.getMeasuredHeight();
        int measuredWidth2 = this.f18084c.getMeasuredWidth();
        int measuredHeight2 = this.f18084c.getMeasuredHeight();
        int b = k.b(width, measuredWidth2, z2, m);
        int b2;
        if ((this.f18088g + measuredWidth) + measuredWidth2 <= l) {
            b2 = k.b(width, measuredWidth, z2, (m + measuredWidth2) + this.f18088g);
            width = ((height - measuredHeight2) / 2) + paddingTop;
            this.f18084c.layout(b, width, b + measuredWidth2, width + measuredHeight2);
            width = ((height - measuredHeight) / 2) + paddingTop;
            this.f18082a.layout(b2, width, b2 + measuredWidth, width + measuredHeight);
        } else {
            b2 = k.b(width, measuredWidth, z2, m);
            this.f18084c.layout(b, paddingTop, b + measuredWidth2, paddingTop + measuredHeight2);
            width = paddingTop + measuredHeight2;
            this.f18082a.layout(b2, width, b2 + measuredWidth, width + measuredHeight);
        }
        if (this.f18082a == null || this.f18083b == null || this.f18083b.getVisibility() == 8 || (this.f18083b.getHeight() >= this.f18089h && this.f18083b.getWidth() >= this.f18089h)) {
            this.f18091j.setEmpty();
            this.f18082a.setTouchDelegate(null);
        } else {
            ag.m9225a(this.f18083b, this.f18090i, this.f18089h, this.f18089h);
            if (!this.f18090i.equals(this.f18091j)) {
                this.f18082a.setTouchDelegate(new j(this.f18090i, this.f18083b));
                this.f18091j.set(this.f18090i);
            }
        }
        if (this.f18084c == null || this.f18085d == null || this.f18085d.getVisibility() == 8 || (this.f18085d.getHeight() >= this.f18089h && this.f18085d.getWidth() >= this.f18089h)) {
            this.f18093l.setEmpty();
            this.f18084c.setTouchDelegate(null);
            return;
        }
        ag.m9225a(this.f18085d, this.f18092k, this.f18089h, this.f18089h);
        if (!this.f18092k.equals(this.f18093l)) {
            this.f18084c.setTouchDelegate(new j(this.f18092k, this.f18085d));
            this.f18093l.set(this.f18092k);
        }
    }
}
