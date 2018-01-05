package com.google.common.flogger.backend;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public abstract class C7023n {
    public static String f34503a = "com.google.common.flogger.backend.a.f";
    public static String f34504b = "com.google.common.flogger.backend.google.GooglePlatform";
    public static String f34505c = "com.google.common.flogger.backend.system.DefaultPlatform";
    public static final String[] f34506d = new String[]{f34503a, f34504b, f34505c};

    public abstract C7017j mo5987b(String str);

    public abstract C7025p mo5988b();

    public abstract String mo5989h();

    public static C7025p m32035a() {
        return C7044o.f34549a.mo5988b();
    }

    public static C7017j m32034a(String str) {
        return C7044o.f34549a.mo5987b(str);
    }

    public static boolean m32036a(String str, Level level, boolean z) {
        return C7044o.f34549a.m32043b(str, level, z);
    }

    protected boolean m32043b(String str, Level level, boolean z) {
        return false;
    }

    public static C7047s m32037c() {
        return C7044o.f34549a.m32044d();
    }

    protected C7047s m32044d() {
        return C7047s.f34557a;
    }

    public static long m32038e() {
        return C7044o.f34549a.m32045f();
    }

    protected long m32045f() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public static String m32039g() {
        return C7044o.f34549a.mo5989h();
    }
}
