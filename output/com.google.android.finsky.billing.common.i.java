package com.google.android.finsky.billing.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.c.i;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.g;
import com.google.android.finsky.d.j;
import com.google.android.finsky.utils.bb;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.pub.e;
import com.google.android.wallet.common.pub.g;
import com.google.android.wallet.common.pub.i;
import com.google.android.wallet.common.util.a;
import com.google.android.wallet.common.util.l;
import com.google.android.wallet.common.util.t;
import com.google.android.wallet.instrumentmanager.a;
import com.google.h.c.c.b.a.a.a;
import com.google.h.c.c.b.a.a.c;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.a.a.af;
import com.google.wireless.android.finsky.dfe.c.a.dv;
import com.google.wireless.android.finsky.dfe.c.a.dw;

public final class com.google.android.finsky.billing.common.i
{

    public final com.google.android.finsky.ba.c a;
    public final com.google.android.finsky.d.g b;

    i(com.google.android.finsky.ba.c p0, com.google.android.finsky.d.g p1) {
        new com.google.android.wallet.common.pub.e();
        this.a = p0;
        this.b = p1;
    }

    public static SecurePaymentsPayload a(com.google.wireless.android.finsky.a.a.af p0) {
        return com.google.android.finsky.billing.common.i.a(p0.a);
    }

    public static SecurePaymentsPayload a(com.google.wireless.android.finsky.dfe.c.a.dv p0) {
        v2 = new g[p0.c.length];
        v0 = 0;
        while (v0 < p0.c.length) {
            v2[v0] = new com.google.android.wallet.common.pub.g(p0.c[v0].c, p0.c[v0].d);
            v0 = v0 + 1;
        }
        return new SecurePaymentsPayload(p0.b, v2);
    }

    private final byte[] b(Context p0, String p1, UiConfig p2, String p3) {
        if (!this.a.j(p1).a(12622695))
            com.google.android.wallet.common.util.l.a();
        if (this.a.j(p1).a(12635593)) {
            com.google.android.c.i.a = p0.getApplicationContext().getContentResolver();
            v0 = new com.google.h.c.c.b.a.a.a();
            v0.d = com.google.android.wallet.common.util.l.c(p0);
            v4 = new int[1];
            v4[0] = com.google.android.wallet.instrumentmanager.a.imTitleIconType;
            v1 = p0.obtainStyledAttributes(p2.a, v4);
            v0.b = v1.getInt(0, 1);
            v1.recycle();
            v4 = new int[1];
            v4[0] = com.google.android.wallet.instrumentmanager.a.imBodyIconType;
            v1 = p0.obtainStyledAttributes(p2.a, v4);
            v0.c = v1.getInt(0, 1);
            v1.recycle();
            v1 = com.google.android.wallet.common.util.a.c(p0);
            if (v1 != 0)
                v0.a = com.google.android.wallet.common.util.l.a(p0, p2.a).toString();
            else
                Log.d("OrchestrationUtil", "FDL is not supported so app redirects will not be supported.");
            v4 = new com.google.h.c.c.b.a.a.c();
            v4.a = com.google.android.wallet.common.util.l.a(p0, p2.b, 0, v1);
            v4.b = v0;
            com.google.android.wallet.common.util.t.a(v4, "ClientToken=");
            v0 = com.google.protobuf.nano.i.a(v4);
            v1 = new com.google.android.finsky.d.c(641).b(SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime());
            if (p3 != 0)
                v1.b(p3);
            this.b.f(p1).a(v1.a, 0);
        }
        else {
            com.google.android.c.i.a = p0.getApplicationContext().getContentResolver();
            v0 = new com.google.h.c.c.b.a.a.a();
            v0.d = com.google.android.wallet.common.util.l.c(p0);
            v2 = new int[1];
            v2[0] = com.google.android.wallet.instrumentmanager.a.imTitleIconType;
            v1 = p0.obtainStyledAttributes(p2.a, v2);
            v0.b = v1.getInt(0, 1);
            v1.recycle();
            v2 = new int[1];
            v2[0] = com.google.android.wallet.instrumentmanager.a.imBodyIconType;
            v1 = p0.obtainStyledAttributes(p2.a, v2);
            v0.c = v1.getInt(0, 1);
            v1.recycle();
            v1 = com.google.android.wallet.common.util.a.c(p0);
            if (v1 != 0)
                v0.a = com.google.android.wallet.common.util.l.a(p0, p2.a).toString();
            else
                Log.d("OrchestrationUtil", "FDL is not supported so app redirects will not be supported.");
            v2 = new com.google.h.c.c.b.a.a.c();
            v2.a = com.google.android.wallet.common.util.l.a(p0, p2.b, 0, v1);
            v2.b = v0;
            com.google.android.wallet.common.util.t.a(v2, "ClientToken=");
            v0 = com.google.protobuf.nano.i.a(v2);
        }
        return v0;
    }

    public final String a(Context p0, String p1) {
        return this.a(p0, p1, 2132017931);
    }

    public final String a(Context p0, String p1, int p2) {
        return this.a(p0, p1, new com.google.android.wallet.common.pub.i(p2).a());
    }

    public final String a(Context p0, String p1, UiConfig p2) {
        return this.a(p0, p1, p2, 0);
    }

    final String a(Context p0, String p1, UiConfig p2, String p3) {
        return Base64.encodeToString(this.b(p0, p1, p2, p3), 10);
    }

    public final byte[] b(Context p0, String p1) {
        return this.b(p0, p1, new com.google.android.wallet.common.pub.i(2132017931).a(), 0);
    }

    public final void c(Context p0, String p1) {
        if (this.a.j(p1).a(12623787))
            com.google.android.finsky.utils.bb.a(new com.google.android.finsky.billing.common.j(this, p0, p1), new Void[0]);
    }

}
