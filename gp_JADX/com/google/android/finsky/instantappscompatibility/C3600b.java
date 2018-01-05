package com.google.android.finsky.instantappscompatibility;

import android.content.pm.ApplicationInfo;
import android.content.pm.InstantAppInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Parcel;
import android.os.UserHandle;
import android.support.v4.os.C0327a;
import com.google.android.finsky.utils.FinskyLog;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class C3600b {
    public static Method f17914a;
    public static Method f17915b;
    public static Method f17916c;
    public static Field f17917d;
    public PackageManager f17918e;

    private static Method m17191b() {
        if (f17915b == null) {
            f17915b = ApplicationInfo.class.getDeclaredMethod("isInstantApp", new Class[0]);
        }
        return f17915b;
    }

    public C3600b(PackageManager packageManager) {
        this.f17918e = packageManager;
    }

    public final List m17194a() {
        if (!C0327a.m1722b()) {
            return null;
        }
        List instantApps = this.f17918e.getInstantApps();
        List arrayList = new ArrayList(instantApps.size());
        for (int i = 0; i < instantApps.size(); i++) {
            Parcel obtain = Parcel.obtain();
            ((InstantAppInfo) instantApps.get(i)).writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            arrayList.add((InstantAppInfo) InstantAppInfo.CREATOR.createFromParcel(obtain));
            obtain.recycle();
        }
        return arrayList;
    }

    public final void m17195a(String str, boolean z) {
        if (C0327a.m1722b()) {
            this.f17918e.setUpdateAvailable(str, z);
        }
    }

    public final int m17193a(String str, Collection collection) {
        try {
            if (f17914a == null) {
                f17914a = PackageManager.class.getDeclaredMethod("getApplicationInfoAsUser", new Class[]{String.class, Integer.TYPE, Integer.TYPE});
            }
            Method method = f17914a;
            if (f17916c == null) {
                f17916c = PackageManager.class.getDeclaredMethod("getPackageInfoAsUser", new Class[]{String.class, Integer.TYPE, Integer.TYPE});
            }
            Method method2 = f17916c;
            Method b = C3600b.m17191b();
            for (UserHandle userHandle : collection) {
                try {
                    if (((Boolean) b.invoke((ApplicationInfo) method.invoke(this.f17918e, new Object[]{str, Integer.valueOf(0), Integer.valueOf(userHandle.getIdentifier())}), new Object[0])).booleanValue()) {
                        return ((PackageInfo) method2.invoke(this.f17918e, new Object[]{str, Integer.valueOf(8388608), Integer.valueOf(userHandle.getIdentifier())})).versionCode;
                    }
                } catch (Exception e) {
                    if (!(e instanceof NameNotFoundException)) {
                        FinskyLog.m21665c("Couldn't get instant app state", e);
                    }
                }
            }
            return -1;
        } catch (NoSuchMethodException e2) {
            return -1;
        }
    }

    public static boolean m17189a(ApplicationInfo applicationInfo) {
        IllegalAccessException e;
        if (!C0327a.m1722b()) {
            return false;
        }
        try {
            return ((Boolean) C3600b.m17191b().invoke(applicationInfo, new Object[0])).booleanValue();
        } catch (NoSuchMethodException e2) {
            e = e2;
            FinskyLog.m21667d("Couldn't read instant app state", e);
            return false;
        } catch (InvocationTargetException e3) {
            e = e3;
            FinskyLog.m21667d("Couldn't read instant app state", e);
            return false;
        } catch (IllegalAccessException e4) {
            e = e4;
            FinskyLog.m21667d("Couldn't read instant app state", e);
            return false;
        }
    }

    public static int m17190b(ApplicationInfo applicationInfo) {
        NoSuchFieldException e;
        if (!C0327a.m1722b()) {
            return -1;
        }
        try {
            if (f17917d == null) {
                f17917d = ApplicationInfo.class.getDeclaredField("targetSandboxVersion");
            }
            return f17917d.getInt(applicationInfo);
        } catch (IllegalAccessException e2) {
            e = e2;
            FinskyLog.m21667d("Couldn't read targetSandboxVersion", e);
            return -1;
        } catch (NoSuchFieldException e3) {
            e = e3;
            FinskyLog.m21667d("Couldn't read targetSandboxVersion", e);
            return -1;
        }
    }

    public final int m17192a(String str) {
        try {
            return C3600b.m17190b(this.f17918e.getApplicationInfo(str, 8388608));
        } catch (NameNotFoundException e) {
            return -1;
        }
    }
}
