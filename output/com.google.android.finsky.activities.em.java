package com.google.android.finsky.activities;

import android.view.animation.Animation;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.al;
import com.google.android.finsky.d.t;
import com.google.android.finsky.pagesystem.f;
import com.google.android.finsky.pagesystem.g;

public final class com.google.android.finsky.activities.em implements Animation$AnimationListener
{

    public boolean a;
    public boolean b;
    public final com.google.android.finsky.activities.ek c;

    em(com.google.android.finsky.activities.ek p0) {
        this.c = p0;
        this.a = 0;
        this.b = 0;
    }

    public final void onAnimationEnd(Animation p0) {
        if (this.a == 0) {
            if (this.c.N != 0)
                this.c.M.b(1734, this.c.L, 0, 1);
            if (this.c.f.dj().a(12636210)) {
                this.c.a(1704);
                this.a = 1;
            }
            else if (this.c.h.b()) {
                this.c.G.j(1704);
                this.a = 1;
            }
        }
        if (this.c.t != 0 && this.b == 0) {
            this.c.t.B();
            this.b = 1;
        }
    }

    public final void onAnimationRepeat(Animation p0) {
    }

    public final void onAnimationStart(Animation p0) {
    }

}
