package com.google.android.play.drawer;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint.Align;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.google.android.play.C6282d;
import com.google.android.play.C6314e;
import com.google.android.play.C6315f;
import com.google.android.play.i;

public final class C6294d extends Drawable {
    public final Drawable f31467a;
    public final String f31468b;
    public final TextPaint f31469c;
    public int f31470d;

    public C6294d(Resources resources, int i) {
        this.f31467a = resources.getDrawable(C6315f.play_dot_notification_counter);
        this.f31468b = resources.getString(i.play_dot_notification_counter_more_than_nine);
        TextPaint textPaint = new TextPaint();
        textPaint.setAntiAlias(true);
        textPaint.setColor(resources.getColor(C6282d.play_white));
        textPaint.setTextAlign(Align.CENTER);
        textPaint.setTextSize((float) resources.getDimensionPixelSize(C6314e.play_dot_notification_counter_text_size));
        textPaint.setTypeface(Typeface.create("sans-serif-medium", 0));
        this.f31469c = textPaint;
        this.f31470d = i;
    }

    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        this.f31467a.setBounds(rect);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f31467a.setBounds(i, i2, i3, i4);
    }

    public final void draw(Canvas canvas) {
        this.f31467a.draw(canvas);
        Rect rect = new Rect();
        int i = this.f31470d;
        String valueOf = i > 9 ? this.f31468b : String.valueOf(i);
        this.f31469c.getTextBounds(valueOf, 0, valueOf.length(), rect);
        canvas.drawText(valueOf, this.f31467a.getBounds().exactCenterX(), (((float) rect.height()) / 2.0f) + this.f31467a.getBounds().exactCenterY(), this.f31469c);
    }

    public final void setAlpha(int i) {
        this.f31467a.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f31467a.setColorFilter(colorFilter);
    }

    public final int getOpacity() {
        return this.f31467a.getOpacity();
    }

    public final int getIntrinsicHeight() {
        return this.f31467a.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        return this.f31467a.getIntrinsicWidth();
    }
}
