package com.google.android.finsky.as;

import android.app.ActivityManager;
import android.app.ActivityManager$MemoryInfo;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build$VERSION;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.utils.ba;
import com.google.android.finsky.utils.k;
import com.google.android.play.utils.b.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public static synchronized class com.google.android.finsky.as.a
{

    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static final Set j;
    public static final Set k;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    static {
        com.google.android.finsky.as.a.a = 0;
        com.google.android.finsky.as.a.b = 0;
        com.google.android.finsky.as.a.c = 0;
        com.google.android.finsky.as.a.d = 0;
        com.google.android.finsky.as.a.j = new HashSet(Arrays.asList(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.eI.b())));
        com.google.android.finsky.as.a.k = new HashSet(Arrays.asList(com.google.android.finsky.utils.k.a((String)com.google.android.finsky.aa.b.eJ.b())));
    }

    a(Context p0) {
        this.e = com.google.android.finsky.as.a.d(p0);
        this.f = com.google.android.finsky.as.a.a(p0);
        this.g = com.google.android.finsky.as.a.b(p0);
        this.h = com.google.android.finsky.as.a.c(p0);
        if (Build$VERSION.SDK_INT >= 19)
            v0 = ((ActivityManager)p0.getSystemService("activity")).isLowRamDevice();
        else if (Build$VERSION.SDK_INT >= 16) {
            v1 = new ActivityManager$MemoryInfo();
            ((ActivityManager)p0.getSystemService("activity")).getMemoryInfo(v1);
            if (v1.totalMem > ((Long)com.google.android.finsky.aa.b.c.b()).longValue())
                v0 = 0;
            else
                v0 = 1;
        }
        else
            v0 = 1;
        this.i = v0;
    }

    public static boolean a() {
        v3 = com.google.android.finsky.utils.ba.a();
        v2 = 0;
        v0 = 0;
        while (true) {
            if (v2 >= v3.length)
                return v0;
            if (com.google.android.finsky.as.a.k.contains(v3[v2]))
                break;
            if (com.google.android.finsky.as.a.j.contains(v3[v2]))
                v0 = 1;
            v2 = v2 + 1;
        }
        v0 = 0;
        return v0;
    }

    public static synchronized boolean a(Context p0) {
  2:    enter com.google.android.finsky.as.a;
  5:    if (com.google.android.finsky.as.a.b != 0) {
 50:        exit com.google.android.finsky.as.a;
 51:        return com.google.android.finsky.as.a.b.booleanValue();
        }
 18:    if (!p0.getPackageManager().hasSystemFeature("android.software.leanback")) goto 55;
 26:    v0 = (UiModeManager)p0.getSystemService("uimode");
 28:    if (v0 == 0) goto 55;
 35:    if (v0.getCurrentModeType() != 4) goto 55;
 37:    v0 = 1;
 42:    com.google.android.finsky.as.a.b = Boolean.valueOf(v0);
 50:    exit com.google.android.finsky.as.a;
 51:    return com.google.android.finsky.as.a.b.booleanValue();
 53:    exit com.google.android.finsky.as.a;
 54:    throw ex;
 55:    v0 = 0;
 56:    goto 38;
 57:    try
            run 3...49
        catch (Throwable ex) {
  3:        goto 52;
        }
    }

    public static synchronized boolean b(Context p0) {
        enter com.google.android.finsky.as.a;
        try {
            if (com.google.android.finsky.as.a.c == 0)
                com.google.android.finsky.as.a.c = Boolean.valueOf(p0.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.as.a;
            throw ex;
        }
        exit com.google.android.finsky.as.a;
        return com.google.android.finsky.as.a.c.booleanValue();
    }

    public static synchronized boolean c(Context p0) {
        enter com.google.android.finsky.as.a;
        try {
            if (com.google.android.finsky.as.a.d == 0)
                com.google.android.finsky.as.a.d = Boolean.valueOf(p0.getPackageManager().hasSystemFeature("org.chromium.arc"));
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.as.a;
            throw ex;
        }
        exit com.google.android.finsky.as.a;
        return com.google.android.finsky.as.a.d.booleanValue();
    }

    public static synchronized boolean d(Context p0) {
        enter com.google.android.finsky.as.a;
        try {
            if (com.google.android.finsky.as.a.a == 0)
                com.google.android.finsky.as.a.a = Boolean.valueOf(p0.getPackageManager().hasSystemFeature("android.hardware.type.automotive"));
        }
        catch (Throwable ex) {
            exit com.google.android.finsky.as.a;
            throw ex;
        }
        exit com.google.android.finsky.as.a;
        return com.google.android.finsky.as.a.a.booleanValue();
    }

}
