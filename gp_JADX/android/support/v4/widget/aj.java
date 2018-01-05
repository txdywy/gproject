package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.widget.ImageView;

class aj implements ak {
    aj() {
    }

    public ColorStateList mo460a(ImageView imageView) {
        return imageView instanceof bo ? ((bo) imageView).getSupportImageTintList() : null;
    }

    public void mo461a(ImageView imageView, ColorStateList colorStateList) {
        if (imageView instanceof bo) {
            ((bo) imageView).setSupportImageTintList(colorStateList);
        }
    }

    public void mo462a(ImageView imageView, Mode mode) {
        if (imageView instanceof bo) {
            ((bo) imageView).setSupportImageTintMode(mode);
        }
    }

    public Mode mo463b(ImageView imageView) {
        return imageView instanceof bo ? ((bo) imageView).getSupportImageTintMode() : null;
    }
}
