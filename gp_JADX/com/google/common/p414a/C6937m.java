package com.google.common.p414a;

public final class C6937m {
    public static void m31630a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void m31633a(boolean z, String str, long j) {
        if (!z) {
            throw new IllegalArgumentException(C6937m.m31628a(str, Long.valueOf(j)));
        }
    }

    public static void m31635b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void m31631a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void m31632a(boolean z, String str, int i, int i2) {
        if (!z) {
            throw new IllegalStateException(C6937m.m31628a(str, Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static Object m31623a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static Object m31624a(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public static Object m31625a(Object obj, String str, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(C6937m.m31628a(str, Integer.valueOf(i)));
    }

    public static Object m31626a(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(C6937m.m31628a(str, obj2));
    }

    public static int m31622a(int i, int i2) {
        String str = "index";
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            str = C6937m.m31628a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            str = C6937m.m31628a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(str);
    }

    public static int m31634b(int i, int i2) {
        String str = "index";
        if (i >= 0 && i <= i2) {
            return i;
        }
        throw new IndexOutOfBoundsException(C6937m.m31627a(i, i2, str));
    }

    private static String m31627a(int i, int i2, String str) {
        if (i < 0) {
            return C6937m.m31628a("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        } else {
            return C6937m.m31628a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
    }

    public static void m31629a(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            String a;
            if (i < 0 || i > i3) {
                a = C6937m.m31627a(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                a = C6937m.m31627a(i2, i3, "end index");
            } else {
                a = C6937m.m31628a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(a);
        }
    }

    public static String m31628a(String str, Object... objArr) {
        int i = 0;
        CharSequence valueOf = String.valueOf(str);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + (objArr.length * 16));
        int i2 = 0;
        while (i < objArr.length) {
            int indexOf = valueOf.indexOf("%s", i2);
            if (indexOf == -1) {
                break;
            }
            stringBuilder.append(valueOf, i2, indexOf);
            i2 = i + 1;
            stringBuilder.append(objArr[i]);
            int i3 = i2;
            i2 = indexOf + 2;
            i = i3;
        }
        stringBuilder.append(valueOf, i2, valueOf.length());
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
