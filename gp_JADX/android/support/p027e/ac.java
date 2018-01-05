package android.support.p027e;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

final class ac implements ad {
    ac() {
    }

    public final ObjectAnimator mo197a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofObject(obj, property, null, path);
    }
}
