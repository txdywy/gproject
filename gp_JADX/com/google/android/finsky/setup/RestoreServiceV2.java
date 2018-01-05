package com.google.android.finsky.setup;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.setup.p242d.C4137g;
import com.google.android.finsky.setup.p242d.C4138b;
import com.google.android.finsky.setup.p242d.C4142a;
import com.google.android.finsky.setup.p242d.C4159f;
import com.google.android.finsky.setup.p242d.C4168h;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4687q;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.p188a.C4136c;
import com.google.android.play.utils.p354b.C6321a;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.atomic.AtomicBoolean;

public class RestoreServiceV2 extends Service {
    public static RestoreServiceV2 f20586a;
    public static final C4136c f20587b = new be();
    public static final C4136c f20588c = new bf();
    public C3300k f20589A;
    public C2171b f20590B;
    public al f20591C;
    public final AtomicBoolean f20592d = new AtomicBoolean();
    public final AtomicBoolean f20593e = new AtomicBoolean();
    public final BroadcastReceiver f20594f = new bg(this);
    public final C4137g f20595g = new bi(this);
    public final C4138b f20596h = new bj(this);
    public int f20597i;
    public int f20598j = 0;
    public boolean f20599k;
    public boolean f20600l;
    public bl f20601m;
    public C4687q f20602n;
    public Boolean f20603o = null;
    public bz f20604p;
    public C4142a f20605q;
    public C4159f f20606r;
    public Handler f20607s;
    public Context f20608t;
    public C0988c f20609u;
    public C4168h f20610v;
    public C2206c f20611w;
    public C3646a f20612x;
    public C3340g f20613y;
    public bs f20614z;

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

    public static boolean m19101a() {
        return f20586a != null && f20586a.f20601m.m19286c();
    }

    public static boolean m19102a(bx bxVar) {
        if (bxVar == null) {
            if (f20586a == null) {
                return true;
            }
            f20586a.f20601m.f20873b = null;
            return true;
        } else if (f20586a == null || !f20586a.f20601m.m19286c()) {
            return false;
        } else {
            bl blVar = f20586a.f20601m;
            blVar.f20873b = bxVar;
            blVar.f20874c.f20607s.post(new bm(blVar));
            return true;
        }
    }

    public void onCreate() {
        bz ccVar;
        f20586a = this;
        ((by) C3947d.m18649a(by.class)).mo1908a(this);
        this.f20607s = new Handler(getMainLooper());
        ca caVar = new ca();
        C2171b c2171b = this.f20590B;
        al alVar = this.f20591C;
        if (C1503a.m8831b(this)) {
            ccVar = new cc();
        } else {
            ccVar = new cb(this, c2171b, alVar);
        }
        this.f20604p = ccVar;
        this.f20605q = this.f20610v.mo3989a(this.f20596h);
        this.f20601m = new bl(this);
        this.f20606r = this.f20610v.mo3991a();
        this.f20606r.mo3977a(this.f20595g);
        this.f20606r.mo3977a(this.f20601m);
        registerReceiver(this.f20594f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        try {
            this.f20602n = new C4687q(new File(this.f20608t.getCacheDir(), "restore.log"));
            FinskyLog.m21661b(this.f20602n);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Cannot initialize internal log", new Object[0]);
        }
    }

    public void onDestroy() {
        if (this.f20600l) {
            this.f20613y.mo3484b(this.f20606r);
            this.f20600l = false;
        }
        unregisterReceiver(this.f20594f);
        this.f20607s.removeCallbacksAndMessages(null);
        this.f20606r.mo3983b(this.f20601m);
        this.f20606r.mo3983b(this.f20595g);
        this.f20601m.m19282a(1, null);
        this.f20601m = null;
        this.f20606r = null;
        this.f20605q = null;
        this.f20604p = null;
        this.f20607s = null;
        m19108f();
        f20586a = null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f20597i = i2;
        this.f20598j++;
        Runnable bkVar = new bk(this, intent);
        this.f20605q.mo3965a(bkVar);
        this.f20606r.mo3978a(bkVar);
        this.f20611w.mo2815a(bkVar);
        this.f20612x.m17248a(bkVar);
        return 3;
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    protected void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (C6321a.m28962a() && ((Boolean) C0955b.gE.m28964b()).booleanValue()) {
            this.f20602n.m21834a(printWriter);
        } else {
            super.dump(fileDescriptor, printWriter, strArr);
        }
    }

    final boolean m19104b() {
        boolean z = false;
        try {
            if (this.f20599k) {
                FinskyLog.m21665c("Redelivery of startup intent - dropping it", new Object[0]);
            } else {
                this.f20599k = true;
                this.f20603o = Boolean.valueOf(this.f20605q.mo3968a());
                this.f20603o = Boolean.valueOf(this.f20603o.booleanValue() | this.f20606r.mo3982b());
                if (this.f20603o.booleanValue()) {
                    m19107e();
                    this.f20614z.mo3948a("startup");
                }
                z = this.f20603o.booleanValue();
            }
        } catch (Exception e) {
            FinskyLog.m21665c("Exception restarting: %s", e);
            bp.m19291a(this);
        }
        return z;
    }

    final boolean m19103a(Intent intent) {
        boolean z = false;
        this.f20614z.mo3948a("restore_accounts");
        try {
            String a = this.f20591C.mo3921a(intent);
            Object stringExtra = intent.getStringExtra("authAccount");
            if (TextUtils.isEmpty(stringExtra)) {
                this.f20605q.mo3966a(a);
                return true;
            }
            this.f20605q.mo3967a(stringExtra, a);
            return true;
        } catch (Throwable e) {
            this.f20614z.mo3945a(1);
            FinskyLog.m21660a(e, "Could not read Android ID", new Object[z]);
            return z;
        }
    }

    final boolean m19105c() {
        return this.f20606r.mo3976a(f20587b).isEmpty();
    }

    final boolean m19106d() {
        return !this.f20605q.mo3969b() && this.f20606r.mo3976a(f20588c).isEmpty();
    }

    final void m19107e() {
        int intValue = ((Integer) C0954a.bh.m5760a()).intValue();
        int intValue2 = ((Integer) C0954a.bi.m5760a()).intValue();
        int i = intValue + intValue2;
        int i2 = i;
        for (PackageSetupStatus packageSetupStatus : this.f20606r.mo3984c()) {
            if (packageSetupStatus == null || !packageSetupStatus.f20546a.f20895i) {
                i = i2;
            } else {
                i = i2 + 1;
            }
            i2 = i;
        }
        if (this.f20606r.mo3985d()) {
            this.f20604p.mo3964a(i2, this.f20606r.mo3987f());
        } else {
            this.f20604p.mo3963a(intValue, intValue2, i2);
        }
    }

    final void m19108f() {
        FinskyLog.m21658a(this.f20602n);
        C4679j.m21814a(this.f20602n);
    }
}
