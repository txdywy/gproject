package com.google.android.finsky.playcard.lite;

import android.content.res.Resources;
import android.graphics.Paint.FontMetrics;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import com.google.android.play.layout.c;
import com.squareup.leakcanary.C7582R;

public final class C3913d implements c {
    public final int f19803a;
    public final int f19804b;
    public final int f19805c;
    public final int f19806d;
    public int f19807e;
    public int f19808f;
    public int f19809g;
    public int f19810h;
    public CharSequence f19811i;
    public final TextPaint f19812j;
    public final TextPaint f19813k = new TextPaint(1);
    public final View f19814l;
    public Drawable f19815m;
    public int f19816n;
    public String f19817o;
    public String f19818p;
    public int f19819q;
    public boolean f19820r;
    public int f19821s;
    public int f19822t;

    public C3913d(Resources resources, float f, View view) {
        this.f19806d = resources.getDimensionPixelSize(C7582R.dimen.play_card_label_icon_gap);
        this.f19805c = resources.getDimensionPixelSize(C7582R.dimen.play_card_label_texts_gap);
        this.f19814l = view;
        this.f19813k.density = resources.getDisplayMetrics().density;
        this.f19813k.setTextSize(f);
        this.f19812j = new TextPaint(1);
        this.f19812j.density = resources.getDisplayMetrics().density;
        this.f19812j.setTextSize(f);
        this.f19812j.setStrikeThruText(true);
        FontMetrics fontMetrics = this.f19813k.getFontMetrics();
        this.f19804b = (int) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom));
        this.f19803a = (int) Math.abs(fontMetrics.top);
    }

    public final void setVisibility(int i) {
        if (this.f19816n != i) {
            this.f19816n = i;
            this.f19814l.requestLayout();
            this.f19814l.invalidate();
        }
    }

    public final int getVisibility() {
        return this.f19816n;
    }

    public final void setContentDescription(CharSequence charSequence) {
        this.f19811i = charSequence;
    }

    public final void m18585a(String str, int i, String str2, int i2, String str3) {
        if (str == null || str.length() == 0) {
            this.f19818p = null;
        } else {
            this.f19818p = str.toUpperCase();
            this.f19813k.setColor(i);
        }
        if (str2 == null || str2.length() == 0) {
            this.f19817o = null;
        } else {
            this.f19817o = str2.toUpperCase();
            this.f19812j.setColor(i2);
        }
        this.f19811i = str3;
        this.f19814l.requestLayout();
        this.f19814l.invalidate();
    }

    public final void m18584a() {
        this.f19818p = null;
        this.f19817o = null;
        this.f19811i = null;
        this.f19814l.requestLayout();
        this.f19814l.invalidate();
    }

    public final void setIconDrawable(Drawable drawable) {
        this.f19815m = drawable;
        this.f19815m.setBounds(0, 0, this.f19815m.getIntrinsicWidth(), this.f19815m.getIntrinsicHeight());
        this.f19814l.requestLayout();
        this.f19814l.invalidate();
    }

    public final void m18586b() {
        if (this.f19815m != null) {
            this.f19815m = null;
            this.f19814l.requestLayout();
            this.f19814l.invalidate();
        }
    }
}
