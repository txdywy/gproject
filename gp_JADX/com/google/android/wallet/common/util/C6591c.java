package com.google.android.wallet.common.util;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public final class C6591c {
    public static boolean m29906a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean m29907a(long[] jArr, long j) {
        if (jArr == null) {
            return false;
        }
        for (long j2 : jArr) {
            if (j2 == j) {
                return true;
            }
        }
        return false;
    }

    public static Object[] m29910a(Object[] objArr, Object obj) {
        if (objArr == null && obj == null) {
            throw new IllegalArgumentException("Cannot generate array of generic type w/o class info");
        }
        Object[] objArr2;
        if (objArr == null) {
            objArr2 = (Object[]) Array.newInstance(obj.getClass(), 1);
        } else {
            objArr2 = Arrays.copyOf(objArr, objArr.length + 1);
        }
        objArr2[objArr2.length - 1] = obj;
        return objArr2;
    }

    public static int[] m29912b(int[] iArr, int i) {
        int[] copyOf = iArr == null ? new int[1] : Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i;
        return copyOf;
    }

    public static Integer[] m29909a(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i = 0; i < length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    public static char[] m29908a(List list) {
        int size = list.size();
        char[] cArr = new char[size];
        for (int i = 0; i < size; i++) {
            cArr[i] = ((Character) list.get(i)).charValue();
        }
        return cArr;
    }

    public static int[] m29911b(List list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }

    public static long[] m29913c(List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }
}
