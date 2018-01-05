package com.google.android.play.p203b;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.play.C6282d;

@TargetApi(21)
public final class C6265c extends RippleDrawable {
    public Resources f31320a;
    public C6264b f31321b;
    public Bitmap f31322c;

    C6265c(Resources resources, C6264b c6264b) {
        super(resources.getColorStateList(C6282d.play_overlay_highlight_fill), null, c6264b);
        this.f31320a = resources;
        this.f31321b = c6264b;
    }

    protected final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f31321b.setBounds(rect);
        m28782a(rect);
    }

    final void m28782a(Rect rect) {
        int width = rect.width();
        int height = rect.height();
        if (width > 0 && height > 0) {
            try {
                if (this.f31322c == null) {
                    this.f31322c = Bitmap.createBitmap(width, height, Config.ALPHA_8);
                } else {
                    this.f31322c.reconfigure(width, height, Config.ALPHA_8);
                }
            } catch (Throwable th) {
                this.f31322c = null;
            }
            if (this.f31322c != null) {
                Canvas canvas = new Canvas(this.f31322c);
                canvas.drawColor(0, Mode.SRC);
                this.f31321b.setBounds(0, 0, width, height);
                this.f31321b.draw(canvas);
                setDrawableByLayerId(16908334, new BitmapDrawable(this.f31320a, this.f31322c));
            } else {
                setDrawableByLayerId(16908334, new ColorDrawable(-1));
            }
            invalidateSelf();
        }
    }
}
