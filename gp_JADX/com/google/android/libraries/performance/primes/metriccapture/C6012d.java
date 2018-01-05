package com.google.android.libraries.performance.primes.metriccapture;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Debug.MemoryInfo;
import android.os.Process;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.p326c.p327a.C5917b;
import com.google.android.libraries.performance.primes.C5989do;
import d.a.a.a.a.a.aj;
import d.a.a.a.a.a.ak;
import d.a.a.a.a.a.b;
import d.a.a.a.a.a.bf;
import d.a.a.a.a.a.c;
import d.a.a.a.a.a.t;
import java.lang.reflect.Method;
import java.util.Map;

public final class C6012d {
    public static volatile boolean f30072a;
    public static Method f30073b;

    private static Method m27884a() {
        Throwable e;
        if (!f30072a) {
            synchronized (C6012d.class) {
                if (!f30072a) {
                    try {
                        f30073b = MemoryInfo.class.getDeclaredMethod("getOtherPss", new Class[]{Integer.TYPE});
                    } catch (Throwable e2) {
                        C5989do.m27826a("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) not found", e2, new Object[0]);
                    } catch (Exception e3) {
                        e2 = e3;
                        C5989do.m27829c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) failure", e2, new Object[0]);
                    } catch (Error e4) {
                        e2 = e4;
                        C5989do.m27829c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) failure", e2, new Object[0]);
                    }
                    f30072a = true;
                }
            }
        }
        return f30073b;
    }

    private static int m27880a(MemoryInfo memoryInfo) {
        Throwable e;
        Method a = C6012d.m27884a();
        if (a != null) {
            try {
                return ((Integer) a.invoke(memoryInfo, new Object[]{Integer.valueOf(14)})).intValue();
            } catch (Exception e2) {
                e = e2;
                f30073b = null;
                C5989do.m27829c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) invocation failure", e, new Object[0]);
                return -1;
            } catch (Error e3) {
                e = e3;
                f30073b = null;
                C5989do.m27829c("PrimesMemoryCapture", "MemoryInfo.getOtherPss(which) invocation failure", e, new Object[0]);
                return -1;
            }
        }
        return -1;
    }

    private C6012d() {
    }

    public static ak m27881a(int i, int i2, String str, Context context, String str2, boolean z) {
        C5917b.m27414b();
        C5916a.m27406a((Object) context);
        ak akVar = new ak();
        akVar.a = new aj();
        MemoryInfo[] processMemoryInfo = C6016h.m27888a(context).getProcessMemoryInfo(new int[]{i2});
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C6016h.m27888a(context).getMemoryInfo(memoryInfo);
        akVar.a.a = C6012d.m27882a(processMemoryInfo[0], memoryInfo, z);
        akVar.b = new bf();
        bf bfVar = akVar.b;
        c cVar = new c();
        cVar.a = Long.valueOf(Process.getElapsedCpuTime());
        cVar.b = Boolean.valueOf(C6016h.m27890b(context));
        cVar.c = Integer.valueOf(Thread.activeCount());
        if (str != null) {
            cVar.d = str;
        }
        bfVar.a = cVar;
        akVar.d = new t();
        akVar.d.a = Boolean.valueOf(C6016h.m27891c(context));
        akVar.c = i;
        akVar.e = str2;
        return akVar;
    }

    private static b m27882a(MemoryInfo memoryInfo, ActivityManager.MemoryInfo memoryInfo2, boolean z) {
        b bVar = new b();
        bVar.a = Integer.valueOf(memoryInfo.dalvikPss);
        bVar.b = Integer.valueOf(memoryInfo.nativePss);
        bVar.c = Integer.valueOf(memoryInfo.otherPss);
        bVar.d = Integer.valueOf(memoryInfo.dalvikPrivateDirty);
        bVar.e = Integer.valueOf(memoryInfo.nativePrivateDirty);
        bVar.f = Integer.valueOf(memoryInfo.otherPrivateDirty);
        if (VERSION.SDK_INT >= 19) {
            bVar.g = Integer.valueOf(memoryInfo.getTotalPrivateClean());
            bVar.i = Integer.valueOf(memoryInfo.getTotalSwappablePss());
        }
        bVar.h = Integer.valueOf(memoryInfo.getTotalSharedDirty());
        if (VERSION.SDK_INT >= 19) {
            int a = C6012d.m27880a(memoryInfo);
            if (a != -1) {
                bVar.j = Integer.valueOf(a);
            }
        }
        if (VERSION.SDK_INT >= 23 && !z) {
            try {
                Map memoryStats = memoryInfo.getMemoryStats();
                bVar.l = C6012d.m27883a((String) memoryStats.get("summary.code"));
                bVar.m = C6012d.m27883a((String) memoryStats.get("summary.stack"));
                bVar.n = C6012d.m27883a((String) memoryStats.get("summary.graphics"));
                bVar.p = C6012d.m27883a((String) memoryStats.get("summary.system"));
                bVar.k = C6012d.m27883a((String) memoryStats.get("summary.java-heap"));
                bVar.o = C6012d.m27883a((String) memoryStats.get("summary.private-other"));
            } catch (NumberFormatException e) {
                C5989do.m27827a("PrimesMemoryCapture", "failed to collect memory summary stats", new Object[0]);
            }
        }
        bVar.q = Integer.valueOf((int) (memoryInfo2.availMem >> 10));
        bVar.r = Integer.valueOf((int) (memoryInfo2.totalMem >> 20));
        return bVar;
    }

    private static Integer m27883a(String str) {
        return str == null ? null : Integer.valueOf(Integer.parseInt(str));
    }
}
