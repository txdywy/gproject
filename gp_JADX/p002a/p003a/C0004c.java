package p002a.p003a;

public final class C0004c {
    public static Object m6a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException();
    }

    public static Object m7a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }
}
