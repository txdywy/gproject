package android.support.v7.p045f;

import android.support.v7.widget.em;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class C0448e {
    public final List f2534a;
    public final int[] f2535b;
    public final int[] f2536c;
    public final C0447d f2537d;
    public final int f2538e;
    public final int f2539f;
    public final boolean f2540g = true;

    C0448e(C0447d c0447d, List list, int[] iArr, int[] iArr2) {
        this.f2534a = list;
        this.f2535b = iArr;
        this.f2536c = iArr2;
        Arrays.fill(this.f2535b, 0);
        Arrays.fill(this.f2536c, 0);
        this.f2537d = c0447d;
        this.f2538e = c0447d.mo3283a();
        this.f2539f = c0447d.mo3285b();
        C0452i c0452i = this.f2534a.isEmpty() ? null : (C0452i) this.f2534a.get(0);
        if (!(c0452i != null && c0452i.f2549a == 0 && c0452i.f2550b == 0)) {
            c0452i = new C0452i();
            c0452i.f2549a = 0;
            c0452i.f2550b = 0;
            c0452i.f2552d = false;
            c0452i.f2551c = 0;
            c0452i.f2553e = false;
            this.f2534a.add(0, c0452i);
        }
        m2674a();
    }

    private final void m2674a() {
        int i = this.f2538e;
        int i2 = this.f2539f;
        for (int size = this.f2534a.size() - 1; size >= 0; size--) {
            C0452i c0452i = (C0452i) this.f2534a.get(size);
            int i3 = c0452i.f2549a + c0452i.f2551c;
            int i4 = c0452i.f2550b + c0452i.f2551c;
            if (this.f2540g) {
                while (i > i3) {
                    if (this.f2535b[i - 1] == 0) {
                        m2676a(i, i2, size, false);
                    }
                    i--;
                }
                while (i2 > i4) {
                    if (this.f2536c[i2 - 1] == 0) {
                        m2676a(i, i2, size, true);
                    }
                    i2--;
                }
            }
            for (i2 = 0; i2 < c0452i.f2551c; i2++) {
                i3 = c0452i.f2549a + i2;
                i4 = c0452i.f2550b + i2;
                i = this.f2537d.mo3286b(i3, i4) ? 1 : 2;
                this.f2535b[i3] = (i4 << 5) | i;
                this.f2536c[i4] = i | (i3 << 5);
            }
            i = c0452i.f2549a;
            i2 = c0452i.f2550b;
        }
    }

    private final boolean m2676a(int i, int i2, int i3, boolean z) {
        int i4;
        int i5;
        int i6 = 8;
        if (z) {
            i4 = i2 - 1;
            i2--;
            i5 = i4;
            i4 = i;
        } else {
            i5 = i - 1;
            i4 = i - 1;
        }
        int i7 = i4;
        while (i3 >= 0) {
            C0452i c0452i = (C0452i) this.f2534a.get(i3);
            int i8 = c0452i.f2549a + c0452i.f2551c;
            int i9 = c0452i.f2550b + c0452i.f2551c;
            if (z) {
                for (i7--; i7 >= i8; i7--) {
                    if (this.f2537d.mo3284a(i7, i5)) {
                        if (this.f2537d.mo3286b(i7, i5)) {
                            i4 = 8;
                        } else {
                            i4 = 4;
                        }
                        this.f2536c[i5] = (i7 << 5) | 16;
                        this.f2535b[i7] = i4 | (i5 << 5);
                        return true;
                    }
                }
                continue;
            } else {
                for (i7 = i2 - 1; i7 >= i9; i7--) {
                    if (this.f2537d.mo3284a(i5, i7)) {
                        if (!this.f2537d.mo3286b(i5, i7)) {
                            i6 = 4;
                        }
                        this.f2535b[i - 1] = (i7 << 5) | 16;
                        this.f2536c[i7] = ((i - 1) << 5) | i6;
                        return true;
                    }
                }
                continue;
            }
            i7 = c0452i.f2549a;
            i2 = c0452i.f2550b;
            i3--;
        }
        return false;
    }

    public final void m2679a(em emVar) {
        m2678a(new C0449f(emVar));
    }

    public final void m2678a(C0443j c0443j) {
        C0444a c0444a;
        if (c0443j instanceof C0444a) {
            c0444a = (C0444a) c0443j;
        } else {
            c0444a = new C0444a(c0443j);
        }
        List arrayList = new ArrayList();
        int i = this.f2538e;
        int size = this.f2534a.size() - 1;
        int i2 = this.f2539f;
        while (size >= 0) {
            C0452i c0452i = (C0452i) this.f2534a.get(size);
            int i3 = c0452i.f2551c;
            int i4 = c0452i.f2549a + i3;
            int i5 = c0452i.f2550b + i3;
            if (i4 < i) {
                m2677b(arrayList, c0444a, i4, i - i4, i4);
            }
            if (i5 < i2) {
                m2675a(arrayList, c0444a, i4, i2 - i5, i5);
            }
            for (int i6 = i3 - 1; i6 >= 0; i6--) {
                if ((this.f2535b[c0452i.f2549a + i6] & 31) == 2) {
                    c0444a.mo621a(c0452i.f2549a + i6, 1, this.f2537d.mo4264a(c0452i.f2549a + i6));
                }
            }
            i = c0452i.f2549a;
            size--;
            i2 = c0452i.f2550b;
        }
        c0444a.m2660a();
    }

    private static C0450g m2673a(List list, int i, boolean z) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C0450g c0450g = (C0450g) list.get(size);
            if (c0450g.f2542a == i && c0450g.f2544c == z) {
                list.remove(size);
                for (int i2 = size; i2 < list.size(); i2++) {
                    C0450g c0450g2 = (C0450g) list.get(i2);
                    c0450g2.f2543b = (z ? 1 : -1) + c0450g2.f2543b;
                }
                return c0450g;
            }
        }
        return null;
    }

    private final void m2675a(List list, C0443j c0443j, int i, int i2, int i3) {
        if (this.f2540g) {
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = this.f2536c[i3 + i4] & 31;
                switch (i5) {
                    case 0:
                        c0443j.mo620a(i, 1);
                        for (C0450g c0450g : list) {
                            c0450g.f2543b++;
                        }
                        break;
                    case 4:
                    case 8:
                        int i6 = this.f2536c[i3 + i4] >> 5;
                        c0443j.mo623c(C0448e.m2673a(list, i6, true).f2543b, i);
                        if (i5 != 4) {
                            break;
                        }
                        c0443j.mo621a(i, 1, this.f2537d.mo4264a(i6));
                        break;
                    case 16:
                        list.add(new C0450g(i3 + i4, i, false));
                        break;
                    default:
                        throw new IllegalStateException("unknown flag for pos " + (i4 + i3) + " " + Long.toBinaryString((long) i5));
                }
            }
            return;
        }
        c0443j.mo620a(i, i2);
    }

    private final void m2677b(List list, C0443j c0443j, int i, int i2, int i3) {
        if (this.f2540g) {
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                int i5 = this.f2535b[i3 + i4] & 31;
                switch (i5) {
                    case 0:
                        c0443j.mo622b(i + i4, 1);
                        for (C0450g c0450g : list) {
                            c0450g.f2543b--;
                        }
                        break;
                    case 4:
                    case 8:
                        C0450g a = C0448e.m2673a(list, this.f2535b[i3 + i4] >> 5, false);
                        c0443j.mo623c(i + i4, a.f2543b - 1);
                        if (i5 != 4) {
                            break;
                        }
                        c0443j.mo621a(a.f2543b - 1, 1, this.f2537d.mo4264a(i3 + i4));
                        break;
                    case 16:
                        list.add(new C0450g(i3 + i4, i + i4, true));
                        break;
                    default:
                        throw new IllegalStateException("unknown flag for pos " + (i4 + i3) + " " + Long.toBinaryString((long) i5));
                }
            }
            return;
        }
        c0443j.mo622b(i, i2);
    }
}
