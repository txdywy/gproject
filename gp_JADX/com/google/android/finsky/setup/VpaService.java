package com.google.android.finsky.setup;

import android.app.NotificationManager;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.app.cg;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0957n;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.billing.p120d.C1805b;
import com.google.android.finsky.billing.p120d.C1807a;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.dw.C2909c;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.a.a.a.a.ck;
import com.google.wireless.android.finsky.dfe.nano.ee;
import com.google.wireless.android.finsky.dfe.nano.ef;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class VpaService extends Service {
    public static VpaService f20696a = null;
    public static int f20697b = 0;
    public static boolean f20698c;
    public final dp f20699A = new df(this);
    public final dp f20700B = new dg(this);
    public final dp f20701C = new dh(this);
    public IBinder f20702D;
    public C4175h f20703d;
    public C1805b f20704e;
    public C2320a f20705f;
    public C0988c f20706g;
    public C1287h f20707h;
    public C3646a f20708i;
    public Context f20709j;
    public C2162a f20710k;
    public C4817d f20711l;
    public bs f20712m;
    public C2909c f20713n;
    public C1463g f20714o;
    public al f20715p;
    public bn f20716q;
    public Handler f20717r = new Handler(Looper.getMainLooper());
    public int f20718s;
    public int f20719t = 0;
    public boolean f20720u;
    public bx f20721v;
    public final List f20722w = new ArrayList();
    public C4181n f20723x;
    public C1807a f20724y;
    public final dp f20725z = new dc(this);

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

    public final boolean m19154a(dp dpVar, String str) {
        return m19153a(dpVar, this.f20707h.mo2016a(str));
    }

    final void m19151a(String str, ee[] eeVarArr, ef[] efVarArr) {
        for (dp dkVar : this.f20722w) {
            this.f20717r.post(new dk(dkVar, str, eeVarArr, efVarArr));
        }
        this.f20722w.clear();
    }

    final void m19152a(boolean z) {
        int i;
        PackageManager packageManager = getApplicationContext().getPackageManager();
        ComponentName componentName = new ComponentName(this.f20709j, this.f20716q.mo3943a());
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        packageManager.setComponentEnabledSetting(componentName, i, 1);
    }

    final void m19148a() {
        f20698c = false;
        m19147e();
        m19152a(false);
    }

    public static boolean m19141a(Context context, C3646a c3646a) {
        if (((Boolean) C0955b.hz.m28964b()).booleanValue()) {
            return true;
        }
        if (!C0954a.bf.m5764b()) {
            C2320a c2320a = c3646a.f18023c;
            if (c2320a == null) {
                return false;
            }
            C2322b a = c2320a.mo2854a(context.getPackageName());
            if (a == null) {
                return false;
            }
            boolean z;
            C0957n c0957n = C0954a.bf;
            if (((Integer) C0954a.f5832b.m5760a()).intValue() != -1 || a.f11423h) {
                z = false;
            } else {
                z = true;
            }
            c0957n.m5763a(Boolean.valueOf(z));
        }
        return ((Boolean) C0954a.bf.m5760a()).booleanValue();
    }

    public static void m19139a(Context context, C2162a c2162a) {
        m19140a("installrequired", context, c2162a);
    }

    public static void m19144b(Context context, C2162a c2162a) {
        m19140a("installdefault", context, c2162a);
    }

    public static void m19140a(String str, Context context, C2162a c2162a) {
        f20697b++;
        context.startService(c2162a.mo2708b(context, VpaService.class, "playsetupservice", str));
    }

    public IBinder onBind(Intent intent) {
        return this.f20702D;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        FinskyLog.m21659a("VpaService is called for %s", intent.getDataString());
        this.f20718s = i2;
        this.f20719t++;
        if (f20697b > 0) {
            f20697b--;
        }
        this.f20708i.m17248a(new dl(this, intent));
        return 3;
    }

    public void onCreate() {
        f20696a = this;
        ((by) C3947d.m18649a(by.class)).mo1909a(this);
        this.f20702D = new dq(this);
        this.f20723x = new C4181n(this.f20709j, this.f20711l, this.f20705f);
        this.f20724y = this.f20704e.mo2455a();
    }

    public void onDestroy() {
        m19149a(1);
        f20696a = null;
    }

    final boolean m19153a(dp dpVar, C1254c c1254c) {
        String cZ = c1254c == null ? this.f20706g.cZ() : c1254c.mo1636c();
        this.f20712m.mo3949a(cZ, 2);
        this.f20722w.add(dpVar);
        if (this.f20713n.f15463a.mo3193b()) {
            FinskyLog.m21665c("Not installing VPA for restricted user", new Object[0]);
            m19148a();
            m19151a(cZ, null, null);
            return false;
        } else if (this.f20720u) {
            FinskyLog.m21665c("Received command to load VPA while already handling", new Object[0]);
            return false;
        } else {
            this.f20720u = true;
            boolean z = !((Boolean) C0955b.hx.m28964b()).booleanValue() && VERSION.SDK_INT >= ((Integer) C0955b.hy.m28964b()).intValue();
            if (z) {
                Resources resources = getResources();
                cg a = new cg(this).m1422a(resources.getString(C7582R.string.b_and_r_button_setup)).m1425b(resources.getString(C7582R.string.app_name)).m1415a((int) C7582R.drawable.ic_play_store);
                a.f1484B = resources.getColor(C7582R.color.restore_notification);
                a.f1519w = true;
                a.m1424a(2, true);
                startForeground(42864, a.m1416a(0, 0).m1423a(false).m1414a());
            }
            C4181n c4181n = this.f20723x;
            c4181n.f21103b.mo4403a(new C4182o(c4181n)).mo4398a(new dm(this, cZ, c1254c));
            return true;
        }
    }

    public final void m19150a(String str, List list) {
        m19147e();
        if (list != null && !list.isEmpty()) {
            this.f20715p.mo3926a(getApplicationContext(), str, (ee[]) list.toArray(new ee[list.size()]));
            if (TextUtils.isEmpty(str)) {
                C0954a.bc.m5763a(Boolean.valueOf(true));
                C0954a.bd.m5765c();
            }
            this.f20714o.mo2242f(str).m13319a(new C2474c(130).m13239a(true).m13226a(new ck().a(m19143b())).f13342a, null);
        }
    }

    static String m19143b() {
        return C2693e.m14552a().mo3115c().f31751y;
    }

    private final void m19147e() {
        ((NotificationManager) getSystemService("notification")).cancel(-555892737);
        C0954a.be.m5763a(Boolean.valueOf(true));
    }

    public static boolean m19145c() {
        return (f20696a != null && f20696a.f20720u) || f20697b > 0;
    }

    public static boolean m19142a(bx bxVar) {
        if (bxVar == null) {
            if (f20696a == null) {
                return true;
            }
            f20696a.f20721v = null;
            return true;
        } else if (f20696a == null || !f20696a.f20720u) {
            return false;
        } else {
            VpaService vpaService = f20696a;
            vpaService.f20721v = bxVar;
            new Handler(vpaService.getMainLooper()).post(new de(vpaService));
            return true;
        }
    }

    final void m19149a(int i) {
        if (this.f20721v != null) {
            this.f20721v.mo3913a(i, null);
            if (i == 1) {
                this.f20721v = null;
            }
        }
    }

    public static boolean m19146d() {
        return !((Boolean) C0954a.bg.m5760a()).booleanValue();
    }
}
