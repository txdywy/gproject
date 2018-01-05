package com.google.android.finsky.application;

import android.accounts.Account;
import android.app.Application;
import android.app.backup.BackupManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.SearchRecentSuggestions;
import android.support.p017d.C0087a;
import android.support.v4.os.C0327a;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.vending.AssetBrowserActivity;
import com.android.volley.C0700r;
import com.android.volley.p060a.C0668i;
import com.google.android.common.http.UrlRules;
import com.google.android.finsky.C0953a;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aa.C0956c;
import com.google.android.finsky.aa.C0968o;
import com.google.android.finsky.ac.C0977e;
import com.google.android.finsky.ac.C0982h;
import com.google.android.finsky.ac.C0984i;
import com.google.android.finsky.activities.C1033t;
import com.google.android.finsky.api.C1286g;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.appdiscoveryservice.C1321c;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1549f;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bi.p150a.C1639a;
import com.google.android.finsky.bk.C2110d;
import com.google.android.finsky.bk.C2114h;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.bs.C2178b;
import com.google.android.finsky.bx.C1459b;
import com.google.android.finsky.bx.C2195a;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.cb.C2256a;
import com.google.android.finsky.cg.C2277d;
import com.google.android.finsky.cm.C2293a;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cn.p175a.C2321a;
import com.google.android.finsky.dc.C2555a;
import com.google.android.finsky.dfemodel.C2713b;
import com.google.android.finsky.download.C2850m;
import com.google.android.finsky.download.DownloadBroadcastReceiver;
import com.google.android.finsky.ds.C2884a;
import com.google.android.finsky.ds.C2885b;
import com.google.android.finsky.ds.C2886c;
import com.google.android.finsky.du.C2893a;
import com.google.android.finsky.du.C2896d;
import com.google.android.finsky.dw.C2909c;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.ec.C2968a;
import com.google.android.finsky.entertainment.C2999m;
import com.google.android.finsky.externalreferrer.C3009a;
import com.google.android.finsky.externalreferrer.C3011c;
import com.google.android.finsky.externalreferrer.C3025s;
import com.google.android.finsky.externalreferrer.ExternalReferrerService;
import com.google.android.finsky.inlinedetails.C3249d;
import com.google.android.finsky.instantapps.C3525k;
import com.google.android.finsky.instantapps.C3526l;
import com.google.android.finsky.instantapps.appmanagement.C3384d;
import com.google.android.finsky.instantapps.install.C3504f;
import com.google.android.finsky.instantapps.metrics.C3536i;
import com.google.android.finsky.instantapps.p212d.ac;
import com.google.android.finsky.instantapps.p216c.C3413a;
import com.google.android.finsky.instantapps.p216c.C3414b;
import com.google.android.finsky.instantapps.p216c.C3415e;
import com.google.android.finsky.instantapps.p218e.C3464o;
import com.google.android.finsky.instantapps.statussync.C3553g;
import com.google.android.finsky.instantappsbackendclient.impl.C3579f;
import com.google.android.finsky.instantappsbackendclient.impl.C3581h;
import com.google.android.finsky.instantappsquickinstall.C3606c;
import com.google.android.finsky.navigationmanager.p228a.C3757h;
import com.google.android.finsky.p107l.C3648c;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ae;
import com.google.android.finsky.p140i.C3212a;
import com.google.android.finsky.p227n.C3745a;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.packagemanager.impl.PackageMonitorReceiverImpl;
import com.google.android.finsky.preregistration.C3932e;
import com.google.android.finsky.preregistration.C3934g;
import com.google.android.finsky.providers.C1468e;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.scheduler.bm;
import com.google.android.finsky.utils.C1474r;
import com.google.android.finsky.utils.C4672c;
import com.google.android.finsky.utils.C4674e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.an;
import com.google.android.finsky.utils.ax;
import com.google.android.finsky.utils.az;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.volley.C4778c;
import com.google.android.finsky.wear.WearSupportService;
import com.google.android.finsky.wear.af;
import com.google.android.gms.phenotype.C5550i;
import com.google.android.instantapps.common.gms.C5775a;
import com.google.android.instantapps.common.loading.C3411b;
import com.google.android.instantapps.common.loading.C5805a;
import com.google.android.instantapps.common.p217e.C5750l;
import com.google.android.instantapps.common.p221d.p222a.ag;
import com.google.android.instantapps.common.p318g.C5772b;
import com.google.android.instantapps.p309a.p310a.C5686a;
import com.google.android.instantapps.p309a.p310a.C5692g;
import com.google.android.libraries.p321b.p322a.C5847c;
import com.google.android.libraries.play.entertainment.C2998a;
import com.google.android.play.image.bp;
import com.google.android.play.p179a.C6232r;
import com.google.android.play.p179a.p352a.ao;
import com.google.android.play.utils.C6324f;
import com.google.android.play.utils.p146c.C6323d;
import com.google.android.play.utils.p354b.C6321a;
import com.google.android.play.utils.p354b.C6322j;
import com.google.android.volley.GoogleHttpClient;
import com.google.android.wallet.p355a.C6330a;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.wireless.android.p356a.p357a.p358a.p359a.bo;
import com.squareup.leakcanary.C7582R;
import java.io.File;
import p002a.p003a.C0004c;

public class FinskyApplication extends Application implements dm {
    public C1475d f7845a;

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

    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        if (VERSION.SDK_INT < 21) {
            C0087a.m186a((Context) this);
        }
        this.f7845a = new C1475d(this);
    }

    public void onCreate() {
        super.onCreate();
        C1459b c1459b = this.f7845a;
        FinskyLog.m21657a((C1474r) c1459b);
        C1456b c1456b = new C1456b();
        c1456b.f7926a = (dn) C0004c.m6a(new dn(c1459b));
        c1456b.f7927b = (C1321c) C0004c.m6a(new C1321c());
        C0004c.m6a(new C3757h());
        if (c1456b.f7926a == null) {
            throw new IllegalStateException(String.valueOf(dn.class.getCanonicalName()).concat(" must be set"));
        }
        C2850m w;
        C2171b bo;
        Object obj;
        Context applicationContext;
        Context applicationContext2;
        if (c1456b.f7927b == null) {
            c1456b.f7927b = new C1321c();
        }
        c1459b.cg = new C1453a(c1456b);
        String[] strArr = (String[]) C4672c.m21807a(new String[][]{C0955b.f5883a, C6322j.f31587a, C6330a.f31644a});
        C0956c.f5911a = c1459b.f7981b;
        C6321a.m28961a(c1459b.f7981b, strArr);
        ax.f24048a = new az();
        c1459b.aB = c1459b.mo2267z();
        if (c1459b.bK().mo3874a()) {
            if (c1459b.bK().mo3876c() == 1) {
                w = c1459b.mo2264w();
                bo = c1459b.bo();
                if (c1459b == null) {
                    throw null;
                }
                DownloadBroadcastReceiver.m14995a(w, bo, c1459b, c1459b.bK());
                c1459b.f8013g = new C0668i(c1459b.m8673g("safe_mode_cache"), (int) an.f24044g.mo4319a((long) c1459b.de()));
                c1459b.f8012f = new C0700r(c1459b.f8013g, c1459b.dh(), 2);
                c1459b.f8012f.m4511a();
                c1459b.f8026t = new PackageMonitorReceiverImpl(c1459b.mo2032L());
                c1459b.f8026t.mo3818a(new C1639a(c1459b.f7981b, new bz(c1459b)));
                c1459b.f8026t.mo3818a((C2321a) c1459b.mo2032L());
            } else {
                c1459b.bK().mo3876c();
            }
            obj = null;
        } else if (C3525k.m17101a()) {
            C1475d.m8615a((dm) this, new cs());
            applicationContext = c1459b.f7981b.getApplicationContext();
            if (C3525k.f17774a == null) {
                synchronized (C5686a.f28842a) {
                    if (C5686a.f28843b == null) {
                        C5686a.f28843b = new C5692g(applicationContext.getContentResolver());
                    }
                }
                synchronized (C5550i.f28452a) {
                    applicationContext2 = applicationContext.getApplicationContext();
                    if (applicationContext2 == null) {
                        applicationContext2 = applicationContext;
                    }
                    C5550i.f28453b = applicationContext2;
                }
                C5550i.f28454c = false;
                C3414b c3414b = new C3414b();
                c3414b.f17483a = (C5775a) C0004c.m6a(new C5775a(applicationContext));
                if (c3414b.f17483a == null) {
                    throw new IllegalStateException(String.valueOf(C5775a.class.getCanonicalName()).concat(" must be set"));
                }
                if (c3414b.f17484b == null) {
                    c3414b.f17484b = new C3415e();
                }
                if (c3414b.f17485c == null) {
                    c3414b.f17485c = new C3579f();
                }
                if (c3414b.f17486d == null) {
                    c3414b.f17486d = new C3536i();
                }
                if (c3414b.f17487e == null) {
                    c3414b.f17487e = new C5750l();
                }
                if (c3414b.f17488f == null) {
                    c3414b.f17488f = new ag();
                }
                if (c3414b.f17489g == null) {
                    c3414b.f17489g = new C5772b();
                }
                if (c3414b.f17490h == null) {
                    c3414b.f17490h = new C3581h();
                }
                if (c3414b.f17491i == null) {
                    c3414b.f17491i = new ac();
                }
                if (c3414b.f17492j == null) {
                    c3414b.f17492j = new C3504f();
                }
                if (c3414b.f17493k == null) {
                    c3414b.f17493k = new C3464o();
                }
                if (c3414b.f17494l == null) {
                    c3414b.f17494l = new C3384d();
                }
                if (c3414b.f17495m == null) {
                    c3414b.f17495m = new C3553g();
                }
                C3411b c3413a = new C3413a(c3414b);
                C1468e c3525k = new C3525k(c3413a);
                C3525k.f17774a = c3525k;
                C3947d.f19945a = c3525k;
                C5805a.f29260a = c3413a;
            }
            obj = null;
        } else {
            obj = 1;
        }
        if (obj != null) {
            applicationContext2 = c1459b.f7981b;
            C3212a z = c1459b.mo2267z();
            if (c1459b == null) {
                throw null;
            }
            C0953a c0953a = new C0953a(applicationContext2, z, c1459b);
            if (c0953a.f5797h == null) {
                c0953a.f5797h = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(c0953a);
            }
            if (c0953a.f5795f >= ((Integer) C0955b.gc.m28964b()).intValue()) {
                c1459b.bK().mo3877d();
            }
            applicationContext2 = c1459b.f7981b;
            synchronized (C5847c.f29336a) {
                if (VERSION.SDK_INT < 24 || !applicationContext2.isDeviceProtectedStorage()) {
                    applicationContext = applicationContext2.getApplicationContext();
                    if (applicationContext != null) {
                        applicationContext2 = applicationContext;
                    }
                }
                if (C5847c.f29337b != applicationContext2) {
                    C5847c.f29339d = null;
                }
                C5847c.f29337b = applicationContext2;
            }
            C5847c.f29338c = false;
            c1459b.dy().postDelayed(new dd(c1459b), (long) ((Integer) C0955b.gG.m28964b()).intValue());
            c1459b.mo2267z().mo3375a(new dg(c1459b));
            c1459b.mo2023C();
            c1459b.f8024r = c1459b.aR().m13184a(null);
            if (c1459b.dj().mo2294a(12639415)) {
                c1459b.dc().m13334k();
            }
            c1459b.aP().m13350a(c1459b.f8024r, 1700);
            C1475d.m8615a((dm) this, c1459b);
            c1459b.dy().post(new dh(c1459b, c1459b.dj().mo2294a(12625103)));
            c1459b.f8013g = new C4778c(c1459b.m8673g("main"), (int) an.f24044g.mo4319a((long) c1459b.de()), new di(c1459b), c1459b.dj().mo2294a(12627544));
            c1459b.by = ((Integer) C0954a.f5832b.m5760a()).intValue();
            c1459b.dy().post(new dj(c1459b));
            if (!c1459b.mo2035O().m8841d()) {
                c1459b.f7981b.getPackageManager().setComponentEnabledSetting(new ComponentName(c1459b.f7981b, AssetBrowserActivity.class), 1, 1);
            }
            if (!(c1459b.dj().mo2294a(12636767) && c1459b.dj().mo2294a(12637791))) {
                Object[] objArr = new Object[1];
                GoogleHttpClient googleHttpClient = new GoogleHttpClient(c1459b.f7981b, "");
                String uri = C1286g.f7656a.toString();
                objArr[0] = UrlRules.m5671a(googleHttpClient.f31618c).m5672a(uri).m5673a(uri);
                FinskyLog.m21662b("Initializing network with DFE %s", objArr);
            }
            if (c1459b.dj().mo2294a(12638353)) {
                c1459b.dy().post(new dk(c1459b));
            } else {
                c1459b.bl();
            }
            c1459b.f8026t = new PackageMonitorReceiverImpl(c1459b.mo2032L());
            c1459b.f8026t.mo3818a(new C1639a(c1459b.f7981b, new C1495v(c1459b)));
            C3851f c3851f = c1459b.f8026t;
            applicationContext = c1459b.f7981b;
            ExternalReferrerService externalReferrerService = new ExternalReferrerService();
            if (c1459b.bo == null) {
                c1459b.bo = new C3009a();
            }
            C3009a c3009a = c1459b.bo;
            C3011c F = c1459b.mo2026F();
            C2127b c = c1459b.mo2169c();
            if (c1459b == null) {
                throw null;
            } else if (c1459b == null) {
                throw null;
            } else {
                c3851f.mo3818a(new C3025s(applicationContext, c3009a, F, c, c1459b, c1459b));
                C3851f c3851f2 = c1459b.f8026t;
                Context context = c1459b.f7981b;
                if (c1459b == null) {
                    throw null;
                }
                c3851f2.mo3818a(new C2178b(context, c1459b, new C1496w(c1459b)));
                c1459b.f8026t.mo3818a(new C2293a(new C1497x(c1459b), new C1498y(c1459b), new C1499z(c1459b)));
                c1459b.f8026t.mo3818a((C2321a) c1459b.mo2032L());
                c1459b.f8026t.mo3817a(new C2555a(c1459b.bi(), c1459b.f7981b.getPackageName(), c1459b.dc(), c1459b.dj()));
                if (!c1459b.dj().mo2294a(12634957)) {
                    c1459b.f8026t.mo3817a(new bm(c1459b.dB()));
                }
                if (!c1459b.dj().mo2294a(12625103) && c1459b.bG().m11228a()) {
                    c1459b.f8026t.mo3817a(new C3526l(c1459b.f7981b));
                }
                if (c1459b.dj().mo2294a(12642495) && c1459b.mo2036P().f8184h) {
                    c1459b.f8026t.mo3818a(new C3745a(c1459b.f7981b, c1459b.mo2032L(), c1459b.mo2036P(), c1459b.dD(), c1459b.dy()));
                }
                c1459b.dy().post(new dl(c1459b));
                if (c1459b.dj().mo2294a(12616559)) {
                    if (c1459b.av == null) {
                        applicationContext = c1459b.f7981b;
                        if (c1459b == null) {
                            throw null;
                        }
                        c1459b.av = new C2884a(applicationContext, c1459b, new by(c1459b));
                    }
                    BroadcastReceiver broadcastReceiver = c1459b.av;
                    broadcastReceiver.f15377a.registerReceiver(broadcastReceiver, new IntentFilter("com.google.android.libraries.kids.supervision.apps.APP_STATE_CHANGED"));
                    C2885b g = c1459b.mo2244g();
                    g.f15380a.clear();
                    if (g.f15384e.m8823c()) {
                        new C2886c(g).execute(new Void[0]);
                    } else {
                        FinskyLog.m21659a("Not a unicorn device", new Object[0]);
                    }
                }
                applicationContext = c1459b.f7981b;
                if (!((Boolean) C0968o.f5929f.m5760a()).booleanValue()) {
                    new BackupManager(applicationContext).dataChanged();
                }
                w = c1459b.mo2264w();
                bo = c1459b.bo();
                if (c1459b == null) {
                    throw null;
                }
                Object obj2;
                int intValue;
                float f;
                DownloadBroadcastReceiver.m14995a(w, bo, c1459b, c1459b.bK());
                if (c1459b.dj().mo2294a(12637218) && c1459b.mo2036P().f8185i) {
                    obj2 = 1;
                } else {
                    obj2 = null;
                }
                if (obj2 == null && ((Boolean) C0955b.fK.m28964b()).booleanValue()) {
                    HandlerThread handlerThread = new HandlerThread("NetworkQualityQueryThread");
                    handlerThread.start();
                    Handler handler = new Handler(handlerThread.getLooper());
                    if (c1459b.dj().mo2294a(12627889)) {
                        c1459b.mo2264w().mo3176a(new C2110d(c1459b.f7981b, handler));
                    } else {
                        c1459b.mo2264w().mo3176a(new C2114h(c1459b.f7981b, handler));
                    }
                }
                File g2 = c1459b.m8673g("images");
                an anVar = an.f24044g;
                C1552e dj = c1459b.dj();
                long longValue = ((Long) C0954a.al.m5760a()).longValue();
                if (longValue < 0) {
                    bb.m21792a(new cr(c1459b), new Void[0]);
                    intValue = ((Integer) C0955b.f5888e.m28964b()).intValue();
                } else {
                    float f2;
                    f = ((((float) longValue) / 1024.0f) / 1024.0f) / 1024.0f;
                    if (f < 4.0f) {
                        f = 20.0f;
                    } else if (f < 8.0f) {
                        f = 50.0f;
                    } else if (f < 32.0f) {
                        f = 80.0f;
                    } else {
                        f = 100.0f;
                    }
                    f *= ((float) Math.max(c1459b.av().m9276b(), c1459b.av().m9277c())) / 1920.0f;
                    if (dj.mo2294a(12603118)) {
                        f2 = f * 0.5f;
                    } else if (dj.mo2294a(12603119)) {
                        f2 = f * 0.75f;
                    } else if (dj.mo2294a(12603120)) {
                        f2 = f * 1.0f;
                    } else if (dj.mo2294a(12603121)) {
                        f2 = f * 1.25f;
                    } else if (dj.mo2294a(12603122)) {
                        f2 = f * 1.5f;
                    } else {
                        f2 = (float) ((Integer) C0955b.f5888e.m28964b()).intValue();
                    }
                    if (dj.mo2294a(12627544)) {
                        f = (float) ((Integer) C0955b.f5890g.m28964b()).intValue();
                    } else {
                        f = 0.0f;
                    }
                    f = f2 - f;
                    if (f > 150.0f) {
                        intValue = 150;
                    } else if (f < 4.0f) {
                        intValue = 4;
                    } else {
                        intValue = (int) f;
                    }
                }
                c1459b.f8017k = new C4778c(g2, (int) anVar.mo4319a((long) intValue), null, false);
                if (!c1459b.dj().mo2294a(12613073)) {
                    c1459b.bm();
                    c1459b.be();
                }
                c1459b.aW().mo3362a(c1459b.mo2032L().mo2854a(c1459b.f7981b.getPackageName()).f11419d);
                String str = c0953a.f5799j;
                if (!TextUtils.isEmpty(str)) {
                    long j;
                    bo boVar = new C2474c(7).m13253f(c0953a.f5800k).f13342a;
                    boVar.m29000c(str);
                    Boolean bool = c0953a.f5801l;
                    ao aoVar = null;
                    if (c1459b.dj().mo2294a(12635440) && c1459b.dj().mo2294a(12635488) && bool != null) {
                        aoVar = C6232r.m28732a().m28734b();
                        aoVar.m28590b(bool.booleanValue());
                    }
                    C2482j dc = c1459b.dc();
                    switch (c0953a.f5793d) {
                        case 1:
                            j = c0953a.f5803n;
                            break;
                        case 2:
                            j = c0953a.f5804o;
                            break;
                        default:
                            j = -1;
                            break;
                    }
                    dc.m13320a(boVar, aoVar, j);
                }
                c1459b.bx = new SearchRecentSuggestions(c1459b.f7981b, "com.google.android.finsky.RecentSuggestionsProvider", 3);
                c1459b.ag = new C2909c(c1459b.f7981b);
                if (C0327a.m1722b()) {
                    c1459b.mo2259r().mo3809d();
                }
                c1459b.dg();
                c1459b.df();
                if (C1503a.m8831b(c1459b.f7981b)) {
                    C2968a.m15380a(c1459b.f7981b).m15382a();
                }
                if (c1459b == null) {
                    throw null;
                }
                if (c1459b.f8031y == null) {
                    C2471a aR = c1459b.aR();
                    if (c1459b == null) {
                        throw null;
                    }
                    c1459b.f8031y = new C3932e(aR);
                }
                C3932e c3932e = c1459b.f8031y;
                C1287h aK = c1459b.aK();
                C2206c ah = c1459b.ah();
                C2199l ai = c1459b.ai();
                C2320a L = c1459b.mo2032L();
                C2910a au = c1459b.au();
                c1459b.cQ();
                c1459b.aq = new C3934g(c1459b, c3932e, c1459b, aK, ah, ai, L, au);
                if (!c1459b.dj().mo2294a(12625988)) {
                    c1459b.mo2169c();
                    c1459b.mo2029I();
                }
                if (c1459b == null) {
                    throw null;
                }
                C2206c c2206c = c1459b.f8009Y;
                C2320a L2 = c1459b.mo2032L();
                Handler dz = c1459b.dz();
                Handler dA = c1459b.dA();
                String str2 = Build.FINGERPRINT;
                C1287h aK2 = c1459b.aK();
                C2471a aR2 = c1459b.aR();
                if (c1459b == null) {
                    throw null;
                }
                c1459b.ad = new C3648c(c1459b, c2206c, L2, dz, dA, str2, null, aK2, aR2, c1459b);
                C0977e cA = c1459b.cA();
                cA.f5959b.mo2798a(new C0982h(cA));
                cA.f5961d.mo3818a(new C0984i(cA));
                if (!c1459b.dj().mo2294a(12625988)) {
                    c1459b.mo2257p();
                    c1459b.mo2048a();
                }
                if (c1459b.dj().mo2294a(12625988)) {
                    c1459b.dz().postDelayed(new cj(c1459b), (long) (((Integer) C0955b.gG.m28964b()).intValue() * 1));
                } else {
                    c1459b.dp();
                }
                if (!(C1503a.m8831b(c1459b.f7981b) || C1503a.m8830a(c1459b.f7981b) || C1503a.m8833d(c1459b.f7981b))) {
                    c3851f2 = c1459b.mo2254m();
                    if (c1459b.aK == null) {
                        c1459b.aK = new af();
                    }
                    c3851f2.mo3818a(c1459b.aK);
                    if (c1459b.dj().mo2294a(12636767) || c1459b.dj().mo2294a(12637792)) {
                        c1459b.dy().postDelayed(new ck(c1459b), (long) ((Integer) C0955b.gG.m28964b()).intValue());
                    } else {
                        WearSupportService.m22415a(c1459b.f7981b);
                    }
                }
                if (!c1459b.dj().mo2294a(12625988)) {
                    c1459b.mo2113b();
                }
                if (!c1459b.dj().mo2294a(12639920)) {
                    c1459b.cr();
                }
                C2893a c2893a = new C2893a(c1459b.f7981b, new C1478e(c1459b), new C1479f(c1459b), c1459b.f8026t, c1459b.bH());
                C2896d c2896d = new C2896d(c1459b.f7981b, new C1490q(c1459b), new ab(c1459b), new am(c1459b), new ax(c1459b), new bi(c1459b), c1459b.f8026t);
                if (!c1459b.mo2035O().m8841d()) {
                    C1033t.m6037a(c1459b.f7981b);
                }
                C6324f.f31614a = new cl();
                if (obj2 == null) {
                    if (c1459b == null) {
                        throw null;
                    }
                    c1459b.aO = new C2277d(c1459b);
                    C6323d.f31613a = new cm(c1459b);
                }
                DisplayMetrics displayMetrics = C1473m.f7980a.f7981b.getResources().getDisplayMetrics();
                if (displayMetrics.densityDpi <= 325) {
                    f = 1.0f;
                } else {
                    f = 325.0f / ((float) displayMetrics.densityDpi);
                }
                bp.m28936a().f31548d = new df(f);
                c1459b.ae();
                c1459b.f8018l = new C2256a(new bt(c1459b), new ce(c1459b));
                c1459b.f7981b.registerComponentCallbacks(c1459b.f8018l);
                if (c1459b.dj().mo2294a(12633506)) {
                    C4674e.m21809a(new cn(c1459b)).start();
                } else {
                    c1459b.f8014h = new C2713b(new Handler(Looper.getMainLooper()), c1459b.ap(), c1459b.aK());
                }
                C2998a.m15495a(new C2999m(c1459b.f7981b, new ch(c1459b), new C1480g(c1459b), new C1481h(c1459b), new C1482i(c1459b), new C1483j(c1459b), new C1484k(c1459b), new C1485l(c1459b), new C1486m(c1459b), new C1487n(c1459b), new C1488o(c1459b), new C1489p(c1459b), new C1491r(c1459b), new C1492s(c1459b), new C1493t(c1459b), new C1494u(c1459b)));
                c1459b.ay();
                if (((Boolean) C0955b.cr.m28964b()).booleanValue()) {
                    c1459b.bp().mo4366c(c1459b.f7981b);
                }
                C2322b a = c1459b.mo2032L().mo2854a("com.google.android.finsky");
                if (a != null) {
                    try {
                        PackageManager packageManager = c1459b.f7981b.getPackageManager();
                        if (packageManager.getApplicationEnabledSetting("com.google.android.finsky") != 2) {
                            packageManager.setApplicationEnabledSetting("com.google.android.finsky", 2, 1);
                        }
                    } catch (SecurityException e) {
                        FinskyLog.m21665c("Unable to disable old finsky package.", new Object[0]);
                    }
                    int intValue2 = ((Integer) C0955b.f5878V.m28964b()).intValue();
                    if (a.f11419d < intValue2) {
                        FinskyLog.m21659a("Updating com.google.android.finsky from %d to %d", Integer.valueOf(a.f11419d), Integer.valueOf(intValue2));
                        String str3 = "com.google.android.finsky";
                        Account e2 = c1459b.mo2041U().mo1189e();
                        if (e2 == null) {
                            FinskyLog.m21665c("No current account", new Object[0]);
                        } else {
                            c1459b.f7993I.mo3431a(str3);
                            c1459b.f7993I.mo3440a(str3, false, false, false);
                            c1459b.f7993I.mo3432a(str3, intValue2, e2.name, c1459b.m8582a((int) C7582R.string.app_name), 3, null, c1459b.aR().m13184a("suicidal_tabsky"));
                        }
                    }
                }
                C2482j.m13296a(c1459b.dj().mo2294a(12606765));
                if (c1459b == null) {
                    throw null;
                }
                C1608h.f8521c = c1459b;
                applicationContext = c1459b.f7981b;
                if (c1459b == null) {
                    throw null;
                }
                C1549f c3249d = new C3249d(applicationContext, c1459b);
                c3249d.m16359a();
                c1459b.dj().mo2291a(c3249d);
                c3249d = new C3606c(c1459b.f7981b, c1459b, c1459b.f8024r);
                c3249d.m17204a();
                c1459b.dj().mo2291a(c3249d);
                if (c1459b.dj().mo2294a(12639920)) {
                    c1459b.dy().post(new co(c1459b));
                }
                if (((Boolean) C0955b.bC.m28964b()).booleanValue() || c1459b.dj().mo2294a(12640993)) {
                    c1459b.dy().postDelayed(new cp(c1459b), (long) ((Integer) C0955b.gG.m28964b()).intValue());
                }
                c1459b.dq();
                c1459b.aP().m13350a(c1459b.f8024r, 1701);
                if (!c1459b.dj().mo2294a(12626588)) {
                    new Handler(Looper.getMainLooper()).postDelayed(new de(c1459b), (long) ((Integer) C0955b.gK.m28964b()).intValue());
                }
                if (ae.m13192a(c1459b)) {
                    c1459b.cv();
                }
            }
        }
    }

    public final void mo1692a() {
        C6331c.m28985a(getApplicationContext(), C2195a.f10984a);
    }
}
