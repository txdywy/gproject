package android.support.v4.app;

import java.util.ArrayList;

final class ar implements aq {
    public final String f1347a;
    public final int f1348b;
    public final int f1349c;
    public final /* synthetic */ ae f1350d;

    ar(ae aeVar, String str, int i, int i2) {
        this.f1350d = aeVar;
        this.f1347a = str;
        this.f1348b = i;
        this.f1349c = i2;
    }

    public final boolean mo300a(ArrayList arrayList, ArrayList arrayList2) {
        if (this.f1350d.f1318q != null && this.f1348b < 0 && this.f1347a == null) {
            ab abVar = this.f1350d.f1318q.f732D;
            if (abVar != null && abVar.mo293d()) {
                return false;
            }
        }
        return this.f1350d.m1242a(arrayList, arrayList2, this.f1347a, this.f1348b, this.f1349c);
    }
}
