package android.support.v7.p025c.p026a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.p014a.C0259a;
import android.support.v7.p040a.C0394a;
import android.support.v7.p040a.C0402i;
import android.support.v7.p040a.C0403j;

public class C0439b extends Drawable {
    public static final float f2514b = ((float) Math.toRadians(45.0d));
    public final Paint f2515a = new Paint();
    public float f2516c;
    public float f2517d;
    public float f2518e;
    public float f2519f;
    public boolean f2520g;
    public final Path f2521h = new Path();
    public final int f2522i;
    public boolean f2523j = false;
    public float f2524k;
    public float f2525l;
    public int f2526m = 2;

    public C0439b(Context context) {
        this.f2515a.setStyle(Style.STROKE);
        this.f2515a.setStrokeJoin(Join.MITER);
        this.f2515a.setStrokeCap(Cap.BUTT);
        this.f2515a.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C0403j.DrawerArrowToggle, C0394a.drawerArrowStyle, C0402i.Base_Widget_AppCompat_DrawerArrowToggle);
        int color = obtainStyledAttributes.getColor(C0403j.DrawerArrowToggle_color, 0);
        if (color != this.f2515a.getColor()) {
            this.f2515a.setColor(color);
            invalidateSelf();
        }
        float dimension = obtainStyledAttributes.getDimension(C0403j.DrawerArrowToggle_thickness, 0.0f);
        if (this.f2515a.getStrokeWidth() != dimension) {
            this.f2515a.setStrokeWidth(dimension);
            this.f2525l = (float) (((double) (dimension / 2.0f)) * Math.cos((double) f2514b));
            invalidateSelf();
        }
        boolean z = obtainStyledAttributes.getBoolean(C0403j.DrawerArrowToggle_spinBars, true);
        if (this.f2520g != z) {
            this.f2520g = z;
            invalidateSelf();
        }
        dimension = (float) Math.round(obtainStyledAttributes.getDimension(C0403j.DrawerArrowToggle_gapBetweenBars, 0.0f));
        if (dimension != this.f2519f) {
            this.f2519f = dimension;
            invalidateSelf();
        }
        this.f2522i = obtainStyledAttributes.getDimensionPixelSize(C0403j.DrawerArrowToggle_drawableSize, 0);
        this.f2517d = (float) Math.round(obtainStyledAttributes.getDimension(C0403j.DrawerArrowToggle_barLength, 0.0f));
        this.f2516c = (float) Math.round(obtainStyledAttributes.getDimension(C0403j.DrawerArrowToggle_arrowHeadLength, 0.0f));
        this.f2518e = obtainStyledAttributes.getDimension(C0403j.DrawerArrowToggle_arrowShaftLength, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void m2655a(boolean z) {
        if (this.f2523j != z) {
            this.f2523j = z;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        int i;
        Rect bounds = getBounds();
        switch (this.f2526m) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 3:
                if (C0259a.m1527f(this) != 0) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
            default:
                if (C0259a.m1527f(this) != 1) {
                    i = 0;
                    break;
                } else {
                    i = 1;
                    break;
                }
        }
        float sqrt = (float) Math.sqrt((double) ((this.f2516c * this.f2516c) * 2.0f));
        float f = this.f2517d;
        float f2 = f + ((sqrt - f) * this.f2524k);
        sqrt = this.f2517d;
        float f3 = sqrt + ((this.f2518e - sqrt) * this.f2524k);
        float round = (float) Math.round(0.0f + ((this.f2525l - 0.0f) * this.f2524k));
        float f4 = 0.0f + ((f2514b - 0.0f) * this.f2524k);
        if (i != 0) {
            f = 0.0f;
        } else {
            f = -180.0f;
        }
        if (i != 0) {
            sqrt = 180.0f;
        } else {
            sqrt = 0.0f;
        }
        sqrt = ((sqrt - f) * this.f2524k) + f;
        f = (float) Math.round(((double) f2) * Math.cos((double) f4));
        f2 = (float) Math.round(((double) f2) * Math.sin((double) f4));
        this.f2521h.rewind();
        f4 = this.f2519f + this.f2515a.getStrokeWidth();
        f4 += ((-this.f2525l) - f4) * this.f2524k;
        float f5 = (-f3) / 2.0f;
        this.f2521h.moveTo(f5 + round, 0.0f);
        this.f2521h.rLineTo(f3 - (round * 2.0f), 0.0f);
        this.f2521h.moveTo(f5, f4);
        this.f2521h.rLineTo(f, f2);
        this.f2521h.moveTo(f5, -f4);
        this.f2521h.rLineTo(f, -f2);
        this.f2521h.close();
        canvas.save();
        f = this.f2515a.getStrokeWidth();
        canvas.translate((float) bounds.centerX(), ((f * 1.5f) + this.f2519f) + ((float) ((((int) ((((float) bounds.height()) - (3.0f * f)) - (this.f2519f * 2.0f))) / 4) * 2)));
        if (this.f2520g) {
            canvas.rotate(((float) ((i ^ this.f2523j) != 0 ? -1 : 1)) * sqrt);
        } else if (i != 0) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(this.f2521h, this.f2515a);
        canvas.restore();
    }

    public void setAlpha(int i) {
        if (i != this.f2515a.getAlpha()) {
            this.f2515a.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2515a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getIntrinsicHeight() {
        return this.f2522i;
    }

    public int getIntrinsicWidth() {
        return this.f2522i;
    }

    public int getOpacity() {
        return -3;
    }

    public final void m2654a(float f) {
        if (this.f2524k != f) {
            this.f2524k = f;
            invalidateSelf();
        }
    }
}
