package android.support.p027e;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

final class C0177b implements C0176e {
    C0177b() {
    }

    public final void mo226a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
    }

    public final void mo225a(Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0178c) {
                    ((C0178c) animatorListener).onAnimationPause(animator);
                }
            }
        }
    }

    public final void mo227b(Animator animator) {
        ArrayList listeners = animator.getListeners();
        if (listeners != null) {
            int size = listeners.size();
            for (int i = 0; i < size; i++) {
                AnimatorListener animatorListener = (AnimatorListener) listeners.get(i);
                if (animatorListener instanceof C0178c) {
                    ((C0178c) animatorListener).onAnimationResume(animator);
                }
            }
        }
    }
}
