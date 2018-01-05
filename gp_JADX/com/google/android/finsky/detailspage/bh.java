package com.google.android.finsky.detailspage;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.view.ViewGroup;
import com.google.android.finsky.bg.C1060p;
import com.google.android.finsky.pagesystem.C1044f;
import java.util.HashSet;
import java.util.Set;

public final class bh {
    public static final Set f14290a;
    public ViewGroup f14291b;
    public Animator f14292c;
    public boolean f14293d;
    public boolean f14294e;
    public C1060p f14295f;
    public C1044f f14296g;
    public AnimatorListener f14297h = new bi(this);

    public bh(ViewGroup viewGroup, C1044f c1044f) {
        this.f14291b = viewGroup;
        this.f14296g = c1044f;
        this.f14295f = new bj(this, this.f14291b);
    }

    public final void m13943a(Animator animator) {
        if (this.f14292c != null) {
            this.f14292c.removeListener(this.f14297h);
        }
        this.f14292c = animator;
        if (this.f14292c != null) {
            this.f14292c.addListener(this.f14297h);
        }
        m13944b();
    }

    public final void m13942a() {
        if (this.f14291b != null) {
            this.f14295f.m6486a();
            this.f14291b = null;
        }
        if (this.f14292c != null) {
            this.f14292c.removeListener(this.f14297h);
            this.f14292c = null;
        }
        this.f14293d = false;
        this.f14294e = false;
    }

    final void m13944b() {
        if (!this.f14293d) {
            return;
        }
        if (this.f14292c == null || this.f14294e) {
            if (this.f14296g != null) {
                this.f14296g.mo1293j(1704);
                this.f14296g = null;
            }
            m13942a();
        }
    }

    static {
        Set hashSet = new HashSet(5);
        f14290a = hashSet;
        hashSet.add(FooterSpacerModuleLayout.class);
    }
}
