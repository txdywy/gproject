package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.squareup.leakcanary.C7582R;

public class ag extends FrameLayout {
    public Path f16253a;

    public ag(Context context) {
        super(context);
    }

    public ag(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ag(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ag(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    protected int getRoundRectCornerRadius() {
        return getResources().getDimensionPixelSize(C7582R.dimen.rounded_frame_layout_default_corner_radius);
    }

    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f16253a = null;
    }

    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (VERSION.SDK_INT >= 19) {
            if (this.f16253a == null) {
                int roundRectCornerRadius = getRoundRectCornerRadius();
                this.f16253a = new Path();
                this.f16253a.addRoundRect(new RectF(canvas.getClipBounds()), (float) roundRectCornerRadius, (float) roundRectCornerRadius, Direction.CW);
            }
            canvas.clipPath(this.f16253a);
        }
        return super.drawChild(canvas, view, j);
    }
}
