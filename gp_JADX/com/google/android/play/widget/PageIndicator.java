package com.google.android.play.widget;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.google.android.play.C6361i;
import com.google.android.play.d;
import com.google.android.play.e;
import com.google.android.play.f;
import com.google.android.play.utils.C6434a;

public class PageIndicator extends LinearLayout {
    public int f32428a;
    public int f32429b;
    public int f32430c;

    public PageIndicator(Context context) {
        this(context, null, 0);
    }

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32428a = -1;
        this.f32429b = d.play_onboard__page_indicator_dot_active;
        this.f32430c = d.play_onboard__page_indicator_dot_inactive;
        mo5447a();
    }

    public PageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32428a = -1;
        this.f32429b = d.play_onboard__page_indicator_dot_active;
        this.f32430c = d.play_onboard__page_indicator_dot_inactive;
        mo5447a();
    }

    protected void mo5447a() {
        setGravity(16);
    }

    public int getPageCount() {
        return getChildCount();
    }

    public void setPageCount(int i) {
        C6434a.m29470b(i >= 0, "numPages must be >=0");
        int childCount = getChildCount();
        if (i < childCount) {
            removeViews(i, childCount - i);
        } else if (i > childCount) {
            for (int i2 = childCount; i2 < i; i2++) {
                boolean z;
                View imageView = new ImageView(getContext());
                imageView.setScaleType(ScaleType.CENTER);
                imageView.setImageResource(f.play_onboard_page_indicator_dot);
                LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                int dotHorizontalMargin = getDotHorizontalMargin();
                int dotVerticalMargin = getDotVerticalMargin();
                layoutParams.gravity = 16;
                layoutParams.setMargins(dotHorizontalMargin, dotVerticalMargin, dotHorizontalMargin, dotVerticalMargin);
                addView(imageView, layoutParams);
                if (i2 == this.f32428a) {
                    z = true;
                } else {
                    z = false;
                }
                mo5448a(imageView, z, false, i2);
            }
        }
        m29513b();
    }

    public int getSelectedPage() {
        return this.f32428a;
    }

    public void setSelectedPage(int i) {
        if (this.f32428a != i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                boolean z;
                ImageView imageView = (ImageView) getChildAt(i2);
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                mo5448a(imageView, z, true, i2);
            }
            this.f32428a = i;
            m29513b();
        }
    }

    public void setSelectedColorResId(int i) {
        this.f32429b = i;
        invalidate();
    }

    public void setUnselectedColorResId(int i) {
        this.f32430c = i;
        invalidate();
    }

    protected int getDotHorizontalMargin() {
        return getResources().getDimensionPixelSize(e.play_onboard__page_indicator_dot_diameter) / 2;
    }

    protected int getDotVerticalMargin() {
        return 0;
    }

    protected void mo5448a(ImageView imageView, boolean z, boolean z2, int i) {
        ((GradientDrawable) imageView.getDrawable()).setColor(getResources().getColor(z ? this.f32429b : this.f32430c));
    }

    private final void m29513b() {
        setContentDescription(getResources().getString(C6361i.play_content_description_page_indicator, new Object[]{Integer.valueOf(getSelectedPage() + 1), Integer.valueOf(getPageCount())}));
    }
}
