package com.google.android.finsky.billing.iab;

import android.os.Binder;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.vending.b.f;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.w;
import com.google.android.finsky.dh.a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.utils.b.a;
import java.util.List;
import java.util.Map;

public final class com.google.android.finsky.billing.iab.d extends com.android.vending.b.f
{

    public final FirstPartyInAppBillingService a;

    d(FirstPartyInAppBillingService p0) {
        this.a = p0;
        com.android.vending.b.f();
    }

    public final int a() {
        return com.google.android.finsky.billing.iab.x.g.l;
    }

    public final int a(String p0, int p1, String p2, String p3) {
        if (!((Boolean)com.google.android.finsky.aa.b.cW.b()).booleanValue()) {
            FinskyLog.c("This API is disabled.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.g;
        }
        else if (TextUtils.isEmpty(p0)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else if (!this.a.d.c(p0)) {
            v1 = new Object[1];
            v1[0] = FinskyLog.a(p0);
            FinskyLog.c("Unable to locate specified accountName: %s", v1);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else {
            v0 = com.google.android.finsky.billing.iab.w.a(p2, this.a, Binder.getCallingUid(), this.a.c.j(p0));
            if (v0 == com.google.android.finsky.billing.iab.x.a) {
                if (!((Boolean)com.google.android.finsky.aa.b.cX.b()).booleanValue() && !com.google.android.finsky.dh.a.a(this.a, p2)) {
                    v1 = new Object[1];
                    v1[0] = p2;
                    FinskyLog.c("The calling package is not authorized to use this API: %s", v1);
                    v0 = com.google.android.finsky.billing.iab.x.f;
                }
                else
                    v0 = com.google.android.finsky.billing.iab.x.a;
            }
        }
        if (v0 != com.google.android.finsky.billing.iab.x.a)
            v0 = v0.l;
        else {
            v0 = (com.google.android.finsky.d.w)this.a.f.get(p2);
            if (v0 == 0) {
                v0 = this.a.b.a(0);
                this.a.f.put(p2, v0);
            }
            v0 = this.a.a.a(p0, v0.b(p0)).a(p1, p3, 0);
        }
        return v0;
    }

    public final Bundle a(String p0, int p1, String p2, String p3, Bundle p4) {
        if (!((Boolean)com.google.android.finsky.aa.b.cW.b()).booleanValue()) {
            FinskyLog.c("This API is disabled.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.g;
        }
        else if (TextUtils.isEmpty(p0)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else if (!this.a.d.c(p0)) {
            v1 = new Object[1];
            v1[0] = FinskyLog.a(p0);
            FinskyLog.c("Unable to locate specified accountName: %s", v1);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else {
            v0 = com.google.android.finsky.billing.iab.w.a(p2, this.a, Binder.getCallingUid(), this.a.c.j(p0));
            if (v0 == com.google.android.finsky.billing.iab.x.a) {
                if (!((Boolean)com.google.android.finsky.aa.b.cX.b()).booleanValue() && !com.google.android.finsky.dh.a.a(this.a, p2)) {
                    v1 = new Object[1];
                    v1[0] = p2;
                    FinskyLog.c("The calling package is not authorized to use this API: %s", v1);
                    v0 = com.google.android.finsky.billing.iab.x.f;
                }
                else
                    v0 = com.google.android.finsky.billing.iab.x.a;
            }
        }
        if (v0 != com.google.android.finsky.billing.iab.x.a)
            v0 = com.google.android.finsky.billing.iab.w.a(v0);
        else {
            v0 = (com.google.android.finsky.d.w)this.a.f.get(p2);
            if (v0 == 0) {
                v0 = this.a.b.a(0);
                this.a.f.put(p2, v0);
            }
            v0 = this.a.a.a(p0, v0.b(p0)).a(p1, p2, p3, p4);
        }
        return v0;
    }

    public final Bundle a(String p0, int p1, String p2, String p3, String p4) {
        if (!((Boolean)com.google.android.finsky.aa.b.cW.b()).booleanValue()) {
            FinskyLog.c("This API is disabled.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.g;
        }
        else if (TextUtils.isEmpty(p0)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else if (!this.a.d.c(p0)) {
            v1 = new Object[1];
            v1[0] = FinskyLog.a(p0);
            FinskyLog.c("Unable to locate specified accountName: %s", v1);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else {
            v0 = com.google.android.finsky.billing.iab.w.a(p2, this.a, Binder.getCallingUid(), this.a.c.j(p0));
            if (v0 == com.google.android.finsky.billing.iab.x.a) {
                if (!((Boolean)com.google.android.finsky.aa.b.cX.b()).booleanValue() && !com.google.android.finsky.dh.a.a(this.a, p2)) {
                    v1 = new Object[1];
                    v1[0] = p2;
                    FinskyLog.c("The calling package is not authorized to use this API: %s", v1);
                    v0 = com.google.android.finsky.billing.iab.x.f;
                }
                else
                    v0 = com.google.android.finsky.billing.iab.x.a;
            }
        }
        if (v0 != com.google.android.finsky.billing.iab.x.a)
            v0 = com.google.android.finsky.billing.iab.w.a(v0);
        else {
            v0 = (com.google.android.finsky.d.w)this.a.f.get(p2);
            if (v0 == 0) {
                v0 = this.a.b.a(0);
                this.a.f.put(p2, v0);
            }
            v0 = this.a.a.a(p0, v0.b(p0)).a(p1, p2, p3, p4, 0);
        }
        return v0;
    }

    public final Bundle a(String p0, int p1, String p2, String p3, String p4, String p5) {
        if (!((Boolean)com.google.android.finsky.aa.b.cW.b()).booleanValue()) {
            FinskyLog.c("This API is disabled.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.g;
        }
        else if (TextUtils.isEmpty(p0)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else if (!this.a.d.c(p0)) {
            v1 = new Object[1];
            v1[0] = FinskyLog.a(p0);
            FinskyLog.c("Unable to locate specified accountName: %s", v1);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else {
            v0 = com.google.android.finsky.billing.iab.w.a(p2, this.a, Binder.getCallingUid(), this.a.c.j(p0));
            if (v0 == com.google.android.finsky.billing.iab.x.a) {
                if (!((Boolean)com.google.android.finsky.aa.b.cX.b()).booleanValue() && !com.google.android.finsky.dh.a.a(this.a, p2)) {
                    v1 = new Object[1];
                    v1[0] = p2;
                    FinskyLog.c("The calling package is not authorized to use this API: %s", v1);
                    v0 = com.google.android.finsky.billing.iab.x.f;
                }
                else
                    v0 = com.google.android.finsky.billing.iab.x.a;
            }
        }
        if (v0 != com.google.android.finsky.billing.iab.x.a)
            v0 = com.google.android.finsky.billing.iab.w.a(v0);
        else {
            v0 = (com.google.android.finsky.d.w)this.a.f.get(p2);
            if (v0 == 0) {
                v0 = this.a.b.a(0);
                this.a.f.put(p2, v0);
            }
            v0 = this.a.a.a(p0, v0.b(p0)).a(p1, p2, p3, p4, p5, Binder.getCallingUid());
        }
        return v0;
    }

    public final Bundle a(String p0, int p1, String p2, List p3, String p4, String p5, String p6) {
        if (!((Boolean)com.google.android.finsky.aa.b.cW.b()).booleanValue()) {
            FinskyLog.c("This API is disabled.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.g;
        }
        else if (TextUtils.isEmpty(p0)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else if (!this.a.d.c(p0)) {
            v1 = new Object[1];
            v1[0] = FinskyLog.a(p0);
            FinskyLog.c("Unable to locate specified accountName: %s", v1);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else {
            v0 = com.google.android.finsky.billing.iab.w.a(p2, this.a, Binder.getCallingUid(), this.a.c.j(p0));
            if (v0 == com.google.android.finsky.billing.iab.x.a) {
                if (!((Boolean)com.google.android.finsky.aa.b.cX.b()).booleanValue() && !com.google.android.finsky.dh.a.a(this.a, p2)) {
                    v1 = new Object[1];
                    v1[0] = p2;
                    FinskyLog.c("The calling package is not authorized to use this API: %s", v1);
                    v0 = com.google.android.finsky.billing.iab.x.f;
                }
                else
                    v0 = com.google.android.finsky.billing.iab.x.a;
            }
        }
        if (v0 != com.google.android.finsky.billing.iab.x.a)
            v0 = com.google.android.finsky.billing.iab.w.a(v0);
        else {
            v0 = (com.google.android.finsky.d.w)this.a.f.get(p2);
            if (v0 == 0) {
                v0 = this.a.b.a(0);
                this.a.f.put(p2, v0);
            }
            v0 = this.a.a.a(p0, v0.b(p0)).a(p1, p2, p3, p4, p5, p6, 0);
        }
        return v0;
    }

    public final int b(String p0, int p1, String p2, String p3) {
        if (!((Boolean)com.google.android.finsky.aa.b.cW.b()).booleanValue()) {
            FinskyLog.c("This API is disabled.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.g;
        }
        else if (TextUtils.isEmpty(p0)) {
            FinskyLog.c("Input Error: Non empty/null argument expected for accountName.", new Object[0]);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else if (!this.a.d.c(p0)) {
            v1 = new Object[1];
            v1[0] = FinskyLog.a(p0);
            FinskyLog.c("Unable to locate specified accountName: %s", v1);
            v0 = com.google.android.finsky.billing.iab.x.f;
        }
        else {
            v0 = com.google.android.finsky.billing.iab.w.a(p2, this.a, Binder.getCallingUid(), this.a.c.j(p0));
            if (v0 == com.google.android.finsky.billing.iab.x.a) {
                if (!((Boolean)com.google.android.finsky.aa.b.cX.b()).booleanValue() && !com.google.android.finsky.dh.a.a(this.a, p2)) {
                    v1 = new Object[1];
                    v1[0] = p2;
                    FinskyLog.c("The calling package is not authorized to use this API: %s", v1);
                    v0 = com.google.android.finsky.billing.iab.x.f;
                }
                else
                    v0 = com.google.android.finsky.billing.iab.x.a;
            }
        }
        if (v0 != com.google.android.finsky.billing.iab.x.a)
            v0 = v0.l;
        else {
            v0 = (com.google.android.finsky.d.w)this.a.f.get(p2);
            if (v0 == 0) {
                v0 = this.a.b.a(0);
                this.a.f.put(p2, v0);
            }
            v0 = this.a.a.a(p0, v0.b(p0)).b(p1, p2, p3, 0);
        }
        return v0;
    }

}
