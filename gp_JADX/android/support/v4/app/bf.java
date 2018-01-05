package android.support.v4.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

final class bf implements TransitionListener {
    public final /* synthetic */ View f1396a;
    public final /* synthetic */ ArrayList f1397b;

    bf(View view, ArrayList arrayList) {
        this.f1396a = view;
        this.f1397b = arrayList;
    }

    public final void onTransitionStart(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f1396a.setVisibility(8);
        int size = this.f1397b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.f1397b.get(i)).setVisibility(0);
        }
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }
}
