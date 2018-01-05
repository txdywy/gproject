package com.google.android.finsky.ak;

public class C1214p {
    public static String m7188a(int i) {
        int i2 = 0;
        if (i == 0) {
            return null;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String canonicalName = C1214p.class.getCanonicalName();
        canonicalName = canonicalName.substring(0, canonicalName.lastIndexOf(".") + 1);
        while (i2 < stackTrace.length && stackTrace[i2].getClassName().startsWith(canonicalName)) {
            i2++;
        }
        int min = Math.min(stackTrace.length, i2 + i);
        StringBuilder stringBuilder = new StringBuilder();
        while (i2 < min) {
            stringBuilder.append(stackTrace[i2]);
            stringBuilder.append("\n");
            i2++;
        }
        return stringBuilder.toString();
    }
}
