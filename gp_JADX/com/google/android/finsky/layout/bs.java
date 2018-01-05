package com.google.android.finsky.layout;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.RectF;
import android.support.v4.view.ai;
import android.widget.ImageView.ScaleType;
import com.google.android.play.image.FifeImageView;
import com.google.android.play.image.be;
import com.squareup.leakcanary.C7582R;

public final class bs implements be {
    public final /* synthetic */ SetupWizardIllustration f18540a;

    public bs(SetupWizardIllustration setupWizardIllustration) {
        this.f18540a = setupWizardIllustration;
    }

    public final void m17431a(FifeImageView fifeImageView, Bitmap bitmap) {
        if (bitmap != null) {
            int i;
            this.f18540a.f18377e.setScaleType(ScaleType.MATRIX);
            int width = this.f18540a.f18377e.getWidth();
            int height = this.f18540a.f18377e.getHeight();
            int width2 = bitmap.getWidth();
            int height2 = bitmap.getHeight();
            float f = ((float) width2) / ((float) height2);
            if (this.f18540a.f18376d) {
                this.f18540a.f18377e.setBackgroundResource(C7582R.drawable.setup_wizard_illustration_bg_tablet);
                i = (int) (((float) height) * f);
            } else {
                i = Math.max(width, (int) (((float) height) * f));
                height = Math.max(height, (int) (((float) width) / f));
            }
            RectF rectF = new RectF(0.0f, 0.0f, (float) width2, (float) height2);
            RectF rectF2 = new RectF(0.0f, 0.0f, (float) i, (float) height);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, ScaleToFit.FILL);
            if (ai.f1848a.mo400k(this.f18540a) != 0) {
                float width3 = rectF2.width();
                float height3 = rectF2.height();
                matrix.postScale(-1.0f, 1.0f, (width3 / 2.0f) + ((((float) fifeImageView.getWidth()) - width3) / 2.0f), (height3 / 2.0f) + ((((float) fifeImageView.getHeight()) - height3) / 2.0f));
            }
            this.f18540a.f18377e.setImageMatrix(matrix);
        }
    }

    public final void m17430a(FifeImageView fifeImageView) {
    }
}
