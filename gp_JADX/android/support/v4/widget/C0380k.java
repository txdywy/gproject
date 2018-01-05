package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.os.Build.VERSION;
import android.widget.CompoundButton;

public final class C0380k {
    public static final C0381n f2182a;

    public static void m2283a(CompoundButton compoundButton, ColorStateList colorStateList) {
        f2182a.mo482a(compoundButton, colorStateList);
    }

    static {
        if (VERSION.SDK_INT >= 23) {
            f2182a = new C0383m();
        } else if (VERSION.SDK_INT >= 21) {
            f2182a = new C0382l();
        } else {
            f2182a = new C0381n();
        }
    }
}
