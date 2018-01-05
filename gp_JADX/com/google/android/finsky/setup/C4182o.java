package com.google.android.finsky.setup;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;
import java.util.concurrent.Callable;

final class C4182o implements Callable {
    public final /* synthetic */ C4181n f21105a;

    C4182o(C4181n c4181n) {
        this.f21105a = c4181n;
    }

    public final /* synthetic */ Object call() {
        List queryBroadcastReceivers = this.f21105a.f21102a.getPackageManager().queryBroadcastReceivers(new Intent("android.autoinstalls.config.action.PLAY_AUTO_INSTALL"), 0);
        if (queryBroadcastReceivers.isEmpty()) {
            return null;
        }
        Object obj = ((ResolveInfo) queryBroadcastReceivers.get(0)).activityInfo.packageName;
        C2322b a = this.f21105a.f21104c.mo2854a(obj);
        if (a == null) {
            FinskyLog.m21669e("Null PackageState for potential VPA stub %s", obj);
            return null;
        }
        int i = a.f11419d;
        boolean z = a.f11422g;
        boolean z2 = a.f11423h;
        if ((i == 1 && z && !z2) || z2) {
            FinskyLog.m21659a("Found VPA stub %s:%d", obj, Integer.valueOf(i));
            return obj;
        }
        FinskyLog.m21659a("Rejected VPA stub %s:%d", obj, Integer.valueOf(i));
        return null;
    }
}
