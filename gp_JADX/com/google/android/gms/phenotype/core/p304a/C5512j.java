package com.google.android.gms.phenotype.core.p304a;

import android.content.Context;
import android.content.Intent;
import com.google.common.flogger.c;
import com.google.common.flogger.d;
import java.util.logging.Level;

public final class C5512j {
    public static final c f28336a = c.a("com/google/android/gms/phenotype/core/common/UpdateNotifier");

    public static void m26436a(Context context, C5505c c5505c, String str) {
        String a = C5505c.m26424a(c5505c.getWritableDatabase(), str);
        if (a != null) {
            Intent intent = new Intent("com.google.android.gms.phenotype.core.UPDATE");
            intent.setPackage(a);
            intent.putExtra("com.google.android.gms.phenotype.core.PACKAGE_NAME", str);
            intent.putExtra("com.google.android.gms.phenotype.core.UPDATE_REASON", 9);
            intent.putExtra("com.google.android.gms.phenotype.core.URGENT", true);
            context.sendBroadcast(intent);
            return;
        }
        ((d) ((d) f28336a.a(Level.SEVERE)).a("com/google/android/gms/phenotype/core/common/UpdateNotifier", "notify", 30, "UpdateNotifier.java")).a("No Android package for: %s", str);
    }
}
