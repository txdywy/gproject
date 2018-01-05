package com.google.android.finsky.setup;

import android.util.Base64;
import com.android.volley.VolleyError;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.p178a.C2470a;
import com.google.android.finsky.setup.p240a.C4126m;
import com.google.android.finsky.setup.p243c.C4139a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C4668b;
import com.google.android.finsky.zapp.utils.C4866d;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.ck;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.google.wireless.android.p360b.p361a.C6333b;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class bt implements bs {
    public static final Object f20877a = new Object();
    public static bu f20878b;
    public final C2471a f20879c;
    public final C4126m f20880d;

    public bt(C2471a c2471a, C4126m c4126m) {
        synchronized (f20877a) {
            if (f20878b == null) {
                f20878b = new bu(c2471a);
            }
        }
        this.f20879c = c2471a;
        this.f20880d = c4126m;
    }

    public final void mo3944a() {
        m19320e(null, 3).m13367a(new C2474c(1906));
    }

    public final void mo3949a(String str, int i) {
        C2495w a;
        synchronized (f20877a) {
            a = f20878b.m19341a(str, Integer.valueOf(i));
        }
        if (a == null) {
            a = m19320e(str, i);
        }
        a.m13367a(new C2474c(1908).m13226a(m19318b(i)));
    }

    public final void mo3960b(String str, int i) {
        m19319d(str, i).m13367a(new C2474c(1909).m13226a(m19318b(i)));
    }

    public final void mo3948a(String str) {
        m19319d(null, 0).m13367a(new C2474c(1900).m13244b(str));
    }

    public final void mo3954a(String str, List list) {
        boolean z;
        int i = 0;
        C2474c b = new C2474c(1900).m13244b("restore_packages");
        if (list.isEmpty()) {
            z = false;
        } else {
            boolean z2 = ((PackageSetupStatus) list.get(0)).f20546a.f20897k;
            ck a = m19316a(z2);
            int size = list.size();
            String[] strArr = new String[size];
            while (i < size) {
                strArr[i] = ((PackageSetupStatus) list.get(i)).m19066a();
                i++;
            }
            a.c = strArr;
            b.m13226a(a);
            z = z2;
        }
        m19314a(str, z).m13367a(b);
    }

    @Deprecated
    public final void mo3957a(String str, String[] strArr, int[] iArr, boolean z) {
        int i = 0;
        int length = strArr == null ? 0 : strArr.length;
        List arrayList = new ArrayList(length);
        while (i < length) {
            arrayList.add(m19315a(str, strArr[i], iArr[i], z));
            i++;
        }
        mo3954a(str, arrayList);
    }

    public final void mo3958b() {
        mo3945a(0);
    }

    public final void mo3945a(int i) {
        m19319d(null, 0).m13367a(new C2474c(1901).m13210a(i));
    }

    public final void mo3962c(String str, int i) {
        m19314a(str, false).m13367a(new C2474c(1902).m13246c(i).m13226a(m19316a(false)));
    }

    public final void mo3955a(String str, List list, int i) {
        boolean z;
        int i2 = 0;
        C2474c c = new C2474c(1903).m13246c(i);
        if (list.isEmpty()) {
            z = false;
        } else {
            boolean z2 = ((PackageSetupStatus) list.get(0)).f20546a.f20897k;
            ck a = m19316a(z2);
            int size = list.size();
            String[] strArr = new String[size];
            while (i2 < size) {
                strArr[i2] = ((PackageSetupStatus) list.get(i2)).m19066a();
                i2++;
            }
            a.c = strArr;
            c.m13226a(a);
            z = z2;
        }
        m19314a(str, z).m13367a(c);
    }

    public final void mo3956a(String str, fp[] fpVarArr, int i) {
        mo3955a(str, C4668b.m21679a((Object[]) fpVarArr, this.f20880d.m19177b(str)), i);
    }

    public final void mo3950a(String str, int i, VolleyError volleyError) {
        m19314a(str, false).m13367a(new C2474c(1903).m13246c(i).m13226a(m19316a(false)).m13238a((Throwable) volleyError).m13210a(C3322j.m16692a(volleyError)));
    }

    public final void mo3946a(PackageSetupStatus packageSetupStatus, int i) {
        m19314a(packageSetupStatus.m19068b(), packageSetupStatus.f20546a.f20897k).m13367a(new C2474c(1904).m13236a(packageSetupStatus.m19066a()).m13246c(i).m13231a(new t().a(packageSetupStatus.f20546a.f20890d)).m13226a(m19316a(packageSetupStatus.f20546a.f20897k)));
    }

    @Deprecated
    public final void mo3951a(String str, String str2, int i, int i2, boolean z) {
        mo3946a(m19315a(str, str2, i2, z), i);
    }

    public final void mo3961b(String str, String str2, int i, int i2, boolean z) {
        m19314a(str, z).m13367a(new C2474c(1905).m13236a(str2).m13246c(i).m13210a(i2).m13226a(m19316a(z)));
    }

    public final void mo3947a(PackageSetupStatus packageSetupStatus, String str) {
        m19317a(packageSetupStatus, null, str);
    }

    @Deprecated
    public final void mo3953a(String str, String str2, int i, boolean z, String str3) {
        m19317a(m19315a(str, str2, i, z), null, str3);
    }

    public final void mo3959b(PackageSetupStatus packageSetupStatus, int i) {
        m19317a(packageSetupStatus, Integer.valueOf(i), "already-installed");
    }

    @Deprecated
    public final void mo3952a(String str, String str2, int i, boolean z, int i2) {
        mo3959b(m19315a(str, str2, i, z), i2);
    }

    private final void m19317a(PackageSetupStatus packageSetupStatus, Integer num, String str) {
        t a = new t().a(packageSetupStatus.f20546a.f20890d);
        if (num != null) {
            a.b(num.intValue());
        }
        m19314a(packageSetupStatus.m19068b(), packageSetupStatus.f20546a.f20897k).m13367a(new C2474c(113).m13236a(packageSetupStatus.m19066a()).m13244b(str).m13231a(a).m13226a(m19316a(packageSetupStatus.f20546a.f20897k)));
    }

    private static PackageSetupStatus m19315a(String str, String str2, int i, boolean z) {
        return new PackageSetupStatus(str, str2, i, null, -1, null, true, null, z, 0, null);
    }

    private static ck m19316a(boolean z) {
        return m19318b(z ? 2 : 1);
    }

    private static ck m19318b(int i) {
        C6333b c = C2693e.m14552a().mo3115c();
        ck ckVar = new ck();
        ckVar.b = i;
        ckVar.a |= 1;
        if (c != null) {
            ckVar.a(c.f31751y);
        }
        return ckVar;
    }

    private final C2495w m19319d(String str, int i) {
        C4178k c4178k = new C4178k(str, Integer.valueOf(i));
        synchronized (f20877a) {
            C2495w a = f20878b.m19340a(c4178k);
        }
        if (a != null) {
            return a;
        }
        if (c4178k.m19501b()) {
            FinskyLog.m21667d("Logging context should not be null here", new Object[0]);
        }
        return m19320e(str, i);
    }

    private final C2495w m19314a(String str, boolean z) {
        return m19319d(str, z ? 2 : 1);
    }

    private final C2495w m19320e(String str, int i) {
        C2495w a;
        C4178k c4178k = new C4178k(str, Integer.valueOf(i));
        synchronized (f20877a) {
            a = f20878b.m19340a(c4178k);
            if (a == null) {
                C2495w a2;
                if (((Integer) c4178k.f21100a.f1763b).intValue() == 3) {
                    C4866d.m22753a(!c4178k.m19500a(), "Early restore must be unauthenticated");
                    a2 = this.f20879c.m13184a(null);
                } else if (((Integer) c4178k.f21100a.f1763b).intValue() == 2) {
                    a2 = m19313a(str, "restore_vpa");
                } else if (((Integer) c4178k.f21100a.f1763b).intValue() == 1) {
                    C4866d.m22753a(c4178k.m19500a(), "Regular restore must be authenticated");
                    a2 = m19313a(str, "restore");
                } else {
                    a2 = this.f20879c.m13185b(str);
                }
                bu buVar = f20878b;
                synchronized (f20877a) {
                    buVar.m19342a();
                    buVar.f20881a.put(c4178k, a2);
                    Map map = buVar.f20881a;
                    synchronized (an.f20784b) {
                        Object encodeToString;
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        List arrayList = new ArrayList();
                        List arrayList2 = new ArrayList();
                        for (Entry entry : map.entrySet()) {
                            if (((C4178k) entry.getKey()).m19501b()) {
                                arrayList.add((Integer) ((C4178k) entry.getKey()).f21100a.f1763b);
                                arrayList2.add(((C2495w) entry.getValue()).m13381c());
                            }
                        }
                        C0757i c4139a = new C4139a();
                        int size = arrayList2.size();
                        c4139a.f20885a = (C2470a[]) arrayList2.toArray(new C2470a[size]);
                        c4139a.f20886b = new int[size];
                        for (int i2 = 0; i2 < size; i2++) {
                            c4139a.f20886b[i2] = ((Integer) arrayList.get(i2)).intValue();
                        }
                        try {
                            byteArrayOutputStream.write(C0757i.m4909a(c4139a));
                            encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                        } catch (Throwable e) {
                            FinskyLog.m21660a(e, "Failed to serialize logging context", new Object[0]);
                            encodeToString = null;
                        }
                        if (encodeToString != null) {
                            an.f20785c.m5763a(encodeToString);
                        }
                    }
                }
                a = a2;
            } else {
                FinskyLog.m21667d("Logging context should be null here", new Object[0]);
            }
        }
        return a;
    }

    private final C2495w m19313a(String str, String str2) {
        C2495w a;
        synchronized (f20877a) {
            a = f20878b.m19341a(null, Integer.valueOf(3));
            if (a == null) {
                FinskyLog.m21667d("Early update wasn't run", new Object[0]);
                a = this.f20879c.m13185b(str);
            } else {
                if (str == null) {
                    a = a.m13375a(str2);
                } else {
                    a = new C2495w(a.m13378b(), str2, false, str, a.f13435e);
                }
            }
        }
        return a;
    }
}
