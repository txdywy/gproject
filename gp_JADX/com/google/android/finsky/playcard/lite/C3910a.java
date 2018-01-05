package com.google.android.finsky.playcard.lite;

import android.content.res.Resources;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import com.squareup.leakcanary.C7582R;

public final class C3910a {
    public final Drawable f19758a;
    public final Drawable f19759b;
    public final TextPaint f19760c;
    public final int f19761d;
    public final int f19762e;
    public final int f19763f;
    public final int f19764g;
    public final View f19765h;
    public int f19766i;
    public int f19767j;
    public CharSequence f19768k = "";
    public float f19769l;
    public float f19770m;

    public C3910a(Resources resources, View view) {
        this.f19758a = resources.getDrawable(C7582R.drawable.play_ad_label_container_v2);
        this.f19759b = resources.getDrawable(C7582R.drawable.play_ad_label_v2);
        this.f19759b.setCallback(view);
        this.f19761d = resources.getDimensionPixelSize(C7582R.dimen.flat_ad_label_container_padding);
        this.f19762e = resources.getDimensionPixelSize(C7582R.dimen.flat_ad_label_horizontal_padding);
        this.f19765h = view;
        int dimensionPixelSize = resources.getDimensionPixelSize(C7582R.dimen.play_ad_label_text_size);
        int color = resources.getColor(C7582R.color.play_card_ad_badge_color_v2);
        this.f19760c = new TextPaint(1);
        this.f19760c.density = resources.getDisplayMetrics().density;
        this.f19760c.setTextSize((float) dimensionPixelSize);
        this.f19760c.setColor(color);
        this.f19760c.setTypeface(Typeface.create("sans-serif-medium", 0));
        FontMetricsInt fontMetricsInt = this.f19760c.getFontMetricsInt();
        this.f19763f = -fontMetricsInt.top;
        this.f19764g = fontMetricsInt.bottom - fontMetricsInt.top;
    }

    public final int m18575a() {
        return this.f19764g + this.f19761d;
    }
}
