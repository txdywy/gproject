package com.google.android.finsky.billing.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.utils.bb;
import com.google.android.p102c.C0927i;
import com.google.android.wallet.common.pub.SecurePaymentsPayload;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.pub.e;
import com.google.android.wallet.common.pub.g;
import com.google.android.wallet.common.pub.i;
import com.google.android.wallet.common.util.l;
import com.google.android.wallet.common.util.t;
import com.google.h.c.c.b.a.a.a;
import com.google.h.c.c.b.a.a.c;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.af;
import com.google.wireless.android.finsky.dfe.c.a.dv;
import com.google.wireless.android.finsky.dfe.c.a.dw;
import com.squareup.leakcanary.C7582R;

public final class C1793i {
    public final C1461c f9324a;
    public final C1463g f9325b;

    public C1793i(C1461c c1461c, C1463g c1463g) {
        e eVar = new e();
        this.f9324a = c1461c;
        this.f9325b = c1463g;
    }

    public static SecurePaymentsPayload m9762a(af afVar) {
        return C1793i.m9763a(afVar.a);
    }

    public static SecurePaymentsPayload m9763a(dv dvVar) {
        int length = dvVar.c.length;
        g[] gVarArr = new g[length];
        for (int i = 0; i < length; i++) {
            dw dwVar = dvVar.c[i];
            gVarArr[i] = new g(dwVar.c, dwVar.d);
        }
        return new SecurePaymentsPayload(dvVar.b, gVarArr);
    }

    public final String m9765a(Context context, String str) {
        return m9766a(context, str, (int) C7582R.style.Theme.InstrumentManager.BuyFlow);
    }

    public final String m9766a(Context context, String str, int i) {
        return m9767a(context, str, new i(i).a());
    }

    public final String m9767a(Context context, String str, UiConfig uiConfig) {
        return m9768a(context, str, uiConfig, null);
    }

    final String m9768a(Context context, String str, UiConfig uiConfig, String str2) {
        return Base64.encodeToString(m9764b(context, str, uiConfig, str2), 10);
    }

    public final byte[] m9769b(Context context, String str) {
        return m9764b(context, str, new i(C7582R.style.Theme.InstrumentManager.BuyFlow).a(), null);
    }

    private final byte[] m9764b(Context context, String str, UiConfig uiConfig, String str2) {
        if (!this.f9324a.mo2249j(str).mo2294a(12622695)) {
            l.a();
        }
        a aVar;
        if (this.f9324a.mo2249j(str).mo2294a(12635593)) {
            boolean c;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            C0927i.f5711a = context.getApplicationContext().getContentResolver();
            aVar = new a();
            aVar.d = l.c(context);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(uiConfig.a, new int[]{com.google.android.wallet.instrumentmanager.a.imTitleIconType});
            aVar.b = obtainStyledAttributes.getInt(0, 1);
            obtainStyledAttributes.recycle();
            obtainStyledAttributes = context.obtainStyledAttributes(uiConfig.a, new int[]{com.google.android.wallet.instrumentmanager.a.imBodyIconType});
            aVar.c = obtainStyledAttributes.getInt(0, 1);
            obtainStyledAttributes.recycle();
            c = com.google.android.wallet.common.util.a.c(context);
            if (c) {
                aVar.a = l.a(context, uiConfig.a).toString();
            } else {
                Log.d("OrchestrationUtil", "FDL is not supported so app redirects will not be supported.");
            }
            C0757i cVar = new c();
            cVar.a = l.a(context, uiConfig.b, null, c);
            cVar.b = aVar;
            t.a(cVar, "ClientToken=");
            byte[] a = C0757i.m4909a(cVar);
            C2474c b = new C2474c(641).m13242b(SystemClock.elapsedRealtime() - elapsedRealtime);
            if (str2 != null) {
                b.m13244b(str2);
            }
            this.f9325b.mo2242f(str).m13319a(b.f13342a, null);
            return a;
        }
        C0927i.f5711a = context.getApplicationContext().getContentResolver();
        aVar = new a();
        aVar.d = l.c(context);
        obtainStyledAttributes = context.obtainStyledAttributes(uiConfig.a, new int[]{com.google.android.wallet.instrumentmanager.a.imTitleIconType});
        aVar.b = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        obtainStyledAttributes = context.obtainStyledAttributes(uiConfig.a, new int[]{com.google.android.wallet.instrumentmanager.a.imBodyIconType});
        aVar.c = obtainStyledAttributes.getInt(0, 1);
        obtainStyledAttributes.recycle();
        c = com.google.android.wallet.common.util.a.c(context);
        if (c) {
            aVar.a = l.a(context, uiConfig.a).toString();
        } else {
            Log.d("OrchestrationUtil", "FDL is not supported so app redirects will not be supported.");
        }
        C0757i cVar2 = new c();
        cVar2.a = l.a(context, uiConfig.b, null, c);
        cVar2.b = aVar;
        t.a(cVar2, "ClientToken=");
        return C0757i.m4909a(cVar2);
    }

    public final void m9770c(Context context, String str) {
        if (this.f9324a.mo2249j(str).mo2294a(12623787)) {
            bb.m21792a(new C1794j(this, context, str), new Void[0]);
        }
    }
}
