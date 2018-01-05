package com.google.android.finsky.layout;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import com.google.android.finsky.adapters.C1174q;
import com.google.android.finsky.adapters.C1175r;
import com.google.android.finsky.cv.p177a.bf;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;

public class HorizontalStrip extends C3657a {
    public final float f18235o;
    public C1174q f18236p;
    public ap f18237q;
    public final bf f18238r;
    public int f18239s;
    public int[] f18240t;

    public HorizontalStrip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18238r = new bf();
        Resources resources = context.getResources();
        this.f18235o = resources.getDisplayMetrics().density;
        this.f18239s = resources.getColor(C7582R.color.screenshot_edge_fade);
    }

    public void setAdapter(C1174q c1174q) {
        this.f18236p = c1174q;
        if (this.f18236p != null) {
            C1174q c1174q2 = this.f18236p;
            c1174q2.f7225d.registerObserver(new an(this));
        }
        mo3564a();
    }

    public void setLoadAllScreenshotsListener(ap apVar) {
        this.f18237q = apVar;
    }

    public void setAppScreenshotStates(int[] iArr) {
        this.f18240t = iArr;
    }

    final void mo3564a() {
        removeAllViews();
        if (this.f18236p != null) {
            for (int i = 0; i < this.f18236p.f7222a; i++) {
                C1174q c1174q = this.f18236p;
                View inflate = LayoutInflater.from(this.l).inflate(C7582R.layout.app_screenshot, this, false);
                inflate.setOnClickListener(new C1175r(c1174q, i));
                inflate.setOnFocusChangeListener(new ao(this, i));
                addView(inflate);
            }
            m17320b();
        }
    }

    final void m17320b() {
        int i = 0;
        Object obj = 1;
        while (i < this.f18236p.f7222a) {
            View childAt = getChildAt(i);
            Drawable drawable = this.f18236p.f7223b[i];
            if (childAt instanceof AppScreenshot) {
                AppScreenshot appScreenshot = (AppScreenshot) childAt;
                if (drawable != null) {
                    if ((appScreenshot.f18077b.getDrawable() != null ? 1 : null) == null) {
                        appScreenshot.setScreenshotDrawable(drawable);
                        if (appScreenshot.f18076a != this.f18240t[i]) {
                            appScreenshot.setState(this.f18240t[i]);
                        }
                    }
                }
                if (drawable == null || appScreenshot.f18076a == 2 || this.f18240t[i] != 2) {
                    obj = null;
                } else {
                    appScreenshot.setScreenshotDrawable(drawable);
                }
                if (appScreenshot.f18076a != this.f18240t[i]) {
                    appScreenshot.setState(this.f18240t[i]);
                }
            }
            i++;
        }
        if (obj != null) {
            requestLayout();
        }
    }

    protected void onMeasure(int i, int i2) {
        int size = MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            this.f18236p.m7105a(i3, this.f18238r, this.f18235o);
            int i4 = this.f18238r.f11878b;
            this.f18236p.m7105a(i3, this.f18238r, this.f18235o);
            int i5 = this.f18238r.f11879c;
            if (i5 != 0) {
                float f = ((float) size) / ((float) i5);
                if (((double) f) < 1.0d) {
                    i4 = (int) (((float) i4) * f);
                }
            }
            childAt.measure(MeasureSpec.makeMeasureSpec(i4, MemoryMappedFileBuffer.DEFAULT_SIZE), i2);
        }
        setMeasuredDimension(MeasureSpec.getSize(i), size);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.f18236p != null) {
            int height = getHeight();
            this.c = 0.0f;
            int paddingLeft = getPaddingLeft() + this.f;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                View childAt = getChildAt(i5);
                int measuredWidth = childAt.getMeasuredWidth();
                childAt.layout(paddingLeft, 0, paddingLeft + measuredWidth, height);
                paddingLeft += this.g + measuredWidth;
                this.c += (float) measuredWidth;
            }
            this.c += (float) (this.g * (getChildCount() - 1));
            this.c += (float) this.f;
        }
    }

    protected final float mo3565b(float f) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < getChildCount()) {
            i2 += m17316b(i);
            if (((float) i2) > f) {
                break;
            }
            i++;
            i3 = i2;
        }
        return (float) i3;
    }

    private final int m17316b(int i) {
        return (i == 0 ? this.f : this.g) + getChildAt(i).getWidth();
    }

    protected final float mo3563a(int i) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            i4 += m17316b(i3);
            i3++;
            i2 = i4;
        }
        if (i3 != 0) {
            i2 += this.g;
        }
        return (float) i2;
    }

    protected final float mo3566c(float f) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < getChildCount()) {
            i2 += m17316b(i);
            if (((float) i2) > f) {
                break;
            }
            i++;
            i3 = i2;
        }
        i2 = i3;
        return (float) (this.g + i2);
    }

    protected float getLeftFadingEdgeStrength() {
        float scrollPosition = getScrollPosition();
        if (scrollPosition >= 0.0f) {
            return 0.0f;
        }
        float f = -scrollPosition;
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (f > ((float) horizontalFadingEdgeLength)) {
            return 1.0f;
        }
        return f / ((float) horizontalFadingEdgeLength);
    }

    protected float getRightFadingEdgeStrength() {
        float scrollPosition = (getScrollPosition() + this.c) - ((float) getWidth());
        if (scrollPosition <= 0.0f) {
            return 0.0f;
        }
        int horizontalFadingEdgeLength = getHorizontalFadingEdgeLength();
        if (scrollPosition > ((float) horizontalFadingEdgeLength)) {
            return 1.0f;
        }
        return scrollPosition / ((float) horizontalFadingEdgeLength);
    }

    public int getSolidColor() {
        return this.f18239s;
    }

    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f18237q != null && i > i3) {
            this.f18237q.mo3011c();
        }
    }
}
