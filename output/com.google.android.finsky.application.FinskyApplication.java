package com.google.android.finsky.application;

import a.a.c;
import android.accounts.Account;
import android.app.Application;
import android.app.backup.BackupManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources$Theme;
import android.net.Uri;
import android.os.Build;
import android.os.Build$VERSION;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.provider.SearchRecentSuggestions;
import android.support.d.a;
import android.support.v4.os.a;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.android.vending.AssetBrowserActivity;
import com.android.volley.a.i;
import com.android.volley.r;
import com.google.android.common.http.UrlRules;
import com.google.android.common.http.c;
import com.google.android.finsky.a;
import com.google.android.finsky.aa.a;
import com.google.android.finsky.aa.b;
import com.google.android.finsky.aa.c;
import com.google.android.finsky.aa.n;
import com.google.android.finsky.aa.o;
import com.google.android.finsky.ac.e;
import com.google.android.finsky.ac.h;
import com.google.android.finsky.ac.i;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.activities.t;
import com.google.android.finsky.api.g;
import com.google.android.finsky.appdiscoveryservice.c;
import com.google.android.finsky.aq.a;
import com.google.android.finsky.as.a;
import com.google.android.finsky.as.e;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.h;
import com.google.android.finsky.bg.k;
import com.google.android.finsky.bi.a.a;
import com.google.android.finsky.bk.d;
import com.google.android.finsky.bk.h;
import com.google.android.finsky.bp.a;
import com.google.android.finsky.bs.b;
import com.google.android.finsky.bx.a;
import com.google.android.finsky.by.l;
import com.google.android.finsky.cb.a;
import com.google.android.finsky.cg.d;
import com.google.android.finsky.cm.a;
import com.google.android.finsky.cn.a;
import com.google.android.finsky.cn.a.a;
import com.google.android.finsky.cn.b;
import com.google.android.finsky.d.a;
import com.google.android.finsky.d.ae;
import com.google.android.finsky.d.c;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.t;
import com.google.android.finsky.dc.a;
import com.google.android.finsky.dfemodel.b;
import com.google.android.finsky.download.DownloadBroadcastReceiver;
import com.google.android.finsky.download.m;
import com.google.android.finsky.ds.a;
import com.google.android.finsky.ds.b;
import com.google.android.finsky.ds.c;
import com.google.android.finsky.du.a;
import com.google.android.finsky.du.d;
import com.google.android.finsky.dw.c;
import com.google.android.finsky.ec.a;
import com.google.android.finsky.entertainment.m;
import com.google.android.finsky.externalreferrer.ExternalReferrerService;
import com.google.android.finsky.externalreferrer.a;
import com.google.android.finsky.externalreferrer.s;
import com.google.android.finsky.hygiene.v;
import com.google.android.finsky.i.a;
import com.google.android.finsky.inlinedetails.d;
import com.google.android.finsky.installer.k;
import com.google.android.finsky.instantapps.appmanagement.d;
import com.google.android.finsky.instantapps.c.a;
import com.google.android.finsky.instantapps.c.b;
import com.google.android.finsky.instantapps.c.e;
import com.google.android.finsky.instantapps.d.ac;
import com.google.android.finsky.instantapps.e.o;
import com.google.android.finsky.instantapps.install.f;
import com.google.android.finsky.instantapps.k;
import com.google.android.finsky.instantapps.l;
import com.google.android.finsky.instantapps.metrics.i;
import com.google.android.finsky.instantapps.statussync.g;
import com.google.android.finsky.instantappsbackendclient.impl.f;
import com.google.android.finsky.instantappsbackendclient.impl.h;
import com.google.android.finsky.instantappsquickinstall.c;
import com.google.android.finsky.l.c;
import com.google.android.finsky.m;
import com.google.android.finsky.n.a;
import com.google.android.finsky.navigationmanager.a.h;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.packagemanager.f;
import com.google.android.finsky.packagemanager.impl.PackageMonitorReceiverImpl;
import com.google.android.finsky.preregistration.e;
import com.google.android.finsky.preregistration.g;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.recoverymode.a;
import com.google.android.finsky.scheduler.bm;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.an;
import com.google.android.finsky.utils.ax;
import com.google.android.finsky.utils.az;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.utils.c;
import com.google.android.finsky.utils.e;
import com.google.android.finsky.verifier.d;
import com.google.android.finsky.volley.c;
import com.google.android.finsky.wear.WearSupportService;
import com.google.android.finsky.wear.af;
import com.google.android.gms.phenotype.i;
import com.google.android.instantapps.a.a.a;
import com.google.android.instantapps.a.a.g;
import com.google.android.instantapps.common.d.a.ag;
import com.google.android.instantapps.common.e.l;
import com.google.android.instantapps.common.g.b;
import com.google.android.instantapps.common.gms.a;
import com.google.android.instantapps.common.loading.a;
import com.google.android.libraries.b.a.c;
import com.google.android.libraries.play.entertainment.a;
import com.google.android.play.a.a.ao;
import com.google.android.play.a.r;
import com.google.android.play.image.bp;
import com.google.android.play.utils.b.a;
import com.google.android.play.utils.b.j;
import com.google.android.play.utils.c.d;
import com.google.android.play.utils.f;
import com.google.android.volley.GoogleHttpClient;
import com.google.android.wallet.a.a;
import com.google.b.a.a.a.a.a.c;
import com.google.b.a.a.a.a.a.e;
import com.google.wireless.android.a.a.a.a.bo;
import java.util.Map;

public class FinskyApplication extends Application implements com.google.android.finsky.application.dm
{

    public com.google.android.finsky.application.d a;

    FinskyApplication() {
        Application();
    }

    public final void a() {
        com.google.b.a.a.a.a.a.c.a(this.getApplicationContext(), com.google.android.finsky.bx.a.a);
    }

    protected void attachBaseContext(Context p0) {
        super.attachBaseContext(p0);
        if (Build$VERSION.SDK_INT < 21)
            android.support.d.a.a(this);
        this.a = new com.google.android.finsky.application.d(this);
    }

    public Context createConfigurationContext(Configuration p0) {
        if (Build$VERSION.SDK_INT >= 17)
            v0 = new com.google.b.a.a.a.a.a.e(super.createConfigurationContext(p0));
        else
            v0 = 0;
        return v0;
    }

    public AssetManager getAssets() {
        return com.google.b.a.a.a.a.a.c.b(this);
    }

    public Resources getResources() {
        return com.google.b.a.a.a.a.a.c.a(this);
    }

    public Resources$Theme getTheme() {
        return com.google.b.a.a.a.a.a.c.c(this);
    }

    public void onCreate() {
  0:    super.onCreate();
  5:    v7 = this.a;
  7:    FinskyLog.a(v7);
 12:    v3 = new com.google.android.finsky.application.b();
 26:    v3.a = (com.google.android.finsky.application.dn)a.a.c.a(new com.google.android.finsky.application.dn(v7));
 39:    v3.b = (com.google.android.finsky.appdiscoveryservice.c)a.a.c.a(new com.google.android.finsky.appdiscoveryservice.c());
 46:    a.a.c.a(new com.google.android.finsky.navigationmanager.a.h());
 51:    if (v3.a == 0)
 74:        throw new IllegalStateException(String.valueOf(com.google.android.finsky.application.dn.getCanonicalName()).concat(" must be set"));
 77:    if (v3.b == 0)
 84:        v3.b = new com.google.android.finsky.appdiscoveryservice.c();
 91:    v7.cg = new com.google.android.finsky.application.a(v3);
 94:    v2 = new String[3][];
 99:    v2[0] = com.google.android.finsky.aa.b.a;
104:    v2[1] = com.google.android.play.utils.b.j.a;
109:    v2[2] = com.google.android.wallet.a.a.a;
119:    com.google.android.finsky.aa.c.a = v7.b;
123:    com.google.android.play.utils.b.a.a(v7.b, (String[])com.google.android.finsky.utils.c.a(v2));
131:    com.google.android.finsky.utils.ax.a = new com.google.android.finsky.utils.az();
137:    v7.aB = v7.z();
147:    if (v7.bK().a()) {
158:        if (v7.bK().c() == 1) {
168:            if (v7 == 0)
171:                throw 0;
176:            DownloadBroadcastReceiver.a(v7.w(), v7.bo(), v7, v7.bK());
202:            v7.g = new com.android.volley.a.i(v7.g("safe_mode_cache"), (int)com.google.android.finsky.utils.an.g.a((long)v7.de()));
216:            v7.f = new com.android.volley.r(v7.g, v7.dh(), 2);
220:            v7.f.a();
232:            v7.t = new PackageMonitorReceiverImpl(v7.L());
248:            v7.t.a(new com.google.android.finsky.bi.a.a(v7.b, new com.google.android.finsky.application.bz(v7)));
259:            v7.t.a((com.google.android.finsky.cn.a.a)v7.L());
            }
            else
281:            v7.bK().c();
262:        v2 = 0;
        }
289:    else if (com.google.android.finsky.instantapps.k.a()) {
298:        com.google.android.finsky.application.d.a(this, new com.google.android.finsky.application.cs());
303:        v3 = v7.b.getApplicationContext();
309:        if (com.google.android.finsky.instantapps.k.a == 0) {
313:            enter com.google.android.instantapps.a.a.a.a;
314:            try {
316:                if (com.google.android.instantapps.a.a.a.b == 0)
327:                    com.google.android.instantapps.a.a.a.b = new com.google.android.instantapps.a.a.g(v3.getContentResolver());
329:                exit com.google.android.instantapps.a.a.a.a;
                }
                catch (Throwable ex) {
391:                try {
391:                    exit com.google.android.instantapps.a.a.a.a;
                    }
                    catch (Throwable ex) {
391:                    exit com.google.android.instantapps.a.a.a.a;
392:                    throw ex;
                    }
392:                throw ex;
                }
332:            enter com.google.android.gms.phenotype.i.a;
333:            try {
333:                v2 = v3.getApplicationContext();
337:                if (v2 == 0)
339:                    v2 = v3;
340:                com.google.android.gms.phenotype.i.b = v2;
342:                exit com.google.android.gms.phenotype.i.a;
                }
                catch (Throwable ex) {
394:                try {
394:                    exit com.google.android.gms.phenotype.i.a;
                    }
                    catch (Throwable ex) {
394:                    exit com.google.android.gms.phenotype.i.a;
395:                    throw ex;
                    }
395:                throw ex;
                }
344:            com.google.android.gms.phenotype.i.c = 0;
348:            v4 = new com.google.android.finsky.instantapps.c.b();
362:            v4.a = (com.google.android.instantapps.common.gms.a)a.a.c.a(new com.google.android.instantapps.common.gms.a(v3));
366:            if (v4.a == 0)
389:                throw new IllegalStateException(String.valueOf(com.google.android.instantapps.common.gms.a.getCanonicalName()).concat(" must be set"));
398:            if (v4.b == 0)
405:                v4.b = new com.google.android.finsky.instantapps.c.e();
409:            if (v4.c == 0)
416:                v4.c = new com.google.android.finsky.instantappsbackendclient.impl.f();
420:            if (v4.d == 0)
427:                v4.d = new com.google.android.finsky.instantapps.metrics.i();
431:            if (v4.e == 0)
438:                v4.e = new com.google.android.instantapps.common.e.l();
442:            if (v4.f == 0)
449:                v4.f = new com.google.android.instantapps.common.d.a.ag();
453:            if (v4.g == 0)
460:                v4.g = new com.google.android.instantapps.common.g.b();
464:            if (v4.h == 0)
471:                v4.h = new com.google.android.finsky.instantappsbackendclient.impl.h();
475:            if (v4.i == 0)
482:                v4.i = new com.google.android.finsky.instantapps.d.ac();
486:            if (v4.j == 0)
493:                v4.j = new com.google.android.finsky.instantapps.install.f();
497:            if (v4.k == 0)
504:                v4.k = new com.google.android.finsky.instantapps.e.o();
508:            if (v4.l == 0)
515:                v4.l = new com.google.android.finsky.instantapps.appmanagement.d();
519:            if (v4.m == 0)
526:                v4.m = new com.google.android.finsky.instantapps.statussync.g();
530:            v2 = new com.google.android.finsky.instantapps.c.a(v4);
535:            v3 = new com.google.android.finsky.instantapps.k(v2);
538:            com.google.android.finsky.instantapps.k.a = v3;
540:            com.google.android.finsky.providers.d.a = v3;
542:            com.google.android.instantapps.common.loading.a.a = v2;
            }
544:        v2 = 0;
        }
        else
547:        v2 = 1;
263:    if (v2 == 0)
2941:        return;
273:    if (v7 == 0)
276:        throw 0;
550:    v14 = new com.google.android.finsky.a(v7.b, v7.z(), v7);
555:    if (v14.h == 0) {
561:        v14.h = Thread.getDefaultUncaughtExceptionHandler();
563:        Thread.setDefaultUncaughtExceptionHandler(v14);
        }
580:    if (v14.f >= ((Integer)com.google.android.finsky.aa.b.gc.b()).intValue())
586:        v7.bK().d();
589:    v2 = v7.b;
593:    enter com.google.android.libraries.b.a.c.a;
598:    if (Build$VERSION.SDK_INT < 24) goto 972;
604:    if (!v2.isDeviceProtectedStorage()) goto 972;
608:    if (com.google.android.libraries.b.a.c.b != v2)
611:        com.google.android.libraries.b.a.c.d = 0;
613:    com.google.android.libraries.b.a.c.b = v2;
615:    exit com.google.android.libraries.b.a.c.a;
617:    com.google.android.libraries.b.a.c.c = 0;
641:    v7.dy().postDelayed(new com.google.android.finsky.application.dd(v7), (long)((Integer)com.google.android.finsky.aa.b.gG.b()).intValue());
653:    v7.z().a(new com.google.android.finsky.application.dg(v7));
656:    v7.C();
668:    v7.r = v7.aR().a(0);
681:    if (v7.dj().a(12639415))
687:        v7.dc().k();
698:    v7.aP().a(v7.r, 1700);
703:    com.google.android.finsky.application.d.a(this, v7);
726:    v7.dy().post(new com.google.android.finsky.application.dh(v7, v7.dj().a(12625103)));
768:    v7.g = new com.google.android.finsky.volley.c(v7.g("main"), (int)com.google.android.finsky.utils.an.g.a((long)v7.de()), new com.google.android.finsky.application.di(v7), v7.dj().a(12627544));
782:    v7.by = ((Integer)com.google.android.finsky.aa.a.b.a()).intValue();
793:    v7.dy().post(new com.google.android.finsky.application.dj(v7));
804:    if (!v7.O().d())
823:        v7.b.getPackageManager().setComponentEnabledSetting(new ComponentName(v7.b, AssetBrowserActivity), 1, 1);
837:    if ((!v7.dj().a(12636767)) || !v7.dj().a(12637791)) {
855:        v3 = new Object[1];
869:        v6 = com.google.android.finsky.api.g.a.toString();
887:        v3[0] = UrlRules.a(new GoogleHttpClient(v7.b, "").c).a(v6).a(v6);
889:        FinskyLog.b("Initializing network with DFE %s", v3);
        }
903:    if (!v7.dj().a(12638353))
905:        v7.bl();
        else
993:        v7.dy().post(new com.google.android.finsky.application.dk(v7));
917:    v7.t = new PackageMonitorReceiverImpl(v7.L());
933:    v7.t.a(new com.google.android.finsky.bi.a.a(v7.b, new com.google.android.finsky.application.v(v7)));
944:    new ExternalReferrerService();
949:    if (v7.bo == 0)
956:        v7.bo = new com.google.android.finsky.externalreferrer.a();
968:    if (v7 == 0)
971:        throw 0;
969:    goto 997;
972:    v3 = v2.getApplicationContext();
976:    if (v3 != 0)
978:        v2 = v3;
979:    goto 606;
982:    exit com.google.android.libraries.b.a.c.a;
983:    throw ex;
997:    if (v7 == 0)
1000:        throw 0;
1005:    v7.t.a(new com.google.android.finsky.externalreferrer.s(v7.b, v7.bo, v7.F(), v7.c(), v7, v7));
1014:    if (v7 == 0)
1017:        throw 0;
1026:    v7.t.a(new com.google.android.finsky.bs.b(v7.b, v7, new com.google.android.finsky.application.w(v7)));
1051:    v7.t.a(new com.google.android.finsky.cm.a(new com.google.android.finsky.application.x(v7), new com.google.android.finsky.application.y(v7), new com.google.android.finsky.application.z(v7)));
1062:    v7.t.a((com.google.android.finsky.cn.a.a)v7.L());
1090:    v7.t.a(new com.google.android.finsky.dc.a(v7.bi(), v7.b.getPackageName(), v7.dc(), v7.dj()));
1104:    if (!v7.dj().a(12634957))
1117:        v7.t.a(new com.google.android.finsky.scheduler.bm(v7.dB()));
1131:    if (!v7.dj().a(12625103) && v7.bG().a())
1152:        v7.t.a(new com.google.android.finsky.instantapps.l(v7.b));
1166:    if (v7.dj().a(12642495) && v7.P().h != 0)
1201:        v7.t.a(new com.google.android.finsky.n.a(v7.b, v7.L(), v7.P(), v7.dD(), v7.dy()));
1213:    v7.dy().post(new com.google.android.finsky.application.dl(v7));
1227:    if (v7.dj().a(12616559)) {
1231:        if (v7.av == 0) {
1237:            if (v7 == 0)
1240:                throw 0;
1249:            v7.av = new com.google.android.finsky.ds.a(v7.b, v7, new com.google.android.finsky.application.by(v7));
            }
1262:        v7.av.a.registerReceiver(v7.av, new IntentFilter("com.google.android.libraries.kids.supervision.apps.APP_STATE_CHANGED"));
1265:        v2 = v7.g();
1271:        v2.a.clear();
1280:        if (!v2.e.c())
1287:            FinskyLog.a("Not a unicorn device", new Object[0]);
            else
1334:            new com.google.android.finsky.ds.c(v2).execute(new Void[0]);
        }
1304:    if (!((Boolean)com.google.android.finsky.aa.o.f.a()).booleanValue())
1311:        new BackupManager(v7.b).dataChanged();
1322:    if (v7 == 0)
1325:        throw 0;
1342:    DownloadBroadcastReceiver.a(v7.w(), v7.bo(), v7, v7.bK());
1356:    if (v7.dj().a(12637218) && v7.P().i != 0)
1367:        v17 = 1;
        else
1690:        v17 = 0;
1369:    if (v17 == 0 && ((Boolean)com.google.android.finsky.aa.b.fK.b()).booleanValue()) {
1389:        v2 = new HandlerThread("NetworkQualityQueryThread");
1392:        v2.start();
1401:        v3 = new Handler(v2.getLooper());
1415:        if (v7.dj().a(12627889))
1428:            v7.w().a(new com.google.android.finsky.bk.d(v7.b, v3));
            else
1705:            v7.w().a(new com.google.android.finsky.bk.h(v7.b, v3));
        }
1441:    v8 = v7.dj();
1453:    v2 = ((Long)com.google.android.finsky.aa.a.al.a()).longValue();
1461:    if (v2 < 0) {
1471:        com.google.android.finsky.utils.bb.a(new com.google.android.finsky.application.cr(v7), new Void[0]);
1482:        v2 = ((Integer)com.google.android.finsky.aa.b.e.b()).intValue();
        }
        else {
1724:        if ((float)v2 / 1149239296 / 1149239296 / 1149239296 < 1082130432)
1726:            v2 = 1101004800;
1804:        else if ((float)v2 / 1149239296 / 1149239296 / 1149239296 < 1090519040)
1806:            v2 = 1112014848;
1813:        else if ((float)v2 / 1149239296 / 1149239296 / 1149239296 < 1107296256)
1815:            v2 = 1117782016;
            else
1818:            v2 = 1120403456;
1748:        v3 = (float)Math.max(v7.av().b(), v7.av().c());
1760:        if (v8.a(12603118))
1765:            v3 = v2 * v3 / 1156579328 * 1056964608;
1828:        else if (v8.a(12603119))
1833:            v3 = v2 * v3 / 1156579328 * 1061158912;
1842:        else if (v8.a(12603120))
1847:            v3 = v2 * v3 / 1156579328 * 1065353216;
1856:        else if (v8.a(12603121))
1861:            v3 = v2 * v3 / 1156579328 * 1067450368;
1870:        else if (v8.a(12603122))
1875:            v3 = v2 * v3 / 1156579328 * 1069547520;
            else
1890:            v3 = (float)((Integer)com.google.android.finsky.aa.b.e.b()).intValue();
1773:        if (v8.a(12627544))
1787:            v2 = (float)((Integer)com.google.android.finsky.aa.b.g.b()).intValue();
            else
1892:            v2 = 0;
1794:        if (v3 - v2 > 1125515264)
1796:            v2 = 150;
1898:        else if (v3 - v2 < 1082130432)
1900:            v2 = 4;
            else
1903:            v2 = (int)(v3 - v2);
        }
1497:    v7.k = new com.google.android.finsky.volley.c(v7.g("images"), (int)com.google.android.finsky.utils.an.g.a((long)v2), 0, 0);
1510:    if (!v7.dj().a(12613073)) {
1512:        v7.bm();
1515:        v7.be();
        }
1538:    v7.aW().a(v7.L().a(v7.b.getPackageName()).d);
1547:    if (!TextUtils.isEmpty(v14.j)) {
1561:        v3 = new com.google.android.finsky.d.c(7).f(v14.k).a;
1563:        v3.c(v14.j);
1568:        v2 = 0;
1580:        if (v7.dj().a(12635440) && v7.dj().a(12635488) && v14.l != 0) {
1601:            v2 = com.google.android.play.a.r.a().b();
1609:            v2.b(v14.l.booleanValue());
            }
1618:        switch (v14.d) {
                case 1:
1906:                v4 = v14.n;
2949:                break;
                case 2:
1910:                v4 = v14.o;
2949:                break;
                default:
1621:                v4 = -1;
2949:                break;
            }
1623:        v7.dc().a(v3, v2, v4);
        }
1636:    v7.bx = new SearchRecentSuggestions(v7.b, "com.google.android.finsky.RecentSuggestionsProvider", 3);
1645:    v7.ag = new com.google.android.finsky.dw.c(v7.b);
1651:    if (android.support.v4.os.a.b())
1657:        v7.r().d();
1660:    v7.dg();
1663:    v7.df();
1672:    if (com.google.android.finsky.as.a.b(v7.b))
1680:        com.google.android.finsky.ec.a.a(v7.b).a();
1685:    if (v7 != 0) {
1916:        if (v7.y == 0) {
1924:            if (v7 == 0)
1927:                throw 0;
1931:            v7.y = new com.google.android.finsky.preregistration.e(v7.aR());
            }
1955:        v7.cQ();
1962:        v7.aq = new com.google.android.finsky.preregistration.g(v7, v7.y, v7, v7.aK(), v7.ah(), v7.ai(), v7.L(), v7.au());
1975:        if (!v7.dj().a(12625988)) {
1977:            v7.c();
1980:            v7.I();
            }
1985:        if (v7 == 0)
1988:            throw 0;
2014:        if (v7 == 0)
2017:            throw 0;
2023:        v7.ad = new com.google.android.finsky.l.c(v7, v7.Y, v7.L(), v7.dz(), v7.dA(), Build.FINGERPRINT, 0, v7.aK(), v7.aR(), v7);
2025:        v2 = v7.cA();
2036:        v2.b.a(new com.google.android.finsky.ac.h(v2));
2046:        v2.d.a(new com.google.android.finsky.ac.i(v2));
2060:        if (!v7.dj().a(12625988)) {
2062:            v7.p();
2065:            v7.a();
            }
2079:        if (!v7.dj().a(12625988))
2081:            v7.dp();
            else
2322:            v7.dz().postDelayed(new com.google.android.finsky.application.cj(v7), (long)(((Integer)com.google.android.finsky.aa.b.gG.b()).intValue() * 1));
2090:        if (!com.google.android.finsky.as.a.b(v7.b) && !com.google.android.finsky.as.a.a(v7.b) && !com.google.android.finsky.as.a.d(v7.b)) {
2114:            if (v7.aK == 0)
2121:                v7.aK = new com.google.android.finsky.wear.af();
2125:            v7.m().a(v7.aK);
2139:            if ((v7.dj().a(12636767)) || v7.dj().a(12637792))
2176:                v7.dy().postDelayed(new com.google.android.finsky.application.ck(v7), (long)((Integer)com.google.android.finsky.aa.b.gG.b()).intValue());
                else
2329:                WearSupportService.a(v7.b);
            }
2190:        if (!v7.dj().a(12625988))
2192:            v7.b();
2206:        if (!v7.dj().a(12639920))
2208:            v7.cr();
2231:        new com.google.android.finsky.du.a(v7.b, new com.google.android.finsky.application.e(v7), new com.google.android.finsky.application.f(v7), v7.t, v7.bH());
2265:        new com.google.android.finsky.du.d(v7.b, new com.google.android.finsky.application.q(v7), new com.google.android.finsky.application.ab(v7), new com.google.android.finsky.application.am(v7), new com.google.android.finsky.application.ax(v7), new com.google.android.finsky.application.bi(v7), v7.t);
2276:        if (!v7.O().d())
2280:            com.google.android.finsky.activities.t.a(v7.b);
2288:        com.google.android.play.utils.f.a = new com.google.android.finsky.application.cl();
2290:        if (v17 == 0) {
2294:            if (v7 == 0)
2297:                throw 0;
2337:            v7.aO = new com.google.android.finsky.cg.d(v7);
2344:            com.google.android.play.utils.c.d.a = new com.google.android.finsky.application.cm(v7);
            }
2354:        v2 = com.google.android.finsky.m.a.b.getResources().getDisplayMetrics();
2362:        if (v2.densityDpi <= 325)
2364:            v2 = 1065353216;
            else
2688:            v2 = 1134723072 / (float)v2.densityDpi;
2375:        com.google.android.play.image.bp.a().d = new com.google.android.finsky.application.df(v2);
2377:        v7.ae();
2395:        v7.l = new com.google.android.finsky.cb.a(new com.google.android.finsky.application.bt(v7), new com.google.android.finsky.application.ce(v7));
2401:        v7.b.registerComponentCallbacks(v7.l);
2415:        if (!v7.dj().a(12633506))
2439:            v7.h = new com.google.android.finsky.dfemodel.b(new Handler(Looper.getMainLooper()), v7.ap(), v7.aK());
            else
2701:            com.google.android.finsky.utils.e.a(new com.google.android.finsky.application.cn(v7)).start();
2475:        v16 = new com.google.android.finsky.application.l;
2479:        v16.<init>(v7);
2482:        v17 = new com.google.android.finsky.application.m;
2486:        v17.<init>(v7);
2489:        v18 = new com.google.android.finsky.application.n;
2493:        v18.<init>(v7);
2496:        v19 = new com.google.android.finsky.application.o;
2500:        v19.<init>(v7);
2503:        v20 = new com.google.android.finsky.application.p;
2507:        v20.<init>(v7);
2510:        v21 = new com.google.android.finsky.application.r;
2514:        v21.<init>(v7);
2517:        v22 = new com.google.android.finsky.application.s;
2521:        v22.<init>(v7);
2524:        v23 = new com.google.android.finsky.application.t;
2528:        v23.<init>(v7);
2531:        v24 = new com.google.android.finsky.application.u;
2535:        v24.<init>(v7);
2541:        com.google.android.libraries.play.entertainment.a.a(new com.google.android.finsky.entertainment.m(v7.b, new com.google.android.finsky.application.ch(v7), new com.google.android.finsky.application.g(v7), new com.google.android.finsky.application.h(v7), new com.google.android.finsky.application.i(v7), new com.google.android.finsky.application.j(v7), new com.google.android.finsky.application.k(v7), v16, v17, v18, v19, v20, v21, v22, v23, v24));
2544:        v7.ay();
2559:        if (((Boolean)com.google.android.finsky.aa.b.cr.b()).booleanValue())
2567:            v7.bp().c(v7.b);
2576:        v3 = v7.L().a("com.google.android.finsky");
2580:        if (v3 != 0) {
2582:            try {
2584:                v2 = v7.b.getPackageManager();
2595:                if (v2.getApplicationEnabledSetting("com.google.android.finsky") != 2)
2601:                    v2.setApplicationEnabledSetting("com.google.android.finsky", 2, 1);
                }
                catch (SecurityException ex) {
2712:                FinskyLog.c("Unable to disable old finsky package.", new Object[0]);
                }
2612:            v10 = ((Integer)com.google.android.finsky.aa.b.V.b()).intValue();
2618:            if (v3.d < v10) {
2623:                v4 = new Object[2];
2632:                v4[0] = Integer.valueOf(v3.d);
2639:                v4[1] = Integer.valueOf(v10);
2641:                FinskyLog.a("Updating com.google.android.finsky from %d to %d", v4);
2650:                v2 = v7.U().e();
2654:                if (v2 == 0)
2661:                    FinskyLog.c("No current account", new Object[0]);
                    else {
2718:                    v7.I.a("com.google.android.finsky");
2726:                    v7.I.a("com.google.android.finsky", 0, 0, 0);
2752:                    v7.I.a("com.google.android.finsky", v10, v2.name, v7.a(2131951702), 3, 0, v7.aR().a("suicidal_tabsky"));
                    }
                }
            }
2675:        com.google.android.finsky.d.j.a(v7.dj().a(12606765));
2678:        if (v7 == 0)
2681:            throw 0;
2756:        com.google.android.finsky.bg.h.c = v7;
2762:        if (v7 == 0)
2765:            throw 0;
2766:        v2 = new com.google.android.finsky.inlinedetails.d(v7.b, v7);
2769:        v2.a();
2776:        v7.dj().a(v2);
2785:        v2 = new com.google.android.finsky.instantappsquickinstall.c(v7.b, v7, v7.r);
2788:        v2.a();
2795:        v7.dj().a(v2);
2809:        if (v7.dj().a(12639920))
2820:            v7.dy().post(new com.google.android.finsky.application.co(v7));
2835:        if ((((Boolean)com.google.android.finsky.aa.b.bC.b()).booleanValue()) || v7.dj().a(12640993))
2872:            v7.dy().postDelayed(new com.google.android.finsky.application.cp(v7), (long)((Integer)com.google.android.finsky.aa.b.gG.b()).intValue());
2875:        v7.dq();
2886:        v7.aP().a(v7.r, 1701);
2900:        if (!v7.dj().a(12626588))
2929:            new Handler(Looper.getMainLooper()).postDelayed(new com.google.android.finsky.application.de(v7), (long)((Integer)com.google.android.finsky.aa.b.gK.b()).intValue());
2936:        if (com.google.android.finsky.d.ae.a(v7))
2938:            v7.cv();
2941:        return;
        }
1688:    throw 0;
2943:    try
            run 972...983
        catch (Throwable ex) {
972:        goto 981;
        }
2944:    try
            run 594...616
        catch (Throwable ex) {
594:        goto 981;
        }
    }

    public void setTheme(int p0) {
        super.setTheme(p0);
        com.google.b.a.a.a.a.a.c.a(this, p0);
    }

}
