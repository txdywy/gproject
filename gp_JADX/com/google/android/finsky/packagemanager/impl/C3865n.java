package com.google.android.finsky.packagemanager.impl;

import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Method;

final class C3865n {
    public Class f19269a;
    public Object f19270b;

    C3865n(Object obj) {
        this.f19269a = obj.getClass();
        this.f19270b = obj;
    }

    final Method m18350a(String str, boolean z, Class... clsArr) {
        Throwable e;
        if (!z) {
            return null;
        }
        try {
            return this.f19269a.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            e = e2;
            FinskyLog.m21660a(e, "Unable to find %s method on PackageManager", str);
            return null;
        } catch (SecurityException e3) {
            e = e3;
            FinskyLog.m21660a(e, "Unable to find %s method on PackageManager", str);
            return null;
        }
    }
}
