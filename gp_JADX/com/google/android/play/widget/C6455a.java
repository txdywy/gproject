package com.google.android.play.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import com.squareup.haha.perflib.HprofParser;

public final class C6455a extends Drawable implements Animatable {
    public final float f32433a;
    public final float f32434b;
    public final long f32435c = 800;
    public final long f32436d;
    public boolean f32437e;
    public final Paint f32438f;

    public C6455a(int i, long j) {
        this.f32436d = j;
        this.f32433a = Math.max(0.0f, 0.1f);
        this.f32434b = Math.min(1.0f, 1.0f) - 0.1f;
        this.f32438f = new Paint();
        this.f32438f.setAntiAlias(true);
        this.f32438f.setColor(i);
        this.f32438f.setStyle(Style.FILL_AND_STROKE);
    }

    public final void draw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        canvas.saveLayerAlpha(0.0f, 0.0f, (float) width, (float) height, HprofParser.ROOT_UNKNOWN, 31);
        float sin = (((float) Math.sin(((double) (((float) ((System.currentTimeMillis() + this.f32436d) % this.f32435c)) / ((float) this.f32435c))) * 6.283185307179586d)) * 0.5f) + 0.5f;
        float f = ((float) width) / 2.0f;
        float f2 = ((float) height) / 2.0f;
        canvas.drawCircle(f, f2, (((sin * this.f32434b) + this.f32433a) * ((float) Math.min(width, height))) / 2.0f, this.f32438f);
        canvas.restore();
        if (isRunning()) {
            invalidateSelf();
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f32438f.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f32438f.setColorFilter(colorFilter);
    }

    public final boolean isRunning() {
        return this.f32437e;
    }

    public final void start() {
        if (!isRunning()) {
            System.currentTimeMillis();
            this.f32437e = true;
            invalidateSelf();
        }
    }

    public final void stop() {
        this.f32437e = false;
    }
}
