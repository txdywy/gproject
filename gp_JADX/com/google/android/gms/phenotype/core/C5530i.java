package com.google.android.gms.phenotype.core;

import android.util.Base64;
import java.util.Arrays;
import java.util.Comparator;

public final class C5530i implements Comparable {
    public static final Comparator f28381i = new C5531j();
    public final String f28382a;
    public final long f28383b;
    public final boolean f28384c;
    public final double f28385d;
    public final String f28386e;
    public final byte[] f28387f;
    public final int f28388g;
    public final int f28389h;

    private C5530i(String str, long j, boolean z, double d, String str2, byte[] bArr, int i, int i2) {
        this.f28382a = str;
        this.f28383b = j;
        this.f28384c = z;
        this.f28385d = d;
        this.f28386e = str2;
        this.f28387f = bArr;
        this.f28388g = i;
        this.f28389h = i2;
    }

    public C5530i(String str, long j, int i) {
        this(str, j, false, 0.0d, "", new byte[0], 1, i);
    }

    public C5530i(String str, boolean z, int i) {
        this(str, 0, z, 0.0d, "", new byte[0], 2, i);
    }

    public C5530i(String str, double d, int i) {
        this(str, 0, false, d, "", new byte[0], 3, i);
    }

    public C5530i(String str, String str2, int i) {
        this(str, 0, false, 0.0d, str2, new byte[0], 4, i);
    }

    public C5530i(String str, byte[] bArr, int i) {
        this(str, 0, false, 0.0d, "", bArr, 5, i);
    }

    public final long m26469a() {
        if (this.f28388g == 1) {
            return this.f28383b;
        }
        throw new IllegalArgumentException("Not a long type");
    }

    public final boolean m26471b() {
        if (this.f28388g == 2) {
            return this.f28384c;
        }
        throw new IllegalArgumentException("Not a boolean type");
    }

    public final double m26472c() {
        if (this.f28388g == 3) {
            return this.f28385d;
        }
        throw new IllegalArgumentException("Not a double type");
    }

    public final String m26473d() {
        if (this.f28388g == 4) {
            return this.f28386e;
        }
        throw new IllegalArgumentException("Not a String type");
    }

    public final byte[] m26474e() {
        if (this.f28388g == 5) {
            return this.f28387f;
        }
        throw new IllegalArgumentException("Not a bytes type");
    }

    public final String toString() {
        return m26470a(new StringBuilder());
    }

    public final String m26470a(StringBuilder stringBuilder) {
        stringBuilder.append("Flag(");
        stringBuilder.append(this.f28382a);
        stringBuilder.append(", ");
        switch (this.f28388g) {
            case 1:
                stringBuilder.append(this.f28383b);
                break;
            case 2:
                stringBuilder.append(this.f28384c);
                break;
            case 3:
                stringBuilder.append(this.f28385d);
                break;
            case 4:
                stringBuilder.append("'");
                stringBuilder.append(this.f28386e);
                stringBuilder.append("'");
                break;
            case 5:
                if (this.f28387f != null) {
                    stringBuilder.append("'");
                    stringBuilder.append(Base64.encodeToString(this.f28387f, 3));
                    stringBuilder.append("'");
                    break;
                }
                stringBuilder.append("null");
                break;
            default:
                String str = this.f28382a;
                throw new AssertionError(new StringBuilder(String.valueOf(str).length() + 27).append("Invalid type: ").append(str).append(", ").append(this.f28388g).toString());
        }
        stringBuilder.append(", ");
        stringBuilder.append(this.f28388g);
        stringBuilder.append(", ");
        stringBuilder.append(this.f28389h);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5530i)) {
            return false;
        }
        C5530i c5530i = (C5530i) obj;
        if (!C5534m.m26476a(this.f28382a, c5530i.f28382a) || this.f28388g != c5530i.f28388g || this.f28389h != c5530i.f28389h) {
            return false;
        }
        switch (this.f28388g) {
            case 1:
                if (this.f28383b != c5530i.f28383b) {
                    return false;
                }
                return true;
            case 2:
                if (this.f28384c != c5530i.f28384c) {
                    return false;
                }
                return true;
            case 3:
                if (this.f28385d != c5530i.f28385d) {
                    return false;
                }
                return true;
            case 4:
                return C5534m.m26476a(this.f28386e, c5530i.f28386e);
            case 5:
                return Arrays.equals(this.f28387f, c5530i.f28387f);
            default:
                throw new AssertionError("Invalid enum value: " + this.f28388g);
        }
    }

    private static int m26468a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        int i = 0;
        C5530i c5530i = (C5530i) obj;
        int compareTo = this.f28382a.compareTo(c5530i.f28382a);
        if (compareTo != 0) {
            return compareTo;
        }
        compareTo = C5530i.m26468a(this.f28388g, c5530i.f28388g);
        if (compareTo != 0) {
            return compareTo;
        }
        switch (this.f28388g) {
            case 1:
                long j = this.f28383b;
                long j2 = c5530i.f28383b;
                if (j < j2) {
                    return -1;
                }
                if (j != j2) {
                    return 1;
                }
                return 0;
            case 2:
                boolean z = this.f28384c;
                if (z != c5530i.f28384c) {
                    return z ? 1 : -1;
                } else {
                    return 0;
                }
            case 3:
                return Double.compare(this.f28385d, c5530i.f28385d);
            case 4:
                String str = this.f28386e;
                String str2 = c5530i.f28386e;
                if (str == str2) {
                    return 0;
                }
                if (str == null) {
                    return -1;
                }
                if (str2 == null) {
                    return 1;
                }
                return str.compareTo(str2);
            case 5:
                if (this.f28387f == c5530i.f28387f) {
                    return 0;
                }
                if (this.f28387f == null) {
                    return -1;
                }
                if (c5530i.f28387f == null) {
                    return 1;
                }
                while (i < Math.min(this.f28387f.length, c5530i.f28387f.length)) {
                    compareTo = this.f28387f[i] - c5530i.f28387f[i];
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    i++;
                }
                return C5530i.m26468a(this.f28387f.length, c5530i.f28387f.length);
            default:
                throw new AssertionError("Invalid enum value: " + this.f28388g);
        }
    }
}
