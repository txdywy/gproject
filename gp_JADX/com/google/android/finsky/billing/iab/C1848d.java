package com.google.android.finsky.billing.iab;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vending.p056b.C0635f;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class C1848d extends C0635f {
    public final /* synthetic */ FirstPartyInAppBillingService f9495a;

    C1848d(FirstPartyInAppBillingService firstPartyInAppBillingService) {
        this.f9495a = firstPartyInAppBillingService;
    }

    public final int mo2466a(String str, int i, String str2, String str3) {
        C1868x c1868x;
        Context context = this.f9495a;
        if (!((Boolean) C0955b.cW.m28964b()).booleanValue()) {
            FinskyLog.m21665c("This API is disabled.", new Object[0]);
            c1868x = C1868x.RESULT_ERROR;
        } else if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        } else if (context.f9480d.mo1184c(str)) {
            c1868x = C1867w.m9983a(str2, context, Binder.getCallingUid(), context.f9479c.mo2249j(str));
            if (c1868x == C1868x.RESULT_OK) {
                if (((Boolean) C0955b.cX.m28964b()).booleanValue() || C2744a.m14788a(context, str2)) {
                    c1868x = C1868x.RESULT_OK;
                } else {
                    FinskyLog.m21665c("The calling package is not authorized to use this API: %s", str2);
                    c1868x = C1868x.RESULT_DEVELOPER_ERROR;
                }
            }
        } else {
            FinskyLog.m21665c("Unable to locate specified accountName: %s", FinskyLog.m21655a(str));
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        }
        if (c1868x != C1868x.RESULT_OK) {
            return c1868x.f9566l;
        }
        FirstPartyInAppBillingService firstPartyInAppBillingService = this.f9495a;
        C1846c c1846c = firstPartyInAppBillingService.f9477a;
        C2495w c2495w = (C2495w) firstPartyInAppBillingService.f9482f.get(str2);
        if (c2495w == null) {
            c2495w = firstPartyInAppBillingService.f9478b.m13184a(null);
            firstPartyInAppBillingService.f9482f.put(str2, c2495w);
        }
        return c1846c.mo2464a(str, c2495w.m13380b(str)).m9935a(i, str3, null);
    }

    public final Bundle mo2467a(String str, int i, String str2, String str3, Bundle bundle) {
        C1868x c1868x;
        Context context = this.f9495a;
        if (!((Boolean) C0955b.cW.m28964b()).booleanValue()) {
            FinskyLog.m21665c("This API is disabled.", new Object[0]);
            c1868x = C1868x.RESULT_ERROR;
        } else if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        } else if (context.f9480d.mo1184c(str)) {
            c1868x = C1867w.m9983a(str2, context, Binder.getCallingUid(), context.f9479c.mo2249j(str));
            if (c1868x == C1868x.RESULT_OK) {
                if (((Boolean) C0955b.cX.m28964b()).booleanValue() || C2744a.m14788a(context, str2)) {
                    c1868x = C1868x.RESULT_OK;
                } else {
                    FinskyLog.m21665c("The calling package is not authorized to use this API: %s", str2);
                    c1868x = C1868x.RESULT_DEVELOPER_ERROR;
                }
            }
        } else {
            FinskyLog.m21665c("Unable to locate specified accountName: %s", FinskyLog.m21655a(str));
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        }
        if (c1868x != C1868x.RESULT_OK) {
            return C1867w.m9980a(c1868x);
        }
        FirstPartyInAppBillingService firstPartyInAppBillingService = this.f9495a;
        C1846c c1846c = firstPartyInAppBillingService.f9477a;
        C2495w c2495w = (C2495w) firstPartyInAppBillingService.f9482f.get(str2);
        if (c2495w == null) {
            c2495w = firstPartyInAppBillingService.f9478b.m13184a(null);
            firstPartyInAppBillingService.f9482f.put(str2, c2495w);
        }
        return c1846c.mo2464a(str, c2495w.m13380b(str)).m9937a(i, str2, str3, bundle);
    }

    public final Bundle mo2469a(String str, int i, String str2, String str3, String str4, String str5) {
        C1868x c1868x;
        Context context = this.f9495a;
        if (!((Boolean) C0955b.cW.m28964b()).booleanValue()) {
            FinskyLog.m21665c("This API is disabled.", new Object[0]);
            c1868x = C1868x.RESULT_ERROR;
        } else if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        } else if (context.f9480d.mo1184c(str)) {
            c1868x = C1867w.m9983a(str2, context, Binder.getCallingUid(), context.f9479c.mo2249j(str));
            if (c1868x == C1868x.RESULT_OK) {
                if (((Boolean) C0955b.cX.m28964b()).booleanValue() || C2744a.m14788a(context, str2)) {
                    c1868x = C1868x.RESULT_OK;
                } else {
                    FinskyLog.m21665c("The calling package is not authorized to use this API: %s", str2);
                    c1868x = C1868x.RESULT_DEVELOPER_ERROR;
                }
            }
        } else {
            FinskyLog.m21665c("Unable to locate specified accountName: %s", FinskyLog.m21655a(str));
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        }
        if (c1868x != C1868x.RESULT_OK) {
            return C1867w.m9980a(c1868x);
        }
        FirstPartyInAppBillingService firstPartyInAppBillingService = this.f9495a;
        C1846c c1846c = firstPartyInAppBillingService.f9477a;
        C2495w c2495w = (C2495w) firstPartyInAppBillingService.f9482f.get(str2);
        if (c2495w == null) {
            c2495w = firstPartyInAppBillingService.f9478b.m13184a(null);
            firstPartyInAppBillingService.f9482f.put(str2, c2495w);
        }
        return c1846c.mo2464a(str, c2495w.m13380b(str)).m9939a(i, str2, str3, str4, str5, Binder.getCallingUid());
    }

    public final Bundle mo2468a(String str, int i, String str2, String str3, String str4) {
        C1868x c1868x;
        Context context = this.f9495a;
        if (!((Boolean) C0955b.cW.m28964b()).booleanValue()) {
            FinskyLog.m21665c("This API is disabled.", new Object[0]);
            c1868x = C1868x.RESULT_ERROR;
        } else if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        } else if (context.f9480d.mo1184c(str)) {
            c1868x = C1867w.m9983a(str2, context, Binder.getCallingUid(), context.f9479c.mo2249j(str));
            if (c1868x == C1868x.RESULT_OK) {
                if (((Boolean) C0955b.cX.m28964b()).booleanValue() || C2744a.m14788a(context, str2)) {
                    c1868x = C1868x.RESULT_OK;
                } else {
                    FinskyLog.m21665c("The calling package is not authorized to use this API: %s", str2);
                    c1868x = C1868x.RESULT_DEVELOPER_ERROR;
                }
            }
        } else {
            FinskyLog.m21665c("Unable to locate specified accountName: %s", FinskyLog.m21655a(str));
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        }
        if (c1868x != C1868x.RESULT_OK) {
            return C1867w.m9980a(c1868x);
        }
        FirstPartyInAppBillingService firstPartyInAppBillingService = this.f9495a;
        C1846c c1846c = firstPartyInAppBillingService.f9477a;
        C2495w c2495w = (C2495w) firstPartyInAppBillingService.f9482f.get(str2);
        if (c2495w == null) {
            c2495w = firstPartyInAppBillingService.f9478b.m13184a(null);
            firstPartyInAppBillingService.f9482f.put(str2, c2495w);
        }
        return c1846c.mo2464a(str, c2495w.m13380b(str)).m9938a(i, str2, str3, str4, null);
    }

    public final int mo2471b(String str, int i, String str2, String str3) {
        C1868x c1868x;
        Context context = this.f9495a;
        if (!((Boolean) C0955b.cW.m28964b()).booleanValue()) {
            FinskyLog.m21665c("This API is disabled.", new Object[0]);
            c1868x = C1868x.RESULT_ERROR;
        } else if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        } else if (context.f9480d.mo1184c(str)) {
            c1868x = C1867w.m9983a(str2, context, Binder.getCallingUid(), context.f9479c.mo2249j(str));
            if (c1868x == C1868x.RESULT_OK) {
                if (((Boolean) C0955b.cX.m28964b()).booleanValue() || C2744a.m14788a(context, str2)) {
                    c1868x = C1868x.RESULT_OK;
                } else {
                    FinskyLog.m21665c("The calling package is not authorized to use this API: %s", str2);
                    c1868x = C1868x.RESULT_DEVELOPER_ERROR;
                }
            }
        } else {
            FinskyLog.m21665c("Unable to locate specified accountName: %s", FinskyLog.m21655a(str));
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        }
        if (c1868x != C1868x.RESULT_OK) {
            return c1868x.f9566l;
        }
        FirstPartyInAppBillingService firstPartyInAppBillingService = this.f9495a;
        C1846c c1846c = firstPartyInAppBillingService.f9477a;
        C2495w c2495w = (C2495w) firstPartyInAppBillingService.f9482f.get(str2);
        if (c2495w == null) {
            c2495w = firstPartyInAppBillingService.f9478b.m13184a(null);
            firstPartyInAppBillingService.f9482f.put(str2, c2495w);
        }
        return c1846c.mo2464a(str, c2495w.m13380b(str)).m9949b(i, str2, str3, null);
    }

    @Deprecated
    public final int mo2465a() {
        return C1868x.RESULT_ERROR.f9566l;
    }

    public final Bundle mo2470a(String str, int i, String str2, List list, String str3, String str4, String str5) {
        C1868x c1868x;
        Context context = this.f9495a;
        if (!((Boolean) C0955b.cW.m28964b()).booleanValue()) {
            FinskyLog.m21665c("This API is disabled.", new Object[0]);
            c1868x = C1868x.RESULT_ERROR;
        } else if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        } else if (context.f9480d.mo1184c(str)) {
            c1868x = C1867w.m9983a(str2, context, Binder.getCallingUid(), context.f9479c.mo2249j(str));
            if (c1868x == C1868x.RESULT_OK) {
                if (((Boolean) C0955b.cX.m28964b()).booleanValue() || C2744a.m14788a(context, str2)) {
                    c1868x = C1868x.RESULT_OK;
                } else {
                    FinskyLog.m21665c("The calling package is not authorized to use this API: %s", str2);
                    c1868x = C1868x.RESULT_DEVELOPER_ERROR;
                }
            }
        } else {
            FinskyLog.m21665c("Unable to locate specified accountName: %s", FinskyLog.m21655a(str));
            c1868x = C1868x.RESULT_DEVELOPER_ERROR;
        }
        if (c1868x != C1868x.RESULT_OK) {
            return C1867w.m9980a(c1868x);
        }
        FirstPartyInAppBillingService firstPartyInAppBillingService = this.f9495a;
        C1846c c1846c = firstPartyInAppBillingService.f9477a;
        C2495w c2495w = (C2495w) firstPartyInAppBillingService.f9482f.get(str2);
        if (c2495w == null) {
            c2495w = firstPartyInAppBillingService.f9478b.m13184a(null);
            firstPartyInAppBillingService.f9482f.put(str2, c2495w);
        }
        return c1846c.mo2464a(str, c2495w.m13380b(str)).m9940a(i, str2, list, str3, str4, str5, null);
    }
}
