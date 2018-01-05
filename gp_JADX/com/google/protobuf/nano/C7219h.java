package com.google.protobuf.nano;

import java.nio.charset.Charset;
import java.util.Arrays;

public final class C7219h {
    public static final Charset f35464a = Charset.forName("UTF-8");
    public static final Object f35465b = new Object();

    public static boolean m33614a(int[] iArr, int[] iArr2) {
        if (iArr == null || iArr.length == 0) {
            return iArr2 == null || iArr2.length == 0;
        } else {
            return Arrays.equals(iArr, iArr2);
        }
    }

    public static boolean m33615a(long[] jArr, long[] jArr2) {
        if (jArr == null || jArr.length == 0) {
            return jArr2 == null || jArr2.length == 0;
        } else {
            return Arrays.equals(jArr, jArr2);
        }
    }

    public static boolean m33613a(double[] dArr, double[] dArr2) {
        if (dArr == null || dArr.length == 0) {
            return dArr2 == null || dArr2.length == 0;
        } else {
            return Arrays.equals(dArr, dArr2);
        }
    }

    public static boolean m33617a(boolean[] zArr, boolean[] zArr2) {
        if (zArr == null || zArr.length == 0) {
            return zArr2 == null || zArr2.length == 0;
        } else {
            return Arrays.equals(zArr, zArr2);
        }
    }

    public static boolean m33618a(byte[][] bArr, byte[][] bArr2) {
        boolean length = bArr == null ? false : bArr.length;
        int length2 = bArr2 == null ? 0 : bArr2.length;
        int i = 0;
        boolean z = false;
        while (true) {
            if (z >= length || bArr[z] != null) {
                boolean z2;
                int i2 = i;
                while (i2 < length2 && bArr2[i2] == null) {
                    i2++;
                }
                boolean z3 = z >= length;
                if (i2 >= length2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3 && z2) {
                    return true;
                }
                if (z3 != z2 || !Arrays.equals(bArr[z], bArr2[i2])) {
                    return false;
                }
                i = i2 + 1;
                z++;
            } else {
                z++;
            }
        }
    }

    public static boolean m33616a(Object[] objArr, Object[] objArr2) {
        boolean length = objArr == null ? false : objArr.length;
        int length2 = objArr2 == null ? 0 : objArr2.length;
        int i = 0;
        boolean z = false;
        while (true) {
            if (z >= length || objArr[z] != null) {
                boolean z2;
                int i2 = i;
                while (i2 < length2 && objArr2[i2] == null) {
                    i2++;
                }
                boolean z3 = z >= length;
                if (i2 >= length2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z3 && z2) {
                    return true;
                }
                if (z3 != z2 || !objArr[z].equals(objArr2[i2])) {
                    return false;
                }
                i = i2 + 1;
                z++;
            } else {
                z++;
            }
        }
    }

    public static int m33607a(int[] iArr) {
        return (iArr == null || iArr.length == 0) ? 0 : Arrays.hashCode(iArr);
    }

    public static int m33608a(long[] jArr) {
        return (jArr == null || jArr.length == 0) ? 0 : Arrays.hashCode(jArr);
    }

    public static int m33606a(double[] dArr) {
        return (dArr == null || dArr.length == 0) ? 0 : Arrays.hashCode(dArr);
    }

    public static int m33610a(boolean[] zArr) {
        return (zArr == null || zArr.length == 0) ? 0 : Arrays.hashCode(zArr);
    }

    public static int m33611a(byte[][] bArr) {
        int i = 0;
        int length = bArr == null ? 0 : bArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            byte[] bArr2 = bArr[i2];
            if (bArr2 != null) {
                i = (i * 31) + Arrays.hashCode(bArr2);
            }
        }
        return i;
    }

    public static int m33609a(Object[] objArr) {
        int i = 0;
        int length = objArr == null ? 0 : objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = objArr[i2];
            if (obj != null) {
                i = (i * 31) + obj.hashCode();
            }
        }
        return i;
    }

    public static void m33612a(b bVar, b bVar2) {
        if (bVar.aO != null) {
            bVar2.aO = (C7216e) bVar.aO.clone();
        }
    }

    static {
        Charset.forName("ISO-8859-1");
    }
}
