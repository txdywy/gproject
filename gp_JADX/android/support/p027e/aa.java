package android.support.p027e;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.util.Property;

final class aa {
    public static final ad f1009a;

    static ObjectAnimator m820a(Object obj, Property property, Path path) {
        return f1009a.mo197a(obj, property, path);
    }

    static {
        if (VERSION.SDK_INT >= 21) {
            f1009a = new ac();
        } else {
            f1009a = new ab();
        }
    }
}
