package com.google.android.play.headerlist;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.support.v4.view.ai;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.play.e;

public class PlayHeaderListTabContainer extends LinearLayout {
    public static int[] f31854a = new int[2];
    public static int[] f31855b = new int[2];
    public int f31856c;
    public final Paint f31857d;
    public Paint f31858e;
    public int f31859f;
    public int f31860g;
    public int f31861h;
    public Path f31862i;
    public int f31863j;
    public float f31864k;
    public boolean f31865l;
    public int f31866m;
    public boolean f31867n;

    public PlayHeaderListTabContainer(Context context) {
        this(context, null);
    }

    public PlayHeaderListTabContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f31859f = context.getResources().getDimensionPixelSize(e.play_header_list_tab_strip_selected_underline_height);
        this.f31857d = new Paint();
        this.f31856c = 0;
    }

    public void setSelectedIndicator(int i) {
        if (i != this.f31856c) {
            this.f31856c = i;
            if (i == 1) {
                this.f31860g = getContext().getResources().getDimensionPixelSize(e.play_header_list_tab_strip_selected_triangle_base);
                this.f31861h = getContext().getResources().getDimensionPixelSize(e.play_header_list_tab_strip_selected_triangle_height);
                this.f31858e = new Paint();
                this.f31858e.setStyle(Style.FILL_AND_STROKE);
                this.f31858e.setAntiAlias(true);
                this.f31862i = new Path();
                this.f31862i.setFillType(FillType.EVEN_ODD);
            }
            invalidate();
        }
    }

    public void setSelectedIndicatorColor(int i) {
        if (this.f31856c == 0) {
            this.f31857d.setColor(i);
        } else if (this.f31856c == 1) {
            this.f31858e.setColor(i);
        }
        invalidate();
    }

    public void setSelectedUnderlineThickness(int i) {
        this.f31859f = i;
        invalidate();
    }

    public void setSelectedTriangleBaseWidth(int i) {
        this.f31860g = i;
        invalidate();
    }

    public void setSelectedTriangleHeight(int i) {
        this.f31861h = i;
        invalidate();
    }

    final void m29101a() {
        int dimensionPixelSize;
        int i;
        if (this.f31865l) {
            dimensionPixelSize = getResources().getDimensionPixelSize(e.play_header_list_tab_floating_padding);
            i = dimensionPixelSize;
        } else {
            dimensionPixelSize = this.f31866m / 2;
            View childAt = getChildAt(0);
            if (childAt != null) {
                childAt.measure(-2, -2);
                i = dimensionPixelSize - (childAt.getMeasuredWidth() / 2);
            } else {
                i = 0;
            }
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 != null) {
                childAt2.measure(-2, -2);
                dimensionPixelSize -= childAt2.getMeasuredWidth() / 2;
            } else {
                dimensionPixelSize = 0;
            }
            if (ai.a.k(this) != 0) {
                int i2 = i;
                i = dimensionPixelSize;
                dimensionPixelSize = i2;
            }
        }
        ai.a(this, i, 0, dimensionPixelSize, 0);
        this.f31867n = true;
    }

    public void setUseFloatingTabPadding(boolean z) {
        if (this.f31865l != z) {
            this.f31865l = z;
            m29101a();
        }
    }

    protected void onDraw(Canvas canvas) {
        if (getChildCount() > 0 && this.f31863j < getChildCount()) {
            m29100a(getChildAt(this.f31863j), f31854a);
            if (this.f31864k > 0.0f && this.f31863j < getChildCount() - 1) {
                m29100a(getChildAt(this.f31863j + 1), f31855b);
                f31854a[0] = (int) ((this.f31864k * ((float) f31855b[0])) + ((1.0f - this.f31864k) * ((float) f31854a[0])));
                f31854a[1] = (int) ((this.f31864k * ((float) f31855b[1])) + ((1.0f - this.f31864k) * ((float) f31854a[1])));
            }
            int height = getHeight();
            if (this.f31856c == 0) {
                canvas.drawRect((float) f31854a[0], (float) (height - this.f31859f), (float) f31854a[1], (float) height, this.f31857d);
            } else if (this.f31856c == 1) {
                int i = (f31854a[0] + f31854a[1]) / 2;
                this.f31862i.reset();
                this.f31862i.moveTo((float) (i - (this.f31860g / 2)), (float) height);
                this.f31862i.lineTo((float) i, (float) (height - this.f31861h));
                this.f31862i.lineTo((float) (i + (this.f31860g / 2)), (float) height);
                this.f31862i.close();
                canvas.drawPath(this.f31862i, this.f31858e);
            }
        }
    }

    private static void m29100a(View view, int[] iArr) {
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            CharSequence text = textView.getText();
            if (text == null || text.length() == 0) {
                iArr[0] = (textView.getLeft() + textView.getRight()) / 2;
                iArr[1] = iArr[0];
                return;
            }
            iArr[0] = textView.getLeft();
            iArr[1] = textView.getRight();
            return;
        }
        iArr[0] = view.getLeft();
        iArr[1] = view.getRight();
    }
}
