package com.google.android.finsky.wear;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.bn.C2130d;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.download.C2106x;
import com.google.android.finsky.download.C2839b;
import com.google.android.finsky.download.C2845h;
import com.google.android.finsky.download.C2850m;
import com.google.android.finsky.foregroundcoordinator.C3138b;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3647b;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import java.util.HashSet;
import java.util.Set;

public final class C4790k implements C2106x {
    public final C4781b f24998a;
    public final C3322j f24999b;
    public final C2850m f25000c;
    public final Handler f25001d;
    public final C5058o f25002e;
    public final C4784e f25003f;
    public final C2471a f25004g = C1473m.f7980a.aR();
    public final Set f25005h;
    public C4796q f25006i;
    public int f25007j;
    public final boolean f25008k;
    public ForegroundCoordinator f25009l;
    public C3138b f25010m;

    public C4790k(C4781b c4781b, C2850m c2850m, C3322j c3322j, C5058o c5058o, C4784e c4784e, boolean z) {
        this.f24998a = c4781b;
        this.f25000c = c2850m;
        this.f24999b = c3322j;
        this.f25002e = c5058o;
        this.f25003f = c4784e;
        this.f25008k = z;
        this.f25005h = new HashSet();
        this.f25001d = new Handler(Looper.getMainLooper());
        this.f25007j = 0;
    }

    public final C4790k m22546a(cc ccVar) {
        this.f25005h.add(ccVar);
        return this;
    }

    public final void m22550a(String str, String str2, int i, String str3, String str4, C2495w c2495w) {
        if (m22544a(str, str2) != 0) {
            FinskyLog.m21659a("Dropping install request on %s for %s because already installing", str, str2);
            return;
        }
        if (c2495w == null) {
            FinskyLog.m21665c("LoggingContext should not be null!", new Object[0]);
            c2495w = this.f25004g.m13184a("unknown");
        } else if (TextUtils.isEmpty(c2495w.f13432b)) {
            FinskyLog.m21665c("LoggingContext should have non-empty reason!", new Object[0]);
            c2495w = c2495w.m13375a("unknown");
        }
        String str5 = c2495w.f13432b;
        long b = c2495w.m13378b();
        C3646a a = this.f24998a.m22484a(str);
        C3647b a2 = a.m17243a(str2);
        C2322b c2322b = a2 != null ? a2.f18028c : null;
        int i2 = c2322b != null ? c2322b.f11419d : -1;
        t tVar = new t();
        tVar.a(i);
        if (i2 >= 0) {
            tVar.b(i2);
        }
        if (c2322b != null) {
            tVar.a(a2.f18028c.f11422g);
        }
        if (i <= i2) {
            FinskyLog.m21667d("Skipping attempt to download %s version %d over version %d", str2, Integer.valueOf(i), Integer.valueOf(i2));
            C4789j a3 = new C4789j(112, this.f25003f).m22537b(str2).m22538c("older-version").m22534a(tVar);
            a3.f24996b = str;
            m22540a(str2, str, b, a3.m22536a());
            return;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = C1473m.f7980a.bt().m15626a(str2).m15620a(C1473m.f7980a.cZ());
            if (TextUtils.isEmpty(str3)) {
                FinskyLog.m21659a("Cannot update on %s of %s because cannot determine update account.", str, str2);
                return;
            }
        }
        FinskyLog.m21659a("Request install on %s of %s v=%d for %s", str, str2, Integer.valueOf(i), str5);
        a3 = new C4789j(105, this.f25003f).m22537b(str2).m22538c(str5).m22534a(tVar);
        a3.f24996b = str;
        long a4 = m22540a(str2, str, b, a3.m22536a());
        C2129c c2129c = a2 != null ? a2.f18029d : null;
        C2130d a5 = C2130d.m11121a(c2129c, str2);
        a5.m11130b(i);
        a5.m11137d(i);
        a5.m11136c(str3);
        a5.m11139d(str4);
        a5.m11126a(null, 0);
        a5.m11140e(0);
        a5.m11127a(null);
        a5.m11151i(null);
        if (c2129c != null) {
            i2 = c2129c.f10819m;
        } else {
            i2 = 0;
        }
        a5.m11143f((((((i2 & -13) & -1537) & -12289) & -16385) | 32768) | 16);
        a5.m11138d(a4);
        a.f18022b.mo2659a(a5.f10833a);
    }

    final void m22547a(C3647b c3647b) {
        if (c3647b != null && c3647b.f18029d != null) {
            C2127b b = this.f24998a.m22486b(c3647b.f18027b);
            C2130d a = C2130d.m11121a(c3647b.f18029d, c3647b.f18026a);
            a.m11130b(-1);
            a.m11140e(0);
            a.m11127a(null);
            a.m11143f(0);
            a.m11147g(null);
            a.m11129a(null);
            a.m11149h(null);
            a.m11151i(null);
            b.mo2659a(a.f10833a);
        }
    }

    public final int m22544a(String str, String str2) {
        C4796q b = m22543b(str, str2);
        C3647b a;
        if (b != null) {
            a = b.f25043l.m17243a(b.f25034c);
            if (a == null || a.f18029d == null) {
                return 0;
            }
            switch (a.f18029d.f10813g) {
                case 0:
                case 70:
                    return 0;
                case 52:
                case 57:
                case 60:
                    return 3;
                case 90:
                    return 5;
                default:
                    return 2;
            }
        } else if (!this.f25003f.m22520a(str)) {
            return 0;
        } else {
            a = this.f24998a.m22484a(str).m17243a(str2);
            if (!(a == null || a.f18029d == null)) {
                C2129c c2129c = a.f18029d;
                if (c2129c.f10813g == 90) {
                    return 5;
                }
                int i = -1;
                if (a.f18028c != null) {
                    i = a.f18028c.f11419d;
                }
                if (c2129c.f10809c > i) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public final synchronized boolean m22551a() {
        boolean z;
        z = this.f25006i == null && this.f25007j <= 0;
        return z;
    }

    public final synchronized void m22552b() {
        this.f25007j++;
        this.f25001d.post(new C4791l(this));
    }

    final void m22548a(C4796q c4796q) {
        if (!(this.f25006i == null || c4796q == this.f25006i)) {
            FinskyLog.m21669e("Unexpected (late?) finish of task for %s (%s)", c4796q.f25034c, c4796q.f25035d);
        }
        this.f25006i = null;
        m22555c();
        m22552b();
    }

    public final void m22555c() {
        if (this.f25010m != null) {
            ForegroundCoordinator.m16015a(this.f25010m);
            this.f25010m = null;
        }
    }

    private final C4796q m22543b(String str, String str2) {
        if (this.f25006i != null && this.f25006i.f25034c.equals(str2) && this.f25006i.f25035d.equals(str)) {
            return this.f25006i;
        }
        return null;
    }

    public final void mo2645g(C2839b c2839b) {
        if (c2839b.mo3155e() == 3) {
            t tVar;
            C4796q a = m22541a(c2839b);
            if (a == null) {
                tVar = null;
            } else {
                tVar = a.f25038g;
            }
            String r = c2839b.mo3168r();
            String b = c2839b.mo3151b();
            C4789j a2 = new C4789j(101, this.f25003f).m22537b(c2839b.mo3168r()).m22534a(tVar);
            a2.f24996b = c2839b.mo3151b();
            m22545a(r, b, a2.m22536a());
            if (a != null) {
                String a3 = c2839b.mo3147a();
                int i = a.f25043l.m17243a(a3).f18029d.f10813g;
                if (i == 40 || i == 45) {
                    a.m22563a(45, c2839b.mo3162l());
                    return;
                }
                FinskyLog.m21667d("Unexpected download start state for %s (%s): %d, %d", a3, a.f25035d, Integer.valueOf(r2.f10813g), Integer.valueOf(i));
                a.m22574e();
                a.m22567a(a3, 903);
            }
        }
    }

    public final void mo2647e(C2839b c2839b) {
        if (c2839b.mo3155e() == 3) {
            t tVar;
            C4796q a = m22541a(c2839b);
            if (a == null) {
                tVar = null;
            } else {
                tVar = a.f25038g;
            }
            String r = c2839b.mo3168r();
            String b = c2839b.mo3151b();
            C4789j a2 = new C4789j(102, this.f25003f).m22537b(c2839b.mo3168r()).m22534a(tVar);
            a2.f24996b = c2839b.mo3151b();
            m22545a(r, b, a2.m22536a());
            if (a != null) {
                if (a.f25043l.m17243a(a.f25034c).f18029d.f10813g == 45) {
                    a.m22563a(50, c2839b.mo3162l());
                    a.m22568b();
                    return;
                }
                FinskyLog.m21667d("Unexpected download completion state for %s (%s): %d", a.f25034c, a.f25035d, Integer.valueOf(a.f25043l.m17243a(a.f25034c).f18029d.f10813g));
                a.m22574e();
                a.m22567a(a.f25034c, 904);
            }
        }
    }

    public final void mo2644f(C2839b c2839b) {
        if (c2839b.mo3155e() == 3) {
            t tVar;
            C4796q a = m22541a(c2839b);
            if (a == null) {
                tVar = null;
            } else {
                tVar = a.f25038g;
            }
            String r = c2839b.mo3168r();
            String b = c2839b.mo3151b();
            C4789j a2 = new C4789j(103, this.f25003f).m22537b(c2839b.mo3168r()).m22534a(tVar);
            a2.f24996b = c2839b.mo3151b();
            m22545a(r, b, a2.m22536a());
            if (a != null) {
                a.m22574e();
            }
        }
    }

    public final void mo2642b(C2839b c2839b, int i) {
        if (c2839b.mo3155e() == 3) {
            t tVar;
            C4796q a = m22541a(c2839b);
            if (a == null) {
                tVar = null;
            } else {
                tVar = a.f25038g;
            }
            String r = c2839b.mo3168r();
            String b = c2839b.mo3151b();
            C4789j a2 = new C4789j(104, this.f25003f).m22537b(c2839b.mo3168r()).m22533a(i).m22534a(tVar);
            a2.f24996b = c2839b.mo3151b();
            m22545a(r, b, a2.m22536a());
            if (a != null) {
                a.m22574e();
            }
        }
    }

    public final void mo2643b(C2839b c2839b, C2845h c2845h) {
        if (c2839b.mo3155e() == 3) {
            C4796q a = m22541a(c2839b);
            if (a != null && c2845h.f15277b > 0 && a.f25043l.f18022b.mo2657a(a.f25034c).f10816j == 0) {
                a.f25044m.mo2663a(a.f25034c, System.currentTimeMillis());
            }
        }
    }

    public final void mo2646h(C2839b c2839b) {
        if (c2839b.mo3155e() == 3) {
        }
    }

    private final C4796q m22541a(C2839b c2839b) {
        if (c2839b.mo3155e() != 3) {
            return null;
        }
        String b = c2839b.mo3151b();
        if (this.f25003f.m22520a(b)) {
            String a = c2839b.mo3147a();
            C4796q b2 = m22543b(b, a);
            if (b2 == null) {
                FinskyLog.m21665c("Cancel download %s because no InstallerTask", c2839b);
                this.f25000c.mo3180c(c2839b);
                return null;
            } else if (b2.f25035d.equals(c2839b.mo3151b())) {
                C3647b a2 = this.f24998a.m22484a(b).m17243a(a);
                if (a2 != null && a2.f18029d != null) {
                    return b2;
                }
                FinskyLog.m21665c("Cancel download %s no installerdata", c2839b);
                this.f25000c.mo3180c(c2839b);
                return null;
            } else {
                FinskyLog.m21665c("Cancel download %s because InstallerTask node %s", c2839b, b2.f25035d);
                this.f25000c.mo3180c(c2839b);
                return null;
            }
        }
        FinskyLog.m21665c("Cancel download %s because bad node", c2839b);
        this.f25000c.mo3180c(c2839b);
        return null;
    }

    final void m22549a(String str, C3647b c3647b, int i, String str2, String str3) {
        int i2;
        int i3 = c3647b.f18029d.f10809c;
        if (i == 0) {
            i2 = 110;
            FinskyLog.m21665c("Successful remote install of %s version %d (%s)", c3647b.f18026a, Integer.valueOf(i3), str);
        } else {
            i2 = 111;
            FinskyLog.m21665c("Failed remote install of %s version %d (%s) because %d (%s)", c3647b.f18026a, Integer.valueOf(i3), str, Integer.valueOf(i), str2);
        }
        t tVar = new t();
        tVar.a(i3);
        if (c3647b.f18028c != null) {
            if (tVar.b != c3647b.f18028c.f11419d) {
                tVar.b(c3647b.f18028c.f11419d);
            }
            tVar.a(c3647b.f18028c.f11422g);
        }
        String str4 = c3647b.f18026a;
        C4789j a = new C4789j(i2, this.f25003f).m22537b(c3647b.f18026a).m22533a(i).m22534a(tVar);
        a.f24996b = str;
        m22545a(str4, str, a.m22535a(str3).m22536a());
    }

    private final long m22540a(String str, String str2, long j, bo boVar) {
        C2127b b = this.f24998a.m22486b(str2);
        long a = C1473m.f7980a.dc().m13320a(boVar, null, j);
        b.mo2679e(str, a);
        return a;
    }

    public final long m22545a(String str, String str2, bo boVar) {
        long j;
        C2129c a = this.f24998a.m22486b(str2).mo2657a(str);
        if (a != null) {
            j = a.f10795B;
        } else {
            j = -1;
        }
        return m22540a(str, str2, j, boVar);
    }
}
