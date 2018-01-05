package android.support.p011c.p012a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class C0060r extends ConstantState {
    public int f140a;
    public C0059q f141b;
    public ColorStateList f142c;
    public Mode f143d;
    public boolean f144e;
    public Bitmap f145f;
    public ColorStateList f146g;
    public Mode f147h;
    public int f148i;
    public boolean f149j;
    public boolean f150k;
    public Paint f151l;

    public C0060r(C0060r c0060r) {
        this.f142c = null;
        this.f143d = C0054l.f86a;
        if (c0060r != null) {
            this.f140a = c0060r.f140a;
            this.f141b = new C0059q(c0060r.f141b);
            if (c0060r.f141b.f129f != null) {
                this.f141b.f129f = new Paint(c0060r.f141b.f129f);
            }
            if (c0060r.f141b.f128e != null) {
                this.f141b.f128e = new Paint(c0060r.f141b.f128e);
            }
            this.f142c = c0060r.f142c;
            this.f143d = c0060r.f143d;
            this.f144e = c0060r.f144e;
        }
    }

    public final void m73a(int i, int i2) {
        this.f145f.eraseColor(0);
        this.f141b.m72a(new Canvas(this.f145f), i, i2);
    }

    public C0060r() {
        this.f142c = null;
        this.f143d = C0054l.f86a;
        this.f141b = new C0059q();
    }

    public final Drawable newDrawable() {
        return new C0054l(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return new C0054l(this);
    }

    public final int getChangingConfigurations() {
        return this.f140a;
    }
}
