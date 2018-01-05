package com.google.android.finsky.billing.redeem;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.util.Log;
import com.google.android.c.i;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.util.a;
import com.google.android.wallet.common.util.l;
import com.google.android.wallet.common.util.t;
import com.google.android.wallet.instrumentmanager.a;
import com.google.h.c.c.b.a.a.a;
import com.google.h.c.c.b.a.a.c;
import com.google.protobuf.nano.i;

public final class com.google.android.finsky.billing.redeem.e implements com.google.android.finsky.billing.redeem.f
{

    public final com.google.android.finsky.billing.redeem.c a;

    e(com.google.android.finsky.billing.redeem.c p0) {
        this.a = p0;
    }

    public final byte[] a(UiConfig p0) {
        v0 = this.a.h();
        com.google.android.c.i.a = v0.getApplicationContext().getContentResolver();
        v1 = new com.google.h.c.c.b.a.a.a();
        v1.d = com.google.android.wallet.common.util.l.c(v0);
        v3 = new int[1];
        v3[0] = com.google.android.wallet.instrumentmanager.a.imTitleIconType;
        v2 = v0.obtainStyledAttributes(p0.a, v3);
        v1.b = v2.getInt(0, 1);
        v2.recycle();
        v3 = new int[1];
        v3[0] = com.google.android.wallet.instrumentmanager.a.imBodyIconType;
        v2 = v0.obtainStyledAttributes(p0.a, v3);
        v1.c = v2.getInt(0, 1);
        v2.recycle();
        v2 = com.google.android.wallet.common.util.a.c(v0);
        if (v2 != 0)
            v1.a = com.google.android.wallet.common.util.l.a(v0, p0.a).toString();
        else
            Log.d("OrchestrationUtil", "FDL is not supported so app redirects will not be supported.");
        v3 = new com.google.h.c.c.b.a.a.c();
        v3.a = com.google.android.wallet.common.util.l.a(v0, p0.b, 0, v2);
        v3.b = v1;
        com.google.android.wallet.common.util.t.a(v3, "ClientToken=");
        return com.google.protobuf.nano.i.a(v3);
    }

}
