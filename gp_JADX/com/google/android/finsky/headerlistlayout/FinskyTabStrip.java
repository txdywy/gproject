package com.google.android.finsky.headerlistlayout;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.TextView;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.ab;
import com.google.android.finsky.bg.ac;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.google.android.finsky.providers.C3947d;
import com.google.android.play.headerlist.PlayHeaderListTabStrip;
import com.google.android.play.utils.k;
import com.squareup.leakcanary.C7582R;

public class FinskyTabStrip extends PlayHeaderListTabStrip implements ac {
    public C1611k f16347a;
    public C1461c f16348b;
    public boolean f16349c;
    public ViewGroup f16350d;
    public C3161c f16351e;
    public boolean f16352f;
    public boolean f16353g;
    public boolean f16354h;
    public int f16355i;
    public int f16356j;
    public ab f16357k;

    public FinskyTabStrip(Context context) {
        this(context, null, 0);
    }

    public FinskyTabStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FinskyTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ((C1389j) C3947d.m18649a(C1389j.class)).mo1848a(this);
    }

    public void setControlsContainerBackgroundCoordinator(C3161c c3161c) {
        this.f16351e = c3161c;
    }

    @SuppressLint({"MissingSuperCall"})
    protected void onFinishInflate() {
        ai.m1838b((View) this, 1);
        this.f16355i = this.f16347a.m9275a(getResources());
        this.f16356j = getResources().getDimensionPixelSize(C7582R.dimen.finsky_scrolling_tabs_fillwidth_threshold);
        this.f16357k = new ab(true, 0, 0, this.f16356j);
    }

    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        super.onFinishInflate();
        C3161c c3161c = this.f16351e;
        c3161c.m16087a();
        c3161c.f16373j = this;
        c3161c.f16373j.getViewTreeObserver().addOnPreDrawListener(c3161c.f16379p);
        View view = (View) c3161c.f16373j.getParent();
        while (view.getId() != C7582R.id.controls_container) {
            view = (View) view.getParent();
        }
        c3161c.f16370g = (ViewGroup) view;
        c3161c.f16371h = c3161c.f16370g.findViewById(C7582R.id.hero_container);
        c3161c.f16368e = (ControlsContainerBackground) LayoutInflater.from(c3161c.f16373j.getContext()).inflate(C7582R.layout.controls_container_background, c3161c.f16370g, false);
        if (InsetsFrameLayout.f14024a) {
            ((LayoutParams) c3161c.f16368e.getLayoutParams()).topMargin = -k.e(c3161c.f16368e.getContext());
        }
        if (c3161c.f16369f != null) {
            c3161c.f16368e.m16065a(c3161c.f16369f, 0, false);
            c3161c.f16369f = null;
        }
        c3161c.f16370g.addView(c3161c.f16368e, 0);
        c3161c.f16374k = null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f16351e.f16376m = (int) motionEvent.getX();
        return super.onInterceptTouchEvent(motionEvent);
    }

    protected final OnClickListener m16085c(int i) {
        return new C3165h(this, super.c(i));
    }

    public void setTabStripClicked(boolean z) {
        this.f16354h = z;
    }

    protected void onMeasure(int i, int i2) {
        if (this.f16349c) {
            setMeasuredDimension(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
            if (this.f16350d != null) {
                this.f16350d.setPadding(0, 0, 0, 0);
            }
            int measuredWidth = getMeasuredWidth();
            if (this.f16350d != null) {
                int childCount = this.f16350d.getChildCount();
                int i3 = measuredWidth / childCount;
                for (measuredWidth = 0; measuredWidth < childCount; measuredWidth++) {
                    TextView textView = (TextView) this.f16350d.getChildAt(measuredWidth);
                    ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                    textView.setMaxWidth(i3);
                    if (!(this.f16352f || i3 == layoutParams.width)) {
                        layoutParams.width = i3;
                        textView.setLayoutParams(layoutParams);
                    }
                }
            }
            measureChildren(i, i2);
            return;
        }
        super.onMeasure(i, i2);
        if (this.f16353g) {
            ViewGroup.LayoutParams layoutParams2 = this.f16350d.getLayoutParams();
            layoutParams2.width = -1;
            this.f16350d.setLayoutParams(layoutParams2);
            this.f16350d.setPadding(this.f16355i, this.f16350d.getPaddingTop(), this.f16355i, this.f16350d.getPaddingBottom());
            this.f16350d.measure(i, i2);
            super.onMeasure(i, i2);
            this.f16357k.m9204a(this, getHorizontalPadding(), getMeasuredWidth());
            super.onMeasure(i, i2);
        }
    }

    protected int getHorizontalPadding() {
        return this.f16355i;
    }

    public void setUseHomeScrollingTabs(boolean z) {
        this.f16353g = z;
    }

    protected final void m16082a(TextView textView, boolean z) {
        if (z) {
            textView.setTextColor(-1);
        } else {
            textView.setTextColor(getResources().getColorStateList(C7582R.color.finsky_scrolling_tab_text_color));
        }
    }

    protected final View m16080a(LayoutInflater layoutInflater, ViewGroup viewGroup, int i) {
        if (this.f16353g) {
            this.f16350d = viewGroup;
            FinskyTabTextView finskyTabTextView = (FinskyTabTextView) layoutInflater.inflate(C7582R.layout.finsky_scrolling_tab_text, viewGroup, false);
            a(finskyTabTextView, false);
            return finskyTabTextView;
        } else if (!this.f16349c) {
            return super.a(layoutInflater, viewGroup, i);
        } else {
            this.f16350d = viewGroup;
            TextView textView = (TextView) layoutInflater.inflate(C7582R.layout.finsky_fixed_tab_text, viewGroup, false);
            if (!this.f16348b.dj().mo2294a(12632714)) {
                return textView;
            }
            textView.setTextSize(0, (float) getResources().getDimensionPixelSize(C7582R.dimen.finsky_fixed_tab_text_size_large_tablet));
            return textView;
        }
    }

    public int getPeekableChildCount() {
        return this.f16350d.getChildCount();
    }

    public final int mo3019a(int i) {
        return this.f16350d.getChildAt(i).getMeasuredWidth();
    }

    public final void mo3020a(int i, int i2) {
        ((FinskyTabTextView) this.f16350d.getChildAt(i)).setAdditionalWidth(i2);
    }

    public final void a_(int i, int i2) {
        this.f16350d.setPadding(i, this.f16350d.getPaddingTop(), i2, this.f16350d.getPaddingBottom());
    }

    public final int mo3022b(int i) {
        return ai.f1848a.mo401l(this.f16350d.getChildAt(i));
    }

    public final void bX_() {
        for (int i = 0; i < getPeekableChildCount(); i++) {
            ((FinskyTabTextView) this.f16350d.getChildAt(i)).m16086a();
        }
    }

    public final boolean mo3023b() {
        return false;
    }
}
