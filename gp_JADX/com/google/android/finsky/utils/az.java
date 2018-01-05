package com.google.android.finsky.utils;

public final class az implements ay {
    public final String mo4330a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Exception while getting system property %s. Using default %s.", str, str2);
            return str2;
        }
    }

    public final int mo4329a(String str) {
        try {
            return ((Integer) Class.forName("android.os.SystemProperties").getMethod("getInt", new Class[]{String.class, Integer.TYPE}).invoke(null, new Object[]{str, Integer.valueOf(0)})).intValue();
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Exception while getting system property %s. Using default %s.", str, Integer.valueOf(0));
            return 0;
        }
    }
}
