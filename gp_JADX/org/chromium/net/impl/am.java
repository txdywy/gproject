package org.chromium.net.impl;

import com.google.p409c.p410a.p411a.p412a.p413a.C6918a;

final class am implements Runnable {
    public final /* synthetic */ af f40804a;

    am(af afVar) {
        this.f40804a = afVar;
    }

    public final void run() {
        if (this.f40804a.f40789p != null) {
            try {
                this.f40804a.f40789p.close();
            } catch (Throwable e) {
                C6918a.f34250a.mo5841a(e);
            }
            this.f40804a.f40789p = null;
        }
    }
}
