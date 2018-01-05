package android.support.p027e;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.util.Property;

final class ah implements aj {
    ah() {
    }

    public final PropertyValuesHolder mo198a(Property property, Path path) {
        return PropertyValuesHolder.ofFloat(new af(property, path), new float[]{0.0f, 1.0f});
    }
}
