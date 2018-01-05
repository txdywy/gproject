package android.support.v7.widget;

import android.support.v4.p037h.C0305a;
import android.support.v4.p037h.C0313h;

final class hz {
    public final C0305a f3617a = new C0305a();
    public final C0313h f3618b = new C0313h();

    hz() {
    }

    final void m3856a() {
        this.f3617a.clear();
        this.f3618b.m1687b();
    }

    final void m3858a(fr frVar, et etVar) {
        ia iaVar = (ia) this.f3617a.get(frVar);
        if (iaVar == null) {
            iaVar = ia.m3865a();
            this.f3617a.put(frVar, iaVar);
        }
        iaVar.f3621b = etVar;
        iaVar.f3620a |= 4;
    }

    final boolean m3860a(fr frVar) {
        ia iaVar = (ia) this.f3617a.get(frVar);
        return (iaVar == null || (iaVar.f3620a & 1) == 0) ? false : true;
    }

    final et m3855a(fr frVar, int i) {
        et etVar = null;
        int a = this.f3617a.m1626a((Object) frVar);
        if (a >= 0) {
            ia iaVar = (ia) this.f3617a.m1630c(a);
            if (!(iaVar == null || (iaVar.f3620a & i) == 0)) {
                iaVar.f3620a &= i ^ -1;
                if (i == 4) {
                    etVar = iaVar.f3621b;
                } else if (i == 8) {
                    etVar = iaVar.f3622c;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((iaVar.f3620a & 12) == 0) {
                    this.f3617a.m1631d(a);
                    ia.m3866a(iaVar);
                }
            }
        }
        return etVar;
    }

    final void m3857a(long j, fr frVar) {
        this.f3618b.m1685a(j, frVar);
    }

    final void m3862b(fr frVar, et etVar) {
        ia iaVar = (ia) this.f3617a.get(frVar);
        if (iaVar == null) {
            iaVar = ia.m3865a();
            this.f3617a.put(frVar, iaVar);
        }
        iaVar.f3622c = etVar;
        iaVar.f3620a |= 8;
    }

    final void m3861b(fr frVar) {
        ia iaVar = (ia) this.f3617a.get(frVar);
        if (iaVar == null) {
            iaVar = ia.m3865a();
            this.f3617a.put(frVar, iaVar);
        }
        r0.f3620a |= 1;
    }

    final void m3863c(fr frVar) {
        ia iaVar = (ia) this.f3617a.get(frVar);
        if (iaVar != null) {
            iaVar.f3620a &= -2;
        }
    }

    final void m3859a(ib ibVar) {
        for (int size = this.f3617a.size() - 1; size >= 0; size--) {
            fr frVar = (fr) this.f3617a.m1629b(size);
            ia iaVar = (ia) this.f3617a.m1631d(size);
            if ((iaVar.f3620a & 3) == 3) {
                ibVar.mo843a(frVar);
            } else if ((iaVar.f3620a & 1) != 0) {
                if (iaVar.f3621b == null) {
                    ibVar.mo843a(frVar);
                } else {
                    ibVar.mo844a(frVar, iaVar.f3621b, iaVar.f3622c);
                }
            } else if ((iaVar.f3620a & 14) == 14) {
                ibVar.mo845b(frVar, iaVar.f3621b, iaVar.f3622c);
            } else if ((iaVar.f3620a & 12) == 12) {
                ibVar.mo846c(frVar, iaVar.f3621b, iaVar.f3622c);
            } else if ((iaVar.f3620a & 4) != 0) {
                ibVar.mo844a(frVar, iaVar.f3621b, null);
            } else if ((iaVar.f3620a & 8) != 0) {
                ibVar.mo845b(frVar, iaVar.f3621b, iaVar.f3622c);
            } else {
                int i = iaVar.f3620a;
            }
            ia.m3866a(iaVar);
        }
    }

    final void m3864d(fr frVar) {
        ia iaVar;
        for (int a = this.f3618b.m1681a() - 1; a >= 0; a--) {
            if (frVar == this.f3618b.m1686b(a)) {
                C0313h c0313h = this.f3618b;
                if (c0313h.f1741d[a] != C0313h.f1738a) {
                    c0313h.f1741d[a] = C0313h.f1738a;
                    c0313h.f1739b = true;
                }
                iaVar = (ia) this.f3617a.remove(frVar);
                if (iaVar != null) {
                    ia.m3866a(iaVar);
                }
            }
        }
        iaVar = (ia) this.f3617a.remove(frVar);
        if (iaVar != null) {
            ia.m3866a(iaVar);
        }
    }
}
