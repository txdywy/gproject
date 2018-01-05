package android.support.design.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.design.C0119c;
import android.support.v4.p028a.C0216d;
import android.support.v7.p025c.p026a.C0143a;

final class bo extends C0143a {
    public static final double f873a = Math.cos(Math.toRadians(45.0d));
    public final Paint f874b;
    public final Paint f875c;
    public final RectF f876d;
    public float f877e;
    public Path f878f;
    public float f879g;
    public float f880h;
    public float f881i;
    public boolean f882j = true;
    public final int f883k;
    public final int f884l;
    public final int f885m;
    public boolean f886n = true;
    public float f887o;
    public boolean f888p = false;

    public bo(Context context, Drawable drawable, float f, float f2, float f3) {
        super(drawable);
        this.f883k = C0216d.m1116c(context, C0119c.design_fab_shadow_start_color);
        this.f884l = C0216d.m1116c(context, C0119c.design_fab_shadow_mid_color);
        this.f885m = C0216d.m1116c(context, C0119c.design_fab_shadow_end_color);
        this.f874b = new Paint(5);
        this.f874b.setStyle(Style.FILL);
        this.f877e = (float) Math.round(f);
        this.f876d = new RectF();
        this.f875c = new Paint(this.f874b);
        this.f875c.setAntiAlias(false);
        m707a(f2, f3);
    }

    private static int m705b(float f) {
        int round = Math.round(f);
        return round % 2 == 1 ? round - 1 : round;
    }

    public final void setAlpha(int i) {
        super.setAlpha(i);
        this.f874b.setAlpha(i);
        this.f875c.setAlpha(i);
    }

    protected final void onBoundsChange(Rect rect) {
        this.f882j = true;
    }

    final void m707a(float f, float f2) {
        if (f < 0.0f || f2 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        float b = (float) m705b(f);
        float b2 = (float) m705b(f2);
        if (b > b2) {
            if (!this.f888p) {
                this.f888p = true;
            }
            b = b2;
        }
        if (this.f881i != b || this.f879g != b2) {
            this.f881i = b;
            this.f879g = b2;
            this.f880h = (float) Math.round(b * 1.5f);
            this.f882j = true;
            invalidateSelf();
        }
    }

    public final boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m703a(this.f879g, this.f877e, this.f886n));
        int ceil2 = (int) Math.ceil((double) m704b(this.f879g, this.f877e, this.f886n));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    public static float m703a(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) (1.5f * f)) + ((1.0d - f873a) * ((double) f2)));
        }
        return 1.5f * f;
    }

    public static float m704b(float f, float f2, boolean z) {
        if (z) {
            return (float) (((double) f) + ((1.0d - f873a) * ((double) f2)));
        }
        return f;
    }

    public final int getOpacity() {
        return -3;
    }

    public final void draw(Canvas canvas) {
        float f;
        Object obj;
        if (this.f882j) {
            Rect bounds = getBounds();
            float f2 = this.f879g * 1.5f;
            this.f876d.set(((float) bounds.left) + this.f879g, ((float) bounds.top) + f2, ((float) bounds.right) - this.f879g, ((float) bounds.bottom) - f2);
            this.f872q.setBounds((int) this.f876d.left, (int) this.f876d.top, (int) this.f876d.right, (int) this.f876d.bottom);
            RectF rectF = new RectF(-this.f877e, -this.f877e, this.f877e, this.f877e);
            RectF rectF2 = new RectF(rectF);
            rectF2.inset(-this.f880h, -this.f880h);
            if (this.f878f == null) {
                this.f878f = new Path();
            } else {
                this.f878f.reset();
            }
            this.f878f.setFillType(FillType.EVEN_ODD);
            this.f878f.moveTo(-this.f877e, 0.0f);
            this.f878f.rLineTo(-this.f880h, 0.0f);
            this.f878f.arcTo(rectF2, 180.0f, 90.0f, false);
            this.f878f.arcTo(rectF, 270.0f, -90.0f, false);
            this.f878f.close();
            float f3 = -rectF2.top;
            if (f3 > 0.0f) {
                float f4 = this.f877e / f3;
                f = f4 + ((1.0f - f4) / 2.0f);
                this.f874b.setShader(new RadialGradient(0.0f, 0.0f, f3, new int[]{0, this.f883k, this.f884l, this.f885m}, new float[]{0.0f, f4, f, 1.0f}, TileMode.CLAMP));
            }
            this.f875c.setShader(new LinearGradient(0.0f, rectF.top, 0.0f, rectF2.top, new int[]{this.f883k, this.f884l, this.f885m}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
            this.f875c.setAntiAlias(false);
            this.f882j = false;
        }
        int save = canvas.save();
        canvas.rotate(this.f887o, this.f876d.centerX(), this.f876d.centerY());
        float f5 = (-this.f877e) - this.f880h;
        f = this.f877e;
        Object obj2 = this.f876d.width() - (2.0f * f) > 0.0f ? 1 : null;
        if (this.f876d.height() - (2.0f * f) > 0.0f) {
            obj = 1;
        } else {
            obj = null;
        }
        float f6 = f / ((this.f881i - (this.f881i * 0.5f)) + f);
        float f7 = f / ((this.f881i - (this.f881i * 0.25f)) + f);
        float f8 = f / (f + (this.f881i - (this.f881i * 1.0f)));
        int save2 = canvas.save();
        canvas.translate(this.f876d.left + f, this.f876d.top + f);
        canvas.scale(f6, f7);
        canvas.drawPath(this.f878f, this.f874b);
        if (obj2 != null) {
            canvas.scale(1.0f / f6, 1.0f);
            canvas.drawRect(0.0f, f5, this.f876d.width() - (2.0f * f), -this.f877e, this.f875c);
        }
        canvas.restoreToCount(save2);
        save2 = canvas.save();
        canvas.translate(this.f876d.right - f, this.f876d.bottom - f);
        canvas.scale(f6, f8);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f878f, this.f874b);
        if (obj2 != null) {
            canvas.scale(1.0f / f6, 1.0f);
            canvas.drawRect(0.0f, f5, this.f876d.width() - (2.0f * f), this.f880h + (-this.f877e), this.f875c);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f876d.left + f, this.f876d.bottom - f);
        canvas.scale(f6, f8);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f878f, this.f874b);
        if (obj != null) {
            canvas.scale(1.0f / f8, 1.0f);
            canvas.drawRect(0.0f, f5, this.f876d.height() - (2.0f * f), -this.f877e, this.f875c);
        }
        canvas.restoreToCount(save3);
        save3 = canvas.save();
        canvas.translate(this.f876d.right - f, this.f876d.top + f);
        canvas.scale(f6, f7);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f878f, this.f874b);
        if (obj != null) {
            canvas.scale(1.0f / f7, 1.0f);
            canvas.drawRect(0.0f, f5, this.f876d.height() - (2.0f * f), -this.f877e, this.f875c);
        }
        canvas.restoreToCount(save3);
        canvas.restoreToCount(save);
        super.draw(canvas);
    }

    public final void m706a(float f) {
        m707a(f, this.f879g);
    }
}
