package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.C4902b;
import com.google.android.gms.ads.C4915d;
import com.google.android.gms.ads.C4918g;
import com.google.android.gms.ads.p269a.C4888c;
import com.google.android.gms.ads.p269a.C4889d;
import com.google.android.gms.ads.p273e.C4916a;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.dynamite.DynamiteModule;
import java.net.HttpURLConnection;

@C5302b
public final class al {
    static {
        Handler handler = new Handler(Looper.getMainLooper());
        C4915d.class.getName();
        C4918g.class.getName();
        C4888c.class.getName();
        C4889d.class.getName();
        C4916a.class.getName();
        C4902b.class.getName();
    }

    public static void m24182a(HttpURLConnection httpURLConnection, String str) {
        httpURLConnection.setConnectTimeout(60000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setReadTimeout(60000);
        if (str != null) {
            httpURLConnection.setRequestProperty("User-Agent", str);
        }
        httpURLConnection.setUseCaches(false);
    }

    public static int m24184b(Context context) {
        return DynamiteModule.m23917b(context, "com.google.android.gms.ads.dynamite");
    }

    public static int m24185c(Context context) {
        return DynamiteModule.m23910a(context, "com.google.android.gms.ads.dynamite");
    }

    public static boolean m24183a(Context context) {
        return C5095d.m23655a(context) == 0;
    }

    public static void m24181a(Context context, String str, Bundle bundle) {
        ao amVar = new am();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        bundle.putString("os", VERSION.RELEASE);
        bundle.putString("api", String.valueOf(VERSION.SDK_INT));
        bundle.putString("appid", applicationContext.getPackageName());
        String str2 = "js";
        bundle.putString(str2, C5095d.m23664d(context) + ".11200000");
        Builder appendQueryParameter = new Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("id", str);
        for (String str3 : bundle.keySet()) {
            appendQueryParameter.appendQueryParameter(str3, bundle.getString(str3));
        }
        amVar.mo4697a(appendQueryParameter.toString());
    }
}
