package android.support.p027e;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

final class ab implements ad {
    ab() {
    }

    public final ObjectAnimator mo197a(Object obj, Property property, Path path) {
        return ObjectAnimator.ofFloat(obj, new af(property, path), new float[]{0.0f, 1.0f});
    }
}
