package android.support.design.p018a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

public final class C0096b {
    public static void m209a(AnimatorSet animatorSet, List list) {
        Animator animator;
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            animator = (Animator) list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        animator = ValueAnimator.ofInt(new int[]{0, 0});
        animator.setDuration(j);
        list.add(0, animator);
        animatorSet.playTogether(list);
    }
}
