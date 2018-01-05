package com.google.android.finsky.as;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build.VERSION;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.C4680k;
import com.google.android.finsky.utils.ba;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public final class C1503a {
    public static Boolean f8175a = null;
    public static Boolean f8176b = null;
    public static Boolean f8177c = null;
    public static Boolean f8178d = null;
    public static final Set f8179j = new HashSet(Arrays.asList(C4680k.m21818a((String) C0955b.eI.m28964b())));
    public static final Set f8180k = new HashSet(Arrays.asList(C4680k.m21818a((String) C0955b.eJ.m28964b())));
    public final boolean f8181e;
    public final boolean f8182f;
    public final boolean f8183g;
    public final boolean f8184h;
    public final boolean f8185i;

    public C1503a(Context context) {
        boolean isLowRamDevice;
        this.f8181e = C1503a.m8833d(context);
        this.f8182f = C1503a.m8830a(context);
        this.f8183g = C1503a.m8831b(context);
        this.f8184h = C1503a.m8832c(context);
        if (VERSION.SDK_INT >= 19) {
            isLowRamDevice = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        } else {
            if (VERSION.SDK_INT >= 16) {
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                MemoryInfo memoryInfo = new MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                if (memoryInfo.totalMem > ((Long) C0955b.f5885c.m28964b()).longValue()) {
                    isLowRamDevice = false;
                }
            }
            isLowRamDevice = true;
        }
        this.f8185i = isLowRamDevice;
    }

    @Deprecated
    public static synchronized boolean m8830a(Context context) {
        boolean z;
        synchronized (C1503a.class) {
            if (f8176b == null) {
                if (context.getPackageManager().hasSystemFeature("android.software.leanback")) {
                    UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
                    if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
                        z = true;
                        f8176b = Boolean.valueOf(z);
                    }
                }
                z = false;
                f8176b = Boolean.valueOf(z);
            }
            z = f8176b.booleanValue();
        }
        return z;
    }

    @Deprecated
    public static synchronized boolean m8831b(Context context) {
        boolean booleanValue;
        synchronized (C1503a.class) {
            if (f8177c == null) {
                f8177c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
            }
            booleanValue = f8177c.booleanValue();
        }
        return booleanValue;
    }

    @Deprecated
    public static synchronized boolean m8832c(Context context) {
        boolean booleanValue;
        synchronized (C1503a.class) {
            if (f8178d == null) {
                f8178d = Boolean.valueOf(context.getPackageManager().hasSystemFeature("org.chromium.arc"));
            }
            booleanValue = f8178d.booleanValue();
        }
        return booleanValue;
    }

    @Deprecated
    public static synchronized boolean m8833d(Context context) {
        boolean booleanValue;
        synchronized (C1503a.class) {
            if (f8175a == null) {
                f8175a = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.automotive"));
            }
            booleanValue = f8175a.booleanValue();
        }
        return booleanValue;
    }

    public static boolean m8829a() {
        boolean z = false;
        for (Object obj : ba.m21790a()) {
            if (f8180k.contains(obj)) {
                return false;
            }
            if (f8179j.contains(obj)) {
                z = true;
            }
        }
        return z;
    }
}
