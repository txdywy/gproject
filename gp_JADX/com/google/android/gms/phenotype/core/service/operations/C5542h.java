package com.google.android.gms.phenotype.core.service.operations;

import com.google.common.flogger.c;

public final class C5542h extends C5535a {
    public static final String[] f28435a = new String[]{"flagType", "name", "intVal", "boolVal", "floatVal", "stringVal", "extensionVal", "packageName", "user", "committed"};

    static boolean m26505a(String str, String str2) {
        if (str.endsWith("*")) {
            return str2.startsWith(str.substring(0, str.length() - 1));
        }
        return str.equals(str2);
    }

    static {
        c.a("com/google/android/gms/phenotype/core/service/operations/ListFlagOverridesOperation");
    }
}
