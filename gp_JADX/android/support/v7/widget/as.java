package android.support.v7.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.support.v4.p013b.p014a.C0260b;
import android.util.AttributeSet;
import android.widget.ProgressBar;

class as {
    public static final int[] f3123a = new int[]{16843067, 16843068};
    public final ProgressBar f3124b;
    public Bitmap f3125c;

    as(ProgressBar progressBar) {
        this.f3124b = progressBar;
    }

    void mo752a(AttributeSet attributeSet, int i) {
        hc a = hc.m3769a(this.f3124b.getContext(), attributeSet, f3123a, i, 0);
        Drawable b = a.m3774b(0);
        if (b != null) {
            ProgressBar progressBar = this.f3124b;
            if (b instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) b;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                Drawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable a2 = m3200a(animationDrawable.getFrame(i2), true);
                    a2.setLevel(10000);
                    animationDrawable2.addFrame(a2, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                b = animationDrawable2;
            }
            progressBar.setIndeterminateDrawable(b);
        }
        b = a.m3774b(1);
        if (b != null) {
            this.f3124b.setProgressDrawable(m3200a(b, false));
        }
        a.f3558b.recycle();
    }

    private final Drawable m3200a(Drawable drawable, boolean z) {
        int i = 0;
        Drawable a;
        if (drawable instanceof C0260b) {
            a = ((C0260b) drawable).mo360a();
            if (a == null) {
                return drawable;
            }
            ((C0260b) drawable).mo361a(m3200a(a, z));
            return drawable;
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                boolean z2;
                int id = layerDrawable.getId(i2);
                Drawable drawable2 = layerDrawable.getDrawable(i2);
                if (id == 16908301 || id == 16908303) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                drawableArr[i2] = m3200a(drawable2, z2);
            }
            a = new LayerDrawable(drawableArr);
            while (i < numberOfLayers) {
                a.setId(i, layerDrawable.getId(i));
                i++;
            }
            return a;
        } else if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f3125c == null) {
                this.f3125c = bitmap;
            }
            a = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            a.getPaint().setShader(new BitmapShader(bitmap, TileMode.REPEAT, TileMode.CLAMP));
            a.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(a, 3, 1) : a;
        }
    }
}
