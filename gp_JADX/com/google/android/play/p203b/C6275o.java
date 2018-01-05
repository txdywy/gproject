package com.google.android.play.p203b;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.os.Build.VERSION;
import com.google.android.play.C6282d;

public final class C6275o extends C3140h {
    public static RectF f31328a;
    public Paint f31329b;
    public Paint f31330c;
    public Path f31331d;
    public final RectF f31332e;
    public float f31333f;
    public float f31334g;
    public boolean f31335h = true;
    public final int f31336i;
    public final int f31337j;

    public C6275o(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        super(colorStateList, f, f3);
        this.f31336i = resources.getColor(C6282d.play_card_shadow_start_color);
        this.f31337j = resources.getColor(C6282d.play_card_shadow_end_color);
        if (f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        if (this.f31334g != f2) {
            this.f31334g = f2;
            this.f31333f = 1.5f * f2;
            this.f31335h = true;
            invalidateSelf();
        }
        this.f31329b = new Paint(5);
        this.f31329b.setStyle(Style.FILL);
        this.f31329b.setDither(true);
        this.f31332e = new RectF();
        this.f31330c = new Paint(this.f31329b);
    }

    public final void setAlpha(int i) {
        this.E.setAlpha(i);
        this.f31329b.setAlpha(i);
        this.f31330c.setAlpha(i);
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f31335h = true;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.E.setColorFilter(colorFilter);
        this.f31329b.setColorFilter(colorFilter);
        this.f31330c.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void draw(Canvas canvas) {
        float f;
        int i;
        boolean z = false;
        if (this.f31335h) {
            RectF rectF;
            this.f31332e.set(getBounds());
            if (this.H != null) {
                rectF = this.f31332e;
                rectF.left = (this.H.left == -1 ? this.G : (float) this.H.left) + rectF.left;
                rectF = this.f31332e;
                rectF.top = (this.H.top == -1 ? this.G : (float) this.H.top) + rectF.top;
                rectF = this.f31332e;
                rectF.right -= this.H.right == -1 ? this.G : (float) this.H.right;
                rectF = this.f31332e;
                rectF.bottom -= this.H.bottom == -1 ? this.G : (float) this.H.bottom;
            } else {
                this.f31332e.inset(this.G, this.G);
            }
            RectF rectF2 = new RectF(-this.F, -this.F, this.F, this.F);
            rectF = new RectF(rectF2);
            rectF.inset(-this.f31333f, -this.f31333f);
            if (this.f31331d == null) {
                this.f31331d = new Path();
            } else {
                this.f31331d.reset();
            }
            this.f31331d.setFillType(FillType.EVEN_ODD);
            this.f31331d.moveTo(-this.F, 0.0f);
            this.f31331d.rLineTo(-this.f31333f, 0.0f);
            this.f31331d.arcTo(rectF, 180.0f, 90.0f, false);
            this.f31331d.arcTo(rectF2, 270.0f, -90.0f, false);
            this.f31331d.close();
            f = this.F / (this.F + this.f31333f);
            if (this.F + this.f31333f > 0.0f) {
                this.f31329b.setShader(new RadialGradient(0.0f, 0.0f, this.F + this.f31333f, new int[]{this.f31336i, this.f31336i, this.f31337j}, new float[]{0.0f, f, 1.0f}, TileMode.CLAMP));
            }
            this.f31330c.setShader(new LinearGradient(0.0f, (-this.F) + this.f31333f, 0.0f, (-this.F) - this.f31333f, new int[]{this.f31336i, this.f31336i, this.f31337j}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
            this.f31335h = false;
        }
        canvas.translate(0.0f, this.f31334g / 2.0f);
        f = (-this.F) - this.f31333f;
        float f2 = this.F + (this.f31334g / 2.0f);
        if (this.f31332e.width() - (2.0f * f2) > 0.0f) {
            i = 1;
        } else {
            boolean z2 = false;
        }
        if (this.f31332e.height() - (2.0f * f2) > 0.0f) {
            z = true;
        }
        int save = canvas.save();
        canvas.translate(this.f31332e.left + f2, this.f31332e.top + f2);
        canvas.drawPath(this.f31331d, this.f31329b);
        if (i != 0) {
            canvas.drawRect(0.0f, f, this.f31332e.width() - (2.0f * f2), -this.F, this.f31330c);
        }
        canvas.restoreToCount(save);
        save = canvas.save();
        canvas.translate(this.f31332e.right - f2, this.f31332e.bottom - f2);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f31331d, this.f31329b);
        if (i != 0) {
            canvas.drawRect(0.0f, f, this.f31332e.width() - (2.0f * f2), this.f31333f + (-this.F), this.f31330c);
        }
        canvas.restoreToCount(save);
        i = canvas.save();
        canvas.translate(this.f31332e.left + f2, this.f31332e.bottom - f2);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f31331d, this.f31329b);
        if (z) {
            canvas.drawRect(0.0f, f, this.f31332e.height() - (2.0f * f2), -this.F, this.f31330c);
        }
        canvas.restoreToCount(i);
        i = canvas.save();
        canvas.translate(this.f31332e.right - f2, this.f31332e.top + f2);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f31331d, this.f31329b);
        if (z) {
            canvas.drawRect(0.0f, f, this.f31332e.height() - (2.0f * f2), -this.F, this.f31330c);
        }
        canvas.restoreToCount(i);
        canvas.translate(0.0f, (-this.f31334g) / 2.0f);
        if (VERSION.SDK_INT >= 17) {
            canvas.drawRoundRect(this.f31332e, this.F, this.F, this.E);
            return;
        }
        if (f31328a == null) {
            f31328a = new RectF();
        }
        float f3 = this.F * 2.0f;
        float width = this.f31332e.width() - f3;
        f3 = this.f31332e.height() - f3;
        f31328a.set(this.f31332e.left, this.f31332e.top, this.f31332e.left + (this.F * 2.0f), this.f31332e.top + (this.F * 2.0f));
        canvas.drawArc(f31328a, 180.0f, 90.0f, true, this.E);
        f31328a.offset(width, 0.0f);
        canvas.drawArc(f31328a, 270.0f, 90.0f, true, this.E);
        f31328a.offset(0.0f, f3);
        canvas.drawArc(f31328a, 0.0f, 90.0f, true, this.E);
        f31328a.offset(-width, 0.0f);
        canvas.drawArc(f31328a, 90.0f, 90.0f, true, this.E);
        canvas.drawRect(this.F + this.f31332e.left, this.f31332e.top, this.f31332e.right - this.F, this.F + this.f31332e.top, this.E);
        canvas.drawRect(this.F + this.f31332e.left, this.f31332e.bottom - this.F, this.f31332e.right - this.F, this.f31332e.bottom, this.E);
        canvas.drawRect(this.f31332e.left, this.F + this.f31332e.top, this.f31332e.right, this.f31332e.bottom - this.F, this.E);
    }
}
