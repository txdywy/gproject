package com.google.android.finsky.nestedrecyclerviews.p115a;

import java.util.ArrayList;
import java.util.HashSet;

public final class C3773i implements C3772o {
    public final /* synthetic */ C3769f f18981a;

    public C3773i(C3769f c3769f) {
        this.f18981a = c3769f;
    }

    public final void mo3738a(int i) {
        if (i >= 0) {
            this.f18981a.f18971l = i;
        }
    }

    public final void mo3740b(int i) {
        this.f18981a.f18969j = i;
    }

    public final int mo3736a() {
        return this.f18981a.f18969j;
    }

    public final C3769f mo3737a(C3763a c3763a) {
        C3769f.m17916b(c3763a);
        if (this.f18981a.f18965f == null) {
            this.f18981a.f18965f = new HashSet();
        }
        this.f18981a.f18965f.add(c3763a);
        return this.f18981a.f18960a;
    }

    public final void mo3739a(C1062m c1062m) {
        if (this.f18981a.f18968i == null) {
            this.f18981a.f18968i = new ArrayList();
        }
        if (!this.f18981a.f18968i.contains(c1062m)) {
            this.f18981a.f18968i.add(c1062m);
        }
    }

    public final void mo3741b(C1062m c1062m) {
        if (this.f18981a.f18968i != null) {
            this.f18981a.f18968i.remove(c1062m);
        }
    }
}
