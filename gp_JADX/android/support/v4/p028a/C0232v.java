package android.support.v4.p028a;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;

public final class C0232v {
    public static int m1136a(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String permissionToOp;
        if (VERSION.SDK_INT >= 23) {
            permissionToOp = AppOpsManager.permissionToOp(str);
        } else {
            permissionToOp = null;
        }
        if (permissionToOp == null) {
            return 0;
        }
        int noteProxyOp;
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (VERSION.SDK_INT >= 23) {
            noteProxyOp = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOp(permissionToOp, str2);
        } else {
            noteProxyOp = 1;
        }
        if (noteProxyOp != 0) {
            return -2;
        }
        return 0;
    }

    public static int m1135a(Context context, String str) {
        return C0232v.m1136a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
