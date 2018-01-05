package com.android.volley.p060a;

import java.util.Iterator;

final class C0678t implements Runnable {
    public final /* synthetic */ C0675q f4106a;

    C0678t(C0675q c0675q) {
        this.f4106a = c0675q;
    }

    public final void run() {
        for (C0679u c0679u : this.f4106a.f4099e.values()) {
            Iterator it = c0679u.f4110d.iterator();
            while (it.hasNext()) {
                C0681w c0681w = (C0681w) it.next();
                if (c0681w.f4112b != null) {
                    if (c0679u.f4109c == null) {
                        c0681w.f4111a = c0679u.f4108b;
                        c0681w.f4112b.mo1063a(c0681w, false);
                    } else {
                        c0681w.f4112b.mo1062a(c0679u.f4109c);
                    }
                }
            }
        }
        this.f4106a.f4099e.clear();
        this.f4106a.f4101g = null;
    }
}
