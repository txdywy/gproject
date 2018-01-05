package com.google.android.finsky.installer;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RecentTaskInfo;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.StatFs;
import com.android.volley.AuthFailureError;
import com.android.volley.NetworkError;
import com.android.volley.NoConnectionError;
import com.android.volley.ParseError;
import com.android.volley.ServerError;
import com.android.volley.TimeoutError;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.DfeServerError;
import com.google.android.finsky.dk.C2830g;
import com.google.android.volley.DisplayMessageError;
import java.io.File;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C3322j {
    public final C2830g f17164a;

    public C3322j(C2830g c2830g) {
        this.f17164a = c2830g;
    }

    @TargetApi(18)
    public final boolean m16694a(long j, File file) {
        long availableBytes;
        long totalBytes;
        StatFs statFs = new StatFs(file.getAbsolutePath());
        if (VERSION.SDK_INT >= 18) {
            availableBytes = statFs.getAvailableBytes();
            totalBytes = statFs.getTotalBytes();
        } else {
            long blockSize = (long) statFs.getBlockSize();
            availableBytes = ((long) statFs.getAvailableBlocks()) * blockSize;
            totalBytes = ((long) statFs.getBlockCount()) * blockSize;
        }
        if (availableBytes - ((((long) ((Integer) C0955b.aY.m28964b()).intValue()) * j) / 100) >= this.f17164a.m14974a(totalBytes)) {
            return true;
        }
        return false;
    }

    public static Set m16693a(Context context) {
        Set hashSet = new HashSet();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (((PowerManager) context.getSystemService("power")).isScreenOn()) {
            List recentTasks = activityManager.getRecentTasks(1, 1);
            if (recentTasks.size() > 0) {
                RecentTaskInfo recentTaskInfo = (RecentTaskInfo) recentTasks.get(0);
                if (recentTaskInfo.baseIntent != null) {
                    ComponentName component = recentTaskInfo.baseIntent.getComponent();
                    if (component != null) {
                        hashSet.add(component.getPackageName());
                    }
                }
            }
        }
        if (((Boolean) C0955b.aQ.m28964b()).booleanValue()) {
            List runningServices = activityManager.getRunningServices(Integer.MAX_VALUE);
            if (runningServices != null) {
                int size = runningServices.size();
                for (int i = 0; i < size; i++) {
                    RunningServiceInfo runningServiceInfo = (RunningServiceInfo) runningServices.get(i);
                    if (runningServiceInfo.foreground) {
                        hashSet.add(runningServiceInfo.service.getPackageName());
                    }
                }
            }
        }
        return hashSet;
    }

    public static int m16691a(int i) {
        switch (i) {
            case 2:
                return 940;
            case 3:
                return 941;
            case 4:
                return 942;
            case 5:
                return 944;
            case 6:
                return 945;
            default:
                return 943;
        }
    }

    public static int m16692a(VolleyError volleyError) {
        if (volleyError.f4022b != null && volleyError.f4022b.f4166a != 0) {
            return volleyError.f4022b.f4166a;
        }
        if (volleyError instanceof AuthFailureError) {
            return 920;
        }
        if (volleyError instanceof DisplayMessageError) {
            if (volleyError instanceof DfeServerError) {
                return 922;
            }
            return 921;
        } else if (volleyError instanceof NetworkError) {
            if (volleyError instanceof NoConnectionError) {
                return 924;
            }
            return 923;
        } else if (volleyError instanceof ParseError) {
            return 925;
        } else {
            if (volleyError instanceof ServerError) {
                return 926;
            }
            if (volleyError instanceof TimeoutError) {
                return 927;
            }
            return 928;
        }
    }
}
