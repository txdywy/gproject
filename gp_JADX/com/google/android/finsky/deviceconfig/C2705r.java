package com.google.android.finsky.deviceconfig;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.UserManager;
import android.provider.Telephony.Carriers;
import android.support.v4.os.C0327a;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ax;
import com.google.android.finsky.utils.ba;
import com.google.wireless.android.b.a.a;
import com.google.wireless.android.b.a.d;
import com.google.wireless.android.finsky.dfe.nano.dk;
import com.google.wireless.android.finsky.dfe.nano.gt;
import com.google.wireless.android.p360b.p361a.C6333b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public final class C2705r extends C2693e {
    public Context f14861i;
    public C2703p f14862j;
    public C6333b f14863k;

    C2705r() {
        ((C1377d) C3947d.m18649a(C1377d.class)).mo1815a(this);
    }

    public final String mo3111a(String str) {
        return (String) C0954a.f5842l.m5777b(m14567b(str)).m5760a();
    }

    protected final void mo3113a(String str, String str2) {
        C0954a.f5842l.m5777b(m14567b(str)).m5763a((Object) str2);
    }

    public final void mo3112a(C1254c c1254c) {
        if (c1254c != null) {
            if (c1254c.mo1620b() != null) {
                C0954a.f5842l.m5777b(m14567b(c1254c.mo1636c())).m5765c();
            }
            c1254c.mo1642d();
        }
    }

    public final synchronized C6333b mo3115c() {
        C6333b c6333b;
        Object obj = 1;
        synchronized (this) {
            if (this.f14863k == null) {
                Object obj2;
                int i;
                boolean z;
                this.f14863k = new C6333b();
                Context context = this.f14861i;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                ConfigurationInfo deviceConfigurationInfo = activityManager.getDeviceConfigurationInfo();
                this.f14863k.f31728b = C2693e.m14554b(deviceConfigurationInfo.reqTouchScreen);
                this.f14863k.f31729c = C2693e.m14551a(deviceConfigurationInfo.reqKeyboardType);
                this.f14863k.f31730d = C2693e.m14556c(deviceConfigurationInfo.reqNavigation);
                this.f14863k.f31738l = deviceConfigurationInfo.reqGlEsVersion;
                Point point = new Point();
                if (VERSION.SDK_INT >= 27) {
                    point = ((DisplayManager) this.f14861i.getSystemService("display")).getStableDisplaySize();
                } else if (C4671b.m21784a()) {
                    r4 = new Point();
                    ((WindowManager) this.f14861i.getSystemService("window")).getDefaultDisplay().getRealSize(r4);
                    point = r4;
                } else {
                    r4 = new Point();
                    ((WindowManager) this.f14861i.getSystemService("window")).getDefaultDisplay().getSize(r4);
                    point = r4;
                }
                Point point2 = new Point(Math.min(point.x, point.y), Math.max(point.x, point.y));
                this.f14863k.m29011b(point2.x);
                this.f14863k.m29012c(point2.y);
                Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
                DisplayMetrics displayMetrics = new DisplayMetrics();
                if (VERSION.SDK_INT >= 17) {
                    defaultDisplay.getRealMetrics(displayMetrics);
                } else {
                    defaultDisplay.getMetrics(displayMetrics);
                }
                int i2 = displayMetrics.densityDpi;
                if (C0327a.m1721a()) {
                    obj2 = 1;
                    i = DisplayMetrics.DENSITY_DEVICE_STABLE;
                } else {
                    obj2 = null;
                    i = i2;
                }
                this.f14863k.f31735i = i;
                C6333b c6333b2 = this.f14863k;
                if ((deviceConfigurationInfo.reqInputFeatures & 1) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                c6333b2.f31733g = z;
                c6333b2 = this.f14863k;
                if ((deviceConfigurationInfo.reqInputFeatures & 2) > 0) {
                    z = true;
                } else {
                    z = false;
                }
                c6333b2.f31734h = z;
                Configuration configuration = context.getResources().getConfiguration();
                C6333b c6333b3 = this.f14863k;
                c6333b3.f31732f = C2693e.m14558d(configuration.screenLayout);
                c6333b3.f31727a |= 1;
                if (obj2 == null || !((Boolean) C0955b.gC.m28964b()).booleanValue()) {
                    i2 = configuration.screenLayout;
                } else {
                    float f = 160.0f / ((float) i);
                    int i3 = (int) (((float) point2.x) * f);
                    i = (int) (f * ((float) point2.y));
                    if (i < 470) {
                        i2 = 1;
                    } else {
                        if (i >= 960 && i3 >= 720) {
                            i2 = 4;
                        } else if (i < 640 || i3 < 480) {
                            i2 = 2;
                        } else {
                            i2 = 3;
                        }
                        if ((i * 3) / 5 >= i3 - 1) {
                            if (obj == null) {
                                i2 |= 16;
                            }
                        }
                    }
                    obj = null;
                    if (obj == null) {
                        i2 |= 16;
                    }
                }
                this.f14863k.f31731e = C2693e.m14558d(i2);
                this.f14863k.m29013d(configuration.smallestScreenWidthDp);
                this.f14863k.f31739m = context.getPackageManager().getSystemSharedLibraryNames();
                this.f14863k.f31743q = this.f14861i.getAssets().getLocales();
                C2703p c2703p = this.f14862j;
                Iterable arrayList = new ArrayList();
                boolean a = c2703p.f14859a.m14979a();
                String str = (String) C0968o.f5926c.m5760a();
                if (a || TextUtils.isEmpty(str)) {
                    Collection a2;
                    if (!((Boolean) C0968o.f5927d.m5760a()).booleanValue() || a) {
                        C0968o.f5927d.m5763a(Boolean.valueOf(true));
                        a2 = C2703p.m14580a();
                        C0968o.f5927d.m5765c();
                    } else {
                        a2 = new HashSet();
                        a2.add("_android_driver_crashed");
                    }
                    arrayList.addAll(a2);
                    Collections.sort(arrayList);
                    C0968o.f5926c.m5763a(TextUtils.join(" ", arrayList));
                } else {
                    arrayList.addAll(Arrays.asList(str.split(" ")));
                }
                this.f14863k.f31744r = (String[]) arrayList.toArray(new String[arrayList.size()]);
                if (VERSION.SDK_INT >= 19) {
                    this.f14863k.m29008a(activityManager.isLowRamDevice());
                }
                if (VERSION.SDK_INT >= 16) {
                    MemoryInfo memoryInfo = new MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    this.f14863k.m29007a(memoryInfo.totalMem);
                }
                if (VERSION.SDK_INT >= 18) {
                    this.f14863k.m29014e(Runtime.getRuntime().availableProcessors());
                }
                C2705r.m14584a(context, this.f14863k);
                this.f14863k.f31742p = ba.m21790a();
                Object a3 = ax.f24048a.mo4330a("ro.oem.key1", "");
                if (!TextUtils.isEmpty(a3)) {
                    c6333b3 = this.f14863k;
                    if (a3 == null) {
                        throw new NullPointerException();
                    }
                    c6333b3.f31727a |= 256;
                    c6333b3.f31751y = a3;
                }
            }
            c6333b = this.f14863k;
        }
        return c6333b;
    }

    private static void m14584a(android.content.Context r9, com.google.wireless.android.p360b.p361a.C6333b r10) {
        /* JADX: method processing error */
/*
Error: java.lang.IndexOutOfBoundsException: bitIndex < 0: -1
	at java.util.BitSet.get(BitSet.java:623)
	at jadx.core.dex.visitors.CodeShrinker$ArgsInfo.usedArgAssign(CodeShrinker.java:138)
	at jadx.core.dex.visitors.CodeShrinker$ArgsInfo.canMove(CodeShrinker.java:129)
	at jadx.core.dex.visitors.CodeShrinker$ArgsInfo.checkInline(CodeShrinker.java:92)
	at jadx.core.dex.visitors.CodeShrinker.shrinkBlock(CodeShrinker.java:223)
	at jadx.core.dex.visitors.CodeShrinker.shrinkMethod(CodeShrinker.java:38)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkArrayForEach(LoopRegionVisitor.java:196)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.checkForIndexedLoop(LoopRegionVisitor.java:119)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.processLoopRegion(LoopRegionVisitor.java:65)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.enterRegion(LoopRegionVisitor.java:52)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:56)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:58)
	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:18)
	at jadx.core.dex.visitors.regions.LoopRegionVisitor.visit(LoopRegionVisitor.java:46)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:199)
*/
        /*
        r1 = 0;
        r0 = r9.getPackageManager();
        r2 = r0.getSystemAvailableFeatures();
        if (r2 != 0) goto L_0x000c;
    L_0x000b:
        return;
    L_0x000c:
        r3 = new java.util.ArrayList;
        r0 = r2.length;
        r3.<init>(r0);
        r4 = r2.length;
        r0 = r1;
    L_0x0014:
        if (r0 >= r4) goto L_0x0051;
    L_0x0016:
        r5 = r2[r0];
        r6 = r5.name;
        r6 = android.text.TextUtils.isEmpty(r6);
        if (r6 != 0) goto L_0x004e;
    L_0x0020:
        r6 = new com.google.wireless.android.b.a.c;
        r6.<init>();
        r7 = r5.name;
        if (r7 != 0) goto L_0x002f;
    L_0x0029:
        r0 = new java.lang.NullPointerException;
        r0.<init>();
        throw r0;
    L_0x002f:
        r8 = r6.b;
        r8 = r8 | 1;
        r6.b = r8;
        r6.c = r7;
        r7 = android.support.v4.os.C0327a.m1721a();
        if (r7 == 0) goto L_0x004b;
    L_0x003d:
        r7 = r5.version;
        if (r7 == 0) goto L_0x004b;
    L_0x0041:
        r5 = r5.version;
        r7 = r6.b;
        r7 = r7 | 2;
        r6.b = r7;
        r6.d = r5;
    L_0x004b:
        r3.add(r6);
    L_0x004e:
        r0 = r0 + 1;
        goto L_0x0014;
    L_0x0051:
        r2 = r3.size();
        r0 = new com.google.wireless.android.b.a.c[r2];
        r0 = r3.toArray(r0);
        r0 = (com.google.wireless.android.b.a.c[]) r0;
        r10.f31741o = r0;
        r0 = new java.lang.String[r2];
        r10.f31740n = r0;
        r0 = r1;
    L_0x0064:
        if (r0 >= r2) goto L_0x000b;
    L_0x0066:
        r1 = r10.f31740n;
        r3 = r10.f31741o;
        r3 = r3[r0];
        r3 = r3.c;
        r1[r0] = r3;
        r0 = r0 + 1;
        goto L_0x0064;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.deviceconfig.r.a(android.content.Context, com.google.wireless.android.b.a.b):void");
    }

    public final a mo3116f() {
        Context context = this.f14861i;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return null;
        }
        if (telephonyManager.getSimState() == 1) {
            return new a();
        }
        if (telephonyManager.getSimState() != 5) {
            return null;
        }
        Object groupIdLevel1;
        a aVar = new a();
        d dVar = new d();
        aVar.a = dVar;
        try {
            String subscriberId = telephonyManager.getSubscriberId();
            if (!TextUtils.isEmpty(subscriberId)) {
                try {
                    long parseLong = (Long.parseLong(subscriberId) / 100000) * 100000;
                    dVar.a |= 1;
                    dVar.b = parseLong;
                } catch (NumberFormatException e) {
                    FinskyLog.m21665c("Cannot convert subscriber id to long: %s", FinskyLog.m21655a(subscriberId));
                }
            }
        } catch (SecurityException e2) {
            FinskyLog.m21659a("SecurityException when reading IMSI value, not setting IMSI so it will be cleared in the backend", new Object[0]);
        }
        try {
            Object simOperatorName = telephonyManager.getSimOperatorName();
            if (!TextUtils.isEmpty(simOperatorName)) {
                if (simOperatorName == null) {
                    throw new NullPointerException();
                }
                dVar.a |= 2;
                dVar.c = simOperatorName;
            }
        } catch (SecurityException e3) {
            FinskyLog.m21659a("SecurityException when reading SPN value, not setting SPN so it will be cleared in the backend", new Object[0]);
        }
        try {
            if (VERSION.SDK_INT >= 18) {
                groupIdLevel1 = telephonyManager.getGroupIdLevel1();
                if (!TextUtils.isEmpty(groupIdLevel1)) {
                    if (groupIdLevel1 == null) {
                        throw new NullPointerException();
                    }
                    dVar.a |= 4;
                    dVar.d = groupIdLevel1;
                }
            }
        } catch (SecurityException e4) {
            FinskyLog.m21659a("SecurityException when reading GID1 value, not setting GID1 so it will be cleared in the backend", new Object[0]);
        }
        if (((Boolean) C0955b.fX.m28964b()).booleanValue()) {
            try {
                groupIdLevel1 = C2705r.m14583a(context, this.c);
                if (!TextUtils.isEmpty(groupIdLevel1)) {
                    if (groupIdLevel1 == null) {
                        throw new NullPointerException();
                    }
                    dVar.a |= 8;
                    dVar.e = groupIdLevel1;
                }
            } catch (SecurityException e5) {
                FinskyLog.m21659a("SecurityException when reading APN value, not setting APN so it will be cleared in the backend", new Object[0]);
            }
        }
        return aVar;
    }

    private static String m14583a(Context context, C1461c c1461c) {
        Uri uri;
        String str = null;
        ContentResolver contentResolver = context.getContentResolver();
        if (C2705r.m14586c(context, c1461c)) {
            uri = Carriers.CONTENT_URI;
        } else {
            uri = Uri.parse("content://telephony/carriers/");
        }
        Cursor query = contentResolver.query(Uri.withAppendedPath(uri, "preferapn"), new String[]{C2705r.m14585b(context, c1461c)}, null, null, null);
        if (query != null) {
            try {
                int columnIndex = query.getColumnIndex(C2705r.m14585b(context, c1461c));
                if (columnIndex == -1) {
                    FinskyLog.m21665c("Requested APN column not present in the result cursor", new Object[0]);
                } else if (query.moveToNext()) {
                    str = query.getString(columnIndex);
                    query.close();
                } else {
                    query.close();
                }
            } catch (Exception e) {
                FinskyLog.m21665c("Failed to read APN: %s", e);
            } finally {
                query.close();
            }
        }
        return str;
    }

    private static String m14585b(Context context, C1461c c1461c) {
        C2705r.m14586c(context, c1461c);
        return "apn";
    }

    private static boolean m14586c(Context context, C1461c c1461c) {
        if (c1461c.dj().mo2294a(12641346) && C4671b.m21786c() && context.getPackageManager().hasSystemFeature("android.hardware.telephony")) {
            return true;
        }
        return false;
    }

    protected final gt mo3117g() {
        String str;
        int userCount;
        C2707t c2707t;
        long j;
        TelephonyManager telephonyManager;
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        Object extraInfo;
        long parseLong;
        gt gtVar = new gt();
        dk h = m14587h();
        if (h != null) {
            gtVar.b = h;
        }
        if (!TextUtils.isEmpty(Build.FINGERPRINT)) {
            str = Build.FINGERPRINT;
            if (str == null) {
                throw new NullPointerException();
            }
            gtVar.a |= 2;
            gtVar.d = str;
        }
        if (!TextUtils.isEmpty(Build.BRAND)) {
            str = Build.BRAND;
            if (str == null) {
                throw new NullPointerException();
            }
            gtVar.a |= 1;
            gtVar.c = str;
        }
        if (!(TextUtils.isEmpty(Build.MANUFACTURER) || "unknown".equals(Build.MANUFACTURER))) {
            str = Build.MANUFACTURER;
            if (str == null) {
                throw new NullPointerException();
            }
            gtVar.a |= 16;
            gtVar.g = str;
        }
        if (C4671b.m21784a() && this.f14861i.getPackageManager().checkPermission("android.permission.MANAGE_USERS", this.f14861i.getPackageName()) == 0) {
            UserManager userManager = (UserManager) this.f14861i.getSystemService("user");
            if (userManager != null) {
                userCount = userManager.getUserCount();
                gtVar.a |= 8;
                gtVar.f = userCount;
                c2707t = new C2707t(this.f14861i);
                userCount = (C4671b.m21788e() || c2707t.m14599d("android.permission.READ_PHONE_STATE")) ? 1 : 0;
                if (userCount != 0) {
                    FinskyLog.m21665c("Phonesky doesn't have read phone state permission", new Object[0]);
                    j = 0;
                } else {
                    telephonyManager = (TelephonyManager) c2707t.f14871e.getSystemService("phone");
                    if (telephonyManager == null) {
                        j = 0;
                    } else if (C0327a.m1722b()) {
                        str = telephonyManager.getDeviceId();
                        j = C2707t.m14597b(str);
                        if (j == 0) {
                            j = C2707t.m14598c(str);
                        }
                        if (j == 0) {
                            j = C2707t.m14596a(str);
                        }
                    } else {
                        j = C2707t.m14597b(telephonyManager.getImei());
                        if (j == 0) {
                            j = C2707t.m14598c(telephonyManager.getMeid());
                        }
                    }
                }
                if (j != 0) {
                    if (c2707t.m14599d("android.permission.ACCESS_NETWORK_STATE")) {
                        connectivityManager = (ConnectivityManager) c2707t.f14871e.getSystemService("connectivity");
                        if (connectivityManager != null) {
                            networkInfo = connectivityManager.getNetworkInfo(1);
                            if (networkInfo != null) {
                                extraInfo = networkInfo.getExtraInfo();
                                if (!TextUtils.isEmpty(extraInfo) && C2707t.f14870d.matcher(extraInfo).matches()) {
                                    parseLong = Long.parseLong(extraInfo.replace(":", "").replace("-", ""), 16) | 1369094286720630784L;
                                }
                            }
                        }
                    }
                    parseLong = 0;
                } else {
                    parseLong = j;
                }
                if (parseLong == 0) {
                    parseLong = C2707t.m14595a();
                }
                gtVar.a |= 4;
                gtVar.e = parseLong;
                return gtVar;
            }
        }
        userCount = 1;
        gtVar.a |= 8;
        gtVar.f = userCount;
        c2707t = new C2707t(this.f14861i);
        if (C4671b.m21788e()) {
        }
        if (userCount != 0) {
            telephonyManager = (TelephonyManager) c2707t.f14871e.getSystemService("phone");
            if (telephonyManager == null) {
                j = 0;
            } else if (C0327a.m1722b()) {
                str = telephonyManager.getDeviceId();
                j = C2707t.m14597b(str);
                if (j == 0) {
                    j = C2707t.m14598c(str);
                }
                if (j == 0) {
                    j = C2707t.m14596a(str);
                }
            } else {
                j = C2707t.m14597b(telephonyManager.getImei());
                if (j == 0) {
                    j = C2707t.m14598c(telephonyManager.getMeid());
                }
            }
        } else {
            FinskyLog.m21665c("Phonesky doesn't have read phone state permission", new Object[0]);
            j = 0;
        }
        if (j != 0) {
            parseLong = j;
        } else {
            if (c2707t.m14599d("android.permission.ACCESS_NETWORK_STATE")) {
                connectivityManager = (ConnectivityManager) c2707t.f14871e.getSystemService("connectivity");
                if (connectivityManager != null) {
                    networkInfo = connectivityManager.getNetworkInfo(1);
                    if (networkInfo != null) {
                        extraInfo = networkInfo.getExtraInfo();
                        parseLong = Long.parseLong(extraInfo.replace(":", "").replace("-", ""), 16) | 1369094286720630784L;
                    }
                }
            }
            parseLong = 0;
        }
        if (parseLong == 0) {
            parseLong = C2707t.m14595a();
        }
        gtVar.a |= 4;
        gtVar.e = parseLong;
        return gtVar;
    }

    protected final String mo3114b() {
        Long l = (Long) C0955b.m5748a().m28964b();
        if (l.longValue() == 0) {
            return null;
        }
        return Long.toHexString(l.longValue());
    }

    private final dk m14587h() {
        if (!C4671b.m21787d()) {
            return null;
        }
        DevicePolicyManager devicePolicyManager = (DevicePolicyManager) this.f14861i.getSystemService("device_policy");
        if (devicePolicyManager == null) {
            return null;
        }
        List<ComponentName> activeAdmins = devicePolicyManager.getActiveAdmins();
        if (activeAdmins == null) {
            return null;
        }
        for (ComponentName packageName : activeAdmins) {
            String packageName2 = packageName.getPackageName();
            boolean isDeviceOwnerApp = devicePolicyManager.isDeviceOwnerApp(packageName2);
            boolean isProfileOwnerApp = devicePolicyManager.isProfileOwnerApp(packageName2);
            if (!isDeviceOwnerApp) {
                if (isProfileOwnerApp) {
                }
            }
            try {
                byte[] toByteArray = this.f14861i.getPackageManager().getPackageInfo(packageName2, 64).signatures[0].toByteArray();
                String a = C2693e.m14553a(toByteArray, "SHA1");
                String a2 = C2693e.m14553a(toByteArray, "SHA256");
                dk dkVar = new dk();
                if (packageName2 == null) {
                    throw new NullPointerException();
                }
                dkVar.a |= 1;
                dkVar.b = packageName2;
                dkVar.e = isDeviceOwnerApp ? 1 : 2;
                dkVar.a |= 8;
                if (a != null) {
                    if (a == null) {
                        throw new NullPointerException();
                    }
                    dkVar.a |= 2;
                    dkVar.c = a;
                }
                if (a2 != null) {
                    if (a2 == null) {
                        throw new NullPointerException();
                    }
                    dkVar.a |= 4;
                    dkVar.d = a2;
                }
                return dkVar;
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Cannot find managing app package.", new Object[0]);
                return null;
            }
        }
        return null;
    }
}
