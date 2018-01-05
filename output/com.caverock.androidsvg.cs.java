package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.Bitmap$Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class com.caverock.androidsvg.cs extends Drawable
{

    public final com.caverock.androidsvg.as a;
    public com.caverock.androidsvg.q b;
    public Picture c;
    public Rect d;
    public Bitmap e;
    public Paint f;

    cs(com.caverock.androidsvg.q p0) {
        com.caverock.androidsvg.cs(p0, new com.caverock.androidsvg.as());
    }

    cs(com.caverock.androidsvg.q p0, com.caverock.androidsvg.as p1) {
        Drawable();
        this.b = p0;
        this.a = p1;
        this.c = this.b.a(this.a);
        this.f = new Paint();
        this.d = new Rect();
    }

    public void draw(Canvas p0) {
        v0 = this.getBounds();
        if (v0.width() > 0 && v0.height() > 0) {
            if (!v0.equals(this.d)) {
                this.copyBounds(this.d);
                v1 = v0.width();
                v2 = v0.height();
                this.e = Bitmap.createBitmap(v1, v2, Bitmap$Config.ARGB_8888);
                new Canvas(this.e).drawPicture(this.c, new Rect(0, 0, v1, v2));
            }
            p0.drawBitmap(this.e, (float)v0.left, (float)v0.top, this.f);
        }
    }

    public int getIntrinsicHeight() {
        return (int)Math.ceil((double)this.b.b());
    }

    public int getIntrinsicWidth() {
        return (int)Math.ceil((double)this.b.a());
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int p0) {
        this.f.setAlpha(p0);
    }

    public void setColorFilter(ColorFilter p0) {
    }

}
