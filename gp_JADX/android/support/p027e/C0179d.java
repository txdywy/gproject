package android.support.p027e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class C0179d implements C0176e {
    C0179d() {
    }

    public final void mo226a(Animator animator, AnimatorListenerAdapter animatorListenerAdapter) {
        animator.addPauseListener(animatorListenerAdapter);
    }

    public final void mo225a(Animator animator) {
        animator.pause();
    }

    public final void mo227b(Animator animator) {
        animator.resume();
    }
}
