package com.google.android.wallet.common.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.UiModeManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Binder;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Telephony.Carriers;
import android.support.v4.h.i;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import com.android.volley.a.q;
import com.google.a.a.a.a.a.b.a;
import com.google.a.a.a.a.a.b.b;
import com.google.a.a.a.a.a.b.c;
import com.google.a.a.a.a.b.a.a.c.b.a.ac;
import com.google.a.a.a.a.b.a.a.c.b.a.u;
import com.google.a.a.a.a.b.a.a.c.b.a.x;
import com.google.a.a.a.a.b.a.b.a.ad;
import com.google.a.a.a.a.b.a.c.d;
import com.google.android.gms.ocr.CreditCardOcrResult;
import com.google.android.wallet.common.p367c.C6573a;
import com.google.android.wallet.nfc.C6690a;
import com.google.android.wallet.p355a.C6489e;
import com.google.android.wallet.p383e.C6617a;
import com.google.android.wallet.ui.common.ci;
import com.google.p443h.p451c.p457c.p460b.p465c.p466a.C7176c;
import com.google.protobuf.nano.C7222l;
import java.net.InetAddress;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.UUID;
import java.util.regex.Pattern;
import p535f.p536a.p537a.C7743a;
import p535f.p536a.p537a.C7744b;
import p535f.p536a.p537a.C7745c;
import p535f.p536a.p537a.C7746d;
import p535f.p536a.p537a.C7747e;

public final class C6600l {
    public static final Pattern f32736a = Pattern.compile("[^\\d]");
    public static final i f32737b = new i(5);
    public static final String[] f32738c = new String[]{"apn"};
    public static q f32739d;
    public static Boolean f32740e;
    public static Boolean f32741f;
    public static Boolean f32742g;
    public static Integer f32743h;
    public static long f32744i;
    public static C7746d f32745j;
    public static long f32746k;
    public static Boolean f32747l;
    public static long f32748m;
    public static Boolean f32749n;
    public static long f32750o;
    public static C6604p f32751p;
    public static long f32752q;
    public static Boolean f32753r;
    public static long f32754s;
    public static a[] f32755t;
    public static long f32756u;

    public static void m29946a() {
        f32741f = null;
        f32742g = null;
        f32743h = null;
        f32745j = null;
        f32747l = null;
        f32749n = null;
        f32737b.a(-1);
        f32751p = null;
        f32753r = null;
        f32755t = null;
    }

    public static String m29944a(CharSequence charSequence) {
        return charSequence == null ? null : f32736a.matcher(charSequence).replaceAll("");
    }

    public static boolean m29953a(String str) {
        return str.startsWith("embedded:");
    }

    public static int m29958b(String str) {
        return Integer.parseInt(str.substring(9));
    }

    public static boolean m29965c(String str) {
        return str.startsWith("data:");
    }

    public static boolean m29951a(x xVar, x xVar2) {
        if (xVar == xVar2) {
            return true;
        }
        if (xVar == null || xVar2 == null) {
            return false;
        }
        return Arrays.equals(xVar.e, xVar2.e);
    }

    public static boolean m29950a(u uVar, u uVar2) {
        if (uVar == uVar2) {
            return true;
        }
        if (uVar == null || uVar2 == null) {
            return false;
        }
        return Arrays.equals(uVar.d, uVar2.d);
    }

    public static boolean m29952a(ad adVar, ad adVar2) {
        if (adVar == adVar2) {
            return true;
        }
        if (adVar == null || adVar2 == null) {
            return false;
        }
        return C6598j.m29927a(adVar.c, adVar2.c);
    }

    public static d m29938a(Context context, int i, byte[] bArr) {
        return C6600l.m29939a(context, i, bArr, com.google.android.gms.common.d.a(context) == 0);
    }

    public static d m29939a(Context context, int i, byte[] bArr, boolean z) {
        return C6600l.m29940a(context.getApplicationContext(), i, bArr, z, 1, 0, null);
    }

    public static d m29940a(Context context, int i, byte[] bArr, boolean z, int i2, int i3, String str) {
        long clearCallingIdentity = Binder.clearCallingIdentity();
        try {
            d b = C6600l.m29960b(context, i, bArr, z, i2, i3, str);
            return b;
        } finally {
            Binder.restoreCallingIdentity(clearCallingIdentity);
        }
    }

    @TargetApi(18)
    private static d m29960b(Context context, int i, byte[] bArr, boolean z, int i2, int i3, String str) {
        int i4;
        PackageInfo packageInfo;
        PackageInfo packageInfo2;
        PackageInfo packageInfo3;
        Intent intent;
        ConnectivityManager connectivityManager;
        long a;
        boolean z2;
        C7743a c7743a;
        C7744b c7744b;
        d dVar;
        Locale locale;
        StringBuilder stringBuilder;
        Object country;
        Object variant;
        c cVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c cVar2 = new c();
        cVar2.e = Integer.toString(VERSION.SDK_INT);
        if (!TextUtils.isEmpty(Build.DEVICE)) {
            cVar2.f = Build.DEVICE;
        }
        String str2 = (String) com.google.android.wallet.a.a.e.a();
        if (TextUtils.isEmpty(str2)) {
            cVar2.s = (String) com.google.android.wallet.a.a.c.a();
        } else {
            new Handler(Looper.getMainLooper()).post(new C6601m(context, str2));
            cVar2.s = str2;
        }
        C6604p a2 = C6600l.m29942a(context, elapsedRealtime);
        if (a2.f32763a) {
            i4 = 1;
        } else {
            i4 = 2;
        }
        cVar2.a = i4;
        if (!TextUtils.isEmpty(a2.f32765c)) {
            cVar2.c = C6600l.m29970f(a2.f32765c);
            try {
                cVar2.y = (Long.parseLong(a2.f32765c) / 100000) * 100000;
            } catch (NumberFormatException e) {
            }
        }
        if (!TextUtils.isEmpty(a2.f32766d)) {
            cVar2.d = a2.f32766d;
        }
        if (!TextUtils.isEmpty(a2.f32767e)) {
            cVar2.t = a2.f32767e;
        }
        if (!TextUtils.isEmpty(a2.f32769g)) {
            cVar2.u = a2.f32769g;
        }
        if (((Boolean) com.google.android.wallet.a.a.x.a()).booleanValue()) {
            if (!TextUtils.isEmpty(a2.f32772j)) {
                cVar2.v = a2.f32772j;
            }
            if (a2.f32773k != null) {
                cVar2.w = a2.f32773k.booleanValue();
            }
            if (a2.f32774l != null) {
                cVar2.x = a2.f32774l.intValue();
            }
        }
        cVar2.b = C6607s.m29980a(context, "android.permission.CAMERA") ? 1 : 2;
        DisplayMetrics b = C6589a.m29898b(context);
        cVar2.g = b.widthPixels;
        cVar2.h = b.heightPixels;
        cVar2.i = b.xdpi;
        cVar2.j = b.ydpi;
        cVar2.k = b.densityDpi;
        if (i2 == 2) {
            cVar2.q = (long) i3;
        }
        cVar2.l = i2;
        PackageManager packageManager = context.getPackageManager();
        String packageName = context.getPackageName();
        C6603o c6603o = (C6603o) f32737b.a(packageName);
        if (c6603o != null) {
            packageInfo = c6603o.f32762b;
        } else {
            try {
                packageInfo2 = packageManager.getPackageInfo(packageName, 0);
                if (packageInfo2 != null) {
                    try {
                        f32737b.a(packageName, new C6603o(elapsedRealtime, packageInfo2));
                    } catch (NameNotFoundException e2) {
                        packageInfo = packageInfo2;
                        if (packageInfo != null) {
                            cVar2.m = packageName;
                            cVar2.n = Integer.toString(packageInfo.versionCode);
                            if (!TextUtils.isEmpty(packageInfo.versionName)) {
                                cVar2.o = packageInfo.versionName;
                            }
                        }
                        packageInfo3 = null;
                        if (!TextUtils.isEmpty(str)) {
                            cVar2.p = str;
                            c6603o = C6600l.m29941a(packageManager, str, elapsedRealtime);
                            if (c6603o != null) {
                                packageInfo3 = c6603o.f32762b;
                            }
                        }
                        cVar2.E = C6600l.m29956a(packageManager, elapsedRealtime);
                        if (f32742g == null) {
                            f32742g = Boolean.valueOf(packageManager.hasSystemFeature("android.software.leanback"));
                        }
                        if (f32742g.booleanValue()) {
                            cVar2.r = C6591c.m29912b(cVar2.r, 1);
                        }
                        if (f32741f == null) {
                            f32741f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                        }
                        if (f32741f.booleanValue()) {
                            cVar2.r = C6591c.m29912b(cVar2.r, 3);
                        }
                        if (i != 1) {
                            cVar2.r = C6591c.m29912b(cVar2.r, 4);
                        } else if (i == 2) {
                            cVar2.r = C6591c.m29912b(cVar2.r, 5);
                        }
                        intent = new Intent("com.google.android.gms.ocr.ACTION_CARD_CAPTURE");
                        intent.setPackage("com.google.android.gms");
                        cVar2.r = C6591c.m29912b(cVar2.r, 2);
                        connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        a = C6600l.m29931a(connectivityManager, (WifiManager) context.getSystemService("wifi"));
                        cVar2.z = a;
                        cVar2.A = a;
                        if (VERSION.SDK_INT >= 16) {
                            if (connectivityManager == null) {
                            }
                            cVar2.B = z2;
                        }
                        c7743a = new C7743a();
                        c7744b = new C7744b();
                        c7744b.f40234a = 0;
                        if (!TextUtils.isEmpty(a2.f32770h)) {
                            switch (a2.f32764b) {
                                case 1:
                                    c7744b.f40235b = a2.f32770h;
                                    break;
                                case 2:
                                    if (a2.f32770h.length() > 8) {
                                        c7744b.f40236c = a2.f32770h;
                                        break;
                                    }
                                    c7744b.f40237d = a2.f32770h;
                                    break;
                            }
                        }
                        if (!TextUtils.isEmpty(a2.f32771i)) {
                            c7744b.f40238e = a2.f32771i;
                        }
                        c7744b.f40239f = ((Long) com.google.android.wallet.a.a.b.a()).longValue();
                        if (!TextUtils.isEmpty(Build.DEVICE)) {
                            c7744b.f40240g = Build.DEVICE;
                        }
                        if (!TextUtils.isEmpty(Build.PRODUCT)) {
                            c7744b.f40241h = Build.PRODUCT;
                        }
                        if (!TextUtils.isEmpty(Build.MODEL)) {
                            c7744b.f40242i = Build.MODEL;
                        }
                        if (!TextUtils.isEmpty(Build.MANUFACTURER)) {
                            c7744b.f40243j = Build.MANUFACTURER;
                        }
                        if (!TextUtils.isEmpty(Build.FINGERPRINT)) {
                            c7744b.f40244k = Build.FINGERPRINT;
                        }
                        if (!TextUtils.isEmpty(VERSION.RELEASE)) {
                            c7744b.f40245l = VERSION.RELEASE;
                        }
                        if (!TextUtils.isEmpty(Build.BRAND)) {
                            c7744b.f40246m = Build.BRAND;
                        }
                        if (!TextUtils.isEmpty(Build.SERIAL)) {
                            c7744b.f40247n = Build.SERIAL;
                        }
                        c7743a.f40232a = c7744b;
                        c7743a.f40233b = C6600l.m29943a(context, packageInfo, packageInfo3, a2, elapsedRealtime);
                        cVar2.C = c7743a;
                        dVar = new d();
                        if (bArr != null) {
                            dVar.b = bArr;
                        }
                        dVar.a = -1;
                        dVar.a = 0;
                        dVar.c = cVar2;
                        locale = context.getResources().getConfiguration().locale;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(locale.getLanguage());
                        country = locale.getCountry();
                        variant = locale.getVariant();
                        if (!TextUtils.isEmpty(country)) {
                            stringBuilder.append('-').append(country);
                        }
                        if (!TextUtils.isEmpty(variant)) {
                            stringBuilder.append('-').append(variant);
                        }
                        dVar.d = stringBuilder.toString();
                        dVar.e = 2;
                        dVar.f = packageInfo != null ? (long) packageInfo.versionCode : 0;
                        dVar.g = Long.toString(UUID.randomUUID().getLeastSignificantBits());
                        dVar.i = false;
                        if (dVar.a == 0) {
                            cVar = dVar.c;
                        } else {
                            cVar = null;
                        }
                        cVar.D = C6589a.m29900d(context) ? new int[]{2} : C7222l.f35472e;
                        return dVar;
                    }
                }
                packageInfo = packageInfo2;
            } catch (NameNotFoundException e3) {
                packageInfo2 = null;
                packageInfo = packageInfo2;
                if (packageInfo != null) {
                    cVar2.m = packageName;
                    cVar2.n = Integer.toString(packageInfo.versionCode);
                    if (TextUtils.isEmpty(packageInfo.versionName)) {
                        cVar2.o = packageInfo.versionName;
                    }
                }
                packageInfo3 = null;
                if (TextUtils.isEmpty(str)) {
                    cVar2.p = str;
                    c6603o = C6600l.m29941a(packageManager, str, elapsedRealtime);
                    if (c6603o != null) {
                        packageInfo3 = c6603o.f32762b;
                    }
                }
                cVar2.E = C6600l.m29956a(packageManager, elapsedRealtime);
                if (f32742g == null) {
                    f32742g = Boolean.valueOf(packageManager.hasSystemFeature("android.software.leanback"));
                }
                if (f32742g.booleanValue()) {
                    cVar2.r = C6591c.m29912b(cVar2.r, 1);
                }
                if (f32741f == null) {
                    f32741f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
                }
                if (f32741f.booleanValue()) {
                    cVar2.r = C6591c.m29912b(cVar2.r, 3);
                }
                if (i != 1) {
                    cVar2.r = C6591c.m29912b(cVar2.r, 4);
                } else if (i == 2) {
                    cVar2.r = C6591c.m29912b(cVar2.r, 5);
                }
                intent = new Intent("com.google.android.gms.ocr.ACTION_CARD_CAPTURE");
                intent.setPackage("com.google.android.gms");
                cVar2.r = C6591c.m29912b(cVar2.r, 2);
                connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                a = C6600l.m29931a(connectivityManager, (WifiManager) context.getSystemService("wifi"));
                cVar2.z = a;
                cVar2.A = a;
                if (VERSION.SDK_INT >= 16) {
                    if (connectivityManager == null) {
                    }
                    cVar2.B = z2;
                }
                c7743a = new C7743a();
                c7744b = new C7744b();
                c7744b.f40234a = 0;
                if (TextUtils.isEmpty(a2.f32770h)) {
                    switch (a2.f32764b) {
                        case 1:
                            c7744b.f40235b = a2.f32770h;
                            break;
                        case 2:
                            if (a2.f32770h.length() > 8) {
                                c7744b.f40237d = a2.f32770h;
                                break;
                            }
                            c7744b.f40236c = a2.f32770h;
                            break;
                    }
                }
                if (TextUtils.isEmpty(a2.f32771i)) {
                    c7744b.f40238e = a2.f32771i;
                }
                c7744b.f40239f = ((Long) com.google.android.wallet.a.a.b.a()).longValue();
                if (TextUtils.isEmpty(Build.DEVICE)) {
                    c7744b.f40240g = Build.DEVICE;
                }
                if (TextUtils.isEmpty(Build.PRODUCT)) {
                    c7744b.f40241h = Build.PRODUCT;
                }
                if (TextUtils.isEmpty(Build.MODEL)) {
                    c7744b.f40242i = Build.MODEL;
                }
                if (TextUtils.isEmpty(Build.MANUFACTURER)) {
                    c7744b.f40243j = Build.MANUFACTURER;
                }
                if (TextUtils.isEmpty(Build.FINGERPRINT)) {
                    c7744b.f40244k = Build.FINGERPRINT;
                }
                if (TextUtils.isEmpty(VERSION.RELEASE)) {
                    c7744b.f40245l = VERSION.RELEASE;
                }
                if (TextUtils.isEmpty(Build.BRAND)) {
                    c7744b.f40246m = Build.BRAND;
                }
                if (TextUtils.isEmpty(Build.SERIAL)) {
                    c7744b.f40247n = Build.SERIAL;
                }
                c7743a.f40232a = c7744b;
                c7743a.f40233b = C6600l.m29943a(context, packageInfo, packageInfo3, a2, elapsedRealtime);
                cVar2.C = c7743a;
                dVar = new d();
                if (bArr != null) {
                    dVar.b = bArr;
                }
                dVar.a = -1;
                dVar.a = 0;
                dVar.c = cVar2;
                locale = context.getResources().getConfiguration().locale;
                stringBuilder = new StringBuilder();
                stringBuilder.append(locale.getLanguage());
                country = locale.getCountry();
                variant = locale.getVariant();
                if (TextUtils.isEmpty(country)) {
                    stringBuilder.append('-').append(country);
                }
                if (TextUtils.isEmpty(variant)) {
                    stringBuilder.append('-').append(variant);
                }
                dVar.d = stringBuilder.toString();
                dVar.e = 2;
                if (packageInfo != null) {
                }
                dVar.f = packageInfo != null ? (long) packageInfo.versionCode : 0;
                dVar.g = Long.toString(UUID.randomUUID().getLeastSignificantBits());
                dVar.i = false;
                if (dVar.a == 0) {
                    cVar = null;
                } else {
                    cVar = dVar.c;
                }
                if (C6589a.m29900d(context)) {
                }
                cVar.D = C6589a.m29900d(context) ? new int[]{2} : C7222l.f35472e;
                return dVar;
            }
        }
        if (packageInfo != null) {
            cVar2.m = packageName;
            cVar2.n = Integer.toString(packageInfo.versionCode);
            if (TextUtils.isEmpty(packageInfo.versionName)) {
                cVar2.o = packageInfo.versionName;
            }
        }
        packageInfo3 = null;
        if (TextUtils.isEmpty(str)) {
            cVar2.p = str;
            c6603o = C6600l.m29941a(packageManager, str, elapsedRealtime);
            if (c6603o != null) {
                packageInfo3 = c6603o.f32762b;
            }
        }
        cVar2.E = C6600l.m29956a(packageManager, elapsedRealtime);
        if (f32742g == null) {
            f32742g = Boolean.valueOf(packageManager.hasSystemFeature("android.software.leanback"));
        }
        if (f32742g.booleanValue()) {
            cVar2.r = C6591c.m29912b(cVar2.r, 1);
        }
        if (f32741f == null) {
            f32741f = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (f32741f.booleanValue()) {
            cVar2.r = C6591c.m29912b(cVar2.r, 3);
        }
        if (i != 1) {
            cVar2.r = C6591c.m29912b(cVar2.r, 4);
        } else if (i == 2) {
            cVar2.r = C6591c.m29912b(cVar2.r, 5);
        }
        intent = new Intent("com.google.android.gms.ocr.ACTION_CARD_CAPTURE");
        intent.setPackage("com.google.android.gms");
        if (z && packageManager.resolveActivity(intent, 65536) != null) {
            cVar2.r = C6591c.m29912b(cVar2.r, 2);
        }
        connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        a = C6600l.m29931a(connectivityManager, (WifiManager) context.getSystemService("wifi"));
        cVar2.z = a;
        cVar2.A = a;
        if (VERSION.SDK_INT >= 16) {
            z2 = connectivityManager == null && connectivityManager.isActiveNetworkMetered();
            cVar2.B = z2;
        }
        c7743a = new C7743a();
        c7744b = new C7744b();
        c7744b.f40234a = 0;
        if (TextUtils.isEmpty(a2.f32770h)) {
            switch (a2.f32764b) {
                case 1:
                    c7744b.f40235b = a2.f32770h;
                    break;
                case 2:
                    if (a2.f32770h.length() > 8) {
                        c7744b.f40236c = a2.f32770h;
                        break;
                    }
                    c7744b.f40237d = a2.f32770h;
                    break;
            }
        }
        if (TextUtils.isEmpty(a2.f32771i)) {
            c7744b.f40238e = a2.f32771i;
        }
        c7744b.f40239f = ((Long) com.google.android.wallet.a.a.b.a()).longValue();
        if (TextUtils.isEmpty(Build.DEVICE)) {
            c7744b.f40240g = Build.DEVICE;
        }
        if (TextUtils.isEmpty(Build.PRODUCT)) {
            c7744b.f40241h = Build.PRODUCT;
        }
        if (TextUtils.isEmpty(Build.MODEL)) {
            c7744b.f40242i = Build.MODEL;
        }
        if (TextUtils.isEmpty(Build.MANUFACTURER)) {
            c7744b.f40243j = Build.MANUFACTURER;
        }
        if (TextUtils.isEmpty(Build.FINGERPRINT)) {
            c7744b.f40244k = Build.FINGERPRINT;
        }
        if (TextUtils.isEmpty(VERSION.RELEASE)) {
            c7744b.f40245l = VERSION.RELEASE;
        }
        if (TextUtils.isEmpty(Build.BRAND)) {
            c7744b.f40246m = Build.BRAND;
        }
        if (TextUtils.isEmpty(Build.SERIAL)) {
            c7744b.f40247n = Build.SERIAL;
        }
        c7743a.f40232a = c7744b;
        c7743a.f40233b = C6600l.m29943a(context, packageInfo, packageInfo3, a2, elapsedRealtime);
        cVar2.C = c7743a;
        dVar = new d();
        if (bArr != null) {
            dVar.b = bArr;
        }
        dVar.a = -1;
        dVar.a = 0;
        dVar.c = cVar2;
        locale = context.getResources().getConfiguration().locale;
        stringBuilder = new StringBuilder();
        stringBuilder.append(locale.getLanguage());
        country = locale.getCountry();
        variant = locale.getVariant();
        if (TextUtils.isEmpty(country)) {
            stringBuilder.append('-').append(country);
        }
        if (TextUtils.isEmpty(variant)) {
            stringBuilder.append('-').append(variant);
        }
        dVar.d = stringBuilder.toString();
        dVar.e = 2;
        if (packageInfo != null) {
        }
        dVar.f = packageInfo != null ? (long) packageInfo.versionCode : 0;
        dVar.g = Long.toString(UUID.randomUUID().getLeastSignificantBits());
        dVar.i = false;
        if (dVar.a == 0) {
            cVar = dVar.c;
        } else {
            cVar = null;
        }
        if (C6589a.m29900d(context)) {
        }
        cVar.D = C6589a.m29900d(context) ? new int[]{2} : C7222l.f35472e;
        return dVar;
    }

    private static C6603o m29941a(PackageManager packageManager, String str, long j) {
        C6603o c6603o = (C6603o) f32737b.a(str);
        if (c6603o != null && j - c6603o.f32761a <= ((long) ((Integer) com.google.android.wallet.a.a.s.a()).intValue())) {
            return c6603o;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return c6603o;
            }
            C6603o c6603o2 = new C6603o(j, packageInfo);
            try {
                f32737b.a(str, c6603o2);
                return c6603o2;
            } catch (NameNotFoundException e) {
                return c6603o2;
            }
        } catch (NameNotFoundException e2) {
            return c6603o;
        }
    }

    private static a[] m29956a(PackageManager packageManager, long j) {
        int i = 0;
        if (f32755t == null || j - f32756u <= ((long) ((Integer) com.google.android.wallet.a.a.v.a()).intValue())) {
            List queryIntentActivities = packageManager.queryIntentActivities(new Intent("com.google.android.payments.standard.AUTHENTICATE_V1"), 0);
            List queryIntentServices = packageManager.queryIntentServices(new Intent("com.google.android.wallet.carrierbilling.operatorproperties.BIND"), 0);
            HashMap hashMap = new HashMap(queryIntentActivities.size() + queryIntentServices.size());
            C6600l.m29948a(hashMap, queryIntentActivities);
            C6600l.m29962b(hashMap, queryIntentServices);
            f32755t = new a[hashMap.size()];
            for (String str : hashMap.keySet()) {
                f32755t[i] = new a();
                f32755t[i].b = str;
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
                    f32755t[i].c = Integer.toString(packageInfo.versionCode);
                } catch (NameNotFoundException e) {
                }
                queryIntentActivities = (List) hashMap.get(str);
                f32755t[i].d = (b[]) queryIntentActivities.toArray(new b[queryIntentActivities.size()]);
                i++;
            }
            f32756u = j;
        }
        return f32755t;
    }

    private static void m29948a(HashMap hashMap, List list) {
        if (!list.isEmpty()) {
            b bVar = new b();
            bVar.b = 1;
            bVar.c = 1;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((ResolveInfo) list.get(i)).activityInfo.packageName;
                List list2 = (List) hashMap.get(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(str, list2);
                }
                list2.add(bVar);
            }
        }
    }

    private static void m29962b(HashMap hashMap, List list) {
        if (!list.isEmpty()) {
            b bVar = new b();
            bVar.b = 2;
            bVar.c = 1;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((ResolveInfo) list.get(i)).serviceInfo.packageName;
                List list2 = (List) hashMap.get(str);
                if (list2 == null) {
                    list2 = new ArrayList();
                    hashMap.put(str, list2);
                }
                list2.add(bVar);
            }
        }
    }

    private static String m29967d(Context context) {
        Uri withAppendedPath;
        Cursor query;
        Throwable th;
        String str = null;
        if (VERSION.SDK_INT >= 19) {
            withAppendedPath = Uri.withAppendedPath(Carriers.CONTENT_URI, "preferapn");
        } else {
            withAppendedPath = Uri.parse("content://telephony/carriers/preferapn");
        }
        try {
            query = context.getContentResolver().query(withAppendedPath, f32738c, null, null, null);
            while (query != null) {
                try {
                    if (!query.moveToNext()) {
                        break;
                    }
                    str = query.getString(0);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (query != null) {
                query.close();
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    @TargetApi(22)
    private static int m29929a(TelephonyManager telephonyManager, SubscriptionManager subscriptionManager) {
        if (telephonyManager == null || subscriptionManager == null) {
            return -1;
        }
        String simSerialNumber = telephonyManager.getSimSerialNumber();
        List activeSubscriptionInfoList = subscriptionManager.getActiveSubscriptionInfoList();
        if (activeSubscriptionInfoList == null) {
            return -1;
        }
        int size = activeSubscriptionInfoList.size();
        for (int i = 0; i < size; i++) {
            SubscriptionInfo subscriptionInfo = (SubscriptionInfo) activeSubscriptionInfoList.get(i);
            if (C6598j.m29927a(subscriptionInfo.getIccId(), simSerialNumber)) {
                return subscriptionInfo.getSubscriptionId();
            }
        }
        return -1;
    }

    @TargetApi(22)
    private static String m29961b(Context context, int i) {
        Throwable th;
        String str = null;
        Cursor query;
        try {
            query = context.getContentResolver().query(Uri.withAppendedPath(Carriers.CONTENT_URI, String.format("preferapn/subId/%s", new Object[]{Integer.valueOf(i)})), f32738c, null, null, null);
            while (query != null) {
                try {
                    if (!query.moveToNext()) {
                        break;
                    }
                    str = query.getString(0);
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            if (query != null) {
                query.close();
            }
            return str;
        } catch (Throwable th3) {
            th = th3;
            query = null;
            if (query != null) {
                query.close();
            }
            throw th;
        }
    }

    @TargetApi(22)
    private static C6604p m29942a(Context context, long j) {
        if (f32751p == null || j - f32752q > ((long) ((Integer) com.google.android.wallet.a.a.t.a()).intValue())) {
            SubscriptionManager subscriptionManager;
            String subscriberId;
            String networkOperator;
            String simOperatorName;
            String line1Number;
            int i;
            String str;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool = null;
            Integer num = null;
            boolean a = C6607s.m29980a(context, "android.permission.READ_PHONE_STATE");
            if (a && ((Boolean) com.google.android.wallet.a.a.x.a()).booleanValue()) {
                SubscriptionManager subscriptionManager2;
                if (VERSION.SDK_INT >= 22) {
                    subscriptionManager2 = (SubscriptionManager) context.getSystemService("telephony_subscription_service");
                } else {
                    subscriptionManager2 = null;
                }
                if (subscriptionManager2 != null) {
                    num = Integer.valueOf(subscriptionManager2.getActiveSubscriptionInfoCount());
                    subscriptionManager = subscriptionManager2;
                } else {
                    subscriptionManager = subscriptionManager2;
                }
            } else {
                subscriptionManager = null;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                int phoneType = a ? telephonyManager.getPhoneType() : 0;
                subscriberId = a ? telephonyManager.getSubscriberId() : null;
                String str5 = (String) com.google.android.wallet.a.a.d.a();
                if (TextUtils.isEmpty(str5)) {
                    str2 = telephonyManager.getSimOperator();
                } else {
                    new Handler(Looper.getMainLooper()).post(new C6602n(context, str5));
                    str2 = str5;
                }
                networkOperator = telephonyManager.getNetworkOperator();
                simOperatorName = telephonyManager.getSimOperatorName();
                if (a) {
                    try {
                        str5 = telephonyManager.getDeviceId();
                    } catch (StringIndexOutOfBoundsException e) {
                    }
                } else {
                    str5 = null;
                }
                str4 = str5;
                if (VERSION.SDK_INT >= 18) {
                    str3 = a ? telephonyManager.getGroupIdLevel1() : null;
                }
                if (a) {
                    line1Number = telephonyManager.getLine1Number();
                } else {
                    line1Number = null;
                }
                String str6;
                String str7;
                if (!((Boolean) com.google.android.wallet.a.a.x.a()).booleanValue() || VERSION.SDK_INT < 21) {
                    i = phoneType;
                    str6 = str4;
                    str4 = simOperatorName;
                    simOperatorName = str6;
                    str7 = networkOperator;
                    networkOperator = line1Number;
                    line1Number = str7;
                } else {
                    bool = Boolean.valueOf(telephonyManager.isSmsCapable());
                    i = phoneType;
                    str6 = str4;
                    str4 = simOperatorName;
                    simOperatorName = str6;
                    str7 = networkOperator;
                    networkOperator = line1Number;
                    line1Number = str7;
                }
            } else {
                i = 0;
                str4 = null;
                subscriberId = null;
                networkOperator = null;
                line1Number = null;
                simOperatorName = null;
            }
            if (!a || !((Boolean) com.google.android.wallet.a.a.x.a()).booleanValue()) {
                str = null;
            } else if (VERSION.SDK_INT < 22) {
                str = C6600l.m29967d(context);
            } else {
                int defaultSubscriptionId;
                if (VERSION.SDK_INT >= 24) {
                    defaultSubscriptionId = SubscriptionManager.getDefaultSubscriptionId();
                } else {
                    defaultSubscriptionId = C6600l.m29929a(telephonyManager, subscriptionManager);
                }
                str = C6600l.m29961b(context, defaultSubscriptionId);
            }
            f32751p = new C6604p(a, i, subscriberId, str2, str4, line1Number, str3, simOperatorName, networkOperator, str, bool, num);
            f32752q = j;
        }
        return f32751p;
    }

    @TargetApi(17)
    private static C7745c m29943a(Context context, PackageInfo packageInfo, PackageInfo packageInfo2, C6604p c6604p, long j) {
        C7746d c7746d;
        int intExtra;
        ContentResolver contentResolver;
        C7745c c7745c = new C7745c();
        if (packageInfo != null) {
            C6600l.m29947a(c7745c, packageInfo);
        }
        if (packageInfo2 != null) {
            C6600l.m29947a(c7745c, packageInfo2);
        }
        if (f32745j == null || j - f32746k > ((long) ((Integer) com.google.android.wallet.a.a.p.a()).intValue())) {
            if (C6607s.m29979a(context)) {
                Location lastKnownLocation = ((LocationManager) context.getSystemService("location")).getLastKnownLocation("network");
                if (lastKnownLocation != null) {
                    c7746d = new C7746d();
                    c7746d.f40261b = lastKnownLocation.getLatitude();
                    c7746d.f40262c = lastKnownLocation.getLongitude();
                    c7746d.f40264e = (double) lastKnownLocation.getTime();
                    c7746d.f40260a = lastKnownLocation.getAltitude();
                    c7746d.f40263d = lastKnownLocation.getAccuracy();
                    f32745j = c7746d;
                    f32746k = j;
                }
            }
            c7746d = null;
        } else {
            c7746d = f32745j;
        }
        c7745c.f40252e = c7746d;
        if (f32743h == null || j - f32744i > ((long) ((Integer) com.google.android.wallet.a.a.q.a()).intValue())) {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                intExtra = registerReceiver.getIntExtra("scale", -1);
                if (intExtra > 0) {
                    f32743h = Integer.valueOf((intExtra2 * 100) / intExtra);
                    f32744i = j;
                    intExtra = f32743h.intValue();
                }
            }
            intExtra = -1;
        } else {
            intExtra = f32743h.intValue();
        }
        if (intExtra != -1) {
            c7745c.f40250c = intExtra;
        }
        c7745c.f40251d = (long) TimeZone.getDefault().getRawOffset();
        if (f32747l == null || j - f32748m > ((long) ((Integer) com.google.android.wallet.a.a.r.a()).intValue())) {
            contentResolver = context.getContentResolver();
            if (VERSION.SDK_INT < 17) {
                c7745c.f40253f = 1 == Secure.getInt(contentResolver, "adb_enabled", 0);
            } else {
                c7745c.f40253f = 1 == Global.getInt(contentResolver, "adb_enabled", 0);
            }
            f32747l = Boolean.valueOf(c7745c.f40253f);
            f32748m = j;
        } else {
            c7745c.f40253f = f32747l.booleanValue();
        }
        if (f32749n == null || j - f32750o > ((long) ((Integer) com.google.android.wallet.a.a.r.a()).intValue())) {
            contentResolver = context.getContentResolver();
            if (VERSION.SDK_INT < 17 || VERSION.SDK_INT >= 21) {
                c7745c.f40254g = 1 == Secure.getInt(contentResolver, "install_non_market_apps", 0);
            } else {
                c7745c.f40254g = 1 == Global.getInt(contentResolver, "install_non_market_apps", 0);
            }
            f32749n = Boolean.valueOf(c7745c.f40254g);
            f32750o = j;
        } else {
            c7745c.f40254g = f32749n.booleanValue();
        }
        Locale locale = context.getResources().getConfiguration().locale;
        try {
            c7745c.f40255h = locale.getISO3Language();
        } catch (MissingResourceException e) {
        }
        c7745c.f40257j = locale.toString();
        ArrayList a = C6597i.m29926a();
        c7745c.f40256i = new String[a.size()];
        int size = a.size();
        for (int i = 0; i < size; i++) {
            c7745c.f40256i[i] = ((InetAddress) a.get(i)).getHostAddress();
        }
        if (!TextUtils.isEmpty(c6604p.f32768f)) {
            c7745c.f40258k = c6604p.f32768f;
        }
        if (!TextUtils.isEmpty(c6604p.f32766d)) {
            c7745c.f40259l = c6604p.f32766d;
        }
        return c7745c;
    }

    private static void m29947a(C7745c c7745c, PackageInfo packageInfo) {
        Object c7747e = new C7747e();
        if (!TextUtils.isEmpty(packageInfo.packageName)) {
            c7747e.f40266b = packageInfo.packageName;
        }
        c7747e.f40267c = Integer.toString(packageInfo.versionCode);
        c7747e.f40269e = packageInfo.firstInstallTime;
        c7747e.f40268d = packageInfo.lastUpdateTime;
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if (!(applicationInfo == null || TextUtils.isEmpty(applicationInfo.sourceDir))) {
            c7747e.f40270f = applicationInfo.sourceDir;
        }
        c7745c.f40248a = (C7747e[]) C6591c.m29910a(c7745c.f40248a, c7747e);
    }

    public static com.google.a.a.a.a.b.a.a.d.a.a m29936a(com.google.a.a.a.a.b.a.a.d.a.c cVar, String str) {
        if (cVar == null) {
            return null;
        }
        int length = cVar.b.length;
        for (int i = 0; i < length; i++) {
            if (C6598j.m29927a(str, cVar.b[i].b)) {
                return cVar.b[i].c;
            }
        }
        return cVar.a;
    }

    private static String m29970f(String str) {
        try {
            return Base64.encodeToString(C6600l.m29955a(str.getBytes("UTF-8")), 11);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] m29955a(byte[] bArr) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            instance.update(bArr);
            return instance.digest();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public static q m29933a(Context context) {
        return C6600l.m29964c(context, ((Integer) C6489e.f32497c.a()).intValue());
    }

    private static synchronized q m29964c(Context context, int i) {
        q qVar;
        synchronized (C6600l.class) {
            if (f32739d == null) {
                f32739d = new q(C6573a.m29822b(context), new C6592d(context, i));
            }
            qVar = f32739d;
        }
        return qVar;
    }

    public static boolean m29968d(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() == 1) {
            char charAt = str.charAt(0);
            if (charAt == '0' || charAt == '1') {
                return false;
            }
            return true;
        } else if (str.length() == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean m29969e(String str) {
        if (str == null) {
            return false;
        }
        if (str.length() == 1) {
            if (str.charAt(0) > '3') {
                return true;
            }
            return false;
        } else if (str.length() == 2) {
            return true;
        } else {
            return false;
        }
    }

    public static Map m29945a(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return null;
        }
        int length = strArr.length;
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Header arrays must have matching names and values");
        }
        Map aVar = new android.support.v4.h.a(length / 2);
        for (int i = 0; i < length; i += 2) {
            if (TextUtils.isEmpty(strArr[i])) {
                throw new IllegalArgumentException("Header names must be non empty.");
            }
            aVar.put(strArr[i], strArr[i + 1]);
        }
        return aVar;
    }

    public static boolean m29954a(String str, int i) {
        switch (i) {
            case 1:
                return true;
            case 2:
                int length = str.length() - 1;
                boolean z = false;
                int i2 = 0;
                while (length >= 0) {
                    boolean z2;
                    int parseInt = Integer.parseInt(str.substring(length, length + 1));
                    if (z) {
                        parseInt *= 2;
                        if (parseInt > 9) {
                            parseInt -= 9;
                        }
                    }
                    i2 += parseInt;
                    if (z) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    length--;
                    z = z2;
                }
                if (i2 % 10 != 0) {
                    return false;
                }
                return true;
            default:
                Log.d("PaymentUtils", "Unexpected checksum type=" + i);
                return true;
        }
    }

    public static boolean m29963b(Context context) {
        if (f32740e == null && context != null) {
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (VERSION.SDK_INT >= 19) {
                f32740e = Boolean.valueOf(activityManager.isLowRamDevice());
            } else {
                MemoryInfo memoryInfo = new MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                f32740e = Boolean.valueOf(memoryInfo.lowMemory);
            }
        }
        return C6598j.m29927a(f32740e, Boolean.TRUE);
    }

    public static String[] m29957a(Context context, C7176c c7176c) {
        if (c7176c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(c7176c.f35020a.length);
        for (String str : c7176c.f35020a) {
            if (!C6607s.m29980a(context, str)) {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean m29949a(Activity activity, String[] strArr) {
        if (strArr == null) {
            return false;
        }
        for (String a : strArr) {
            if (android.support.v4.app.a.a(activity, a)) {
                return true;
            }
        }
        return false;
    }

    public static ac m29934a(CreditCardOcrResult creditCardOcrResult, int i) {
        int i2 = 1;
        ac acVar = new ac();
        acVar.b = 1;
        acVar.c = ci.m30880c(i);
        if (creditCardOcrResult != null) {
            Object obj = creditCardOcrResult.a;
            if (!TextUtils.isEmpty(obj)) {
                acVar.d = obj;
            }
            if (creditCardOcrResult.c < 0 || creditCardOcrResult.b == 0) {
                i2 = 0;
            }
            if (i2 != 0) {
                acVar.e = creditCardOcrResult.b;
                acVar.f = creditCardOcrResult.c;
            }
            Object obj2 = creditCardOcrResult.e;
            if (!TextUtils.isEmpty(obj2)) {
                acVar.g = obj2;
            }
            obj2 = creditCardOcrResult.f;
            if (!TextUtils.isEmpty(obj2)) {
                acVar.i = obj2;
            }
            acVar.h = creditCardOcrResult.d;
        }
        return acVar;
    }

    public static ac m29935a(C6690a c6690a, int i) {
        ac acVar = new ac();
        acVar.b = 2;
        acVar.c = ci.m30884d(i);
        if (c6690a != null) {
            if (c6690a.m30326a()) {
                acVar.d = c6690a.f33022a;
            }
            if (c6690a.m30327b()) {
                acVar.e = c6690a.f33023b;
                acVar.f = c6690a.f33024c;
            }
            if (c6690a.m30328c()) {
                acVar.g = c6690a.f33025d;
            }
        }
        return acVar;
    }

    public static int[] m29966c(Context context) {
        int i;
        boolean booleanValue;
        if (C6589a.f32728c == null) {
            C6589a.f32728c = Boolean.valueOf(((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4);
        }
        if (C6589a.f32728c.booleanValue()) {
            i = 0;
        } else {
            i = 1;
        }
        if (f32753r == null || SystemClock.elapsedRealtime() - f32754s >= ((long) ((Integer) com.google.android.wallet.a.a.w.a()).intValue())) {
            Context applicationContext = context.getApplicationContext();
            ServiceConnection c6605q = new C6605q();
            Boolean valueOf = Boolean.valueOf(android.support.b.b.a(applicationContext, "com.android.chrome", c6605q));
            f32753r = valueOf;
            if (valueOf.booleanValue()) {
                applicationContext.unbindService(c6605q);
            }
            f32754s = SystemClock.elapsedRealtime();
            booleanValue = f32753r.booleanValue();
        } else {
            booleanValue = f32753r.booleanValue();
        }
        if (i != 0 && booleanValue) {
            return new int[]{2, 3};
        }
        if (i != 0) {
            return new int[]{2};
        } else if (!booleanValue) {
            return C7222l.f35472e;
        } else {
            return new int[]{3};
        }
    }

    public static com.google.a.a.a.a.b.a.a.h.a.c m29937a(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            com.google.a.a.a.a.b.a.a.h.a.c cVar = (com.google.a.a.a.a.b.a.a.h.a.c) list.get(i);
            if (cVar.b == 2) {
                return cVar;
            }
        }
        return null;
    }

    public static Uri m29932a(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, new int[]{C6617a.uicFdlAppCode});
        String string = obtainStyledAttributes.getString(0);
        obtainStyledAttributes.recycle();
        return Uri.parse(String.format(Locale.US, "https://%1$s.app.goo.gl/?link=http%%3A%%2F%%2Funused.google.com&apn=%2$s&al=google-orchestration%%3A%%2F%%2Freturn", new Object[]{string, context.getPackageName()}));
    }

    private static long m29931a(ConnectivityManager connectivityManager, WifiManager wifiManager) {
        if (connectivityManager == null) {
            return 0;
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            return 0;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
                switch (activeNetworkInfo.getSubtype()) {
                    case 1:
                        return C6600l.m29959b(114.0d);
                    case 2:
                        return C6600l.m29959b(135.0d);
                    case 3:
                        return C6600l.m29959b(384.0d);
                    case 4:
                        return C6600l.m29959b(115.0d);
                    case 5:
                        return C6600l.m29959b(700.0d);
                    case 6:
                    case 14:
                        return C6600l.m29959b(900.0d);
                    case 7:
                        return C6600l.m29959b(70.0d);
                    case 8:
                        return C6600l.m29930a(1.8d);
                    case 9:
                    case 10:
                        return C6600l.m29930a(1.0d);
                    case 11:
                        return C6600l.m29959b(13.0d);
                    case 12:
                        return C6600l.m29930a(5.0d);
                    case 13:
                        return C6600l.m29930a(5.0d);
                    case 15:
                        return C6600l.m29930a(5.0d);
                    default:
                        return 0;
                }
            case 1:
                if (wifiManager == null) {
                    return 0;
                }
                try {
                    WifiInfo connectionInfo = wifiManager.getConnectionInfo();
                    if (connectionInfo != null) {
                        return C6600l.m29930a((double) connectionInfo.getLinkSpeed());
                    }
                    return 0;
                } catch (IllegalStateException e) {
                    return 0;
                } catch (NullPointerException e2) {
                    return 0;
                } catch (IllegalArgumentException e3) {
                    return 0;
                }
            case 6:
                return C6600l.m29930a(3.0d);
            case 9:
                return C6600l.m29930a(480.0d);
            default:
                return 0;
        }
    }

    private static long m29930a(double d) {
        return (long) ((1000000.0d * d) / 8.0d);
    }

    private static long m29959b(double d) {
        return (long) ((1000.0d * d) / 8.0d);
    }
}
