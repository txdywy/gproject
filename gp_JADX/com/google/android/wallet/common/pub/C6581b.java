package com.google.android.wallet.common.pub;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.widget.ImageView.ScaleType;
import com.google.android.wallet.ui.common.ad;
import com.google.android.wallet.ui.common.ci;

final class C6581b implements ad {
    public final /* synthetic */ C6529a f32717a;

    C6581b(C6529a c6529a) {
        this.f32717a = c6529a;
    }

    public final void mo5538a(Bitmap bitmap) {
        if (this.f32717a.g() != null && bitmap != null) {
            int i;
            this.f32717a.f32590b.setScaleType(ScaleType.MATRIX);
            int width = this.f32717a.f32590b.getWidth();
            int height = this.f32717a.f32590b.getHeight();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            float f = ((float) width2) / ((float) height2);
            if (ci.m30890e(this.f32717a.g())) {
                i = (int) (((float) height) * f);
            } else {
                i = Math.max(width, (int) (((float) height) * f));
                height = Math.max(height, (int) (((float) width) / f));
            }
            RectF rectF = new RectF(0.0f, 0.0f, (float) width2, (float) height2);
            RectF rectF2 = new RectF(0.0f, 0.0f, (float) i, (float) height);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.FILL);
            this.f32717a.f32590b.setImageMatrix(matrix);
        }
    }
}
