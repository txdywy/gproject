package com.google.android.libraries.performance.primes.metriccapture;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.os.Process;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class C6016h {
    public static volatile ActivityManager f30074a = null;

    public static ActivityManager m27888a(Context context) {
        if (f30074a == null) {
            synchronized (C6016h.class) {
                if (f30074a == null) {
                    f30074a = (ActivityManager) context.getSystemService("activity");
                }
            }
        }
        return f30074a;
    }

    public static boolean m27890b(Context context) {
        List<RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.contains(context.getPackageName())) {
                    boolean c;
                    if (VERSION.SDK_INT < 23) {
                        c = C6016h.m27891c(context);
                    } else {
                        c = true;
                    }
                    if (c) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @TargetApi(20)
    public static boolean m27891c(Context context) {
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        return VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
    }

    public static String m27892d(Context context) {
        String packageName = context.getPackageName();
        String a = C6016h.m27889a(Process.myPid());
        if (a == null || packageName == null || !a.startsWith(packageName)) {
            return a;
        }
        int length = packageName.length();
        if (a.length() == length) {
            return null;
        }
        return a.substring(length + 1);
    }

    private static String m27889a(int i) {
        BufferedReader bufferedReader;
        Throwable th;
        String str = null;
        if (i > 0) {
            try {
                bufferedReader = new BufferedReader(new FileReader("/proc/" + i + "/cmdline"));
                try {
                    str = bufferedReader.readLine().trim();
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                    }
                } catch (IOException e2) {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e3) {
                        }
                    }
                    return str;
                } catch (Throwable th2) {
                    th = th2;
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e5) {
                bufferedReader = str;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                return str;
            } catch (Throwable th3) {
                Throwable th4 = th3;
                bufferedReader = str;
                th = th4;
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
                throw th;
            }
        }
        return str;
    }
}
