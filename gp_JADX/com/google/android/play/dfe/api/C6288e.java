package com.google.android.play.dfe.api;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.volley.C0659a;
import com.android.volley.p060a.C0662b;
import com.google.android.play.utils.PlayCommonLog;
import com.google.android.play.utils.k;
import com.google.android.play.utils.p354b.C6322j;
import com.google.android.volley.l;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public final class C6288e {
    public static String f31357a;
    public final Context f31358b;
    public final C0662b f31359c;
    public final C0659a f31360d;
    public final Map f31361e = new HashMap();
    public String f31362f;
    public final int f31363g;
    public final boolean f31364h;

    public static C6288e m28843a(Context context, String str, C0659a c0659a, Account account, int i, boolean z) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            return new C6288e(context, account, c0659a, str, packageInfo.versionName, packageInfo.versionCode, Locale.getDefault(), ((TelephonyManager) context.getSystemService("phone")).getSimOperator(), (String) C6322j.f31604r.m28964b(), (String) C6322j.f31603q.m28964b(), i, z);
        } catch (Throwable e) {
            throw new RuntimeException("Can't find our own package", e);
        }
    }

    public static synchronized void m28844a(String str) {
        synchronized (C6288e.class) {
            f31357a = str;
        }
    }

    private static synchronized String m28846c() {
        String str;
        synchronized (C6288e.class) {
            str = f31357a;
        }
        return str;
    }

    private C6288e(Context context, Account account, C0659a c0659a, String str, String str2, int i, Locale locale, String str3, String str4, String str5, int i2, boolean z) {
        if (i2 == 0 || i2 == 1) {
            String str6;
            this.f31358b = context;
            this.f31364h = z;
            Object obj = (account == null || account.name == null || !account.name.endsWith("@android-for-work.gserviceaccount.com")) ? null : 1;
            if (obj != null || i2 == 1) {
                str6 = (String) C6322j.f31602p.m28964b();
                this.f31363g = 1;
            } else {
                str6 = (String) C6322j.f31601o.m28964b();
                this.f31363g = 0;
            }
            this.f31359c = new C0662b(context, account, str6);
            this.f31360d = c0659a;
            this.f31361e.put("X-DFE-Device-Id", Long.toHexString(((Long) C6322j.f31600n.m28964b()).longValue()));
            String language = locale.getLanguage();
            String country = locale.getCountry();
            this.f31361e.put("Accept-Language", new StringBuilder((String.valueOf(language).length() + 1) + String.valueOf(country).length()).append(language).append("-").append(country).toString());
            if (!TextUtils.isEmpty(str3)) {
                this.f31361e.put("X-DFE-MCCMNC", str3);
            }
            if (!TextUtils.isEmpty(str4)) {
                this.f31361e.put("X-DFE-Client-Id", str4);
            }
            if (!TextUtils.isEmpty(str4)) {
                this.f31361e.put("X-DFE-Logging-Id", str5);
            }
            int i3 = VERSION.SDK_INT;
            country = Build.DEVICE;
            String str7 = Build.HARDWARE;
            String str8 = Build.PRODUCT;
            String b = C6288e.m28845b(str2);
            country = C6288e.m28845b(country);
            str7 = C6288e.m28845b(str7);
            str8 = C6288e.m28845b(str8);
            this.f31361e.put("User-Agent", String.format(Locale.US, "Android-%s/%s (api=%d,versionCode=%d,sdk=%d,device=%s,hardware=%s,product=%s)", new Object[]{str, b, Integer.valueOf(4), Integer.valueOf(i), Integer.valueOf(i3), country, str7, str8}));
            str6 = C6287d.f31354a.toString();
            String a = l.a(this.f31358b, str6);
            if (a == null) {
                language = "BASE_URI blocked by UrlRules: ";
                str6 = String.valueOf(str6);
                if (str6.length() != 0) {
                    str6 = language.concat(str6);
                } else {
                    str6 = new String(language);
                }
                throw new RuntimeException(str6);
            }
            try {
                URL url = new URL(a);
                if (!url.getProtocol().toLowerCase().equals("https") && !url.getHost().toLowerCase().endsWith("corp.google.com") && !url.getHost().toLowerCase().endsWith("prod.google.com") && !url.getHost().startsWith("192.168.0")) {
                    if (url.getHost().startsWith("127.0.0") && k.a()) {
                        return;
                    }
                    country = "Insecure URL: ";
                    str6 = String.valueOf(a);
                    throw new RuntimeException(str6.length() != 0 ? country.concat(str6) : new String(country));
                }
            } catch (MalformedURLException e) {
                language = "Cannot parse URL: ";
                str6 = String.valueOf(a);
                PlayCommonLog.b(str6.length() != 0 ? language.concat(str6) : new String(language), new Object[0]);
            }
        } else {
            throw new RuntimeException("Unknown auth type: " + i2);
        }
    }

    private static String m28845b(String str) {
        return Uri.encode(str).replace("(", "%28").replace(")", "%29");
    }

    public final void m28847a() {
        if (this.f31362f != null) {
            this.f31359c.m4420a(this.f31362f);
            this.f31362f = null;
        }
    }

    public final synchronized Map m28848b() {
        Map hashMap;
        String valueOf;
        this.f31362f = this.f31359c.mo1071a();
        hashMap = new HashMap();
        hashMap.putAll(this.f31361e);
        String str;
        String str2;
        switch (this.f31363g) {
            case 0:
                str = "Authorization";
                str2 = "GoogleLogin auth=";
                valueOf = String.valueOf(this.f31362f);
                hashMap.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                break;
            case 1:
                str = "Authorization";
                str2 = "Bearer ";
                valueOf = String.valueOf(this.f31362f);
                hashMap.put(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                break;
        }
        valueOf = C6288e.m28846c();
        if (valueOf != null && this.f31364h) {
            hashMap.put("x-obscura-nonce", valueOf);
        }
        return hashMap;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[PlayDfeApiContext headers={");
        Object obj = 1;
        for (String str : this.f31361e.keySet()) {
            if (obj != null) {
                obj = null;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append(str).append(": ").append((String) this.f31361e.get(str));
        }
        stringBuilder.append("}]");
        return stringBuilder.toString();
    }
}
