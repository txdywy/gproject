package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

final class al extends aj {
    al() {
    }

    public final ColorStateList mo460a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    public final void mo461a(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
        if (VERSION.SDK_INT == 21) {
            Drawable drawable = imageView.getDrawable();
            Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
            if (drawable != null && obj != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }

    public final void mo462a(ImageView imageView, Mode mode) {
        imageView.setImageTintMode(mode);
        if (VERSION.SDK_INT == 21) {
            Drawable drawable = imageView.getDrawable();
            Object obj = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? null : 1;
            if (drawable != null && obj != null) {
                if (drawable.isStateful()) {
                    drawable.setState(imageView.getDrawableState());
                }
                imageView.setImageDrawable(drawable);
            }
        }
    }

    public final Mode mo463b(ImageView imageView) {
        return imageView.getImageTintMode();
    }
}
