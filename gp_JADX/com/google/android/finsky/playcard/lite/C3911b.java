package com.google.android.finsky.playcard.lite;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dj.C2823a;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.x;
import com.google.android.play.image.y;
import com.google.android.play.layout.a;

public final class C3911b implements y, a {
    public final TextPaint f19771a = new TextPaint(1);
    public final Paint f19772b;
    public final View f19773c;
    public final Rect f19774d = new Rect();
    public final int f19775e;
    public int f19776f;
    public CharSequence f19777g = "";
    public CharSequence f19778h;
    public boolean f19779i = true;
    public StaticLayout f19780j;
    public int f19781k;
    public int f19782l;
    public x f19783m;

    public C3911b(Resources resources, float f, int i, View view) {
        this.f19771a.density = resources.getDisplayMetrics().density;
        this.f19771a.setTextSize(f);
        this.f19771a.setTypeface(Typeface.create("sans-serif", 0));
        this.f19775e = i;
        this.f19772b = new Paint(2);
        this.f19773c = view;
    }

    public final void m18579a(x xVar) {
        this.f19773c.invalidate();
    }

    public final void setVisibility(int i) {
        if (this.f19776f != i) {
            this.f19776f = i;
            this.f19773c.requestLayout();
            this.f19773c.invalidate();
        }
    }

    public final void setText(CharSequence charSequence) {
        if (charSequence == null) {
            this.f19777g = "";
        } else {
            this.f19777g = charSequence;
        }
        this.f19773c.requestLayout();
        this.f19773c.invalidate();
    }

    public final CharSequence getText() {
        return this.f19777g;
    }

    public final float getTextSize() {
        return this.f19771a.getTextSize();
    }

    public final void setContentDescription(CharSequence charSequence) {
        this.f19778h = charSequence;
    }

    public final void setShouldScreenread(boolean z) {
        this.f19779i = z;
    }

    public final void m18578a(C1294w c1294w, bd bdVar, int i) {
        String str = bdVar.f11860f;
        if (this.f19783m != null) {
            if (!this.f19783m.c().equals(str) || this.f19783m.d() != i) {
                this.f19783m.a();
            } else {
                return;
            }
        }
        this.f19783m = c1294w.mo1671a(str, i, i, this);
        this.f19773c.requestLayout();
        this.f19773c.invalidate();
    }

    public final void m18576a() {
        if (this.f19783m != null) {
            this.f19783m.a();
            this.f19783m = null;
            this.f19773c.requestLayout();
            this.f19773c.invalidate();
        }
    }

    public final void m18577a(int i) {
        if (this.f19783m != null) {
            i -= this.f19775e + this.f19783m.d();
        }
        this.f19780j = C2823a.m14945a(this.f19777g, 0, this.f19777g.length(), this.f19771a, Math.max(i, 0), Alignment.ALIGN_NORMAL, true, TruncateAt.END, 1);
    }

    public final void m18580b(int i) {
        if (this.f19771a.getColor() != i) {
            this.f19771a.setColor(i);
            this.f19773c.invalidate();
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f19773c.invalidate();
    }
}
