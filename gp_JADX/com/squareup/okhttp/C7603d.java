package com.squareup.okhttp;

import com.squareup.okhttp.internal.http.C7653e;
import java.util.concurrent.TimeUnit;

public final class C7603d {
    public final boolean f39335a;
    public final boolean f39336b;
    public final int f39337c;
    public final int f39338d;
    public final boolean f39339e;
    public final boolean f39340f;
    public final boolean f39341g;
    public final int f39342h;
    public final int f39343i;
    public final boolean f39344j;
    public final boolean f39345k;
    public String f39346l;

    private C7603d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.f39335a = z;
        this.f39336b = z2;
        this.f39337c = i;
        this.f39338d = i2;
        this.f39339e = z3;
        this.f39340f = z4;
        this.f39341g = z5;
        this.f39342h = i3;
        this.f39343i = i4;
        this.f39344j = z6;
        this.f39345k = z7;
        this.f39346l = str;
    }

    C7603d(C7604e c7604e) {
        this.f39335a = c7604e.f39347a;
        this.f39336b = c7604e.f39348b;
        this.f39337c = c7604e.f39349c;
        this.f39338d = -1;
        this.f39339e = false;
        this.f39340f = false;
        this.f39341g = false;
        this.f39342h = c7604e.f39350d;
        this.f39343i = c7604e.f39351e;
        this.f39344j = c7604e.f39352f;
        this.f39345k = c7604e.f39353g;
    }

    public static C7603d m36670a(C7689v c7689v) {
        String b;
        boolean z = false;
        int i = -1;
        int i2 = -1;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i3 = -1;
        int i4 = -1;
        boolean z5 = false;
        boolean z6 = false;
        Object obj = 1;
        int length = c7689v.f39793a.length / 2;
        int i5 = 0;
        String str = null;
        boolean z7 = false;
        while (i5 < length) {
            boolean z8;
            String a = c7689v.m37013a(i5);
            b = c7689v.m37017b(i5);
            if (a.equalsIgnoreCase("Cache-Control")) {
                if (str != null) {
                    obj = null;
                } else {
                    str = b;
                }
            } else if (a.equalsIgnoreCase("Pragma")) {
                obj = null;
            } else {
                z8 = z7;
                i5++;
                z7 = z8;
            }
            z8 = z7;
            int i6 = 0;
            while (i6 < b.length()) {
                String str2;
                int a2 = C7653e.m36923a(b, i6, "=,;");
                String trim = b.substring(i6, a2).trim();
                if (a2 == b.length() || b.charAt(a2) == ',' || b.charAt(a2) == ';') {
                    i6 = a2 + 1;
                    str2 = null;
                } else {
                    i6 = C7653e.m36922a(b, a2 + 1);
                    String trim2;
                    if (i6 >= b.length() || b.charAt(i6) != '\"') {
                        a2 = C7653e.m36923a(b, i6, ",;");
                        trim2 = b.substring(i6, a2).trim();
                        i6 = a2;
                        str2 = trim2;
                    } else {
                        i6++;
                        a2 = C7653e.m36923a(b, i6, "\"");
                        trim2 = b.substring(i6, a2);
                        i6 = a2 + 1;
                        str2 = trim2;
                    }
                }
                if ("no-cache".equalsIgnoreCase(trim)) {
                    z8 = true;
                } else if ("no-store".equalsIgnoreCase(trim)) {
                    z = true;
                } else if ("max-age".equalsIgnoreCase(trim)) {
                    i = C7653e.m36924b(str2, -1);
                } else if ("s-maxage".equalsIgnoreCase(trim)) {
                    i2 = C7653e.m36924b(str2, -1);
                } else if ("private".equalsIgnoreCase(trim)) {
                    z2 = true;
                } else if ("public".equalsIgnoreCase(trim)) {
                    z3 = true;
                } else if ("must-revalidate".equalsIgnoreCase(trim)) {
                    z4 = true;
                } else if ("max-stale".equalsIgnoreCase(trim)) {
                    i3 = C7653e.m36924b(str2, Integer.MAX_VALUE);
                } else if ("min-fresh".equalsIgnoreCase(trim)) {
                    i4 = C7653e.m36924b(str2, -1);
                } else if ("only-if-cached".equalsIgnoreCase(trim)) {
                    z5 = true;
                } else if ("no-transform".equalsIgnoreCase(trim)) {
                    z6 = true;
                }
            }
            i5++;
            z7 = z8;
        }
        if (obj == null) {
            b = null;
        } else {
            b = str;
        }
        return new C7603d(z7, z, i, i2, z2, z3, z4, i3, i4, z5, z6, b);
    }

    public final String toString() {
        String str = this.f39346l;
        if (str == null) {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.f39335a) {
                stringBuilder.append("no-cache, ");
            }
            if (this.f39336b) {
                stringBuilder.append("no-store, ");
            }
            if (this.f39337c != -1) {
                stringBuilder.append("max-age=").append(this.f39337c).append(", ");
            }
            if (this.f39338d != -1) {
                stringBuilder.append("s-maxage=").append(this.f39338d).append(", ");
            }
            if (this.f39339e) {
                stringBuilder.append("private, ");
            }
            if (this.f39340f) {
                stringBuilder.append("public, ");
            }
            if (this.f39341g) {
                stringBuilder.append("must-revalidate, ");
            }
            if (this.f39342h != -1) {
                stringBuilder.append("max-stale=").append(this.f39342h).append(", ");
            }
            if (this.f39343i != -1) {
                stringBuilder.append("min-fresh=").append(this.f39343i).append(", ");
            }
            if (this.f39344j) {
                stringBuilder.append("only-if-cached, ");
            }
            if (this.f39345k) {
                stringBuilder.append("no-transform, ");
            }
            if (stringBuilder.length() == 0) {
                str = "";
            } else {
                stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length());
                str = stringBuilder.toString();
            }
            this.f39346l = str;
        }
        return str;
    }

    static {
        C7604e c7604e = new C7604e();
        c7604e.f39347a = true;
        c7604e.m36671a();
        C7604e c7604e2 = new C7604e();
        c7604e2.f39352f = true;
        long toSeconds = TimeUnit.SECONDS.toSeconds(2147483647L);
        c7604e2.f39350d = toSeconds > 2147483647L ? Integer.MAX_VALUE : (int) toSeconds;
        c7604e2.m36671a();
    }
}
