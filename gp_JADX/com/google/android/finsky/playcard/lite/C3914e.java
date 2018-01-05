package com.google.android.finsky.playcard.lite;

import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.text.TextPaint;
import android.view.View;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.n;
import com.google.android.play.layout.o;

public final class C3914e implements n {
    public final float f19823a;
    public final float f19824b;
    public final int f19825c;
    public final float f19826d;
    public final Path f19827e;
    public final Paint f19828f;
    public final TextPaint f19829g;
    public final int f19830h;
    public final int f19831i;
    public final View f19832j;
    public float f19833k;
    public String f19834l = "";
    public float f19835m;
    public int f19836n;
    public int f19837o;
    public int f19838p;
    public String f19839q;
    public String f19840r;

    public C3914e(Resources resources, float f, int i, int i2, View view) {
        this.f19823a = f;
        this.f19833k = 0.0f;
        this.f19825c = i2;
        this.f19832j = view;
        this.f19828f = new Paint(1);
        this.f19828f.setStyle(Style.FILL);
        this.f19829g = new TextPaint(1);
        this.f19829g.density = resources.getDisplayMetrics().density;
        this.f19829g.setTextSize((float) i);
        this.f19829g.setFakeBoldText(false);
        FontMetrics fontMetrics = this.f19829g.getFontMetrics();
        this.f19830h = (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
        this.f19831i = (int) Math.abs(fontMetrics.top);
        double a = o.a((double) this.f19825c);
        this.f19826d = (float) a;
        this.f19824b = (float) o.b(a);
        this.f19827e = o.a(o.c(a));
    }

    public final void setRating(float f) {
        if (this.f19833k != f) {
            this.f19833k = f;
            this.f19834l = o.a(f);
            this.f19840r = null;
            this.f19832j.requestLayout();
            this.f19832j.invalidate();
        }
    }

    public final void setVisibility(int i) {
        if (this.f19836n != i) {
            this.f19836n = i;
            this.f19832j.requestLayout();
            this.f19832j.invalidate();
        }
    }

    public final void setCompactMode(boolean z) {
        if (!z) {
            FinskyLog.m21669e("Only compact mode is supported for Flat cards", new Object[0]);
        }
    }

    public final void m18588a(int i, int i2) {
        if (this.f19828f.getColor() != i || this.f19829g.getColor() != i2) {
            this.f19828f.setColor(i);
            this.f19829g.setColor(i2);
            this.f19832j.invalidate();
        }
    }

    public final int m18587a() {
        return (int) ((this.f19835m + (this.f19823a * 2.0f)) + (this.f19824b * 2.0f));
    }
}
