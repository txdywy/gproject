package com.google.android.finsky.hygiene;

import android.accounts.Account;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.net.NetworkInfo;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.Parcelable;
import android.provider.Settings.Global;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.support.v4.app.cm;
import android.support.v4.os.C0327a;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.ac.C0977e;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.aq.C1501b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bi.C1642b;
import com.google.android.finsky.billing.common.C1789d;
import com.google.android.finsky.billing.p131e.C1821j;
import com.google.android.finsky.billing.profile.C2063t;
import com.google.android.finsky.billing.profile.C2067x;
import com.google.android.finsky.billing.profile.C2068y;
import com.google.android.finsky.billing.profile.C2069z;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.bp.C2155a;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.bv.C2189a;
import com.google.android.finsky.bv.C2190d;
import com.google.android.finsky.bv.C2192c;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.bz.C2236c;
import com.google.android.finsky.bz.C2241g;
import com.google.android.finsky.bz.C2242h;
import com.google.android.finsky.ca.C2251c;
import com.google.android.finsky.ca.C2252d;
import com.google.android.finsky.cg.C2278e;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.da.C2500d;
import com.google.android.finsky.datasync.BrowseDataSyncTaskService;
import com.google.android.finsky.datasync.C2514a;
import com.google.android.finsky.datasync.C2522h;
import com.google.android.finsky.datasync.C2523i;
import com.google.android.finsky.datasync.C2524j;
import com.google.android.finsky.datasync.C2530p;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.foregroundcoordinator.C3138b;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.heterodyne.HeterodyneSyncService;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.instantapps.statussync.StatusSyncService;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.preregistration.C3197o;
import com.google.android.finsky.preregistration.C3928a;
import com.google.android.finsky.preregistration.C3934g;
import com.google.android.finsky.preregistration.C3936i;
import com.google.android.finsky.preregistration.C3937j;
import com.google.android.finsky.ratereview.C3964c;
import com.google.android.finsky.scheduler.ba;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.p238b.C4024b;
import com.google.android.finsky.setup.VpaService;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.C5106e;
import com.google.android.gms.common.api.C5089p;
import com.google.android.gms.gcm.C5195a;
import com.google.android.gms.gcm.C5202h;
import com.google.android.gms.p277c.C4979a;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.a.a.a.a.ao;
import com.google.wireless.android.a.a.a.a.cc;
import com.google.wireless.android.a.a.a.a.t;
import com.google.wireless.android.a.a.a.a.u;
import com.google.wireless.android.a.a.a.a.v;
import com.google.wireless.android.finsky.dfe.f.a.b;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class DailyHygiene implements C3175r {
    public static boolean f16429a = false;
    public final C2471a f16430b = C1473m.f7980a.aR();
    public final C1506e f16431c = C1473m.f7980a.mo2035O();
    public final C1503a f16432d = C1473m.f7980a.mo2036P();
    public final C3300k f16433e;
    public final bb f16434f;
    public final Service f16435g;
    public final Context f16436h;
    public final boolean f16437i;
    public final ForegroundCoordinator f16438j;
    public C3138b f16439k;
    public C1552e f16440l;
    public C0977e f16441m;
    public C2495w f16442n;
    public final int f16443o;
    public final boolean f16444p;
    public C3204n f16445q;

    public class DailyHygieneService extends Service {
        public Context createConfigurationContext(Configuration configuration) {
            return VERSION.SDK_INT >= 17 ? new C6332e(super.createConfigurationContext(configuration)) : null;
        }

        public AssetManager getAssets() {
            return C6331c.m28986b(this);
        }

        public Resources getResources() {
            return C6331c.m28981a(this);
        }

        public Theme getTheme() {
            return C6331c.m28987c(this);
        }

        public void setTheme(int i) {
            super.setTheme(i);
            C6331c.m28984a((Context) this, i);
        }

        public IBinder onBind(Intent intent) {
            return null;
        }

        public int onStartCommand(Intent intent, int i, int i2) {
            FinskyLog.m21662b("DailyHygieneService started", new Object[0]);
            int intExtra = intent.getIntExtra("reason", 0);
            boolean booleanExtra;
            if (intent.hasExtra("probed-core-success")) {
                C2495w a = C1473m.f7980a.aR().m13179a(intent.getExtras());
                booleanExtra = intent.getBooleanExtra("probed-uses-dfe-api", false);
                String stringExtra = intent.getStringExtra("probed-account-name");
                C1254c c1254c = null;
                if (booleanExtra) {
                    if (TextUtils.isEmpty(stringExtra)) {
                        c1254c = C1473m.f7980a.ao();
                    } else {
                        c1254c = C1473m.f7980a.mo2112b(stringExtra);
                    }
                }
                new DailyHygiene(this, false, intExtra, true).mo3361a(c1254c, intent.getBooleanExtra("probed-core-success", false), C1473m.f7980a.mo2249j(stringExtra), a, false);
            } else {
                Object obj;
                booleanExtra = intent.getBooleanExtra("foreground", false) || C1473m.f7980a.aW().mo3369g();
                DailyHygiene dailyHygiene = new DailyHygiene(this, booleanExtra, intExtra, false);
                C0957n c0957n = C0954a.f5851u;
                if (((Boolean) c0957n.m5760a()).booleanValue()) {
                    obj = null;
                } else if (C1473m.f7980a.bP().m14775a()) {
                    FinskyLog.m21659a("No holdoff required - already provisioned", new Object[0]);
                    c0957n.m5763a(Boolean.valueOf(true));
                    obj = null;
                } else if (((Long) C0955b.aK.m28964b()).longValue() <= 0) {
                    FinskyLog.m21659a("No holdoff required - disabled", new Object[0]);
                    c0957n.m5763a(Boolean.valueOf(true));
                    obj = null;
                } else {
                    FinskyLog.m21659a("DailyHygiene holdoff continue", new Object[0]);
                    obj = 1;
                }
                if (obj != null) {
                    C1473m.f7980a.aW().mo3364a(dailyHygiene.f16442n);
                } else {
                    FinskyLog.m21659a("Beginning daily hygiene, foreground = %s, reason = %d", Boolean.valueOf(dailyHygiene.f16437i), Integer.valueOf(dailyHygiene.f16443o));
                    DailyHygiene.f16429a = true;
                    if (dailyHygiene.f16437i) {
                        dailyHygiene.f16439k = dailyHygiene.f16438j.m16016a(0, dailyHygiene.f16440l, new C3190a(dailyHygiene));
                    } else {
                        C3204n c3204n = dailyHygiene.f16445q;
                        C3204n.m16249a("beginOtaCleanup");
                        if (c3204n.f16508d.mo2294a(12605261)) {
                            FinskyLog.m21665c("OTA cleanup disabled by kill-switch", new Object[0]);
                        } else {
                            boolean a2 = C1473m.f7980a.cj().m14979a();
                            if (a2) {
                                C0954a.aI.m5765c();
                            }
                            if (C1473m.f7980a.cj().m14980b() || a2) {
                                FinskyLog.m21659a("Diff version or system, clear token & cache", new Object[0]);
                                C2693e.m14552a().mo3112a(C1473m.f7980a.ap());
                                C1473m.f7980a.bk().mo4380a(new C3205o(c3204n), "system_or_phonesky_version_changed");
                            }
                        }
                        c3204n.m16250a();
                    }
                }
            }
            return 2;
        }
    }

    public DailyHygiene(Service service, boolean z, int i, boolean z2) {
        C1473m.f7980a.aM();
        this.f16433e = C1473m.f7980a.mo2256o();
        this.f16434f = C1473m.f7980a.bZ();
        this.f16435g = service;
        this.f16436h = service.getApplicationContext();
        this.f16437i = z;
        this.f16443o = i;
        this.f16444p = z2;
        this.f16441m = C1473m.f7980a.cA();
        this.f16438j = C1473m.f7980a.bz();
        this.f16440l = C1473m.f7980a.dj();
        this.f16442n = this.f16430b.m13184a(null).m13366a(C1473m.f7980a.cY());
        try {
            C1473m.f7980a.aU().m7132a(C3202l.f16504a);
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Failed to register DailyHygiene critical job.", new Object[0]);
        }
        this.f16445q = new C3204n(this.f16443o, this, this.f16440l, this.f16442n);
    }

    static void m16178a(String str) {
        FinskyLog.m21662b("DailyHygiene stage: %s", str);
    }

    public final void mo3361a(C1254c c1254c, boolean z, C1552e c1552e, C2495w c2495w, boolean z2) {
        this.f16440l = c1552e;
        this.f16442n = c2495w;
        if (z2) {
            m16182b(z);
            return;
        }
        m16178a("updateDeviceConfiguration");
        if (!((Boolean) C0955b.df.m28964b()).booleanValue() || this.f16444p || (c1254c != null && c1254c.mo1620b() == null)) {
            m16184d(c1254c, z);
            return;
        }
        ArrayDeque b = C2693e.m14552a().m14568b(c1254c);
        int intValue = ((Integer) C0954a.f5849s.m5760a()).intValue();
        boolean z3 = intValue == 0 || intValue != C1473m.f7980a.bi();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            C2693e.m14552a().m14562a((C1254c) it.next(), new C3193d(), true, z3);
        }
        m16184d(c1254c, z);
    }

    private final void m16184d(C1254c c1254c, boolean z) {
        if (C1473m.f7980a.dj().mo2294a(12646337) || this.f16444p || c1254c == null) {
            m16185e(c1254c, z);
            return;
        }
        C2693e.m14552a().m14561a(c1254c, new C3194e());
        m16185e(c1254c, z);
    }

    private final void m16185e(C1254c c1254c, boolean z) {
        if (((Boolean) C0955b.is.m28964b()).booleanValue() && !this.f16444p) {
            m16178a("startHeterodyneSyncService");
            Context context = this.f16436h;
            C2495w c2495w = this.f16442n;
            Intent intent = new Intent(context, HeterodyneSyncService.class);
            c2495w.m13376a(intent);
            context.startService(intent);
        }
        m16178a("loadAndReplicateAndContinue");
        if (m16181a(C1473m.f7980a.bi())) {
            m16182b(true);
            return;
        }
        Runnable c3195f = new C3195f(this, c1254c, z);
        C1473m.f7980a.ah().mo2815a(c3195f);
        C1473m.f7980a.ai().mo2799a(c3195f, "daily-hygiene");
        C1473m.f7980a.mo2029I().m17248a(c3195f);
        C1473m.f7980a.cg().m9310a(c3195f);
    }

    final void m16191a(C1254c c1254c, boolean z) {
        m16178a("startWearService");
        if (this.f16432d.f8183g || this.f16432d.f8182f) {
            m16186f(c1254c, z);
        } else if (this.f16437i) {
            m16186f(c1254c, z);
        } else {
            C1473m.f7980a.an().m22465a(C1473m.f7980a.f7981b, null, "hygiene_reason_daily", this.f16437i);
            m16186f(c1254c, z);
        }
    }

    private final void m16186f(C1254c c1254c, boolean z) {
        m16178a("performPreregistrationHygieneAndContinue");
        if (this.f16437i) {
            m16194b(c1254c, z);
            return;
        }
        C1473m c1473m = C1473m.f7980a;
        C3934g f = c1473m.mo2243f();
        C3197o c3198h = new C3198h(this, c1473m, c1254c, z);
        Context context = this.f16436h;
        if (f.f19899d.dj().mo2294a(12603110)) {
            c3198h.mo3373a(true);
        } else if (f.f19901f.mo2816a()) {
            C2335k c3928a = new C3928a();
            c3928a.m11918a(new C3936i(f, c3928a, c3198h, context));
            c3928a.m11917a(new C3937j(c3198h));
            for (C2197a c2197a : f.f19901f.mo2822e()) {
                Collection b = c2197a.mo2785b("u-pl");
                if (!b.isEmpty()) {
                    c3928a.m14759a(c3928a.f19889e.mo2016a(c2197a.mo2780a().name), C1283d.m7689a(b), false);
                }
            }
            if (c3928a.a.size() == 0) {
                c3928a.m_();
            }
        } else {
            FinskyLog.m21669e("Require loaded libraries to perform pre-registration hygiene.", new Object[0]);
            c3198h.mo3373a(true);
        }
    }

    final void m16194b(C1254c c1254c, boolean z) {
        m16178a("logDeviceFeaturesAndContinue");
        int i = (this.f16437i || C1473m.f7980a.mo2036P().f8183g) ? 1 : 0;
        if (i != 0) {
            m16187g(c1254c, z);
            return;
        }
        C1642b c1642b = new C1642b(C1473m.f7980a.f7981b);
        FinskyLog.m21659a("Logging device features", new Object[0]);
        c1642b.f8572e = c1254c == null ? null : c1254c.mo1620b();
        c1642b.f8569b = new C5089p(c1642b.f8568a, c1642b, c1642b).m23647a(C4979a.f25481c).m23652b();
        c1642b.f8569b.mo4557e();
        m16187g(c1254c, z);
    }

    private final void m16187g(C1254c c1254c, boolean z) {
        m16178a("updateManagedConfigurations");
        if (!this.f16437i || this.f16440l.mo2294a(12608406)) {
            C1473m c1473m = C1473m.f7980a;
            if (c1473m.mo2033M().m8818a()) {
                Account b = c1254c == null ? null : c1254c.mo1620b();
                C2251c a = c1473m.mo2048a();
                boolean z2 = this.f16437i;
                if (a.f11182e.m11681a()) {
                    com.google.android.finsky.utils.bb.m21792a(new C2252d(a, z2), new Void[0]);
                } else {
                    a.m11685a(b == null ? null : b.name, 1303, "cannot-set-restrictions", 0, null, null);
                }
            }
            m16188h(c1254c, z);
            return;
        }
        m16188h(c1254c, z);
    }

    private final void m16188h(C1254c c1254c, boolean z) {
        m16178a("scheduleUpdateInMaintenanceWindow");
        C2241g bN = C1473m.f7980a.bN();
        Runnable c3199i = new C3199i(this, c1254c, z);
        if (VERSION.SDK_INT < 21) {
            c3199i.run();
            return;
        }
        b g = bN.f11150a.m8827g();
        if (g == null) {
            c3199i.run();
            return;
        }
        long j;
        long j2;
        int i;
        long a = C1500a.m8815a(g);
        if (a < g.c) {
            j = 0;
            j2 = g.c - a;
        } else {
            j = TimeUnit.DAYS.toMillis(1) - a;
            j2 = g.c + j;
        }
        long[] jArr = new long[]{j, j2};
        FinskyLog.m21659a("Maintenance window starts in %d minutes, ends in %d minutes.", Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(jArr[0])), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(jArr[1])));
        C4024b c4024b = new C4024b();
        if (bN.f11151b.m18669b()) {
            i = 2;
        } else {
            i = 1;
        }
        c4024b.m18839a(jArr[0]).m18838a(i).m18843b(jArr[1]);
        FinskyLog.m21659a("Scheduling auto-update check in maintenance window using JobScheduler.", new Object[0]);
        bN.f11152c.m18888a(172398765, "maintenance-window", C2236c.class, c4024b.m18837a(), null).mo4398a(new C2242h(c3199i));
    }

    final void m16195c(C1254c c1254c, boolean z) {
        m16178a("flushEventLogsAndContinue");
        if (this.f16431c.m8841d()) {
            int bi = C1473m.f7980a.bi();
            if (((Boolean) C0955b.gV.m28964b()).booleanValue()) {
                com.google.android.finsky.utils.bb.m21792a(new C3192c(this, bi), new Void[0]);
            }
        }
        C1473m.f7980a.aX().m16009b();
        m16178a("verifyInstalledPackagesAndContinue");
        if (((Boolean) C0955b.cd.m28964b()).booleanValue() && !this.f16444p) {
            C1473m.f7980a.bp().mo4359a(this.f16437i);
            if (((Boolean) C0955b.cm.m28964b()).booleanValue()) {
                C1473m.f7980a.bp().mo4362b();
            }
        }
        if (c1254c != null && c1254c.mo1620b() == null && this.f16431c.m8841d()) {
            FinskyLog.m21665c("Concluding Daily Hygiene because unauthenticated and headless", new Object[0]);
            m16182b(z);
            return;
        }
        m16178a("submitUnsubmittedReviews");
        if (this.f16437i) {
            m16189i(c1254c, z);
            return;
        }
        Account[] d = C1473m.f7980a.mo2041U().mo1188d();
        C3964c ac = C1473m.f7980a.ac();
        for (Account account : d) {
            ac.m18680a(account.name, this.f16436h, false);
            ac.m18680a(account.name, this.f16436h, true);
        }
        try {
            File[] listFiles = this.f16436h.getCacheDir().listFiles();
            if (listFiles != null) {
                long currentTimeMillis = System.currentTimeMillis() - ((Long) C0955b.eo.m28964b()).longValue();
                for (File file : listFiles) {
                    if ((file.getName().startsWith("unsubmitted_reviews_") || file.getName().startsWith("unsubmitted_testing_program_reviews_")) && (file.length() == 0 || file.lastModified() < currentTimeMillis)) {
                        file.delete();
                    }
                }
            }
        } catch (Exception e) {
            FinskyLog.m21667d("Error pruning unsubmitted reviews: %s", e.toString());
        }
        m16189i(c1254c, z);
    }

    private final void m16189i(C1254c c1254c, boolean z) {
        int i;
        boolean z2;
        int i2 = 0;
        m16178a("syncHomePage");
        if (!this.f16431c.m8841d() && C1473m.f7980a.ay().m9026e()) {
            m16178a("fetchHomePageFromDfeApi");
            if (c1254c == null || c1254c.mo1620b() == null) {
                FinskyLog.m21662b("Unable to sync home page because DfeApi is null or unauthenticated.", new Object[0]);
                this.f16442n.m13367a(new C2474c(557).m13244b("DFE_API_NULL_OR_UNAUTHENTICATED"));
            } else {
                Account b = c1254c.mo1620b();
                Object obj = null;
                if (!TextUtils.isEmpty(b.name)) {
                    obj = (String) C0954a.aR.m5777b(b.name).m5760a();
                }
                if (TextUtils.isEmpty(obj)) {
                    FinskyLog.m21662b("Unable to sync home page because home url is not stored in preferences. Using BrowseDataSyncScheduler instead.", new Object[0]);
                    m16190a();
                } else {
                    C3200j c3200j = new C3200j(this, c1254c, obj);
                }
            }
        }
        m16178a("syncLocalCacheData");
        if (!this.f16431c.m8841d()) {
            if (this.f16440l.mo2294a(12640688)) {
                m16193b();
            } else {
                new Thread(new C3201k(this)).start();
            }
        }
        m16178a("logAppFreshnessAndContinue");
        if (!this.f16444p) {
            m16178a("logAppFreshnessData");
            long longValue = ((Long) C0954a.f5852v.m5760a()).longValue();
            if (longValue == 0 || C4678i.m21812a() - longValue > ((Long) C0955b.gO.m28964b()).longValue()) {
                i = true;
            } else {
                i = 0;
            }
            if (i != 0) {
                u c = m16183c();
                if (c.b.length != 0 || C1473m.f7980a.dj().mo2294a(12637343)) {
                    this.f16442n.m13367a(new C2474c(166).m13232a(c));
                    C0954a.f5852v.m5763a(Long.valueOf(C4678i.m21812a()));
                }
            }
        }
        m16178a("runDeviceVerificationCheck");
        if (!this.f16444p) {
            C2500d c2500d = new C2500d(this.f16436h, this.f16442n);
            String str = (String) C0954a.aJ.m5760a();
            String str2 = (String) C0955b.iJ.m28964b();
            boolean z3 = ((Boolean) C0954a.aI.m5760a()) != null;
            if (z3 && TextUtils.equals(str, str2)) {
                FinskyLog.m21662b("Device verification skipped, previous result %s, local='%s', remote='%s'", r0, str, str2);
            } else {
                FinskyLog.m21662b("Device verification run, previous result %s, local='%s', remote='%s'", r0, str, str2);
                if (z3) {
                    i = 552;
                } else {
                    i = 551;
                }
                c2500d.f13449a.m13371a(new C2474c(i).f13342a, null);
                if (c2500d.f13453e == null) {
                    c2500d.f13453e = c2500d.f13450b.m23652b();
                }
                c2500d.f13453e.mo4557e();
            }
        }
        m16178a("prefetchAndCacheDataPlan");
        m16178a("prefetchAndCacheFopOptionsIfNeeded");
        if (!(c1254c == null || c1254c.mo1620b() == null)) {
            C2067x aI = C1473m.f7980a.aI();
            if (aI.m10831a(c1254c.mo1636c())) {
                Context context = this.f16436h;
                if (!(c1254c == null || context == null)) {
                    String c2 = c1254c.mo1636c();
                    if (!C2067x.m10830b(c2)) {
                        if (aI.f10602b.m5777b(c2).m5760a() == null) {
                            FinskyLog.m21662b("FOP options cache does not exist.", new Object[0]);
                            i = 0;
                        } else if (aI.f10603c.m5777b(c2).m5760a() == null || ((Long) aI.f10603c.m5777b(c2).m5760a()).longValue() + ((Long) C0955b.ik.m28964b()).longValue() <= System.currentTimeMillis()) {
                            FinskyLog.m21662b("FOP options cache time does not exist or has expired.", new Object[0]);
                            i = 0;
                        } else {
                            z2 = true;
                        }
                        if (i == 0) {
                            c1254c.mo1621b(new C2068y(aI, c1254c, context), new C2069z());
                            aI.f10604d.m9765a(context, c1254c.mo1636c());
                        }
                    }
                }
            }
        }
        m16178a("showDeferredVpaNotificationIfNeeded");
        Context context2 = C1473m.f7980a.f7981b;
        C2162a bn = C1473m.f7980a.bn();
        z2 = ((Boolean) C0955b.hz.m28964b()).booleanValue() ? true : (!C4671b.m21787d() || ((Boolean) C0955b.hw.m28964b()).booleanValue() || !((Boolean) C0954a.bf.m5760a()).booleanValue() || ((Boolean) C0954a.be.m5760a()).booleanValue() || C1503a.m8831b(context2)) ? false : true;
        if (z2) {
            VpaService.m19140a("startvpafordeferredsetupnotification", context2, bn);
        }
        m16178a("acquirePreloadedAppsIfNeeded");
        context2 = C1473m.f7980a.f7981b;
        bn = C1473m.f7980a.bn();
        if (C1473m.f7980a.cG().f21101a.cY() == null) {
            i = 0;
        } else if (!((Boolean) C0954a.bc.m5760a()).booleanValue()) {
            i = 0;
        } else if (((Integer) C0954a.bd.m5760a()).intValue() >= ((Integer) C0955b.fV.m28964b()).intValue()) {
            FinskyLog.m21667d("Used up all %d PAI acquisition attempts", C0954a.bd.m5760a());
            i = 0;
        } else {
            z2 = true;
        }
        if (i != 0) {
            VpaService.m19140a("acquirepreloads", context2, bn);
        }
        m16178a("logSessionStatsAndContinue");
        if (((Boolean) C0955b.de.m28964b()).booleanValue() && !this.f16444p) {
            try {
                C3209w.m16257a();
                context2 = this.f16436h;
                C2495w c2495w = this.f16442n;
                cc ccVar = new cc();
                ccVar.a(C1473m.f7980a.mo2265x().m18668a());
                ccVar.b(C1473m.f7980a.mo2265x().m18669b());
                Account[] d = C1473m.f7980a.mo2041U().mo1188d();
                if (d != null) {
                    ccVar.c(d.length);
                }
                NetworkInfo a = C2278e.m11746a(context2);
                if (a != null) {
                    ccVar.a(a.getType());
                    ccVar.b(a.getSubtype());
                }
                String cZ = C1473m.f7980a.cZ();
                if (!TextUtils.isEmpty(cZ)) {
                    ccVar.e(C1821j.m9832b(cZ));
                }
                ccVar.d(((Integer) C0954a.f5833c.m5760a()).intValue());
                if (VERSION.SDK_INT >= 17) {
                    i = Global.getInt(C1473m.f7980a.f7981b.getContentResolver(), "install_non_market_apps", -1);
                } else {
                    i = Secure.getInt(C1473m.f7980a.f7981b.getContentResolver(), "install_non_market_apps", -1);
                }
                if (i == -1) {
                    FinskyLog.m21667d("Couldn't obtain INSTALL_NON_MARKET_APPS value", new Object[0]);
                } else {
                    if (i != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ccVar.c(z2);
                }
                ccVar.n = C2063t.m10825d(cZ);
                i = context2.getResources().getIdentifier("config_downloadDataDirSize", "integer", "android");
                if (i != 0) {
                    ccVar.f(Resources.getSystem().getInteger(i));
                }
                try {
                    ccVar.a(Secure.getLong(C1473m.f7980a.f7981b.getContentResolver(), "download_manager_max_bytes_over_mobile"));
                } catch (SettingNotFoundException e) {
                }
                com.google.android.finsky.utils.bb.m21792a(new C3210x(new C2474c(1).m13225a(ccVar), context2, cZ, c2495w), new Void[0]);
            } catch (Throwable e2) {
                FinskyLog.m21663b(e2, "Fatal exception while logging session stats", new Object[0]);
            }
        }
        m16178a("removeSupervisorInO");
        if (!C1473m.f7980a.dj().mo2294a(12630167)) {
            C2155a bG = C1473m.f7980a.bG();
            C3300k o = C1473m.f7980a.mo2256o();
            if (C0327a.m1722b()) {
                try {
                    bG.f10907a.getPackageManager().getPackageInfo("com.google.android.instantapps.supervisor", 0);
                    FinskyLog.m21659a("Removing Supervisor on an O+ device.", new Object[0]);
                    o.mo3445b("com.google.android.instantapps.supervisor", false);
                } catch (NameNotFoundException e3) {
                }
            }
        }
        m16178a("enableChromeOnManagedProfileOnO");
        if (VERSION.SDK_INT == 26 && ((Boolean) C0955b.jz.m28964b()).booleanValue()) {
            C1501b N = C1473m.f7980a.mo2034N();
            if (VERSION.SDK_INT == 26 && N.f8170a.m8822b() && !((Boolean) C0954a.bC.m5760a()).booleanValue()) {
                try {
                    if ((N.f8171b.getPackageInfo("com.android.chrome", 8192).applicationInfo.flags & 8388608) == 0) {
                        FinskyLog.m21659a("Enabling Chrome on managed profile.", new Object[0]);
                        N.f8172c.mo3820a("com.android.chrome", 3);
                        C0954a.bC.m5763a(Boolean.valueOf(true));
                    }
                } catch (NameNotFoundException e4) {
                }
            }
        }
        m16178a("cleanupAgsaVersion");
        C1552e dj = C1473m.f7980a.dj();
        if (dj.mo2294a(12643460)) {
            int i3;
            FinskyLog.m21662b("Cleanup AGSA: Experiment enabled", new Object[0]);
            C2322b a2 = C1473m.f7980a.mo2032L().mo2854a("com.google.android.googlequicksearchbox");
            if (a2 != null) {
                FinskyLog.m21662b("Cleanup AGSA: isInstalled", new Object[0]);
                i3 = a2.f11419d;
                if (a2.f11423h) {
                    FinskyLog.m21662b("Cleanup AGSA: isUpdatedSystemApp", new Object[0]);
                    if (i3 < ((Integer) C0955b.jP.m28964b()).intValue() || i3 > ((Integer) C0955b.jQ.m28964b()).intValue()) {
                        FinskyLog.m21662b("Cleanup AGSA: isNotInVersionRange, installed ver:%d", Integer.valueOf(i3));
                        i2 = i3;
                        i3 = 2101;
                        z2 = true;
                    } else if (!dj.mo2294a(12644029) || ((Boolean) C0954a.f5854x.m5760a()).booleanValue()) {
                        if (dj.mo2294a(12644030)) {
                            C2129c a3 = C1473m.f7980a.mo2169c().mo2657a("com.google.android.googlequicksearchbox");
                            if (a3 != null && a3.f10808b == 2) {
                                FinskyLog.m21662b("Cleanup AGSA: isInVersionRangeButPackageAUDisabled", new Object[0]);
                                m16177a(i3, true, 2105);
                                return;
                            }
                        }
                        FinskyLog.m21662b("Cleanup AGSA: isInVersionRange", new Object[0]);
                        this.f16433e.mo3445b("com.google.android.googlequicksearchbox", false);
                        i2 = i3;
                        i3 = 2100;
                        z2 = true;
                    } else {
                        FinskyLog.m21662b("Cleanup AGSA: isInVersionRangeButGlobalAUDisabled", new Object[0]);
                        m16177a(i3, true, 2104);
                        return;
                    }
                }
                FinskyLog.m21662b("Cleanup AGSA: isNotUpdatedSystemApp", new Object[0]);
                z2 = a2.f11422g;
                i2 = i3;
                i3 = 2102;
            } else {
                FinskyLog.m21662b("Cleanup AGSA: isNotInstalled", new Object[0]);
                i3 = 2103;
                z2 = false;
            }
            m16177a(i2, z2, i3);
            m16179a(z);
            return;
        }
        m16179a(z);
    }

    final void m16190a() {
        m16178a("scheduleSync");
        if (!C1473m.f7980a.ay().m9026e()) {
            return;
        }
        String str;
        if (this.f16440l.mo2294a(12643665)) {
            C2522h c2522h = new C2522h(this.f16434f, C1473m.f7980a.aN(), this.f16442n.m13365a());
            FinskyLog.m21659a("Cancelling BrowseDataSync.", new Object[0]);
            c2522h.f13546a.m18887a(14141414).mo4398a(C4831h.f25111a);
            FinskyLog.m21659a("Scheduling BrowseDataSync.", new Object[0]);
            ba baVar = c2522h.f13546a;
            str = "browse-data-sync";
            Class cls = C2514a.class;
            C4024b a = new C4024b().m18839a(TimeUnit.SECONDS.toMillis(((Long) C0955b.dv.m28964b()).longValue())).m18843b(TimeUnit.SECONDS.toMillis(((Long) C0955b.dw.m28964b()).longValue())).m18838a(1);
            if (c2522h.f13547b.dj().mo2294a(12638126) || c2522h.f13547b.dj().mo2294a(12638128)) {
                a.m18838a(2);
            }
            if (c2522h.f13547b.dj().mo2294a(12638127) || c2522h.f13547b.dj().mo2294a(12638128)) {
                a.m18840a(true);
            }
            baVar.m18888a(14141414, str, cls, a.m18837a(), null).mo4398a(new C2523i(c2522h));
            this.f16442n.m13371a(new C2474c(529).f13342a, null);
        } else if (C5106e.m23700a(this.f16436h) == 0) {
            C2524j c2524j = new C2524j(this.f16436h, C1473m.f7980a.aN());
            FinskyLog.m21659a("Cancelling BrowseDataSync wifi via GcmNetworkManager", new Object[0]);
            C5195a a2 = C5195a.m23967a(c2524j.f13550a);
            str = "BrowseDataSyncScheduler.TASK_TAG";
            Parcelable componentName = new ComponentName(a2.f26228b, BrowseDataSyncTaskService.class);
            C5195a.m23969a(str);
            if (a2.m23975b(componentName.getClassName())) {
                Intent a3 = a2.m23971a();
                if (a3 != null) {
                    a3.putExtra("scheduler_action", "CANCEL_TASK");
                    a3.putExtra("tag", str);
                    a3.putExtra("component", componentName);
                    a2.f26228b.sendBroadcast(a3);
                }
            }
            FinskyLog.m21659a("Scheduling BrowseDataSync wifi via GcmNetworkManager", new Object[0]);
            C5202h a4 = new C5202h().m23985a(BrowseDataSyncTaskService.class).m23984a(((Long) C0955b.dv.m28964b()).longValue(), ((Long) C0955b.dw.m28964b()).longValue());
            a4.e = "BrowseDataSyncScheduler.TASK_TAG";
            if (c2524j.f13551b.dj().mo2294a(12638126) || c2524j.f13551b.dj().mo2294a(12638128)) {
                a4.c = 1;
            }
            if (c2524j.f13551b.dj().mo2294a(12638127) || c2524j.f13551b.dj().mo2294a(12638128)) {
                a4.h = true;
            }
            C5195a.m23967a(c2524j.f13550a).m23972a(a4.m23987b());
            this.f16442n.m13371a(new C2474c(529).f13342a, null);
        } else {
            this.f16442n.m13371a(new C2474c(530).m13244b("gms_core_unavailable").f13342a, null);
        }
    }

    final void m16193b() {
        new C2530p(this.f16436h, C1473m.f7980a.aT(), C1473m.f7980a.aN(), false).m13472a();
    }

    private final void m16177a(int i, boolean z, int i2) {
        t tVar = new t();
        tVar.a(i);
        tVar.a(z);
        this.f16442n.m13367a(new C2474c(194).m13254g(i2).m13231a(tVar));
    }

    private final void m16179a(boolean z) {
        m16178a("updateLauncherShortcutsIfNeeded");
        if (this.f16440l.mo2294a(12638384)) {
            try {
                C2190d c2190d;
                C2189a ck = C1473m.f7980a.ck();
                if (VERSION.SDK_INT < 25) {
                    c2190d = C2189a.f10974a;
                } else {
                    c2190d = new C2192c(ck.f10975b, ck.f10976c, ck.f10977d, ck.f10978e);
                }
                c2190d.mo2777a();
            } catch (Throwable e) {
                FinskyLog.m21660a(e, "unable to configure shortcuts", new Object[0]);
            }
        }
        m16178a("syncInstantAppStatus");
        if (C4671b.m21787d() && this.f16440l.mo2294a(12635348)) {
            Intent intent = new Intent(this.f16436h, StatusSyncService.class);
            if (this.f16436h.getPackageManager().queryIntentServices(intent, 0).size() == 1) {
                intent.putExtra("KILL_IAO", this.f16440l.mo2294a(12625103));
                this.f16436h.startService(intent);
            }
        }
        m16178a("refreshAdIdCache");
        if (z && this.f16440l.mo2294a(12635427) && C1473m.f7980a.mo2023C() != null) {
            C1473m.f7980a.mo2023C().mo2829a(2302);
        }
        m16178a("refreshNotificationAndroidSystemSettingCache");
        if (this.f16440l.mo2294a(12640913) && C4671b.m21786c()) {
            int intValue = ((Integer) C0954a.bG.m5760a()).intValue();
            int i = cm.m1438a(this.f16436h).m1439a() ? 1 : 0;
            if (intValue != i) {
                this.f16442n.m13371a(new C2474c(422).m13235a(Integer.valueOf(intValue)).m13243b(Integer.valueOf(i)).f13342a, null);
                C0954a.bG.m5763a(Integer.valueOf(i));
            }
        }
        if (this.f16440l.mo2294a(12643012) && ((Long) C0955b.jO.m28964b()).longValue() > 0) {
            m16178a("deleteCachedTempPatchFiles");
            try {
                File cacheDir = C1473m.f7980a.f7981b.getCacheDir();
                m16180a(cacheDir.listFiles(new C3191b()));
                File file = new File(cacheDir, "self_update_patches");
                if (file.exists()) {
                    m16180a(file.listFiles());
                }
            } catch (Exception e2) {
                FinskyLog.m21665c("Failed to clean up temp patch files: %s", e2);
            }
        }
        if (this.f16440l.mo2294a(12644633)) {
            ao aoVar = new ao();
            if (((Boolean) C1789d.f9316c.m5760a()).booleanValue()) {
                aoVar.a(((Integer) C1789d.f9315b.m5760a()).intValue());
            } else {
                aoVar.a(0);
            }
            aoVar.b(this.f16433e.mo3442b());
            C2474c c2474c = new C2474c(2001);
            c2474c.m13220a(aoVar);
            this.f16442n.m13367a(c2474c);
        }
        m16182b(z);
    }

    private static void m16180a(File[] fileArr) {
        if (fileArr != null) {
            for (File file : fileArr) {
                if (C4678i.m21812a() - file.lastModified() > ((Long) C0955b.jO.m28964b()).longValue() && !file.delete()) {
                    FinskyLog.m21659a("Could not delete file %s.", file.getName());
                }
            }
        }
    }

    private static u m16183c() {
        long a = C4678i.m21812a();
        List arrayList = new ArrayList();
        C3646a I = C1473m.f7980a.mo2029I();
        C2127b c2127b = I.f18022b;
        C2320a c2320a = I.f18023c;
        int i = 0;
        for (C2129c c2129c : c2127b.mo2658a()) {
            String str = c2129c.f10807a;
            C2322b a2 = c2320a.mo2854a(str);
            if (a2 != null) {
                i++;
                long j = c2129c.f10797D;
                if (j != 0) {
                    j = a - j;
                    if (j >= ((Long) C0955b.gN.m28964b()).longValue()) {
                        v vVar = new v();
                        vVar.a(str);
                        vVar.a(a2.f11419d);
                        vVar.a(j);
                        arrayList.add(vVar);
                    }
                }
            }
        }
        u uVar = new u();
        uVar.b = (v[]) arrayList.toArray(new v[0]);
        uVar.a(i);
        return uVar;
    }

    private final void m16182b(boolean z) {
        if (!this.f16444p) {
            C1473m.f7980a.aW().mo3363a(this.f16443o, z, this.f16437i, this.f16442n);
        }
        if (this.f16439k != null) {
            ForegroundCoordinator.m16015a(this.f16439k);
        }
        f16429a = false;
        this.f16435g.stopSelf();
    }

    public static boolean m16181a(int i) {
        int intValue = ((Integer) C0955b.aN.m28964b()).intValue();
        int intValue2 = ((Integer) C0955b.aO.m28964b()).intValue();
        if (intValue <= 0 || intValue2 <= 0) {
            return false;
        }
        if (i < intValue || i > intValue2) {
            return false;
        }
        FinskyLog.m21665c("Scheduling emergency daily hygiene, %d <= %d <= %d", Integer.valueOf(intValue), Integer.valueOf(i), Integer.valueOf(intValue2));
        return true;
    }
}
