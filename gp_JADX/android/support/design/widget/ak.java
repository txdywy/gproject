package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.p013b.C0268a;

class ak extends Drawable {
    public final Paint f780a = new Paint(1);
    public final Rect f781b = new Rect();
    public final RectF f782c = new RectF();
    public float f783d;
    public int f784e;
    public int f785f;
    public int f786g;
    public int f787h;
    public ColorStateList f788i;
    public int f789j;
    public boolean f790k = true;
    public float f791l;

    public ak() {
        this.f780a.setStyle(Style.STROKE);
    }

    public void draw(Canvas canvas) {
        float height;
        if (this.f790k) {
            Paint paint = this.f780a;
            Rect rect = this.f781b;
            copyBounds(rect);
            height = this.f783d / ((float) rect.height());
            float f = 0.0f;
            paint.setShader(new LinearGradient(0.0f, (float) rect.top, f, (float) rect.bottom, new int[]{C0268a.m1540a(this.f784e, this.f789j), C0268a.m1540a(this.f785f, this.f789j), C0268a.m1540a(C0268a.m1543c(this.f785f, 0), this.f789j), C0268a.m1540a(C0268a.m1543c(this.f787h, 0), this.f789j), C0268a.m1540a(this.f787h, this.f789j), C0268a.m1540a(this.f786g, this.f789j)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, TileMode.CLAMP));
            this.f790k = false;
        }
        height = this.f780a.getStrokeWidth() / 2.0f;
        RectF rectF = this.f782c;
        copyBounds(this.f781b);
        rectF.set(this.f781b);
        rectF.left += height;
        rectF.top += height;
        rectF.right -= height;
        rectF.bottom -= height;
        canvas.save();
        canvas.rotate(this.f791l, rectF.centerX(), rectF.centerY());
        canvas.drawOval(rectF, this.f780a);
        canvas.restore();
    }

    public boolean getPadding(Rect rect) {
        int round = Math.round(this.f783d);
        rect.set(round, round, round, round);
        return true;
    }

    public void setAlpha(int i) {
        this.f780a.setAlpha(i);
        invalidateSelf();
    }

    final void m638a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f789j = colorStateList.getColorForState(getState(), this.f789j);
        }
        this.f788i = colorStateList;
        this.f790k = true;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f780a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public int getOpacity() {
        return this.f783d > 0.0f ? -3 : -2;
    }

    protected void onBoundsChange(Rect rect) {
        this.f790k = true;
    }

    public boolean isStateful() {
        return (this.f788i != null && this.f788i.isStateful()) || super.isStateful();
    }

    protected boolean onStateChange(int[] iArr) {
        if (this.f788i != null) {
            int colorForState = this.f788i.getColorForState(iArr, this.f789j);
            if (colorForState != this.f789j) {
                this.f790k = true;
                this.f789j = colorForState;
            }
        }
        if (this.f790k) {
            invalidateSelf();
        }
        return this.f790k;
    }
}
