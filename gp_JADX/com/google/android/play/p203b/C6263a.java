package com.google.android.play.p203b;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
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

public class C6263a extends C3140h {
    public static final float f31292a = ((float) Math.tan(0.7853981633974483d));
    public static final float f31293b = ((float) Math.sin(0.7853981633974483d));
    public static RectF f31294c;
    public static RectF f31295d;
    public final RectF f31296e = new RectF();
    public final Matrix f31297f;
    public final Path f31298g;
    public final int f31299h;
    public final int f31300i;
    public int f31301j;
    public int f31302k;
    public int f31303l;
    public float f31304m;
    public Paint f31305n;
    public Paint f31306o;
    public float f31307p;
    public float f31308q;
    public boolean f31309r = true;
    public Path f31310s = new Path();
    public float f31311t;
    public float f31312u;
    public float f31313v;
    public float f31314w;

    C6263a(Resources resources, ColorStateList colorStateList, float f, float f2, float f3, float f4, int i, int i2, int i3) {
        super(colorStateList, f, f2);
        this.f31299h = resources.getColor(C6282d.play_card_shadow_start_color);
        this.f31300i = resources.getColor(C6282d.play_card_shadow_end_color);
        this.f31301j = i;
        this.f31302k = i2;
        this.f31303l = i3;
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        if (this.f31308q != f3) {
            this.f31308q = f3;
            this.f31307p = 1.5f * f3;
            this.f31309r = true;
            invalidateSelf();
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("invalid bubble size");
        }
        if (this.f31304m != f4) {
            this.f31304m = f4;
            this.f31309r = true;
            invalidateSelf();
        }
        this.f31305n = new Paint(5);
        this.f31305n.setStyle(Style.FILL);
        this.f31305n.setDither(true);
        this.f31306o = new Paint(this.f31305n);
        this.f31297f = new Matrix();
        this.f31298g = new Path();
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f31309r = true;
    }

    public void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f31309r = true;
    }

    public void draw(Canvas canvas) {
        boolean z;
        int save;
        if (this.f31309r) {
            mo5362a(getBounds());
            this.f31309r = false;
        }
        canvas.translate(0.0f, this.f31308q / 2.0f);
        float f = (-this.F) - this.f31307p;
        float f2 = this.F + (this.f31308q / 2.0f);
        boolean z2 = this.f31296e.width() - (2.0f * f2) > 0.0f;
        if (this.f31296e.height() - (2.0f * f2) > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        int save2 = canvas.save();
        canvas.translate(this.f31296e.left + f2, this.f31296e.top + f2);
        canvas.drawPath(this.f31298g, this.f31305n);
        if (z2) {
            canvas.drawRect(0.0f, f, this.f31296e.width() - (2.0f * f2), -this.F, this.f31306o);
        }
        canvas.restoreToCount(save2);
        if (this.f31301j == 48) {
            save = canvas.save();
            canvas.translate(this.f31312u, this.f31307p + f2);
            m28778a(canvas, f, f2);
            canvas.restoreToCount(save);
        }
        save2 = canvas.save();
        canvas.translate(this.f31296e.right - f2, this.f31296e.bottom - f2);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f31298g, this.f31305n);
        if (z2) {
            canvas.drawRect(0.0f, f, this.f31296e.width() - (2.0f * f2), this.f31307p + (-this.F), this.f31306o);
        }
        canvas.restoreToCount(save2);
        if (this.f31301j == 5) {
            save = canvas.save();
            canvas.translate(this.f31296e.right + this.f31304m, this.f31313v);
            m28778a(canvas, f, f2);
            canvas.restoreToCount(save);
        }
        int save3 = canvas.save();
        canvas.translate(this.f31296e.left + f2, this.f31296e.bottom - f2);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f31298g, this.f31305n);
        if (z) {
            canvas.drawRect(0.0f, f, this.f31296e.height() - (2.0f * f2), -this.F, this.f31306o);
        }
        canvas.restoreToCount(save3);
        if (this.f31301j == 3) {
            save = canvas.save();
            canvas.translate(this.G, this.f31313v);
            m28778a(canvas, f, f2);
            canvas.restoreToCount(save);
        }
        save3 = canvas.save();
        canvas.translate(this.f31296e.right - f2, this.f31296e.top + f2);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f31298g, this.f31305n);
        if (z) {
            canvas.drawRect(0.0f, f, this.f31296e.height() - (2.0f * f2), -this.F, this.f31306o);
        }
        canvas.restoreToCount(save3);
        if (this.f31301j == 80) {
            save = canvas.save();
            canvas.translate(this.f31312u, this.f31296e.bottom + this.f31304m);
            m28778a(canvas, f, f2);
            canvas.restoreToCount(save);
        }
        canvas.translate(0.0f, (-this.f31308q) / 2.0f);
        if (VERSION.SDK_INT >= 17) {
            canvas.drawRoundRect(this.f31296e, this.F, this.F, this.E);
        } else {
            if (f31294c == null) {
                f31294c = new RectF();
            }
            float f3 = this.F * 2.0f;
            float width = this.f31296e.width() - f3;
            f3 = this.f31296e.height() - f3;
            f31294c.set(this.f31296e.left, this.f31296e.top, this.f31296e.left + (this.F * 2.0f), this.f31296e.top + (this.F * 2.0f));
            canvas.drawArc(f31294c, 180.0f, 90.0f, true, this.E);
            f31294c.offset(width, 0.0f);
            canvas.drawArc(f31294c, 270.0f, 90.0f, true, this.E);
            f31294c.offset(0.0f, f3);
            canvas.drawArc(f31294c, 0.0f, 90.0f, true, this.E);
            f31294c.offset(-width, 0.0f);
            canvas.drawArc(f31294c, 90.0f, 90.0f, true, this.E);
            canvas.drawRect(this.F + this.f31296e.left, this.f31296e.top, this.f31296e.right - this.F, this.F + this.f31296e.top, this.E);
            canvas.drawRect(this.F + this.f31296e.left, this.f31296e.bottom - this.F, this.f31296e.right - this.F, this.f31296e.bottom, this.E);
            canvas.drawRect(this.f31296e.left, this.F + this.f31296e.top, this.f31296e.right, this.f31296e.bottom - this.F, this.E);
        }
        save = canvas.save();
        canvas.translate(this.f31312u, this.f31313v);
        canvas.drawPath(this.f31310s, this.E);
        canvas.restoreToCount(save);
    }

    public final void m28779a(int i) {
        this.f31302k = i;
        this.f31309r = true;
        invalidateSelf();
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    protected void mo5362a(Rect rect) {
        RectF rectF;
        this.f31296e.set(rect);
        this.f31296e.inset(this.G, this.G);
        this.f31311t = (this.F + ((this.f31304m - this.F) / f31292a)) * 2.0f;
        int i = this.f31302k;
        int i2 = ((int) this.f31311t) / 2;
        int width;
        int i3;
        if (this.f31301j == 48 || this.f31301j == 80) {
            if (this.f31303l == 0) {
                i = (int) (((float) i) - (this.f31296e.width() / 2.0f));
            } else if (this.f31303l == 2) {
                i = (int) (((float) i) + (this.f31296e.width() / 2.0f));
            }
            width = (((int) this.f31296e.width()) / 2) - i2;
            i3 = (-(((int) this.f31296e.width()) / 2)) + i2;
            if (width < i) {
                i = width;
            } else if (i3 > i) {
                i = i3;
            }
        } else if (this.f31301j == 3 || this.f31301j == 5) {
            if (this.f31303l == 0) {
                i = (int) (((float) i) - (this.f31296e.height() / 2.0f));
            } else if (this.f31303l == 2) {
                i = (int) (((float) i) + (this.f31296e.height() / 2.0f));
            }
            i3 = (((int) this.f31296e.height()) / 2) - i2;
            width = (-(((int) this.f31296e.height()) / 2)) + i2;
            if (i3 < i) {
                i = i3;
            } else if (width > i) {
                i = width;
            }
        }
        switch (this.f31301j) {
            case 3:
                this.f31314w = -90.0f;
                rectF = this.f31296e;
                rectF.left += this.f31304m;
                this.f31312u = this.f31296e.left - (this.f31304m / 2.0f);
                this.f31313v = ((float) i) + (this.f31296e.top + (this.f31296e.height() / 2.0f));
                break;
            case 5:
                this.f31314w = 90.0f;
                rectF = this.f31296e;
                rectF.right -= this.f31304m;
                this.f31312u = this.f31296e.right + (this.f31304m / 2.0f);
                this.f31313v = ((float) i) + (this.f31296e.top + (this.f31296e.height() / 2.0f));
                break;
            case 48:
                this.f31314w = 0.0f;
                rectF = this.f31296e;
                rectF.top += this.f31304m;
                this.f31313v = this.f31296e.top - (this.f31304m / 2.0f);
                this.f31312u = ((float) i) + (this.f31296e.left + (this.f31296e.width() / 2.0f));
                break;
            case 80:
                this.f31314w = 180.0f;
                rectF = this.f31296e;
                rectF.bottom -= this.f31304m;
                this.f31313v = this.f31296e.bottom + (this.f31304m / 2.0f);
                this.f31312u = ((float) i) + (this.f31296e.left + (this.f31296e.width() / 2.0f));
                break;
            default:
                throw new IllegalArgumentException("Bubble gravity can only be on of TOP, BOTTOM, LEFT or RIGHT");
        }
        this.f31297f.reset();
        this.f31297f.setRotate(this.f31314w);
        RectF rectF2 = new RectF(-this.F, -this.F, this.F, this.F);
        rectF = new RectF(rectF2);
        rectF.inset(-this.f31307p, -this.f31307p);
        this.f31298g.reset();
        this.f31298g.setFillType(FillType.EVEN_ODD);
        this.f31298g.moveTo(-this.F, 0.0f);
        this.f31298g.rLineTo(-this.f31307p, 0.0f);
        this.f31298g.arcTo(rectF, 180.0f, 90.0f, false);
        this.f31298g.arcTo(rectF2, 270.0f, -90.0f, false);
        this.f31298g.close();
        float f = this.F / (this.F + this.f31307p);
        if (this.F + this.f31307p > 0.0f) {
            float[] fArr = new float[]{0.0f, f, 1.0f};
            f = 0.0f;
            this.f31305n.setShader(new RadialGradient(0.0f, f, this.F + this.f31307p, new int[]{this.f31299h, this.f31299h, this.f31300i}, fArr, TileMode.CLAMP));
        }
        float f2 = 0.0f;
        this.f31306o.setShader(new LinearGradient(0.0f, (-this.F) + this.f31307p, f2, (-this.F) - this.f31307p, new int[]{this.f31299h, this.f31299h, this.f31300i}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
        if (f31294c == null) {
            f31294c = new RectF();
        }
        if (f31295d == null) {
            f31295d = new RectF();
        }
        this.f31310s.reset();
        this.f31310s.setFillType(FillType.EVEN_ODD);
        float f3 = (this.f31304m / 2.0f) + 1.0f;
        f = (this.f31307p / 2.0f) + ((f3 - this.f31304m) - 1.0f);
        f2 = (-this.f31311t) / 2.0f;
        f31295d.set(-this.F, f, this.F, (this.F * 2.0f) + f);
        this.f31310s.moveTo(f2, f3);
        this.f31310s.lineTo(f31295d.left, f31295d.top + (this.F / 2.0f));
        this.f31310s.arcTo(f31295d, 225.0f, 90.0f, false);
        this.f31310s.lineTo(f2 + this.f31311t, f3);
        this.f31310s.close();
        if (this.f31314w != 0.0f) {
            this.f31310s.transform(this.f31297f);
        }
    }

    private final void m28778a(Canvas canvas, float f, float f2) {
        canvas.rotate(this.f31314w);
        canvas.translate((((-this.f31311t) / 2.0f) + (f2 / 2.0f)) - this.f31307p, (this.f31304m - (f / 2.0f)) + this.f31307p);
        canvas.rotate(-45.0f);
        float f3 = ((this.f31304m + this.f31307p) / f31293b) - this.F;
        canvas.drawRect(0.0f, f, f3, -this.F, this.f31306o);
        canvas.translate(f3, 0.0f);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f31298g, this.f31305n);
        canvas.drawRect(0.0f, f, f3, -this.F, this.f31306o);
    }
}
