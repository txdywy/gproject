package com.google.android.finsky.frameworkviews;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import com.google.android.play.image.FifeImageView;

public class CircularImageView extends FifeImageView {
    public Paint f16163a;

    public CircularImageView(Context context) {
        this(context, null);
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setBackgroundPaintColor(int i) {
        if (this.f16163a == null) {
            this.f16163a = new Paint();
            this.f16163a.setAntiAlias(true);
            this.f16163a.setStyle(Style.FILL);
        }
        this.f16163a.setColor(i);
        setWillNotDraw(false);
    }

    protected void onDraw(Canvas canvas) {
        if (this.f16163a != null) {
            canvas.drawCircle((float) ((getRight() - getLeft()) / 2), (float) ((getBottom() - getTop()) / 2), (float) (Math.min(getWidth(), getHeight()) / 2), this.f16163a);
        }
        super.onDraw(canvas);
    }
}
