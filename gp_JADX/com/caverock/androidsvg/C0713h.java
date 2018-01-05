package com.caverock.androidsvg;

import java.util.ArrayList;
import java.util.List;

public final class C0713h {
    public List f4582a = null;

    public final void m4771a(C0712g c0712g) {
        if (this.f4582a == null) {
            this.f4582a = new ArrayList();
        }
        for (int i = 0; i < this.f4582a.size(); i++) {
            if (((C0712g) this.f4582a.get(i)).f4580a.f4584b > c0712g.f4580a.f4584b) {
                this.f4582a.add(i, c0712g);
                return;
            }
        }
        this.f4582a.add(c0712g);
    }

    public final void m4772a(C0713h c0713h) {
        if (c0713h.f4582a != null) {
            if (this.f4582a == null) {
                this.f4582a = new ArrayList(c0713h.f4582a.size());
            }
            for (C0712g add : c0713h.f4582a) {
                this.f4582a.add(add);
            }
        }
    }

    public final String toString() {
        if (this.f4582a == null) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (C0712g c0712g : this.f4582a) {
            stringBuilder.append(c0712g.toString()).append('\n');
        }
        return stringBuilder.toString();
    }
}
