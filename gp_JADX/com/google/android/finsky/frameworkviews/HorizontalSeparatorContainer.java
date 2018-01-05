package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.android.vending.C0629a;
import com.squareup.leakcanary.C7582R;

public class HorizontalSeparatorContainer extends LinearLayout {
    public final int f13899b;
    public final int f13900c;
    public final int f13901d;
    public final Paint f13902e;

    public HorizontalSeparatorContainer(Context context) {
        this(context, null);
    }

    public HorizontalSeparatorContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = context.getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0629a.HorizontalSeparatorContainer);
        this.f13899b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f13902e = new Paint();
        this.f13901d = resources.getColor(C7582R.color.play_translucent_separator_line);
        this.f13902e.setColor(this.f13901d);
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_hairline_separator_thickness);
        this.f13900c = ((dimensionPixelSize + 2) - 1) / 2;
        this.f13902e.setStrokeWidth((float) dimensionPixelSize);
        setWillNotDraw(false);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        Object obj = 1;
        View view = null;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 0) {
                if (!(obj != null || (view instanceof C2572y) || (childAt instanceof C2573z))) {
                    canvas.drawLine((float) (childAt.getLeft() + this.f13899b), (float) childAt.getTop(), (float) (childAt.getRight() - this.f13899b), (float) childAt.getTop(), this.f13902e);
                }
                view = childAt;
                obj = null;
            }
        }
        if (view instanceof C3150x) {
            int bottom = view.getBottom() - this.f13900c;
            canvas.drawLine((float) (view.getLeft() + this.f13899b), (float) bottom, (float) (view.getRight() - this.f13899b), (float) bottom, this.f13902e);
        }
    }
}
