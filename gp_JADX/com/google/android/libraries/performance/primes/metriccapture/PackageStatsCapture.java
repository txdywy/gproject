package com.google.android.libraries.performance.primes.metriccapture;

import android.content.Context;
import android.content.pm.IPackageStatsObserver;
import android.content.pm.IPackageStatsObserver.Stub;
import android.content.pm.PackageManager;
import android.content.pm.PackageStats;
import android.os.Process;
import com.google.android.libraries.p326c.p327a.C5917b;
import com.google.android.libraries.performance.primes.C5989do;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public final class PackageStatsCapture {
    public static final PackageStatsInvocation[] GETTER_INVOCATIONS;

    final class PackageStatsCallback extends Stub {
        public final Semaphore f30066a = new Semaphore(1);
        public volatile PackageStats f30067b;

        PackageStatsCallback() {
        }

        public final void onGetStatsCompleted(PackageStats packageStats, boolean z) {
            if (z) {
                String valueOf = String.valueOf(packageStats);
                C5989do.m27824a(3, "PackageStatsCapture", new StringBuilder(String.valueOf(valueOf).length() + 30).append("Success getting PackageStats: ").append(valueOf).toString(), new Object[0]);
                this.f30067b = packageStats;
            } else {
                C5989do.m27824a(5, "PackageStatsCapture", "Failure getting PackageStats", new Object[0]);
            }
            this.f30066a.release();
        }
    }

    abstract class PackageStatsInvocation {
        public final String f30068a;
        public final Class[] f30069b;

        PackageStatsInvocation(String str, Class[] clsArr) {
            this.f30068a = str;
            this.f30069b = clsArr;
        }

        abstract Object[] mo5260a(String str, int i, IPackageStatsObserver iPackageStatsObserver);

        boolean invoke(PackageManager packageManager, String str, int i, IPackageStatsObserver iPackageStatsObserver) {
            Object e;
            StringBuilder stringBuilder;
            try {
                packageManager.getClass().getMethod(this.f30068a, this.f30069b).invoke(packageManager, mo5260a(str, i, iPackageStatsObserver));
                return true;
            } catch (Throwable e2) {
                C5989do.m27826a("PackageStatsCapture", "PackageStats getter not found", e2, new Object[0]);
                return false;
            } catch (Exception e3) {
                e = e3;
                stringBuilder = new StringBuilder();
                stringBuilder.append(e.getClass().getSimpleName()).append(" for ").append(this.f30068a).append('(').append(Arrays.asList(this.f30069b)).append(") invocation");
                C5989do.m27824a(4, "PackageStatsCapture", stringBuilder.toString(), new Object[0]);
                return false;
            } catch (Error e4) {
                e = e4;
                stringBuilder = new StringBuilder();
                stringBuilder.append(e.getClass().getSimpleName()).append(" for ").append(this.f30068a).append('(').append(Arrays.asList(this.f30069b)).append(") invocation");
                C5989do.m27824a(4, "PackageStatsCapture", stringBuilder.toString(), new Object[0]);
                return false;
            }
        }
    }

    private PackageStatsCapture() {
    }

    private static boolean m27872a() {
        Throwable e;
        try {
            if (Modifier.isAbstract(PackageStatsCallback.class.getMethod("onGetStatsCompleted", new Class[]{PackageStats.class, Boolean.TYPE}).getModifiers())) {
                return false;
            }
            return true;
        } catch (Exception e2) {
            e = e2;
            C5989do.m27826a("PackageStatsCapture", "failure", e, new Object[0]);
            return false;
        } catch (Error e3) {
            e = e3;
            C5989do.m27826a("PackageStatsCapture", "failure", e, new Object[0]);
            return false;
        }
    }

    static PackageStats getPackageStatsUsingInternalAPI(Context context, long j, PackageStatsInvocation... packageStatsInvocationArr) {
        int i = 0;
        if (m27872a()) {
            PackageStatsCallback packageStatsCallback = new PackageStatsCallback();
            try {
                packageStatsCallback.f30066a.acquire();
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                int myUid = Process.myUid();
                int length = packageStatsInvocationArr.length;
                while (i < length) {
                    if (packageStatsInvocationArr[i].invoke(packageManager, packageName, myUid, packageStatsCallback)) {
                        C5989do.m27824a(4, "PackageStatsCapture", "Success invoking PackageStats capture.", new Object[0]);
                        if (packageStatsCallback.f30066a.tryAcquire(j, TimeUnit.MILLISECONDS)) {
                            return packageStatsCallback.f30067b;
                        }
                        C5989do.m27824a(5, "PackageStatsCapture", "Timeout while waiting for PackageStats callback", new Object[0]);
                        return null;
                    }
                    i++;
                }
                C5989do.m27824a(5, "PackageStatsCapture", "Couldn't capture PackageStats.", new Object[0]);
                return null;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return null;
            }
        }
        C5989do.m27824a(5, "PackageStatsCapture", "Callback implementation stripped by proguard.", new Object[0]);
        return null;
    }

    public static PackageStats getPackageStats(Context context) {
        Object obj = null;
        C5917b.m27414b();
        if (context.getPackageManager().checkPermission("android.permission.GET_PACKAGE_SIZE", context.getPackageName()) == 0 || context.checkCallingOrSelfPermission("android.permission.GET_PACKAGE_SIZE") == 0) {
            obj = 1;
        }
        if (obj != null) {
            return getPackageStatsUsingInternalAPI(context, 15000, GETTER_INVOCATIONS);
        }
        C5989do.m27824a(5, "PackageStatsCapture", "android.permission.GET_PACKAGE_SIZE required", new Object[0]);
        return null;
    }

    static {
        r0 = new PackageStatsInvocation[3];
        r0[0] = new C6013e("getPackageSizeInfo", new Class[]{String.class, IPackageStatsObserver.class});
        r0[1] = new C6014f("getPackageSizeInfo", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class});
        r0[2] = new C6015g("getPackageSizeInfoAsUser", new Class[]{String.class, Integer.TYPE, IPackageStatsObserver.class});
        GETTER_INVOCATIONS = r0;
    }
}
