package com.google.android.finsky.p227n;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import com.google.android.finsky.utils.FinskyLog;

public final class C3747c {
    public static final Uri f18902a = Uri.parse("content://org.chromium.arc.apk_cache/cache_info");
    public final Context f18903b;

    public C3747c(Context context) {
        this.f18903b = context;
    }

    public final boolean m17636a() {
        try {
            ApplicationInfo applicationInfo = this.f18903b.getPackageManager().getApplicationInfo("org.chromium.arc.apkcacheprovider", 0);
            if (applicationInfo != null && (applicationInfo.flags & 1) != 0) {
                return true;
            }
            FinskyLog.m21669e("%s is not a system app.", "org.chromium.arc.apkcacheprovider");
            return false;
        } catch (NameNotFoundException e) {
            return false;
        }
    }
}
