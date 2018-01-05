package android.support.design.widget;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build.VERSION;
import android.support.design.p018a.C0095a;
import android.support.v4.view.ai;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;

final class cg extends LinearLayout {
    public int f920a;
    public final Paint f921b;
    public int f922c = -1;
    public float f923d;
    public int f924e = -1;
    public int f925f = -1;
    public int f926g = -1;
    public ValueAnimator f927h;
    public final /* synthetic */ TabLayout f928i;

    cg(TabLayout tabLayout, Context context) {
        this.f928i = tabLayout;
        super(context);
        setWillNotDraw(false);
        this.f921b = new Paint();
    }

    final void m750a(int i) {
        if (this.f921b.getColor() != i) {
            this.f921b.setColor(i);
            ai.f1848a.mo391c(this);
        }
    }

    final void m752b(int i) {
        if (this.f920a != i) {
            this.f920a = i;
            ai.f1848a.mo391c(this);
        }
    }

    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (VERSION.SDK_INT < 23 && this.f924e != i) {
            requestLayout();
            this.f924e = i;
        }
    }

    protected final void onMeasure(int i, int i2) {
        boolean z = false;
        super.onMeasure(i, i2);
        if (MeasureSpec.getMode(i) == MemoryMappedFileBuffer.DEFAULT_SIZE && this.f928i.f708x == 1 && this.f928i.f707w == 1) {
            int childCount = getChildCount();
            int i3 = 0;
            int i4 = 0;
            while (i3 < childCount) {
                int max;
                View childAt = getChildAt(i3);
                if (childAt.getVisibility() == 0) {
                    max = Math.max(i4, childAt.getMeasuredWidth());
                } else {
                    max = i4;
                }
                i3++;
                i4 = max;
            }
            if (i4 > 0) {
                if (i4 * childCount <= getMeasuredWidth() - (this.f928i.m530b(16) * 2)) {
                    i3 = 0;
                    while (i3 < childCount) {
                        boolean z2;
                        LayoutParams layoutParams = (LayoutParams) getChildAt(i3).getLayoutParams();
                        if (layoutParams.width == i4 && layoutParams.weight == 0.0f) {
                            z2 = z;
                        } else {
                            layoutParams.width = i4;
                            layoutParams.weight = 0.0f;
                            z2 = true;
                        }
                        i3++;
                        z = z2;
                    }
                } else {
                    this.f928i.f707w = 0;
                    this.f928i.m529a(false);
                    z = true;
                }
                if (z) {
                    super.onMeasure(i, i2);
                }
            }
        }
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.f927h == null || !this.f927h.isRunning()) {
            m749a();
            return;
        }
        this.f927h.cancel();
        m753b(this.f922c, Math.round(((float) this.f927h.getDuration()) * (1.0f - this.f927h.getAnimatedFraction())));
    }

    final void m749a() {
        int i;
        int i2;
        View childAt = getChildAt(this.f922c);
        if (childAt == null || childAt.getWidth() <= 0) {
            i = -1;
            i2 = -1;
        } else {
            i2 = childAt.getLeft();
            i = childAt.getRight();
            if (this.f923d > 0.0f && this.f922c < getChildCount() - 1) {
                View childAt2 = getChildAt(this.f922c + 1);
                i2 = (int) ((((float) i2) * (1.0f - this.f923d)) + (this.f923d * ((float) childAt2.getLeft())));
                i = (int) ((((float) i) * (1.0f - this.f923d)) + (((float) childAt2.getRight()) * this.f923d));
            }
        }
        m751a(i2, i);
    }

    final void m751a(int i, int i2) {
        if (i != this.f925f || i2 != this.f926g) {
            this.f925f = i;
            this.f926g = i2;
            ai.f1848a.mo391c(this);
        }
    }

    final void m753b(int i, int i2) {
        if (this.f927h != null && this.f927h.isRunning()) {
            this.f927h.cancel();
        }
        Object obj = ai.f1848a.mo400k(this) == 1 ? 1 : null;
        View childAt = getChildAt(i);
        if (childAt == null) {
            m749a();
            return;
        }
        int i3;
        int i4;
        int left = childAt.getLeft();
        int right = childAt.getRight();
        if (Math.abs(i - this.f922c) <= 1) {
            i3 = this.f925f;
            i4 = this.f926g;
        } else {
            int b = this.f928i.m530b(24);
            if (i < this.f922c) {
                if (obj == null) {
                    i4 = right + b;
                    i3 = i4;
                }
            } else if (obj != null) {
                i4 = right + b;
                i3 = i4;
            }
            i4 = left - b;
            i3 = i4;
        }
        if (i3 != left || i4 != right) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f927h = valueAnimator;
            valueAnimator.setInterpolator(C0095a.f421a);
            valueAnimator.setDuration((long) i2);
            valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
            valueAnimator.addUpdateListener(new ch(this, i3, left, i4, right));
            valueAnimator.addListener(new ci(this, i));
            valueAnimator.start();
        }
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f925f >= 0 && this.f926g > this.f925f) {
            canvas.drawRect((float) this.f925f, (float) (getHeight() - this.f920a), (float) this.f926g, (float) getHeight(), this.f921b);
        }
    }
}
