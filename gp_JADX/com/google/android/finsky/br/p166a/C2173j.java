package com.google.android.finsky.br.p166a;

import com.google.android.finsky.C1473m;
import com.google.android.finsky.activities.MainActivity;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.utils.FinskyLog;

public final class C2173j {
    public static Class f10947a = null;

    static synchronized Class m11436a() {
        Class cls;
        synchronized (C2173j.class) {
            if (f10947a == null) {
                if (C1503a.m8830a(C1473m.f7980a.f7981b)) {
                    try {
                        f10947a = Class.forName("com.google.android.finsky.activities.TvMainActivity");
                    } catch (ClassNotFoundException e) {
                        FinskyLog.m21669e("Could not find class '%s'", "com.google.android.finsky.activities.TvMainActivity");
                    }
                } else {
                    f10947a = MainActivity.class;
                }
            }
            cls = f10947a;
        }
        return cls;
    }

    static Class m11437b() {
        try {
            return Class.forName("com.google.android.finsky.activities.TvTosActivity");
        } catch (ClassNotFoundException e) {
            FinskyLog.m21667d("Could not find class '%s'", "com.google.android.finsky.activities.TvTosActivity");
            return null;
        }
    }
}
