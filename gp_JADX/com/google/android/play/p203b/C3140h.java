package com.google.android.play.p203b;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public abstract class C3140h extends Drawable {
    public ColorStateList f16230C;
    public int f16231D = this.f16230C.getDefaultColor();
    public Paint f16232E = new Paint(5);
    public float f16233F;
    public float f16234G;
    public Rect f16235H;

    public C3140h(ColorStateList colorStateList, float f, float f2) {
        this.f16233F = f;
        this.f16230C = colorStateList;
        this.f16232E.setColor(this.f16231D);
        this.f16234G = f2;
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.f16230C == null || !this.f16230C.isStateful()) {
            return super.onStateChange(iArr);
        }
        this.f16232E.setColor(this.f16230C.getColorForState(iArr, this.f16231D));
        invalidateSelf();
        return true;
    }

    public boolean isStateful() {
        return this.f16230C != null && this.f16230C.isStateful();
    }

    public final void m16037b(int i) {
        this.f16230C = null;
        this.f16232E.setColor(i);
        invalidateSelf();
    }

    public final void m16036a(ColorStateList colorStateList) {
        this.f16230C = colorStateList;
        this.f16232E.setColor(this.f16230C.getColorForState(getState(), this.f16230C.getDefaultColor()));
        invalidateSelf();
    }

    public int getOpacity() {
        return -1;
    }
}
