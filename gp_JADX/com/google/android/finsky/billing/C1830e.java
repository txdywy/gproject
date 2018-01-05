package com.google.android.finsky.billing;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.pm.Signature;
import android.content.res.TypedArray;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.android.vending.p056b.C0633d;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.p060a.ag;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.billing.common.C1791f;
import com.google.android.finsky.billing.payments.C2043f;
import com.google.android.finsky.billing.profile.BillingProfileActivity;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.p102c.C0927i;
import com.google.android.wallet.common.pub.UiConfig;
import com.google.android.wallet.common.pub.i;
import com.google.android.wallet.common.util.l;
import com.google.android.wallet.common.util.t;
import com.google.h.c.c.b.a.a.a;
import com.google.h.c.c.b.a.a.c;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.ap;
import com.google.wireless.android.finsky.dfe.nano.u;
import java.util.HashMap;
import java.util.Map;

final class C1830e extends C0633d {
    public final /* synthetic */ BillingService f9414a;

    C1830e(BillingService billingService) {
        this.f9414a = billingService;
    }

    public final Bundle mo2458a(Bundle bundle) {
        String string = bundle.getString("ACCOUNT_NAME");
        Account b = C1473m.f7980a.mo2041U().mo1183b(string);
        if (b == null) {
            FinskyLog.m21665c("Unable to locate specified accountName: %s", FinskyLog.m21655a(string));
            return BillingService.m9351a(22, this.f9414a.f8583a.m13184a(null), null, null);
        }
        Object obj;
        int i;
        C2495w a = this.f9414a.f8583a.m13178a(b);
        String string2 = bundle.getString("PACKAGE_NAME");
        String[] packagesForUid = this.f9414a.getPackageManager().getPackagesForUid(Binder.getCallingUid());
        if (packagesForUid == null || packagesForUid.length == 0) {
            obj = null;
        } else {
            for (String equals : packagesForUid) {
                if (equals.equals(string2)) {
                    obj = 1;
                    break;
                }
            }
            obj = null;
        }
        if (obj == null) {
            FinskyLog.m21665c("The specified package name is invalid: %s", string2);
            return BillingService.m9351a(21, a, string2, null);
        }
        Signature a2 = this.f9414a.m9353a(string2);
        if (a2 == null) {
            FinskyLog.m21665c("Unable to look up the signature for package: %s", string2);
            return BillingService.m9351a(21, a, string2, null);
        }
        String string3 = bundle.getString("REQUEST_TYPE");
        if (string3 == null) {
            return BillingService.m9351a(23, a, string2, null);
        }
        C1254c b2 = C1473m.f7980a.mo2112b(string);
        if ("REQUEST_TYPE_HAS_FOP".equalsIgnoreCase(string3)) {
            Map hashMap = new HashMap();
            C1791f.m9754a(this.f9414a, hashMap);
            hashMap.put("bpif", "6");
            if (TextUtils.isEmpty(this.f9414a.f8584b)) {
                i iVar = new i(C2043f.m10743a(null));
                if (string2.equals("com.google.android.vr.home")) {
                    iVar.b = 1;
                }
                String str = "bppcc";
                Context context = this.f9414a;
                UiConfig a3 = iVar.a();
                C0927i.f5711a = context.getApplicationContext().getContentResolver();
                a aVar = new a();
                aVar.d = l.c(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(a3.a, new int[]{com.google.android.wallet.instrumentmanager.a.imTitleIconType});
                aVar.b = obtainStyledAttributes.getInt(0, 1);
                obtainStyledAttributes.recycle();
                obtainStyledAttributes = context.obtainStyledAttributes(a3.a, new int[]{com.google.android.wallet.instrumentmanager.a.imBodyIconType});
                aVar.c = obtainStyledAttributes.getInt(0, 1);
                obtainStyledAttributes.recycle();
                boolean c = com.google.android.wallet.common.util.a.c(context);
                if (c) {
                    aVar.a = l.a(context, a3.a).toString();
                } else {
                    Log.d("OrchestrationUtil", "FDL is not supported so app redirects will not be supported.");
                }
                C0757i cVar = new c();
                cVar.a = l.a(context, a3.b, null, c);
                cVar.b = aVar;
                t.a(cVar, "ClientToken=");
                hashMap.put(str, Base64.encodeToString(C0757i.m4909a(cVar), 8));
            }
            hashMap.put("shpn", string2);
            hashMap.put("shh", C4688t.m21839a(a2.toByteArray(), "SHA-256", 10));
            C0660x agVar = new ag();
            b2.mo1595a(null, hashMap, agVar, (C0657w) agVar);
            try {
                u uVar = ((ap) agVar.get()).c;
                i = uVar.m;
                a.m13367a(BillingService.m9352a(string2, true, null).m13210a(i));
                Bundle bundle2 = new Bundle();
                bundle2.putInt("RESPONSE_CODE", i);
                if (uVar.l) {
                    bundle2.putParcelable("PROMPT_FOR_FOP_INTENT", PendingIntent.getActivity(this.f9414a, 0, BillingProfileActivity.m10752a(this.f9414a, b2.mo1620b(), null, null, 0, uVar, null, a, 9), 0));
                }
                return bundle2;
            } catch (Throwable e) {
                FinskyLog.m21665c("Timed out while waiting for response.", new Object[0]);
                return BillingService.m9351a(20, a, string2, e);
            } catch (Throwable e2) {
                FinskyLog.m21665c("Error while requesting /billingProfile: %s", e2.getCause());
                return BillingService.m9351a(20, a, string2, e2);
            }
        }
        FinskyLog.m21665c("Invalid REQUEST_TYPE: %s", string3);
        return BillingService.m9351a(23, a, string2, null);
    }
}
