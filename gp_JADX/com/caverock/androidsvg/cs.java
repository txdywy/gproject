package com.caverock.androidsvg;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public class cs extends Drawable {
    public final as f4452a;
    public C0722q f4453b;
    public Picture f4454c;
    public Rect f4455d;
    public Bitmap f4456e;
    public Paint f4457f;

    public cs(C0722q c0722q, as asVar) {
        this.f4453b = c0722q;
        this.f4452a = asVar;
        this.f4454c = this.f4453b.m4791a(this.f4452a);
        this.f4457f = new Paint();
        this.f4455d = new Rect();
    }

    public cs(C0722q c0722q) {
        this(c0722q, new as());
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.width() > 0 && bounds.height() > 0) {
            if (!bounds.equals(this.f4455d)) {
                copyBounds(this.f4455d);
                int width = bounds.width();
                int height = bounds.height();
                this.f4456e = Bitmap.createBitmap(width, height, Config.ARGB_8888);
                new Canvas(this.f4456e).drawPicture(this.f4454c, new Rect(0, 0, width, height));
            }
            canvas.drawBitmap(this.f4456e, (float) bounds.left, (float) bounds.top, this.f4457f);
        }
    }

    public void setAlpha(int i) {
        this.f4457f.setAlpha(i);
    }

    public int getIntrinsicWidth() {
        return (int) Math.ceil((double) this.f4453b.m4790a());
    }

    public int getIntrinsicHeight() {
        return (int) Math.ceil((double) this.f4453b.m4793b());
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public int getOpacity() {
        return -3;
    }
}
