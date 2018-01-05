package com.google.android.finsky.billing.common;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.FinskyLog;
import java.util.Map;

public final class C1791f {
    public static boolean f9318a;
    public static String f9319b;

    public static synchronized void m9753a(Context context) {
        synchronized (C1791f.class) {
            if (f9318a) {
                throw new IllegalStateException("CarrierBillingUtils already initialized.");
            }
            f9318a = true;
            f9319b = C1791f.m9755b(context);
        }
    }

    public static synchronized String m9755b(Context context) {
        String str;
        synchronized (C1791f.class) {
            if (f9319b == null) {
                f9319b = C1791f.m9756c(context);
            }
            str = f9319b;
        }
        return str;
    }

    public static void m9754a(Context context, Map map) {
        CharSequence b = C1791f.m9755b(context);
        if (!TextUtils.isEmpty(b)) {
            map.put("dcbch", b);
        }
    }

    private static String m9756c(Context context) {
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager != null) {
            try {
                String subscriberId = telephonyManager.getSubscriberId();
                if (subscriberId != null) {
                    return C4688t.m21838a(subscriberId.getBytes());
                }
            } catch (SecurityException e) {
                FinskyLog.m21665c("Cannot read subscriber Id: %s", e);
            }
            try {
                String deviceId = telephonyManager.getDeviceId();
                if (deviceId != null) {
                    return C4688t.m21838a(deviceId.getBytes());
                }
            } catch (SecurityException e2) {
                FinskyLog.m21665c("Cannot read device Id: %s", e2);
            }
        }
        return "invalid_sim_id";
    }
}
