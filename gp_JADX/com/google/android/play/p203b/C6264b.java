package com.google.android.play.p203b;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.play.C6282d;
import com.google.android.play.C6314e;

public final class C6264b extends C6263a {
    public ColorStateList f31315A;
    public int f31316B;
    public Path f31317x = new Path();
    public RectF f31318y = new RectF();
    public Paint f31319z;

    C6264b(Resources resources, int i, float f, float f2, float f3, float f4, int i2, int i3, int i4) {
        super(resources, resources.getColorStateList(i), f, f2, f3, f4, i2, i3, i4);
        this.f31315A = resources.getColorStateList(C6282d.play_overlay_highlight_outline);
        this.f31316B = this.f31315A.getDefaultColor();
        this.f31319z = new Paint(5);
        this.f31319z.setColor(this.f31316B);
        this.f31319z.setStrokeWidth(resources.getDimension(C6314e.play_highlight_outline_thickness));
        this.f31319z.setStyle(Style.STROKE);
    }

    protected final boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f31315A == null || !this.f31315A.isStateful()) {
            return onStateChange;
        }
        this.f31319z.setColor(this.f31315A.getColorForState(iArr, this.f31316B));
        invalidateSelf();
        return true;
    }

    public final boolean isStateful() {
        return super.isStateful() || (this.f31315A != null && this.f31315A.isStateful());
    }

    protected final void mo5362a(Rect rect) {
        super.mo5362a(rect);
        this.f31317x.reset();
        this.f31317x.setFillType(FillType.EVEN_ODD);
        this.f31317x.moveTo(this.e.left + this.F, this.e.top);
        if (this.j == 48) {
            this.f31317x.lineTo(this.u - (this.t / 2.0f), this.e.top);
            this.f31318y.set(this.u - this.F, (this.e.top - this.m) + (this.p / 2.0f), this.u + this.F, ((this.e.top - this.m) + (this.p / 2.0f)) + (this.F * 2.0f));
            this.f31317x.lineTo(this.f31318y.left, this.f31318y.top + (this.F / 2.0f));
            this.f31317x.arcTo(this.f31318y, 225.0f, 90.0f, false);
            this.f31317x.lineTo(this.u + (this.t / 2.0f), this.e.top);
        }
        this.f31317x.lineTo(this.e.right - this.F, this.e.top);
        if (this.F > 0.0f) {
            this.f31318y.set(this.e.right - (this.F * 2.0f), this.e.top, this.e.right, this.e.top + (this.F * 2.0f));
            this.f31317x.arcTo(this.f31318y, 270.0f, 90.0f, false);
        }
        if (this.j == 5) {
            this.f31317x.lineTo(this.e.right, this.v - (this.t / 2.0f));
            this.f31318y.set(((this.e.right + this.m) - (this.p / 2.0f)) - (this.F * 2.0f), this.v - this.F, (this.e.right + this.m) - (this.p / 2.0f), this.v + this.F);
            this.f31317x.lineTo(this.f31318y.right - (this.F / 2.0f), this.f31318y.top);
            this.f31317x.arcTo(this.f31318y, 315.0f, 90.0f, false);
            this.f31317x.lineTo(this.e.right, this.v + (this.t / 2.0f));
        }
        this.f31317x.lineTo(this.e.right, this.e.bottom - this.F);
        if (this.F > 0.0f) {
            this.f31318y.set(this.e.right - (this.F * 2.0f), this.e.bottom - (this.F * 2.0f), this.e.right, this.e.bottom);
            this.f31317x.arcTo(this.f31318y, 0.0f, 90.0f, false);
        }
        if (this.j == 80) {
            this.f31317x.lineTo(this.u + (this.t / 2.0f), this.e.bottom);
            this.f31318y.set(this.u - this.F, ((this.e.bottom + this.m) - (this.p / 2.0f)) - (this.F * 2.0f), this.u + this.F, (this.e.bottom + this.m) - (this.p / 2.0f));
            this.f31317x.lineTo(this.f31318y.right, this.f31318y.bottom - (this.F / 2.0f));
            this.f31317x.arcTo(this.f31318y, 45.0f, 90.0f, false);
            this.f31317x.lineTo(this.u - (this.t / 2.0f), this.e.bottom);
        }
        this.f31317x.lineTo(this.e.left + this.F, this.e.bottom);
        if (this.F > 0.0f) {
            this.f31318y.set(this.e.left, this.e.bottom - (this.F * 2.0f), this.e.left + (this.F * 2.0f), this.e.bottom);
            this.f31317x.arcTo(this.f31318y, 90.0f, 90.0f, false);
        }
        if (this.j == 3) {
            this.f31317x.lineTo(this.e.left, this.v + (this.t / 2.0f));
            this.f31318y.set((this.e.left - this.m) + (this.p / 2.0f), this.v - this.F, ((this.e.left - this.m) + (this.p / 2.0f)) + (this.F * 2.0f), this.v + this.F);
            this.f31317x.lineTo(this.f31318y.left + (this.F / 2.0f), this.f31318y.bottom);
            this.f31317x.arcTo(this.f31318y, 135.0f, 90.0f, false);
            this.f31317x.lineTo(this.e.left, this.v - (this.t / 2.0f));
        }
        this.f31317x.lineTo(this.e.left, this.e.top + this.F);
        if (this.F > 0.0f) {
            this.f31318y.set(this.e.left, this.e.top, this.e.left + (this.F * 2.0f), this.e.top + (this.F * 2.0f));
            this.f31317x.arcTo(this.f31318y, 180.0f, 90.0f, false);
        }
        this.f31317x.close();
    }

    public final void draw(Canvas canvas) {
        if (this.r) {
            mo5362a(getBounds());
            this.r = false;
        }
        canvas.drawPath(this.f31317x, this.E);
        canvas.drawPath(this.f31317x, this.f31319z);
    }
}
