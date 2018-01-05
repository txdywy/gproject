package com.google.android.finsky.frameworkviews;

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
import com.google.android.play.p203b.C3140h;
import com.squareup.leakcanary.C7582R;

public final class af extends C3140h {
    public static RectF f16236a;
    public final RectF f16237b;
    public float f16238c;
    public float f16239d;
    public boolean f16240e = true;
    public final int f16241f;
    public final int f16242g;
    public float f16243h;
    public float f16244i;
    public Paint f16245j;
    public Path f16246k;
    public Paint f16247l;
    public Path f16248m;
    public boolean f16249n;
    public boolean f16250o;
    public Paint f16251p;
    public Paint f16252q;

    public af(Resources resources, ColorStateList colorStateList, float f, float f2, float f3, boolean z, boolean z2) {
        super(colorStateList, 0.0f, 0.0f);
        this.f16241f = resources.getColor(C7582R.color.play_card_shadow_start_color);
        this.f16242g = resources.getColor(C7582R.color.play_card_shadow_end_color);
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("invalid shadow size");
        }
        if (this.f16239d != f3) {
            this.f16239d = f3;
            this.f16238c = 1.5f * f3;
            this.f16240e = true;
            invalidateSelf();
        }
        this.f16237b = new RectF();
        this.f16243h = f;
        this.f16244i = f2;
        this.f16251p = new Paint(5);
        this.f16251p.setStyle(Style.FILL);
        this.f16251p.setDither(true);
        this.f16252q = new Paint(5);
        this.f16252q.setStyle(Style.FILL);
        this.f16252q.setDither(true);
        this.f16245j = new Paint(this.f16251p);
        this.f16247l = new Paint(this.f16252q);
        this.f16249n = z;
        this.f16250o = z2;
    }

    public final void setAlpha(int i) {
        this.E.setAlpha(i);
        this.f16251p.setAlpha(i);
        this.f16245j.setAlpha(i);
        this.f16252q.setAlpha(i);
        this.f16247l.setAlpha(i);
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f16240e = true;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.E.setColorFilter(colorFilter);
        this.f16251p.setColorFilter(colorFilter);
        this.f16245j.setColorFilter(colorFilter);
        this.f16252q.setColorFilter(colorFilter);
        this.f16247l.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        return -1;
    }

    public final void draw(Canvas canvas) {
        if (this.f16240e) {
            this.f16237b.set(getBounds());
            if (this.H != null) {
                RectF rectF = this.f16237b;
                rectF.left = (this.H.left == -1 ? this.G : (float) this.H.left) + rectF.left;
                rectF = this.f16237b;
                rectF.top = (this.H.top == -1 ? this.G : (float) this.H.top) + rectF.top;
                rectF = this.f16237b;
                rectF.right -= this.H.right == -1 ? this.G : (float) this.H.right;
                rectF = this.f16237b;
                rectF.bottom -= this.H.bottom == -1 ? this.G : (float) this.H.bottom;
            } else {
                this.f16237b.inset(this.G, this.G);
            }
            this.f16246k = m16039a(this.f16246k, this.f16251p, this.f16243h);
            this.f16245j = m16038a(this.f16245j, this.f16243h);
            this.f16248m = m16039a(this.f16248m, this.f16252q, this.f16244i);
            this.f16247l = m16038a(this.f16247l, this.f16244i);
            this.f16240e = false;
        }
        canvas.translate(0.0f, this.f16239d / 2.0f);
        float f = (-this.f16243h) - this.f16238c;
        float f2 = this.f16243h + (this.f16239d / 2.0f);
        float f3 = (-this.f16244i) - this.f16238c;
        float f4 = this.f16244i + (this.f16239d / 2.0f);
        Object obj = (this.f16237b.width() - (2.0f * f2) <= 0.0f || this.f16249n) ? null : 1;
        Object obj2 = (this.f16237b.height() - f2) - f4 > 0.0f ? 1 : null;
        Object obj3 = (this.f16237b.width() - (2.0f * f4) <= 0.0f || this.f16250o) ? null : 1;
        Object obj4 = (this.f16237b.height() - f2) - f4 > 0.0f ? 1 : null;
        int save = canvas.save();
        canvas.translate(this.f16237b.left + f2, this.f16237b.top + f2);
        canvas.drawPath(this.f16246k, this.f16251p);
        if (obj != null) {
            canvas.drawRect(0.0f, f, this.f16237b.width() - (2.0f * f2), -this.f16243h, this.f16245j);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        canvas.translate(this.f16237b.right - f4, this.f16237b.bottom - f4);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f16248m, this.f16252q);
        if (obj3 != null) {
            canvas.drawRect(0.0f, f3, this.f16237b.width() - (2.0f * f4), -this.f16244i, this.f16247l);
        }
        canvas.restoreToCount(save2);
        save2 = canvas.save();
        canvas.translate(this.f16237b.left + f4, this.f16237b.bottom - f4);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f16248m, this.f16252q);
        if (obj4 != null) {
            canvas.drawRect(0.0f, f3, (this.f16237b.height() - f2) - f4, -this.f16244i, this.f16247l);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        canvas.translate(this.f16237b.right - f2, this.f16237b.top + f2);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f16246k, this.f16251p);
        if (obj2 != null) {
            canvas.drawRect(0.0f, f, (this.f16237b.height() - f2) - f4, -this.f16243h, this.f16245j);
        }
        canvas.restoreToCount(save3);
        canvas.translate(0.0f, (-this.f16239d) / 2.0f);
        if (f16236a == null) {
            f16236a = new RectF();
        }
        float width = this.f16237b.width() - (this.f16243h * 2.0f);
        float width2 = this.f16237b.width() - (this.f16244i * 2.0f);
        f16236a.set(this.f16237b.left, this.f16237b.top, this.f16237b.left + (this.f16243h * 2.0f), this.f16237b.top + (this.f16243h * 2.0f));
        canvas.drawArc(f16236a, 180.0f, 90.0f, true, this.E);
        f16236a.offset(width, 0.0f);
        canvas.drawArc(f16236a, 270.0f, 90.0f, true, this.E);
        f16236a.set(this.f16237b.left, this.f16237b.bottom - (this.f16244i * 2.0f), this.f16237b.left + (this.f16244i * 2.0f), this.f16237b.bottom);
        canvas.drawArc(f16236a, 90.0f, 90.0f, true, this.E);
        f16236a.offset(width2, 0.0f);
        canvas.drawArc(f16236a, 0.0f, 90.0f, true, this.E);
        canvas.drawRect(this.f16243h + this.f16237b.left, this.f16237b.top, this.f16237b.right - this.f16243h, this.f16243h + this.f16237b.top, this.E);
        canvas.drawRect(this.f16244i + this.f16237b.left, this.f16237b.bottom - this.f16244i, this.f16237b.right - this.f16244i, this.f16237b.bottom, this.E);
        canvas.drawRect(this.f16237b.left, this.f16243h + this.f16237b.top, this.f16237b.right, this.f16237b.bottom - this.f16244i, this.E);
    }

    private final Path m16039a(Path path, Paint paint, float f) {
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        rectF2.inset(-this.f16238c, -this.f16238c);
        if (path == null) {
            path = new Path();
        } else {
            path.reset();
        }
        path.setFillType(FillType.EVEN_ODD);
        path.moveTo(-f, 0.0f);
        path.rLineTo(-this.f16238c, 0.0f);
        path.arcTo(rectF2, 180.0f, 90.0f, false);
        path.arcTo(rectF, 270.0f, -90.0f, false);
        path.close();
        float f2 = f / (this.f16238c + f);
        if (this.f16238c + f > 0.0f) {
            float[] fArr = new float[]{0.0f, f2, 1.0f};
            f2 = 0.0f;
            paint.setShader(new RadialGradient(0.0f, f2, this.f16238c + f, new int[]{this.f16241f, this.f16241f, this.f16242g}, fArr, TileMode.CLAMP));
        }
        return path;
    }

    private final Paint m16038a(Paint paint, float f) {
        float f2 = 0.0f;
        paint.setShader(new LinearGradient(0.0f, (-f) + this.f16238c, f2, (-f) - this.f16238c, new int[]{this.f16241f, this.f16241f, this.f16242g}, new float[]{0.0f, 0.5f, 1.0f}, TileMode.CLAMP));
        return paint;
    }
}
