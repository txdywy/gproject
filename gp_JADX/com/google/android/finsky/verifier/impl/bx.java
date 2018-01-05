package com.google.android.finsky.verifier.impl;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.UserManager;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.support.v4.p028a.C0221j;
import android.support.v7.widget.eq;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.dy.C2917a;
import com.google.android.finsky.dy.C2942x;
import com.google.android.finsky.dy.ac;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.dy.an;
import com.google.android.finsky.foregroundcoordinator.C3138b;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.verifier.impl.p261b.C4740a;
import com.google.android.finsky.verifier.impl.p262a.C4735g;
import com.google.android.finsky.verifier.p259a.p260a.C4697a;
import com.google.android.finsky.verifier.p259a.p260a.C4699c;
import com.google.android.finsky.verifier.p259a.p260a.C4700d;
import com.google.android.finsky.verifier.p259a.p260a.C4706j;
import com.google.android.finsky.verifier.p259a.p260a.C4707k;
import com.google.android.finsky.verifier.p259a.p260a.C4709m;
import com.google.android.finsky.verifier.p259a.p260a.C4719w;
import com.google.android.finsky.verifier.p259a.p260a.C4722z;
import com.google.android.finsky.verifier.p259a.p260a.ad;
import com.google.android.finsky.verifier.p259a.p260a.ae;
import com.squareup.leakcanary.C7582R;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p002a.C0002a;

public final class bx extends C4740a implements dg {
    public PackageWarningDialog f24487A;
    public C4699c f24488B;
    public final C2495w f24489C;
    public boolean f24490D = false;
    public boolean f24491E = false;
    public C0002a f24492a;
    public C1500a f24493b;
    public C1461c f24494c;
    public ForegroundCoordinator f24495d;
    public C4817d f24496e;
    public C2266a f24497f;
    public ab f24498g;
    public final PackageVerificationService f24499h;
    public final Handler f24500i = new Handler(Looper.getMainLooper());
    public final Intent f24501j;
    public final dh f24502k;
    public final C0221j f24503l;
    public final ar f24504m = new ar();
    public final C4756h f24505n = new C4756h();
    public final int f24506o;
    public String f24507p;
    public final long f24508q;
    public boolean f24509r;
    public C3138b f24510s;
    public String f24511t;
    public String f24512u;
    public C4754f f24513v;
    public boolean f24514w = false;
    public int f24515x;
    public AtomicBoolean f24516y = new AtomicBoolean(false);
    public int f24517z;

    public bx(PackageVerificationService packageVerificationService, Intent intent, dh dhVar, C2495w c2495w) {
        this.f24499h = packageVerificationService;
        this.f24503l = C0221j.m1129a(this.f24499h);
        this.f24501j = intent;
        this.f24506o = intent.getIntExtra("android.content.pm.extra.VERIFICATION_ID", -1);
        this.f24507p = intent.getStringExtra("android.content.pm.extra.VERIFICATION_PACKAGE_NAME");
        this.f24502k = dhVar;
        this.f24489C = c2495w;
        this.f24508q = C4678i.m21812a();
        ((ac) C3947d.m18649a(ac.class)).mo1988a(this);
    }

    final int m22247b() {
        return this.f24501j.getIntExtra("android.content.pm.extra.VERIFICATION_INSTALLER_UID", -1);
    }

    final boolean m22253d() {
        return this.f24501j.getBooleanExtra("com.google.android.vending.verifier.extra.FROM_VERIFICATION_ACTIVITY", false);
    }

    private final boolean m22237n() {
        if ((this.f24501j.getIntExtra("android.content.pm.extra.VERIFICATION_INSTALL_FLAGS", 0) & 1) != 0) {
            return true;
        }
        return false;
    }

    final int m22254e() {
        if (m22255f() == 1) {
            return 0;
        }
        return 1;
    }

    final synchronized int m22255f() {
        return this.f24515x;
    }

    final synchronized void m22241a(int i) {
        this.f24515x = i;
    }

    final synchronized String m22256g() {
        String str;
        if (this.f24511t == null) {
            str = this.f24507p;
        } else {
            str = this.f24511t;
        }
        return str;
    }

    private final synchronized String m22238o() {
        return this.f24511t;
    }

    private final synchronized String m22239p() {
        return this.f24512u;
    }

    private final synchronized void m22230a(String str, String str2) {
        this.f24511t = str;
        this.f24512u = str2;
    }

    protected final boolean mo4343a() {
        boolean z;
        if (this.f24489C != null) {
            this.f24489C.m13367a(new C2474c(2621));
        }
        Bundle extras = this.f24501j.getExtras();
        if (!((Boolean) C0955b.by.m28964b()).booleanValue() || C1503a.m8831b(this.f24499h)) {
            FinskyLog.m21659a("Skipping verification because disabled", new Object[0]);
            z = false;
        } else {
            if (!bg.m22121a().m22134i()) {
                if (!m22253d()) {
                    int i;
                    if (extras.containsKey("android.content.pm.extra.VERIFICATION_INSTALLER_UID")) {
                        i = extras.getInt("android.content.pm.extra.VERIFICATION_INSTALLER_UID");
                    } else {
                        i = extras.getInt("android.intent.extra.ORIGINATING_UID");
                    }
                    if (i == Process.myUid()) {
                        FinskyLog.m21659a("Skipping verification because own installation", new Object[0]);
                        z = false;
                    }
                }
                bg a = bg.m22121a();
                if (((Boolean) C0955b.bz.m28964b()).booleanValue() && a.m22128c().mo4349b() == -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    FinskyLog.m21659a("Skipping verification. Disabled by user setting", new Object[0]);
                    z = false;
                } else if (!(bg.m22121a().m22129d() || this.f24497f.m11723e())) {
                    FinskyLog.m21659a("Skipping verification because network inactive", new Object[0]);
                    z = false;
                }
            }
            z = true;
        }
        if (z) {
            C4699c q;
            boolean a2;
            if (VERSION.SDK_INT >= 21) {
                if (((Boolean) C0955b.cO.m28964b()).booleanValue() && this.f24493b.m8818a()) {
                    boolean z2;
                    UserManager userManager = (UserManager) this.f24499h.getSystemService("user");
                    if (userManager == null || !userManager.hasUserRestriction("ensure_verify_apps")) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (userManager == null || !userManager.hasUserRestriction("no_install_unknown_sources")) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z2 || r0) {
                        z = true;
                        if (z) {
                            m22252c(-1);
                        }
                        q = m22240q();
                        if (q != null) {
                            return false;
                        }
                        synchronized (this) {
                            this.f24488B = q;
                        }
                        if (this.f24497f.m11723e()) {
                        }
                        this.f24509r = true;
                        a2 = m22246a(q);
                        if (a2) {
                            m22258i();
                        }
                        if (!a2) {
                        }
                        z = true;
                        m22242a(q, 1, null, z);
                        if (a2) {
                            return true;
                        }
                        return false;
                    }
                }
                z = false;
                if (z) {
                    m22252c(-1);
                }
                q = m22240q();
                if (q != null) {
                    return false;
                }
                synchronized (this) {
                    this.f24488B = q;
                }
                if (this.f24497f.m11723e() || !m22232a((String) C0955b.cB.m28964b())) {
                    this.f24509r = true;
                    a2 = m22246a(q);
                    if (a2) {
                        m22258i();
                    }
                    if (a2 || this.f24491E) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m22242a(q, 1, null, z);
                    if (a2) {
                        return true;
                    }
                    return false;
                } else if (bg.m22121a().m22129d()) {
                    m22249b(q);
                    return true;
                } else if (!((Boolean) C0955b.bA.m28964b()).booleanValue()) {
                    return false;
                } else {
                    m22235d(q);
                    return true;
                }
            }
            z = false;
            if (z) {
                m22252c(-1);
            }
            q = m22240q();
            if (q != null) {
                return false;
            }
            synchronized (this) {
                this.f24488B = q;
            }
            if (this.f24497f.m11723e()) {
            }
            this.f24509r = true;
            a2 = m22246a(q);
            if (a2) {
                m22258i();
            }
            if (a2) {
            }
            z = true;
            m22242a(q, 1, null, z);
            if (a2) {
                return true;
            }
            return false;
        }
        m22241a(1);
        FinskyLog.m21659a("Skipping anti malware verification due to pre-check failure", new Object[0]);
        return false;
    }

    protected final void mo4344c() {
        FinskyLog.m21662b("Anti-Malware verification complete: id=%d, package_name=%s", Integer.valueOf(this.f24506o), this.f24507p);
        this.f24503l.m1133a(new Intent("verify_install_complete"));
        m22258i();
    }

    final void m22257h() {
        m22241a(-1);
        m22258i();
    }

    final boolean m22246a(C4699c c4699c) {
        C0954a.f5815K.m5763a(Boolean.valueOf(true));
        if (bg.m22121a().m22134i()) {
            m22257h();
            return true;
        }
        Object obj;
        if (VERSION.SDK_INT < 21) {
            obj = null;
        } else if (((Boolean) C0955b.cO.m28964b()).booleanValue() && c4699c.f24139E != null && c4699c.f24154m.f24180m && c4699c.f24142H) {
            if (!(c4699c.f24164w == null || c4699c.f24164w.f24210d == null)) {
                for (C4707k c4707k : c4699c.f24164w.f24210d) {
                    if (c4707k.f24213c.equals(c4699c.f24139E.f24216b)) {
                        obj = null;
                        break;
                    }
                }
            }
            obj = 1;
        } else {
            obj = null;
        }
        if (obj != null) {
            m22257h();
            return true;
        } else if (!bg.m22121a().m22129d()) {
            return true;
        } else {
            Object obj2 = (this.f24494c.dj().mo2294a(12633445) || ((Boolean) C0955b.cm.m28964b()).booleanValue()) ? 1 : null;
            if (!((Boolean) C0955b.bI.m28964b()).booleanValue() && obj2 == null) {
                return true;
            }
            byte[] bArr = c4699c.f24145d.f24199b;
            if (((Boolean) C0955b.bI.m28964b()).booleanValue()) {
                C4735g c4735g;
                String str = c4699c.f24154m.f24169b;
                if (!((Boolean) C0955b.bI.m28964b()).booleanValue() || !bg.m22121a().m22129d()) {
                    c4735g = null;
                } else if (ag.m15238b(this.f24494c.dj())) {
                    ag agVar = this.f24499h.f24309b;
                    c4735g = (C4735g) ag.m15236a(agVar.m15240a(new ca(agVar, bArr)));
                } else {
                    ac a = this.f24499h.f24308a.m15218a(str, bArr);
                    if (a != null) {
                        c4735g = new C4735g(a.f15496j, a.f15497k, null, null, false, 0, a.f15493g, false, a.f15507u, a.f15509w, true, a.f15510x);
                    } else {
                        c4735g = null;
                    }
                }
                if (!(c4735g == null || c4735g.f24370g == null || TextUtils.isEmpty(c4735g.f24370g))) {
                    m22250c(c4699c).m22267b(c4735g);
                    return false;
                }
            }
            if (obj2 == null) {
                if (m22259j()) {
                    VerifyInstallSnackbarActivity.m22021a(this.f24499h, true);
                }
                return true;
            }
            this.f24491E = true;
            new C4772y(this.f24499h, bArr, new by(this, c4699c)).m22068k();
            return false;
        }
    }

    public final void mo4370b(int i) {
        Object obj;
        Object obj2;
        synchronized (this) {
            this.f24514w = true;
        }
        this.f24517z = i;
        if (this.f24487A != null && (this.f24487A.f24316r != 1 || this.f24517z == 1)) {
            this.f24487A.finish();
        }
        synchronized (this) {
            if (this.f24513v != null) {
                C4754f c4754f = this.f24513v;
                synchronized (c4754f.f24676b) {
                    c4754f.f24676b.f24573d.remove(c4754f);
                    if (c4754f.f24676b.f24573d.isEmpty() && c4754f.f24676b.f24574e != null) {
                        c4754f.f24676b.f24574e.finish();
                    }
                }
                obj = 1;
            } else {
                obj = null;
            }
        }
        int intExtra = this.f24501j.getIntExtra("android.content.pm.extra.VERIFICATION_VERSION_CODE", -1);
        byte[] bArr = null;
        long j = 0;
        synchronized (this) {
            if (this.f24488B != null) {
                bArr = this.f24488B.f24145d.f24199b;
                j = this.f24488B.f24146e;
            }
        }
        Object obj3 = this.f24517z == 1 ? 1 : null;
        if (this.f24487A != null) {
            obj2 = 1;
        } else {
            obj2 = null;
        }
        m22258i();
        String str = this.f24507p;
        if (!(str == null || bArr == null)) {
            ac a = this.f24499h.f24308a.m15218a(str, bArr);
            if (a == null) {
                this.f24499h.f24308a.m15220a(new ac(str, bArr, j, m22237n()));
            } else {
                this.f24499h.f24308a.m15223a(a.f15487a, a.f15489c, 8);
            }
        }
        synchronized (this) {
            C4699c c4699c = this.f24488B;
        }
        if (ag.m15237a(this.f24494c.dj()) && c4699c != null) {
            m22229a(c4699c, null, 8, this.f24508q, this.f24509r);
        }
        if (obj3 != null) {
            C0954a.f5816L.m5763a(Boolean.valueOf(true));
        }
        Context context = this.f24499h;
        ae aeVar = new ae();
        aeVar.f24124b = new com.google.android.finsky.verifier.p259a.p260a.ac();
        aeVar.f24124b.m21865b(8);
        aeVar.f24124b.m21859a(str);
        aeVar.f24124b.m21866c(intExtra);
        if (bArr != null) {
            aeVar.f24124b.m21861a(bArr);
        }
        aeVar.f24124b.f24116h = new ad();
        if (obj3 != null) {
            ad adVar = aeVar.f24124b.f24116h;
            adVar.f24119a |= 1;
            adVar.f24120b = true;
        }
        if (obj2 != null) {
            adVar = aeVar.f24124b.f24116h;
            adVar.f24119a |= 2;
            adVar.f24121c = true;
        }
        if (obj != null) {
            adVar = aeVar.f24124b.f24116h;
            adVar.f24119a |= 4;
            adVar.f24122d = true;
        }
        bf.m22118a(context, aeVar, true);
        m22069l();
    }

    private final synchronized void m22235d(C4699c c4699c) {
        this.f24513v = C4752d.m22288a().m22290a(new cd(this, c4699c));
        if (!(m22253d() || this.f24513v == null)) {
            m22252c(1);
        }
    }

    private final C4699c m22240q() {
        m22241a(1);
        PackageManager packageManager = this.f24499h.getPackageManager();
        C4699c c4699c = new C4699c();
        cs.m22275a(this.f24499h, this.f24493b, c4699c);
        c4699c.f24154m = new C4700d();
        c4699c.ci_();
        boolean e = bg.m22121a().m22130e();
        if (bg.m22121a().m22134i()) {
            m22241a(-1);
            c4699c.m21881d();
            c4699c.m21882e();
            if (!e && ((Boolean) C0955b.bH.m28964b()).booleanValue()) {
                bg.m22121a().m22126a(true);
            }
            if (!this.f24497f.m11723e()) {
                return null;
            }
        } else if (bg.m22121a().m22133h()) {
            c4699c.m21882e();
        }
        e = ((Boolean) C0955b.cr.m28964b()).booleanValue() && C4671b.m21787d() && this.f24504m.m22082a("device_wide_unlock_source_block");
        if (e) {
            m22241a(-1);
            m22244a(this.f24499h.getString(C7582R.string.verify_apps_generic_unknown_apps_blocking), 0);
            return null;
        } else if (!m22236e(c4699c)) {
            return null;
        } else {
            int i;
            C4700d c4700d;
            Intent registerReceiver;
            List arrayList = new ArrayList();
            Uri uri = (Uri) this.f24501j.getParcelableExtra("android.intent.extra.ORIGINATING_URI");
            Uri uri2 = (Uri) this.f24501j.getParcelableExtra("android.intent.extra.REFERRER");
            if (uri != null) {
                InetAddress byName;
                Object host = uri.getHost();
                try {
                    byName = InetAddress.getByName(host);
                } catch (UnknownHostException e2) {
                    FinskyLog.m21665c("Could not resolve host %s", host);
                    byName = null;
                }
                c4699c.f24144c = uri.toString();
                arrayList.add(am.m22058a(uri, byName, uri2, 0));
            }
            if (uri2 != null) {
                InetAddress byName2;
                Object host2 = uri2.getHost();
                try {
                    byName2 = InetAddress.getByName(host2);
                } catch (UnknownHostException e3) {
                    FinskyLog.m21665c("Could not resolve host %s", host2);
                    byName2 = null;
                }
                arrayList.add(am.m22058a(uri2, byName2, null, 2));
            }
            if (arrayList.size() > 0) {
                c4699c.f24147f = (C4709m[]) arrayList.toArray(new C4709m[arrayList.size()]);
            }
            try {
                if (packageManager.getPackageInfo(this.f24507p, 0) != null) {
                    i = 0;
                    if (i != 0) {
                        c4700d = c4699c.f24154m;
                        c4700d.f24168a |= 512;
                        c4700d.f24180m = true;
                    }
                    e = VERSION.SDK_INT < 17 ? Global.getInt(this.f24499h.getContentResolver(), "adb_enabled", 0) == 0 : Secure.getInt(this.f24499h.getContentResolver(), "adb_enabled", 0) == 0;
                    if (e) {
                        registerReceiver = this.f24499h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                        if (registerReceiver != null) {
                            e = registerReceiver.getIntExtra("plugged", -1) != 2;
                            if (e) {
                                c4699c.f24143b |= eq.FLAG_MOVED;
                                c4699c.f24135A = true;
                            }
                            i = this.f24501j.getIntExtra("android.intent.extra.ORIGINATING_UID", -1);
                            if (i != -1) {
                                c4699c.f24163v = m22234d(i);
                                if (C4747b.m22105a(c4699c.f24163v.f24208b, c4699c.f24148g) && !bg.m22121a().m22129d() && packageManager.checkPermission("android.permission.INSTALL_PACKAGES", c4699c.f24163v.f24210d[0].f24213c) == 0) {
                                    FinskyLog.m21659a("Skipping verification for id=%d", Integer.valueOf(this.f24506o));
                                    return null;
                                }
                            }
                            i = m22247b();
                            if (i != -1) {
                                c4699c.f24164w = m22234d(i);
                            }
                            return c4699c;
                        }
                    }
                    e = false;
                    if (e) {
                        c4699c.f24143b |= eq.FLAG_MOVED;
                        c4699c.f24135A = true;
                    }
                    i = this.f24501j.getIntExtra("android.intent.extra.ORIGINATING_UID", -1);
                    if (i != -1) {
                        c4699c.f24163v = m22234d(i);
                        FinskyLog.m21659a("Skipping verification for id=%d", Integer.valueOf(this.f24506o));
                        return null;
                    }
                    i = m22247b();
                    if (i != -1) {
                        c4699c.f24164w = m22234d(i);
                    }
                    return c4699c;
                }
            } catch (NameNotFoundException e4) {
            }
            e = true;
            if (i != 0) {
                c4700d = c4699c.f24154m;
                c4700d.f24168a |= 512;
                c4700d.f24180m = true;
            }
            if (VERSION.SDK_INT < 17) {
                if (Secure.getInt(this.f24499h.getContentResolver(), "adb_enabled", 0) == 0) {
                }
            }
            if (e) {
                registerReceiver = this.f24499h.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (registerReceiver != null) {
                    if (registerReceiver.getIntExtra("plugged", -1) != 2) {
                    }
                    if (e) {
                        c4699c.f24143b |= eq.FLAG_MOVED;
                        c4699c.f24135A = true;
                    }
                    i = this.f24501j.getIntExtra("android.intent.extra.ORIGINATING_UID", -1);
                    if (i != -1) {
                        c4699c.f24163v = m22234d(i);
                        FinskyLog.m21659a("Skipping verification for id=%d", Integer.valueOf(this.f24506o));
                        return null;
                    }
                    i = m22247b();
                    if (i != -1) {
                        c4699c.f24164w = m22234d(i);
                    }
                    return c4699c;
                }
            }
            e = false;
            if (e) {
                c4699c.f24143b |= eq.FLAG_MOVED;
                c4699c.f24135A = true;
            }
            i = this.f24501j.getIntExtra("android.intent.extra.ORIGINATING_UID", -1);
            if (i != -1) {
                c4699c.f24163v = m22234d(i);
                FinskyLog.m21659a("Skipping verification for id=%d", Integer.valueOf(this.f24506o));
                return null;
            }
            i = m22247b();
            if (i != -1) {
                c4699c.f24164w = m22234d(i);
            }
            return c4699c;
        }
    }

    private final boolean m22236e(com.google.android.finsky.verifier.p259a.p260a.C4699c r14) {
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
        r13 = this;
        r0 = r13.f24499h;
        r2 = r0.getPackageManager();
        r0 = r13.f24501j;
        r3 = r0.getData();
        r0 = r13.f24506o;
        r4 = com.google.android.finsky.verifier.impl.de.m22298a(r0, r3, r2);
        if (r4 != 0) goto L_0x0030;
    L_0x0014:
        r0 = "Cannot read archive for %s in request id=%d";
        r1 = 2;
        r1 = new java.lang.Object[r1];
        r2 = 0;
        r3 = r13.f24501j;
        r3 = r3.getData();
        r1[r2] = r3;
        r2 = 1;
        r3 = r13.f24506o;
        r3 = java.lang.Integer.valueOf(r3);
        r1[r2] = r3;
        com.google.android.finsky.utils.FinskyLog.m21659a(r0, r1);
        r0 = 0;
    L_0x002f:
        return r0;
    L_0x0030:
        r0 = r13.f24501j;
        r0 = r0.getData();
        r1 = r13.f24506o;
        r0 = com.google.android.finsky.verifier.impl.de.m22299a(r1, r0);
        if (r0 == 0) goto L_0x0044;
    L_0x003e:
        r1 = r0.isDirectory();
        if (r1 != 0) goto L_0x00ff;
    L_0x0044:
        r0 = new java.io.File;
        r1 = r4.applicationInfo;
        r1 = r1.sourceDir;
        r0.<init>(r1);
        r1 = r4.packageName;
        r13.f24507p = r1;
        r1 = r14.f24154m;
        r5 = r4.packageName;
        r1.m21884a(r5);
        r1 = r14.f24154m;
        r5 = r4.versionCode;
        r6 = r1.f24168a;
        r6 = r6 | 2;
        r1.f24168a = r6;
        r1.f24170c = r5;
        r6 = r0.length();
        r14.f24146e = r6;
        r1 = r13.f24489C;	 Catch:{ IOException -> 0x015d }
        if (r1 == 0) goto L_0x008f;	 Catch:{ IOException -> 0x015d }
    L_0x006e:
        r1 = new com.google.wireless.android.a.a.a.a.ct;	 Catch:{ IOException -> 0x015d }
        r1.<init>();	 Catch:{ IOException -> 0x015d }
        r6 = r0.length();	 Catch:{ IOException -> 0x015d }
        r5 = r1.a;	 Catch:{ IOException -> 0x015d }
        r5 = r5 | 1;	 Catch:{ IOException -> 0x015d }
        r1.a = r5;	 Catch:{ IOException -> 0x015d }
        r1.b = r6;	 Catch:{ IOException -> 0x015d }
        r5 = r13.f24489C;	 Catch:{ IOException -> 0x015d }
        r6 = new com.google.android.finsky.d.c;	 Catch:{ IOException -> 0x015d }
        r7 = 2625; // 0xa41 float:3.678E-42 double:1.297E-320;	 Catch:{ IOException -> 0x015d }
        r6.<init>(r7);	 Catch:{ IOException -> 0x015d }
        r1 = r6.m13229a(r1);	 Catch:{ IOException -> 0x015d }
        r5.m13367a(r1);	 Catch:{ IOException -> 0x015d }
    L_0x008f:
        r1 = com.google.android.finsky.utils.C4688t.m21836a(r0);	 Catch:{ IOException -> 0x015d }
        r1 = r1.f24072b;	 Catch:{ IOException -> 0x015d }
        r1 = com.google.android.finsky.verifier.impl.am.m22057a(r1);	 Catch:{ IOException -> 0x015d }
        r14.f24145d = r1;	 Catch:{ IOException -> 0x015d }
        r1 = r13.f24489C;	 Catch:{ IOException -> 0x015d }
        if (r1 == 0) goto L_0x00ab;	 Catch:{ IOException -> 0x015d }
    L_0x009f:
        r1 = r13.f24489C;	 Catch:{ IOException -> 0x015d }
        r5 = new com.google.android.finsky.d.c;	 Catch:{ IOException -> 0x015d }
        r6 = 2626; // 0xa42 float:3.68E-42 double:1.2974E-320;	 Catch:{ IOException -> 0x015d }
        r5.<init>(r6);	 Catch:{ IOException -> 0x015d }
        r1.m13367a(r5);	 Catch:{ IOException -> 0x015d }
    L_0x00ab:
        r1 = r4.signatures;
        r1 = com.google.android.finsky.verifier.impl.C4747b.m22106a(r1);
        r1 = com.google.android.finsky.verifier.impl.am.m22059a(r1);
        r14.f24148g = r1;
        r1 = r14.f24154m;	 Catch:{ IOException -> 0x0187, RuntimeException -> 0x016f, NoSuchAlgorithmException -> 0x0180 }
        r0 = com.google.android.finsky.verifier.impl.ed.m22361a(r0);	 Catch:{ IOException -> 0x0187, RuntimeException -> 0x016f, NoSuchAlgorithmException -> 0x0180 }
        r1.f24171d = r0;	 Catch:{ IOException -> 0x0187, RuntimeException -> 0x016f, NoSuchAlgorithmException -> 0x0180 }
    L_0x00bf:
        r0 = r4.applicationInfo;
        r0 = r0.loadLabel(r2);
        if (r0 == 0) goto L_0x00de;
    L_0x00c7:
        r0 = r0.toString();
        r1 = r13.f24499h;
        r1 = r1.getResources();
        r1 = r1.getConfiguration();
        r1 = r1.locale;
        r1 = r1.toString();
        r13.m22230a(r0, r1);
    L_0x00de:
        r0 = r13.m22237n();
        if (r0 == 0) goto L_0x00e9;
    L_0x00e4:
        r0 = r14.f24154m;
        r0.cj_();
    L_0x00e9:
        r0 = r4.applicationInfo;
        r0 = r0.flags;
        r0 = r0 & 2;
        if (r0 == 0) goto L_0x00fc;
    L_0x00f1:
        r0 = r14.f24154m;
        r1 = r0.f24168a;
        r1 = r1 | 256;
        r0.f24168a = r1;
        r1 = 1;
        r0.f24178k = r1;
    L_0x00fc:
        r0 = 1;
        goto L_0x002f;
    L_0x00ff:
        r5 = new java.io.File;
        r1 = r4.applicationInfo;
        r1 = r1.sourceDir;
        r5.<init>(r1);
        r6 = new java.util.ArrayList;
        r6.<init>();
        r7 = r0.listFiles();
        r8 = r7.length;
        r0 = 0;
        r1 = r0;
    L_0x0114:
        if (r1 >= r8) goto L_0x014d;
    L_0x0116:
        r9 = r7[r1];
        r0 = r9.isDirectory();
        if (r0 != 0) goto L_0x0135;
    L_0x011e:
        r0 = r5.getAbsolutePath();
        r10 = r9.getAbsolutePath();
        r0 = r0.equals(r10);
        if (r0 != 0) goto L_0x0135;
    L_0x012c:
        r0 = com.google.android.finsky.utils.C4688t.m21836a(r9);	 Catch:{ IOException -> 0x0139 }
        r0 = r0.f24072b;	 Catch:{ IOException -> 0x0139 }
        r6.add(r0);	 Catch:{ IOException -> 0x0139 }
    L_0x0135:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0114;
    L_0x0139:
        r0 = move-exception;
        r10 = "Error while calculating sha256 for split apk=%s, error=%s";
        r11 = 2;
        r11 = new java.lang.Object[r11];
        r12 = 0;
        r9 = r9.getAbsoluteFile();
        r11[r12] = r9;
        r9 = 1;
        r11[r9] = r0;
        com.google.android.finsky.utils.FinskyLog.m21665c(r10, r11);
        goto L_0x0135;
    L_0x014d:
        r0 = r6.size();
        if (r0 <= 0) goto L_0x0044;
    L_0x0153:
        r0 = r14.f24154m;
        r1 = com.google.android.finsky.verifier.impl.am.m22060a(r6);
        r0.f24179l = r1;
        goto L_0x0044;
    L_0x015d:
        r0 = move-exception;
        r1 = "Error while calculating sha256 for file=%s, error=%s";
        r2 = 2;
        r2 = new java.lang.Object[r2];
        r4 = 0;
        r2[r4] = r3;
        r3 = 1;
        r2[r3] = r0;
        com.google.android.finsky.utils.FinskyLog.m21665c(r1, r2);
        r0 = 0;
        goto L_0x002f;
    L_0x016f:
        r0 = move-exception;
    L_0x0170:
        r1 = "Error while getting information about apk contents for file=%s, error=%s";
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = 0;
        r5[r6] = r3;
        r3 = 1;
        r5[r3] = r0;
        com.google.android.finsky.utils.FinskyLog.m21665c(r1, r5);
        goto L_0x00bf;
    L_0x0180:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x0187:
        r0 = move-exception;
        goto L_0x0170;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.verifier.impl.bx.e(com.google.android.finsky.verifier.a.a.c):boolean");
    }

    private final C4706j m22234d(int i) {
        String[] strArr;
        PackageManager packageManager = this.f24499h.getPackageManager();
        C4706j c4706j = new C4706j();
        String nameForUid = packageManager.getNameForUid(i);
        String[] packagesForUid = packageManager.getPackagesForUid(i);
        if (packagesForUid == null) {
            strArr = new String[0];
        } else {
            strArr = packagesForUid;
        }
        if (strArr.length == 0) {
            String format;
            if (TextUtils.isEmpty(nameForUid)) {
                format = String.format(Locale.US, "uid:%d", new Object[]{Integer.valueOf(i)});
            } else {
                format = nameForUid;
            }
            c4706j.m21907a(format);
            return c4706j;
        }
        if (strArr.length > 1 || !strArr[0].equals(nameForUid)) {
            c4706j.m21907a(nameForUid);
        }
        List arrayList = new ArrayList();
        int i2 = 0;
        Object obj = 1;
        int length = strArr.length;
        int i3 = 0;
        while (i3 < length) {
            Object obj2;
            String str = strArr[i3];
            C4707k c4707k = new C4707k();
            c4707k.m21911a(str);
            if (i2 < ((Integer) C0955b.ck.m28964b()).intValue()) {
                PackageInfo packageInfo = null;
                try {
                    packageInfo = packageManager.getPackageInfo(str, obj != null ? 64 : 0);
                } catch (NameNotFoundException e) {
                    FinskyLog.m21665c("Could not retrieve info for package %s", str);
                }
                if (ag.m15238b(this.f24494c.dj())) {
                    if (packageInfo != null) {
                        C4722z a = this.f24505n.m22364a(str, packageInfo);
                        if (a != null) {
                            c4707k.f24214d = am.m22057a(a.f24294d);
                            i2++;
                        }
                    }
                } else if (packageInfo == null) {
                    this.f24499h.f24308a.m15228b(str);
                } else {
                    ac b = this.f24505n.m22368b(str, packageInfo);
                    if (b != null) {
                        c4707k.f24214d = am.m22057a(b.f15489c);
                        i2++;
                    }
                }
                if (!(packageInfo == null || obj == null)) {
                    c4706j.f24208b = am.m22059a(C4747b.m22106a(packageInfo.signatures));
                    obj2 = null;
                    arrayList.add(c4707k);
                    i3++;
                    obj = obj2;
                }
            }
            obj2 = obj;
            arrayList.add(c4707k);
            i3++;
            obj = obj2;
        }
        if (arrayList.size() > 0) {
            c4706j.f24210d = (C4707k[]) arrayList.toArray(new C4707k[arrayList.size()]);
        }
        return c4706j;
    }

    final void m22249b(C4699c c4699c) {
        this.f24510s = this.f24495d.m16016a(7, this.f24494c.dj(), new cf(this, c4699c));
    }

    final void m22242a(C4699c c4699c, int i, Integer num, boolean z) {
        String str = c4699c.f24154m.f24169b;
        byte[] bArr = c4699c.f24145d.f24199b;
        if (!(str == null || bArr == null || !z)) {
            ac a = this.f24499h.f24308a.m15218a(str, bArr);
            if (a == null) {
                String o;
                String p;
                synchronized (this) {
                    o = m22238o();
                    p = m22239p();
                }
                this.f24499h.f24308a.m15220a(new ac(str, 0, bArr, c4699c.f24146e, m22237n(), null, false, i, 0, null, null, 0, o, p, false));
            } else {
                this.f24499h.f24308a.m15223a(a.f15487a, a.f15489c, i);
            }
        }
        if (ag.m15237a(this.f24494c.dj())) {
            m22229a(c4699c, null, i, this.f24508q, this.f24509r);
        }
        if (z) {
            C0954a.f5816L.m5763a(Boolean.valueOf(true));
        }
        bf.m22120a(this.f24499h, false, i, str, Integer.valueOf(c4699c.f24154m.f24170c), bArr, num);
    }

    final co m22250c(C4699c c4699c) {
        return new ci(this, c4699c, c4699c);
    }

    final void m22244a(String str, int i) {
        this.f24503l.m1133a(new Intent("verify_install_dialog_shown"));
        PackageWarningDialog.m22008a(this.f24499h, 1, m22256g(), str, i, new VerifyAppsInstallTask$6(this));
    }

    private final ac m22233b(C4699c c4699c, C4735g c4735g) {
        if (ag.m15237a(this.f24494c.dj())) {
            m22229a(c4699c, c4735g, -1, this.f24508q, this.f24509r);
        }
        return m22227a(c4699c, c4735g, this.f24508q);
    }

    private final void m22229a(C4699c c4699c, C4735g c4735g, int i, long j, boolean z) {
        String o;
        String p;
        ag agVar = this.f24499h.f24309b;
        synchronized (this) {
            o = m22238o();
            p = m22239p();
        }
        C4697a c4697a = new C2917a().m15206a(c4699c.f24154m.f24169b).m15207a(c4699c.f24145d.f24199b).m15205a(c4699c.f24154m.f24170c).m15208b(o).m15209c(p).f15486a;
        C4719w c4719w = new C4719w();
        byte[] bArr = c4699c.f24145d.f24199b;
        if (bArr == null) {
            throw new NullPointerException();
        }
        com.google.android.finsky.verifier.p259a.p260a.ab abVar;
        c4719w.f24272a |= 1;
        c4719w.f24273b = bArr;
        c4719w.f24272a |= 2;
        c4719w.f24274c = j;
        c4719w.f24276e = i;
        c4719w.f24272a |= 8;
        c4719w.f24272a |= 4;
        c4719w.f24275d = z;
        if (c4735g != null) {
            c4719w.f24279h = c4735g.f24364a;
            c4719w.f24272a |= 16;
        }
        if (c4735g == null || c4735g.f24364a == 0) {
            abVar = null;
        } else {
            abVar = new C2942x().m15305a(c4699c.f24145d.f24199b).m15302a(c4735g.f24364a).m15303a(j).m15304a(c4735g.f24370g).m15307b(c4735g.f24365b).m15308c(c4699c.f24153l).m15306b(1).f15561a;
        }
        agVar.m15242b(new cn(this, agVar, c4697a, c4719w, abVar)).mo4398a(new an());
    }

    private final ac m22227a(C4699c c4699c, C4735g c4735g, long j) {
        ac acVar;
        String str = null;
        int i = 0;
        String str2 = null;
        String str3 = null;
        if (c4735g != null) {
            str = c4735g.f24370g;
            i = c4735g.f24364a;
            str2 = c4735g.f24365b;
            str3 = c4699c.f24153l;
        }
        com.google.android.finsky.dy.ad adVar = this.f24499h.f24308a;
        synchronized (this) {
            String o = m22238o();
            String p = m22239p();
        }
        ac a = adVar.m15218a(c4699c.f24154m.f24169b, c4699c.f24145d.f24199b);
        if (a == null) {
            acVar = new ac(c4699c.f24154m.f24169b, c4699c.f24145d.f24199b, c4699c.f24146e, c4699c.f24154m.f24173f, str, i, str2, str3, j, o, p, j);
        } else {
            int i2;
            long j2 = a.f15488b;
            if (a.f15488b < 0 || c4699c.f24154m.f24180m) {
                j2 = 0;
            }
            if (a.f15505s) {
                i2 = a.f15504r;
            } else if (Math.abs(a.f15506t - C4678i.m21812a()) > ((Long) C0955b.bT.m28964b()).longValue()) {
                i2 = 1;
            } else {
                i2 = a.f15504r + 1;
            }
            long j3 = a.f15506t;
            if (i2 != a.f15504r) {
                j3 = j;
            }
            acVar = new ac(c4699c.f24154m.f24169b, j2, c4699c.f24145d.f24199b, c4699c.f24146e, c4699c.f24154m.f24173f, a.f15492f, str, i, str2, str3, j, o, p, i2, j3, a.f15507u);
        }
        adVar.m15220a(acVar);
        return a;
    }

    final synchronized void m22258i() {
        if (!this.f24514w) {
            this.f24502k.mo4378b(this.f24506o, m22255f());
            this.f24514w = true;
        }
    }

    final void m22243a(C4699c c4699c, C4735g c4735g) {
        if (19 <= VERSION.SDK_INT && "harmful_distribution".equalsIgnoreCase(c4735g.f24370g)) {
            C4707k[] c4707kArr;
            if (c4699c.f24163v == null || c4699c.f24163v.f24210d == null) {
                if (c4699c.f24164w != null && c4699c.f24164w.f24210d != null && c4699c.f24164w.f24210d.length == 1) {
                    c4707kArr = c4699c.f24164w.f24210d;
                    if (c4707kArr.length > 0) {
                        cs.m22281b(this.f24499h, c4707kArr[0].f24213c);
                    }
                }
            } else if (c4699c.f24163v.f24210d.length == 1) {
                c4707kArr = c4699c.f24163v.f24210d;
                if (c4707kArr.length > 0) {
                    cs.m22281b(this.f24499h, c4707kArr[0].f24213c);
                }
            }
        }
    }

    @TargetApi(17)
    final synchronized void m22252c(int i) {
        if (!this.f24490D) {
            this.f24490D = true;
            this.f24502k.mo4376a(this.f24506o, i);
        }
    }

    final boolean m22259j() {
        if (m22070m()) {
            return false;
        }
        if (!this.f24494c.dj().mo2294a(12627485)) {
            return false;
        }
        int b = m22247b();
        if (b == -1) {
            return false;
        }
        String str;
        if (VERSION.SDK_INT >= 23) {
            str = "com.google.android.packageinstaller";
        } else {
            str = "com.android.packageinstaller";
        }
        String[] packagesForUid = this.f24499h.getPackageManager().getPackagesForUid(b);
        if (packagesForUid == null || packagesForUid.length != 1) {
            return false;
        }
        for (Object equals : packagesForUid) {
            if (str.equals(equals)) {
                return true;
            }
        }
        return false;
    }

    private static boolean m22232a(String str) {
        try {
            InetAddress.getByName(str);
            return true;
        } catch (UnknownHostException e) {
            return false;
        }
    }

    static boolean m22231a(long j, long j2, long j3) {
        return Math.abs(j - j3) <= ((long) Math.min(Math.pow(2.0d, (double) j2) * ((double) ((Long) C0955b.bS.m28964b()).longValue()), (double) ((Long) C0955b.bT.m28964b()).longValue()));
    }
}
