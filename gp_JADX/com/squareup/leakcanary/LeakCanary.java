package com.squareup.leakcanary;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.format.Formatter;
import android.util.Log;
import com.squareup.leakcanary.internal.DisplayLeakActivity;
import com.squareup.leakcanary.internal.HeapAnalyzerService;
import com.squareup.leakcanary.internal.LeakCanaryInternals;

public final class LeakCanary {
    public static RefWatcher install(Application application) {
        return ((AndroidRefWatcherBuilder) refWatcher(application).listenerServiceClass(DisplayLeakService.class).excludedRefs(AndroidExcludedRefs.createAppDefaults().build())).buildAndInstall();
    }

    public static AndroidRefWatcherBuilder refWatcher(Context context) {
        return new AndroidRefWatcherBuilder(context);
    }

    public static void enableDisplayLeakActivity(Context context) {
        LeakCanaryInternals.setEnabled(context, DisplayLeakActivity.class, true);
    }

    public static void setDisplayLeakActivityDirectoryProvider(LeakDirectoryProvider leakDirectoryProvider) {
        DisplayLeakActivity.setLeakDirectoryProvider(leakDirectoryProvider);
    }

    public static String leakInfo(Context context, HeapDump heapDump, AnalysisResult analysisResult, boolean z) {
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        try {
            String valueOf;
            Object obj;
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 0);
            String str = packageInfo.versionName;
            Object stringBuilder = new StringBuilder((String.valueOf(packageName).length() + 18) + String.valueOf(str).length()).append("In ").append(packageName).append(":").append(str).append(":").append(packageInfo.versionCode).append(".\n").toString();
            packageName = "";
            if (analysisResult.leakFound) {
                if (analysisResult.excludedLeak) {
                    stringBuilder = String.valueOf(stringBuilder).concat("* EXCLUDED LEAK.\n");
                }
                valueOf = String.valueOf(stringBuilder);
                str = analysisResult.className;
                stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 2) + String.valueOf(str).length()).append(valueOf).append("* ").append(str).toString();
                if (!heapDump.referenceName.equals("")) {
                    valueOf = String.valueOf(stringBuilder);
                    str = heapDump.referenceName;
                    stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 3) + String.valueOf(str).length()).append(valueOf).append(" (").append(str).append(")").toString();
                }
                valueOf = String.valueOf(stringBuilder);
                str = analysisResult.leakTrace.toString();
                valueOf = String.valueOf(new StringBuilder((String.valueOf(valueOf).length() + 14) + String.valueOf(str).length()).append(valueOf).append(" has leaked:\n").append(str).append("\n").toString());
                str = Formatter.formatShortFileSize(context, analysisResult.retainedHeapSize);
                str = new StringBuilder((String.valueOf(valueOf).length() + 15) + String.valueOf(str).length()).append(valueOf).append("* Retaining: ").append(str).append(".\n").toString();
                if (z) {
                    packageName = "\n* Details:\n";
                    valueOf = String.valueOf(analysisResult.leakTrace.toDetailedString());
                    valueOf = valueOf.length() != 0 ? packageName.concat(valueOf) : new String(packageName);
                    obj = str;
                } else {
                    valueOf = packageName;
                    packageName = str;
                }
            } else if (analysisResult.failure != null) {
                valueOf = String.valueOf(stringBuilder);
                str = Log.getStackTraceString(analysisResult.failure);
                r21 = packageName;
                packageName = new StringBuilder((String.valueOf(valueOf).length() + 11) + String.valueOf(str).length()).append(valueOf).append("* FAILURE:").append(str).append("\n").toString();
                valueOf = r21;
            } else {
                r21 = packageName;
                packageName = String.valueOf(stringBuilder).concat("* NO LEAK FOUND.\n\n");
                valueOf = r21;
            }
            if (z) {
                valueOf = String.valueOf(valueOf);
                str = String.valueOf(heapDump.excludedRefs);
                valueOf = new StringBuilder((String.valueOf(valueOf).length() + 17) + String.valueOf(str).length()).append(valueOf).append("* Excluded Refs:\n").append(str).toString();
            }
            packageName = String.valueOf(obj);
            str = heapDump.referenceKey;
            String str2 = Build.MANUFACTURER;
            String str3 = Build.BRAND;
            String str4 = Build.MODEL;
            String str5 = Build.PRODUCT;
            String str6 = VERSION.RELEASE;
            int i = VERSION.SDK_INT;
            long j = heapDump.watchDurationMs;
            long j2 = heapDump.gcDurationMs;
            return new StringBuilder((((((((String.valueOf(packageName).length() + 218) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(valueOf).length()).append(packageName).append("* Reference Key: ").append(str).append("\n* Device: ").append(str2).append(" ").append(str3).append(" ").append(str4).append(" ").append(str5).append("\n* Android Version: ").append(str6).append(" API: ").append(i).append(" LeakCanary: \n* Durations: watch=").append(j).append("ms, gc=").append(j2).append("ms, heap dump=").append(heapDump.heapDumpDurationMs).append("ms, analysis=").append(analysisResult.analysisDurationMs).append("ms\n").append(valueOf).toString();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean isInAnalyzerProcess(Context context) {
        return LeakCanaryInternals.isInServiceProcess(context, HeapAnalyzerService.class);
    }

    private LeakCanary() {
        throw new AssertionError();
    }
}
