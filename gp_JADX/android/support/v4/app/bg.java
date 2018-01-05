package android.support.v4.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

final class bg implements TransitionListener {
    public final /* synthetic */ Object f1398a;
    public final /* synthetic */ ArrayList f1399b;
    public final /* synthetic */ Object f1400c;
    public final /* synthetic */ ArrayList f1401d;
    public final /* synthetic */ Object f1402e;
    public final /* synthetic */ ArrayList f1403f;
    public final /* synthetic */ bd f1404g;

    bg(bd bdVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f1404g = bdVar;
        this.f1398a = obj;
        this.f1399b = arrayList;
        this.f1400c = obj2;
        this.f1401d = arrayList2;
        this.f1402e = obj3;
        this.f1403f = arrayList3;
    }

    public final void onTransitionStart(Transition transition) {
        if (this.f1398a != null) {
            this.f1404g.mo263b(this.f1398a, this.f1399b, null);
        }
        if (this.f1400c != null) {
            this.f1404g.mo263b(this.f1400c, this.f1401d, null);
        }
        if (this.f1402e != null) {
            this.f1404g.mo263b(this.f1402e, this.f1403f, null);
        }
    }

    public final void onTransitionEnd(Transition transition) {
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }
}
