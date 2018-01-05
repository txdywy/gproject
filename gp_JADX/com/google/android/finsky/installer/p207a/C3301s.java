package com.google.android.finsky.installer.p207a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.UserManager;
import android.support.v4.os.C0327a;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.ax.C1533a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.bn.C2130d;
import com.google.android.finsky.bn.C2131e;
import com.google.android.finsky.bo.C2153a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.ca.C2251c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cp.C2358a;
import com.google.android.finsky.cp.C2359b;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.dg.C2734a;
import com.google.android.finsky.dg.C2736i;
import com.google.android.finsky.dg.C2740f;
import com.google.android.finsky.dg.C2743j;
import com.google.android.finsky.download.C2106x;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.download.C2845h;
import com.google.android.finsky.download.C2850m;
import com.google.android.finsky.dw.C2909c;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installer.C3308g;
import com.google.android.finsky.installer.C3318d;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.installer.MultiUserCoordinatorService;
import com.google.android.finsky.installer.p208b.p209a.C3314d;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3368l;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.aj;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.finsky.dfe.nano.dj;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class C3301s implements C2106x, C3300k {
    public static final C3371p f17058F = new C3371p(0, 0, 0, 0);
    public static final C3371p f17059G = new C3371p(1, 0, 0, 0);
    public static final C3371p f17060H = new C3371p(2, 0, 0, 196);
    public static final C3371p f17061I = new C3371p(4, 0, 0, 0);
    public Set f17062A;
    public C2736i f17063B;
    public C2743j f17064C;
    public final Comparator f17065D;
    public final BroadcastReceiver f17066E = new C3302t(this);
    public af f17067J = null;
    public C3318d f17068K;
    public ArrayList f17069L = new ArrayList();
    public C3308g f17070M = new C3310z(this);
    public final Context f17071a;
    public final C3646a f17072b;
    public final C2850m f17073c;
    public final ab f17074d;
    public final C2266a f17075e;
    public final C2127b f17076f;
    public final Handler f17077g;
    public final C2909c f17078h;
    public final C2296c f17079i;
    public final C2251c f17080j;
    public final C1500a f17081k;
    public final C2358a f17082l;
    public final C1461c f17083m;
    public final C2471a f17084n;
    public final C3028c f17085o;
    public final C2171b f17086p;
    public final ba f17087q;
    public final C2734a f17088r;
    public final C2153a f17089s;
    public final C3289h f17090t;
    public final List f17091u;
    public final List f17092v;
    public boolean f17093w;
    public boolean f17094x;
    public ArrayList f17095y = new ArrayList();
    public ah f17096z;

    public C3301s(Context context, C3646a c3646a, C2850m c2850m, ab abVar, C2266a c2266a, C2909c c2909c, C2296c c2296c, C2251c c2251c, C1500a c1500a, C2358a c2358a, C1461c c1461c, C2471a c2471a, C3028c c3028c, C2171b c2171b, ba baVar, C2734a c2734a, C2153a c2153a, C3297p c3297p) {
        this.f17071a = context;
        this.f17072b = c3646a;
        this.f17073c = c2850m;
        this.f17074d = abVar;
        this.f17075e = c2266a;
        this.f17078h = c2909c;
        this.f17079i = c2296c;
        this.f17080j = c2251c;
        this.f17081k = c1500a;
        this.f17082l = c2358a;
        this.f17083m = c1461c;
        this.f17084n = c2471a;
        this.f17085o = c3028c;
        this.f17086p = c2171b;
        this.f17087q = baVar;
        this.f17088r = c2734a;
        this.f17090t = new C3289h(new ad(this), c3297p.f17055a);
        this.f17091u = new ArrayList();
        this.f17092v = new ArrayList();
        this.f17076f = c3646a.f18022b;
        this.f17077g = new Handler(Looper.getMainLooper());
        this.f17093w = false;
        this.f17062A = new HashSet();
        this.f17065D = new C3278a(context, this.f17083m);
        this.f17089s = c2153a;
    }

    public final void mo3430a(Runnable runnable) {
        this.f17095y.add(runnable);
        if (!this.f17094x) {
            this.f17094x = true;
            this.f17074d.mo3800b();
            this.f17073c.mo3176a((C2106x) this);
            this.f17071a.registerReceiver(this.f17066E, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            new C3303u(this).execute(new Void[0]);
        }
    }

    final void m16641q(String str) {
        File file = new File(this.f17071a.getCacheDir(), str);
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null && listFiles.length != 0) {
                for (File delete : listFiles) {
                    if (!delete.delete()) {
                        FinskyLog.m21665c("failed to delete file from cache dir: '%s'", listFiles[r0].getAbsolutePath());
                    }
                }
            }
        }
    }

    public final void mo3438a(String str, String str2, es esVar) {
        this.f17079i.mo2848a(str, str2, C3298q.m16526a(0), esVar);
    }

    public final void mo3432a(String str, int i, String str2, String str3, int i2, es esVar, C2495w c2495w) {
        m16576a(str, i, str2, str3, false, i2, esVar, null, c2495w);
    }

    public final void mo3434a(String str, int i, String str2, String str3, boolean z, int i2, es esVar, C2495w c2495w) {
        m16576a(str, i, str2, str3, z, i2, esVar, null, c2495w);
    }

    public final void mo3433a(String str, int i, String str2, String str3, int i2, es esVar, String str4, C2495w c2495w) {
        m16576a(str, i, str2, str3, false, i2, esVar, str4, c2495w);
    }

    private final void m16576a(String str, int i, String str2, String str3, boolean z, int i2, es esVar, String str4, C2495w c2495w) {
        String str5;
        if (c2495w != null) {
            str5 = c2495w.f13432b;
        } else {
            str5 = "unknown";
        }
        mo3435a(str, i, str2, str3, z, i2, esVar, str4, c2495w, str5, C3368l.m16818a(str));
    }

    public final void mo3435a(String str, int i, String str2, String str3, boolean z, int i2, es esVar, String str4, C2495w c2495w, String str5, C3314d c3314d) {
        C2495w a;
        if (c2495w == null) {
            FinskyLog.m21665c("LoggingContext should not be null!", new Object[0]);
            a = this.f17084n.m13184a("unknown");
        } else if (TextUtils.isEmpty(c2495w.f13432b)) {
            FinskyLog.m21665c("LoggingContext should have non-empty reason!", new Object[0]);
            a = c2495w.m13375a("unknown");
        } else {
            a = c2495w;
        }
        ah.m16416a("requestInstall", str, str3, null);
        if (TextUtils.isEmpty(str5)) {
            str5 = "unknown";
        }
        if (((Boolean) C0955b.gk.m28964b()).booleanValue() && !this.f17083m.dj().mo2294a(12606444)) {
            C2358a c2358a = this.f17082l;
            c2358a.f11567c.post(new C2359b(c2358a, str, i, str5));
        }
        if (mo3458l(str) != 0) {
            FinskyLog.m21659a("Dropping install request for %s because already installing", str);
            return;
        }
        int i3;
        C3647b a2 = this.f17072b.m17243a(str);
        C2322b c2322b = a2 != null ? a2.f18028c : null;
        if (c2322b != null) {
            i3 = c2322b.f11419d;
        } else {
            i3 = -1;
        }
        t tVar = new t();
        tVar.a(i);
        if (i3 >= 0) {
            tVar.b(i3);
        }
        if (c2322b != null) {
            tVar.a(a2.f18028c.f11422g);
            if (this.f17083m.dj().mo2294a(12631924)) {
                String installerPackageName = this.f17071a.getPackageManager().getInstallerPackageName(str);
                if (TextUtils.isEmpty(installerPackageName)) {
                    installerPackageName = "UNKNOWN";
                } else if (this.f17083m.dj().mo2294a(12631338) && !this.f17071a.getPackageName().equals(installerPackageName)) {
                    installerPackageName = "ANONYMOUS";
                }
                if (installerPackageName == null) {
                    throw new NullPointerException();
                }
                tVar.a |= 262144;
                tVar.u = installerPackageName;
            }
        }
        long b = a.m13378b();
        if (((Boolean) C0955b.jw.m28964b()).booleanValue() && !this.f17083m.dj().mo2294a(12635487)) {
            Object obj;
            if (VERSION.SDK_INT >= 21 && this.f17081k.m8818a()) {
                UserManager userManager = (UserManager) this.f17071a.getSystemService("user");
                if (userManager != null && userManager.hasUserRestriction("no_install_apps")) {
                    obj = 1;
                    if (obj != null) {
                        FinskyLog.m21659a("Cancel update of %s because installs are disallowed by policy", str);
                        m16573a(a2, tVar, str, str3, a, b, "policy", 982);
                        return;
                    }
                }
            }
            obj = null;
            if (obj != null) {
                FinskyLog.m21659a("Cancel update of %s because installs are disallowed by policy", str);
                m16573a(a2, tVar, str, str3, a, b, "policy", 982);
                return;
            }
        }
        C3654j a3 = new C3654j(this.f17083m).m17260a(i, esVar, m16590j() ? c3314d.f17148r : null).m17262a(c2322b);
        if (a3.m17269e()) {
            FinskyLog.m21667d("Skipping attempt to download %s version %d over version %d", str, Integer.valueOf(i), Integer.valueOf(i3));
            this.f17079i.mo2841a(str);
            m16573a(a2, tVar, str, str3, a, b, "older-version", -1);
        } else if (a2 == null || a2.f18028c == null || !this.f17085o.m15632a(a2.f18028c, 12609315)) {
            long j;
            int i4;
            int i5;
            FinskyLog.m21659a("Request install of %s v=%d pri=%d mods=%s for %s", str, Integer.valueOf(i), Integer.valueOf(i2), Arrays.toString(c3314d.f17148r), str5);
            long a4 = this.f17089s.m11220a(str, a, b, new C2474c(105).m13236a(str).m13244b(str5).m13231a(tVar).m13255h(aj.m13207a(str5)).f13342a);
            if (this.f17083m.dj().mo2294a(12619996)) {
                C2127b c2127b = this.f17076f;
                C2131e c2131e = new C2131e(str);
                c2131e.f10834a.put("install_logging_context", C0757i.m4909a(a.m13381c()));
                c2127b.mo2660a(c2131e);
            } else {
                this.f17076f.mo2676d(str, a4);
            }
            if (esVar != null) {
                j = esVar.f12311c;
            } else {
                j = 0;
            }
            if (esVar != null) {
                i4 = esVar.f12310b;
            } else {
                i4 = 0;
            }
            int a5 = C3298q.m16526a(i4);
            C2296c c2296c = this.f17079i;
            int a6 = ah.m16413a(a, esVar);
            boolean d = a3.m17268d();
            if (C4671b.m21787d() && d) {
                i5 = 2;
            } else {
                i5 = 1;
            }
            c2296c.mo2843a(str, j, str3, a5, a6, esVar, i5);
            C3647b a7 = this.f17072b.m17243a(str);
            C2129c c2129c = a7 != null ? a7.f18029d : null;
            C2130d a8 = C2130d.m11121a(c2129c, str);
            a8.m11130b(i);
            if (esVar != null) {
                if (((esVar.f12309a & 64) != 0 ? 1 : null) != null) {
                    a8.m11134c(esVar.f12318j);
                }
            }
            a8.m11137d(i);
            a8.m11136c(str2);
            a8.m11139d(str3);
            a8.m11126a(null, 0);
            a8.m11140e(0);
            a8.m11127a(null);
            a8.m11129a(null);
            a8.m11135c(0);
            a8.m11149h(null);
            if (c2129c != null) {
                i4 = c2129c.f10819m;
            } else {
                i4 = 0;
            }
            i4 = (((i4 & -13) & -1537) & -12289) & -49153;
            if (i2 == 1) {
                i4 |= 16384;
            } else if (i2 == 2) {
                i4 |= 32768;
            }
            a8.m11143f(i4);
            a8.m11144f(C4678i.m21812a());
            a8.m11153k(str5);
            a8.m11152j(str4);
            if (esVar != null) {
                i4 = esVar.f12314f;
            } else {
                i4 = 0;
            }
            a8.m11150i(i4);
            if (m16590j()) {
                a8.m11133b(c3314d.f17148r);
                a8.m11125a(c3314d);
            }
            this.f17076f.mo2659a(a8.f10833a);
            m16597a(str, 0, 0);
            if (this.f17081k.m8818a()) {
                C2251c c2251c = this.f17080j;
                Runnable c3305w = new C3305w(this, z);
                com.google.android.finsky.utils.aj.m21700a(str);
                if (str2 == null || !c2251c.f11182e.m11681a()) {
                    String str6;
                    if (str2 == null) {
                        str6 = "null-account";
                    } else {
                        str6 = "cannot-set-restrictions";
                    }
                    c2251c.m11685a(str2, 1303, str6, 0, null, str);
                    c3305w.run();
                    return;
                }
                dj djVar = new dj();
                djVar.a(str);
                djVar.a(i);
                c2251c.m11686a(new dj[]{djVar}, str2, c3305w);
            } else if (!z || m16628f()) {
                m16607a(false);
            }
        } else {
            FinskyLog.m21659a("Cancel update of %s because installed v=%d is preview (targetSdk=%d)", str, Integer.valueOf(a2.f18028c.f11419d), Integer.valueOf(a2.f18028c.f11427l));
            this.f17079i.mo2841a(str);
            m16573a(a2, tVar, str, str3, a, b, "preview", 980);
        }
    }

    private final void m16573a(C3647b c3647b, t tVar, String str, String str2, C2495w c2495w, long j, String str3, int i) {
        int i2;
        m16594a(c3647b, true);
        this.f17089s.m11220a(str, c2495w, j, new C2474c(112).m13236a(str).m13244b(str3).m13231a(tVar).f13342a);
        if (c3647b == null || c3647b.f18029d == null) {
            i2 = 0;
        } else {
            i2 = c3647b.f18029d.f10819m;
        }
        if ((i2 & 1) == 0) {
            this.f17074d.mo3784a(str2, str, i, c2495w.m13365a());
        }
    }

    public final void mo3431a(String str) {
        m16575a(str, 2, (int) eq.FLAG_MOVED, false);
    }

    public final void mo3444b(String str) {
        m16575a(str, (int) eq.FLAG_MOVED, 2, false);
    }

    public final void mo3448c(String str) {
        m16575a(str, 2, (int) eq.FLAG_MOVED, true);
    }

    private final void m16575a(String str, int i, int i2, boolean z) {
        C2127b c2127b = this.f17072b.f18022b;
        C2129c a = c2127b.mo2657a(str);
        int i3 = 0;
        if (a != null) {
            i3 = a.f10819m;
        }
        int i4 = (i3 | i) & (i2 ^ -1);
        if (i4 != i3) {
            c2127b.mo2675d(str, i4);
            if (z) {
                m16585d(str, m16628f());
            }
        }
    }

    private final void m16585d(String str, boolean z) {
        ah r = m16591r(str);
        if (r != null) {
            r.m16421a();
        }
        if (z || r != null) {
            m16607a(true);
        }
    }

    public final void mo3440a(String str, boolean z, boolean z2, boolean z3) {
        int i;
        C2127b c2127b = this.f17072b.f18022b;
        C2129c a = c2127b.mo2657a(str);
        if (a != null) {
            i = a.f10819m;
        } else {
            i = 0;
        }
        int i2 = i & -146;
        if (!z) {
            i2 |= 16;
        }
        if (!z2) {
            i2 |= 1;
        }
        if (!z3) {
            i2 |= 128;
        }
        if (i2 != i) {
            c2127b.mo2675d(str, i2);
        }
    }

    public final void mo3450d(String str) {
        m16574a(str, 16777216);
    }

    public final void mo3451e(String str) {
        m16574a(str, 65536);
    }

    public final void mo3452f(String str) {
        m16574a(str, 4194304);
    }

    public final void mo3453g(String str) {
        m16574a(str, 131072);
    }

    private final void m16574a(String str, int i) {
        C2127b c2127b = this.f17072b.f18022b;
        C2129c a = c2127b.mo2657a(str);
        int i2 = 0;
        if (a != null) {
            i2 = a.f10819m;
        }
        int i3 = i2 | i;
        if (i3 != i2) {
            c2127b.mo2675d(str, i3);
        }
    }

    public final void mo3437a(String str, String str2) {
        this.f17072b.f18022b.mo2677d(str, str2);
    }

    public final void mo3439a(String str, boolean z) {
        int i;
        int i2;
        C2127b c2127b = this.f17072b.f18022b;
        C2129c a = c2127b.mo2657a(str);
        if (a != null) {
            i = a.f10824r;
        } else {
            i = 0;
        }
        if (z) {
            i2 = i | 16;
        } else {
            i2 = i & -17;
        }
        if (i2 != i) {
            c2127b.mo2678e(str, i2);
        }
    }

    public final void mo3454h(String str) {
        m16574a(str, 524288);
    }

    public final void mo3455i(String str) {
        m16574a(str, 1048576);
    }

    public final void mo3456j(String str) {
        m16574a(str, 2097152);
    }

    public final void mo3436a(String str, Intent intent) {
        C2127b c2127b = this.f17076f;
        C2131e c2131e = new C2131e(str);
        if (intent != null) {
            c2131e.f10834a.put("notification_intent", intent.toUri(1));
        } else {
            c2131e.f10834a.putNull("notification_intent");
        }
        c2127b.mo2660a(c2131e);
    }

    public final void mo3428a() {
        m16607a(true);
    }

    public final void mo3461o(String str) {
        ah r = m16591r(str);
        if (r != null) {
            r.m16435a(true);
        } else {
            C3647b a = this.f17072b.m17243a(str);
            if (a != null) {
                String str2 = a.f18026a;
                FinskyLog.m21659a("Cancel pending install of %s", str2);
                this.f17079i.mo2841a(str2);
                if (a.f18029d != null) {
                    m16594a(a, true);
                    m16597a(str2, 2, 0);
                    this.f17089s.m11221a(str2, new C2474c(156).m13236a(str2).f13342a);
                }
            }
        }
        m16607a(true);
    }

    public final void mo3462p(String str) {
        mo3431a(str);
        C2127b c2127b = this.f17072b.f18022b;
        if (c2127b.mo2657a(str) != null) {
            long max;
            long a = C4678i.m21812a();
            List g = m16587g();
            if ((!this.f17083m.dj().mo2294a(12622345)) && g.size() > 0 && ((C3647b) g.get(0)).f18029d.m11118b() == 1) {
                max = Math.max(0, ((C3647b) g.get(0)).f18029d.f10800G - 1);
            } else {
                max = a;
            }
            m16574a(str, 16384);
            C2131e c2131e = new C2131e(str);
            c2131e.f10834a.put("install_request_timestamp_ms", Long.valueOf(max));
            c2127b.mo2660a(c2131e);
        }
        m16585d(str, true);
    }

    public final int mo3442b() {
        List a = this.f17072b.m17245a();
        int size = a.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            int i3;
            if (C3301s.m16578a(((C3647b) a.get(i)).f18029d)) {
                i3 = i2 + 1;
            } else {
                i3 = i2;
            }
            i++;
            i2 = i3;
        }
        return i2;
    }

    public final void mo3447c() {
        if (this.f17096z != null && this.f17096z.m16438b().f17279d == 196) {
            this.f17096z.m16421a();
        }
    }

    final void m16594a(C3647b c3647b, boolean z) {
        if (c3647b != null && c3647b.f18029d != null) {
            C2130d a = C2130d.m11121a(c3647b.f18029d, c3647b.f18026a);
            a.m11140e(0);
            if (z) {
                a.m11130b(-1);
                a.m11127a(null);
                a.m11143f(0);
                a.m11147g(null);
                a.m11150i(0);
            }
            a.m11129a(null);
            a.m11135c(0);
            a.m11149h(null);
            this.f17076f.mo2659a(a.f10833a);
        }
    }

    final boolean m16608a(Uri uri, int i) {
        if (uri != null) {
            try {
                Object uri2 = uri.toString();
            } catch (Exception e) {
                FinskyLog.m21665c("Caught exception while recovering %s: %s", uri, e);
                return false;
            }
        }
        uri2 = null;
        if (TextUtils.isEmpty(uri2)) {
            return false;
        }
        if (this.f17096z != null) {
            FinskyLog.m21665c("tried recovery while already handling %s", this.f17096z.f16878I);
            return false;
        }
        for (C2129c c2129c : this.f17072b.f18022b.mo2658a()) {
            if (uri2.equals(c2129c.f10814h)) {
                break;
            }
        }
        C2129c c2129c2 = null;
        if (c2129c2 == null) {
            return false;
        }
        int i2;
        String str = c2129c2.f10807a;
        FinskyLog.m21659a("Recovering download for running %s", str);
        if (this.f17078h.f15463a.mo3192a()) {
            try {
                if (!this.f17068K.mo3467a(str)) {
                    FinskyLog.m21665c("Can't recover %s *** cannot acquire", str);
                    return false;
                }
            } catch (RemoteException e2) {
                FinskyLog.m21665c("Acquiring %s *** received %s", str, e2);
            }
        }
        ah a = this.f17087q.m16477a(str, new ag(this));
        C3647b a2 = a.f16896d.m17243a(a.f16878I);
        c2129c2 = a2.f18029d;
        if (c2129c2 != null && c2129c2.f10811e != null) {
            a.f16883N = -1;
            a.m16430a(a2);
            a.m16429a(c2129c2, false);
            a.m16426a(c2129c2);
            int i3 = c2129c2.f10813g;
            if (a.ag == null) {
                if (i3 == 25) {
                    a.ag = "..obb_main";
                } else if (i3 == 35) {
                    a.ag = "..obb_patch";
                }
            }
            if (!TextUtils.isEmpty(a.ag)) {
                switch (i3) {
                    case 25:
                    case 35:
                    case 45:
                    case 50:
                        if (!new C3654j(a.f16911s).m17261a(c2129c2).m17262a(a2.f18028c).m17269e()) {
                            i2 = ((i < 200 || i >= 300) && (i < 400 || i >= 600)) ? 0 : 1;
                            if (i2 != 0 || i == 198) {
                                if (!C1533a.m8963a(i)) {
                                    FinskyLog.m21659a("Recovery of %s (adid: %s , isid: %s) into error state, status= %d", a.f16878I, a.ag, a.m16445e(), Integer.valueOf(i));
                                    a.m16435a(false);
                                    a.m16433a(a.f16878I, i);
                                    i2 = 0;
                                    break;
                                }
                                FinskyLog.m21659a("Recovery of %s (adid: %s , isid: %s) into postprocess state", a.f16878I, a.ag, a.m16445e());
                                a.m16439b(50, uri.toString());
                                a.m16443c();
                                i2 = 1;
                                break;
                            }
                            FinskyLog.m21659a("Recovery of %s (adid: %s , isid: %s) into downloading APK state", a.f16878I, a.ag, a.m16445e());
                            a.m16436a(a.ag, a2.f18029d);
                            a.m16427a(a2.f18029d, new ai(a, uri));
                            i2 = 1;
                            break;
                        }
                        FinskyLog.m21659a("Recovery of %s (adid: %s , isid: %s) skipped because desired= %s installed= %s", a.f16878I, a.ag, a.m16445e(), new C3654j(a.f16911s).m17261a(c2129c2).m17262a(a2.f18028c).m17270f(), new C3654j(a.f16911s).m17261a(c2129c2).m17262a(a2.f18028c).m17271g());
                        i2 = 0;
                        break;
                        break;
                    case 52:
                    case 58:
                        FinskyLog.m21659a("Recovery of %s (adid: %s , isid: %s) skipped because state= %d", a.f16878I, a.ag, a.m16445e(), Integer.valueOf(i3));
                        a.m16431a(a2, true);
                        i2 = 0;
                        break;
                    case 55:
                        FinskyLog.m21659a("Recovery of %s (adid: %s , isid: %s) skipped because state= %d", a.f16878I, a.ag, a.m16445e(), Integer.valueOf(i3));
                        a.m16431a(a2, true);
                        i2 = 0;
                        break;
                    case 57:
                        FinskyLog.m21659a("Recovery of %s (adid: %s , isid: %s) skipped because state= %d", a.f16878I, a.ag, a.m16445e(), Integer.valueOf(i3));
                        a.m16431a(a2, true);
                        i2 = 0;
                        break;
                    case 60:
                        C3654j a3 = new C3654j(a.f16911s).m17261a(c2129c2).m17262a(a2.f18028c);
                        if (!a3.m17266b()) {
                            if ((a3.m17272h() == 0 ? 1 : 0) == 0) {
                                FinskyLog.m21659a("Recovery of %s with incomplete installation", a.f16878I);
                                a.m16435a(false);
                                a.m16423a(8, i);
                                i2 = 0;
                                break;
                            }
                            FinskyLog.m21659a("Recovery of %s - installation seems complete", a.f16878I);
                            a.m16439b(70, uri.toString());
                            a.m16443c();
                            i2 = 0;
                            break;
                        }
                        FinskyLog.m21659a("Recovery of %s skipped because desired= %s installed= %s", a.f16878I, a3.m17270f(), a3.m17271g());
                        i2 = 0;
                        break;
                    default:
                        FinskyLog.m21659a("Recovery of %s (adid: %s , isid: %s) skipped because state= %d", a.f16878I, a.ag, a.m16445e(), Integer.valueOf(i3));
                        i2 = 0;
                        break;
                }
            }
            FinskyLog.m21659a("Recovery of %s skipped because missing mActiveDownloadId", a.f16878I);
            i2 = 0;
        } else {
            FinskyLog.m21659a("Recovery of %s skipped because incomplete installerdata", a.f16878I);
            i2 = 0;
        }
        if (i2 != 0) {
            this.f17096z = a;
            return true;
        }
        if (this.f17078h.f15463a.mo3192a()) {
            try {
                this.f17068K.mo3468b(str);
            } catch (RemoteException e22) {
                FinskyLog.m21665c("Releasing %s *** received %s", str, e22);
            }
        }
        return false;
    }

    public final void mo3445b(String str, boolean z) {
        t tVar = null;
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21665c("Unexpected empty package name", new Object[0]);
            return;
        }
        PackageInfo packageInfo;
        ah r = m16591r(str);
        if (r != null) {
            r.m16435a(true);
        }
        try {
            packageInfo = this.f17071a.getPackageManager().getPackageInfo(str, 0);
        } catch (NameNotFoundException e) {
            packageInfo = null;
        }
        if (packageInfo != null) {
            t tVar2 = new t();
            tVar2.b(packageInfo.versionCode);
            tVar2.a((packageInfo.applicationInfo.flags & 1) != 0);
            tVar = tVar2;
        }
        this.f17089s.m11221a(str, C3301s.m16571a(str, tVar, 114));
        if (this.f17076f.mo2657a(str) != null) {
            this.f17076f.mo2660a(new C2131e(str).m11159a().m11162b());
        }
        try {
            this.f17071a.getPackageManager().getPackageInfo(str, 0);
            this.f17062A.add(str);
            m16597a(str, 7, 0);
            this.f17079i.mo2849a(str, z);
        } catch (NameNotFoundException e2) {
            FinskyLog.m21659a("Skipping uninstall of %s - already uninstalled.", str);
        }
    }

    public final void mo3457k(String str) {
        PackageManager packageManager = this.f17071a.getPackageManager();
        try {
            for (String str2 : packageManager.getPackagesForUid(packageManager.getPackageInfo(str, 0).applicationInfo.uid)) {
                FinskyLog.m21659a("Removing package '%s' (child of '%s')", str2, str);
                mo3445b(str2, true);
            }
        } catch (NameNotFoundException e) {
            FinskyLog.m21659a("Skipping uninstall of %s - already uninstalled.", str);
        }
    }

    public final int mo3458l(String str) {
        return mo3459m(str).f17276a;
    }

    public final C3371p mo3459m(String str) {
        ah r = m16591r(str);
        if (r != null) {
            return r.m16438b();
        }
        if (this.f17062A.contains(str)) {
            return f17061I;
        }
        C3647b a = this.f17072b.m17243a(str);
        if (a != null) {
            int i = -1;
            if (a.f18028c != null) {
                i = a.f18028c.f11419d;
            }
            if (a.f18029d != null && a.f18029d.f10809c > r0) {
                if (m16582b(a, this.f17075e.m11719a())) {
                    return f17060H;
                }
                return f17059G;
            }
        }
        return f17058F;
    }

    public final String mo3460n(String str) {
        C2129c a = this.f17076f.mo2657a(str);
        if (a != null) {
            return a.f10818l;
        }
        return null;
    }

    public final void mo3429a(C1003o c1003o) {
        bb.m21791a();
        this.f17091u.add(c1003o);
    }

    public final void mo3443b(C1003o c1003o) {
        bb.m21791a();
        this.f17091u.remove(c1003o);
    }

    final void m16597a(String str, int i, int i2) {
        List asList;
        C3314d c3314d = null;
        int i3 = 0;
        C2129c a = m16590j() ? this.f17076f.mo2657a(str) : null;
        if (a != null) {
            c3314d = a.f10806M;
        }
        if (a == null) {
            asList = Arrays.asList(new String[0]);
        } else {
            String[] a2 = a.m11117a();
            asList = new ArrayList(a2.length);
            int length = a2.length;
            while (i3 < length) {
                String str2 = a2[i3];
                if (str2.startsWith("..split.")) {
                    asList.add(str2.substring(8));
                }
                i3++;
            }
        }
        this.f17077g.post(new C3306x(this, str, c3314d, i, i2, asList));
    }

    private final void m16572a(C2839b c2839b, t tVar) {
        if (tVar != null) {
            C2845h m = c2839b.mo3163m();
            if (m != null) {
                tVar.a(m.f15277b);
                tVar.b(m.f15278c);
                tVar.e(m.f15279d);
            }
            boolean z = !this.f17075e.m11721c();
            tVar.a |= MemoryMappedFileBuffer.DEFAULT_PADDING;
            tVar.l = z;
        }
    }

    public final void mo2645g(C2839b c2839b) {
        if (c2839b.mo3155e() == 2) {
            t tVar;
            ah a = m16568a(c2839b);
            if (a == null) {
                tVar = null;
            } else {
                tVar = a.f16893X;
            }
            m16572a(c2839b, tVar);
            this.f17089s.m11221a(c2839b.mo3147a(), C3301s.m16571a(c2839b.mo3168r(), tVar, 101));
            if (a != null) {
                int i;
                String a2 = c2839b.mo3147a();
                switch (a.f16896d.m17243a(a2).f18029d.f10813g) {
                    case 20:
                    case 25:
                    case 30:
                    case 35:
                    case 40:
                    case 45:
                        i = 45;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i >= 0) {
                    a.m16424a(45, c2839b.mo3162l());
                    a.m16423a(1, 0);
                    return;
                }
                FinskyLog.m21667d("Unexpected download start states for %s (adid: %s , isid: %s): %d %d", a2, a.ag, a.m16445e(), Integer.valueOf(r5.f10813g), Integer.valueOf(-1));
                a.m16435a(false);
                a.m16433a(a2, 903);
            }
        }
    }

    public final void mo2647e(C2839b c2839b) {
        if (c2839b.mo3155e() == 2) {
            t tVar;
            ah a = m16568a(c2839b);
            if (a == null) {
                tVar = null;
            } else {
                tVar = a.f16893X;
            }
            m16572a(c2839b, tVar);
            this.f17089s.m11221a(c2839b.mo3147a(), C3301s.m16571a(c2839b.mo3168r(), tVar, 102));
            if (a != null) {
                int i;
                if (a.f16883N >= 0) {
                    a.f16883N += c2839b.mo3164n();
                }
                switch (a.f16896d.m17243a(a.f16878I).f18029d.f10813g) {
                    case 25:
                    case 35:
                    case 45:
                        i = 50;
                        break;
                    default:
                        i = -1;
                        break;
                }
                if (i >= 0) {
                    a.m16424a(50, c2839b.mo3162l());
                    a.m16443c();
                    return;
                }
                FinskyLog.m21667d("Unexpected download completion states for %s (adid: %s , isid: %s): %d %d", a.f16878I, a.ag, a.m16445e(), Integer.valueOf(r4.f10813g), Integer.valueOf(-1));
                a.m16435a(false);
                a.m16433a(a.f16878I, 904);
            }
        }
    }

    public final void mo2644f(C2839b c2839b) {
        if (c2839b.mo3155e() == 2) {
            t tVar;
            ah a = m16568a(c2839b);
            if (a == null) {
                tVar = null;
            } else {
                tVar = a.f16893X;
            }
            m16572a(c2839b, tVar);
            this.f17089s.m11221a(c2839b.mo3147a(), C3301s.m16571a(c2839b.mo3168r(), tVar, 103));
            if (a != null) {
                a.m16435a(true);
            }
        }
    }

    public final void mo2642b(C2839b c2839b, int i) {
        if (c2839b.mo3155e() == 2) {
            t tVar;
            ah a = m16568a(c2839b);
            if (a == null) {
                tVar = null;
            } else {
                tVar = a.f16893X;
            }
            m16572a(c2839b, tVar);
            if (!(tVar == null || TextUtils.isEmpty(c2839b.mo3159i()))) {
                tVar.a(c2839b.mo3159i());
                FinskyLog.m21659a("Download %s failed, cpn=%s", c2839b.mo3147a(), c2839b.mo3159i());
            }
            this.f17089s.m11221a(c2839b.mo3147a(), new C2474c(104).m13236a(c2839b.mo3168r()).m13210a(i).m13231a(tVar).f13342a);
            if (a != null) {
                boolean z = i == 420 || (i >= 500 && i <= 599);
                if (z) {
                    if (a.m16442b(4, 8)) {
                        if (a.f16883N >= 0) {
                            a.f16883N = -1;
                            return;
                        }
                        return;
                    } else if (a.m16442b(512, (int) MemoryMappedFileBuffer.DEFAULT_PADDING)) {
                        if (a.f16883N >= 0) {
                            a.f16883N = -1;
                            return;
                        }
                        return;
                    }
                }
                if (a.f16883N >= 0) {
                    a.f16883N += c2839b.mo3164n();
                }
                a.m16422a(i);
                a.m16435a(false);
                if (i != 198) {
                    a.m16425a(i, null);
                } else if (a.f16888S) {
                    a.m16437a(a.ag, a.f16900h.mo2657a(a.f16878I).f10811e);
                    if (a.ah == null || !a.ah.mo2282g()) {
                        a.f16899g.mo3786a(a.f16894Y, a.f16878I, a.f16906n.m13365a());
                    } else {
                        a.f16899g.mo3803b(a.f16894Y, a.f16878I, a.f16906n.m13365a());
                    }
                }
                a.m16423a(3, i);
            }
        }
    }

    public final void mo2643b(C2839b c2839b, C2845h c2845h) {
        if (c2839b.mo3155e() == 2) {
            ah a = m16568a(c2839b);
            if (a != null) {
                a.f16881L = c2845h.f15277b;
                C2129c a2 = a.f16896d.f18022b.mo2657a(a.f16878I);
                if (c2845h.f15277b > 0 && a2.f10816j == 0) {
                    a.f16900h.mo2663a(a.f16878I, System.currentTimeMillis());
                }
                a.f16885P = c2845h.f15279d;
                a.m16423a(1, 0);
                a.f16903k.mo2842a(a.f16878I, a.m16448h(), a.f16884O);
            }
            if (c2845h.f15279d == 196) {
                m16607a(true);
            }
        }
    }

    public final void mo2646h(C2839b c2839b) {
        if (c2839b.mo3155e() == 2) {
            Intent intent;
            String a = c2839b.mo3147a();
            C2129c a2 = this.f17076f.mo2657a(a);
            if (a2 != null) {
                intent = a2.f10803J;
            } else {
                intent = null;
            }
            if (intent == null) {
                if (!"com.google.android.gms".equals(a)) {
                    if (a2 == null || !"rapid_auto_update".equals(a2.f10801H)) {
                        intent = this.f17086p.mo2750a(this.f17071a, a, null, null, C1289l.m7694a(a), this.f17084n.m13184a(null));
                    } else {
                        return;
                    }
                }
                return;
            }
            intent.setFlags(268435456);
            this.f17071a.startActivity(intent);
        }
    }

    final void m16607a(boolean z) {
        C3647b c3647b;
        if (this.f17083m.dj().mo2294a(12618942)) {
            if (this.f17093w) {
                boolean a = this.f17078h.f15463a.mo3192a();
                List g = m16587g();
                if (g.isEmpty()) {
                    if (a) {
                        m16623e();
                        return;
                    }
                    return;
                } else if (a && this.f17068K == null) {
                    m16614b(new ae(this));
                    return;
                } else if (z) {
                    this.f17077g.post(new ae(this));
                    return;
                } else if (this.f17062A.isEmpty()) {
                    boolean a2 = this.f17075e.m11719a();
                    if (this.f17096z == null) {
                        c3647b = null;
                    } else if (m16582b(this.f17072b.m17243a(this.f17096z.f16878I), a2)) {
                        c3647b = m16570a(g, a2);
                        if (c3647b != null) {
                            this.f17096z.m16421a();
                            this.f17096z = null;
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                    if (c3647b == null) {
                        c3647b = m16570a(g, a2);
                    }
                    m16584c(c3647b);
                    return;
                } else {
                    FinskyLog.m21659a("Installer kick - no action, pending uninstalls", new Object[0]);
                    return;
                }
            }
            FinskyLog.m21659a("Installer kick - no action, not running yet", new Object[0]);
        } else if (z) {
            this.f17077g.post(new ae(this));
        } else if (!this.f17093w) {
            FinskyLog.m21659a("Installer kick - no action, not running yet", new Object[0]);
        } else if (!this.f17062A.isEmpty()) {
            FinskyLog.m21659a("Installer kick - no action, pending uninstalls", new Object[0]);
        } else if (!this.f17078h.f15463a.mo3192a()) {
            boolean a3 = this.f17075e.m11719a();
            if (this.f17096z == null) {
                c3647b = null;
            } else if (m16582b(this.f17072b.m17243a(this.f17096z.f16878I), a3)) {
                c3647b = m16580b(m16587g(), a3);
                if (c3647b != null) {
                    this.f17096z.m16421a();
                    this.f17096z = null;
                } else {
                    return;
                }
            } else {
                return;
            }
            if (c3647b == null) {
                c3647b = m16580b(m16587g(), a3);
            }
            m16584c(c3647b);
        } else if (this.f17096z == null) {
            List g2 = m16587g();
            if (g2.isEmpty()) {
                m16623e();
            } else if (this.f17068K == null) {
                m16614b(new ae(this));
            } else {
                m16584c(m16569a(g2, this.f17068K));
            }
        }
    }

    private final boolean m16582b(C3647b c3647b, boolean z) {
        C2839b a = this.f17073c.mo3171a(c3647b.f18026a, null);
        if (!(a == null || a.mo3163m() == null)) {
            int i = a.mo3163m().f15279d;
            boolean z2 = i == 196;
            if (!((Boolean) C0955b.ig.m28964b()).booleanValue()) {
                return z2;
            }
            switch (i) {
                case 190:
                case 194:
                    break;
                default:
                    return z2;
            }
        }
        C2129c c2129c = c3647b.f18029d;
        return z && c2129c != null && C3301s.m16578a(c2129c);
    }

    private static boolean m16578a(C2129c c2129c) {
        return (c2129c.f10819m & eq.FLAG_MOVED) != 0;
    }

    private final C3647b m16570a(List list, boolean z) {
        if (this.f17083m.dj().mo2294a(12618942)) {
            return m16583c(list, z);
        }
        return m16580b(list, z);
    }

    private final C3647b m16580b(List list, boolean z) {
        if (list.isEmpty()) {
            return null;
        }
        if (!m16628f() || this.f17088r.m14777b()) {
            Collection hashSet = new HashSet();
            Set a = C3322j.m16693a(this.f17071a);
            for (C3647b c3647b : list) {
                if (!m16582b(c3647b, z)) {
                    if (!C3301s.m16579a(c3647b) && a.contains(c3647b.f18026a)) {
                        FinskyLog.m21659a("Installer - skip %s, the app is in foreground", c3647b.f18026a);
                        hashSet.add(c3647b);
                    } else if (m16586d(c3647b)) {
                        continue;
                    } else if (!m16581b(c3647b)) {
                        return c3647b;
                    } else {
                        m16588h();
                    }
                }
            }
            m16577a(hashSet);
            return null;
        }
        m16589i();
        return null;
    }

    private final C3647b m16583c(List list, boolean z) {
        if (list.isEmpty()) {
            return null;
        }
        if (!m16628f() || this.f17088r.m14777b()) {
            Set a = C3322j.m16693a(this.f17071a);
            Collection hashSet = new HashSet();
            for (C3647b c3647b : list) {
                if (!m16582b(c3647b, z)) {
                    if (!C3301s.m16579a(c3647b) && a.contains(c3647b.f18026a)) {
                        FinskyLog.m21659a("Installer - skip %s, the app is in foreground", c3647b.f18026a);
                        hashSet.add(c3647b);
                    } else if (m16586d(c3647b)) {
                        continue;
                    } else if (m16581b(c3647b)) {
                        m16588h();
                    } else if (!this.f17078h.f15463a.mo3192a()) {
                        return c3647b;
                    } else {
                        try {
                            if (this.f17068K.mo3467a(c3647b.f18026a)) {
                                return c3647b;
                            }
                            FinskyLog.m21659a("Skipping install of %s - not acquired", c3647b.f18026a);
                        } catch (RemoteException e) {
                            FinskyLog.m21665c("Couldn't acquire %s (proceed anyway) received %s", c3647b.f18026a, e);
                            return c3647b;
                        }
                    }
                }
            }
            m16577a(hashSet);
            return null;
        }
        m16589i();
        return null;
    }

    private static boolean m16579a(C3647b c3647b) {
        return (c3647b.f18029d.f10819m & 180224) != 0;
    }

    private final boolean m16581b(C3647b c3647b) {
        boolean z = ((Boolean) C0955b.hN.m28964b()).booleanValue() && !this.f17083m.dj().mo2294a(12618928);
        if (!z) {
            return false;
        }
        if ((c3647b.f18029d.f10819m & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.f17088r.m14775a() || r0) {
            return false;
        }
        return true;
    }

    private final C3647b m16569a(List list, C3318d c3318d) {
        if (!m16628f() || this.f17088r.m14777b()) {
            Set a = C3322j.m16693a(this.f17071a);
            Collection hashSet = new HashSet();
            for (int i = 0; i < list.size(); i++) {
                C3647b c3647b = (C3647b) list.get(i);
                if (!C3301s.m16579a(c3647b) && a.contains(c3647b.f18026a)) {
                    FinskyLog.m21659a("Installer - skip %s, the app is in foreground", c3647b.f18026a);
                    hashSet.add(c3647b);
                } else if (m16586d(c3647b)) {
                    continue;
                } else if (m16581b(c3647b)) {
                    m16588h();
                } else {
                    try {
                        if (c3318d.mo3467a(c3647b.f18026a)) {
                            return c3647b;
                        }
                        FinskyLog.m21659a("Skipping install of %s - not acquired", c3647b.f18026a);
                    } catch (RemoteException e) {
                        FinskyLog.m21665c("Couldn't acquire %s (proceed anyway) received %s", c3647b.f18026a, e);
                        return c3647b;
                    }
                }
            }
            m16577a(hashSet);
            return null;
        }
        m16589i();
        return null;
    }

    private final void m16577a(Collection collection) {
        for (C3647b c3647b : collection) {
            m16594a(c3647b, true);
            this.f17089s.m11221a(c3647b.f18026a, new C2474c(112).m13236a(c3647b.f18026a).m13210a(978).f13342a);
            m16597a(c3647b.f18026a, 5, 978);
        }
    }

    final boolean m16622d() {
        return this.f17078h.f15463a.mo3192a();
    }

    private final void m16584c(C3647b c3647b) {
        if (c3647b != null) {
            FinskyLog.m21659a("Installer kick - starting %s", c3647b.f18026a);
            this.f17096z = this.f17087q.m16477a(c3647b.f18026a, new ag(this));
            ah ahVar = this.f17096z;
            try {
                C3647b a = ahVar.f16896d.m17243a(ahVar.f16878I);
                if (a == null || a.f18029d == null) {
                    FinskyLog.m21669e("Unexpected missing installer data for %s", ahVar.f16878I);
                    ahVar.m16435a(true);
                    return;
                }
                C2129c c2129c = a.f18029d;
                int i = c2129c.f10813g;
                ahVar.f16883N = i == 0 ? 0 : -1;
                ahVar.m16430a(a);
                if (i > 0 && c2129c.f10811e != null) {
                    ahVar.m16429a(c2129c, false);
                    ahVar.m16426a(c2129c);
                }
                int i2 = -1;
                switch (i) {
                    case 0:
                    case 80:
                        break;
                    case 10:
                        i2 = 0;
                        break;
                    case 20:
                    case 30:
                    case 40:
                        i2 = 10;
                        break;
                    case 25:
                    case 35:
                    case 45:
                        FinskyLog.m21665c("Cannot restart %s (adid: %s , isid: %s) from downloading state %d", ahVar.f16878I, ahVar.ag, ahVar.m16445e(), Integer.valueOf(i));
                        ahVar.m16435a(false);
                        ahVar.m16433a(ahVar.f16878I, 905);
                        return;
                    case 50:
                        FinskyLog.m21665c("Restarting %d for %s (adid: %s , isid: %s)", Integer.valueOf(i), ahVar.f16878I, ahVar.ag, ahVar.m16445e());
                        ahVar.m16431a(a, true);
                        ahVar.m16433a(ahVar.f16878I, 909);
                        return;
                    case 52:
                    case 55:
                    case 57:
                    case 58:
                        FinskyLog.m21665c("Restarting %d for %s (adid: %s , isid: %s)", Integer.valueOf(i), ahVar.f16878I, ahVar.ag, ahVar.m16445e());
                        ahVar.m16431a(a, true);
                        ahVar.m16433a(ahVar.f16878I, 907);
                        return;
                    case 60:
                    case 70:
                        i2 = 70;
                        break;
                    default:
                        FinskyLog.m21669e("Unknown state %d for %s (adid: %s , isid: %s)", Integer.valueOf(i), ahVar.f16878I, ahVar.ag, ahVar.m16445e());
                        ahVar.m16435a(true);
                        return;
                }
                if (!(i2 == -1 || i2 == i)) {
                    ahVar.m16439b(i2, c2129c.f10814h);
                }
                ahVar.m16443c();
            } catch (Exception e) {
                FinskyLog.m21665c("Exception starting %s: %s", ahVar.f16878I, e);
                try {
                    ahVar.m16431a(ahVar.f16896d.m17243a(ahVar.f16878I), true);
                } catch (Exception e2) {
                    FinskyLog.m21665c("Exception cleaning %s: %s", ahVar.f16878I, e2);
                }
            }
        }
    }

    private final ah m16591r(String str) {
        if (this.f17096z == null || !this.f17096z.f16878I.equals(str)) {
            return null;
        }
        return this.f17096z;
    }

    private final ah m16568a(C2839b c2839b) {
        if (c2839b.mo3155e() != 2) {
            return null;
        }
        String a = c2839b.mo3147a();
        ah r = m16591r(a);
        if (r == null) {
            this.f17073c.mo3180c(c2839b);
            return null;
        }
        C3647b a2 = this.f17072b.m17243a(a);
        if (a2 != null && a2.f18029d != null) {
            return r;
        }
        this.f17073c.mo3180c(c2839b);
        return null;
    }

    private final List m16587g() {
        List a = this.f17072b.m17245a();
        Collections.sort(a, this.f17065D);
        return a;
    }

    final void m16614b(Runnable runnable) {
        bb.m21791a();
        if (this.f17068K != null) {
            runnable.run();
            return;
        }
        this.f17069L.add(runnable);
        if (this.f17067J == null) {
            this.f17067J = new af(this);
            Context context = this.f17071a;
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(context, MultiUserCoordinatorService.class));
            if (!this.f17071a.bindService(intent, this.f17067J, 5)) {
                FinskyLog.m21665c("Couldn't start service for %s", intent);
            }
        }
    }

    final void m16623e() {
        bb.m21791a();
        if (this.f17067J != null) {
            try {
                if (this.f17068K != null) {
                    this.f17068K.mo3466a(null);
                    this.f17068K.mo3465a();
                }
            } catch (RemoteException e) {
                FinskyLog.m21665c("Couldn't sign out from coordinator *** received %s", e);
            }
            this.f17068K = null;
            this.f17071a.unbindService(this.f17067J);
            this.f17067J = null;
        }
    }

    public final void mo3449c(String str, boolean z) {
        this.f17062A.remove(str);
        C3647b a = this.f17072b.m17243a(str);
        if (!(a == null || a.f18029d == null)) {
            boolean z2;
            C2129c c2129c = a.f18029d;
            if (c2129c.f10809c != -1) {
                if (!z || a.f18028c == null) {
                    z2 = true;
                    if (z2) {
                        this.f17076f.mo2660a(new C2131e(str).m11159a().m11162b());
                    }
                    if (!z) {
                        mo3439a(str, false);
                    }
                } else {
                    if (a.f18028c.f11419d < c2129c.f10809c) {
                        z2 = true;
                        if (z2) {
                            this.f17076f.mo2660a(new C2131e(str).m11159a().m11162b());
                        }
                        if (z) {
                            mo3439a(str, false);
                        }
                    }
                }
            }
            z2 = false;
            if (z2) {
                this.f17076f.mo2660a(new C2131e(str).m11159a().m11162b());
            }
            if (z) {
                mo3439a(str, false);
            }
        }
        if (!(z && this.f17083m.dj().mo2294a(12623750))) {
            m16597a(str, 8, 0);
        }
        if (this.f17062A.isEmpty()) {
            m16607a(true);
        }
    }

    public final boolean mo3441a(String str, String str2, ResultReceiver resultReceiver) {
        return this.f17090t.m16524a(str, str2, resultReceiver);
    }

    public final boolean mo3446b(String str, String str2) {
        return this.f17090t.m16523a(str, str2);
    }

    final boolean m16628f() {
        return ((Boolean) C0955b.hP.m28964b()).booleanValue() || this.f17083m.dj().mo2294a(12623761);
    }

    private final boolean m16586d(C3647b c3647b) {
        if (((Boolean) C0955b.js.m28964b()).booleanValue()) {
            return false;
        }
        if (!C0327a.m1722b() && !this.f17083m.dj().mo2294a(12633607)) {
            return false;
        }
        boolean z;
        if ((c3647b.f18029d.f10819m & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f17090t.m16522a() || r0) {
            return false;
        }
        return true;
    }

    private final void m16588h() {
        if (this.f17063B == null) {
            this.f17063B = new ab(this);
            this.f17088r.m14773a(this.f17063B);
        }
    }

    private final void m16589i() {
        if (this.f17064C == null) {
            this.f17064C = new ac(this);
            C2734a c2734a = this.f17088r;
            c2734a.f14960c.post(new C2740f(c2734a, this.f17064C));
        }
    }

    private static bo m16571a(String str, t tVar, int i) {
        return new C2474c(i).m13236a(str).m13231a(tVar).f13342a;
    }

    private final boolean m16590j() {
        return this.f17083m.dj().mo2294a(12642050);
    }
}
