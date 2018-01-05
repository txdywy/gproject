package com.google.android.finsky.splitinstallservice;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.RemoteException;
import android.support.v4.os.C0327a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3366j;
import com.google.android.finsky.installqueue.C3367k;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.InstallRequest;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.splitinstallservice.p245a.C4196a;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.p122c.p246b.p247a.C4214b;
import com.google.android.play.p122c.p246b.p247a.C6279c;
import com.squareup.leakcanary.C7582R;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

final class C4215q extends C4214b {
    public static final long f21261a = TimeUnit.HOURS.toMillis(2);
    public final C3340g f21262b;
    public final C2495w f21263c;
    public final C2320a f21264d;
    public final C3027b f21265e;
    public final C0988c f21266f;
    public final ay f21267g;
    public final ar f21268h;
    public final C4207j f21269i;
    public final C4203f f21270j;
    public final C4197a f21271k;
    public final Context f21272l;
    public final C1461c f21273m;
    public final C4211o f21274n;
    public final C4201d f21275o;
    public final File f21276p = new File(new File(Environment.getExternalStorageDirectory(), "Android"), "splits");
    public Handler f21277q;

    C4215q(C2471a c2471a, C3340g c3340g, C2320a c2320a, C3027b c3027b, C0988c c0988c, C1461c c1461c, C4211o c4211o, ay ayVar, C4201d c4201d, ar arVar, C4207j c4207j, C4197a c4197a, C4203f c4203f, Context context) {
        this.f21262b = c3340g;
        this.f21263c = c2471a.m13184a(null);
        this.f21264d = c2320a;
        this.f21265e = c3027b;
        this.f21266f = c0988c;
        this.f21274n = c4211o;
        this.f21270j = c4203f;
        this.f21271k = c4197a;
        this.f21267g = ayVar;
        this.f21275o = c4201d;
        this.f21268h = arVar;
        this.f21269i = c4207j;
        this.f21272l = context;
        this.f21273m = c1461c;
    }

    public final void mo4022a(String str, List list, C6279c c6279c) {
        String str2;
        String valueOf;
        if (!this.f21274n.m19590a(str)) {
            str2 = "Split install access not permitted: ";
            valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                valueOf = str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
            FinskyLog.m21665c(valueOf, new Object[0]);
        } else if (list.size() == 0) {
            FinskyLog.m21665c("Split install requested with no modules.", new Object[0]);
            m19621b(c6279c, -3);
        } else {
            C2322b a = this.f21264d.mo2854a(str);
            if (a == null) {
                FinskyLog.m21665c("Split install requested but app not found.", new Object[0]);
                m19621b(c6279c, -3);
                return;
            }
            String[] c = C4215q.m19611c(list);
            if (c == null) {
                FinskyLog.m21665c("Split install request with module bundle without module name.", new Object[0]);
                m19621b(c6279c, -3);
                return;
            }
            int i;
            if (a.f11430o == null || !Arrays.asList(a.f11430o).containsAll(Arrays.asList(c))) {
                i = 0;
            } else {
                i = 1;
            }
            if (i != 0) {
                this.f21271k.m19541a(new ad(this, c6279c, str, c));
            } else if (this.f21274n.m19591b(str)) {
                if (!C4671b.m21787d()) {
                    try {
                        this.f21276p.mkdirs();
                        if (m19613a(str).exists() && m19613a(str).list().length > 0) {
                            m19621b(c6279c, -1);
                            return;
                        }
                    } catch (SecurityException e) {
                        m19621b(c6279c, -100);
                        return;
                    }
                }
                m19615a(this.f21268h.m19562a(str), c6279c, new C4216r(this, str, a, c, c6279c));
            } else {
                str2 = "Split install start download not permitted: ";
                valueOf = String.valueOf(str);
                FinskyLog.m21665c(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
            }
        }
    }

    static List m19600a(List list) {
        List arrayList = new ArrayList(list.size());
        for (C3369m c3369m : list) {
            if (C3369m.f17271a.contains(Integer.valueOf(c3369m.f17273c.f17153d))) {
                arrayList.add(c3369m);
            }
        }
        return arrayList;
    }

    static C4196a m19599a(List list, InstallRequest installRequest) {
        for (C4196a c4196a : list) {
            if (c4196a.f21141f != null) {
                Set hashSet = new HashSet(Arrays.asList(c4196a.f21141f));
                if (c4196a.f21142g == 3 && c4196a.f21138c.equals(installRequest.f17171a.f17133c) && c4196a.f21139d == installRequest.f17171a.f17134d && c4196a.f21140e == installRequest.f17171a.f17140j.f12314f && hashSet.containsAll(Arrays.asList(installRequest.m16703b()))) {
                    return c4196a;
                }
            }
        }
        return null;
    }

    static List m19607b(List list) {
        List arrayList = new ArrayList();
        for (C4196a c4196a : list) {
            if (c4196a.f21142g == 3) {
                arrayList.add(c4196a);
            }
        }
        return arrayList;
    }

    final void m19614a(InstallRequest installRequest, int i, C6279c c6279c) {
        C4196a c4196a = new C4196a();
        c4196a.f21136a |= 1;
        c4196a.f21137b = i;
        String str = installRequest.f17171a.f17133c;
        if (str == null) {
            throw new NullPointerException();
        }
        c4196a.f21136a |= 2;
        c4196a.f21138c = str;
        int i2 = installRequest.f17171a.f17134d;
        c4196a.f21136a |= 4;
        c4196a.f21139d = i2;
        i2 = installRequest.f17171a.f17140j.f12314f;
        c4196a.f21136a |= 8;
        c4196a.f21140e = i2;
        String[] b = installRequest.m16703b();
        c4196a.f21141f = (String[]) Arrays.copyOf(b, b.length);
        c4196a.m19536a(1);
        long a = C4678i.m21812a();
        c4196a.f21136a |= 256;
        c4196a.f21146k = a;
        c4196a.m19540b(2);
        this.f21268h.m19561a(c4196a).mo4398a(new af(this, installRequest, c6279c, i));
    }

    static void m19601a(int i, C6279c c6279c) {
        try {
            c6279c.mo5370a(i, new Bundle());
        } catch (RemoteException e) {
        }
    }

    final InstallRequest m19612a(String str, C2322b c2322b, String[] strArr) {
        String a = this.f21265e.m15627b(str).m15620a(this.f21266f.cZ());
        es esVar = new es();
        int i = c2322b.f11420e;
        esVar.f12309a |= 8;
        esVar.f12314f = i;
        C3366j b = new C3366j(this.f21263c, str, c2322b.f11419d, this.f21272l.getResources().getString(C7582R.string.additional_module_title, new Object[]{m19606b(str)})).m16814b(2);
        if (strArr == null || strArr.length <= 0) {
            b.f17266b.f17148r = null;
        } else {
            b.f17266b.f17148r = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        return b.m16810a("SplitInstallService").m16808a(esVar).m16815b(a).m16809a(C3367k.f17268b).m16806a();
    }

    final File m19613a(String str) {
        return new File(this.f21276p, str);
    }

    private final CharSequence m19606b(String str) {
        try {
            PackageManager packageManager = this.f21272l.getPackageManager();
            str = packageManager.getApplicationInfo(str, 0).loadLabel(packageManager);
        } catch (Throwable e) {
            Throwable th = e;
            String str2 = "No title found for package name: ";
            String valueOf = String.valueOf(str);
            FinskyLog.m21663b(th, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        }
        return str;
    }

    public final void mo4020a(String str, int i, C6279c c6279c) {
        if (!this.f21274n.m19590a(str)) {
            return;
        }
        if (!C4215q.m19604a()) {
            C4215q.m19603a(c6279c, i);
        } else if (i == 0) {
            C4215q.m19603a(c6279c, i);
            C4215q.m19602a(this.f21272l, str);
        } else {
            C2322b a = this.f21264d.mo2854a(str);
            if (a == null) {
                FinskyLog.m21665c("Split install requested but app not found.", new Object[0]);
                m19621b(c6279c, -3);
                return;
            }
            m19615a(this.f21268h.m19563a(str, i), c6279c, new ag(this, c6279c, a, i, str));
        }
    }

    final void m19616a(String str, int i) {
        this.f21270j.m19582a(str, i, ah.f21178a);
        this.f21275o.m19574a(i);
    }

    final C4196a m19620b(String str, int i) {
        C4196a a = this.f21270j.m19582a(str, i, ai.f21179a);
        this.f21275o.m19574a(i);
        return a;
    }

    static void m19603a(C6279c c6279c, int i) {
        try {
            c6279c.mo5373b(i, new Bundle());
        } catch (RemoteException e) {
        }
    }

    public final void mo4023b(String str, int i, C6279c c6279c) {
        if (this.f21274n.m19590a(str)) {
            m19615a(this.f21268h.m19564b(str), c6279c, new aj(this, str, i, c6279c));
        }
    }

    final void m19623c(String str, int i, C6279c c6279c) {
        this.f21270j.m19582a(str, i, C4220v.f21296a);
        C4215q.m19608b(i, c6279c);
    }

    static void m19608b(int i, C6279c c6279c) {
        try {
            c6279c.mo5374c(i, new Bundle());
        } catch (RemoteException e) {
        }
    }

    public final void mo4024d(String str, int i, C6279c c6279c) {
        if (this.f21274n.m19590a(str)) {
            m19615a(this.f21268h.m19563a(str, i), c6279c, new C4221w(c6279c, i));
        }
    }

    public final void mo4021a(String str, C6279c c6279c) {
        if (this.f21274n.m19590a(str)) {
            m19615a(this.f21268h.m19562a(str), c6279c, new C4222x(c6279c));
        }
    }

    @TargetApi(21)
    static void m19602a(Context context, String str) {
        Intent intent = new Intent();
        intent.setPackage(str);
        intent.setAction("com.google.android.play.core.splitinstall.receiver.SplitInstallCompletionIntentService");
        intent.addFlags(268435456);
        context.sendBroadcast(intent);
    }

    final void m19621b(C6279c c6279c, int i) {
        this.f21271k.m19541a(new C4223y(c6279c, i));
    }

    final void m19615a(C4809e c4809e, C6279c c6279c, ao aoVar) {
        c4809e.mo4398a(new C4224z(this, c4809e, c6279c, aoVar));
    }

    static void m19610c(C6279c c6279c, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("error_code", i);
        try {
            c6279c.mo5371a(bundle);
        } catch (RemoteException e) {
        }
    }

    private static String[] m19611c(List list) {
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            String string = ((Bundle) list.get(i)).getString("module_name");
            if (string == null) {
                return null;
            }
            strArr[i] = string;
        }
        return strArr;
    }

    static boolean m19604a() {
        return C4671b.m21787d() && !C0327a.m1721a();
    }

    static final /* synthetic */ C4196a m19598a(C4196a c4196a) {
        c4196a.m19536a(7);
        c4196a.m19540b(3);
        return c4196a;
    }
}
