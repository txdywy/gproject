package com.google.android.play.p203b;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.RectF;

final class C6274n extends C3140h {
    public final Rect f31326a = new Rect();
    public final RectF f31327b = new RectF();

    C6274n(ColorStateList colorStateList, float f, float f2) {
        super(colorStateList, f, f2);
    }

    public final void draw(Canvas canvas) {
        canvas.drawRoundRect(this.f31327b, this.F, this.F, this.E);
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f31326a.set(rect);
        int ceil = (int) Math.ceil((double) this.G);
        if (this.H != null) {
            Rect rect2 = this.f31326a;
            rect2.left = (this.H.left == -1 ? ceil : this.H.left) + rect2.left;
            rect2 = this.f31326a;
            rect2.top = (this.H.top == -1 ? ceil : this.H.top) + rect2.top;
            rect2 = this.f31326a;
            rect2.right -= this.H.right == -1 ? ceil : this.H.right;
            Rect rect3 = this.f31326a;
            int i = rect3.bottom;
            if (this.H.bottom != -1) {
                ceil = this.H.bottom;
            }
            rect3.bottom = i - ceil;
        } else {
            this.f31326a.inset(ceil, ceil);
        }
        this.f31327b.set(this.f31326a);
    }

    @TargetApi(21)
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f31326a, this.F);
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
