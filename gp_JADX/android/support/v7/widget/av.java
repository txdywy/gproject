package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.p040a.C0394a;
import android.util.AttributeSet;
import android.widget.SeekBar;

public final class av extends SeekBar {
    public final aw f3129a;

    public av(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C0394a.seekBarStyle);
    }

    private av(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3129a = new aw(this);
        this.f3129a.mo752a(attributeSet, i);
    }

    protected final synchronized void onDraw(Canvas canvas) {
        int i = 1;
        synchronized (this) {
            super.onDraw(canvas);
            aw awVar = this.f3129a;
            if (awVar.f3131e != null) {
                int max = awVar.f3130d.getMax();
                if (max > 1) {
                    int intrinsicWidth = awVar.f3131e.getIntrinsicWidth();
                    int intrinsicHeight = awVar.f3131e.getIntrinsicHeight();
                    intrinsicWidth = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                    if (intrinsicHeight >= 0) {
                        i = intrinsicHeight / 2;
                    }
                    awVar.f3131e.setBounds(-intrinsicWidth, -i, intrinsicWidth, i);
                    float width = ((float) ((awVar.f3130d.getWidth() - awVar.f3130d.getPaddingLeft()) - awVar.f3130d.getPaddingRight())) / ((float) max);
                    intrinsicHeight = canvas.save();
                    canvas.translate((float) awVar.f3130d.getPaddingLeft(), (float) (awVar.f3130d.getHeight() / 2));
                    for (i = 0; i <= max; i++) {
                        awVar.f3131e.draw(canvas);
                        canvas.translate(width, 0.0f);
                    }
                    canvas.restoreToCount(intrinsicHeight);
                }
            }
        }
    }

    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        aw awVar = this.f3129a;
        Drawable drawable = awVar.f3131e;
        if (drawable != null && drawable.isStateful() && drawable.setState(awVar.f3130d.getDrawableState())) {
            awVar.f3130d.invalidateDrawable(drawable);
        }
    }

    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        aw awVar = this.f3129a;
        if (awVar.f3131e != null) {
            awVar.f3131e.jumpToCurrentState();
        }
    }
}
