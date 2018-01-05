package com.google.common.flogger;

public abstract class C7065m {
    public static final C7065m f34577a = new C7066n();

    public abstract String mo6009a();

    public abstract String mo6010b();

    public abstract int mo6011c();

    public abstract String mo6012d();

    public final String toString() {
        StringBuilder append = new StringBuilder("LogSite{ class=").append(mo6009a()).append(", method=").append(mo6010b()).append(", line=").append(mo6011c());
        if (mo6012d() != null) {
            append.append(", file=").append(mo6012d());
        }
        return append.append(" }").toString();
    }

    @Deprecated
    public static C7065m m32148a(String str, String str2, int i, String str3) {
        return new C7067o(str, str2, i, str3);
    }
}
