package android.support.v7.widget;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.widget.FrameLayout;

public class bj extends FrameLayout {
    public static final bq f442a;
    public boolean f443b;
    public boolean f444c;
    public final Rect f445d;
    public final bp f446e;

    public void setPadding(int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        throw new NoSuchMethodError();
    }

    public boolean getUseCompatPadding() {
        return this.f443b;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.f443b != z) {
            this.f443b = z;
            f442a.mo766f(this.f446e);
        }
    }

    protected void onMeasure(int i, int i2) {
        throw new NoSuchMethodError();
    }

    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        bq bqVar = f442a;
        bp bpVar = this.f446e;
        ColorStateList.valueOf(i);
        bqVar.mo768h(bpVar);
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f442a.mo768h(this.f446e);
    }

    public ColorStateList getCardBackgroundColor() {
        return f442a.mo769i(this.f446e);
    }

    public int getContentPaddingLeft() {
        return this.f445d.left;
    }

    public int getContentPaddingRight() {
        return this.f445d.right;
    }

    public int getContentPaddingTop() {
        return this.f445d.top;
    }

    public int getContentPaddingBottom() {
        return this.f445d.bottom;
    }

    public void setRadius(float f) {
        f442a.mo760a(this.f446e);
    }

    public float getRadius() {
        return f442a.mo764d(this.f446e);
    }

    public void setCardElevation(float f) {
        f442a.mo761a(this.f446e, f);
    }

    public float getCardElevation() {
        return f442a.mo765e(this.f446e);
    }

    public void setMaxCardElevation(float f) {
        f442a.mo762b(this.f446e);
    }

    public float getMaxCardElevation() {
        return f442a.mo763c(this.f446e);
    }

    public boolean getPreventCornerOverlap() {
        return this.f444c;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.f444c) {
            this.f444c = z;
            f442a.mo767g(this.f446e);
        }
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f442a = new bm();
        } else if (VERSION.SDK_INT >= 17) {
            f442a = new bk();
        } else {
            f442a = new bn();
        }
        f442a.mo759a();
    }
}
