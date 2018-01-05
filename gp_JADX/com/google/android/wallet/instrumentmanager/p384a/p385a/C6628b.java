package com.google.android.wallet.instrumentmanager.p384a.p385a;

import com.android.volley.w;
import com.google.a.a.a.a.b.b.a.h;
import com.google.a.a.a.a.b.b.a.i;
import com.google.android.wallet.common.p367c.p368a.C6518g;
import com.google.android.wallet.common.p367c.p368a.C6568a;
import com.google.android.wallet.common.p374d.C6535a;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.C6608t;
import java.util.Map;

public final class C6628b extends C6518g {
    public final h f32801y;

    public C6628b(C6568a c6568a, h hVar, Map map, byte[] bArr, UiConfig uiConfig, C6535a c6535a, w wVar) {
        super(c6568a, map, bArr, uiConfig, i.class, c6535a, wVar);
        this.f32801y = hVar;
    }

    public final int mo5462b() {
        return 2;
    }

    public final int mo5463s() {
        return 720;
    }

    public final int mo5464t() {
        return 721;
    }

    public final com.google.protobuf.nano.i mo5465u() {
        h hVar = (h) C6608t.m29983a(this.f32801y);
        hVar.a = C6600l.m29938a(this.w.f32686a, this.v.f32713b, this.u);
        return hVar;
    }

    protected final String mo5466v() {
        return "instrumentmanager/submit";
    }
}
