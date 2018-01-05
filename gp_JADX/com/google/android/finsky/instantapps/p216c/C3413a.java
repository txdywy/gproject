package com.google.android.finsky.instantapps.p216c;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.google.android.finsky.instantapps.AppManagementService;
import com.google.android.finsky.instantapps.EphemeralInstallerActivity;
import com.google.android.finsky.instantapps.InstantAppHygieneService;
import com.google.android.finsky.instantapps.InstantAppsConfigChangeListener;
import com.google.android.finsky.instantapps.InstantAppsLoggingService;
import com.google.android.finsky.instantapps.PackageReplacedReceiver;
import com.google.android.finsky.instantapps.PhenotypeUpdateService;
import com.google.android.finsky.instantapps.SettingsActivity;
import com.google.android.finsky.instantapps.appmanagement.C3383c;
import com.google.android.finsky.instantapps.appmanagement.C3387f;
import com.google.android.finsky.instantapps.appmanagement.C3390i;
import com.google.android.finsky.instantapps.appmanagement.C3393l;
import com.google.android.finsky.instantapps.appmanagement.C3394m;
import com.google.android.finsky.instantapps.appmanagement.C3395n;
import com.google.android.finsky.instantapps.appmanagement.C3396o;
import com.google.android.finsky.instantapps.appmanagement.C3398q;
import com.google.android.finsky.instantapps.appmanagement.C3401u;
import com.google.android.finsky.instantapps.appmanagement.C3402v;
import com.google.android.finsky.instantapps.appmanagement.C3403w;
import com.google.android.finsky.instantapps.appmanagement.C3404x;
import com.google.android.finsky.instantapps.appmanagement.InstantAppRemoveMonitor;
import com.google.android.finsky.instantapps.install.C3502b;
import com.google.android.finsky.instantapps.install.C3505g;
import com.google.android.finsky.instantapps.install.C3511m;
import com.google.android.finsky.instantapps.install.C3512n;
import com.google.android.finsky.instantapps.install.C3516r;
import com.google.android.finsky.instantapps.install.C3521x;
import com.google.android.finsky.instantapps.metrics.AppUpgradeToInstalledService;
import com.google.android.finsky.instantapps.metrics.C3529b;
import com.google.android.finsky.instantapps.metrics.C3532e;
import com.google.android.finsky.instantapps.metrics.C3537j;
import com.google.android.finsky.instantapps.metrics.C3538k;
import com.google.android.finsky.instantapps.metrics.C3539l;
import com.google.android.finsky.instantapps.metrics.C3540m;
import com.google.android.finsky.instantapps.metrics.LogFlushJob;
import com.google.android.finsky.instantapps.p212d.C3424b;
import com.google.android.finsky.instantapps.p212d.C3433j;
import com.google.android.finsky.instantapps.p212d.C3434k;
import com.google.android.finsky.instantapps.p212d.C3435l;
import com.google.android.finsky.instantapps.p212d.ab;
import com.google.android.finsky.instantapps.p213a.C3377b;
import com.google.android.finsky.instantapps.p214b.C3407d;
import com.google.android.finsky.instantapps.p218e.C3452a;
import com.google.android.finsky.instantapps.p218e.C3453i;
import com.google.android.finsky.instantapps.p218e.C3459g;
import com.google.android.finsky.instantapps.p218e.C3461l;
import com.google.android.finsky.instantapps.p218e.C3463n;
import com.google.android.finsky.instantapps.p218e.C3465p;
import com.google.android.finsky.instantapps.p218e.C3466q;
import com.google.android.finsky.instantapps.p218e.C3467r;
import com.google.android.finsky.instantapps.p218e.C3468s;
import com.google.android.finsky.instantapps.p218e.C3470u;
import com.google.android.finsky.instantapps.statussync.C3548b;
import com.google.android.finsky.instantapps.statussync.C3552f;
import com.google.android.finsky.instantapps.statussync.C3554h;
import com.google.android.finsky.instantapps.statussync.C3555i;
import com.google.android.finsky.instantapps.statussync.C3556j;
import com.google.android.finsky.instantapps.statussync.StatusSyncService;
import com.google.android.finsky.instantappsbackendclient.impl.C3574a;
import com.google.android.finsky.instantappsbackendclient.impl.C3575b;
import com.google.android.finsky.instantappsbackendclient.impl.C3578e;
import com.google.android.finsky.instantappsbackendclient.impl.C3580g;
import com.google.android.finsky.instantappsbackendclient.impl.C3582i;
import com.google.android.finsky.instantappsbackendclient.impl.C3583j;
import com.google.android.finsky.instantappsbackendclient.impl.C3584k;
import com.google.android.finsky.instantappsbackendclient.impl.C3585l;
import com.google.android.finsky.instantappsbackendclient.impl.C3586m;
import com.google.android.finsky.instantappsbackendclient.impl.C3587n;
import com.google.android.finsky.instantappsbackendclient.impl.C3588o;
import com.google.android.finsky.instantappsbackendclient.impl.C3589p;
import com.google.android.finsky.instantappsbackendclient.impl.C3590q;
import com.google.android.finsky.instantappsbackendclient.impl.C3591r;
import com.google.android.finsky.instantappsbackendclient.impl.C3594v;
import com.google.android.finsky.instantappsbackendclient.impl.C3597y;
import com.google.android.finsky.instantappsbackendclient.impl.UpdateContentFilterJob;
import com.google.android.finsky.instantappsbackendclient.impl.aa;
import com.google.android.finsky.instantappsbackendclient.impl.p224a.C3573c;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.instantappscompatibility.C3601c;
import com.google.android.instantapps.common.C3423l;
import com.google.android.instantapps.common.C5765e;
import com.google.android.instantapps.common.C5770f;
import com.google.android.instantapps.common.C5774g;
import com.google.android.instantapps.common.C5801h;
import com.google.android.instantapps.common.gms.C5776b;
import com.google.android.instantapps.common.gms.C5777c;
import com.google.android.instantapps.common.gms.C5778d;
import com.google.android.instantapps.common.gms.C5779e;
import com.google.android.instantapps.common.gms.C5780f;
import com.google.android.instantapps.common.gms.C5781g;
import com.google.android.instantapps.common.gms.C5782h;
import com.google.android.instantapps.common.gms.C5783i;
import com.google.android.instantapps.common.gms.C5784j;
import com.google.android.instantapps.common.gms.C5785k;
import com.google.android.instantapps.common.loading.C5815l;
import com.google.android.instantapps.common.loading.ui.C5821g;
import com.google.android.instantapps.common.loading.ui.C5822h;
import com.google.android.instantapps.common.loading.ui.C5839y;
import com.google.android.instantapps.common.loading.ui.PreviewImageView;
import com.google.android.instantapps.common.p217e.C5746h;
import com.google.android.instantapps.common.p217e.C5747i;
import com.google.android.instantapps.common.p217e.C5749k;
import com.google.android.instantapps.common.p217e.C5751m;
import com.google.android.instantapps.common.p217e.C5752n;
import com.google.android.instantapps.common.p217e.C5753o;
import com.google.android.instantapps.common.p217e.C5754p;
import com.google.android.instantapps.common.p217e.C5755q;
import com.google.android.instantapps.common.p217e.C5756r;
import com.google.android.instantapps.common.p217e.C5757s;
import com.google.android.instantapps.common.p217e.C5758t;
import com.google.android.instantapps.common.p217e.C5759u;
import com.google.android.instantapps.common.p217e.C5760v;
import com.google.android.instantapps.common.p217e.C5761w;
import com.google.android.instantapps.common.p217e.C5762x;
import com.google.android.instantapps.common.p217e.C5763y;
import com.google.android.instantapps.common.p217e.C5764z;
import com.google.android.instantapps.common.p217e.ac;
import com.google.android.instantapps.common.p217e.ad;
import com.google.android.instantapps.common.p217e.ae;
import com.google.android.instantapps.common.p217e.af;
import com.google.android.instantapps.common.p217e.ag;
import com.google.android.instantapps.common.p217e.ai;
import com.google.android.instantapps.common.p217e.an;
import com.google.android.instantapps.common.p217e.ao;
import com.google.android.instantapps.common.p217e.ap;
import com.google.android.instantapps.common.p217e.aq;
import com.google.android.instantapps.common.p217e.ar;
import com.google.android.instantapps.common.p217e.as;
import com.google.android.instantapps.common.p217e.at;
import com.google.android.instantapps.common.p217e.au;
import com.google.android.instantapps.common.p217e.av;
import com.google.android.instantapps.common.p217e.aw;
import com.google.android.instantapps.common.p217e.ax;
import com.google.android.instantapps.common.p217e.ay;
import com.google.android.instantapps.common.p217e.az;
import com.google.android.instantapps.common.p217e.ba;
import com.google.android.instantapps.common.p217e.bb;
import com.google.android.instantapps.common.p217e.bc;
import com.google.android.instantapps.common.p217e.be;
import com.google.android.instantapps.common.p217e.bf;
import com.google.android.instantapps.common.p217e.bj;
import com.google.android.instantapps.common.p217e.bk;
import com.google.android.instantapps.common.p217e.bp;
import com.google.android.instantapps.common.p217e.bu;
import com.google.android.instantapps.common.p221d.p222a.C5710a;
import com.google.android.instantapps.common.p221d.p222a.C5717g;
import com.google.android.instantapps.common.p221d.p222a.C5718h;
import com.google.android.instantapps.common.p221d.p222a.C5719i;
import com.google.android.instantapps.common.p221d.p222a.C5720j;
import com.google.android.instantapps.common.p221d.p222a.C5723m;
import com.google.android.instantapps.common.p221d.p222a.C5726p;
import com.google.android.instantapps.common.p221d.p222a.C5732w;
import com.google.android.instantapps.common.p221d.p222a.C5734y;
import com.google.android.instantapps.common.p221d.p222a.C5735z;
import com.google.android.instantapps.common.p221d.p222a.ah;
import com.google.android.instantapps.common.p221d.p222a.aj;
import com.google.android.instantapps.common.p221d.p222a.ak;
import com.google.android.instantapps.common.p221d.p222a.al;
import com.google.android.instantapps.common.p221d.p222a.am;
import com.google.android.instantapps.common.p221d.p317b.C5736a;
import com.google.android.instantapps.common.p221d.p317b.C5737b;
import com.google.android.instantapps.common.p316c.C5705a;
import com.google.android.instantapps.common.p316c.C5707c;
import com.google.android.instantapps.common.p318g.C5771a;
import com.google.android.instantapps.common.p318g.C5773c;
import com.google.android.instantapps.supervisor.reflect.C5842a;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000c.p001a.C0000a;
import p002a.p003a.C0001a;
import p002a.p003a.C0003b;
import p002a.p003a.C0005d;

public final class C3413a implements C3412d {
    public C0000a f17431A;
    public C0000a f17432B;
    public C0000a f17433C;
    public C0000a f17434D;
    public C0000a f17435E;
    public C0000a f17436F;
    public C0000a f17437G;
    public C0000a f17438H;
    public C0000a f17439I;
    public C0000a f17440J;
    public C0000a f17441K = new C0001a();
    public C0000a f17442L;
    public C0000a f17443M;
    public C0000a f17444N;
    public C0000a f17445O;
    public C0000a f17446P;
    public C0000a f17447Q;
    public C0000a f17448R;
    public C0000a f17449S;
    public C0000a f17450T;
    public C0000a f17451U;
    public C0000a f17452V;
    public C0000a f17453W;
    public C0000a f17454X;
    public C0000a f17455Y;
    public C0000a f17456Z;
    public C0000a f17457a;
    public C0000a aA;
    public C0000a aB;
    public C0000a aC;
    public C0000a aD;
    public C0000a aE;
    public C0000a aF;
    public C0000a aG;
    public C0000a aH;
    public C0000a aI;
    public C0000a aJ;
    public C0000a aK;
    public C0000a aL;
    public C0000a aM;
    public C0000a aN;
    public C0000a aO;
    public C0000a aP;
    public C0000a aQ;
    public C0000a aR;
    public C0000a aS;
    public C0000a aT;
    public C0000a aU;
    public C0000a aV;
    public C0000a aW;
    public C0000a aX;
    public C0000a aY;
    public C0000a aZ;
    public C0000a aa;
    public C0000a ab;
    public C0000a ac;
    public C0000a ad;
    public C0000a ae;
    public C0000a af;
    public C0000a ag;
    public C0000a ah;
    public C0000a ai;
    public C0000a aj;
    public C0000a ak;
    public C0000a al;
    public C0000a am;
    public C0000a an;
    public C0000a ao;
    public C0000a ap;
    public C0000a aq;
    public C0000a ar;
    public C0000a as;
    public C0000a at;
    public C0000a au;
    public C0000a av;
    public C0000a aw;
    public C0000a ax;
    public C0000a ay;
    public C0000a az;
    public C0000a f17458b = C0003b.m3a(new C3419i(this.f17457a));
    public C0000a bA;
    public C0000a bB;
    public C0000a bC;
    public C0000a bD;
    public C0000a bE;
    public C0000a bF;
    public C0000a ba;
    public C0000a bb;
    public C0000a bc;
    public C0000a bd;
    public C0000a be;
    public C0000a bf;
    public C0000a bg;
    public C0000a bh;
    public C0000a bi;
    public C0000a bj;
    public C0000a bk;
    public C0000a bl;
    public C0000a bm;
    public C0000a bn;
    public C0000a bo;
    public C0000a bp;
    public C0000a bq;
    public C0000a br;
    public C0000a bs;
    public C0000a bt;
    public C0000a bu;
    public C0000a bv;
    public C0000a bw;
    public C0000a bx;
    public C0000a by;
    public C0000a bz;
    public C0000a f17459c = new C3578e(this.f17458b);
    public C0000a f17460d = C0003b.m3a(new C3575b(this.f17458b, this.f17459c));
    public C0000a f17461e = C0003b.m3a(new C5777c());
    public C0000a f17462f = C0003b.m3a(new C3580g(this.f17461e));
    public C0000a f17463g = C0005d.m8a(C5770f.f29177a);
    public C0000a f17464h = C0003b.m3a(new C3538k());
    public C0000a f17465i = C0003b.m3a(new ao(this.f17464h));
    public C0000a f17466j = C0003b.m3a(new ae(this.f17465i));
    public C0000a f17467k = C0005d.m8a(new C5719i(this.f17458b, this.f17466j, this.f17463g));
    public C0000a f17468l = C0003b.m3a(new ag(this.f17465i));
    public C0000a f17469m = C0005d.m8a(new C5726p(this.f17458b));
    public C0000a f17470n = C0005d.m8a(new C3539l());
    public C0000a f17471o = C0003b.m3a(new ai(this.f17465i));
    public C0000a f17472p = C0003b.m3a(new ay(this.f17465i));
    public C0000a f17473q = C0005d.m8a(new ak());
    public C0000a f17474r = C0003b.m3a(new C5773c());
    public C0000a f17475s = C0003b.m3a(new C5784j(this.f17461e));
    public C0000a f17476t = C0003b.m3a(new C5723m(this.f17475s, this.f17458b));
    public C0000a f17477u;
    public C0000a f17478v;
    public C0000a f17479w;
    public C0000a f17480x;
    public C0000a f17481y;
    public C0000a f17482z;

    public C3413a(C3414b c3414b) {
        this.f17457a = new C5776b(c3414b.f17483a);
        this.f17477u = C0003b.m3a(new C5782h(c3414b.f17483a, this.f17457a));
        this.f17478v = C0005d.m8a(new C5801h(this.f17477u));
        this.f17479w = new ah(this.f17478v);
        this.f17480x = C0003b.m3a(new com.google.android.instantapps.common.p217e.ah(this.f17465i));
        this.f17481y = C0003b.m3a(new az(this.f17465i));
        this.f17482z = C0003b.m3a(new ap(this.f17465i));
        this.f17431A = C0003b.m3a(new com.google.android.instantapps.common.p221d.p222a.ai(this.f17458b));
        this.f17432B = C0003b.m3a(new al(this.f17458b));
        this.f17433C = C0003b.m3a(new aj(this.f17458b));
        this.f17434D = C0003b.m3a(new ac(this.f17465i));
        this.f17435E = C0003b.m3a(new ar(this.f17465i));
        this.f17436F = C0003b.m3a(new C3529b(this.f17457a, this.f17434D, this.f17435E));
        this.f17437G = C0003b.m3a(new C3540m(this.f17436F));
        this.f17438H = new C5717g(this.f17458b, this.f17463g, this.f17461e, this.f17467k, this.f17441K, this.f17476t, this.f17479w, this.f17480x, this.f17481y, this.f17482z, this.f17431A, this.f17432B, this.f17433C, this.f17437G);
        this.f17439I = C0003b.m3a(new C5734y(this.f17458b, this.f17438H, this.f17464h));
        this.f17440J = C0003b.m3a(new am(this.f17458b));
        C0001a c0001a = (C0001a) this.f17441K;
        this.f17441K = C0003b.m3a(new C5732w(this.f17458b, this.f17468l, this.f17469m, this.f17461e, this.f17470n, this.f17471o, this.f17472p, this.f17473q, this.f17474r, this.f17439I, this.f17440J));
        C0000a c0000a = this.f17441K;
        if (c0000a == null) {
            throw new IllegalArgumentException();
        } else if (c0001a.f0a != null) {
            throw new IllegalStateException();
        } else {
            c0001a.f0a = c0000a;
            this.f17442L = C0005d.m8a(new C3420j());
            this.f17443M = C0003b.m3a(new C5779e());
            this.f17444N = C0003b.m3a(new C5778d(this.f17443M));
            this.f17445O = C0003b.m3a(new C3601c(this.f17477u));
            this.f17446P = C0003b.m3a(new aw(this.f17465i));
            this.f17447Q = C0005d.m8a(new bp(this.f17446P, this.f17458b, this.f17444N));
            this.f17448R = C0005d.m8a(new ab(this.f17458b));
            this.f17449S = C0003b.m3a(new C5780f());
            this.f17450T = C0003b.m3a(new C3418h(this.f17457a, this.f17449S));
            this.f17451U = C0005d.m8a(new C3417g(this.f17444N, this.f17450T));
            this.f17452V = new C3435l(this.f17445O);
            this.f17453W = C0003b.m3a(new C5781g());
            this.f17454X = C0003b.m3a(new com.google.android.instantapps.common.p217e.aj(this.f17465i));
            this.f17455Y = new C3588o(this.f17458b);
            this.f17456Z = C0005d.m8a(new C3582i(this.f17458b));
            this.aa = C0005d.m8a(new C3591r(this.f17458b));
            this.ab = new com.google.android.finsky.instantappsbackendclient.impl.ae(this.f17458b, this.f17455Y, this.f17456Z, this.f17460d, this.aa);
            this.ac = C0005d.m8a(new com.google.android.finsky.instantapps.p212d.ae(this.f17458b));
            this.ad = C0005d.m8a(new C3586m());
            this.ae = C0005d.m8a(new aa(this.ad));
            this.af = C0003b.m3a(new C5758t(this.f17465i));
            this.ag = C0003b.m3a(new C5755q(this.f17465i));
            this.ah = new C5754p(this.f17465i);
            this.ai = C0003b.m3a(new C5751m(this.f17465i));
            this.aj = C0003b.m3a(new C3583j(this.f17458b, this.af, this.ag, this.ah, this.ai));
            this.ak = C0003b.m3a(new C3594v(this.aj));
            this.al = C0003b.m3a(new ax(this.f17465i));
            this.am = C0003b.m3a(new C3589p(this.al));
            this.an = new C3587n(this.ae, this.ak, this.am);
            this.ao = new C3573c(this.f17458b, this.an);
            this.ap = new C3584k(this.ao);
            this.aq = new C3590q(this.ac, this.an, this.ap);
            this.ar = C0005d.m8a(new C3597y(this.ab, this.aq, com.google.android.finsky.instantappsbackendclient.impl.ah.f17872a));
            this.as = new C3585l(this.ar);
            this.at = C0003b.m3a(new aq(this.f17465i));
            this.au = new com.google.android.finsky.instantapps.install.aa(this.am, this.aj);
            this.av = new C3502b(this.ac, this.f17458b, this.at, this.au);
            this.aw = new C3511m(this.f17458b, C3512n.f17744a);
            this.ax = new C3521x(this.f17461e, this.av, C3516r.f17751a, this.aw);
            this.ay = new com.google.android.finsky.instantapps.install.ah(this.f17443M, this.ax);
            this.az = new C3505g(this.ay);
            this.aA = new com.google.android.finsky.instantapps.p212d.al(this.f17458b, this.as, this.f17461e, this.az, this.f17445O);
            this.aB = C0003b.m3a(new C3404x(this.f17458b));
            this.aC = C0003b.m3a(new com.google.android.instantapps.common.p217e.aa(this.f17465i));
            this.aD = C0003b.m3a(new com.google.android.instantapps.common.p221d.p222a.ab(this.f17438H, this.aC));
            this.aE = new C3463n(this.f17458b);
            this.aF = C0003b.m3a(new C3465p(this.aE));
            this.aG = C0003b.m3a(new C5763y(this.f17465i));
            this.aH = C0003b.m3a(new as(this.f17465i));
            this.aI = C0003b.m3a(new au(this.f17465i));
            this.aJ = C0003b.m3a(new av(this.f17465i));
            this.aK = C0003b.m3a(new C3395n(this.f17458b, this.aI, this.aJ));
            this.aL = new com.google.android.instantapps.common.p217e.am(this.f17465i);
            this.aM = new an(this.f17465i);
            this.aN = C0003b.m3a(new C3466q(this.ad, this.aL, this.aM));
            this.aO = new C3470u(this.aN);
            this.aP = new C5759u(this.f17465i);
            this.aQ = C0003b.m3a(new C3468s(this.aE, this.aO, this.aP));
            this.aR = new C3461l(this.f17457a);
            this.aS = new C3459g(this.f17444N, this.aQ, this.aR);
            this.aT = C0003b.m3a(new C3467r(this.aS));
            this.aU = C0003b.m3a(new com.google.android.instantapps.common.p217e.ab(this.f17465i));
            this.aV = C0003b.m3a(new C5761w(this.f17465i));
            this.aW = C0003b.m3a(new C5752n(this.f17465i));
            this.aX = new C3398q(this.f17458b, this.f17477u);
            this.aY = new C3390i(this.aX, this.f17438H);
            this.aZ = C0003b.m3a(new C5762x(this.f17465i));
            this.ba = C0005d.m8a(new C3387f(this.aZ));
            this.bb = new C3393l(this.f17457a, this.f17477u, this.f17445O, this.ba, this.aX, this.f17438H);
            this.bc = new C3401u(this.f17445O, this.f17438H);
            this.bd = C0003b.m3a(new C5783i());
            this.be = new C5747i(this.f17457a, this.f17464h);
            this.bf = C0003b.m3a(new C5746h(this.f17457a, this.be, this.f17439I, this.bd, this.f17438H));
            this.bg = C0003b.m3a(new bc(this.f17458b, this.f17438H, this.bd, this.f17474r, this.bf, this.aV, this.f17464h));
            this.bh = C0003b.m3a(new C5764z(this.f17465i));
            this.bi = C0003b.m3a(new com.google.android.finsky.instantapps.p212d.ag(this.f17455Y));
            this.bj = C0003b.m3a(new C5760v(this.f17465i));
            this.bk = C0003b.m3a(new C5737b(this.f17438H));
            this.bl = C0003b.m3a(new C5756r(this.f17465i));
            this.bm = C0003b.m3a(new ad(this.f17465i));
            this.bn = C0003b.m3a(new C5753o(this.f17465i));
            this.bo = new C5749k(this.f17457a, this.bn);
            this.bp = C0003b.m3a(new af(this.f17465i));
            this.bq = C0003b.m3a(C5842a.f29324a);
            this.br = new bu(this.f17457a, this.f17438H, this.bp, this.bq);
            this.bs = new be(this.f17463g, this.bl, this.bm, this.f17438H, this.bo, this.br);
            this.bt = C0005d.m8a(new C3548b(this.f17458b, this.bs));
            this.bu = new C3552f(this.f17451U);
            this.bv = C0003b.m3a(new C3554h(this.f17458b));
            this.bw = C0005d.m8a(new C3556j(this.bt, this.as, this.bu, this.bv));
            this.bx = C0003b.m3a(new C5757s(this.f17465i));
            this.by = C0003b.m3a(new C3537j(this.f17458b));
            this.bz = C0003b.m3a(new C5707c(this.by));
            this.bA = C0003b.m3a(new com.google.android.finsky.instantapps.p212d.af(this.f17458b));
            this.bB = C0003b.m3a(new ba(this.f17465i));
            this.bC = C0003b.m3a(new com.google.android.instantapps.common.p217e.al(this.f17465i));
            this.bD = C0003b.m3a(new com.google.android.instantapps.common.p217e.ak(this.f17465i));
            this.bE = C0003b.m3a(new at(this.f17465i));
            this.bF = C0005d.m8a(new com.google.android.instantapps.common.loading.ui.ac(this.f17458b));
        }
    }

    private final C5710a m16923b() {
        return new C5710a((Context) this.f17458b.mo1a(), (C5765e) this.f17463g.mo1a(), (ExecutorService) this.f17461e.mo1a(), (C5718h) this.f17467k.mo1a(), C0003b.m4b(this.f17441K), (C5720j) this.f17476t.mo1a(), com.google.android.instantapps.common.p221d.p222a.ag.m26992a((C5774g) this.f17478v.mo1a()), (bf) this.f17480x.mo1a(), (bf) this.f17481y.mo1a(), (bf) this.f17482z.mo1a(), C0003b.m4b(this.f17431A), C0003b.m4b(this.f17432B), C0003b.m4b(this.f17433C), (com.google.android.instantapps.common.p221d.p222a.ae) this.f17437G.mo1a());
    }

    private final C3433j m16924c() {
        return new C3433j(this.aG, this.aH, this.aK, this.f17451U, this.f17477u, this.f17445O, this.aT, C3424b.f17545a, com.google.android.finsky.instantapps.p212d.an.f17544a);
    }

    public final void mo3517a(UpdateContentFilterJob updateContentFilterJob) {
        updateContentFilterJob.f17847a = (C3574a) this.f17460d.mo1a();
        updateContentFilterJob.f17848b = (ExecutorService) this.f17462f.mo1a();
    }

    public final void mo3506a(EphemeralInstallerActivity ephemeralInstallerActivity) {
        C5821g c5821g = new C5821g();
        ephemeralInstallerActivity.f17300r = m16923b();
        ephemeralInstallerActivity.f17301s = (C3377b) this.f17442L.mo1a();
        ephemeralInstallerActivity.f17302t = (Executor) this.f17444N.mo1a();
        ephemeralInstallerActivity.f17303u = (C5771a) this.f17474r.mo1a();
        ephemeralInstallerActivity.f17304v = (C3600b) this.f17445O.mo1a();
        ephemeralInstallerActivity.f17305w = (C5718h) this.f17467k.mo1a();
        ephemeralInstallerActivity.f17306x = (bk) this.f17447Q.mo1a();
        ephemeralInstallerActivity.f17307y = new com.google.android.finsky.instantapps.p212d.aa(this.f17448R, this.f17451U, this.f17452V, this.f17453W, this.f17454X, this.aA);
        C3434k c3434k = new C3434k((C3600b) this.f17445O.mo1a());
        ephemeralInstallerActivity.f17308z = (C3403w) this.aB.mo1a();
        ephemeralInstallerActivity.f17283A = (C5735z) this.aD.mo1a();
        ephemeralInstallerActivity.f17284B = (C3452a) this.aF.mo1a();
        ephemeralInstallerActivity.f17285C = (C5785k) this.f17451U.mo1a();
        ephemeralInstallerActivity.f17286D = m16924c();
        ephemeralInstallerActivity.f17287E = (bf) this.aU.mo1a();
        ephemeralInstallerActivity.f17288F = (bf) this.aV.mo1a();
        ephemeralInstallerActivity.f17289G = ((Boolean) this.am.mo1a()).booleanValue();
        ephemeralInstallerActivity.f17290H = C0003b.m4b(this.aj);
        ephemeralInstallerActivity.f17291I = (bf) this.aW.mo1a();
    }

    public final void mo3507a(InstantAppHygieneService instantAppHygieneService) {
        instantAppHygieneService.f17310a = (ExecutorService) this.f17461e.mo1a();
        instantAppHygieneService.f17311b = new C3532e(this.f17438H, this.f17467k);
        instantAppHygieneService.f17312c = new C3383c(this.as, this.f17451U, this.f17477u, this.f17445O, this.aY, this.bb, this.bc, this.f17438H);
        instantAppHygieneService.f17313d = new C3407d(this.f17451U, this.bg, this.f17438H);
        instantAppHygieneService.f17314e = m16923b();
        instantAppHygieneService.f17315f = (C3574a) this.f17460d.mo1a();
    }

    public final void mo3511a(PhenotypeUpdateService phenotypeUpdateService) {
        phenotypeUpdateService.f17320i = (bb) this.bg.mo1a();
        phenotypeUpdateService.f17321j = m16923b();
        phenotypeUpdateService.f17322k = (bf) this.bh.mo1a();
    }

    public final void mo3512a(SettingsActivity settingsActivity) {
        settingsActivity.f17333s = (C5785k) this.f17451U.mo1a();
        settingsActivity.f17334t = (C3394m) this.aK.mo1a();
        settingsActivity.f17335u = (C3423l) this.bi.mo1a();
        this.f17477u.mo1a();
        Context context = (Context) this.f17458b.mo1a();
        PackageManager packageManager = (PackageManager) this.f17477u.mo1a();
        this.aJ.mo1a();
        settingsActivity.f17336v = new C3402v(context, packageManager, (bf) this.bj.mo1a());
        settingsActivity.f17337w = m16923b();
        settingsActivity.f17338x = (C3453i) this.aT.mo1a();
        settingsActivity.f17339y = m16924c();
        settingsActivity.f17340z = (bf) this.aH.mo1a();
    }

    public final void mo3508a(InstantAppsConfigChangeListener instantAppsConfigChangeListener) {
        instantAppsConfigChangeListener.f17316a = (C3600b) this.f17445O.mo1a();
    }

    public final void mo3510a(PackageReplacedReceiver packageReplacedReceiver) {
        packageReplacedReceiver.f17318a = m16923b();
        packageReplacedReceiver.f17319b = (bf) this.bh.mo1a();
    }

    public final void mo3509a(InstantAppsLoggingService instantAppsLoggingService) {
        instantAppsLoggingService.f17317a = (C5736a) this.bk.mo1a();
    }

    public final void mo3513a(InstantAppRemoveMonitor instantAppRemoveMonitor) {
        instantAppRemoveMonitor.f17347a = (C3403w) this.aB.mo1a();
    }

    public final void mo3514a(AppUpgradeToInstalledService appUpgradeToInstalledService) {
        appUpgradeToInstalledService.f17779i = m16923b();
    }

    public final void mo3504a() {
        C5815l c5815l = new C5815l();
    }

    public final void mo3516a(StatusSyncService statusSyncService) {
        statusSyncService.f17807a = (C3555i) this.bw.mo1a();
        statusSyncService.f17808b = (bf) this.bx.mo1a();
    }

    public final void mo3505a(AppManagementService appManagementService) {
        appManagementService.f17281i = new C3396o((Context) this.f17458b.mo1a(), (PackageManager) this.f17477u.mo1a());
        appManagementService.f17282j = (C5785k) this.f17451U.mo1a();
    }

    public final void mo3515a(LogFlushJob logFlushJob) {
        logFlushJob.f17781b = m16923b();
    }

    public final void mo3519a(C5822h c5822h) {
        c5822h.aD = (C5705a) this.bz.mo1a();
        c5822h.aE = m16923b();
        c5822h.aN = (SharedPreferences) this.bA.mo1a();
        c5822h.aO = (C5785k) this.f17451U.mo1a();
        c5822h.aP = (C3423l) this.bi.mo1a();
        c5822h.aQ = (bf) this.bB.mo1a();
        c5822h.aR = new C5839y((bf) this.bC.mo1a(), (bf) this.bD.mo1a());
        c5822h.aS = new C5815l();
        c5822h.bb = C0003b.m4b(this.bE);
    }

    public final void mo3518a(PreviewImageView previewImageView) {
        previewImageView.f29262a = (com.google.android.instantapps.common.loading.ui.aa) this.bF.mo1a();
        com.google.android.instantapps.common.loading.ui.ad.m27220b();
        previewImageView.f29263b = (bj) this.bE.mo1a();
    }
}
