package com.google.android.finsky.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ec.C2968a;
import com.google.android.finsky.utils.C4684o;
import com.google.android.finsky.utils.ba;
import com.squareup.leakcanary.C7582R;
import java.util.Locale;

public final class C1301y {
    public static String m7755a(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            int i = packageInfo.versionCode;
            boolean z = context.getResources().getBoolean(C7582R.bool.use_wide_layout);
            String[] a = ba.m21790a();
            if (!C1503a.m8831b(context)) {
                return C1301y.m7757a(str, i, VERSION.SDK_INT, Build.DEVICE, Build.HARDWARE, Build.PRODUCT, VERSION.RELEASE, Build.MODEL, Build.ID, z, a);
            }
            String str2;
            C2968a a2 = C2968a.m15380a(context);
            if (a2.m15384c()) {
                str2 = "ios";
            } else if (a2.m15383b()) {
                str2 = "android";
            } else {
                str2 = "";
            }
            int i2 = VERSION.SDK_INT;
            String str3 = Build.DEVICE;
            String str4 = Build.HARDWARE;
            String str5 = Build.PRODUCT;
            String str6 = VERSION.RELEASE;
            String str7 = Build.MODEL;
            String str8 = Build.ID;
            String a3 = C1301y.m7756a(str);
            str3 = C1301y.m7756a(str3);
            str4 = C1301y.m7756a(str4);
            str5 = C1301y.m7756a(str5);
            str6 = C1301y.m7756a(str6);
            str7 = C1301y.m7756a(str7);
            str8 = C1301y.m7756a(str8);
            int i3 = z ? 1 : 0;
            String a4 = C1301y.m7758a(a);
            return String.format(Locale.US, "Android-Finsky/%s (api=%s,versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s,platformVersionRelease=%s,model=%s,buildId=%s,isWideScreen=%d,supportedAbis=%s,pairedDevice=%s)", new Object[]{a3, "3", Integer.valueOf(i), Integer.valueOf(i2), str3, str4, str5, str6, str7, str8, Integer.valueOf(i3), a4, str2});
        } catch (Throwable e) {
            throw new RuntimeException("Can't find our own package", e);
        }
    }

    public static String m7757a(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, String[] strArr) {
        String a = C1301y.m7756a(str);
        String a2 = C1301y.m7756a(str2);
        String a3 = C1301y.m7756a(str3);
        String a4 = C1301y.m7756a(str4);
        String a5 = C1301y.m7756a(str5);
        String a6 = C1301y.m7756a(str6);
        String a7 = C1301y.m7756a(str7);
        int i3 = z ? 1 : 0;
        String a8 = C1301y.m7758a(strArr);
        return String.format(Locale.US, "Android-Finsky/%s (api=%s,versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s,platformVersionRelease=%s,model=%s,buildId=%s,isWideScreen=%d,supportedAbis=%s)", new Object[]{a, "3", Integer.valueOf(i), Integer.valueOf(i2), a2, a3, a4, a5, a6, a7, Integer.valueOf(i3), a8});
    }

    private static String m7758a(String[] strArr) {
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr2[i] = C1301y.m7756a(strArr[i]);
        }
        return C4684o.m21830a(strArr2, ';');
    }

    public static String m7759b(Context context) {
        try {
            String a = C1301y.m7756a(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName);
            return String.format(Locale.US, "Android-Finsky/%s", new Object[]{a});
        } catch (Throwable e) {
            throw new RuntimeException("Can't find our own package", e);
        }
    }

    public static String m7756a(String str) {
        if (str == null) {
            return null;
        }
        return Uri.encode(str).replace("(", "%28").replace(")", "%29");
    }
}
