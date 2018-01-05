package com.google.android.finsky.utils;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.List;

public final class C4672c {
    public static List m21803a(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return Collections.emptyList();
        }
        return new C4673d(objArr);
    }

    public static Object[] m21806a(Object[] objArr, Object[] objArr2) {
        if (objArr == null && objArr2 == null) {
            return null;
        }
        if ((objArr == null || objArr.length == 0) && objArr2 != null) {
            return objArr2;
        }
        if ((objArr2 == null || objArr2.length == 0) && objArr != null) {
            return objArr;
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), objArr.length + objArr2.length);
        System.arraycopy(objArr, 0, objArr3, 0, objArr.length);
        System.arraycopy(objArr2, 0, objArr3, objArr.length, objArr2.length);
        return objArr3;
    }

    public static Object[] m21807a(Object[][] objArr) {
        int i = 0;
        for (Object[] objArr2 : objArr) {
            if (objArr2 == null) {
                throw new IllegalArgumentException("Cannot flatten inner array of null");
            }
            i += objArr2.length;
        }
        Object[] objArr3 = (Object[]) Array.newInstance(objArr[0].getClass().getComponentType(), i);
        i = 0;
        for (Object obj : objArr) {
            if (obj.length != 0) {
                System.arraycopy(obj, 0, objArr3, i, obj.length);
                i += obj.length;
            }
        }
        return objArr3;
    }

    public static Object[] m21805a(Object[] objArr, int i) {
        if (i < 0 || i >= objArr.length) {
            throw new ArrayIndexOutOfBoundsException(i);
        }
        int length = objArr.length - 1;
        Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), length);
        if (i != 0) {
            System.arraycopy(objArr, 0, objArr2, 0, i);
        }
        length -= i;
        if (length > 0) {
            System.arraycopy(objArr, i + 1, objArr2, i, length);
        }
        return objArr2;
    }

    public static boolean m21804a(Object[] objArr, Object obj) {
        for (Object equals : objArr) {
            if (obj.equals(equals)) {
                return true;
            }
        }
        return false;
    }
}
