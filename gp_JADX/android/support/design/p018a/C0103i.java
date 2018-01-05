package android.support.design.p018a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

public final class C0103i {
    public long f434a = 0;
    public long f435b = 300;
    public TimeInterpolator f436c = null;
    public int f437d = 0;
    public int f438e = 1;

    public C0103i(long j) {
        this.f434a = j;
        this.f435b = 150;
    }

    public C0103i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f434a = j;
        this.f435b = j2;
        this.f436c = timeInterpolator;
    }

    public final void m216a(Animator animator) {
        animator.setStartDelay(this.f434a);
        animator.setDuration(this.f435b);
        animator.setInterpolator(m215a());
        if (animator instanceof ValueAnimator) {
            ((ValueAnimator) animator).setRepeatCount(this.f437d);
            ((ValueAnimator) animator).setRepeatMode(this.f438e);
        }
    }

    public final TimeInterpolator m215a() {
        return this.f436c != null ? this.f436c : C0095a.f421a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0103i c0103i = (C0103i) obj;
        if (this.f434a == c0103i.f434a && this.f435b == c0103i.f435b && this.f437d == c0103i.f437d && this.f438e == c0103i.f438e) {
            return m215a().getClass().equals(c0103i.m215a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        return (((((((((int) (this.f434a ^ (this.f434a >>> 32))) * 31) + ((int) (this.f435b ^ (this.f435b >>> 32)))) * 31) + m215a().getClass().hashCode()) * 31) + this.f437d) * 31) + this.f438e;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('\n');
        stringBuilder.append(getClass().getName());
        stringBuilder.append('{');
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" delay: ");
        stringBuilder.append(this.f434a);
        stringBuilder.append(" duration: ");
        stringBuilder.append(this.f435b);
        stringBuilder.append(" interpolator: ");
        stringBuilder.append(m215a().getClass());
        stringBuilder.append(" repeatCount: ");
        stringBuilder.append(this.f437d);
        stringBuilder.append(" repeatMode: ");
        stringBuilder.append(this.f438e);
        stringBuilder.append("}\n");
        return stringBuilder.toString();
    }
}
