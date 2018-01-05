package com.android.setupwizardlib;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import java.lang.ref.SoftReference;

public final class C0605a extends Drawable {
    public static SoftReference f3942a;
    public static Path[] f3943b;
    public static int[] f3944c;
    public int f3945d;
    public Paint f3946e = new Paint(1);
    public ColorFilter f3947f;

    public C0605a(int i) {
        this.f3945d = Color.argb(204, Color.red(i), Color.green(i), Color.blue(i));
        this.f3947f = new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.19999999f, ((float) r0) * 0.8f, 0.0f, 0.0f, 0.0f, 0.19999999f, ((float) r1) * 0.8f, 0.0f, 0.0f, 0.0f, 0.19999999f, ((float) r2) * 0.8f, 0.0f, 0.0f, 0.0f, 0.0f, 255.0f});
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        Bitmap bitmap;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        if (f3942a != null) {
            bitmap = (Bitmap) f3942a.get();
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            if (width > width2 && ((float) width2) < 2049.0f) {
                bitmap = null;
            } else if (height > height2 && ((float) height2) < 1152.0f) {
                bitmap = null;
            }
        }
        if (bitmap == null) {
            this.f3946e.reset();
            float min = Math.min(1.5f, Math.max(((float) width) / 1366.0f, ((float) height) / 768.0f));
            bitmap = Bitmap.createBitmap((int) (1366.0f * min), (int) (768.0f * min), Config.ALPHA_8);
            m4221a(new Canvas(bitmap), min);
            f3942a = new SoftReference(bitmap);
            this.f3946e.reset();
        }
        canvas.save();
        canvas.clipRect(bounds);
        int width3 = bitmap.getWidth();
        width = bitmap.getHeight();
        float width4 = ((float) bounds.width()) / ((float) width3);
        float height3 = ((float) bounds.height()) / ((float) width);
        canvas.scale(width4, height3);
        if (height3 > width4) {
            canvas.scale(height3 / width4, 1.0f, ((float) width3) * 0.146f, 0.0f);
        } else if (width4 > height3) {
            canvas.scale(1.0f, width4 / height3, 0.0f, 0.228f * ((float) width));
        }
        if (VERSION.SDK_INT < 11 || !canvas.isHardwareAccelerated()) {
            canvas.drawColor(-16777216);
            this.f3946e.setColor(-1);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f3946e);
            canvas.drawColor(this.f3945d);
        } else {
            this.f3946e.setColorFilter(this.f3947f);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f3946e);
        }
        canvas.restore();
    }

    private final void m4221a(Canvas canvas, float f) {
        canvas.save();
        canvas.scale(f, f);
        this.f3946e.setXfermode(new PorterDuffXfermode(Mode.SRC));
        if (f3943b == null) {
            f3943b = new Path[7];
            f3944c = new int[]{10, 40, 51, 66, 91, 112, 130};
            Path[] pathArr = f3943b;
            Path path = new Path();
            pathArr[0] = path;
            path.moveTo(1029.4f, 357.5f);
            path.lineTo(1366.0f, 759.1f);
            path.lineTo(1366.0f, 0.0f);
            path.lineTo(1137.7f, 0.0f);
            path.close();
            Path[] pathArr2 = f3943b;
            Path path2 = new Path();
            pathArr2[1] = path2;
            path2.moveTo(1138.1f, 0.0f);
            path2.rLineTo(-144.8f, 768.0f);
            path2.rLineTo(372.7f, 0.0f);
            path2.rLineTo(0.0f, -524.0f);
            path2.cubicTo(1290.7f, 121.6f, 1219.2f, 41.1f, 1178.7f, 0.0f);
            path2.close();
            pathArr2 = f3943b;
            path2 = new Path();
            pathArr2[2] = path2;
            path2.moveTo(949.8f, 768.0f);
            path2.rCubicTo(92.6f, -170.6f, 213.0f, -440.3f, 269.4f, -768.0f);
            path2.lineTo(585.0f, 0.0f);
            path2.rLineTo(2.1f, 766.0f);
            path2.close();
            pathArr2 = f3943b;
            path2 = new Path();
            pathArr2[3] = path2;
            path2.moveTo(471.1f, 768.0f);
            path2.rMoveTo(704.5f, 0.0f);
            path2.cubicTo(1123.6f, 563.3f, 1027.4f, 275.2f, 856.2f, 0.0f);
            path2.lineTo(476.4f, 0.0f);
            path2.rLineTo(-5.3f, 768.0f);
            path2.close();
            pathArr2 = f3943b;
            path2 = new Path();
            pathArr2[4] = path2;
            path2.moveTo(323.1f, 768.0f);
            path2.moveTo(777.5f, 768.0f);
            path2.cubicTo(661.9f, 348.8f, 427.2f, 21.4f, 401.2f, 25.4f);
            path2.lineTo(323.1f, 768.0f);
            path2.close();
            pathArr2 = f3943b;
            path2 = new Path();
            pathArr2[5] = path2;
            path2.moveTo(178.44286f, 766.8571f);
            path2.lineTo(308.7f, 768.0f);
            path2.cubicTo(381.7f, 604.6f, 481.6f, 344.3f, 562.2f, 0.0f);
            path2.lineTo(0.0f, 0.0f);
            path2.close();
            pathArr2 = f3943b;
            path2 = new Path();
            pathArr2[6] = path2;
            path2.moveTo(146.0f, 0.0f);
            path2.lineTo(0.0f, 0.0f);
            path2.lineTo(0.0f, 768.0f);
            path2.lineTo(394.2f, 768.0f);
            path2.cubicTo(327.7f, 475.3f, 228.5f, 201.0f, 146.0f, 0.0f);
            path2.close();
        }
        for (int i = 0; i < 7; i++) {
            this.f3946e.setColor(f3944c[i] << 24);
            canvas.drawPath(f3943b[i], this.f3946e);
        }
        canvas.restore();
        this.f3946e.reset();
    }

    public final void setAlpha(int i) {
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getOpacity() {
        return 0;
    }
}
