package com.google.android.finsky.cn.p175a;

import android.annotation.TargetApi;
import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.StrictMode;
import android.support.v4.os.C0327a;
import com.google.android.finsky.ak.C1215q;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.ds.C2885b;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4830g;
import com.google.android.finsky.p2p.C3842a;
import com.google.android.finsky.p2p.C3847f;
import com.google.android.finsky.p2p.FrostingUtil;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4688t;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.finsky.c.a.k;
import com.google.wireless.android.finsky.c.a.l;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class C2321a implements C2320a, C0983h {
    public static final C2322b f11408a = new C2322b(null, null, null, false, false, false, false, -1, 0, 0, false, -1, -1, false, null);
    public final Context f11409b;
    public final PackageManager f11410c;
    public final Map f11411d = new HashMap();
    public final DevicePolicyManager f11412e;
    public final C2885b f11413f;
    public final C1461c f11414g;
    public final FrostingUtil f11415h;

    private static String[] m11873a(PackageInfo packageInfo) {
        int length = packageInfo.signatures.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = C4688t.m21838a(packageInfo.signatures[i].toByteArray());
        }
        return strArr;
    }

    public C2321a(Context context, C3600b c3600b, DevicePolicyManager devicePolicyManager, C2885b c2885b, C1461c c1461c, FrostingUtil frostingUtil) {
        this.f11409b = context;
        this.f11410c = c3600b.f17918e;
        this.f11412e = devicePolicyManager;
        this.f11413f = c2885b;
        this.f11414g = c1461c;
        this.f11415h = frostingUtil;
    }

    public final synchronized C2322b mo2854a(String str) {
        C2322b c2322b;
        c2322b = (C2322b) this.f11411d.get(str);
        if (c2322b == null) {
            c2322b = m11872a(str, false);
        }
        if (c2322b.equals(f11408a)) {
            c2322b = null;
        }
        return c2322b;
    }

    public final Collection mo2855a() {
        StrictMode.noteSlowCall("PackageManagerRepository.getAllBlocking");
        List<PackageInfo> installedPackages = this.f11410c.getInstalledPackages(192);
        Collection arrayList = new ArrayList(installedPackages.size());
        for (PackageInfo b : installedPackages) {
            C2322b b2 = m11874b(b);
            if (!b2.equals(f11408a)) {
                arrayList.add(b2);
            }
        }
        return arrayList;
    }

    public final synchronized void mo2856b(String str) {
        this.f11411d.remove(str);
    }

    @TargetApi(21)
    public final boolean mo2857c(String str) {
        if (C1503a.m8830a(this.f11409b)) {
            if (this.f11410c.getLeanbackLaunchIntentForPackage(str) != null) {
                return true;
            }
            return false;
        } else if (this.f11410c.getLaunchIntentForPackage(str) == null) {
            return false;
        } else {
            return true;
        }
    }

    public final String mo2858f(String str) {
        try {
            return this.f11410c.getPackageInfo(str, 0).versionName;
        } catch (NameNotFoundException e) {
            return null;
        }
    }

    public final int mo2859g(String str) {
        try {
            return this.f11410c.getPackageInfo(str, 0).versionCode;
        } catch (NameNotFoundException e) {
            return -1;
        }
    }

    private final C2322b m11874b(PackageInfo packageInfo) {
        try {
            if (C3600b.m17189a(packageInfo.applicationInfo)) {
                return f11408a;
            }
            int i;
            boolean z;
            boolean z2;
            int b;
            String[] strArr;
            int i2 = packageInfo.versionCode;
            if (packageInfo.applicationInfo.metaData == null) {
                i = 0;
            } else {
                i = packageInfo.applicationInfo.metaData.getInt("com.android.vending.derived.apk.id", 0);
            }
            long j = 0;
            if (this.f11414g.dj().mo2294a(12637130)) {
                long j2;
                FrostingUtil frostingUtil = this.f11415h;
                if (bb.m21795c()) {
                    FinskyLog.m21659a("Frosting ID looked up on UI thread. Caller should move to a background thread.", new Object[0]);
                }
                List list = (List) C4830g.m22622a(frostingUtil.f19219a.f19220a.mo1519a(new C1215q(packageInfo.packageName).m7191a("last_updated", Long.valueOf(packageInfo.lastUpdateTime))));
                if (list == null || list.size() != 1) {
                    C4809e a;
                    k b2 = FrostingUtil.m18314b(packageInfo);
                    C3842a c3842a = frostingUtil.f19219a;
                    if (packageInfo == null) {
                        a = c3842a.f19221b.mo4402a(null);
                    } else {
                        Object lVar = new l();
                        String str = packageInfo.packageName;
                        if (str == null) {
                            throw new NullPointerException();
                        }
                        lVar.a |= 1;
                        lVar.b = str;
                        long j3 = packageInfo.lastUpdateTime;
                        lVar.a |= 2;
                        lVar.c = j3;
                        str = FrostingUtil.m18312a(packageInfo);
                        if (str != null) {
                            if (str == null) {
                                throw new NullPointerException();
                            }
                            lVar.a |= 4;
                            lVar.d = str;
                        }
                        if (b2 != null) {
                            lVar.e = b2;
                        }
                        a = c3842a.f19220a.mo1524b(lVar);
                    }
                    a.mo4398a(C3847f.f19222a);
                    if (b2 == null || !b2.d()) {
                        j2 = 0;
                    } else {
                        j2 = b2.b;
                    }
                } else {
                    k kVar = ((l) list.get(0)).e;
                    if (kVar == null || !kVar.d()) {
                        j2 = 0;
                    } else {
                        j2 = kVar.b;
                    }
                }
                j = j2;
            }
            boolean z3 = (packageInfo.applicationInfo.flags & 1) != 0;
            boolean z4 = (packageInfo.applicationInfo.flags & 128) != 0;
            boolean z5 = (packageInfo.applicationInfo.flags & 2) != 0;
            int applicationEnabledSetting = this.f11410c.getApplicationEnabledSetting(packageInfo.packageName);
            if (applicationEnabledSetting == 0) {
                z = false;
                z2 = !packageInfo.applicationInfo.enabled;
            } else {
                z = applicationEnabledSetting == 3 || applicationEnabledSetting == 4;
                boolean z6 = z || applicationEnabledSetting == 2;
                z2 = z6;
            }
            int i3 = packageInfo.applicationInfo.targetSdkVersion;
            if (C0327a.m1722b()) {
                b = C3600b.m17190b(packageInfo.applicationInfo);
            } else {
                b = 1;
            }
            String str2 = packageInfo.packageName;
            String[] a2 = C2321a.m11873a(packageInfo);
            boolean h = m11875h(packageInfo.packageName);
            if (!C4671b.m21787d() || !this.f11414g.dj().mo2294a(12640717) || packageInfo.splitNames == null || packageInfo.splitNames.length <= 0) {
                strArr = null;
            } else {
                strArr = (String[]) Arrays.copyOf(packageInfo.splitNames, packageInfo.splitNames.length);
                Arrays.sort(strArr);
            }
            return new C2322b(str2, a2, null, z3, z4, z2, z, i2, i, j, h, i3, b, z5, strArr);
        } catch (IllegalArgumentException e) {
            FinskyLog.m21665c("Package %s not installed", packageInfo.packageName);
            return f11408a;
        }
    }

    private final boolean m11875h(String str) {
        List<ComponentName> activeAdmins = this.f11412e.getActiveAdmins();
        if (activeAdmins == null) {
            return false;
        }
        for (ComponentName packageName : activeAdmins) {
            if (packageName.getPackageName().equals(str)) {
                return true;
            }
        }
        return false;
    }

    private final C2322b m11872a(String str, boolean z) {
        boolean b = this.f11413f.m15129b(str);
        if (!z || b) {
            int i;
            if (b) {
                i = 4202688;
            } else {
                i = 192;
            }
            try {
                C2322b b2 = m11874b(this.f11410c.getPackageInfo(str, i));
                this.f11411d.put(str, b2);
                return b2;
            } catch (NameNotFoundException e) {
                this.f11411d.put(str, f11408a);
                return f11408a;
            }
        }
        this.f11411d.put(str, f11408a);
        return f11408a;
    }

    public final void mo1175b(String str, boolean z) {
        m11872a(str, false);
    }

    public final void mo1176c(String str, boolean z) {
        m11872a(str, !z);
    }

    public final void mo1177d(String str) {
        m11872a(str, false);
    }

    public final void mo1174a(String[] strArr) {
        for (String a : strArr) {
            m11872a(a, false);
        }
    }

    public final void mo1178e(String str) {
    }
}
