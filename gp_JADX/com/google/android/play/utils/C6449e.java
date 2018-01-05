package com.google.android.play.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Align;

public final class C6449e {
    public static final Matrix f32418a = new Matrix();

    public static Bitmap m29500a(Bitmap bitmap, String str, int i) {
        if (bitmap == null) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawBitmap(bitmap, f32418a, null);
        Paint paint = new Paint(8);
        paint.setColor(str.contains("ggpht.com") ? -16711681 : -65281);
        paint.setStrokeWidth(3.0f);
        paint.setTextAlign(Align.LEFT);
        String str2 = i + "k";
        String str3 = bitmap.getHeight() + "h";
        String str4 = bitmap.getWidth() + "w";
        float f = 40.0f;
        while (true) {
            paint.setTextSize(f);
            if (((double) f) * 3.1d > ((double) canvas.getHeight()) || ((double) Math.max(Math.max(paint.measureText(str3), paint.measureText(str4)), paint.measureText(str2))) * 1.1d >= ((double) canvas.getWidth())) {
                f = (float) (0.8d * ((double) f));
            } else {
                float height = ((float) (canvas.getHeight() / 2)) - f;
                canvas.drawText(str2, 4.0f, height, paint);
                float f2 = (5.0f + f) + height;
                canvas.drawText(str3, 4.0f, f2, paint);
                canvas.drawText(str4, 4.0f, (f + 5.0f) + f2, paint);
                bitmap.recycle();
                return createBitmap;
            }
        }
    }
}
