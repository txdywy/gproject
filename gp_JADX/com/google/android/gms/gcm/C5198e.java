package com.google.android.gms.gcm;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.iid.C5254a;
import java.util.concurrent.atomic.AtomicInteger;

public final class C5198e {
    public static int f26238a = 5000000;

    static {
        AtomicInteger atomicInteger = new AtomicInteger(1);
    }

    public static int m23980a(Context context) {
        String a = C5254a.m24074a(context);
        if (a != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(a, 0);
                if (packageInfo != null) {
                    return packageInfo.versionCode;
                }
            } catch (NameNotFoundException e) {
            }
        }
        return -1;
    }
}
