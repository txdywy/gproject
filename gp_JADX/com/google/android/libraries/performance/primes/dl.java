package com.google.android.libraries.performance.primes;

import android.content.Context;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.metriccapture.C6016h;
import java.io.File;

final class dl {
    static File m27818a(Context context) {
        C5916a.m27406a((Object) context);
        File cacheDir = context.getCacheDir();
        String d = m27821d(context);
        return new File(cacheDir, new StringBuilder(String.valueOf(d).length() + 12).append(d).append("_primeshprof").toString());
    }

    static File m27819b(Context context) {
        C5916a.m27406a((Object) context);
        File cacheDir = context.getCacheDir();
        String d = m27821d(context);
        return new File(cacheDir, new StringBuilder(String.valueOf(d).length() + 17).append(d).append("_primes_mhd.hprof").toString());
    }

    static void m27820c(Context context) {
        File b = m27819b(context);
        if (b.exists()) {
            b.delete();
        }
    }

    private static String m27821d(Context context) {
        String d = C6016h.m27892d(context);
        if (d == null) {
            return "";
        }
        d = d.replaceAll("[^a-zA-Z0-9\\._]", "_");
        return d.substring(0, Math.min(32, d.length()));
    }
}
