package org.chromium.base;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.os.Build.VERSION;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import org.chromium.base.annotations.CalledByNative;
import org.chromium.base.library_loader.LibraryLoader;
import org.chromium.base.metrics.C7899b;
import org.chromium.base.metrics.C7900a;
import org.chromium.base.metrics.RecordHistogram;

public class SysUtils {
    public static Boolean f40500a;
    public static C7900a f40501b = new C7900a("Android.SysUtilsLowEndMatches");

    private SysUtils() {
    }

    private static native void nativeLogPageFaultCountToTracing();

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m37803a() {
        /*
        r0 = "^MemTotal:\\s+([0-9]+) kB$";
        r0 = java.util.regex.Pattern.compile(r0);
        r1 = android.os.StrictMode.allowThreadDiskReads();
        r2 = new java.io.FileReader;	 Catch:{ Exception -> 0x0069 }
        r3 = "/proc/meminfo";
        r2.<init>(r3);	 Catch:{ Exception -> 0x0069 }
        r3 = new java.io.BufferedReader;	 Catch:{ all -> 0x0064 }
        r3.<init>(r2);	 Catch:{ all -> 0x0064 }
    L_0x0016:
        r4 = r3.readLine();	 Catch:{ all -> 0x005f }
        if (r4 != 0) goto L_0x002e;
    L_0x001c:
        r0 = "SysUtils";
        r4 = "/proc/meminfo lacks a MemTotal entry?";
        android.util.Log.w(r0, r4);	 Catch:{ all -> 0x005f }
    L_0x0023:
        r3.close();	 Catch:{ all -> 0x0064 }
        r2.close();	 Catch:{ Exception -> 0x0069 }
        android.os.StrictMode.setThreadPolicy(r1);
    L_0x002c:
        r0 = 0;
    L_0x002d:
        return r0;
    L_0x002e:
        r4 = r0.matcher(r4);	 Catch:{ all -> 0x005f }
        r5 = r4.find();	 Catch:{ all -> 0x005f }
        if (r5 == 0) goto L_0x0016;
    L_0x0038:
        r0 = 1;
        r0 = r4.group(r0);	 Catch:{ all -> 0x005f }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ all -> 0x005f }
        r5 = 1024; // 0x400 float:1.435E-42 double:5.06E-321;
        if (r0 > r5) goto L_0x0075;
    L_0x0045:
        r0 = "SysUtils";
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005f }
        r6 = "Invalid /proc/meminfo total size in kB: ";
        r5.<init>(r6);	 Catch:{ all -> 0x005f }
        r6 = 1;
        r4 = r4.group(r6);	 Catch:{ all -> 0x005f }
        r4 = r5.append(r4);	 Catch:{ all -> 0x005f }
        r4 = r4.toString();	 Catch:{ all -> 0x005f }
        android.util.Log.w(r0, r4);	 Catch:{ all -> 0x005f }
        goto L_0x0023;
    L_0x005f:
        r0 = move-exception;
        r3.close();	 Catch:{ all -> 0x0064 }
        throw r0;	 Catch:{ all -> 0x0064 }
    L_0x0064:
        r0 = move-exception;
        r2.close();	 Catch:{ Exception -> 0x0069 }
        throw r0;	 Catch:{ Exception -> 0x0069 }
    L_0x0069:
        r0 = move-exception;
        r2 = "SysUtils";
        r3 = "Cannot get total physical size from /proc/meminfo";
        android.util.Log.w(r2, r3, r0);	 Catch:{ all -> 0x007f }
        android.os.StrictMode.setThreadPolicy(r1);
        goto L_0x002c;
    L_0x0075:
        r3.close();	 Catch:{ all -> 0x0064 }
        r2.close();	 Catch:{ Exception -> 0x0069 }
        android.os.StrictMode.setThreadPolicy(r1);
        goto L_0x002d;
    L_0x007f:
        r0 = move-exception;
        android.os.StrictMode.setThreadPolicy(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.SysUtils.a():int");
    }

    @CalledByNative
    public static boolean isLowEndDevice() {
        boolean z = true;
        if (f40500a == null) {
            if (!CommandLine.m37786c().m37787a()) {
                if (CommandLine.m37786c().m37787a()) {
                    z = false;
                } else {
                    boolean z2;
                    boolean z3;
                    C7899b c7899b;
                    int a = m37803a();
                    if (a > 0) {
                        if (BuildInfo.m37784a()) {
                            z2 = a / MemoryMappedFileBuffer.DEFAULT_PADDING <= MemoryMappedFileBuffer.DEFAULT_PADDING;
                            if (C7888e.f40514a != null || VERSION.SDK_INT < 19) {
                                z3 = false;
                            } else {
                                z3 = ((ActivityManager) C7888e.f40514a.getSystemService("activity")).isLowRamDevice();
                            }
                            c7899b = f40501b;
                            if (z2 == z3) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            synchronized (C7899b.f40542b) {
                                if (LibraryLoader.f40532a == null || !LibraryLoader.f40532a.f40533b) {
                                    z = false;
                                }
                                if (z) {
                                    RecordHistogram.m37824a(c7899b.c, z3);
                                } else {
                                    c7899b.f40545a.add(Boolean.valueOf(z3));
                                    if (!c7899b.f40544d) {
                                        C7899b.f40542b.add(c7899b);
                                        c7899b.f40544d = true;
                                    }
                                }
                            }
                            z = z2;
                        } else if (a / MemoryMappedFileBuffer.DEFAULT_PADDING <= 512) {
                            z3 = true;
                            z2 = z3;
                            if (C7888e.f40514a != null) {
                            }
                            z3 = false;
                            c7899b = f40501b;
                            if (z2 == z3) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            synchronized (C7899b.f40542b) {
                                z = false;
                                if (z) {
                                    c7899b.f40545a.add(Boolean.valueOf(z3));
                                    if (c7899b.f40544d) {
                                        C7899b.f40542b.add(c7899b);
                                        c7899b.f40544d = true;
                                    }
                                } else {
                                    RecordHistogram.m37824a(c7899b.c, z3);
                                }
                            }
                            z = z2;
                        }
                    }
                    z3 = false;
                    z2 = z3;
                    if (C7888e.f40514a != null) {
                    }
                    z3 = false;
                    c7899b = f40501b;
                    if (z2 == z3) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    synchronized (C7899b.f40542b) {
                        z = false;
                        if (z) {
                            RecordHistogram.m37824a(c7899b.c, z3);
                        } else {
                            c7899b.f40545a.add(Boolean.valueOf(z3));
                            if (c7899b.f40544d) {
                                C7899b.f40542b.add(c7899b);
                                c7899b.f40544d = true;
                            }
                        }
                    }
                    z = z2;
                }
            }
            f40500a = Boolean.valueOf(z);
        }
        return f40500a.booleanValue();
    }

    @CalledByNative
    private static boolean isCurrentlyLowMemory() {
        ActivityManager activityManager = (ActivityManager) C7888e.f40514a.getSystemService("activity");
        MemoryInfo memoryInfo = new MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }
}
