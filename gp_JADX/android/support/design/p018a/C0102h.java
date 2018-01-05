package android.support.design.p018a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.p037h.C0304u;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;

public final class C0102h {
    public final C0304u f433a = new C0304u();

    public final C0103i m214a(String str) {
        if ((this.f433a.get(str) != null ? 1 : null) != null) {
            return (C0103i) this.f433a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final long m213a() {
        long j = 0;
        int size = this.f433a.size();
        for (int i = 0; i < size; i++) {
            C0103i c0103i = (C0103i) this.f433a.m1630c(i);
            j = Math.max(j, c0103i.f434a + c0103i.f435b);
        }
        return j;
    }

    public static C0102h m211a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                return C0102h.m210a(context, resourceId);
            }
        }
        return null;
    }

    public static C0102h m210a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return C0102h.m212a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            List arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return C0102h.m212a(arrayList);
        } catch (Throwable e) {
            Throwable th = e;
            String str = "MotionSpec";
            String str2 = "Can't load animation resource ID #0x";
            String valueOf = String.valueOf(Integer.toHexString(i));
            Log.d(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), th);
            return null;
        }
    }

    private static C0102h m212a(List list) {
        C0102h c0102h = new C0102h();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = C0095a.f421a;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = C0095a.f422b;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = C0095a.f423c;
                }
                C0103i c0103i = new C0103i(startDelay, duration, interpolator);
                c0103i.f437d = objectAnimator.getRepeatCount();
                c0103i.f438e = objectAnimator.getRepeatMode();
                c0102h.f433a.put(propertyName, c0103i);
                i++;
            } else {
                String valueOf = String.valueOf(animator);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 36).append("Animator must be an ObjectAnimator: ").append(valueOf).toString());
            }
        }
        return c0102h;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f433a.equals(((C0102h) obj).f433a);
    }

    public final int hashCode() {
        return this.f433a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\n');
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" timings: ");
        stringBuilder.append(this.f433a);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
