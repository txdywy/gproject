package com.google.android.libraries.bind.p324c;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class C5875b {
    public static Map f29390a = new ConcurrentHashMap();
    public static C5874a f29391b = new C5876c();
    public static boolean f29392e;
    public String f29393c;
    public boolean f29394d;

    public static C5875b m27305a(Class cls) {
        String simpleName = cls.getSimpleName();
        if (f29390a.containsKey(simpleName)) {
            return (C5875b) f29390a.get(simpleName);
        }
        C5875b c5875b = new C5875b(simpleName);
        f29390a.put(simpleName, c5875b);
        return c5875b;
    }

    private C5875b(String str) {
        this.f29393c = str;
    }

    public final boolean m27308a() {
        return this.f29394d || f29392e;
    }

    public final void m27307a(String str, Object... objArr) {
        if (m27308a()) {
            f29391b.mo5179a(3, this.f29393c, C5875b.m27306b(str, objArr));
        }
    }

    public static String m27306b(String str, Object... objArr) {
        String format = (str == null || objArr == null || objArr.length == 0) ? str : String.format(str, objArr);
        if (format == null) {
            return "";
        }
        return format;
    }
}
