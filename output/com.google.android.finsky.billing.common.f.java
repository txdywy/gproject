package com.google.android.finsky.billing.common;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.t;
import java.util.Map;

private static class com.google.android.finsky.billing.common.f
{

    public static boolean a;
    public static String b;

    public static synchronized void a(Context p0) {
        enter com.google.android.finsky.billing.common.f;
        try {
            if (com.google.android.finsky.billing.common.f.a == 0) {
                try {
                    com.google.android.finsky.billing.common.f.a = 1;
                    com.google.android.finsky.billing.common.f.b = com.google.android.finsky.billing.common.f.b(p0);
                }
                catch (Throwable ex) {
                    exit com.google.android.finsky.billing.common.f;
                    throw ex;
                }
                exit com.google.android.finsky.billing.common.f;
                return;
            }
            throw new IllegalStateException("CarrierBillingUtils already initialized.");
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.billing.common.f;
            throw ex;
        }
    }

    public static void a(Context p0, Map p1) {
        v0 = com.google.android.finsky.billing.common.f.b(p0);
        if (!TextUtils.isEmpty(v0))
            p1.put("dcbch", v0);
    }

    public static synchronized String b(Context p0) {
        enter com.google.android.finsky.billing.common.f;
        try {
            if (com.google.android.finsky.billing.common.f.b == 0)
                com.google.android.finsky.billing.common.f.b = com.google.android.finsky.billing.common.f.c(p0);
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.billing.common.f;
            throw ex;
        }
        exit com.google.android.finsky.billing.common.f;
        return com.google.android.finsky.billing.common.f.b;
    }

    private static String c(Context p0) {
        v0 = (TelephonyManager)p0.getSystemService("phone");
        if (v0 == 0) {
            v0 = "invalid_sim_id";
            return v0;
        }
        try {
            v1 = v0.getSubscriberId();
            if (v1 != 0) {
                v0 = com.google.android.finsky.utils.t.a(v1.getBytes());
                return v0;
            }
        }
        catch (SecurityException ex) {
            v3 = new Object[1];
            v3[0] = ex;
            FinskyLog.c("Cannot read subscriber Id: %s", v3);
            try {
                v0 = v0.getDeviceId();
                if (v0 != 0) {
                    v0 = com.google.android.finsky.utils.t.a(v0.getBytes());
                    return v0;
                }
            }
            catch (SecurityException ex) {
                v2 = new Object[1];
                v2[0] = ex;
                FinskyLog.c("Cannot read device Id: %s", v2);
                v0 = "invalid_sim_id";
                return v0;
            }
            v0 = "invalid_sim_id";
            return v0;
        }
        try {
            v0 = v0.getDeviceId();
            if (v0 != 0) {
                v0 = com.google.android.finsky.utils.t.a(v0.getBytes());
                return v0;
            }
        }
        catch (SecurityException ex) {
            v2 = new Object[1];
            v2[0] = ex;
            FinskyLog.c("Cannot read device Id: %s", v2);
            v0 = "invalid_sim_id";
            return v0;
        }
        v0 = "invalid_sim_id";
        return v0;
    }

}
