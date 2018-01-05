package com.google.android.finsky.instantapps.p218e;

import com.google.android.instantapps.common.p217e.bf;
import java.util.ArrayList;
import java.util.List;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C3468s implements C0000a {
    public final C0000a f17656a;
    public final C0000a f17657b;
    public final C0000a f17658c;

    public C3468s(C0000a c0000a, C0000a c0000a2, C0000a c0000a3) {
        this.f17656a = c0000a;
        this.f17657b = c0000a2;
        this.f17658c = c0000a3;
    }

    public final /* synthetic */ Object mo1a() {
        C3462m c3462m = (C3462m) this.f17656a.mo1a();
        C3469t c3469t = (C3469t) this.f17657b.mo1a();
        bf bfVar = (bf) this.f17658c.mo1a();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c3462m);
        if (((Boolean) bfVar.mo5158a()).booleanValue()) {
            arrayList.add(c3469t);
        }
        return (List) C0004c.m7a(arrayList, "Cannot return null from a non-@Nullable @Provides method");
    }
}
