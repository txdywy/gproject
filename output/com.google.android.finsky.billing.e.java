package com.google.android.finsky.billing;

import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.vending.b.d;
import com.android.volley.a.ag;
import com.google.android.c.i;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.api.c;
import com.google.android.finsky.billing.common.f;
import com.google.android.finsky.billing.payments.f;
import com.google.android.finsky.billing.profile.BillingProfileActivity;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.t;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.pub.i;
import com.google.android.wallet.common.util.a;
import com.google.android.wallet.common.util.l;
import com.google.android.wallet.common.util.t;
import com.google.android.wallet.instrumentmanager.a;
import com.google.h.c.c.b.a.a.a;
import com.google.h.c.c.b.a.a.c;
import com.google.protobuf.nano.i;
import com.google.wireless.android.finsky.dfe.nano.ap;
import com.google.wireless.android.finsky.dfe.nano.u;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

public final class com.google.android.finsky.billing.e extends com.android.vending.b.d
{

    public final BillingService a;

    e(BillingService p0) {
        this.a = p0;
        com.android.vending.b.d();
    }

    public final Bundle a(Bundle p0) {
  2:    v1 = p0.getString("ACCOUNT_NAME");
 12:    v0 = com.google.android.finsky.m.a.U().b(v1);
 16:    if (v0 == 0) {
 21:        v2 = new Object[1];
 28:        v2[0] = FinskyLog.a(v1);
 30:        FinskyLog.c("Unable to locate specified accountName: %s", v2);
 46:        v0 = BillingService.a(22, this.a.a.a(0), 0, 0);
 50:        return v0;
        }
 55:    v7 = this.a.a.a(v0);
 61:    v2 = p0.getString("PACKAGE_NAME");
 75:    v3 = this.a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
 79:    if (v3 == 0) goto 84;
 82:    if (v3.length != 0) goto 106;
 84:    v0 = 0;
 85:    if (v0 == 0) {
 90:        v1 = new Object[1];
 93:        v1[0] = v2;
 95:        FinskyLog.c("The specified package name is invalid: %s", v1);
101:        v0 = BillingService.a(21, v7, v2, 0);
105:        return v0;
        }
 86:    goto 125;
107:    v0 = 0;
108:    if (v0 >= v3.length) goto 123;
116:    if (!v3[v0].equals(v2)) goto 120;
118:    v0 = 1;
119:    goto 85;
120:    v0 = v0 + 1;
122:    goto 108;
123:    v0 = 0;
124:    goto 85;
127:    v0 = this.a.a(v2);
131:    if (v0 == 0) {
136:        v1 = new Object[1];
139:        v1[0] = v2;
141:        FinskyLog.c("Unable to look up the signature for package: %s", v1);
147:        v0 = BillingService.a(21, v7, v2, 0);
151:        return v0;
        }
154:    v3 = p0.getString("REQUEST_TYPE");
158:    if (v3 == 0) {
163:        v0 = BillingService.a(23, v7, v2, 0);
167:        return v0;
        }
170:    v1 = com.google.android.finsky.m.a.b(v1);
180:    if (!"REQUEST_TYPE_HAS_FOP".equalsIgnoreCase(v3)) {
185:        v1 = new Object[1];
188:        v1[0] = v3;
190:        FinskyLog.c("Invalid REQUEST_TYPE: %s", v1);
196:        v0 = BillingService.a(23, v7, v2, 0);
200:        return v0;
        }
204:    v3 = new HashMap();
209:    com.google.android.finsky.billing.common.f.a(this.a, v3);
216:    v3.put("bpif", "6");
227:    if (TextUtils.isEmpty(this.a.b)) {
236:        v5 = new com.google.android.wallet.common.pub.i(com.google.android.finsky.billing.payments.f.a(0));
245:        if (v2.equals("com.google.android.vr.home"))
248:            v5.b = 1;
254:        v5 = v5.a();
266:        com.google.android.c.i.a = this.a.getApplicationContext().getContentResolver();
270:        v8 = new com.google.h.c.c.b.a.a.a();
277:        v8.d = com.google.android.wallet.common.util.l.c(this.a);
282:        v10 = new int[1];
287:        v10[0] = com.google.android.wallet.instrumentmanager.a.imTitleIconType;
289:        v9 = this.a.obtainStyledAttributes(v5.a, v10);
299:        v8.b = v9.getInt(0, 1);
301:        v9.recycle();
307:        v10 = new int[1];
312:        v10[0] = com.google.android.wallet.instrumentmanager.a.imBodyIconType;
314:        v9 = this.a.obtainStyledAttributes(v5.a, v10);
324:        v8.c = v9.getInt(0, 1);
326:        v9.recycle();
329:        v9 = com.google.android.wallet.common.util.a.c(this.a);
333:        if (v9 != 0)
345:            v8.a = com.google.android.wallet.common.util.l.a(this.a, v5.a).toString();
            else
485:            Log.d("OrchestrationUtil", "FDL is not supported so app redirects will not be supported.");
349:        v10 = new com.google.h.c.c.b.a.a.c();
359:        v10.a = com.google.android.wallet.common.util.l.a(this.a, v5.b, 0, v9);
361:        v10.b = v8;
365:        com.google.android.wallet.common.util.t.a(v10, "ClientToken=");
378:        v3.put("bppcc", Base64.encodeToString(com.google.protobuf.nano.i.a(v10), 8));
        }
383:    v3.put("shpn", v2);
400:    v3.put("shh", com.google.android.finsky.utils.t.a(v0.toByteArray(), "SHA-256", 10));
405:    v0 = new com.android.volley.a.ag();
409:    v1.a(0, v3, v0, v0);
412:    try {
418:        v5 = ((com.google.wireless.android.finsky.dfe.nano.ap)v0.get()).c;
        }
        catch (InterruptedException ex) {
496:        FinskyLog.c("Timed out while waiting for response.", new Object[0]);
501:        v0 = BillingService.a(20, v7, v2, ex);
505:        return v0;
        }
        catch (ExecutionException ex) {
515:        v4 = new Object[1];
518:        v4[0] = ex.getCause();
520:        FinskyLog.c("Error while requesting /billingProfile: %s", v4);
525:        v0 = BillingService.a(20, v7, v2, ex);
529:        return v0;
        }
432:    v7.a(BillingService.a(v2, 1, 0).a(v5.m));
437:    v9 = new Bundle();
442:    v9.putInt("RESPONSE_CODE", v5.m);
447:    if (v5.l != 0)
475:        v9.putParcelable("PROMPT_FOR_FOP_INTENT", PendingIntent.getActivity(this.a, 0, BillingProfileActivity.a(this.a, v1.b(), 0, 0, 0, v5, 0, v7, 9), 0));
478:    v0 = v9;
479:    return v0;
    }

}
