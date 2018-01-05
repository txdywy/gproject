package p526e;

final class C7741x {
    public static C7740w f40228a;
    public static long f40229b;

    private C7741x() {
    }

    static C7740w m37488a() {
        synchronized (C7741x.class) {
            if (f40228a != null) {
                C7740w c7740w = f40228a;
                f40228a = c7740w.f40226f;
                c7740w.f40226f = null;
                f40229b -= 8192;
                return c7740w;
            }
            return new C7740w();
        }
    }

    static void m37489a(C7740w c7740w) {
        if (c7740w.f40226f != null || c7740w.f40227g != null) {
            throw new IllegalArgumentException();
        } else if (!c7740w.f40224d) {
            synchronized (C7741x.class) {
                if (f40229b + 8192 > 65536) {
                    return;
                }
                f40229b += 8192;
                c7740w.f40226f = f40228a;
                c7740w.f40223c = 0;
                c7740w.f40222b = 0;
                f40228a = c7740w;
            }
        }
    }
}
