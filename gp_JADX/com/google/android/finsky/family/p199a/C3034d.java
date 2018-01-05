package com.google.android.finsky.family.p199a;

import android.support.v4.view.af;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.bind.p117b.C5872c;
import java.util.Collections;
import java.util.List;

final class C3034d extends af {
    public List f15879c = Collections.emptyList();

    C3034d() {
    }

    public final Object mo1372a(ViewGroup viewGroup, int i) {
        C3032b c3032b = (C3032b) this.f15879c.get(C5872c.m27301a(this, i));
        viewGroup.addView(c3032b.m15644a());
        if (c3032b.mo3289e()) {
            c3032b.m_();
        } else {
            c3032b.mo3290f();
            c3032b.m15648b();
        }
        return c3032b;
    }

    public final void mo1373a(ViewGroup viewGroup, int i, Object obj) {
        C3032b c3032b = (C3032b) obj;
        viewGroup.removeView(c3032b.m15644a());
        c3032b.f15874k.m19859b(c3032b.f15870g);
        c3032b.f15875l = null;
        c3032b.f15876m = null;
        c3032b.f15877n = null;
    }

    public final int mo961a() {
        return this.f15879c.size();
    }

    public final boolean mo959a(View view, Object obj) {
        return ((C3032b) obj).m15644a() == view;
    }

    public final /* synthetic */ CharSequence mo1371a(int i) {
        return ((C3032b) this.f15879c.get(i)).f15872i;
    }
}
