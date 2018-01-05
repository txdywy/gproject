package com.google.android.finsky.billing.redeem;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import com.google.android.p102c.C0927i;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.pub.e;
import com.google.android.wallet.common.util.l;
import com.google.android.wallet.common.util.t;
import com.google.h.c.c.b.a.a.a;
import com.google.h.c.c.b.a.a.c;
import com.google.protobuf.nano.C0757i;

final class C2092e implements C2091f {
    public final /* synthetic */ C2089c f10660a;

    C2092e(C2089c c2089c) {
        this.f10660a = c2089c;
    }

    public final byte[] mo2635a(UiConfig uiConfig) {
        e eVar = this.f10660a.f10657f;
        Context h = this.f10660a.m603h();
        C0927i.f5711a = h.getApplicationContext().getContentResolver();
        a aVar = new a();
        aVar.d = l.c(h);
        TypedArray obtainStyledAttributes = h.obtainStyledAttributes(uiConfig.a, new int[]{com.google.android.wallet.instrumentmanager.a.imTitleIconType});
        aVar.b = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = h.obtainStyledAttributes(uiConfig.a, new int[]{com.google.android.wallet.instrumentmanager.a.imBodyIconType});
        aVar.c = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        boolean c = com.google.android.wallet.common.util.a.c(h);
        if (c) {
            aVar.a = l.a(h, uiConfig.a).toString();
        } else {
            Log.d("OrchestrationUtil", "FDL is not supported so app redirects will not be supported.");
        }
        C0757i cVar = new c();
        cVar.a = l.a(h, uiConfig.b, null, c);
        cVar.b = aVar;
        t.a(cVar, "ClientToken=");
        return C0757i.m4909a(cVar);
    }
}
