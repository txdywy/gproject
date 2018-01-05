package android.support.v4.app;

import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build.VERSION;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;

public final class cm {
    public final Context f1548a;
    public final NotificationManager f1549b = ((NotificationManager) this.f1548a.getSystemService("notification"));

    public static cm m1438a(Context context) {
        return new cm(context);
    }

    private cm(Context context) {
        this.f1548a = context;
    }

    public final boolean m1439a() {
        if (VERSION.SDK_INT >= 24) {
            return this.f1549b.areNotificationsEnabled();
        }
        if (VERSION.SDK_INT < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f1548a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f1548a.getApplicationInfo();
        String packageName = this.f1548a.getApplicationContext().getPackageName();
        int i = applicationInfo.uid;
        try {
            return ((Integer) Class.forName(AppOpsManager.class.getName()).getMethod("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}).invoke(appOpsManager, new Object[]{Integer.valueOf(((Integer) Class.forName(AppOpsManager.class.getName()).getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i), packageName})).intValue() == 0;
        } catch (ClassNotFoundException e) {
            return true;
        } catch (NoSuchMethodException e2) {
            return true;
        } catch (NoSuchFieldException e3) {
            return true;
        } catch (InvocationTargetException e4) {
            return true;
        } catch (IllegalAccessException e5) {
            return true;
        } catch (RuntimeException e6) {
            return true;
        }
    }

    static {
        Object obj = new Object();
        HashSet hashSet = new HashSet();
        obj = new Object();
    }
}
