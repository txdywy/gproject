package com.squareup.leakcanary.internal;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Notification;
import android.app.Notification.Builder;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ServiceInfo;
import android.os.Build.VERSION;
import android.os.Process;
import com.squareup.leakcanary.C7582R;
import com.squareup.leakcanary.CanaryLog;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class LeakCanaryInternals {
    public static final String HUAWEI = "HUAWEI";
    public static final String LENOVO = "LENOVO";
    public static final String LG = "LGE";
    public static final String MEIZU = "Meizu";
    public static final String MOTOROLA = "motorola";
    public static final String NOTIFICATION_CHANNEL_ID = "leakcanary";
    public static final String NVIDIA = "NVIDIA";
    public static final String SAMSUNG = "samsung";
    public static final String VIVO = "vivo";
    public static final Executor fileIoExecutor = newSingleThreadExecutor("File-IO");

    class C75981 implements Runnable {
        public final /* synthetic */ Context val$appContext;
        public final /* synthetic */ Class val$componentClass;
        public final /* synthetic */ boolean val$enabled;

        C75981(Context context, Class cls, boolean z) {
            this.val$appContext = context;
            this.val$componentClass = cls;
            this.val$enabled = z;
        }

        public void run() {
            LeakCanaryInternals.setEnabledBlocking(this.val$appContext, this.val$componentClass, this.val$enabled);
        }
    }

    public static void executeOnFileIoThread(Runnable runnable) {
        fileIoExecutor.execute(runnable);
    }

    public static String classSimpleName(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf == -1 ? str : str.substring(lastIndexOf + 1);
    }

    public static void setEnabled(Context context, Class cls, boolean z) {
        executeOnFileIoThread(new C75981(context.getApplicationContext(), cls, z));
    }

    public static void setEnabledBlocking(Context context, Class cls, boolean z) {
        context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls), z ? 1 : 2, 1);
    }

    public static boolean isInServiceProcess(Context context, Class cls) {
        PackageManager packageManager = context.getPackageManager();
        try {
            String str = packageManager.getPackageInfo(context.getPackageName(), 4).applicationInfo.processName;
            try {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, cls), 0);
                if (serviceInfo.processName.equals(str)) {
                    CanaryLog.m36611d("Did not expect service %s to run in main process %s", cls, str);
                    return false;
                }
                int myPid = Process.myPid();
                List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
                if (runningAppProcesses != null) {
                    for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == myPid) {
                            break;
                        }
                    }
                }
                RunningAppProcessInfo runningAppProcessInfo2 = null;
                if (runningAppProcessInfo2 != null) {
                    return runningAppProcessInfo2.processName.equals(serviceInfo.processName);
                }
                CanaryLog.m36611d("Could not find running process for %d", Integer.valueOf(myPid));
                return false;
            } catch (NameNotFoundException e) {
                return false;
            }
        } catch (Throwable e2) {
            CanaryLog.m36612d(e2, "Could not get package info for %s", context.getPackageName());
            return false;
        }
    }

    public static void showNotification(Context context, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent, int i) {
        Notification notification;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Builder contentIntent = new Builder(context).setSmallIcon(C7582R.drawable.leak_canary_notification).setWhen(System.currentTimeMillis()).setContentTitle(charSequence).setContentText(charSequence2).setAutoCancel(true).setContentIntent(pendingIntent);
        if (VERSION.SDK_INT >= 26) {
            setupNotificationChannel(context.getString(C7582R.string.leak_canary_notification_channel), notificationManager, contentIntent);
        }
        if (VERSION.SDK_INT < 16) {
            notification = contentIntent.getNotification();
        } else {
            notification = contentIntent.build();
        }
        notificationManager.notify(i, notification);
    }

    @TargetApi(26)
    private static void setupNotificationChannel(String str, NotificationManager notificationManager, Builder builder) {
        if (notificationManager.getNotificationChannel(NOTIFICATION_CHANNEL_ID) == null) {
            notificationManager.createNotificationChannel(new NotificationChannel(NOTIFICATION_CHANNEL_ID, str, 3));
        }
        builder.setChannelId(NOTIFICATION_CHANNEL_ID);
    }

    public static Executor newSingleThreadExecutor(String str) {
        return Executors.newSingleThreadExecutor(new LeakCanarySingleThreadFactory(str));
    }

    private LeakCanaryInternals() {
        throw new AssertionError();
    }
}
