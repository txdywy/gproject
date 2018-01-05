package android.support.constraint.p015a;

import java.util.ArrayList;

public final class C0077d {
    public ArrayList f276a = new ArrayList();

    public final void m149a(C0078e c0078e) {
        this.f276a.clear();
        for (int i = 1; i < c0078e.f285i; i++) {
            int i2;
            C0081h c0081h = c0078e.f288l.f275c[i];
            for (i2 = 0; i2 < 6; i2++) {
                c0081h.f299f[i2] = 0.0f;
            }
            c0081h.f299f[c0081h.f297d] = 1.0f;
            if (c0081h.f300g == C0082i.ERROR) {
                this.f276a.add(c0081h);
            }
        }
        int size = this.f276a.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0081h c0081h2 = (C0081h) this.f276a.get(i3);
            if (c0081h2.f296c != -1) {
                C0074a c0074a = c0078e.f283g[c0081h2.f296c].f271c;
                int i4 = c0074a.f258a;
                for (int i5 = 0; i5 < i4; i5++) {
                    C0081h a = c0074a.m132a(i5);
                    if (a != null) {
                        float b = c0074a.m135b(i5);
                        for (i2 = 0; i2 < 6; i2++) {
                            float[] fArr = a.f299f;
                            fArr[i2] = fArr[i2] + (c0081h2.f299f[i2] * b);
                        }
                        if (!this.f276a.contains(a)) {
                            this.f276a.add(a);
                        }
                    }
                }
                for (i2 = 0; i2 < 6; i2++) {
                    c0081h2.f299f[i2] = 0.0f;
                }
            }
        }
    }

    public final String toString() {
        int size = this.f276a.size();
        String str = "Goal: ";
        for (int i = 0; i < size; i++) {
            str = str + ((C0081h) this.f276a.get(i)).m176a();
        }
        return str;
    }
}
