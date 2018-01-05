package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;

public interface bo {
    ColorStateList getSupportImageTintList();

    Mode getSupportImageTintMode();

    void setSupportImageTintList(ColorStateList colorStateList);

    void setSupportImageTintMode(Mode mode);
}
