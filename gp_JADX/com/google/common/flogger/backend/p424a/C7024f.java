package com.google.common.flogger.backend.p424a;

import android.os.Build;
import android.util.Log;
import com.google.common.flogger.backend.C7017j;
import com.google.common.flogger.backend.C7023n;
import com.google.common.flogger.backend.C7025p;
import dalvik.system.VMStack;

public final class C7024f extends C7023n {
    public static final boolean f34507e = C7027h.m32059a();
    public static final boolean f34508f;
    public static final C7025p f34509g = new C7026g();

    static boolean m32047j() {
        boolean z = false;
        try {
            Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", new Class[0]);
            z = C7027h.class.getName().equals(C7024f.m32048k());
        } catch (Throwable th) {
        }
        return z;
    }

    static String m32048k() {
        try {
            return VMStack.getStackClass2().getName();
        } catch (Throwable th) {
            return null;
        }
    }

    static Class m32049l() {
        return VMStack.getStackClass2();
    }

    protected final C7025p mo5988b() {
        return f34509g;
    }

    protected final C7017j mo5987b(String str) {
        if (C7028i.f34510b.get() != null) {
            return ((C7021e) C7028i.f34510b.get()).mo5986a(str);
        }
        C7017j c7028i = new C7028i(str.replace('$', '.'));
        C7029j.f34515a.offer(c7028i);
        if (C7028i.f34510b.get() == null) {
            return c7028i;
        }
        C7028i.m32060b();
        return c7028i;
    }

    protected final String mo5989h() {
        return "platform: Android";
    }

    static {
        boolean z = Build.FINGERPRINT == null || "robolectric".equals(Build.FINGERPRINT);
        f34508f = z;
        Log.class.getName();
    }
}
