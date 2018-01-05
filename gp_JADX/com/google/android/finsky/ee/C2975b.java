package com.google.android.finsky.ee;

import com.android.volley.C0660x;
import com.google.android.finsky.api.C1254c;
import com.google.wireless.android.finsky.dfe.nano.dp;

final class C2975b implements C0660x {
    public final /* synthetic */ C1254c f15641a;
    public final /* synthetic */ String f15642b;
    public final /* synthetic */ boolean f15643c;
    public final /* synthetic */ C2974a f15644d;

    C2975b(C2974a c2974a, C1254c c1254c, String str, boolean z) {
        this.f15644d = c2974a;
        this.f15641a = c1254c;
        this.f15642b = str;
        this.f15643c = z;
    }

    public final /* synthetic */ void b_(Object obj) {
        dp dpVar = (dp) obj;
        this.f15644d.f15638g = System.currentTimeMillis();
        this.f15644d.f15636e.mo2796a(this.f15641a.mo1620b(), "modified_wishlist", new C2976c(this), dpVar.a);
    }
}
