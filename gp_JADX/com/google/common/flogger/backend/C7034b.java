package com.google.common.flogger.backend;

import com.google.common.flogger.parser.ParseException;

public final class C7034b {
    public static final long f34535a;
    public static final C7034b f34536b = new C7034b(0, -1, -1);
    public final int f34537c;
    public final int f34538d;
    public final int f34539e;

    private static int m32069a(char c) {
        return ((int) ((f34535a >>> ((c - 32) * 3)) & 7)) - 1;
    }

    public static C7034b m32072a() {
        if (C7034b.m32074b(16, false)) {
            return new C7034b(16, -1, -1);
        }
        String str = "invalid flags: 0x";
        String valueOf = String.valueOf(Integer.toHexString(16));
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public static C7034b m32073a(String str, int i, int i2, boolean z) {
        if (i == i2 && !z) {
            return f34536b;
        }
        int i3 = z ? 128 : 0;
        while (i != i2) {
            int i4 = i + 1;
            char charAt = str.charAt(i);
            int i5;
            int i6;
            if (charAt < ' ' || charAt > '0') {
                int i7 = i4 - 1;
                if (charAt > '9') {
                    throw ParseException.m32161a("invalid flag", str, i7);
                }
                int i8 = charAt - 48;
                i5 = i4;
                i4 = i8;
                while (i5 != i2) {
                    i6 = i5 + 1;
                    charAt = str.charAt(i5);
                    if (charAt == '.') {
                        return new C7034b(i3, i4, C7034b.m32070a(str, i6, i2));
                    }
                    charAt = (char) (charAt - 48);
                    if (charAt >= '\n') {
                        throw ParseException.m32161a("invalid width character", str, i6 - 1);
                    }
                    i5 = charAt + (i4 * 10);
                    if (i5 > 999999) {
                        throw ParseException.m32162a("width too large", str, i7, i2);
                    }
                    i4 = i5;
                    i5 = i6;
                }
                return new C7034b(i3, i4, -1);
            }
            i6 = C7034b.m32069a(charAt);
            if (i6 >= 0) {
                i5 = 1 << i6;
                if ((i3 & i5) != 0) {
                    throw ParseException.m32161a("repeated flag", str, i4 - 1);
                }
                i3 = i5 | i3;
                i = i4;
            } else if (charAt == '.') {
                return new C7034b(i3, -1, C7034b.m32070a(str, i4, i2));
            } else {
                throw ParseException.m32161a("invalid flag", str, i4 - 1);
            }
        }
        return new C7034b(i3, -1, -1);
    }

    private static int m32070a(String str, int i, int i2) {
        if (i == i2) {
            throw ParseException.m32161a("missing precision", str, i - 1);
        }
        int i3 = 0;
        for (int i4 = i; i4 < i2; i4++) {
            char charAt = (char) (str.charAt(i4) - 48);
            if (charAt >= '\n') {
                throw ParseException.m32161a("invalid precision character", str, i4);
            }
            i3 = (i3 * 10) + charAt;
            if (i3 > 999999) {
                throw ParseException.m32162a("precision too large", str, i, i2);
            }
        }
        if (i3 != 0 || i2 == i + 1) {
            return i3;
        }
        throw ParseException.m32162a("invalid precision", str, i, i2);
    }

    static int m32071a(String str, boolean z) {
        int i;
        int i2 = 0;
        if (z) {
            i = 128;
        } else {
            i = 0;
        }
        while (i2 < str.length()) {
            int a = C7034b.m32069a(str.charAt(i2));
            if (a < 0) {
                String str2 = "invalid flags: ";
                String valueOf = String.valueOf(str);
                throw new IllegalArgumentException(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
            }
            i |= 1 << a;
            i2++;
        }
        return i;
    }

    C7034b(int i, int i2, int i3) {
        this.f34537c = i;
        this.f34538d = i2;
        this.f34539e = i3;
    }

    public final boolean m32077b() {
        return this == f34536b;
    }

    public final boolean m32076a(int i, boolean z) {
        boolean z2 = true;
        if (m32077b()) {
            return true;
        }
        if ((this.f34537c & (i ^ -1)) != 0) {
            return false;
        }
        if (!z && this.f34539e != -1) {
            return false;
        }
        int i2 = this.f34537c;
        if (this.f34538d == -1) {
            z2 = false;
        }
        return C7034b.m32074b(i2, z2);
    }

    private static boolean m32074b(int i, boolean z) {
        if ((i & 9) == 9 || (i & 96) == 96) {
            return false;
        }
        if ((i & 96) == 0 || z) {
            return true;
        }
        return false;
    }

    public final boolean m32078c() {
        return (this.f34537c & 128) != 0;
    }

    public final StringBuilder m32075a(StringBuilder stringBuilder) {
        if (!m32077b()) {
            int i = this.f34537c & -129;
            for (int i2 = 0; (1 << i2) <= i; i2++) {
                if (((1 << i2) & i) != 0) {
                    stringBuilder.append(" #(+,-0".charAt(i2));
                }
            }
            if (this.f34538d != -1) {
                stringBuilder.append(this.f34538d);
            }
            if (this.f34539e != -1) {
                stringBuilder.append('.').append(this.f34539e);
            }
        }
        return stringBuilder;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7034b)) {
            return false;
        }
        C7034b c7034b = (C7034b) obj;
        if (c7034b.f34537c == this.f34537c && c7034b.f34538d == this.f34538d && c7034b.f34539e == this.f34539e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f34537c * 31) + this.f34538d) * 31) + this.f34539e;
    }

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (((long) i) + 1) << ((int) (((long) (" #(+,-0".charAt(i) - 32)) * 3));
        }
        f34535a = j;
    }
}
