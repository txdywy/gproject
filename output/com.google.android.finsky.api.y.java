package com.google.android.finsky.api;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$NameNotFoundException;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Build$VERSION;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ec.a;
import com.google.android.finsky.utils.ba;
import com.google.android.finsky.utils.o;
import java.util.Locale;

public static class com.google.android.finsky.api.y
{

    public static String a(Context p0) {
        try {
            v1 = p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0);
            v9 = p0.getResources().getBoolean(2131492903);
            v10 = com.google.android.finsky.utils.ba.a();
            if (com.google.android.finsky.as.a.b(p0)) {
                v2 = com.google.android.finsky.ec.a.a(p0);
                if (v2.c())
                    v2 = "ios";
                else if (v2.b())
                    v2 = "android";
                else
                    v2 = "";
                if (v9 != 0)
                    v0 = 1;
                else
                    v0 = 0;
                v14 = new Object[13];
                v14[0] = com.google.android.finsky.api.y.a(v1.versionName);
                v14[1] = "3";
                v14[2] = Integer.valueOf(v1.versionCode);
                v14[3] = Integer.valueOf(Build$VERSION.SDK_INT);
                v14[4] = com.google.android.finsky.api.y.a(Build.DEVICE);
                v14[5] = com.google.android.finsky.api.y.a(Build.HARDWARE);
                v14[6] = com.google.android.finsky.api.y.a(Build.PRODUCT);
                v14[7] = com.google.android.finsky.api.y.a(Build$VERSION.RELEASE);
                v14[8] = com.google.android.finsky.api.y.a(Build.MODEL);
                v14[9] = com.google.android.finsky.api.y.a(Build.ID);
                v14[10] = Integer.valueOf(v0);
                v14[11] = com.google.android.finsky.api.y.a(v10);
                v14[12] = v2;
                v0 = String.format(Locale.US, "Android-Finsky/%s (api=%s,versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s,platformVersionRelease=%s,model=%s,buildId=%s,isWideScreen=%d,supportedAbis=%s,pairedDevice=%s)", v14);
            }
            else
                v0 = com.google.android.finsky.api.y.a(v1.versionName, v1.versionCode, Build$VERSION.SDK_INT, Build.DEVICE, Build.HARDWARE, Build.PRODUCT, Build$VERSION.RELEASE, Build.MODEL, Build.ID, v9, v10);
            return v0;
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new RuntimeException("Can't find our own package", ex);
        }
    }

    public static String a(String p0) {
        if (p0 == 0)
            v0 = 0;
        else
            v0 = Uri.encode(p0).replace("(", "%28").replace(")", "%29");
        return v0;
    }

    public static String a(String p0, int p1, int p2, String p3, String p4, String p5, String p6, String p7, String p8, boolean p9, String[] p10) {
        if (p9 != 0)
            v0 = 1;
        else
            v0 = 0;
        v11 = new Object[12];
        v11[0] = com.google.android.finsky.api.y.a(p0);
        v11[1] = "3";
        v11[2] = Integer.valueOf(p1);
        v11[3] = Integer.valueOf(p2);
        v11[4] = com.google.android.finsky.api.y.a(p3);
        v11[5] = com.google.android.finsky.api.y.a(p4);
        v11[6] = com.google.android.finsky.api.y.a(p5);
        v11[7] = com.google.android.finsky.api.y.a(p6);
        v11[8] = com.google.android.finsky.api.y.a(p7);
        v11[9] = com.google.android.finsky.api.y.a(p8);
        v11[10] = Integer.valueOf(v0);
        v11[11] = com.google.android.finsky.api.y.a(p10);
        return String.format(Locale.US, "Android-Finsky/%s (api=%s,versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s,platformVersionRelease=%s,model=%s,buildId=%s,isWideScreen=%d,supportedAbis=%s)", v11);
    }

    private static String a(String[] p0) {
        v1 = new String[p0.length];
        v0 = 0;
        while (v0 < p0.length) {
            v1[v0] = com.google.android.finsky.api.y.a(p0[v0]);
            v0 = v0 + 1;
        }
        return com.google.android.finsky.utils.o.a(v1, 59);
    }

    public static String b(Context p0) {
        try {
            v3 = new Object[1];
            v3[0] = com.google.android.finsky.api.y.a(p0.getPackageManager().getPackageInfo(p0.getPackageName(), 0).versionName);
        }
        catch (PackageManager$NameNotFoundException ex) {
            throw new RuntimeException("Can't find our own package", ex);
        }
        return String.format(Locale.US, "Android-Finsky/%s", v3);
    }

}
