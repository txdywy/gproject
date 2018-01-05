package android.support.v4.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

final class bh extends EpicenterCallback {
    public final /* synthetic */ Rect f1405a;

    bh(Rect rect) {
        this.f1405a = rect;
    }

    public final Rect onGetEpicenter(Transition transition) {
        if (this.f1405a == null || this.f1405a.isEmpty()) {
            return null;
        }
        return this.f1405a;
    }
}
