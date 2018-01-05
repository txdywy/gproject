package android.support.v7.widget;

import android.view.View;

final class el implements C0496z {
    public final /* synthetic */ RecyclerView f3432a;

    el(RecyclerView recyclerView) {
        this.f3432a = recyclerView;
    }

    public final fr mo858a(int i) {
        fr a = this.f3432a.m274a(i, true);
        if (a == null || this.f3432a.f520n.m3337d(a.f3211a)) {
            return null;
        }
        return a;
    }

    public final void mo859a(int i, int i2) {
        this.f3432a.m277a(i, i2, true);
        this.f3432a.ar = true;
        fo foVar = this.f3432a.ao;
        foVar.f3467d += i2;
    }

    public final void mo862b(int i, int i2) {
        this.f3432a.m277a(i, i2, false);
        this.f3432a.ar = true;
    }

    public final void mo860a(int i, int i2, Object obj) {
        int i3;
        RecyclerView recyclerView = this.f3432a;
        int b = recyclerView.f520n.m3331b();
        int i4 = i + i2;
        for (i3 = 0; i3 < b; i3++) {
            View c = recyclerView.f520n.m3335c(i3);
            fr c2 = RecyclerView.m261c(c);
            if (c2 != null && !c2.m3265b() && c2.f3213c >= i && c2.f3213c < i4) {
                c2.m3264b(2);
                c2.m3261a(obj);
                ((fa) c.getLayoutParams()).f3358e = true;
            }
        }
        fh fhVar = recyclerView.f517k;
        b = i + i2;
        for (i3 = fhVar.f3449c.size() - 1; i3 >= 0; i3--) {
            fr frVar = (fr) fhVar.f3449c.get(i3);
            if (frVar != null) {
                i4 = frVar.f3213c;
                if (i4 >= i && i4 < b) {
                    frVar.m3264b(2);
                    fhVar.m3689b(i3);
                }
            }
        }
        this.f3432a.as = true;
    }

    public final void mo861a(aa aaVar) {
        m3607c(aaVar);
    }

    private final void m3607c(aa aaVar) {
        switch (aaVar.f3074a) {
            case 1:
                this.f3432a.f528v.mo799a(this.f3432a, aaVar.f3075b, aaVar.f3077d);
                return;
            case 2:
                this.f3432a.f528v.mo807b(this.f3432a, aaVar.f3075b, aaVar.f3077d);
                return;
            case 4:
                this.f3432a.f528v.mo808c(this.f3432a, aaVar.f3075b, aaVar.f3077d);
                return;
            case 8:
                this.f3432a.f528v.mo800a(this.f3432a, aaVar.f3075b, aaVar.f3077d, 1);
                return;
            default:
                return;
        }
    }

    public final void mo863b(aa aaVar) {
        m3607c(aaVar);
    }

    public final void mo864c(int i, int i2) {
        int i3;
        RecyclerView recyclerView = this.f3432a;
        int b = recyclerView.f520n.m3331b();
        for (i3 = 0; i3 < b; i3++) {
            fr c = RecyclerView.m261c(recyclerView.f520n.m3335c(i3));
            if (!(c == null || c.m3265b() || c.f3213c < i)) {
                c.m3259a(i2, false);
                recyclerView.ao.f3470g = true;
            }
        }
        fh fhVar = recyclerView.f517k;
        int size = fhVar.f3449c.size();
        for (i3 = 0; i3 < size; i3++) {
            fr frVar = (fr) fhVar.f3449c.get(i3);
            if (frVar != null && frVar.f3213c >= i) {
                frVar.m3259a(i2, true);
            }
        }
        recyclerView.requestLayout();
        this.f3432a.ar = true;
    }

    public final void mo865d(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = -1;
        RecyclerView recyclerView = this.f3432a;
        int b = recyclerView.f520n.m3331b();
        if (i < i2) {
            i3 = -1;
            i4 = i2;
            i5 = i;
        } else {
            i3 = 1;
            i4 = i;
            i5 = i2;
        }
        for (i6 = 0; i6 < b; i6++) {
            fr c = RecyclerView.m261c(recyclerView.f520n.m3335c(i6));
            if (c != null && c.f3213c >= r4 && c.f3213c <= r3) {
                if (c.f3213c == i) {
                    c.m3259a(i2 - i, false);
                } else {
                    c.m3259a(i3, false);
                }
                recyclerView.ao.f3470g = true;
            }
        }
        fh fhVar = recyclerView.f517k;
        if (i < i2) {
            i4 = i2;
            i5 = i;
        } else {
            i7 = 1;
            i4 = i;
            i5 = i2;
        }
        int size = fhVar.f3449c.size();
        for (i6 = 0; i6 < size; i6++) {
            fr frVar = (fr) fhVar.f3449c.get(i6);
            if (frVar != null && frVar.f3213c >= r4 && frVar.f3213c <= r3) {
                if (frVar.f3213c == i) {
                    frVar.m3259a(i2 - i, false);
                } else {
                    frVar.m3259a(i7, false);
                }
            }
        }
        recyclerView.requestLayout();
        this.f3432a.ar = true;
    }
}
