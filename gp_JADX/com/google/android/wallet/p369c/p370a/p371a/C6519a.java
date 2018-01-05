package com.google.android.wallet.p369c.p370a.p371a;

import com.android.volley.w;
import com.google.android.wallet.common.p367c.p368a.C6518g;
import com.google.android.wallet.common.p367c.p368a.C6568a;
import com.google.android.wallet.common.p374d.C6535a;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.util.C6600l;
import com.google.android.wallet.common.util.C6608t;
import com.google.p443h.p451c.p457c.p470c.p471a.C7189g;
import com.google.p443h.p451c.p457c.p470c.p471a.C7190h;
import com.google.protobuf.nano.i;
import java.util.Map;

public final class C6519a extends C6518g {
    public final C7189g f32588y;

    public C6519a(C6568a c6568a, C7189g c7189g, Map map, byte[] bArr, UiConfig uiConfig, C6535a c6535a, w wVar) {
        super(c6568a, map, bArr, uiConfig, C7190h.class, c6535a, wVar);
        this.f32588y = c7189g;
    }

    public final int mo5462b() {
        return 2;
    }

    public final int mo5463s() {
        return 724;
    }

    public final int mo5464t() {
        return 725;
    }

    public final i mo5465u() {
        C7189g c7189g = (C7189g) C6608t.m29983a(this.f32588y);
        c7189g.f35060a = C6600l.m29938a(this.w.f32686a, this.v.f32713b, this.u);
        return c7189g;
    }

    protected final String mo5466v() {
        return "purchasemanager/submit";
    }
}
