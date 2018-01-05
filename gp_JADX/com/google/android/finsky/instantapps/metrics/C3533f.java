package com.google.android.finsky.instantapps.metrics;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.support.v4.os.C0327a;
import com.google.android.finsky.utils.C4678i;

public final class C3533f {
    public static final ComponentName f17794a = new ComponentName("com.google.android.instantapps.supervisor", "com.google.android.instantapps.supervisor.InstantAppsLoggingService");
    public static final ComponentName f17795b = new ComponentName("com.android.vending", "com.google.android.finsky.instantapps.InstantAppsLoggingService");

    public static void m17116a(Context context, int i) {
        Intent intent = new Intent("com.google.android.instantapps.common.logging.LOG_ODYSSEY");
        intent.putExtra("com.google.android.instantapps.common.logging.EVENT_TYPE_EXTRA", i);
        intent.putExtra("com.google.android.instantapps.common.logging.EVENT_TIME_MS", C4678i.m21812a());
        if (C0327a.m1722b()) {
            intent.setComponent(f17795b);
        } else {
            intent.setComponent(f17794a);
        }
        context.startService(intent);
    }
}
