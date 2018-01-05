package com.google.android.play.image;

import java.util.List;

final class am implements Runnable {
    public final /* synthetic */ ag f31996a;

    am(ag agVar) {
        this.f31996a = agVar;
    }

    public final void run() {
        this.f31996a.l = true;
        for (ar arVar : this.f31996a.h.values()) {
            if (this.f31996a.p != null) {
                this.f31996a.p.a(arVar.f32015a);
            }
            List list = arVar.f32017c;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                an anVar = (an) list.get(i);
                anVar.f31997a = arVar.f32016b;
                if (anVar.f31998b != null) {
                    anVar.f31998b.mo5394a(anVar);
                }
            }
        }
        this.f31996a.h.clear();
        this.f31996a.j = null;
        this.f31996a.l = false;
    }
}
