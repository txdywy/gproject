package com.google.android.libraries.performance.primes;

import android.content.Context;

public final class ei {
    public static dj m27843a(Context context) {
        at atVar = new at();
        String packageName = context.getPackageName();
        boolean a = atVar.m27648a(context, new StringBuilder(String.valueOf(packageName).length() + 32).append("primes:").append(packageName).append(":enable_leak_detection_v2").toString(), false);
        boolean a2 = atVar.m27648a(context, new StringBuilder(String.valueOf(packageName).length() + 29).append("primes:").append(packageName).append(":enable_leak_detection").toString(), false);
        boolean a3 = atVar.m27648a(context, "primes:disable_memory_summary_metrics", false);
        boolean a4 = atVar.m27648a(context, new StringBuilder(String.valueOf(packageName).length() + 33).append("primes:").append(packageName).append(":enable_battery_experiment").toString(), false);
        boolean a5 = atVar.m27648a(context, new StringBuilder(String.valueOf(packageName).length() + 28).append("primes:").append(packageName).append(":enable_magic_eye_log").toString(), false);
        boolean a6 = atVar.m27648a(context, new StringBuilder(String.valueOf(packageName).length() + 34).append("primes:").append(packageName).append(":enable_persist_crash_stats").toString(), atVar.m27648a(context, "primes:enable_persist_crash_stats", false));
        boolean a7 = atVar.m27648a(context, new StringBuilder(String.valueOf(packageName).length() + 28).append("primes:").append(packageName).append(":enable_startup_trace").toString(), true);
        atVar.m27648a(context, new StringBuilder(String.valueOf(packageName).length() + 36).append("primes:").append(packageName).append(":enable_url_auto_sanitization").toString(), false);
        boolean a8 = atVar.m27648a(context, new StringBuilder(String.valueOf(packageName).length() + 29).append("primes:").append(packageName).append(":enable_mini_heap_dump").toString(), false);
        float a9 = atVar.m27647a(context, new StringBuilder(String.valueOf(packageName).length() + 43).append("primes:").append(packageName).append(":mini_heap_dump_percentile_threshold").toString());
        dk dkVar = new dk();
        dkVar.f29962a = a2;
        dkVar.f29963b = a;
        dkVar.f29964c = a3;
        dkVar.f29965d = a4;
        dkVar.f29966e = a5;
        dkVar.f29967f = a6;
        dkVar.f29968g = a7;
        dkVar.f29969h = a8;
        dkVar.f29970i = a9;
        return new dj(dkVar.f29962a, dkVar.f29963b, dkVar.f29964c, dkVar.f29965d, dkVar.f29966e, dkVar.f29967f, dkVar.f29968g, dkVar.f29969h, dkVar.f29970i);
    }
}
