package android.support.v4.app;

public final class C0258z {
    public final aa f1624a;

    C0258z(aa aaVar) {
        this.f1624a = aaVar;
    }

    public final Fragment m1509a(String str) {
        return this.f1624a.f1288f.m1243b(str);
    }

    public final void m1510a() {
        this.f1624a.f1288f.m1271q();
    }

    public final boolean m1512b() {
        return this.f1624a.f1288f.m1267m();
    }

    public final void m1511a(boolean z) {
        aa aaVar = this.f1624a;
        aaVar.f1290h = z;
        if (aaVar.f1291i != null && aaVar.f1293k) {
            aaVar.f1293k = false;
            if (z) {
                aaVar.f1291i.m1390d();
            } else {
                aaVar.f1291i.m1389c();
            }
        }
    }
}
