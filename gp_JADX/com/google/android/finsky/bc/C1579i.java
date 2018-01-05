package com.google.android.finsky.bc;

import com.android.volley.C0660x;
import com.google.android.finsky.p111d.C2474c;

final class C1579i implements C0660x {
    public final /* synthetic */ int f8396a;
    public final /* synthetic */ C1577g f8397b;

    C1579i(C1577g c1577g, int i) {
        this.f8397b = c1577g;
        this.f8396a = i;
    }

    public final /* synthetic */ void b_(Object obj) {
        C1577g c1577g = this.f8397b;
        C2474c c2474c = new C2474c(537);
        c2474c.m13243b(Integer.valueOf(1));
        c1577g.f8391c.dc().m13319a(c2474c.f13342a, null);
        c1577g = this.f8397b;
        int i = this.f8396a;
        c1577g.f8393h++;
        if (c1577g.f8393h == i) {
            c1577g.al.m9098e();
        }
    }
}
