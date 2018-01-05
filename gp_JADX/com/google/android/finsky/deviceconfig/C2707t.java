package com.google.android.finsky.deviceconfig;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.finsky.utils.FinskyLog;
import java.security.MessageDigest;
import java.util.regex.Pattern;

final class C2707t {
    public static final Pattern f14867a = Pattern.compile("^[0-9]{15}$");
    public static final Pattern f14868b = Pattern.compile("^[0-9a-fA-F]{14}$");
    public static final Pattern f14869c = Pattern.compile("^[0-9a-fA-F]{8}$");
    public static final Pattern f14870d = Pattern.compile("^([0-9a-fA-F][0-9a-fA-F][:-]?){5}[0-9a-fA-F][0-9a-fA-F]$");
    public final Context f14871e;

    C2707t(Context context) {
        this.f14871e = context;
    }

    static long m14595a() {
        String str = Build.SERIAL;
        if (!str.equals("unknown")) {
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(str.getBytes());
                return (((long) digest[6]) & 255) | ((((((1441151880758558720L | ((((long) digest[0]) & 255) << 48)) | ((((long) digest[1]) & 255) << 40)) | ((((long) digest[2]) & 255) << 32)) | ((((long) digest[3]) & 255) << 24)) | ((((long) digest[4]) & 255) << 16)) | ((((long) digest[5]) & 255) << 8));
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "No support for sha1?", new Object[0]);
            }
        }
        return 0;
    }

    static long m14596a(String str) {
        if (TextUtils.isEmpty(str) || !f14869c.matcher(str).matches()) {
            return 0;
        }
        return 1297036692682702848L | Long.parseLong(str, 16);
    }

    static long m14597b(String str) {
        if (TextUtils.isEmpty(str) || !f14867a.matcher(str).matches()) {
            return 0;
        }
        return 1152921504606846976L | Long.parseLong(str, 10);
    }

    static long m14598c(String str) {
        if (TextUtils.isEmpty(str) || !f14868b.matcher(str).matches()) {
            return 0;
        }
        return 1224979098644774912L | Long.parseLong(str, 16);
    }

    final boolean m14599d(String str) {
        return this.f14871e.getPackageManager().checkPermission(str, this.f14871e.getPackageName()) == 0;
    }
}
