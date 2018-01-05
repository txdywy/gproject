package com.google.android.wallet.common.pub.p381a;

import android.util.Log;
import com.google.android.wallet.analytics.p365a.C6492a;

public final class C6579a {
    public static C6580b f32716a;

    public static void m29875a(C6492a c6492a) {
        if (f32716a != null) {
            f32716a.m29876a(c6492a);
        } else if (Log.isLoggable("OrchAnalyticsDispatcher", 3)) {
            Log.d("OrchAnalyticsDispatcher", "No listener found for sending background event of type " + c6492a.f32545a);
        }
    }
}
