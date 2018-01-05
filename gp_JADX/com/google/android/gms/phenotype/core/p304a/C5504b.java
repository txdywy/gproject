package com.google.android.gms.phenotype.core.p304a;

import com.google.common.flogger.c;

public final class C5504b {
    public static final c f28328a = c.a("com/google/android/gms/phenotype/core/common/MetricsLogSources");

    public static boolean m26422a(String str) {
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            str = str.substring(0, indexOf);
        }
        return str.endsWith(".metrics");
    }
}
