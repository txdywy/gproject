package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.CompoundButton;
import java.lang.reflect.Field;

public class C0381n {
    public static Field f2183a;
    public static boolean f2184b;

    C0381n() {
    }

    public void mo482a(CompoundButton compoundButton, ColorStateList colorStateList) {
        if (compoundButton instanceof bn) {
            ((bn) compoundButton).setSupportButtonTintList(colorStateList);
        }
    }

    public void mo483a(CompoundButton compoundButton, Mode mode) {
        if (compoundButton instanceof bn) {
            ((bn) compoundButton).setSupportButtonTintMode(mode);
        }
    }

    public Drawable mo484a(CompoundButton compoundButton) {
        if (!f2184b) {
            try {
                Field declaredField = CompoundButton.class.getDeclaredField("mButtonDrawable");
                f2183a = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable e) {
                Log.i("CompoundButtonCompat", "Failed to retrieve mButtonDrawable field", e);
            }
            f2184b = true;
        }
        if (f2183a != null) {
            try {
                return (Drawable) f2183a.get(compoundButton);
            } catch (Throwable e2) {
                Log.i("CompoundButtonCompat", "Failed to get button drawable via reflection", e2);
                f2183a = null;
            }
        }
        return null;
    }
}
