package com.google.android.gms.internal;

import android.app.Application;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import android.text.TextUtils;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.util.C5147b;
import com.google.android.gms.common.util.C5153h;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;

public class hv {
    public static volatile hv f26922a;
    public int f26923A;
    public int f26924B;
    public long f26925C;
    public final long f26926D = this.f26939n.mo4629a();
    public final Context f26927b;
    public final gj f26928c = new gj(this);
    public final hj f26929d;
    public final hc f26930e;
    public final hr f26931f;
    public final jb f26932g;
    public final AppMeasurement f26933h;
    public final jl f26934i;
    public final ha f26935j;
    public final gk f26936k;
    public final gy f26937l;
    public final hg f26938m;
    public final C5147b f26939n = C5153h.f26089a;
    public final ig f26940o;
    public final il f26941p;
    public final go f26942q;
    public final ib f26943r;
    public final gx f26944s;
    public final hh f26945t;
    public final ji f26946u;
    public final gd f26947v;
    public final boolean f26948w;
    public boolean f26949x;
    public Boolean f26950y;
    public long f26951z;

    private hv(ia iaVar) {
        boolean z;
        String aa;
        he heVar;
        am.m23733a((Object) iaVar);
        this.f26927b = iaVar.f26958a;
        hz hjVar = new hj(this);
        hjVar.m24433y();
        this.f26929d = hjVar;
        hjVar = new hc(this);
        hjVar.m24433y();
        this.f26930e = hjVar;
        m24761d().f26849h.m24653a("App measurement is starting up, version", Long.valueOf(gj.m24441G()));
        gj.m24442H();
        m24761d().f26849h.m24652a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        hjVar = new jl(this);
        hjVar.m24433y();
        this.f26934i = hjVar;
        hjVar = new ha(this);
        hjVar.m24433y();
        this.f26935j = hjVar;
        hjVar = new go(this);
        hjVar.m24433y();
        this.f26942q = hjVar;
        hjVar = new gx(this);
        hjVar.m24433y();
        this.f26944s = hjVar;
        gj.m24442H();
        CharSequence t = hjVar.m24575t();
        hy g = m24764g();
        if (TextUtils.isEmpty(t)) {
            z = false;
        } else {
            aa = g.mo4744r().aa();
            gj.m24442H();
            z = aa.equals(t);
        }
        if (z) {
            heVar = m24761d().f26849h;
            aa = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
        } else {
            heVar = m24761d().f26849h;
            String str = "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ";
            aa = String.valueOf(t);
            aa = aa.length() != 0 ? str.concat(aa) : new String(str);
        }
        heVar.m24652a(aa);
        m24761d().f26850i.m24652a("Debug-level message logging enabled");
        hjVar = new gk(this);
        hjVar.m24433y();
        this.f26936k = hjVar;
        hjVar = new gy(this);
        hjVar.m24433y();
        this.f26937l = hjVar;
        new gh(this).m24433y();
        this.f26947v = new gd(this);
        hjVar = new hg(this);
        hjVar.m24433y();
        this.f26938m = hjVar;
        hjVar = new ig(this);
        hjVar.m24433y();
        this.f26940o = hjVar;
        hjVar = new il(this);
        hjVar.m24433y();
        this.f26941p = hjVar;
        hjVar = new ib(this);
        hjVar.m24433y();
        this.f26943r = hjVar;
        hjVar = new ji(this);
        hjVar.m24433y();
        this.f26946u = hjVar;
        this.f26945t = new hh(this);
        this.f26933h = new AppMeasurement(this);
        FirebaseAnalytics firebaseAnalytics = new FirebaseAnalytics(this);
        hjVar = new jb(this);
        hjVar.m24433y();
        this.f26932g = hjVar;
        new hq(this).m24433y();
        hjVar = new hr(this);
        hjVar.m24433y();
        this.f26931f = hjVar;
        if (this.f26923A != this.f26924B) {
            m24761d().f26845d.m24654a("Not all components initialized", Integer.valueOf(this.f26923A), Integer.valueOf(this.f26924B));
        }
        this.f26948w = true;
        gj.m24442H();
        if (this.f26927b.getApplicationContext() instanceof Application) {
            hy f = m24763f();
            if (f.mo4736j().getApplicationContext() instanceof Application) {
                Application application = (Application) f.mo4736j().getApplicationContext();
                if (f.f26959a == null) {
                    f.f26959a = new C5311if(f);
                }
                application.unregisterActivityLifecycleCallbacks(f.f26959a);
                application.registerActivityLifecycleCallbacks(f.f26959a);
                f.mo4742p().f26851j.m24652a("Registered activity lifecycle callback");
            }
        } else {
            m24761d().f26847f.m24652a("Application context is not an Application");
        }
        this.f26931f.m24733a(new hw(this));
    }

    public static hv m24753a(Context context) {
        am.m23733a((Object) context);
        am.m23733a(context.getApplicationContext());
        if (f26922a == null) {
            synchronized (hv.class) {
                if (f26922a == null) {
                    f26922a = new hv(new ia(context));
                }
            }
        }
        return f26922a;
    }

    static void m24754a(hy hyVar) {
        if (hyVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    static void m24755a(hz hzVar) {
        if (hzVar == null) {
            throw new IllegalStateException("Component not created");
        } else if (!hzVar.m24431w()) {
            throw new IllegalStateException("Component not initialized");
        }
    }

    private final hh m24756n() {
        if (this.f26945t != null) {
            return this.f26945t;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final ji m24757o() {
        m24755a(this.f26946u);
        return this.f26946u;
    }

    final void m24758a() {
        if (!this.f26948w) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
    }

    public final hj m24760c() {
        m24754a(this.f26929d);
        return this.f26929d;
    }

    public final hc m24761d() {
        m24755a(this.f26930e);
        return this.f26930e;
    }

    public final hr m24762e() {
        m24755a(this.f26931f);
        return this.f26931f;
    }

    public final ib m24763f() {
        m24755a(this.f26943r);
        return this.f26943r;
    }

    public final jl m24764g() {
        m24754a(this.f26934i);
        return this.f26934i;
    }

    public final gk m24765h() {
        m24755a(this.f26936k);
        return this.f26936k;
    }

    public final hg m24766i() {
        m24755a(this.f26938m);
        return this.f26938m;
    }

    public final il m24767j() {
        m24755a(this.f26941p);
        return this.f26941p;
    }

    public final gx m24768k() {
        m24755a(this.f26944s);
        return this.f26944s;
    }

    public final boolean m24769l() {
        boolean z = false;
        m24762e().mo4728b();
        m24758a();
        if (this.f26928c.m24468J()) {
            return false;
        }
        Boolean a = this.f26928c.m24469a("firebase_analytics_collection_enabled");
        if (a != null) {
            z = a.booleanValue();
        } else if (!gj.m24443K()) {
            z = true;
        }
        return m24760c().m24681a(z);
    }

    protected final boolean m24759b() {
        boolean z = false;
        m24758a();
        m24762e().mo4728b();
        if (this.f26950y == null || this.f26951z == 0 || !(this.f26950y == null || this.f26950y.booleanValue() || Math.abs(this.f26939n.mo4630b() - this.f26951z) <= 1000)) {
            boolean z2;
            hy g;
            Object u;
            this.f26951z = this.f26939n.mo4630b();
            gj.m24442H();
            if (m24764g().m24938b("android.permission.INTERNET") && m24764g().m24938b("android.permission.ACCESS_NETWORK_STATE")) {
                if (dr.f26667b.m24299a(this.f26927b).m24296a() || (ho.m24690a(this.f26927b) && ja.m24856a(this.f26927b))) {
                    z2 = true;
                    this.f26950y = Boolean.valueOf(z2);
                    if (this.f26950y.booleanValue()) {
                        g = m24764g();
                        u = m24768k().m24576u();
                        if (TextUtils.isEmpty(u)) {
                            am.m23733a(u);
                            if (u.matches("^1:\\d+:android:[a-f0-9]+$")) {
                                g.mo4742p().f26845d.m24653a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", u);
                            } else {
                                z = true;
                            }
                        } else {
                            g.mo4742p().f26845d.m24652a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                        }
                        this.f26950y = Boolean.valueOf(z);
                    }
                }
            }
            z2 = false;
            this.f26950y = Boolean.valueOf(z2);
            if (this.f26950y.booleanValue()) {
                g = m24764g();
                u = m24768k().m24576u();
                if (TextUtils.isEmpty(u)) {
                    am.m23733a(u);
                    if (u.matches("^1:\\d+:android:[a-f0-9]+$")) {
                        z = true;
                    } else {
                        g.mo4742p().f26845d.m24653a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", u);
                    }
                } else {
                    g.mo4742p().f26845d.m24652a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
                }
                this.f26950y = Boolean.valueOf(z);
            }
        }
        return this.f26950y.booleanValue();
    }

    final void m24770m() {
        m24762e().mo4728b();
        m24758a();
        m24762e().mo4728b();
        m24758a();
        if ((this.f26949x ? 1 : null) != null) {
            long abs;
            if (this.f26925C > 0) {
                abs = 3600000 - Math.abs(this.f26939n.mo4630b() - this.f26925C);
                if (abs > 0) {
                    m24761d().f26851j.m24653a("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                    m24756n().m24677a();
                    m24757o().m24907u();
                    return;
                }
                this.f26925C = 0;
            }
            if (m24759b()) {
                m24762e().mo4728b();
                m24758a();
                Object obj = (((m24765h().m24494a("select count(1) > 0 from raw_events") > 0 ? 1 : (m24765h().m24494a("select count(1) > 0 from raw_events") == 0 ? 0 : -1)) != 0 ? 1 : null) == null && TextUtils.isEmpty(m24765h().m24498u())) ? null : 1;
                if (obj != null) {
                    Object obj2;
                    CharSequence aa;
                    long a;
                    long a2;
                    long max;
                    BroadcastReceiver n;
                    long Q;
                    hy o;
                    JobScheduler jobScheduler;
                    Builder builder;
                    PersistableBundle persistableBundle;
                    JobInfo build;
                    long a3 = this.f26939n.mo4629a();
                    long X = gj.m24456X();
                    if ((m24765h().m24494a("select count(1) > 0 from raw_events where realtime = 1") != 0 ? 1 : null) == null) {
                        if ((m24765h().m24494a("select count(1) > 0 from queue where has_realtime = 1") != 0 ? 1 : null) == null) {
                            obj2 = null;
                            if (obj2 == null) {
                                aa = this.f26928c.aa();
                                abs = (TextUtils.isEmpty(aa) || ".none.".equals(aa)) ? gj.m24451S() : gj.m24452T();
                            } else {
                                abs = gj.m24450R();
                            }
                            a = m24760c().f26866d.m24685a();
                            a2 = m24760c().f26867e.m24685a();
                            max = Math.max(m24765h().m24495b("select max(bundle_end_timestamp) from queue"), m24765h().m24495b("select max(timestamp) from raw_events"));
                            if (max != 0) {
                                abs = 0;
                            } else {
                                max = a3 - Math.abs(max - a3);
                                a2 = a3 - Math.abs(a2 - a3);
                                a = Math.max(a3 - Math.abs(a - a3), a2);
                                a3 = max + X;
                                if (obj2 != null && a > 0) {
                                    a3 = Math.min(max, a) + abs;
                                }
                                if (!m24764g().m24931a(a, abs)) {
                                    a3 = a + abs;
                                }
                                if (a2 != 0 || a2 < max) {
                                    abs = a3;
                                } else {
                                    for (int i = 0; i < gj.m24458Z(); i++) {
                                        a3 += ((long) (1 << i)) * gj.m24457Y();
                                        if (a3 > a2) {
                                            abs = a3;
                                            break;
                                        }
                                    }
                                    abs = 0;
                                }
                            }
                            if (abs == 0) {
                                m24761d().f26851j.m24652a("Next upload time is 0");
                                m24756n().m24677a();
                                m24757o().m24907u();
                                return;
                            } else if (m24766i().m24675t()) {
                                m24761d().f26851j.m24652a("No network");
                                n = m24756n();
                                n.f26859a.m24758a();
                                n.f26859a.m24762e().mo4728b();
                                if (!n.f26860b) {
                                    n.f26859a.f26927b.registerReceiver(n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                                    n.f26861c = n.f26859a.m24766i().m24675t();
                                    n.f26859a.m24761d().f26851j.m24653a("Registering connectivity change receiver. Network connected", Boolean.valueOf(n.f26861c));
                                    n.f26860b = true;
                                }
                                m24757o().m24907u();
                                return;
                            } else {
                                a3 = m24760c().f26868f.m24685a();
                                Q = gj.m24449Q();
                                if (!m24764g().m24931a(a3, Q)) {
                                    abs = Math.max(abs, a3 + Q);
                                }
                                m24756n().m24677a();
                                abs -= this.f26939n.mo4629a();
                                if (abs <= 0) {
                                    abs = gj.m24453U();
                                    m24760c().f26866d.m24686a(this.f26939n.mo4629a());
                                }
                                Q = abs;
                                m24761d().f26851j.m24653a("Upload scheduled in approximately ms", Long.valueOf(Q));
                                o = m24757o();
                                o.m24432x();
                                gj.m24442H();
                                if (!ho.m24690a(o.mo4736j())) {
                                    o.mo4742p().f26850i.m24652a("Receiver not registered/enabled");
                                }
                                gj.m24442H();
                                if (!ja.m24856a(o.mo4736j())) {
                                    o.mo4742p().f26850i.m24652a("Service not registered/enabled");
                                }
                                o.m24907u();
                                a3 = o.mo4735i().mo4630b() + Q;
                                if (Q < gj.m24454V() && !o.f27056b.m24503b()) {
                                    o.mo4742p().f26851j.m24652a("Scheduling upload with DelayedRunnable");
                                    o.f27056b.m24502a(Q);
                                }
                                gj.m24442H();
                                if (VERSION.SDK_INT < 24) {
                                    o.mo4742p().f26851j.m24652a("Scheduling upload with JobScheduler");
                                    jobScheduler = (JobScheduler) o.mo4736j().getSystemService("jobscheduler");
                                    builder = new Builder(o.m24906t(), new ComponentName(o.mo4736j(), "com.google.android.gms.measurement.AppMeasurementJobService"));
                                    builder.setMinimumLatency(Q);
                                    builder.setOverrideDeadline(Q << 1);
                                    persistableBundle = new PersistableBundle();
                                    persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                                    builder.setExtras(persistableBundle);
                                    build = builder.build();
                                    o.mo4742p().f26851j.m24653a("Scheduling job. JobID", Integer.valueOf(o.m24906t()));
                                    jobScheduler.schedule(build);
                                    return;
                                }
                                o.mo4742p().f26851j.m24652a("Scheduling upload with AlarmManager");
                                o.f27055a.setInexactRepeating(2, a3, Math.max(gj.m24455W(), Q), o.m24908v());
                                return;
                            }
                        }
                    }
                    obj2 = 1;
                    if (obj2 == null) {
                        abs = gj.m24450R();
                    } else {
                        aa = this.f26928c.aa();
                        if (!TextUtils.isEmpty(aa)) {
                        }
                    }
                    a = m24760c().f26866d.m24685a();
                    a2 = m24760c().f26867e.m24685a();
                    max = Math.max(m24765h().m24495b("select max(bundle_end_timestamp) from queue"), m24765h().m24495b("select max(timestamp) from raw_events"));
                    if (max != 0) {
                        max = a3 - Math.abs(max - a3);
                        a2 = a3 - Math.abs(a2 - a3);
                        a = Math.max(a3 - Math.abs(a - a3), a2);
                        a3 = max + X;
                        a3 = Math.min(max, a) + abs;
                        if (m24764g().m24931a(a, abs)) {
                            a3 = a + abs;
                        }
                        if (a2 != 0) {
                        }
                        abs = a3;
                    } else {
                        abs = 0;
                    }
                    if (abs == 0) {
                        m24761d().f26851j.m24652a("Next upload time is 0");
                        m24756n().m24677a();
                        m24757o().m24907u();
                        return;
                    } else if (m24766i().m24675t()) {
                        a3 = m24760c().f26868f.m24685a();
                        Q = gj.m24449Q();
                        if (m24764g().m24931a(a3, Q)) {
                            abs = Math.max(abs, a3 + Q);
                        }
                        m24756n().m24677a();
                        abs -= this.f26939n.mo4629a();
                        if (abs <= 0) {
                            abs = gj.m24453U();
                            m24760c().f26866d.m24686a(this.f26939n.mo4629a());
                        }
                        Q = abs;
                        m24761d().f26851j.m24653a("Upload scheduled in approximately ms", Long.valueOf(Q));
                        o = m24757o();
                        o.m24432x();
                        gj.m24442H();
                        if (ho.m24690a(o.mo4736j())) {
                            o.mo4742p().f26850i.m24652a("Receiver not registered/enabled");
                        }
                        gj.m24442H();
                        if (ja.m24856a(o.mo4736j())) {
                            o.mo4742p().f26850i.m24652a("Service not registered/enabled");
                        }
                        o.m24907u();
                        a3 = o.mo4735i().mo4630b() + Q;
                        o.mo4742p().f26851j.m24652a("Scheduling upload with DelayedRunnable");
                        o.f27056b.m24502a(Q);
                        gj.m24442H();
                        if (VERSION.SDK_INT < 24) {
                            o.mo4742p().f26851j.m24652a("Scheduling upload with AlarmManager");
                            o.f27055a.setInexactRepeating(2, a3, Math.max(gj.m24455W(), Q), o.m24908v());
                            return;
                        }
                        o.mo4742p().f26851j.m24652a("Scheduling upload with JobScheduler");
                        jobScheduler = (JobScheduler) o.mo4736j().getSystemService("jobscheduler");
                        builder = new Builder(o.m24906t(), new ComponentName(o.mo4736j(), "com.google.android.gms.measurement.AppMeasurementJobService"));
                        builder.setMinimumLatency(Q);
                        builder.setOverrideDeadline(Q << 1);
                        persistableBundle = new PersistableBundle();
                        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
                        builder.setExtras(persistableBundle);
                        build = builder.build();
                        o.mo4742p().f26851j.m24653a("Scheduling job. JobID", Integer.valueOf(o.m24906t()));
                        jobScheduler.schedule(build);
                        return;
                    } else {
                        m24761d().f26851j.m24652a("No network");
                        n = m24756n();
                        n.f26859a.m24758a();
                        n.f26859a.m24762e().mo4728b();
                        if (n.f26860b) {
                            n.f26859a.f26927b.registerReceiver(n, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            n.f26861c = n.f26859a.m24766i().m24675t();
                            n.f26859a.m24761d().f26851j.m24653a("Registering connectivity change receiver. Network connected", Boolean.valueOf(n.f26861c));
                            n.f26860b = true;
                        }
                        m24757o().m24907u();
                        return;
                    }
                }
            }
            m24761d().f26851j.m24652a("Nothing to upload or uploading impossible");
            m24756n().m24677a();
            m24757o().m24907u();
        }
    }
}
