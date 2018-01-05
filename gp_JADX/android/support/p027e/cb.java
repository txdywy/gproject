package android.support.p027e;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

final class cb extends AnimatorListenerAdapter implements at, C0178c {
    public final View f1121a;
    public final int f1122b;
    public final ViewGroup f1123c;
    public final boolean f1124d;
    public boolean f1125e;
    public boolean f1126f = false;

    cb(View view, int i) {
        this.f1121a = view;
        this.f1122b = i;
        this.f1123c = (ViewGroup) view.getParent();
        this.f1124d = true;
        m985a(true);
    }

    public final void onAnimationPause(Animator animator) {
        if (!this.f1126f) {
            bq.m943a(this.f1121a, this.f1122b);
        }
    }

    public final void onAnimationResume(Animator animator) {
        if (!this.f1126f) {
            bq.m943a(this.f1121a, 0);
        }
    }

    public final void onAnimationCancel(Animator animator) {
        this.f1126f = true;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        m986d();
    }

    public final void mo203c() {
    }

    public final void mo201a(an anVar) {
        m986d();
        anVar.mo213b((at) this);
    }

    public final void mo200a() {
        m985a(false);
    }

    public final void mo202b() {
        m985a(true);
    }

    private final void m986d() {
        if (!this.f1126f) {
            bq.m943a(this.f1121a, this.f1122b);
            if (this.f1123c != null) {
                this.f1123c.invalidate();
            }
        }
        m985a(false);
    }

    private final void m985a(boolean z) {
        if (this.f1124d && this.f1125e != z && this.f1123c != null) {
            this.f1125e = z;
            bh.m930a(this.f1123c, z);
        }
    }
}
