package com.google.android.instantapps.p309a.p310a;

import android.os.Binder;
import android.util.Log;
import com.google.android.instantapps.p309a.C5699f;

public abstract class C5686a {
    public static final Object f28842a = new Object();
    public static C5691f f28843b = null;
    public final String f28844c;
    public final Object f28845d;
    public Object f28846e = null;

    protected C5686a(String str, Object obj) {
        this.f28844c = str;
        this.f28845d = obj;
    }

    protected abstract Object mo5128a();

    private final Object m26935c() {
        if (this.f28846e != null) {
            return this.f28846e;
        }
        C5699f.m26960a(f28843b, (Object) "Please call GServicesValue.init(Context) before attempting to use GServices.");
        return mo5128a();
    }

    public final Object m26938b() {
        try {
            return m26935c();
        } catch (SecurityException e) {
            return m26936d();
        }
    }

    private final Object m26936d() {
        Object c;
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            c = m26935c();
        } catch (Throwable e) {
            Log.e("GservicesValue", "Could not get Gservices value.", e);
            c = this.f28845d;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return c;
    }

    public static C5686a m26934a(String str, boolean z) {
        return new C5687b(str, Boolean.valueOf(z));
    }

    public static C5686a m26932a(String str, Long l) {
        return new C5688c(str, l);
    }

    public static C5686a m26931a(String str, Integer num) {
        return new C5689d(str, num);
    }

    public static C5686a m26933a(String str, String str2) {
        return new C5690e(str, str2);
    }
}
