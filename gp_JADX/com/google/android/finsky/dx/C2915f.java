package com.google.android.finsky.dx;

import com.android.volley.C0660x;
import com.google.wireless.android.finsky.dfe.nano.gr;

final class C2915f implements C0660x {
    public final /* synthetic */ String f15481a;
    public final /* synthetic */ int f15482b;
    public final /* synthetic */ C0660x f15483c;
    public final /* synthetic */ C2910a f15484d;

    C2915f(C2910a c2910a, String str, int i, C0660x c0660x) {
        this.f15484d = c2910a;
        this.f15481a = str;
        this.f15482b = i;
        this.f15483c = c0660x;
    }

    public final /* synthetic */ void b_(Object obj) {
        gr grVar = (gr) obj;
        C2910a.m15174a(this.f15481a, grVar.a);
        this.f15484d.m15184a(this.f15481a, this.f15482b);
        if (this.f15483c != null) {
            this.f15483c.b_(grVar);
        }
    }
}
