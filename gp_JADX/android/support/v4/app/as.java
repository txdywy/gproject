package android.support.v4.app;

import android.os.Looper;

final class as implements C0236t {
    public final boolean f1351a;
    public final C0245j f1352b;
    public int f1353c;

    as(C0245j c0245j, boolean z) {
        this.f1351a = z;
        this.f1352b = c0245j;
    }

    public final void mo301a() {
        this.f1353c--;
        if (this.f1353c == 0) {
            this.f1352b.f1557a.m1265k();
        }
    }

    public final void mo302b() {
        this.f1353c++;
    }

    public final void m1285c() {
        boolean z = false;
        boolean z2 = this.f1353c > 0;
        ae aeVar = this.f1352b.f1557a;
        int size = aeVar.f1306e.size();
        for (int i = 0; i < size; i++) {
            Fragment fragment = (Fragment) aeVar.f1306e.get(i);
            fragment.m583a(null);
            if (z2 && fragment.m569U()) {
                if (fragment.f730B == null || fragment.f730B.f1315n == null) {
                    fragment.m560L().f1606q = false;
                } else if (Looper.myLooper() != fragment.f730B.f1315n.f1286d.getLooper()) {
                    fragment.f730B.f1315n.f1286d.postAtFrontOfQueue(new C0251q(fragment));
                } else {
                    fragment.m553E();
                }
            }
        }
        ae aeVar2 = this.f1352b.f1557a;
        C0245j c0245j = this.f1352b;
        boolean z3 = this.f1351a;
        if (!z2) {
            z = true;
        }
        aeVar2.m1192a(c0245j, z3, z, true);
    }

    public final void m1286d() {
        this.f1352b.f1557a.m1192a(this.f1352b, this.f1351a, false, false);
    }
}
