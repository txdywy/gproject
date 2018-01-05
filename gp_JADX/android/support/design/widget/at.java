package android.support.design.widget;

import android.support.v4.view.ai;
import android.view.View;
import java.util.Comparator;

final class at implements Comparator {
    at() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj2;
        float B = ai.f1848a.mo412B((View) obj);
        float B2 = ai.f1848a.mo412B(view);
        if (B > B2) {
            return -1;
        }
        if (B < B2) {
            return 1;
        }
        return 0;
    }
}
