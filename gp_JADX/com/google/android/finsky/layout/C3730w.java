package com.google.android.finsky.layout;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import com.google.android.finsky.C1473m;
import com.google.android.play.image.a;
import com.google.android.play.image.ac;

final class C3730w implements ac {
    public static final C3730w f18859a = new C3730w();

    private C3730w() {
    }

    public final int mo3104a(int i, int i2) {
        return a.a(C1473m.f7980a.f7981b.getResources()).a(i, i2);
    }

    public final Bitmap mo3105a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(height, height, Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(bitmap, (float) ((-(width - height)) / 2), 0.0f, null);
        return a.a(C1473m.f7980a.f7981b.getResources()).a(createBitmap, i, i2);
    }

    public final void mo3106a(Canvas canvas, int i, int i2) {
    }

    public final void mo3107b(Canvas canvas, int i, int i2) {
    }
}
