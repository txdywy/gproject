package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.android.vending.C0629a;
import com.squareup.leakcanary.C7582R;

public class SeparatorLinearLayout extends LinearLayout {
    public final int f10612a;
    public final Paint f10613b;
    public int f10614c;
    public boolean f10615d;

    public SeparatorLinearLayout(Context context) {
        this(context, null);
    }

    public SeparatorLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_hairline_separator_thickness);
        this.f10612a = (dimensionPixelSize + 1) / 2;
        this.f10613b = new Paint();
        this.f10613b.setColor(mo2621a(resources));
        this.f10613b.setStrokeWidth((float) dimensionPixelSize);
        this.f10615d = true;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.SeparatorLinearLayout);
        this.f10614c = obtainStyledAttributes.getInt(0, 2);
        obtainStyledAttributes.recycle();
    }

    public int mo2621a(Resources resources) {
        return resources.getColor(C7582R.color.play_translucent_separator_line);
    }

    public final void m10858a() {
        if (this.f10615d) {
            this.f10615d = false;
            invalidate();
        }
    }

    protected void onDraw(Canvas canvas) {
        if (this.f10615d) {
            int i;
            if ((this.f10614c & 1) != 0) {
                i = this.f10612a;
                canvas.drawLine(0.0f, (float) i, (float) getWidth(), (float) i, this.f10613b);
            }
            if ((this.f10614c & 2) != 0) {
                i = getHeight() - this.f10612a;
                canvas.drawLine(0.0f, (float) i, (float) getWidth(), (float) i, this.f10613b);
            }
        }
        super.onDraw(canvas);
    }
}
