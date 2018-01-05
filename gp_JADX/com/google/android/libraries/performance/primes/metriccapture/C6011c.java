package com.google.android.libraries.performance.primes.metriccapture;

import android.app.Application;
import android.view.WindowManager;

public final class C6011c {
    public static volatile int f30070a;
    public static volatile int f30071b;

    public static int m27878a(Application application) {
        if (f30070a == 0) {
            synchronized (C6011c.class) {
                if (f30070a == 0) {
                    int b = C6011c.m27879b(application);
                    if (b < 10 || b > 60) {
                        b = 60;
                    }
                    f30070a = (int) Math.ceil(1000.0d / ((double) b));
                }
            }
        }
        return f30070a;
    }

    public static int m27879b(Application application) {
        if (f30071b == 0) {
            synchronized (C6011c.class) {
                if (f30071b == 0) {
                    f30071b = Math.round(((WindowManager) application.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate());
                }
            }
        }
        return f30071b;
    }
}
