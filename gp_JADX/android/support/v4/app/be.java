package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class be extends EpicenterCallback {
    public final /* synthetic */ Rect f1395a;

    be(Rect rect) {
        this.f1395a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        return this.f1395a;
    }
}
