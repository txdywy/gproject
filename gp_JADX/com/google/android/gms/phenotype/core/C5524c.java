package com.google.android.gms.phenotype.core;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class C5524c {
    public static final byte[][] f28367a = new byte[0][];
    public static final C5524c f28368b = new C5524c("", null, f28367a, f28367a, f28367a, f28367a, null, null);
    public static final C5525h f28369k = new C5526d();
    public static final C5525h f28370l = new C5527e();
    public static final C5525h f28371m = new C5528f();
    public static final C5525h f28372n = new C5529g();
    public final String f28373c;
    public final byte[] f28374d;
    public final byte[][] f28375e;
    public final byte[][] f28376f;
    public final byte[][] f28377g;
    public final byte[][] f28378h;
    public final int[] f28379i;
    public final byte[][] f28380j;

    public static C5524c m26453a(List list, boolean z) {
        if (list.size() == 1) {
            return (C5524c) list.get(0);
        }
        int i;
        if (!list.isEmpty()) {
            String str = ((C5524c) list.get(0)).f28373c;
            for (C5524c c5524c : list) {
                if (!C5534m.m26476a(str, c5524c.f28373c)) {
                    i = 0;
                    break;
                }
            }
        }
        i = 1;
        String str2 = (i == 0 || list.isEmpty()) ? "" : ((C5524c) list.get(0)).f28373c;
        byte[][] a = (z || i != 0) ? C5524c.m26458a(list, f28369k) : f28367a;
        return new C5524c(str2, null, a, C5524c.m26458a(list, f28370l), C5524c.m26458a(list, f28371m), C5524c.m26458a(list, f28372n), C5524c.m26459b(list), C5524c.m26457a(list));
    }

    public C5524c(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f28373c = str;
        this.f28374d = bArr;
        this.f28375e = bArr2;
        this.f28376f = bArr3;
        this.f28377g = bArr4;
        this.f28378h = bArr5;
        this.f28379i = iArr;
        this.f28380j = bArr6;
    }

    public C5524c(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr) {
        this(str, bArr, bArr2, bArr3, bArr4, bArr5, iArr, null);
    }

    public final C5524c m26462a() {
        String str = this.f28373c;
        byte[] bArr = this.f28374d;
        if (!(bArr == null || bArr.length == 0)) {
            bArr = Arrays.copyOf(bArr, bArr.length);
        }
        byte[][] b = C5524c.m26460b(this.f28375e);
        byte[][] b2 = C5524c.m26460b(this.f28376f);
        byte[][] b3 = C5524c.m26460b(this.f28377g);
        byte[][] b4 = C5524c.m26460b(this.f28378h);
        int[] iArr = this.f28379i;
        if (!(iArr == null || iArr.length == 0)) {
            iArr = Arrays.copyOf(iArr, iArr.length);
        }
        return new C5524c(str, bArr, b, b2, b3, b4, iArr, C5524c.m26460b(this.f28380j));
    }

    private static byte[][] m26460b(byte[][] bArr) {
        if (bArr == null || bArr.length == 0) {
            return bArr;
        }
        byte[][] bArr2 = new byte[bArr.length][];
        int i = 0;
        while (i < bArr.length) {
            if (bArr[i] == null || bArr[i].length == 0) {
                bArr2[i] = bArr[i];
            } else {
                bArr2[i] = Arrays.copyOf(bArr[i], bArr[i].length);
            }
            i++;
        }
        return bArr2;
    }

    public final String toString() {
        String str;
        StringBuilder stringBuilder = new StringBuilder("ExperimentTokens");
        stringBuilder.append("(");
        if (this.f28373c == null) {
            str = "null";
        } else {
            str = this.f28373c;
            str = new StringBuilder(String.valueOf(str).length() + 2).append("'").append(str).append("'").toString();
        }
        stringBuilder.append(str);
        stringBuilder.append(", ");
        byte[] bArr = this.f28374d;
        stringBuilder.append("direct");
        stringBuilder.append("=");
        if (bArr == null) {
            stringBuilder.append("null");
        } else {
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString(bArr, 3));
            stringBuilder.append("'");
        }
        stringBuilder.append(", ");
        C5524c.m26456a(stringBuilder, "GAIA", this.f28375e);
        stringBuilder.append(", ");
        C5524c.m26456a(stringBuilder, "PSEUDO", this.f28376f);
        stringBuilder.append(", ");
        C5524c.m26456a(stringBuilder, "ALWAYS", this.f28377g);
        stringBuilder.append(", ");
        C5524c.m26456a(stringBuilder, "OTHER", this.f28378h);
        stringBuilder.append(", ");
        C5524c.m26455a(stringBuilder, "weak", this.f28379i);
        stringBuilder.append(", ");
        C5524c.m26456a(stringBuilder, "directs", this.f28380j);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    private static void m26456a(StringBuilder stringBuilder, String str, byte[][] bArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (bArr == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("(");
        int length = bArr.length;
        Object obj = 1;
        int i = 0;
        while (i < length) {
            byte[] bArr2 = bArr[i];
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("'");
            stringBuilder.append(Base64.encodeToString(bArr2, 3));
            stringBuilder.append("'");
            i++;
            obj = null;
        }
        stringBuilder.append(")");
    }

    private static void m26455a(StringBuilder stringBuilder, String str, int[] iArr) {
        stringBuilder.append(str);
        stringBuilder.append("=");
        if (iArr == null) {
            stringBuilder.append("null");
            return;
        }
        stringBuilder.append("(");
        int length = iArr.length;
        Object obj = 1;
        int i = 0;
        while (i < length) {
            int i2 = iArr[i];
            if (obj == null) {
                stringBuilder.append(", ");
            }
            stringBuilder.append(i2);
            i++;
            obj = null;
        }
        stringBuilder.append(")");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5524c)) {
            return false;
        }
        C5524c c5524c = (C5524c) obj;
        if (C5534m.m26476a(this.f28373c, c5524c.f28373c) && Arrays.equals(this.f28374d, c5524c.f28374d) && C5534m.m26476a(C5524c.m26461c(this.f28375e), C5524c.m26461c(c5524c.f28375e)) && C5534m.m26476a(C5524c.m26461c(this.f28376f), C5524c.m26461c(c5524c.f28376f)) && C5534m.m26476a(C5524c.m26461c(this.f28377g), C5524c.m26461c(c5524c.f28377g)) && C5534m.m26476a(C5524c.m26461c(this.f28378h), C5524c.m26461c(c5524c.f28378h)) && C5534m.m26476a(C5524c.m26454a(this.f28379i), C5524c.m26454a(c5524c.f28379i)) && C5534m.m26476a(C5524c.m26461c(this.f28380j), C5524c.m26461c(c5524c.f28380j))) {
            return true;
        }
        return false;
    }

    private static List m26461c(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static List m26454a(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        List arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int m26452a(byte[][] bArr) {
        int i = 0;
        if (bArr != null) {
            for (byte[] bArr2 : bArr) {
                if (bArr2 != null) {
                    i += bArr2.length;
                }
            }
        }
        return i;
    }

    public static byte[][] m26457a(List list) {
        int i;
        int i2 = 0;
        for (C5524c c5524c : list) {
            if (!(c5524c == null || c5524c.f28374d == null)) {
                i2++;
            }
            if (c5524c == null || c5524c.f28380j == null) {
                i = i2;
            } else {
                i = c5524c.f28380j.length + i2;
            }
            i2 = i;
        }
        byte[][] bArr = new byte[i2][];
        i2 = 0;
        for (C5524c c5524c2 : list) {
            if (!(c5524c2 == null || c5524c2.f28374d == null)) {
                int i3 = i2 + 1;
                bArr[i2] = c5524c2.f28374d;
                i2 = i3;
            }
            if (c5524c2 == null || c5524c2.f28380j == null) {
                i = i2;
            } else {
                byte[][] bArr2 = c5524c2.f28380j;
                int length = bArr2.length;
                i = i2;
                i2 = 0;
                while (i2 < length) {
                    i3 = i + 1;
                    bArr[i] = bArr2[i2];
                    i2++;
                    i = i3;
                }
            }
            i2 = i;
        }
        return bArr;
    }

    public static int[] m26459b(List list) {
        int i;
        int i2 = 0;
        for (C5524c c5524c : list) {
            if (c5524c == null || c5524c.f28379i == null) {
                i = i2;
            } else {
                i = i2 + c5524c.f28379i.length;
            }
            i2 = i;
        }
        int[] iArr = new int[i2];
        i2 = 0;
        for (C5524c c5524c2 : list) {
            if (!(c5524c2 == null || c5524c2.f28379i == null)) {
                int[] iArr2 = c5524c2.f28379i;
                int length = iArr2.length;
                i = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    iArr[i2] = iArr2[i];
                    i++;
                    i2 = i3;
                }
            }
            i2 = i2;
        }
        return iArr;
    }

    private static byte[][] m26458a(List list, C5525h c5525h) {
        int i;
        int i2 = 0;
        for (C5524c c5524c : list) {
            if (c5524c == null || c5525h.mo5046a(c5524c) == null) {
                i = i2;
            } else {
                i = i2 + c5525h.mo5046a(c5524c).length;
            }
            i2 = i;
        }
        byte[][] bArr = new byte[i2][];
        i2 = 0;
        for (C5524c c5524c2 : list) {
            if (!(c5524c2 == null || c5525h.mo5046a(c5524c2) == null)) {
                byte[][] a = c5525h.mo5046a(c5524c2);
                int length = a.length;
                i = 0;
                while (i < length) {
                    int i3 = i2 + 1;
                    bArr[i2] = a[i];
                    i++;
                    i2 = i3;
                }
            }
            i2 = i2;
        }
        return bArr;
    }
}
