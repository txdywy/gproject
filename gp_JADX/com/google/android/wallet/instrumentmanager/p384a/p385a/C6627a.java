package com.google.android.wallet.instrumentmanager.p384a.p385a;

import com.android.volley.w;
import com.google.a.a.a.a.b.b.a.f;
import com.google.a.a.a.a.b.b.a.g;
import com.google.android.wallet.common.p367c.p368a.C6518g;
import com.google.android.wallet.common.p367c.p368a.C6568a;
import com.google.android.wallet.common.p374d.C6535a;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.C6608t;
import com.google.protobuf.nano.i;
import java.util.Map;

public final class C6627a extends C6518g {
    public final f f32800y;

    public C6627a(C6568a c6568a, f fVar, Map map, byte[] bArr, UiConfig uiConfig, C6535a c6535a, w wVar) {
        super(c6568a, map, bArr, uiConfig, g.class, c6535a, wVar);
        this.f32800y = fVar;
    }

    public final int mo5462b() {
        return 3;
    }

    public final int mo5463s() {
        return 722;
    }

    public final int mo5464t() {
        return 723;
    }

    protected final i mo5465u() {
        f fVar = (f) C6608t.m29983a(this.f32800y);
        fVar.a = C6600l.m29938a(this.w.f32686a, this.v.f32713b, this.u);
        return fVar;
    }

    protected final String mo5466v() {
        return "instrumentmanager/refresh";
    }
}
