package com.google.android.libraries.p326c.p327a;

public final class C5916a {
    public static void m27408a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m27409a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void m27410b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m27411b(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object m27406a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static String m27407a(String str, Object... objArr) {
        int i = 0;
        String valueOf = String.valueOf(str);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(valueOf.substring(i2, indexOf));
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            int i3 = i2;
            i2 = indexOf + 2;
            i = i3;
        }
        stringBuilder.append(valueOf.substring(i2));
        if (i < objArr.length) {
            stringBuilder.append(" [");
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            i = i2;
            while (i < objArr.length) {
                stringBuilder.append(", ");
                i2 = i + 1;
                stringBuilder.append(objArr[i]);
                i = i2;
            }
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }
}
