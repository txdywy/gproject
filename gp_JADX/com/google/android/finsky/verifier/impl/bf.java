package com.google.android.finsky.verifier.impl;

import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.p259a.p260a.C4721y;
import com.google.android.finsky.verifier.p259a.p260a.ac;
import com.google.android.finsky.verifier.p259a.p260a.ae;
import com.google.android.gms.clearcut.C5012a;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.C5089p;
import java.util.concurrent.TimeUnit;

public final class bf {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m22118a(android.content.Context r5, com.google.android.finsky.verifier.p259a.p260a.ae r6, boolean r7) {
        /*
        if (r7 == 0) goto L_0x002c;
    L_0x0002:
        r0 = r6.f24124b;
        if (r0 == 0) goto L_0x002c;
    L_0x0006:
        r1 = r6.f24124b;
        r0 = com.google.android.finsky.aa.C0955b.ci;
        r0 = r0.m28964b();
        r0 = (java.lang.Boolean) r0;
        r0 = r0.booleanValue();
        if (r0 == 0) goto L_0x002c;
    L_0x0016:
        r0 = com.google.android.finsky.verifier.impl.cs.m22285e(r5);
        if (r0 == 0) goto L_0x002c;
    L_0x001c:
        if (r0 != 0) goto L_0x0024;
    L_0x001e:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x0024:
        r2 = r1.f24109a;
        r2 = r2 | 64;
        r1.f24109a = r2;
        r1.f24117i = r0;
    L_0x002c:
        r0 = com.google.protobuf.nano.C0757i.m4909a(r6);
        r1 = m22117a(r5);
        if (r1 == 0) goto L_0x0066;
    L_0x0036:
        r2 = new com.google.android.gms.clearcut.a;	 Catch:{ RuntimeException -> 0x0067 }
        r3 = "ANDROID_VERIFY_APPS";
        r2.<init>(r5, r3);	 Catch:{ RuntimeException -> 0x0067 }
        r3 = new com.google.android.gms.clearcut.b;	 Catch:{ RuntimeException -> 0x0067 }
        r3.<init>(r2, r0);	 Catch:{ RuntimeException -> 0x0067 }
        r0 = r3.m23195a();	 Catch:{ RuntimeException -> 0x0067 }
        r2 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r4 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ RuntimeException -> 0x0067 }
        r0 = r0.mo4488a(r2, r4);	 Catch:{ RuntimeException -> 0x0067 }
        r0 = (com.google.android.gms.common.api.Status) r0;	 Catch:{ RuntimeException -> 0x0067 }
        r2 = r0.m23271a();	 Catch:{ RuntimeException -> 0x0067 }
        if (r2 != 0) goto L_0x0063;
    L_0x0056:
        r2 = "Could not log user response to Clearcut: %s";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ RuntimeException -> 0x0067 }
        r4 = 0;
        r0 = r0.f25632h;	 Catch:{ RuntimeException -> 0x0067 }
        r3[r4] = r0;	 Catch:{ RuntimeException -> 0x0067 }
        com.google.android.finsky.utils.FinskyLog.m21667d(r2, r3);	 Catch:{ RuntimeException -> 0x0067 }
    L_0x0063:
        r1.mo4559g();
    L_0x0066:
        return;
    L_0x0067:
        r0 = move-exception;
        r2 = "Could not log user response to Clearcut: %s";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0077 }
        r4 = 0;
        r3[r4] = r0;	 Catch:{ all -> 0x0077 }
        com.google.android.finsky.utils.FinskyLog.m21667d(r2, r3);	 Catch:{ all -> 0x0077 }
        r1.mo4559g();
        goto L_0x0066;
    L_0x0077:
        r0 = move-exception;
        r1.mo4559g();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.impl.bf.a(android.content.Context, com.google.android.finsky.verifier.a.a.ae, boolean):void");
    }

    public static void m22120a(Context context, boolean z, int i, String str, Integer num, byte[] bArr, Integer num2) {
        ae aeVar = new ae();
        aeVar.f24124b = new ac();
        aeVar.f24124b.m21860a(z);
        aeVar.f24124b.m21865b(i);
        if (str != null) {
            aeVar.f24124b.m21859a(str);
        }
        if (num != null) {
            aeVar.f24124b.m21866c(num.intValue());
        }
        if (bArr != null) {
            aeVar.f24124b.m21861a(bArr);
        }
        if (num2 != null) {
            ac acVar = aeVar.f24124b;
            int intValue = num2.intValue();
            acVar.f24109a |= 32;
            acVar.f24115g = intValue;
        }
        m22118a(context, aeVar, true);
    }

    public static void m22119a(Context context, String str, int i, byte[] bArr, boolean z, boolean z2) {
        ae aeVar = new ae();
        aeVar.f24125c = new C4721y();
        C4721y c4721y = aeVar.f24125c;
        if (str == null) {
            throw new NullPointerException();
        }
        c4721y.f24284a |= 1;
        c4721y.f24285b = str;
        c4721y = aeVar.f24125c;
        c4721y.f24284a |= 2;
        c4721y.f24286c = i;
        if (bArr != null) {
            c4721y = aeVar.f24125c;
            if (bArr == null) {
                throw new NullPointerException();
            }
            c4721y.f24284a |= 4;
            c4721y.f24287d = bArr;
        }
        c4721y = aeVar.f24125c;
        c4721y.f24284a |= 8;
        c4721y.f24288e = z;
        c4721y = aeVar.f24125c;
        c4721y.f24284a |= 32;
        c4721y.f24290g = z2;
        m22118a(context, aeVar, true);
    }

    private static C5058o m22117a(Context context) {
        try {
            C5058o b = new C5089p(context).m23647a(C5012a.f25522c).m23652b();
            if (b.mo4542a(10000, TimeUnit.MILLISECONDS).m23264b()) {
                return b;
            }
            FinskyLog.m21665c("Could not connect to Clearcut: %s", b.mo4542a(10000, TimeUnit.MILLISECONDS));
            return null;
        } catch (RuntimeException e) {
            FinskyLog.m21667d("Could not connect to Clearcut: %s", e);
            return null;
        }
    }

    public static int m22116a(VolleyError volleyError) {
        if (volleyError instanceof TimeoutError) {
            return 2;
        }
        if (volleyError instanceof NoConnectionError) {
            return 1;
        }
        if (volleyError instanceof NetworkError) {
            return 3;
        }
        if (volleyError instanceof ParseError) {
            return 4;
        }
        if (volleyError instanceof AuthFailureError) {
            return 5;
        }
        if (volleyError instanceof ServerError) {
            return 6;
        }
        return 7;
    }
}
