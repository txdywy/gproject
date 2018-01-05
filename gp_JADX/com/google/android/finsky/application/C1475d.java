package com.google.android.finsky.application;

import android.accounts.Account;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Application;
import android.app.admin.DevicePolicyManager;
import android.app.backup.BackupManager;
import android.app.usage.NetworkStatsManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.provider.SearchRecentSuggestions;
import android.support.v4.os.C0327a;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.android.volley.C0659a;
import com.android.volley.C0663k;
import com.android.volley.C0700r;
import com.android.volley.p060a.C0653p;
import com.android.volley.p060a.C0662b;
import com.android.volley.p060a.C0664e;
import com.android.volley.p060a.C0665f;
import com.android.volley.p060a.ae;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.DfeNotificationManagerImpl;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.ac.C0977e;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.accounts.impl.AccountsChangedReceiver;
import com.google.android.finsky.accounts.impl.C0991a;
import com.google.android.finsky.actionbuttons.C0997b;
import com.google.android.finsky.actionbuttons.C1011h;
import com.google.android.finsky.actionbuttons.C1013j;
import com.google.android.finsky.activities.inlineappinstaller.p119a.C1084g;
import com.google.android.finsky.ad.C1136a;
import com.google.android.finsky.ae.C1182a;
import com.google.android.finsky.af.C1184a;
import com.google.android.finsky.ag.C1185a;
import com.google.android.finsky.ah.C1186a;
import com.google.android.finsky.aj.C1190a;
import com.google.android.finsky.aj.C1195g;
import com.google.android.finsky.aj.C1196f;
import com.google.android.finsky.aj.C1197h;
import com.google.android.finsky.ak.C1203f;
import com.google.android.finsky.ak.C1204g;
import com.google.android.finsky.al.C1219c;
import com.google.android.finsky.ao.C1237a;
import com.google.android.finsky.ap.C1249a;
import com.google.android.finsky.api.C0947i;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1280a;
import com.google.android.finsky.api.C1285f;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.api.C1288k;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.api.C1295r;
import com.google.android.finsky.api.C1301y;
import com.google.android.finsky.api.p125a.C1251b;
import com.google.android.finsky.api.p125a.C1256d;
import com.google.android.finsky.api.p126b.C1281a;
import com.google.android.finsky.aq.C1500a;
import com.google.android.finsky.aq.C1501b;
import com.google.android.finsky.ar.C1502a;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.as.C1504b;
import com.google.android.finsky.as.C1506e;
import com.google.android.finsky.av.C1527a;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.az.C1535a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1549f;
import com.google.android.finsky.ba.C1550a;
import com.google.android.finsky.ba.C1552e;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.ba.p129a.C1551a;
import com.google.android.finsky.ba.p129a.C1553c;
import com.google.android.finsky.ba.p129a.C1555e;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bb.p149a.C1558a;
import com.google.android.finsky.bb.p149a.C1560c;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1606f;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.bg.C1609i;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bh.C1626a;
import com.google.android.finsky.bh.C1627b;
import com.google.android.finsky.billing.common.C1790e;
import com.google.android.finsky.billing.common.C1793i;
import com.google.android.finsky.billing.common.C1797m;
import com.google.android.finsky.billing.common.C1801q;
import com.google.android.finsky.billing.common.C1803u;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.billing.iab.C1865u;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.billing.iab.C1869y;
import com.google.android.finsky.billing.iab.C1870z;
import com.google.android.finsky.billing.p120d.C1805b;
import com.google.android.finsky.billing.p120d.p157a.C1806a;
import com.google.android.finsky.billing.p131e.C1821j;
import com.google.android.finsky.billing.p151a.C1648a;
import com.google.android.finsky.billing.p151a.C1655h;
import com.google.android.finsky.billing.p151a.C1661n;
import com.google.android.finsky.billing.profile.C2063t;
import com.google.android.finsky.billing.profile.C2067x;
import com.google.android.finsky.billing.redeem.C2095i;
import com.google.android.finsky.billing.storedvalue.C2098b;
import com.google.android.finsky.bj.C2104b;
import com.google.android.finsky.bl.C2116a;
import com.google.android.finsky.bm.C2119c;
import com.google.android.finsky.bm.C2123g;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2128a;
import com.google.android.finsky.bn.C2132f;
import com.google.android.finsky.bn.C2134h;
import com.google.android.finsky.bo.C2153a;
import com.google.android.finsky.boothandler.BootCompletedReceiver;
import com.google.android.finsky.bp.C2155a;
import com.google.android.finsky.br.C2162a;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.br.C2174c;
import com.google.android.finsky.br.p166a.C2163a;
import com.google.android.finsky.br.p166a.C2172i;
import com.google.android.finsky.br.p166a.C2175k;
import com.google.android.finsky.bt.C2180a;
import com.google.android.finsky.bu.C2181b;
import com.google.android.finsky.bu.C2186a;
import com.google.android.finsky.bu.p168a.C2183a;
import com.google.android.finsky.bu.p168a.C2187d;
import com.google.android.finsky.bv.C2189a;
import com.google.android.finsky.bw.C2193a;
import com.google.android.finsky.bx.C1459b;
import com.google.android.finsky.bx.C2195a;
import com.google.android.finsky.by.C2199l;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2215k;
import com.google.android.finsky.by.C2233o;
import com.google.android.finsky.by.p132a.C2207f;
import com.google.android.finsky.by.p132a.C2216o;
import com.google.android.finsky.bz.C2241g;
import com.google.android.finsky.ca.C2249a;
import com.google.android.finsky.ca.C2251c;
import com.google.android.finsky.cb.C2256a;
import com.google.android.finsky.cc.C2257a;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cf.C2272b;
import com.google.android.finsky.cf.p116a.C2271f;
import com.google.android.finsky.cg.C2274a;
import com.google.android.finsky.cg.C2276c;
import com.google.android.finsky.cg.C2277d;
import com.google.android.finsky.cg.C2279g;
import com.google.android.finsky.ck.C2287a;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cl.C2289a;
import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.cm.C2298e;
import com.google.android.finsky.cm.C2318y;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.cn.p175a.C2321a;
import com.google.android.finsky.co.C2323a;
import com.google.android.finsky.cp.C2358a;
import com.google.android.finsky.cq.C2360a;
import com.google.android.finsky.cq.C2363d;
import com.google.android.finsky.cs.C2376e;
import com.google.android.finsky.cs.p135a.C2403m;
import com.google.android.finsky.cs.p135a.p136a.C2379d;
import com.google.android.finsky.ct.C2412a;
import com.google.android.finsky.cw.C2456c;
import com.google.android.finsky.cw.C2457d;
import com.google.android.finsky.cx.C2460b;
import com.google.android.finsky.cy.C2466b;
import com.google.android.finsky.cz.C2467a;
import com.google.android.finsky.datasync.C2531s;
import com.google.android.finsky.datasync.C2534x;
import com.google.android.finsky.db.C2537a;
import com.google.android.finsky.dc.C2556b;
import com.google.android.finsky.dc.C2557c;
import com.google.android.finsky.dc.C2561g;
import com.google.android.finsky.dc.p181a.C2544g;
import com.google.android.finsky.dc.p181a.C2546i;
import com.google.android.finsky.de.C2568a;
import com.google.android.finsky.detailscomponents.C2576a;
import com.google.android.finsky.detailscomponents.C2581g;
import com.google.android.finsky.detailscomponents.C2596w;
import com.google.android.finsky.detailspage.C2673u;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.deviceconfig.C2699l;
import com.google.android.finsky.deviceconfig.C2701n;
import com.google.android.finsky.dfemodel.C2713b;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dg.C2734a;
import com.google.android.finsky.dh.C2744a;
import com.google.android.finsky.dk.C2824a;
import com.google.android.finsky.dk.C2826c;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.dl.C2831a;
import com.google.android.finsky.dn.C2833a;
import com.google.android.finsky.download.C2838a;
import com.google.android.finsky.download.C2843f;
import com.google.android.finsky.download.C2850m;
import com.google.android.finsky.download.C2851n;
import com.google.android.finsky.download.C2863z;
import com.google.android.finsky.dp.C2864a;
import com.google.android.finsky.dp.C2866c;
import com.google.android.finsky.ds.C2884a;
import com.google.android.finsky.ds.C2885b;
import com.google.android.finsky.dt.C2887a;
import com.google.android.finsky.dt.C2888b;
import com.google.android.finsky.dt.C2889c;
import com.google.android.finsky.dv.C2906h;
import com.google.android.finsky.dw.C2909c;
import com.google.android.finsky.dx.C2910a;
import com.google.android.finsky.dx.C2913d;
import com.google.android.finsky.dy.ad;
import com.google.android.finsky.dy.ag;
import com.google.android.finsky.ec.C2969b;
import com.google.android.finsky.ec.C2970c;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.externalreferrer.C3009a;
import com.google.android.finsky.externalreferrer.C3011c;
import com.google.android.finsky.externalreferrer.C3012d;
import com.google.android.finsky.externalreferrer.C3018k;
import com.google.android.finsky.flushlogs.C3129a;
import com.google.android.finsky.foregroundcoordinator.ForegroundCoordinator;
import com.google.android.finsky.hygiene.C3178v;
import com.google.android.finsky.hygiene.p139a.C3176a;
import com.google.android.finsky.hygiene.p139a.C3177b;
import com.google.android.finsky.hygiene.p139a.C3179d;
import com.google.android.finsky.installapi.C3276k;
import com.google.android.finsky.installer.C3281b;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installer.C3322j;
import com.google.android.finsky.installer.p207a.C3282b;
import com.google.android.finsky.installer.p207a.C3297p;
import com.google.android.finsky.installer.p207a.C3301s;
import com.google.android.finsky.installer.p207a.ba;
import com.google.android.finsky.installqueue.C2465r;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.p141a.C3327a;
import com.google.android.finsky.installqueue.p141a.C3335g;
import com.google.android.finsky.installqueue.p141a.C3336h;
import com.google.android.finsky.installqueue.p141a.C3341j;
import com.google.android.finsky.installqueue.p141a.C3342k;
import com.google.android.finsky.instantapps.C3525k;
import com.google.android.finsky.instantappscompatibility.C3600b;
import com.google.android.finsky.layoutswitcher.C3736d;
import com.google.android.finsky.navigationmanager.C3752d;
import com.google.android.finsky.navigationmanager.p228a.C3753c;
import com.google.android.finsky.notification.ab;
import com.google.android.finsky.notification.impl.C3791f;
import com.google.android.finsky.notification.impl.C3803r;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p107l.C3648c;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p108z.C4817d;
import com.google.android.finsky.p108z.p266a.C4818g;
import com.google.android.finsky.p108z.p266a.C4829r;
import com.google.android.finsky.p110p.C3835a;
import com.google.android.finsky.p110p.C3837c;
import com.google.android.finsky.p111d.C1463g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2487n;
import com.google.android.finsky.p111d.C2492t;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p133c.C2243a;
import com.google.android.finsky.p133c.p134a.C2244a;
import com.google.android.finsky.p133c.p134a.C2247e;
import com.google.android.finsky.p140i.C3212a;
import com.google.android.finsky.p140i.C3216c;
import com.google.android.finsky.p140i.C3219f;
import com.google.android.finsky.p140i.p205a.C3213a;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.p148b.C1545i;
import com.google.android.finsky.p167r.C3951d;
import com.google.android.finsky.p167r.C3960a;
import com.google.android.finsky.p167r.p231a.C3952a;
import com.google.android.finsky.p186do.C2837a;
import com.google.android.finsky.p187g.C3151c;
import com.google.android.finsky.p187g.C3152a;
import com.google.android.finsky.p187g.C3154d;
import com.google.android.finsky.p189e.C2946a;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.p225k.C3640a;
import com.google.android.finsky.p226m.C3741b;
import com.google.android.finsky.p226m.C3744e;
import com.google.android.finsky.p227n.C3747c;
import com.google.android.finsky.p229o.C3827b;
import com.google.android.finsky.p229o.C3828c;
import com.google.android.finsky.p230q.C3950c;
import com.google.android.finsky.p232s.C4006e;
import com.google.android.finsky.p257t.C4562a;
import com.google.android.finsky.p264x.C4806a;
import com.google.android.finsky.p264x.p265a.C4807a;
import com.google.android.finsky.p2p.C3842a;
import com.google.android.finsky.p2p.FrostingUtil;
import com.google.android.finsky.packagemanager.C3849a;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.packagemanager.impl.C3852a;
import com.google.android.finsky.packagemanager.impl.PackageMonitorReceiverImpl.RegisteredReceiver;
import com.google.android.finsky.permissionui.C3879f;
import com.google.android.finsky.playcard.C3903c;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.cu;
import com.google.android.finsky.preregistration.C3932e;
import com.google.android.finsky.preregistration.C3934g;
import com.google.android.finsky.ratereview.C3963b;
import com.google.android.finsky.ratereview.C3964c;
import com.google.android.finsky.ratereview.C3974q;
import com.google.android.finsky.ratereview.C3981y;
import com.google.android.finsky.recoverymode.C3982a;
import com.google.android.finsky.recoverymode.impl.C3983a;
import com.google.android.finsky.scheduler.C4019a;
import com.google.android.finsky.scheduler.C4034h;
import com.google.android.finsky.scheduler.C4036k;
import com.google.android.finsky.scheduler.C4042t;
import com.google.android.finsky.scheduler.C4047y;
import com.google.android.finsky.scheduler.aa;
import com.google.android.finsky.scheduler.bb;
import com.google.android.finsky.scheduler.bn;
import com.google.android.finsky.setup.C4141c;
import com.google.android.finsky.setup.C4175h;
import com.google.android.finsky.setup.C4180m;
import com.google.android.finsky.setup.VpaService;
import com.google.android.finsky.setup.al;
import com.google.android.finsky.setup.am;
import com.google.android.finsky.setup.ao;
import com.google.android.finsky.setup.bo;
import com.google.android.finsky.setup.bs;
import com.google.android.finsky.setup.bt;
import com.google.android.finsky.setup.bv;
import com.google.android.finsky.setup.bw;
import com.google.android.finsky.setup.cs;
import com.google.android.finsky.setup.p240a.C4126m;
import com.google.android.finsky.setup.p242d.C4146c;
import com.google.android.finsky.setup.p242d.C4168h;
import com.google.android.finsky.setup.p242d.C4169i;
import com.google.android.finsky.setup.p242d.p244a.C4147d;
import com.google.android.finsky.setupwizardparams.SetupWizardParams;
import com.google.android.finsky.splitinstallservice.C4197a;
import com.google.android.finsky.splitinstallservice.C4203f;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.controllers.assist.security.SecurityUtils;
import com.google.android.finsky.stream.myapps.C4536c;
import com.google.android.finsky.stream.myapps.C4547l;
import com.google.android.finsky.stream.myapps.C4550p;
import com.google.android.finsky.stream.p248a.C4225f;
import com.google.android.finsky.stream.p248a.C4229a;
import com.google.android.finsky.stream.p248a.C4236d;
import com.google.android.finsky.stream.p248a.C4237g;
import com.google.android.finsky.stream.p248a.C4238h;
import com.google.android.finsky.stream.p248a.p249a.C4226a;
import com.google.android.finsky.stream.p251b.C4241a;
import com.google.android.finsky.tos.C4569e;
import com.google.android.finsky.uninstall.az;
import com.google.android.finsky.uninstall.v2a.C4632z;
import com.google.android.finsky.uninstall.v2a.UninstallManagerCleanupActivityV2a;
import com.google.android.finsky.updatechecker.C4640d;
import com.google.android.finsky.utils.C1474r;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4674e;
import com.google.android.finsky.utils.C4683n;
import com.google.android.finsky.utils.C4693y;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ai;
import com.google.android.finsky.utils.an;
import com.google.android.finsky.utils.p258b.C4670a;
import com.google.android.finsky.verifier.C4726d;
import com.google.android.finsky.volley.C4774e;
import com.google.android.finsky.volley.p263a.C4773a;
import com.google.android.finsky.volley.p263a.C4775b;
import com.google.android.finsky.wear.C4784e;
import com.google.android.finsky.wear.af;
import com.google.android.finsky.wear.ak;
import com.google.android.finsky.wear.ar;
import com.google.android.finsky.wear.bj;
import com.google.android.libraries.p326c.p327a.C5916a;
import com.google.android.libraries.performance.primes.cm;
import com.google.android.libraries.performance.primes.cr;
import com.google.android.libraries.performance.primes.ct;
import com.google.android.libraries.performance.primes.cw;
import com.google.android.libraries.performance.primes.cx;
import com.google.android.libraries.performance.primes.dn;
import com.google.android.libraries.performance.primes.dp;
import com.google.android.libraries.performance.primes.dt;
import com.google.android.libraries.performance.primes.ec;
import com.google.android.libraries.performance.primes.ed;
import com.google.android.play.dfe.api.C1460g;
import com.google.android.play.dfe.api.C6287d;
import com.google.android.play.dfe.api.C6288e;
import com.google.android.play.dfe.api.C6289f;
import com.google.android.play.image.C1294w;
import com.google.android.play.image.C6320d;
import com.google.android.play.image.by;
import com.google.android.play.p179a.C6235v;
import com.google.android.play.p179a.C6236x;
import com.google.android.play.utils.C6325i;
import com.google.android.play.utils.p354b.C6321a;
import com.google.android.play.utils.p354b.C6322j;
import com.google.android.volley.C6326k;
import com.google.android.volley.ok.C6327c;
import com.google.android.volley.ok.C6328g;
import com.google.android.volley.ok.C6329h;
import com.squareup.haha.perflib.io.MemoryMappedFileBuffer;
import com.squareup.leakcanary.C7582R;
import com.squareup.okhttp.internal.C6334k;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import p002a.C0002a;

public final class C1475d extends C1473m implements C1459b, C1474r {
    public static final Class[] f7982c = new Class[]{BootCompletedReceiver.class, RegisteredReceiver.class, AccountsChangedReceiver.class};
    public static final Object f7983d = new Object();
    public static final Object f7984e = new Object();
    public C3951d f7985A;
    public final Map f7986B = new HashMap();
    public C1460g f7987C;
    public final Map f7988D = new HashMap();
    public final Map f7989E = new HashMap();
    public final Map f7990F = new HashMap();
    public final Map f7991G = new HashMap();
    public C2946a f7992H;
    public C3300k f7993I;
    public C2153a f7994J;
    public ba f7995K;
    public C3340g f7996L;
    public C3322j f7997M;
    public C2266a f7998N;
    public C2271f f7999O;
    public C2272b f8000P;
    public C3736d f8001Q;
    public C2556b f8002R;
    public C2534x f8003S;
    public ab f8004T;
    public C3791f f8005U;
    public C2187d f8006V;
    public C2181b f8007W;
    public C2850m f8008X;
    public C2207f f8009Y;
    public C2199l f8010Z;
    public C2251c aA;
    public C3212a aB;
    public C3216c aC;
    public C1500a aD;
    public C1501b aE;
    public C1506e aF;
    public C1503a aG;
    public C1504b aH;
    public C2866c aI;
    public C4569e aJ;
    public af aK;
    public C1535a aL;
    public C4241a aM;
    public C2910a aN;
    public C2277d aO;
    public C3964c aP;
    public C3963b aQ;
    public C0986a aR;
    public C2721l aS;
    public C2492t aT;
    public C3151c aU;
    public C2889c aV;
    public C1821j aW;
    public C4726d aX;
    public ad aY;
    public ag aZ;
    public C2127b aa;
    public C1531a ab;
    public C3646a ac;
    public C3648c ad;
    public C0947i ae;
    public C2320a af;
    public C2909c ag;
    public Map ah = new HashMap();
    public C2243a ai;
    public C2699l aj;
    public C3012d ak;
    public C3011c al;
    public C3018k am;
    public C1545i an;
    public C1542f ao;
    public C2412a ap;
    public C3934g aq;
    public C2457d ar;
    public C2456c as;
    public C3752d at;
    public C2885b au;
    public C2884a av;
    public ac aw;
    public C1550a ax;
    public C2376e ay;
    public C2833a az;
    public String bA;
    public HandlerThread bB;
    public Handler bC;
    public Handler bD;
    public HandlerThread bE;
    public Handler bF;
    public Handler bG;
    public C1289l bH;
    public C1556d bI;
    public C1612l bJ;
    public C2104b bK;
    public C1611k bL;
    public C1084g bM;
    public C2287a bN;
    public C2274a bO;
    public C2063t bP;
    public C1865u bQ;
    public C1867w bR;
    public C1793i bS;
    public C1797m bT;
    public C2067x bU;
    public C1869y bV;
    public C1801q bW;
    public C2744a bX;
    public C2837a bY;
    public C1804v bZ;
    public C3129a ba;
    public C1557b bb;
    public C3981y bc;
    public C1560c bd;
    public C2174c be;
    public C2180a bf;
    public C3982a bg;
    public C2119c bh;
    public C2123g bi;
    public C3741b bj;
    public C3744e bk;
    public C3837c bl;
    public C2596w bm;
    public C3835a bn;
    public C3009a bo;
    public C1136a bp;
    public C4784e bq;
    public ak br;
    public bj bs;
    public ar bt;
    public C4197a bu;
    public C4203f bv;
    public com.google.android.finsky.splitinstallservice.ar bw;
    public SearchRecentSuggestions bx;
    public int by;
    public int bz;
    public C2323a cA;
    public C2906h cB;
    public ForegroundCoordinator cC;
    public ai cD;
    public C2824a cE;
    public C2830g cF;
    public C4640d cG;
    public C2460b cH;
    public C2568a cI;
    public C2537a cJ;
    public C4562a cK;
    public C2155a cL;
    public C1805b cM;
    public C3600b cN;
    public C2241g cO;
    public C2734a cP;
    public com.google.android.finsky.bg.af cQ;
    public C1249a cR;
    public C0997b cS;
    public C1013j cT;
    public C1011h cU;
    public C2116a cV;
    public C2296c cW;
    public C3879f cX;
    public Executor cY;
    public C1203f cZ;
    public com.google.android.finsky.stream.myapps.ab ca;
    public C2288b cb;
    public C2233o cc;
    public C3950c cd;
    public C1803u ce;
    public C2974a cf;
    public C1452c cg;
    public C2471a ch;
    public bs ci;
    public C2531s cj;
    public C2363d ck;
    public C2360a cl;
    public C3178v cm;
    public C1790e cn;
    public C4683n co;
    public C1219c cp;
    public C2162a cq;
    public C2171b cr;
    public C3849a cs;
    public C1182a ct;
    public C2701n cu;
    public C2864a cv;
    public C3027b cw;
    public C3028c cx;
    public C4806a cy;
    public C2289a cz;
    public C4254d dA;
    public C1606f dB;
    public C3281b dC;
    public C3747c dD;
    public C3640a dE;
    public C1190a dF;
    public C1195g dG;
    public C1661n dH;
    public C1648a dI;
    public C1655h dJ;
    public C4536c dK;
    public C4693y dL;
    public C3960a dM;
    public C4550p dN;
    public C3827b dO;
    public C4547l dP;
    public C3828c dQ;
    public C3842a dR;
    public FrostingUtil dS;
    public C4141c dT;
    public C0977e dU;
    public C2673u dV;
    public C3903c dW;
    public C4180m dX;
    public C4175h dY;
    public ao dZ;
    public C4817d da;
    public bb db;
    public com.google.android.finsky.scheduler.ak dc;
    public aa dd;
    public bn de;
    public C2467a df;
    public C2544g dg;
    public C2546i dh;
    public C3219f di;
    public C4238h dj;
    public C1627b dk;
    public C2576a dl;
    public C4774e dm;
    public C2581g dn;
    public C2831a f8011do;
    public C2189a dp;
    public SecurityUtils dq;
    public C2826c dr;
    public C4229a ds;
    public C4236d dt;
    public C4225f du;
    public C4237g dv;
    public com.google.android.finsky.stream.controllers.assist.security.ad dw;
    public com.google.android.finsky.stream.myapps.aa dx;
    public com.google.android.finsky.playcard.ao dy;
    public C1502a dz;
    public com.google.android.finsky.setup.af ea;
    public C4146c eb;
    public C4168h ec;
    public al ed;
    public bw ee;
    public com.google.android.finsky.setup.bn ef;
    public C4126m eg;
    public C2969b eh;
    public C2969b ei;
    public C2257a ej;
    public C1184a ek;
    public C1237a el;
    public C1600a em;
    public cu en;
    public C4006e eo;
    public C0700r f8012f;
    public C0659a f8013g;
    public C2713b f8014h;
    public C1294w f8015i;
    public C0700r f8016j;
    public C0659a f8017k;
    public C2256a f8018l;
    public DfeToc f8019m;
    public C1527a f8020n;
    public C2838a f8021o;
    public Account f8022p;
    public Account f8023q;
    public C2495w f8024r;
    public C2487n f8025s;
    public C3851f f8026t;
    public final Map f8027u = new HashMap();
    public final Map f8028v = new HashMap();
    public C1287h f8029w;
    public C1288k f8030x;
    public C3932e f8031y;
    public C1254c f8032z;

    public C1475d(Application application) {
        super(application);
    }

    public final void mo2053a(int i, int i2) {
        m8614a(bl(), i);
        if (!dj().mo2294a(12639221)) {
            be().mo1673a(i2);
        }
    }

    public final void mo2056a(C0700r c0700r) {
        m8614a(c0700r, c0700r.f4180a.incrementAndGet());
    }

    private final void m8614a(C0700r c0700r, int i) {
        c0700r.m4512a(new ci(this, i));
    }

    public final int bh() {
        return this.by;
    }

    static void m8615a(dm dmVar, C1459b c1459b) {
        C2195a.f10984a.f10986b.add(c1459b);
        dmVar.mo1692a();
    }

    public final C2837a mo2042V() {
        if (this.bY == null) {
            this.bY = new C2837a(this.f7981b);
        }
        return this.bY;
    }

    public final C1804v ab() {
        if (this.bZ == null) {
            this.bZ = new C1804v(mo2045Y());
        }
        return this.bZ;
    }

    public final com.google.android.finsky.stream.myapps.ab mo2043W() {
        if (this.ca == null) {
            C2320a L = mo2032L();
            mo2223d();
            this.ca = new com.google.android.finsky.stream.myapps.ab(L);
        }
        return this.ca;
    }

    public final C2288b mo2044X() {
        if (this.cb == null) {
            if (this == null) {
                throw null;
            }
            this.cb = new C2288b(this, mo2045Y());
        }
        return this.cb;
    }

    public final C2233o mo2045Y() {
        if (this.cc == null) {
            this.cc = new C2233o(ah());
        }
        return this.cc;
    }

    public final C3950c mo2046Z() {
        if (this.cd == null) {
            mo2033M();
            this.cd = new C3950c();
        }
        return this.cd;
    }

    public final C1289l aM() {
        if (this.bH == null) {
            if (this == null) {
                throw null;
            }
            this.bH = new C1289l(this, aK(), mo2035O(), mo2041U());
        }
        return this.bH;
    }

    final int de() {
        int intValue;
        if (dj().mo2294a(12627544)) {
            intValue = ((Integer) C0955b.f5889f.m28964b()).intValue();
        } else {
            intValue = 0;
        }
        return ((Integer) C0955b.f5886d.m28964b()).intValue() + intValue;
    }

    public final synchronized C2251c mo2048a() {
        if (this.aA == null) {
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) m8581a("device_policy");
            Context context = this.f7981b;
            C2127b c = mo2169c();
            if (this == null) {
                throw null;
            }
            C2249a c2249a = new C2249a(devicePolicyManager, context, c, this);
            C2206c ah = ah();
            C3646a I = mo2029I();
            C1287h aK = aK();
            C2127b c2 = mo2169c();
            ForegroundCoordinator bz = bz();
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.aA = new C2251c(ah, I, aK, c2, c2249a, bz, this, this);
            }
        }
        return this.aA;
    }

    public final synchronized C1535a mo2022B() {
        if (this.aL == null) {
            this.aL = new C1535a(bk());
        }
        return this.aL;
    }

    final void df() {
        com.google.android.finsky.by.p132a.al alVar = new com.google.android.finsky.by.p132a.al(this.f7981b);
        if (this.bC == null) {
            this.bC = new Handler(dK().getLooper());
        }
        Handler handler = this.bC;
        if (this == null) {
            throw null;
        }
        this.f8009Y = new C2207f(this, alVar, new Handler(Looper.getMainLooper()), handler);
        this.f8010Z = new com.google.android.finsky.by.p132a.ab(aK(), alVar, this.f8009Y, dz(), handler, ((Boolean) C0955b.f5891h.m28964b()).booleanValue());
        this.f8009Y.mo2814a(new ct(this));
        this.f8009Y.mo2815a(null);
    }

    final void dg() {
        PackageManager packageManager = this.f7981b.getPackageManager();
        for (Class componentName : f7982c) {
            try {
                ComponentName componentName2 = new ComponentName(this.f7981b, componentName);
                if (packageManager.getComponentEnabledSetting(componentName2) != 1) {
                    packageManager.setComponentEnabledSetting(componentName2, 1, 1);
                }
            } catch (SecurityException e) {
                FinskyLog.m21669e("Unable to enable %s", componentName.getSimpleName());
            }
        }
    }

    final File m8673g(String str) {
        return new File(this.f7981b.getCacheDir(), str);
    }

    final C0663k dh() {
        return new C0664e(dF(), new C0665f((int) an.f24038a.mo4320a((long) ((Integer) C0955b.f5879W.m28964b()).intValue(), an.f24043f)));
    }

    private final C0653p dF() {
        boolean z;
        com.squareup.okhttp.ad adVar;
        List a;
        C1552e dj = dj();
        if (!((Boolean) C0955b.eG.m28964b()).booleanValue() || !dj().mo2294a(12609472)) {
            z = false;
        } else if (((Boolean) C0955b.eH.m28964b()).booleanValue()) {
            z = true;
        } else {
            z = C1503a.m8829a();
        }
        if (z) {
            boolean z2;
            if (((Boolean) C0955b.gr.m28964b()).booleanValue() && dj.mo2294a(12628174)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!((Boolean) C0955b.gq.m28964b()).booleanValue() || dj.mo2294a(12630389)) {
                z = false;
            } else {
                z = true;
            }
            try {
                return new C4670a(this.f7981b, new C6328g(this.f7981b), z2, z);
            } catch (UnsatisfiedLinkError e) {
                FinskyLog.m21667d("Cronet native library failed to load; Possible ABI mismatch.", new Object[0]);
                dc().m13319a(new C2474c(569).f13342a, null);
                if (!!mo2035O().m8839b()) {
                }
                adVar = new com.squareup.okhttp.ad();
                a = C6334k.m29028a(Arrays.asList(new com.squareup.okhttp.af[]{com.squareup.okhttp.af.HTTP_1_1, com.squareup.okhttp.af.SPDY_3}));
                if (a.contains(com.squareup.okhttp.af.HTTP_1_1)) {
                    throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + a);
                } else if (!a.contains(com.squareup.okhttp.af.HTTP_1_0)) {
                    throw new IllegalArgumentException("protocols must not contain http/1.0: " + a);
                } else if (a.contains(null)) {
                    adVar.f31791g = C6334k.m29028a(a);
                    adVar.f31807w = false;
                    if (((Boolean) C0955b.hH.m28964b()).booleanValue()) {
                        adVar.f31794j.add(new C1281a());
                    }
                    if (dj.mo2294a(12614972)) {
                        return new C6327c(this.f7981b, adVar, new C6328g(this.f7981b), ((Boolean) C0955b.f5864H.m28964b()).booleanValue());
                    }
                    return new C6329h(this.f7981b, adVar, new C6328g(this.f7981b), ((Boolean) C0955b.f5864H.m28964b()).booleanValue());
                } else {
                    throw new IllegalArgumentException("protocols must not contain null");
                }
            } catch (Exception e2) {
                FinskyLog.m21667d("Cronet native library failed to load; Possible ABI mismatch.", new Object[0]);
                dc().m13319a(new C2474c(569).f13342a, null);
                if (!mo2035O().m8839b()) {
                }
                adVar = new com.squareup.okhttp.ad();
                a = C6334k.m29028a(Arrays.asList(new com.squareup.okhttp.af[]{com.squareup.okhttp.af.HTTP_1_1, com.squareup.okhttp.af.SPDY_3}));
                if (a.contains(com.squareup.okhttp.af.HTTP_1_1)) {
                    throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + a);
                } else if (!a.contains(com.squareup.okhttp.af.HTTP_1_0)) {
                    throw new IllegalArgumentException("protocols must not contain http/1.0: " + a);
                } else if (a.contains(null)) {
                    throw new IllegalArgumentException("protocols must not contain null");
                } else {
                    adVar.f31791g = C6334k.m29028a(a);
                    adVar.f31807w = false;
                    if (((Boolean) C0955b.hH.m28964b()).booleanValue()) {
                        adVar.f31794j.add(new C1281a());
                    }
                    if (dj.mo2294a(12614972)) {
                        return new C6329h(this.f7981b, adVar, new C6328g(this.f7981b), ((Boolean) C0955b.f5864H.m28964b()).booleanValue());
                    }
                    return new C6327c(this.f7981b, adVar, new C6328g(this.f7981b), ((Boolean) C0955b.f5864H.m28964b()).booleanValue());
                }
            }
        }
        if (!mo2035O().m8839b() && !mo2035O().m8842e() && !((Boolean) C0955b.eF.m28964b()).booleanValue()) {
            return new C6326k(this.f7981b, ((Boolean) C0955b.f5864H.m28964b()).booleanValue());
        }
        adVar = new com.squareup.okhttp.ad();
        a = C6334k.m29028a(Arrays.asList(new com.squareup.okhttp.af[]{com.squareup.okhttp.af.HTTP_1_1, com.squareup.okhttp.af.SPDY_3}));
        if (a.contains(com.squareup.okhttp.af.HTTP_1_1)) {
            throw new IllegalArgumentException("protocols doesn't contain http/1.1: " + a);
        } else if (!a.contains(com.squareup.okhttp.af.HTTP_1_0)) {
            throw new IllegalArgumentException("protocols must not contain http/1.0: " + a);
        } else if (a.contains(null)) {
            throw new IllegalArgumentException("protocols must not contain null");
        } else {
            adVar.f31791g = C6334k.m29028a(a);
            adVar.f31807w = false;
            if (((Boolean) C0955b.hH.m28964b()).booleanValue()) {
                adVar.f31794j.add(new C1281a());
            }
            if (dj.mo2294a(12614972)) {
                return new C6329h(this.f7981b, adVar, new C6328g(this.f7981b), ((Boolean) C0955b.f5864H.m28964b()).booleanValue());
            }
            return new C6327c(this.f7981b, adVar, new C6328g(this.f7981b), ((Boolean) C0955b.f5864H.m28964b()).booleanValue());
        }
    }

    public final C0700r bl() {
        C0700r c0700r;
        synchronized (f7984e) {
            if (this.f8012f == null) {
                int i = 2;
                if (dj().mo2294a(12610679)) {
                    i = 4;
                }
                if (aM().m7701a()) {
                    this.f8012f = new C0700r(this.f8013g, dh(), i, new com.google.android.finsky.api.p125a.cu());
                } else {
                    this.f8012f = new C0700r(this.f8013g, dh(), i);
                }
                this.f8012f.m4511a();
            }
            c0700r = this.f8012f;
        }
        return c0700r;
    }

    public final synchronized C0700r bm() {
        if (this.f8016j == null) {
            this.f8016j = new C0700r(this.f8017k, dh());
            this.f8016j.m4511a();
        }
        return this.f8016j;
    }

    public final C2206c ah() {
        if (this.f8009Y == null) {
            df();
        }
        return this.f8009Y;
    }

    public final C2199l ai() {
        if (this.f8010Z == null) {
            df();
        }
        return this.f8010Z;
    }

    public final synchronized C0947i mo2113b() {
        if (this.ae == null) {
            Context context = this.f7981b;
            C3300k o = mo2256o();
            ab r = mo2259r();
            C3646a I = mo2029I();
            C2199l ai = ai();
            if (this == null) {
                throw null;
            }
            this.ae = new DfeNotificationManagerImpl(context, o, r, I, ai, this, mo2048a(), mo2022B());
        }
        return this.ae;
    }

    public final C2495w dd() {
        return this.f8024r;
    }

    public final synchronized C2127b mo2169c() {
        if (this.aa == null) {
            C2127b c2128a = new C2128a();
            Context context = this.f7981b;
            aR();
            this.aa = new C2134h(c2128a, new C2132f(context, null), dA(), dz());
        }
        return this.aa;
    }

    public final C1531a mo2223d() {
        if (this.ab == null) {
            this.ab = new C1531a(new aa(this), new ac(this), new ad(this));
        }
        return this.ab;
    }

    public final synchronized C3646a mo2029I() {
        if (this.ac == null) {
            C2134h c2134h = (C2134h) mo2169c();
            C2320a L = mo2032L();
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.ac = new C3646a(null, c2134h, L, this, this);
            }
        }
        return this.ac;
    }

    public final C2889c mo2030J() {
        if (this.aV == null) {
            C3300k o = mo2256o();
            if (this.aU == null) {
                if (C0327a.m1722b()) {
                    this.aU = new C3152a(new BackupManager(this.f7981b));
                } else {
                    this.aU = new C3154d();
                }
            }
            C3151c c3151c = this.aU;
            mo2169c();
            this.aV = new C2889c(o, c3151c);
        }
        return this.aV;
    }

    public final C3648c mo2031K() {
        return this.ad;
    }

    public final C2320a mo2032L() {
        if (this.af == null) {
            Context context = this.f7981b;
            C3600b bO = bO();
            DevicePolicyManager devicePolicyManager = (DevicePolicyManager) m8581a("device_policy");
            C2885b g = mo2244g();
            if (this == null) {
                throw null;
            }
            if (this.dS == null) {
                if (this.dR == null) {
                    this.dR = new C3842a(bX(), bY());
                }
                C3842a c3842a = this.dR;
                this.f7981b.getPackageManager();
                this.dS = new FrostingUtil(c3842a);
            }
            this.af = new C2321a(context, bO, devicePolicyManager, g, this, this.dS);
        }
        return this.af;
    }

    public final C2909c mo2241e() {
        if (this.ag == null) {
            this.ag = new C2909c(this.f7981b);
        }
        return this.ag;
    }

    public final synchronized C4808a mo2246h(String str) {
        C4808a c4808a;
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21669e("No account specified.", new Object[0]);
        }
        c4808a = (C4808a) this.f7988D.get(str);
        if (c4808a == null) {
            C3974q i = mo2248i(str);
            if (this == null) {
                throw null;
            }
            c4808a = new C4808a(i, this);
            this.f7988D.put(str, c4808a);
        }
        return c4808a;
    }

    public final synchronized C3974q mo2248i(String str) {
        C3974q c3974q;
        if (TextUtils.isEmpty(str)) {
            FinskyLog.m21669e("No account specified.", new Object[0]);
        }
        c3974q = (C3974q) this.f7989E.get(str);
        if (c3974q == null) {
            if (this.bc == null) {
                this.bc = new C3981y(this.f7981b);
            }
            c3974q = new C3974q(str, this.bc, bf(), mo2041U());
            this.f7989E.put(str, c3974q);
        }
        return c3974q;
    }

    public final C2215k di() {
        String cZ = cZ();
        if (cZ == null) {
            FinskyLog.m21665c("No account configured on this device.", new Object[0]);
            return null;
        }
        synchronized (this.f7991G) {
            if (this.f7991G.containsKey(cZ())) {
                C2215k c2215k = (C2215k) this.f7991G.get(cZ());
                return c2215k;
            }
            c2215k = new C2216o(cY(), ah(), mo2112b(cZ));
            this.f7991G.put(cZ(), c2215k);
            return c2215k;
        }
    }

    public final C1254c ap() {
        return mo2112b(null);
    }

    public final C6287d aq() {
        return m8660b(null);
    }

    public final synchronized C1287h aK() {
        if (this.f8029w == null) {
            this.f8029w = new cu(this);
        }
        return this.f8029w;
    }

    public final synchronized C1288k aL() {
        if (this.f8030x == null) {
            this.f8030x = new cv(this);
        }
        return this.f8030x;
    }

    public final C1254c mo2168c(String str) {
        return mo2047a(cZ(), str);
    }

    public final C1254c mo2047a(String str, String str2) {
        Map map;
        Map map2;
        C1254c c1254c;
        C1251b l = m8616l(str);
        C4784e ak = ak();
        if (gz.f8138a != null) {
            map = (Map) gz.f8138a.get(str);
            if (map != null) {
                map2 = map;
                c1254c = (C1254c) map.get(str2);
            } else {
                map2 = map;
                c1254c = null;
            }
        } else {
            map2 = null;
            c1254c = null;
        }
        if (c1254c != null) {
            return c1254c;
        }
        if (l == null) {
            return null;
        }
        C2693e b = ak.m22522b(str2);
        Context context = C1473m.f7980a.f7981b;
        C0662b c0662b = l.f7429h;
        C0659a c0659a = l.f7430i;
        C2482j c2482j = l.f7435n;
        C1186a a = C1186a.m7138a(context);
        C1552e c1552e = l.f7428g;
        Locale locale = Locale.getDefault();
        String str3 = (String) C0955b.jy.m28964b();
        Object c = l.m7290c("X-DFE-Filter-Level");
        if (!TextUtils.isEmpty(c)) {
            Integer.valueOf(c).intValue();
        }
        String c2 = l.m7290c("X-DFE-Content-Filters");
        if (c2 == null) {
            c2 = "";
        }
        String str4 = b.f24993x;
        String str5 = b.f24994y;
        String str6 = b.f24984o;
        String str7 = b.f24982m;
        String a2 = C1301y.m7757a(b.f24981l, b.f24980k, b.f24992w, b.f24985p, b.f24987r, b.f24990u, b.f24991v, b.f24989t, b.f24988s, false, b.f24979j.f31742p);
        C2276c c2279g = new C2279g(context);
        C1473m.f7980a.mo2046Z();
        C1251b c1251b = new C1251b(context, c0662b, c0659a, c1552e, true, locale, str4, str5, str3, str6, c2, null, c2482j, str7, a2, C1473m.f7980a.mo2033M(), b, b.f24978i, a, ((Boolean) C0955b.f5891h.m28964b()).booleanValue(), c2279g, null);
        gz.m8794a(l, "X-DFE-Device-Id", c1251b, "X-DFE-Proxy-Device-Id");
        gz.m8794a(l, "X-DFE-MCCMNC", c1251b, "X-DFE-Proxy-MCCMNC");
        gz.m8794a(l, "X-DFE-Logging-Id", c1251b, "X-DFE-Proxy-Logging-ID");
        gz.m8794a(l, "User-Agent", c1251b, "X-DFE-Proxy-User-Agent");
        c1251b.f7444w = new ha(b);
        C1254c c1256d = new C1256d(c1251b);
        c1256d.mo1617a(C1473m.f7980a.aj());
        if (gz.f8138a == null) {
            gz.f8138a = new HashMap();
        }
        if (map2 == null) {
            map = new HashMap();
            gz.f8138a.put(str, map);
        } else {
            map = map2;
        }
        map.put(str2, c1256d);
        return c1256d;
    }

    public final C1287h mo2222d(String str) {
        return new cw(this, str);
    }

    public final synchronized C1460g bf() {
        if (this.f7987C == null) {
            this.f7987C = new cx(this);
        }
        return this.f7987C;
    }

    public final C2243a mo2023C() {
        if (this.ai == null) {
            ContentResolver contentResolver = this.f7981b.getContentResolver();
            Context context = this.f7981b;
            if (C2247e.f11165a == null) {
                C2247e.f11165a = new C2247e();
            }
            this.ai = new C2244a(contentResolver, context);
        }
        return this.ai;
    }

    public final C2699l mo2024D() {
        if (this.aj == null) {
            this.aj = new C2699l();
        }
        return this.aj;
    }

    public final C3012d mo2025E() {
        if (this.ak == null) {
            Context context = this.f7981b;
            C3646a I = mo2029I();
            C2206c ah = ah();
            C2127b c = mo2169c();
            C3340g bw = bw();
            C3011c F = mo2026F();
            bu();
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.ak = new C3012d(context, I, ah, c, bw, F, this, this, this, mo2033M());
            }
        }
        return this.ak;
    }

    public final C3011c mo2026F() {
        if (this.al == null) {
            if (this.am == null) {
                this.am = new C3018k(bX());
            }
            C3018k c3018k = this.am;
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.al = new C3011c(c3018k, this, this);
            }
        }
        return this.al;
    }

    public final C1542f mo2027G() {
        if (this.ao == null) {
            if (this.an == null) {
                if (this == null) {
                    throw null;
                }
                C1287h aK = aK();
                if (this == null) {
                    throw null;
                } else if (this == null) {
                    throw null;
                } else {
                    this.an = new C1545i(this, aK, this, mo2025E(), mo2028H());
                }
            }
            C1545i c1545i = this.an;
            C1611k av = av();
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.ao = new C1542f(c1545i, av, this, this, mo2028H(), bl());
            }
        }
        return this.ao;
    }

    public final C2412a mo2028H() {
        if (this.ap == null) {
            this.ap = new C2412a();
        }
        return this.ap;
    }

    public final C0986a mo2041U() {
        if (this.aR == null) {
            this.aR = new C0991a(this.f7981b, mo2033M(), mo2035O(), au());
            this.aR.mo1192a(new cy(this));
        }
        return this.aR;
    }

    public final C0988c mo2040T() {
        return this;
    }

    public final C3934g mo2243f() {
        return this.aq;
    }

    public final C2885b mo2244g() {
        if (this.au == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.au = new C2885b(context, this, this, mo2033M());
            }
        }
        return this.au;
    }

    public final ac mo2245h() {
        if (this.aw == null) {
            if (this == null) {
                throw null;
            }
            this.aw = new ac(this, av());
        }
        return this.aw;
    }

    public final C1254c mo2112b(String str) {
        C1254c c1254c;
        if (str == null) {
            str = cZ();
            if (str == null) {
                FinskyLog.m21665c("No account configured on this device.", new Object[0]);
                return null;
            }
        }
        synchronized (this.f8027u) {
            c1254c = (C1254c) this.f8027u.get(str);
            C1552e j = mo2249j(str);
            if (c1254c == null) {
                String str2 = (String) C0954a.f5834d.m5760a();
                C2276c c2279g = new C2279g(this.f7981b);
                Context context = this.f7981b;
                if (this == null) {
                    throw null;
                }
                C0986a U = mo2041U();
                C2243a C = mo2023C();
                C2482j f = mo2242f(str);
                mo2046Z();
                C1500a M = mo2033M();
                C2693e a = C2693e.m14552a();
                C1186a a2 = C1186a.m7138a(this.f7981b);
                boolean booleanValue = ((Boolean) C0955b.f5891h.m28964b()).booleanValue();
                C1535a B = mo2022B();
                Account b = U.mo1183b(str);
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                C1251b c1251b = new C1251b(context, new C0662b(context, b, C3950c.m18651a(b, j, 12604357)), dl(), j, true, Locale.getDefault(), telephonyManager.getSimOperator(), telephonyManager.getSimOperatorName(), (String) C0955b.jy.m28964b(), (String) C1285f.f7611h.m28964b(), str2, C, f, Long.toHexString(((Long) C0955b.m5748a().m28964b()).longValue()), C1301y.m7755a(context), M, a, null, a2, booleanValue, c2279g, B);
                this.f8028v.put(str, c1251b);
                FinskyLog.m21662b("Created new context: %s", c1251b);
                C1254c c1256d = new C1256d(c1251b);
                c1256d.mo1617a(aj());
                this.f8027u.put(str, c1256d);
                c1254c = c1256d;
            }
        }
        return c1254c;
    }

    public final C2534x aj() {
        if (this.f8003S == null) {
            if (this == null) {
                throw null;
            }
            this.f8003S = new C2534x(this, new com.google.android.finsky.datasync.aa(this.f7981b, "dfe", false), new com.google.android.finsky.datasync.aa(this.f7981b, "fife", true));
        }
        return this.f8003S;
    }

    public final synchronized C4784e ak() {
        if (this.bq == null) {
            this.bq = new C4784e();
        }
        return this.bq;
    }

    public final synchronized ak al() {
        if (this.br == null) {
            this.br = new ak(ak());
        }
        return this.br;
    }

    public final synchronized bj am() {
        if (this.bs == null) {
            this.bs = new bj(bZ().m18890a(11));
        }
        return this.bs;
    }

    public final synchronized ar an() {
        if (this.bt == null) {
            this.bt = new ar(this.f7981b, al(), ak());
        }
        return this.bt;
    }

    public final synchronized C1254c ao() {
        if (this.f8032z == null) {
            C1500a M = ((Boolean) C0955b.fl.m28964b()).booleanValue() ? null : mo2033M();
            C2276c c2279g = new C2279g(this.f7981b);
            Context context = this.f7981b;
            C0659a aeVar = new ae();
            C1552e j = mo2249j(null);
            mo2046Z();
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            this.f8032z = new C1256d(new C1251b(context, null, aeVar, j, false, Locale.getDefault(), telephonyManager.getSimOperator(), telephonyManager.getSimOperatorName(), (String) C0955b.jy.m28964b(), (String) C1285f.f7611h.m28964b(), "", null, null, Long.toHexString(((Long) C0955b.m5748a().m28964b()).longValue()), C1301y.m7755a(context), M, C2693e.m14552a(), null, C1186a.m7138a(this.f7981b), ((Boolean) C0955b.f5891h.m28964b()).booleanValue(), c2279g, null));
        }
        return this.f8032z;
    }

    private final C1251b m8616l(String str) {
        C1251b c1251b;
        synchronized (this.f8027u) {
            c1251b = (C1251b) this.f8028v.get(str);
        }
        return c1251b;
    }

    public final C6287d m8660b(Account account) {
        Account cY;
        int i = 1;
        if (account == null) {
            cY = cY();
        } else {
            cY = account;
        }
        if (cY == null) {
            FinskyLog.m21665c("No account configured on this device.", new Object[0]);
            return null;
        }
        C6287d c6287d;
        synchronized (this.f7986B) {
            c6287d = (C6287d) this.f7986B.get(cY.name);
            if (c6287d == null) {
                mo2046Z();
                int i2 = (((Boolean) C0955b.fE.m28964b()).booleanValue() && mo2249j(cY.name).mo2294a(12604357)) ? 1 : 0;
                if (i2 == 0) {
                    i = 0;
                }
                Context context = this.f7981b;
                if (this == null) {
                    throw null;
                }
                FinskyLog.m21662b("Created new PlayDfeApiContext: %s", C6288e.m28843a(context, context.getPackageName(), dl(), cY, i, ((Boolean) C0955b.f5891h.m28964b()).booleanValue()));
                c6287d = new C6289f(bl(), r1);
                this.f7986B.put(cY.name, c6287d);
            }
        }
        return c6287d;
    }

    public final Object mo2051a(Class cls) {
        try {
            return cls.cast(this.cg);
        } catch (Throwable e) {
            throw new IllegalStateException(String.format("Invalid injector: %s, which is not extended by FinskyAppComponent!", new Object[]{cls.getName()}), e);
        }
    }

    public final synchronized C1552e mo2249j(String str) {
        C1552e c1552e;
        c1552e = (C1552e) this.ah.get(str);
        if (c1552e == null) {
            C1549f[] c1549fArr = new C1549f[3];
            c1549fArr[0] = af();
            C2910a au = au();
            if (au.f15472i == null) {
                au.f15472i = new C2913d(au);
            }
            c1549fArr[1] = au.f15472i;
            c1549fArr[2] = bG();
            if (mo2035O().m8839b()) {
                c1552e = new C1555e(str, mo2041U(), c1549fArr);
            } else {
                c1552e = new C1553c(str, mo2041U(), c1549fArr);
            }
            this.ah.put(str, c1552e);
        }
        return c1552e;
    }

    public final C1552e dj() {
        return mo2249j(cZ());
    }

    public final C2376e ag() {
        if (this.ay == null) {
            if (((Boolean) C0955b.is.m28964b()).booleanValue()) {
                this.ay = new C2379d();
            } else {
                this.ay = new C2403m();
            }
        }
        return this.ay;
    }

    public final C2713b dk() {
        return this.f8014h;
    }

    public final C1550a af() {
        if (this.ax == null) {
            this.ax = new C1551a();
        }
        return this.ax;
    }

    public final C2457d mo2247i() {
        if (this.ar == null) {
            C3027b bt = bt();
            C3028c bu = bu();
            Context context = this.f7981b;
            C1531a d = mo2223d();
            if (this == null) {
                throw null;
            }
            this.ar = new C2457d(bt, bu, context, d, this, aY(), this, bw(), ah(), mo2045Y(), mo2044X(), mo2243f(), mo2253l(), mo2244g());
        }
        return this.ar;
    }

    public final C2456c mo2250j() {
        if (this.as == null) {
            mo2247i();
            C1531a d = mo2223d();
            mo2044X();
            this.as = new C2456c(d);
        }
        return this.as;
    }

    public final C3752d mo2252k() {
        if (this.at == null) {
            if (this == null) {
                throw null;
            }
            C1542f G = mo2027G();
            C2471a aR = aR();
            C1249a dI = dI();
            C1287h aK = aK();
            C2171b bo = bo();
            C2162a bn = bn();
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                C2104b as = as();
                C1867w aE = aE();
                if (this == null) {
                    throw null;
                }
                this.at = new C3753c(this, G, aR, dI, aK, bo, bn, this, this, as, aE, this);
            }
        }
        return this.at;
    }

    public final C2833a mo2253l() {
        if (this.az == null) {
            Context context = this.f7981b;
            C2206c ah = ah();
            C2199l ai = ai();
            if (this == null) {
                throw null;
            }
            this.az = new C2833a(context, ah, ai, this, mo2045Y());
        }
        return this.az;
    }

    public final C2713b mo2251k(String str) {
        if (dj().mo2294a(12633506)) {
            return null;
        }
        return new C2713b(new Handler(Looper.getMainLooper()), mo2112b(str), aK());
    }

    public final C3851f mo2254m() {
        return this.f8026t;
    }

    public final C2482j mo2049a(Account account) {
        C2482j c2482j;
        synchronized (this.f7990F) {
            Object obj;
            if (account == null) {
                obj = null;
            } else {
                String str = account.name;
            }
            c2482j = (C2482j) this.f7990F.get(obj);
            if (c2482j == null) {
                C2482j c2482j2 = new C2482j(this.f7981b, account, ((Boolean) C0955b.f5866J.m28964b()).booleanValue(), bK().mo3874a());
                this.f7990F.put(obj, c2482j2);
                c2482j = c2482j2;
            }
        }
        return c2482j;
    }

    public final C2482j mo2242f(String str) {
        Account account = null;
        if (!TextUtils.isEmpty(str)) {
            account = mo2041U().mo1183b(str);
        }
        return mo2049a(account);
    }

    public final C2482j dc() {
        return mo2049a(cY());
    }

    public final C2487n cv() {
        if (this.f8025s == null) {
            this.f8025s = new C2487n();
            C6235v c6235v = new C6235v();
            com.google.android.finsky.p111d.ae aeVar = new com.google.android.finsky.p111d.ae(this.f8025s, this.f7981b, this);
            if (aeVar.f13331d) {
                FinskyLog.m21665c("Cannot start PRIMES logging.  It has already been started.", new Object[0]);
            } else {
                cw cwVar = new cw();
                cwVar.f29912a = new C6236x(aeVar.f13329b);
                C1552e dj = aeVar.f13332e.dj();
                if (dj.mo2294a(12628179)) {
                    cwVar.f29913b = new dp(true);
                }
                if (dj.mo2294a(12634791) && C0327a.m1721a()) {
                    dn dnVar = new dn();
                    dnVar.f29977a = true;
                    dnVar.f29979c = ((Boolean) C0955b.gM.m28964b()).booleanValue();
                    dnVar.f29980d = ((Integer) C0955b.gL.m28964b()).intValue();
                    cwVar.f29918g = dnVar.m27822a();
                }
                if (C0327a.m1721a()) {
                    cwVar.f29920i = new ct(dj.mo2294a(12638619));
                }
                cwVar.f29917f = new dt(dj.mo2294a(12640007));
                cx afVar = new com.google.android.finsky.p111d.af(cwVar);
                Application application = aeVar.f13330c;
                ed edVar = new ed();
                Object ecVar = new ec(edVar.f30024a, edVar.f30025b, edVar.f30026c, edVar.f30027d);
                C5916a.m27406a(ecVar);
                cr crVar = new cr(application);
                cm.m27796a(crVar.f29893c.mo5255a(crVar.f29891a, afVar, crVar.f29894d, crVar.f29892b, ecVar));
                if (dj.mo2294a(12628179)) {
                    cm.f29878b.f29879c.mo5220d();
                }
                aeVar.f13331d = true;
            }
        }
        return this.f8025s;
    }

    public final synchronized C1294w be() {
        C1294w c1294w;
        boolean z = true;
        synchronized (this) {
            if (this.f8015i == null) {
                C2276c c2279g = new C2279g(this.f7981b);
                if (dj().mo2294a(12613110)) {
                    this.f8015i = new C1295r(dc(), c2279g, bm(), av().m9276b(), av().m9277c(), new by());
                } else {
                    int b = av().m9276b();
                    int c = av().m9277c();
                    int intValue = ((Integer) C6322j.f31609w.m28964b()).intValue();
                    if (intValue == -1) {
                        c = Math.max(3145728, (int) (((Float) C6322j.f31610x.m28964b()).floatValue() * ((float) ((b * c) * 4))));
                    } else {
                        c = (intValue * MemoryMappedFileBuffer.DEFAULT_PADDING) * MemoryMappedFileBuffer.DEFAULT_PADDING;
                    }
                    if (!dj().mo2294a(12637304)) {
                        if (dj().mo2294a(12637305)) {
                            c = Math.max(c / 2, 1);
                        } else if (dj().mo2294a(12637306)) {
                            c = Math.max(c / 4, 1);
                        } else if (dj().mo2294a(12637307)) {
                            c = Math.max(c / 10, 1);
                        } else if (dj().mo2294a(12637308)) {
                            c = 1;
                        } else {
                            z = false;
                        }
                    }
                    if (dj().mo2294a(12642310) || dj().mo2294a(12643011) || dj().mo2294a(12643296)) {
                        this.f8015i = new C6320d(bm(), new by(), null, z, c, 2, new af(this, c2279g));
                    } else {
                        this.f8015i = new C6320d(bm(), new by(), new ag(this, c2279g), z, c);
                    }
                    if (dj().mo2294a(12642310) || dj().mo2294a(12643297)) {
                        ((C6320d) this.f8015i).f31568o = 0;
                    } else if (dj().mo2294a(12643011)) {
                        ((C6320d) this.f8015i).f31568o = 20;
                    }
                    if (dj().mo2294a(12637326)) {
                        c1294w = this.f8015i;
                        if (this == null) {
                            throw null;
                        }
                        c1294w.mo1676a(new C1280a(this));
                    }
                }
                c1294w = this.f8015i;
                aM();
                mo2042V();
                c1294w.mo1674a(new cq(this));
                if (dj().mo2294a(12627545)) {
                    this.f8015i.mo1675a(new C1609i(aT().m13478a()));
                }
            }
            c1294w = this.f8015i;
        }
        return c1294w;
    }

    public final C1612l ar() {
        if (this.bJ == null) {
            this.bJ = new C1612l(be());
        }
        return this.bJ;
    }

    public final C2104b as() {
        if (this.bK == null) {
            if (this == null) {
                throw null;
            }
            this.bK = new C2104b(this);
        }
        return this.bK;
    }

    public final C0659a dl() {
        return this.f8013g;
    }

    public final C0659a dm() {
        return this.f8017k;
    }

    @Deprecated
    public final DfeToc dn() {
        return this.f8019m;
    }

    public final List cX() {
        return new ArrayList(Arrays.asList(mo2041U().mo1188d()));
    }

    public final Account mo2240e(String str) {
        return mo2041U().mo1183b(str);
    }

    public final Account cY() {
        if (this.f8022p == null) {
            Account a = mo2041U().mo1181a(C0954a.f5838h);
            if (a == null) {
                FinskyLog.m21665c("No account configured on this device.", new Object[0]);
                return null;
            }
            this.f8022p = a;
        }
        return this.f8022p;
    }

    public final String cZ() {
        Account cY = cY();
        return cY != null ? cY.name : null;
    }

    public final Account da() {
        if (this.f8023q == null) {
            Account cY = cY();
            if (!mo2041U().mo1193a(cY)) {
                cY = mo2041U().mo1196b();
            }
            if (!(cY == null || cY.equals(cY()))) {
                mo2041U().mo1198c(cY);
            }
            this.f8023q = cY;
        }
        return this.f8023q;
    }

    public final String db() {
        Account da = da();
        return da != null ? da.name : null;
    }

    public final void mo2057a(DfeToc dfeToc) {
        boolean z = true;
        this.f8019m = dfeToc;
        if (this.f8019m != null) {
            C6325i.f31615a = this.f8019m.f14881a.f31778u == 1;
            if (this.f8019m.f14881a.f31778u != 1) {
                z = false;
            }
            C1608h.f8520b = z;
        }
    }

    public final C1611k av() {
        if (this.bL == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            }
            this.bL = new C1611k(context, this, mo2036P());
        }
        return this.bL;
    }

    public final C1084g aw() {
        if (this.bM == null) {
            C1612l ar = ar();
            bR();
            this.bM = new C1084g(ar);
        }
        return this.bM;
    }

    public final C2287a ax() {
        if (this.bN == null) {
            if (this == null) {
                throw null;
            }
            this.bN = new C2287a(this, this.f7981b);
        }
        return this.bN;
    }

    public final C1556d ay() {
        if (this.bI == null) {
            this.bI = new C1556d();
        }
        return this.bI;
    }

    public final C1869y aA() {
        if (this.bV == null) {
            this.bV = new C1870z();
        }
        return this.bV;
    }

    public final C1801q aB() {
        if (this.bW == null) {
            this.bW = new C2095i();
        }
        return this.bW;
    }

    public final C1803u aC() {
        if (this.ce == null) {
            this.ce = new C2098b();
        }
        return this.ce;
    }

    public final C2063t aD() {
        if (this.bP == null) {
            if (this == null) {
                throw null;
            }
            this.bP = new C2063t(this, aI());
        }
        return this.bP;
    }

    public final C1867w aE() {
        if (this.bR == null) {
            C3646a I = mo2029I();
            C2206c ah = ah();
            C2320a L = mo2032L();
            aJ();
            this.bR = new C1867w(I, ah, L, mo2041U());
        }
        return this.bR;
    }

    public final C1865u aF() {
        if (this.bQ == null) {
            C1287h aK = aK();
            if (this.cv == null) {
                this.cv = new C2864a(mo2038R());
            }
            this.bQ = new C1865u(aK, this.cv);
        }
        return this.bQ;
    }

    public final C1793i aG() {
        if (this.bS == null) {
            if (this == null) {
                throw null;
            }
            this.bS = new C1793i(this, this);
        }
        return this.bS;
    }

    public final C1797m aH() {
        if (this.bT == null) {
            Context context = this.f7981b;
            av();
            this.bT = new C1797m(context);
        }
        return this.bT;
    }

    public final C2067x aI() {
        if (this.bU == null) {
            ah();
            C1793i aG = aG();
            C2471a aR = aR();
            if (this == null) {
                throw null;
            }
            ab();
            this.bU = new C2067x(aG, aR, this);
        }
        return this.bU;
    }

    public final C2744a aJ() {
        if (this.bX == null) {
            this.bX = new C2744a();
        }
        return this.bX;
    }

    public final SearchRecentSuggestions bg() {
        return this.bx;
    }

    public final synchronized int bi() {
        if (this.bz == 0) {
            try {
                this.bz = this.f7981b.getPackageManager().getPackageInfo(this.f7981b.getPackageName(), 0).versionCode;
            } catch (Throwable e) {
                FinskyLog.m21660a(e, "Could not find com.android.vending package", new Object[0]);
            }
        }
        return this.bz;
    }

    public final synchronized String bj() {
        String str;
        if (this.bA != null) {
            str = this.bA;
        } else {
            try {
                int myPid = Process.myPid();
                for (RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) m8581a("activity")).getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        this.bA = runningAppProcessInfo.processName;
                        str = runningAppProcessInfo.processName;
                        break;
                    }
                }
            } catch (Throwable th) {
                FinskyLog.m21669e("Exception when going through the list of running processes", new Object[0]);
            }
            FinskyLog.m21669e("App isn't in the list of running processes", new Object[0]);
            this.bA = "unknown_process_name";
            str = this.bA;
        }
        return str;
    }

    public final C2296c mo2255n() {
        if (this.cW == null) {
            Context context;
            if (VERSION.SDK_INT >= 21) {
                context = this.f7981b;
                C2320a L = mo2032L();
                C3849a y = mo2266y();
                if (this == null) {
                    throw null;
                }
                this.cW = new C2298e(context, L, y, this, ag(), mo2041U());
            } else {
                context = this.f7981b;
                C3849a y2 = mo2266y();
                if (this == null) {
                    throw null;
                }
                this.cW = new C2318y(context, y2, this);
            }
        }
        return this.cW;
    }

    public final synchronized C2153a m8667do() {
        if (this.f7994J == null) {
            C2127b c = mo2169c();
            if (this == null) {
                throw null;
            }
            C2471a aR = aR();
            if (this == null) {
                throw null;
            }
            this.f7994J = new C2153a(c, this, aR, this);
        }
        return this.f7994J;
    }

    public final synchronized C3300k mo2256o() {
        if (this.f7993I == null) {
            Context context = this.f7981b;
            C3646a I = mo2029I();
            C2850m w = mo2264w();
            ab r = mo2259r();
            mo2257p();
            C2266a q = mo2258q();
            C2909c e = mo2241e();
            C2296c n = mo2255n();
            C2251c a = mo2048a();
            C1500a M = mo2033M();
            Context context2 = this.f7981b;
            if (this == null) {
                throw null;
            }
            C2358a c2358a = new C2358a(context2, this, dy());
            if (this == null) {
                throw null;
            }
            C2471a aR = aR();
            C3028c bu = bu();
            C2171b bo = bo();
            C2153a c2153a = m8667do();
            if (this.f7995K == null) {
                Context context3 = this.f7981b;
                C3646a I2 = mo2029I();
                C2206c ah = ah();
                C2850m w2 = mo2264w();
                ab r2 = mo2259r();
                C3322j p = mo2257p();
                C2266a q2 = mo2258q();
                C2296c n2 = mo2255n();
                C2909c e2 = mo2241e();
                C2471a aR2 = aR();
                C3849a y = mo2266y();
                C3600b c3600b = new C3600b(this.f7981b.getPackageManager());
                C1531a d = mo2223d();
                if (this == null) {
                    throw null;
                }
                C2376e ag = ag();
                C4774e bk = bk();
                C3027b bt = bt();
                C2320a L = mo2032L();
                C0986a U = mo2041U();
                C1287h aK = aK();
                C2537a dG = dG();
                if (this == null) {
                    throw null;
                }
                C2888b a2 = az.m21336a();
                if (this.dC == null) {
                    Context context4 = this.f7981b;
                    if (this == null) {
                        throw null;
                    }
                    this.dC = new C3282b(context4, this, mo2036P(), dD());
                }
                C3281b c3281b = this.dC;
                C2830g bD = bD();
                if (this.f7992H == null) {
                    this.f7992H = new C2946a(ag(), this.aR);
                }
                this.f7995K = new ba(context3, I2, ah, w2, r2, p, q2, n2, e2, this, aR2, y, c3600b, d, this, ag, bk, bt, L, U, aK, dG, c2153a, this, a2, c3281b, bD, this.f7992H);
            }
            this.f7993I = new C3301s(context, I, w, r, q, e, n, a, M, c2358a, this, aR, bu, bo, this.f7995K, bP(), m8667do(), new C3297p(dj()));
            if (dj().mo2294a(12637967)) {
                this.f7993I.mo3429a(new C3335g(new ah(this)));
            }
        }
        return this.f7993I;
    }

    private final synchronized C2537a dG() {
        if (this.cJ == null) {
            this.cJ = new C2537a(this.f7981b);
        }
        return this.cJ;
    }

    final void dp() {
        mo2256o().mo3430a(new cz(this));
        bw().mo3481a(new C2193a(this.f7981b));
        bw().mo3481a(new C3276k(this.f7981b, mo2029I()));
    }

    public final synchronized C3322j mo2257p() {
        if (this.f7997M == null) {
            this.f7997M = new C3322j(bD());
        }
        return this.f7997M;
    }

    public final synchronized C2266a mo2258q() {
        if (this.f7998N == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            }
            this.f7998N = new C2266a(context, this, mo2036P());
        }
        return this.f7998N;
    }

    public final ab mo2259r() {
        if (this.f8004T == null) {
            this.f8004T = new C3803r(this.f7981b);
        }
        return this.f8004T;
    }

    public final C2271f mo2260s() {
        if (this.f7999O == null) {
            this.f7999O = new C2271f(mo2261t());
        }
        return this.f7999O;
    }

    public final C2272b mo2261t() {
        if (this.f8000P == null) {
            this.f8000P = new C2272b(new ai(this));
        }
        return this.f8000P;
    }

    public final C3736d mo2262u() {
        if (this.f8001Q == null) {
            if (this == null) {
                throw null;
            }
            this.f8001Q = new C3736d(this, this.f7981b);
        }
        return this.f8001Q;
    }

    public final synchronized C2181b mo2263v() {
        if (this.f8007W == null) {
            ab r = mo2259r();
            C0986a U = mo2041U();
            C2186a c2187d = new C2187d(this.f7981b);
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.f8007W = new C2183a(r, U, c2187d, this, this);
            }
        }
        return this.f8007W;
    }

    private final synchronized C2187d dH() {
        if (this.f8006V == null) {
            this.f8006V = new C2187d(this.f7981b);
        }
        return this.f8006V;
    }

    final synchronized void dq() {
        Object obj = null;
        synchronized (this) {
            if (VERSION.SDK_INT < 26) {
                if (this == null) {
                    throw null;
                } else if (dj().mo2294a(12641193)) {
                    obj = 1;
                }
            }
            if (obj == null) {
                dH().mo2776a(0);
            } else if (this.f8005U == null) {
                C2186a dH = dH();
                if (this == null) {
                    throw null;
                }
                C3791f c3791f = new C3791f(dH, this);
                if (c3791f.m18142a()) {
                    c3791f.f19066c.mo3757a(c3791f);
                    c3791f.mo3577a(c3791f.f19066c.mo3756a());
                }
                this.f8005U = c3791f;
            }
        }
    }

    public final synchronized C2556b mo2050a(C1552e c1552e) {
        if (this.f8002R == null) {
            if (((Boolean) C0955b.gf.m28964b()).booleanValue() && (c1552e.mo2294a(12606677) || C0327a.m1721a())) {
                int bi = bi();
                Context context = this.f7981b;
                C2537a dG = dG();
                mo2257p();
                if (this.dg == null) {
                    Context context2 = this.f7981b;
                    C2850m w = mo2264w();
                    C3219f cc = cc();
                    C3322j p = mo2257p();
                    if (this.dh == null) {
                        this.dh = new C2546i(mo2266y());
                    }
                    this.dg = new C2544g(context2, w, cc, p, this.dh, bD());
                }
                this.f8002R = new C2557c(bi, context, dG, this.dg, aU());
            } else {
                this.f8002R = new C2561g(mo2264w(), bi(), this.f7981b, dG(), mo2257p(), aU(), cc(), mo2266y());
            }
        }
        return this.f8002R;
    }

    public final C2850m mo2264w() {
        if (this.f8008X == null) {
            Context context = this.f7981b;
            C2734a bP = bP();
            C2266a q = mo2258q();
            if (this == null) {
                throw null;
            }
            C2843f c2863z = new C2863z(context, bP, q, this, bK());
            C3849a y = mo2266y();
            bD();
            this.f8008X = new C2851n(c2863z, y);
        }
        return this.f8008X;
    }

    public final C3960a mo2265x() {
        if (this.dM == null) {
            C1500a M = mo2033M();
            if (this == null) {
                throw null;
            }
            this.dM = new C3960a(M, this);
        }
        return this.dM;
    }

    public final C3849a mo2266y() {
        if (this.cs == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            }
            this.cs = new C3852a(context, ag(), mo2041U(), mo2032L());
        }
        return this.cs;
    }

    public final C3212a mo2267z() {
        if (this.aB == null) {
            Application application = this.f7981b;
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.aB = new C3213a(application, this, this, C3525k.m17101a());
            }
        }
        return this.aB;
    }

    public final C3216c mo2021A() {
        if (this.aC == null) {
            this.aC = new C3216c();
        }
        return this.aC;
    }

    public final synchronized C1500a mo2033M() {
        if (this.aD == null) {
            Context context = this.f7981b;
            C2910a au = au();
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.aD = new C1500a(context, au, this, this);
            }
        }
        return this.aD;
    }

    public final synchronized C1501b mo2034N() {
        if (this.aE == null) {
            this.aE = new C1501b(this.f7981b, mo2033M(), mo2266y());
        }
        return this.aE;
    }

    public final C1506e mo2035O() {
        if (this.aF == null) {
            this.aF = new C1506e(this.f7981b);
        }
        return this.aF;
    }

    public final synchronized C1503a mo2036P() {
        if (this.aG == null) {
            this.aG = new C1503a(this.f7981b);
        }
        return this.aG;
    }

    public final C1504b mo2037Q() {
        if (this.aH == null) {
            this.aH = new C1504b(this.f7981b, mo2241e());
        }
        return this.aH;
    }

    public final C2866c mo2038R() {
        C2866c c2866c;
        synchronized (this) {
            c2866c = this.aI;
        }
        if (c2866c == null) {
            C2693e a = C2693e.m14552a();
            if (this == null) {
                throw null;
            }
            c2866c = new C2866c(a, this, bs(), ay());
            synchronized (this) {
                if (this.aI == null) {
                    this.aI = c2866c;
                } else {
                    c2866c = this.aI;
                }
            }
        }
        return c2866c;
    }

    public final C4569e mo2039S() {
        if (this.aJ == null) {
            if (this == null) {
                throw null;
            }
            C1287h aK = aK();
            if (this == null) {
                throw null;
            }
            C2910a au = au();
            if (this == null) {
                throw null;
            }
            C4726d bp = bp();
            if (this == null) {
                throw null;
            }
            this.aJ = new C4569e(this, aK, this, au, this, bp, this);
        }
        return this.aJ;
    }

    public final C2274a ae() {
        if (this.bO == null) {
            this.bO = new C2274a(this, this.f7981b);
        }
        return this.bO;
    }

    public final C2910a au() {
        if (this.aN == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            }
            C1287h aK = aK();
            C4774e bk = bk();
            if (this == null) {
                throw null;
            }
            this.aN = new C2910a(context, this, aK, bk, this);
            if (dj().mo2294a(12639710) || dj().mo2294a(12639721)) {
                com.google.android.finsky.utils.bb.m21794b(new db(this), new Void[0]);
            }
        }
        return this.aN;
    }

    public final C2277d aa() {
        return this.aO;
    }

    public final C3964c ac() {
        if (this.aP == null) {
            if (this == null) {
                throw null;
            }
            C1287h aK = aK();
            C1460g bf = bf();
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.aP = new C3964c(this, aK, bf, this, this, ad());
            }
        }
        return this.aP;
    }

    public final C3963b ad() {
        if (this.aQ == null) {
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.aQ = new C3963b(this, this);
            }
        }
        return this.aQ;
    }

    public final C3741b bS() {
        if (this.bj == null) {
            if (this.bk == null) {
                this.bk = new C3744e();
            }
            this.bj = new C3741b(this.bk);
        }
        return this.bj;
    }

    public final C1190a at() {
        if (this.dF == null) {
            if (this.dG == null) {
                if (C4671b.m21788e()) {
                    this.dG = new C1196f(this.f7981b, (NetworkStatsManager) m8581a("netstats"), (TelephonyManager) m8581a("phone"), this.f7981b.getPackageManager());
                } else {
                    this.dG = new C1197h();
                }
            }
            this.dF = new C1190a(this.dG, bY());
        }
        return this.dF;
    }

    public final C1463g az() {
        return this;
    }

    public final C1461c aN() {
        return this;
    }

    public final C4774e bk() {
        if (this.dm == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            }
            C0002a ajVar = new aj(this);
            if (this == null) {
                throw null;
            }
            C0002a akVar = new ak(this);
            C0002a alVar = new al(this);
            C0002a anVar = new an(this);
            if (this == null) {
                throw null;
            }
            C0002a aoVar = new ao(this);
            C0002a apVar = new ap(this);
            C4773a c4773a = new C4773a();
            this.dm = new C4775b(context, this, ajVar, this, akVar, alVar, anVar, this, aoVar, apVar);
        }
        return this.dm;
    }

    public final C2721l aO() {
        if (this.aS == null) {
            this.aS = new C2721l();
        }
        return this.aS;
    }

    public final C2492t aP() {
        if (this.aT == null) {
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.aT = new C2492t(this, this, this.f7981b);
            }
        }
        return this.aT;
    }

    public final C1821j aQ() {
        if (this.aW == null) {
            this.aW = new C1821j(bi());
        }
        return this.aW;
    }

    public final C2471a aR() {
        if (this.ch == null) {
            if (this == null) {
                throw null;
            }
            this.ch = new C2471a(this);
        }
        return this.ch;
    }

    public final bs aS() {
        if (this.ci == null) {
            bs bvVar;
            if (((Boolean) C0955b.hu.m28964b()).booleanValue()) {
                aR();
                bvVar = new bv();
            } else {
                C2471a aR = aR();
                C4126m cN = cN();
                mo2257p();
                bvVar = new bt(aR, cN);
            }
            this.ci = bvVar;
        }
        return this.ci;
    }

    public final C2531s aT() {
        if (this.cj == null) {
            C0986a U = mo2041U();
            Context context = this.f7981b;
            C2471a aR = aR();
            if (this == null) {
                throw null;
            }
            C1287h aK = aK();
            C1289l aM = aM();
            if (this == null) {
                throw null;
            }
            this.cj = new C2531s(U, context, aR, this, aK, aM, this, aj());
        }
        return this.cj;
    }

    public final synchronized C4726d bp() {
        if (this.aX == null) {
            this.aX = new com.google.android.finsky.verifier.impl.bw();
        }
        return this.aX;
    }

    public final synchronized ad bq() {
        if (this.aY == null) {
            this.aY = new ad(this.f7981b);
        }
        return this.aY;
    }

    public final synchronized ag br() {
        if (this.aZ == null) {
            this.aZ = new ag();
        }
        return this.aZ;
    }

    public final C2363d aV() {
        if (this.ck == null) {
            Context context = this.f7981b;
            C2320a L = mo2032L();
            if (this == null) {
                throw null;
            }
            this.ck = new C2363d(context, L, this);
        }
        return this.ck;
    }

    public final C3178v aW() {
        if (this.cm == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            }
            C1502a cs = cs();
            bb bZ = bZ();
            C3176a c3176a = new C3176a(this.f7981b);
            C3177b c3177b = new C3177b();
            this.cm = new C3179d(context, this, cs, bZ, c3176a, bi(), aU());
        }
        return this.cm;
    }

    public final C1790e aZ() {
        if (this.cn == null) {
            this.cn = new C1790e(this.f7981b);
        }
        return this.cn;
    }

    public final C3640a ba() {
        if (this.dE == null) {
            this.dE = new C3640a();
        }
        return this.dE;
    }

    public final C4683n bb() {
        if (this.co == null) {
            this.co = new C4683n(this.f7981b);
        }
        return this.co;
    }

    public final C1219c bc() {
        if (this.cp == null) {
            this.cp = new C1219c();
        }
        return this.cp;
    }

    public final C2974a bd() {
        if (this.cf == null) {
            if (this == null) {
                throw null;
            }
            C1500a M = mo2033M();
            C2320a L = mo2032L();
            C2206c ah = ah();
            C2199l ai = ai();
            if (this == null) {
                throw null;
            }
            this.cf = new C2974a(this, M, L, ah, ai, this, mo2045Y());
        }
        return this.cf;
    }

    public final C2701n bs() {
        if (this.cu == null) {
            this.cu = new C2701n(this.f7981b);
        }
        return this.cu;
    }

    public final C3027b bt() {
        if (this.cw == null) {
            Context context = this.f7981b;
            C3646a I = mo2029I();
            C2206c ah = ah();
            if (this == null) {
                throw null;
            }
            C3028c bu = bu();
            mo2045Y();
            this.cw = new C3027b(context, I, ah, this, bu, bv());
        }
        return this.cw;
    }

    public final C4806a bv() {
        if (this.cy == null) {
            this.cy = new C4807a(this.f7981b, this, bu());
        }
        return this.cy;
    }

    public final C3028c bu() {
        if (this.cx == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            }
            C3646a I = mo2029I();
            C2127b c = mo2169c();
            if (this == null) {
                throw null;
            }
            this.cx = new C3028c(context, this, I, c, this, ah(), mo2045Y(), mo2258q(), this.f7981b.getPackageManager(), mo2223d(), aV());
        }
        return this.cx;
    }

    public final C3340g bw() {
        if (this.f7996L == null) {
            if (dj().mo2294a(12637967)) {
                C3327a c3327a = new C3327a(this.f7981b, bX(), bY());
                C3336h c3336h = new C3336h();
                C2465r c2466b = new C2466b(this.f7981b, bY(), new aq(this), new ar(this), new as(this));
                if (this == null) {
                    throw null;
                }
                this.f7996L = new C3342k(new at(c3327a), new au(c2466b), new av(this), new aw(this), new ay(this), new az(this), new ba(this), new bb(this), new bc(c3336h), new bd(this));
            } else {
                this.f7996L = new C3341j(new be(this), new bf(this), new bg(this), new bh(this));
            }
            if (this == null) {
                throw null;
            } else if (dj().mo2294a(12642050)) {
                dz().post(new dc(this));
            }
        }
        return this.f7996L;
    }

    public final C2289a bx() {
        if (this.cz == null) {
            C1185a c1185a = new C1185a();
            C0002a bjVar = new bj(this);
            dj();
            this.cz = new C2289a(bjVar);
        }
        return this.cz;
    }

    public final C2323a by() {
        if (this.cA == null) {
            this.cA = new C2323a(this.f7981b);
        }
        return this.cA;
    }

    public final C2906h bA() {
        if (this.cB == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            }
            this.cB = new C2906h(context, this, aK(), mo2169c(), ah(), mo2045Y(), mo2032L(), mo2041U(), bv(), bF());
        }
        return this.cB;
    }

    public final C4640d bE() {
        if (this.cG == null) {
            Context context = this.f7981b;
            bk bkVar = new bk(this);
            bl blVar = new bl(this);
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                C2906h bA = bA();
                C3027b bt = bt();
                bb bZ = bZ();
                bm bmVar = new bm(this);
                bn bnVar = new bn(this);
                C0002a boVar = new bo(this);
                C0002a bpVar = new bp(this);
                C0002a bqVar = new bq(this);
                C0002a brVar = new br(this);
                brVar = new bs(this);
                brVar = new bu(this);
                brVar = new bv(this);
                C2887a a = az.m21336a();
                C3028c bu = bu();
                brVar = new bw(this);
                brVar = new bx(this);
                if (this.f7985A == null) {
                    if (this == null) {
                        throw null;
                    }
                    C4569e S = mo2039S();
                    C1500a M = mo2033M();
                    Context context2 = this.f7981b;
                    if (this == null) {
                        throw null;
                    }
                    C0002a aeVar = new ae(this);
                    C3960a x = mo2265x();
                    C2320a L = mo2032L();
                    if (this == null) {
                        throw null;
                    }
                    this.f7985A = new C3952a(this, S, M, context2, this, aeVar, x, L, new C3654j(this));
                }
                C3951d c3951d = this.f7985A;
                C1502a cs = cs();
                C3960a x2 = mo2265x();
                bQ();
                if (this == null) {
                    throw null;
                }
                C3654j c3654j = new C3654j(this);
                C1500a M2 = mo2033M();
                if (this.eo == null) {
                    C3028c bu2 = bu();
                    C2320a L2 = mo2032L();
                    C2127b c = mo2169c();
                    C3340g bw = bw();
                    ab r = mo2259r();
                    C3027b bt2 = bt();
                    if (this == null) {
                        throw null;
                    }
                    C1506e O = mo2035O();
                    C4569e S2 = mo2039S();
                    if (this == null) {
                        throw null;
                    }
                    this.eo = new C4006e(bu2, L2, c, bw, r, bt2, this, O, S2, this);
                }
                this.cG = new com.google.android.finsky.updatechecker.impl.aa(context, bkVar, blVar, this, this, bA, bt, bZ, bmVar, bnVar, boVar, bpVar, bqVar, brVar, brVar, brVar, brVar, a, bu, brVar, brVar, c3951d, cs, x2, c3654j, M2, this.eo);
            }
        }
        return this.cG;
    }

    public final C1805b bF() {
        if (this.cM == null) {
            this.cM = new C1806a(aR());
        }
        return this.cM;
    }

    public final C2155a bG() {
        if (this.cL == null) {
            this.cL = new C2155a(this.f7981b, mo2035O());
        }
        return this.cL;
    }

    public final C2460b bH() {
        if (this.cH == null) {
            this.cH = new C2460b(aK(), ai(), mo2256o());
        }
        return this.cH;
    }

    public final C3600b bO() {
        if (this.cN == null) {
            this.cN = new C3600b(this.f7981b.getPackageManager());
        }
        return this.cN;
    }

    private final C1249a dI() {
        if (this.cR == null) {
            if (this == null) {
                throw null;
            }
            C0986a U = mo2041U();
            if (this == null) {
                throw null;
            }
            this.cR = new C1249a(this, U, this, bt());
        }
        return this.cR;
    }

    private final C2467a dJ() {
        if (this.df == null) {
            this.df = new C2467a(ai());
        }
        return this.df;
    }

    public final C1013j ce() {
        if (this.cT == null) {
            C3340g bw;
            C2206c ah;
            C2233o Y;
            C2266a q;
            if (this.cS == null) {
                if (this == null) {
                    throw null;
                }
                C1542f G = mo2027G();
                C3027b bt = bt();
                C2162a bn = bn();
                C1287h aK = aK();
                if (this == null) {
                    throw null;
                }
                C3300k o = mo2256o();
                C2127b c = mo2169c();
                bw = bw();
                ah = ah();
                Y = mo2045Y();
                q = mo2258q();
                C2460b bH = bH();
                C2467a dJ = dJ();
                mo2028H();
                this.cS = new C0997b(this, G, bt, bn, aK, this, o, c, bw, ah, Y, q, bH, dJ, mo2243f(), mo2247i(), mo2244g(), bd(), av());
            }
            C0997b c0997b = this.cS;
            C3027b bt2 = bt();
            C3646a I = mo2029I();
            Context context = this.f7981b;
            C1249a dI = dI();
            C2456c j = mo2250j();
            if (this == null) {
                throw null;
            }
            C3300k o2 = mo2256o();
            bw = bw();
            ah = ah();
            Y = mo2045Y();
            q = mo2258q();
            PackageManager packageManager = this.f7981b.getPackageManager();
            C3934g f = mo2243f();
            C2457d i = mo2247i();
            C2833a l = mo2253l();
            if (this == null) {
                throw null;
            }
            this.cT = new C1013j(c0997b, bt2, I, context, dI, j, this, o2, bw, ah, Y, q, packageManager, f, i, l, this);
        }
        return this.cT;
    }

    public final C1011h ci() {
        if (this.cU == null) {
            C1013j ce = ce();
            if (this == null) {
                throw null;
            }
            C1249a dI = dI();
            C1527a bV = bV();
            C3300k o = mo2256o();
            C3340g bw = bw();
            C2206c ah = ah();
            C2233o Y = mo2045Y();
            C3851f m = mo2254m();
            C2412a H = mo2028H();
            C3934g f = mo2243f();
            C2460b bH = bH();
            C2467a dJ = dJ();
            if (this == null) {
                throw null;
            }
            this.cU = new C1011h(ce, this, dI, bV, o, bw, ah, Y, m, H, f, bH, dJ, this, av(), cC(), cD());
        }
        return this.cU;
    }

    public final C2180a cl() {
        if (this.bf == null) {
            this.bf = new C2180a();
        }
        return this.bf;
    }

    public final C2189a ck() {
        if (this.dp == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.dp = new C2189a(context, this, this, bo());
            }
        }
        return this.dp;
    }

    public final C2831a cj() {
        if (this.f8011do == null) {
            this.f8011do = new C2831a(bi());
        }
        return this.f8011do;
    }

    public final String mo2052a(Context context) {
        return cs.m19398a(context, 0);
    }

    public final boolean dr() {
        return cs.m19402a();
    }

    public final void mo2055a(Activity activity, boolean z) {
        cs.m19401a(activity, z);
    }

    public final boolean ds() {
        return !mo2241e().f15463a.mo3196e() && (mo2241e().f15463a.mo3192a() || mo2033M().m8818a());
    }

    public final boolean dt() {
        return mo2258q().m11719a();
    }

    public final boolean mo2059a(String[] strArr) {
        C4632z a = C4632z.m21584a();
        if (strArr.length == 1 && mo2249j(strArr[0]).mo2294a(12620479) && a != null) {
            return true;
        }
        return false;
    }

    public final void mo2058a(String str, boolean z) {
        C4632z a = C4632z.m21584a();
        if (a != null) {
            Context context = C1473m.f7980a.f7981b;
            String string = context.getString(C7582R.string.removed_account_title);
            String string2 = context.getString(C7582R.string.removed_account_message);
            String string3 = context.getString(C7582R.string.removed_account_bar);
            C2495w a2 = a.f23843e.m13184a(null);
            Intent intent = new Intent(C1473m.f7980a.f7981b, UninstallManagerCleanupActivityV2a.class);
            intent.addFlags(268435456);
            if (z) {
                intent.addFlags(134217728);
            }
            Bundle bundle = new Bundle();
            bundle.putString("uninstall_manager_activity_removed_account_name", str);
            intent.putExtras(bundle);
            a2.m13376a(intent);
            C1473m.f7980a.mo2259r().mo3792a(str, string3, string, string2, (int) C7582R.drawable.ic_play_store, intent, "status");
        }
    }

    public final void mo2115b(String str, String str2) {
        cK().mo3924a(this.f7981b, str, str2, 0);
    }

    public final void du() {
        Context context = this.f7981b;
        C3646a I = mo2029I();
        C2162a bn = bn();
        C2734a bP = bP();
        if (!((Boolean) C0955b.dW.m28964b()).booleanValue()) {
            FinskyLog.m21659a("Skipping additional VPA because disabled.", new Object[0]);
        } else if (!bP.m14775a()) {
            FinskyLog.m21659a("Skipping additional VPA because not provisioned.", new Object[0]);
        } else if (VpaService.m19141a(context, I)) {
            FinskyLog.m21659a("Skipping additional VPA because it will be handled by deferred setup.", new Object[0]);
        } else {
            VpaService.m19140a("installrequiredfornewaccount", context, bn);
        }
    }

    public final boolean dv() {
        return ((Boolean) C0955b.f5891h.m28964b()).booleanValue() || dj().mo2294a(12607818);
    }

    public final boolean dw() {
        return ((Boolean) C0955b.f5891h.m28964b()).booleanValue();
    }

    public final boolean dx() {
        return C6321a.m28962a() && ((Boolean) C0955b.gE.m28964b()).booleanValue();
    }

    public final void mo2014a(long j, String str) {
        FinskyLog.m21662b("Language: %s in %d ms", str, Long.valueOf(j));
        this.f8024r.m13371a(new C2474c(16).m13242b(j).f13342a, null);
    }

    public final void mo2013a(long j) {
        FinskyLog.m21662b("Blocked for %d ms", Long.valueOf(j));
        this.f8024r.m13371a(new C2474c(17).m13242b(j).f13342a, null);
    }

    public final synchronized C1182a aU() {
        if (this.ct == null) {
            this.ct = new C1182a();
        }
        return this.ct;
    }

    public final C3129a aX() {
        if (this.ba == null) {
            Context context = this.f7981b;
            C1182a aU = aU();
            if (this == null) {
                throw null;
            }
            this.ba = new C3129a(context, aU, this, bZ());
        }
        return this.ba;
    }

    public final C1557b aY() {
        if (this.bb == null) {
            Context context = this.f7981b;
            C2910a au = au();
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                C2206c ah = ah();
                C1287h aK = aK();
                C2199l ai = ai();
                if (this.bd == null) {
                    this.bd = new C1560c();
                }
                this.bb = new C1558a(context, au, this, this, this, ah, aK, ai, mo2045Y());
            }
        }
        return this.bb;
    }

    public final C2162a bn() {
        if (this.cq == null) {
            Context context = this.f7981b;
            C2471a aR = aR();
            C2171b bo = bo();
            C2206c ah = ah();
            C3646a I = mo2029I();
            C2320a L = mo2032L();
            if (this == null) {
                throw null;
            }
            this.cq = new C2163a(context, aR, bo, ah, I, L, this, this.f7981b.getPackageManager(), mo2259r(), mo2045Y());
        }
        return this.cq;
    }

    public final C2171b bo() {
        if (this.cr == null) {
            this.cr = new C2172i(mo2036P());
        }
        return this.cr;
    }

    public final ForegroundCoordinator bz() {
        if (this.cC == null) {
            this.cC = new ForegroundCoordinator(this.f7981b, C1186a.m7138a(this.f7981b), bB());
        }
        return this.cC;
    }

    public final ai bB() {
        if (this.cD == null) {
            this.cD = new ai(this.f7981b);
        }
        return this.cD;
    }

    public final C2824a bC() {
        if (this.cE == null) {
            this.cE = new C2824a(by());
        }
        return this.cE;
    }

    public final C2830g bD() {
        if (this.cF == null) {
            Context context = this.f7981b;
            if (this == null) {
                throw null;
            }
            this.cF = new C2830g(context, this);
        }
        return this.cF;
    }

    public final C2568a bI() {
        if (this.cI == null) {
            this.cI = new C2568a();
        }
        return this.cI;
    }

    public final C4562a bJ() {
        if (this.cK == null) {
            this.cK = new C4562a();
        }
        return this.cK;
    }

    public final C3982a bK() {
        if (this.bg == null) {
            this.bg = new C3983a(this.f7981b, bj());
        }
        return this.bg;
    }

    public final C2119c bL() {
        if (this.bh == null) {
            this.bh = new C2119c(bM());
        }
        return this.bh;
    }

    public final C2123g bM() {
        if (this.bi == null) {
            this.bi = new C2123g();
        }
        return this.bi;
    }

    final Handler dy() {
        if (this.bF == null) {
            if (dj().mo2294a(12636790)) {
                this.bE = C4674e.m21808a("FinskyApp");
            } else {
                this.bE = new HandlerThread("FinskyApp");
            }
            this.bE.start();
            this.bF = new Handler(this.bE.getLooper());
        }
        return this.bF;
    }

    final Handler dz() {
        if (this.bG == null) {
            this.bG = new Handler(Looper.getMainLooper());
        }
        return this.bG;
    }

    private final HandlerThread dK() {
        if (this.bB == null) {
            this.bB = new HandlerThread("libraries-thread", 10);
            this.bB.start();
        }
        return this.bB;
    }

    final Handler dA() {
        if (this.bD == null) {
            this.bD = new Handler(dK().getLooper());
        }
        return this.bD;
    }

    public final void mo2054a(Activity activity, SetupWizardParams setupWizardParams) {
        cs.m19400a(activity, setupWizardParams, true);
    }

    public final void mo2114b(Activity activity, SetupWizardParams setupWizardParams) {
        cs.m19405b(activity, setupWizardParams, true);
    }

    public final C2241g bN() {
        if (this.cO == null) {
            this.cO = new C2241g(mo2265x(), mo2033M(), bZ());
        }
        return this.cO;
    }

    public final C2174c cd() {
        if (this.be == null) {
            this.be = new C2175k();
        }
        return this.be;
    }

    public final C2734a bP() {
        if (this.cP == null) {
            this.cP = new C2734a(this.f7981b);
        }
        return this.cP;
    }

    public final C2257a bQ() {
        if (this.ej == null) {
            mo2029I();
            this.ej = new C2257a(bY());
        }
        return this.ej;
    }

    public final com.google.android.finsky.bg.af bR() {
        if (this.cQ == null) {
            this.cQ = new com.google.android.finsky.bg.af();
        }
        return this.cQ;
    }

    public final C2116a bT() {
        if (this.cV == null) {
            C1503a P = mo2036P();
            if (this == null) {
                throw null;
            } else if (this == null) {
                throw null;
            } else {
                this.cV = new C2116a(P, this, this);
            }
        }
        return this.cV;
    }

    public final C3879f bU() {
        if (this.cX == null) {
            C2363d aV = aV();
            if (this.cl == null) {
                this.cl = new C2360a(this.f7981b);
            }
            this.cX = new C3879f(aV, this.cl);
        }
        return this.cX;
    }

    public final C1527a bV() {
        if (this.f8020n == null) {
            this.f8020n = new C1527a();
        }
        return this.f8020n;
    }

    public final C2838a bW() {
        if (this.f8021o == null) {
            C2266a q = mo2258q();
            C1506e O = mo2035O();
            if (this == null) {
                throw null;
            }
            this.f8021o = new C2838a(q, O, this);
        }
        return this.f8021o;
    }

    public final C1203f bX() {
        if (this.cZ == null) {
            Context context = this.f7981b;
            C4817d bY = bY();
            if (this == null) {
                throw null;
            }
            this.cZ = new C1204g(context, bY, this);
        }
        return this.cZ;
    }

    public final C4817d bY() {
        if (this.da == null) {
            if (this.cY == null) {
                this.cY = new C4829r();
            }
            this.da = new C4818g(this.cY);
        }
        return this.da;
    }

    public final bb bZ() {
        if (this.db == null) {
            this.db = new bb(new ca(this), new cb(this));
        }
        return this.db;
    }

    public final com.google.android.finsky.scheduler.ak ca() {
        if (this.dc == null) {
            if (this == null) {
                throw null;
            }
            com.google.android.finsky.scheduler.bj bjVar = new com.google.android.finsky.scheduler.bj(this, new C4047y(), cb());
            Context context = this.f7981b;
            ai bB = bB();
            if (this == null) {
                throw null;
            }
            C4042t c4042t = new C4042t(context, bB, this, bjVar);
            Context context2 = this.f7981b;
            if (this == null) {
                throw null;
            }
            this.dc = new com.google.android.finsky.scheduler.ak(context2, this, new C4019a(this.f7981b), bY(), new C4036k(this.f7981b), c4042t, new C4034h(this.f7981b, c4042t), aR(), bjVar, dB(), bK());
        }
        return this.dc;
    }

    final aa dB() {
        if (this.dd == null) {
            this.dd = new aa(bX(), bY());
        }
        return this.dd;
    }

    public final bn cb() {
        if (this.de == null) {
            this.de = new bn(bX());
        }
        return this.de;
    }

    public final C3219f cc() {
        if (this.di == null) {
            this.di = new C3219f(this.f7981b, mo2267z());
        }
        return this.di;
    }

    public final C4238h cf() {
        if (this.dj == null) {
            this.dj = new C4238h();
        }
        return this.dj;
    }

    public final C1627b cg() {
        if (this.dk == null) {
            Context context = this.f7981b;
            C1626a c1626a = new C1626a();
            C1503a P = mo2036P();
            if (this == null) {
                throw null;
            }
            this.dk = new C1627b(context, P, this, dz());
        }
        return this.dk;
    }

    public final C2576a ch() {
        if (this.dl == null) {
            C1294w be = be();
            C1612l ar = ar();
            bR();
            this.dl = new C2576a(be, ar);
        }
        return this.dl;
    }

    public final C2581g cm() {
        if (this.dn == null) {
            this.dn = new C2581g(av(), cR());
        }
        return this.dn;
    }

    public final C2826c dC() {
        if (this.dr == null) {
            this.dr = new C2826c(mo2254m(), bD());
        }
        return this.dr;
    }

    public final C4229a cn() {
        if (this.ds == null) {
            C1503a P = mo2036P();
            if (this == null) {
                throw null;
            }
            this.ds = new C4229a(P, this, mo2245h());
        }
        return this.ds;
    }

    public final C4236d co() {
        if (this.dt == null) {
            if (this == null) {
                throw null;
            }
            C4229a cn = cn();
            if (this == null) {
                throw null;
            }
            if (this.du == null) {
                C0986a U = mo2041U();
                if (this == null) {
                    throw null;
                }
                C1011h ci = ci();
                C1542f G = mo2027G();
                C3027b bt = bt();
                C3028c bu = bu();
                Application application = this.f7981b;
                C3646a I = mo2029I();
                C1294w be = be();
                C4254d ct = ct();
                C1287h aK = aK();
                C2721l aO = aO();
                C2824a bC = bC();
                C1611k av = av();
                C1531a d = mo2223d();
                if (this == null) {
                    throw null;
                }
                C1556d ay = ay();
                C2127b c = mo2169c();
                C3322j p = mo2257p();
                C3340g bw = bw();
                C2171b bo = bo();
                C4237g dL = dL();
                C0002a ccVar = new cc(this);
                ccVar = new cd(this);
                ccVar = new cf(this);
                ccVar = new cg(this);
                C2206c ah = ah();
                com.google.android.finsky.stream.myapps.aa cq = cq();
                com.google.android.finsky.stream.myapps.ab W = mo2043W();
                C2266a q = mo2258q();
                C3851f m = mo2254m();
                ac h = mo2245h();
                com.google.android.finsky.playcard.ao cr = cr();
                C2826c dC = dC();
                C1600a cQ = cQ();
                com.google.android.finsky.bg.af bR = bR();
                if (this == null) {
                    throw null;
                }
                if (this.aM == null) {
                    this.aM = new C4241a();
                }
                C4241a c4241a = this.aM;
                C2288b X = mo2044X();
                if (this.en == null) {
                    this.en = new cu();
                }
                this.du = new C4226a(U, this, ci, G, bt, bu, application, I, be, ct, aK, aO, bC, av, d, this, ay, c, p, bw, bo, dL, ccVar, ccVar, ccVar, ccVar, ah, cq, W, q, m, h, cr, dC, cQ, bR, this, c4241a, X, this.en, bd());
            }
            C4225f c4225f = this.du;
            C2721l aO2 = aO();
            if (this == null) {
                throw null;
            }
            C1556d ay2 = ay();
            SearchRecentSuggestions bg = bg();
            cf();
            C2116a bT = bT();
            C4237g dL2 = dL();
            mo2044X();
            this.dt = new C4236d(this, cn, this, c4225f, aO2, this, ay2, bg, bT, dL2);
        }
        return this.dt;
    }

    private final C4237g dL() {
        if (this.dv == null) {
            if (this == null) {
                throw null;
            }
            C1556d ay = ay();
            if (this == null) {
                throw null;
            }
            this.dv = new C4237g(this, ay, this);
        }
        return this.dv;
    }

    public final com.google.android.finsky.stream.controllers.assist.security.ad cp() {
        if (this.dw == null) {
            Context context = this.f7981b;
            C3646a I = mo2029I();
            C3851f m = mo2254m();
            if (this.dq == null) {
                this.dq = new SecurityUtils(mo2029I(), this.f7981b.getPackageManager());
            }
            this.dw = new com.google.android.finsky.stream.controllers.assist.security.ad(context, I, m, this.dq, bp());
        }
        return this.dw;
    }

    public final com.google.android.finsky.stream.myapps.aa cq() {
        if (this.dx == null) {
            Application application = this.f7981b;
            if (this == null) {
                throw null;
            }
            this.dx = new com.google.android.finsky.stream.myapps.aa(application, this, ah(), bA(), mo2029I());
        }
        return this.dx;
    }

    public final com.google.android.finsky.playcard.ao cr() {
        com.google.android.finsky.playcard.ao aoVar;
        synchronized (f7983d) {
            if (this.dy == null) {
                if (this == null) {
                    throw null;
                }
                C1011h ci = ci();
                C1013j ce = ce();
                if (this == null) {
                    throw null;
                }
                C1542f G = mo2027G();
                C2456c j = mo2250j();
                C2206c ah = ah();
                C2288b X = mo2044X();
                C2457d i = mo2247i();
                C2576a ch = ch();
                C2581g cm = cm();
                C2233o Y = mo2045Y();
                C1294w be = be();
                if (this == null) {
                    throw null;
                }
                C1556d ay = ay();
                C1612l ar = ar();
                C1287h aK = aK();
                C2974a bd = bd();
                C3646a I = mo2029I();
                if (this == null) {
                    throw null;
                }
                C1527a bV = bV();
                C3934g f = mo2243f();
                C2162a bn = bn();
                mo2245h();
                this.dy = new com.google.android.finsky.playcard.ao(this, ci, ce, this, G, j, ah, X, i, ch, cm, Y, be, this, ay, ar, aK, bd, I, this, bV, f, bn, bw(), mo2254m(), mo2223d(), cB());
            }
            aoVar = this.dy;
        }
        return aoVar;
    }

    public final C1502a cs() {
        if (this.dz == null) {
            this.dz = new C1502a(mo2258q(), bB());
        }
        return this.dz;
    }

    public final C4254d ct() {
        if (this.dA == null) {
            if (this == null) {
                throw null;
            }
            this.dA = new C4254d(this);
        }
        return this.dA;
    }

    public final C1606f cu() {
        if (this.dB == null) {
            if (this == null) {
                throw null;
            }
            this.dB = new C1606f(this, ay());
        }
        return this.dB;
    }

    public final C3747c dD() {
        if (this.dD == null) {
            this.dD = new C3747c(this.f7981b);
        }
        return this.dD;
    }

    public final C1655h cw() {
        if (this.dJ == null) {
            if (this.dI == null) {
                Context context = this.f7981b;
                if (this.dH == null) {
                    this.dH = new C1661n(bZ());
                }
                this.dI = new C1648a(context, this.dH);
            }
            C1648a c1648a = this.dI;
            if (this == null) {
                throw null;
            }
            this.dJ = new C1655h(c1648a, this, mo2035O(), ah(), mo2032L());
        }
        return this.dJ;
    }

    public final C4693y cx() {
        if (this.dL == null) {
            this.dL = new C4693y();
        }
        return this.dL;
    }

    public final C3827b dE() {
        if (this.dO == null) {
            this.dO = new C3827b(aK());
        }
        return this.dO;
    }

    public final C3828c cy() {
        if (this.dQ == null) {
            this.dQ = new C3828c(bD(), bY(), mo2265x());
        }
        return this.dQ;
    }

    public final C3837c cC() {
        if (this.bl == null) {
            this.bl = new C3837c(this.f7981b);
        }
        return this.bl;
    }

    public final C4141c cz() {
        if (this.dT == null) {
            this.dT = new C4141c(this.f7981b);
        }
        return this.dT;
    }

    public final C0977e cA() {
        if (this.dU == null) {
            this.dU = new C0977e(bZ(), ai(), mo2254m());
        }
        return this.dU;
    }

    public final C2596w cB() {
        if (this.bm == null) {
            cm();
            this.bm = new C2596w();
        }
        return this.bm;
    }

    public final C2673u cE() {
        if (this.dV == null) {
            this.dV = new C2673u(this.f7981b);
        }
        return this.dV;
    }

    public final C4180m cG() {
        if (this.dX == null) {
            if (this == null) {
                throw null;
            }
            this.dX = new C4180m(this);
        }
        return this.dX;
    }

    public final C3903c cF() {
        if (this.dW == null) {
            this.dW = new C3903c();
        }
        return this.dW;
    }

    public final C4126m cN() {
        if (this.eg == null) {
            this.eg = new C4126m(this.f7981b, mo2223d(), aV());
        }
        return this.eg;
    }

    public final C4146c cI() {
        if (this.eb == null) {
            C3340g bw = bw();
            C3300k o = mo2256o();
            C2471a aR = aR();
            bs aS = aS();
            PackageManager packageManager = this.f7981b.getPackageManager();
            bw cL = cL();
            C1287h aK = aK();
            bu();
            this.eb = new C4147d(bw, o, aR, aS, packageManager, cL, aK);
        }
        return this.eb;
    }

    public final C4168h cJ() {
        if (this.ec == null) {
            Context context = this.f7981b;
            bs aS = aS();
            C1287h aK = aK();
            if (this == null) {
                throw null;
            }
            C0986a U = mo2041U();
            C4562a bJ = bJ();
            mo2257p();
            C4126m cN = cN();
            C2320a L = mo2032L();
            if (this.dZ == null) {
                this.dZ = new ao(this.f7981b, mo2041U());
            }
            ao aoVar = this.dZ;
            if (this.ea == null) {
                this.ea = new com.google.android.finsky.setup.af(this.f7981b);
            }
            this.ec = new C4169i(context, aS, aK, this, U, bJ, cN, L, aoVar, this.ea, cK(), cl(), cL(), bF());
        }
        return this.ec;
    }

    public final al cK() {
        if (this.ed == null) {
            C4126m cN = cN();
            if (this == null) {
                throw null;
            }
            this.ed = new am(cN, this);
        }
        return this.ed;
    }

    public final bw cL() {
        if (this.ee == null) {
            if (this == null) {
                throw null;
            }
            this.ee = new bw(this, aS());
        }
        return this.ee;
    }

    public final com.google.android.finsky.setup.bn cM() {
        if (this.ef == null) {
            this.ef = new bo();
        }
        return this.ef;
    }

    public final C4175h cH() {
        if (this.dY == null) {
            if (this == null) {
                throw null;
            }
            this.dY = new C4175h(this, mo2029I());
        }
        return this.dY;
    }

    public final C2969b cO() {
        if (this.eh == null) {
            this.eh = new C2970c(this.f7981b, mo2259r(), false);
        }
        return this.eh;
    }

    public final C2969b cP() {
        if (this.ei == null) {
            this.ei = new C2970c(this.f7981b, mo2259r(), true);
        }
        return this.ei;
    }

    public final C3835a cD() {
        if (this.bn == null) {
            this.bn = new C3835a(cC());
        }
        return this.bn;
    }

    public final C1600a cQ() {
        if (this.em == null) {
            this.em = new C1600a();
        }
        return this.em;
    }

    public final C1184a cR() {
        if (this.ek == null) {
            if (this == null) {
                throw null;
            }
            this.ek = new C1184a(this);
        }
        return this.ek;
    }

    public final C1237a cS() {
        if (this.el == null) {
            C1287h aK = aK();
            C2320a L = mo2032L();
            if (this == null) {
                throw null;
            }
            this.el = new C1237a(aK, L, new C3654j(this));
        }
        return this.el;
    }

    public final C4197a cT() {
        if (this.bu == null) {
            this.bu = new C4197a();
        }
        return this.bu;
    }

    public final C4203f cU() {
        if (this.bv == null) {
            this.bv = new C4203f(cV(), cT(), bw(), this.f7981b);
        }
        return this.bv;
    }

    public final com.google.android.finsky.splitinstallservice.ar cV() {
        if (this.bw == null) {
            this.bw = new com.google.android.finsky.splitinstallservice.ar(bX());
        }
        return this.bw;
    }

    public final C1136a cW() {
        if (this.bp == null) {
            if (this == null) {
                throw null;
            }
            this.bp = new C1136a(this);
        }
        return this.bp;
    }

    static final /* synthetic */ C3336h m8612a(C3336h c3336h) {
        return c3336h;
    }

    static final /* synthetic */ C2465r m8613a(C2465r c2465r) {
        return c2465r;
    }

    static final /* synthetic */ C3327a m8611a(C3327a c3327a) {
        return c3327a;
    }
}
