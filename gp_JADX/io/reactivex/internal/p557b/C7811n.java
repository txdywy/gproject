package io.reactivex.internal.p557b;

public final class C7811n {
    public static Object m37615a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int m37612a(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public static int m37614a(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j > j2 ? 1 : 0;
    }

    public static int m37613a(int i, String str) {
        if (i > 0) {
            return i;
        }
        throw new IllegalArgumentException(str + " > 0 required but it was " + i);
    }

    static {
        C7812o c7812o = new C7812o();
    }
}
