package com.google.android.finsky.setup;

import android.accounts.Account;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.as.C1503a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.cm.C2296c;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.cr.C2365a;
import com.google.android.finsky.cr.C2366c;
import com.google.android.finsky.cv.p177a.es;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.ec.C2968a;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.p107l.C3654j;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4679j;
import com.google.android.finsky.utils.C4687q;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProtoArray;
import com.google.android.finsky.utils.ad;
import com.google.android.play.image.x;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class RestoreService extends Service {
    public static RestoreService f20567h;
    public final C2471a f20568a = C1473m.f7980a.aR();
    public C1461c f20569b;
    public bx f20570c;
    public int f20571d;
    public bb f20572e;
    public boolean f20573f;
    public boolean f20574g;
    public int f20575i;
    public int f20576j;
    public int f20577k;
    public int f20578l;
    public Boolean f20579m = null;
    public C4687q f20580n;
    public C2296c f20581o;
    public int f20582p;
    public Map f20583q = new HashMap();
    public final Handler f20584r = new Handler(Looper.getMainLooper());
    public final BroadcastReceiver f20585s = new aq(this);

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

    public void onCreate() {
        f20567h = this;
        this.f20572e = new bb(this);
        registerReceiver(this.f20585s, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f20581o = C1473m.f7980a.mo2255n();
        this.f20582p = this.f20581o.mo2838a();
        try {
            this.f20580n = new C4687q(new File(C1473m.f7980a.f7981b.getCacheDir(), "restore.log"));
            FinskyLog.m21661b(this.f20580n);
        } catch (Throwable e) {
            FinskyLog.m21660a(e, "Cannot initialize internal log", new Object[0]);
        }
        this.f20569b = C1473m.f7980a.aN();
        C1473m.f7980a.bu();
    }

    public void onDestroy() {
        if (this.f20573f) {
            C1473m.f7980a.bw().mo3484b(this.f20572e);
        }
        unregisterReceiver(this.f20585s);
        this.f20572e = null;
        m19095a(1, null);
        m19094a();
        f20567h = null;
    }

    final void m19094a() {
        FinskyLog.m21658a(this.f20580n);
        C4679j.m21814a(this.f20580n);
    }

    public static void m19089a(Context context) {
        try {
            File[] listFiles = context.getDir("RestoreTracker", 0).listFiles();
            if (listFiles != null) {
                for (File delete : listFiles) {
                    delete.delete();
                }
            }
        } catch (Exception e) {
            FinskyLog.m21665c("Error while cleaning stores: %s", e);
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f20571d = i2;
        bb bbVar = this.f20572e;
        bbVar.f20858g++;
        Runnable asVar = new as(this, intent);
        bb bbVar2 = this.f20572e;
        Context applicationContext = getApplicationContext();
        if (bbVar2.f20852a == null) {
            bbVar2.f20852a = new C2366c(new C2365a(applicationContext.getDir("RestoreTracker", 0), "account-"));
            bbVar2.f20852a.m12009a(new bc(bbVar2, asVar));
        } else {
            bbVar2.f20852a.m12009a(asVar);
        }
        bbVar2 = this.f20572e;
        applicationContext = getApplicationContext();
        if (bbVar2.f20853b == null) {
            bbVar2.f20853b = new C2366c(new C2365a(applicationContext.getDir("RestoreTracker", 0), "package-"));
            bbVar2.f20853b.m12009a(new bd(bbVar2, asVar));
        } else {
            bbVar2.f20853b.m12009a(asVar);
        }
        C1473m.f7980a.ah().mo2815a(asVar);
        C1473m.f7980a.mo2029I().m17248a(asVar);
        return 3;
    }

    final boolean m19099a(Intent intent) {
        if (intent.getBooleanExtra("startup", false)) {
            this.f20579m = Boolean.valueOf(m19093c());
            if (this.f20579m.booleanValue()) {
                C1473m.f7980a.aS().mo3948a("startup");
            }
            return this.f20579m.booleanValue();
        }
        this.f20579m = null;
        if (intent.getBooleanExtra("kick_installer", false)) {
            C1473m.f7980a.aS().mo3948a("installer_kick");
            C1473m.f7980a.mo2256o().mo3428a();
            return false;
        }
        String stringExtra;
        if (intent.hasExtra("package")) {
            C1473m.f7980a.aS().mo3948a("recover");
            stringExtra = intent.getStringExtra("package");
            C1473m.f7980a.bu();
            if (C3028c.m15628a(C1473m.f7980a.bw().mo3482b(stringExtra))) {
                return true;
            }
            return m19090a(stringExtra);
        }
        if (intent.hasExtra("allow_mobile_data")) {
            bb bbVar = this.f20572e;
            C3300k o = C1473m.f7980a.mo2256o();
            for (String stringExtra2 : bbVar.f20855d.keySet()) {
                if (((ay) bbVar.f20860i.f20572e.f20855d.get(stringExtra2)).f20814g) {
                    ay ayVar = (ay) bbVar.f20855d.get(stringExtra2);
                    if (ayVar == null) {
                        FinskyLog.m21659a("Unexpected missing package %s, can't confirm block on WiFi", stringExtra2);
                    } else {
                        ayVar.f20818k = 1;
                        bbVar.m19264e(stringExtra2);
                    }
                    o.mo3448c(stringExtra2);
                }
            }
            if (!(((Boolean) C0955b.hP.m28964b()).booleanValue() || bbVar.f20860i.f20569b.dj().mo2294a(12623761))) {
                o.mo3428a();
            }
            bbVar.m19260b();
            return false;
        }
        String str;
        if (intent.hasExtra("array_packages")) {
            String stringExtra3 = intent.getStringExtra("authAccount");
            boolean booleanExtra = intent.getBooleanExtra("visible", false);
            String[] stringArrayExtra = intent.getStringArrayExtra("array_packages");
            int[] intArrayExtra = intent.getIntArrayExtra("array_version_codes");
            String[] stringArrayExtra2 = intent.getStringArrayExtra("array_titles");
            int[] intArrayExtra2 = intent.getIntArrayExtra("array_priorities");
            String[] stringArrayExtra3 = intent.getStringArrayExtra("array_delivery_tokens");
            String[] stringArrayExtra4 = intent.getStringArrayExtra("array_app_icon_urls");
            es[] esVarArr = (es[]) ParcelableProtoArray.m21676a(intent, "install_details");
            boolean booleanExtra2 = intent.getBooleanExtra("is_vpa", false);
            int[] intArrayExtra3 = intent.getIntArrayExtra("network_type");
            C1473m.f7980a.aS().mo3957a(stringExtra3, stringArrayExtra, intArrayExtra, booleanExtra2);
            boolean z = !C1473m.f7980a.bP().m14777b();
            int i = 0;
            int i2 = 0;
            while (i < stringArrayExtra.length) {
                Object obj;
                int i3;
                String str2 = stringArrayExtra3 != null ? stringArrayExtra3[i] : null;
                str = stringArrayExtra[i];
                int i4 = intArrayExtra[i];
                String str3 = stringArrayExtra2[i];
                int i5 = intArrayExtra2[i];
                CharSequence charSequence = stringArrayExtra4[i];
                es esVar = esVarArr != null ? esVarArr[i] : null;
                int i6 = intArrayExtra3[i];
                C3300k o2 = C1473m.f7980a.mo2256o();
                if (m19100a(str, i4, stringExtra3, booleanExtra2, C1473m.f7980a.bw(), esVar)) {
                    m19096a(str, i6, booleanExtra2);
                    this.f20572e.m19258a(str, i4, stringExtra3, str3, i5, str2, booleanExtra, charSequence, booleanExtra2, i6, esVar);
                    o2.mo3440a(str, m19092b(), false, false);
                    if (!TextUtils.isEmpty(str2)) {
                        o2.mo3437a(str, str2);
                    }
                    C2495w a = this.f20568a.m13184a(booleanExtra2 ? "restore_vpa" : "restore");
                    if (booleanExtra2) {
                        o2.mo3455i(str);
                    }
                    if (i5 == 1) {
                        o2.mo3452f(str);
                    }
                    if (((Boolean) C0955b.hP.m28964b()).booleanValue()) {
                        o2.mo3432a(str, i4, stringExtra3, str3, i5, esVar, a);
                    } else {
                        o2.mo3434a(str, i4, stringExtra3, str3, z, i5, esVar, a);
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        m19098a(str, (String) charSequence);
                    }
                    obj = 1;
                } else {
                    obj = null;
                }
                if (obj != null) {
                    i3 = i2 + 1;
                } else {
                    i3 = i2;
                }
                i++;
                i2 = i3;
            }
            FinskyLog.m21659a("Start restore of %d packages (%d skipped) for acct:%s (deferred = %b)", Integer.valueOf(stringArrayExtra.length), Integer.valueOf(stringArrayExtra.length - i2), FinskyLog.m21655a(stringExtra3), Boolean.valueOf(z));
            if (i2 > 0) {
                if (z) {
                    C1473m.f7980a.cK().mo3919a(getApplicationContext(), ((Long) C0955b.bi.m28964b()).longValue());
                }
                this.f20572e.m19260b();
            }
            return false;
        }
        if (intent.hasExtra("finish_session")) {
            C0954a.bh.m5763a(Integer.valueOf(0));
            C0954a.bi.m5763a(Integer.valueOf(0));
            return false;
        }
        C1473m.f7980a.aS().mo3948a("restore_accounts");
        try {
            str = C1473m.f7980a.cK().mo3921a(intent);
            stringExtra2 = intent.getStringExtra("authAccount");
            if (stringExtra2 == null) {
                Account[] d = C1473m.f7980a.mo2041U().mo1188d();
                if (d.length <= 0) {
                    C1473m.f7980a.aS().mo3945a(3);
                    FinskyLog.m21667d("RestoreService can't run - no accounts configured on device!", new Object[0]);
                    return false;
                }
                for (Account account : d) {
                    m19091b(str, account.name);
                }
            } else if (C1473m.f7980a.mo2041U().mo1183b(stringExtra2) == null) {
                C1473m.f7980a.aS().mo3945a(2);
                FinskyLog.m21667d("Can't find restore acct:%s", FinskyLog.m21655a(stringExtra2));
                return false;
            } else {
                m19091b(str, stringExtra2);
            }
            return true;
        } catch (Throwable e) {
            C1473m.f7980a.aS().mo3945a(1);
            FinskyLog.m21660a(e, "Could not read Android ID", new Object[0]);
            return false;
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m19093c() {
        /*
        r14 = this;
        r6 = 1;
        r3 = 0;
        r0 = r14.f20574g;	 Catch:{ Exception -> 0x00e5 }
        if (r0 == 0) goto L_0x0010;
    L_0x0006:
        r0 = "Redelivery of startup intent - dropping it";
        r1 = 0;
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x00e5 }
        com.google.android.finsky.utils.FinskyLog.m21665c(r0, r1);	 Catch:{ Exception -> 0x00e5 }
        r0 = r3;
    L_0x000f:
        return r0;
    L_0x0010:
        r0 = 1;
        r14.f20574g = r0;	 Catch:{ Exception -> 0x00e5 }
        r0 = r14.f20572e;	 Catch:{ Exception -> 0x00e5 }
        r0 = r0.f20854c;	 Catch:{ Exception -> 0x00e5 }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x00e5 }
        if (r0 != 0) goto L_0x0056;
    L_0x001d:
        r0 = r14.f20572e;	 Catch:{ Exception -> 0x00e5 }
        r0 = r0.f20854c;	 Catch:{ Exception -> 0x00e5 }
        r0 = r0.keySet();	 Catch:{ Exception -> 0x00e5 }
        r2 = r0.iterator();	 Catch:{ Exception -> 0x00e5 }
        r1 = r3;
    L_0x002a:
        r0 = r2.hasNext();	 Catch:{ Exception -> 0x00e5 }
        if (r0 == 0) goto L_0x0057;
    L_0x0030:
        r0 = r2.next();	 Catch:{ Exception -> 0x00e5 }
        r0 = (java.lang.String) r0;	 Catch:{ Exception -> 0x00e5 }
        r1 = "Recover fetch for account %s";
        r4 = 1;
        r4 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x00e5 }
        r5 = 0;
        r7 = com.google.android.finsky.utils.FinskyLog.m21655a(r0);	 Catch:{ Exception -> 0x00e5 }
        r4[r5] = r7;	 Catch:{ Exception -> 0x00e5 }
        com.google.android.finsky.utils.FinskyLog.m21659a(r1, r4);	 Catch:{ Exception -> 0x00e5 }
        r1 = r14.f20572e;	 Catch:{ Exception -> 0x00e5 }
        r1 = r1.f20854c;	 Catch:{ Exception -> 0x00e5 }
        r1 = r1.get(r0);	 Catch:{ Exception -> 0x00e5 }
        r1 = (com.google.android.finsky.setup.aw) r1;	 Catch:{ Exception -> 0x00e5 }
        r1 = r1.f20805b;	 Catch:{ Exception -> 0x00e5 }
        r14.m19091b(r1, r0);	 Catch:{ Exception -> 0x00e5 }
        r1 = r6;
        goto L_0x002a;
    L_0x0056:
        r1 = r3;
    L_0x0057:
        r0 = r14.f20572e;	 Catch:{ Exception -> 0x00e5 }
        r0 = r0.f20855d;	 Catch:{ Exception -> 0x00e5 }
        r0 = r0.isEmpty();	 Catch:{ Exception -> 0x00e5 }
        if (r0 != 0) goto L_0x00f7;
    L_0x0061:
        r0 = com.google.android.finsky.C1473m.f7980a;	 Catch:{ Exception -> 0x00e5 }
        r7 = r0.bw();	 Catch:{ Exception -> 0x00e5 }
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x00e5 }
        r2 = r14.f20572e;	 Catch:{ Exception -> 0x00e5 }
        r2 = r2.f20855d;	 Catch:{ Exception -> 0x00e5 }
        r2 = r2.keySet();	 Catch:{ Exception -> 0x00e5 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x00e5 }
        r0 = (java.util.ArrayList) r0;	 Catch:{ Exception -> 0x00e5 }
        r8 = r0.size();	 Catch:{ Exception -> 0x00e5 }
        r2 = r3;
        r4 = r1;
    L_0x007c:
        if (r2 >= r8) goto L_0x00db;
    L_0x007e:
        r1 = r0.get(r2);	 Catch:{ Exception -> 0x00e5 }
        r5 = r2 + 1;
        r1 = (java.lang.String) r1;	 Catch:{ Exception -> 0x00e5 }
        r2 = com.google.android.finsky.C1473m.f7980a;	 Catch:{ Exception -> 0x00e5 }
        r2.bu();	 Catch:{ Exception -> 0x00e5 }
        r2 = r7.mo3482b(r1);	 Catch:{ Exception -> 0x00e5 }
        r2 = com.google.android.finsky.p198f.C3028c.m15628a(r2);	 Catch:{ Exception -> 0x00e5 }
        if (r2 == 0) goto L_0x0098;
    L_0x0095:
        r2 = r5;
        r4 = r6;
        goto L_0x007c;
    L_0x0098:
        r2 = r14.f20572e;	 Catch:{ Exception -> 0x00e5 }
        r2 = r2.f20855d;	 Catch:{ Exception -> 0x00e5 }
        r2 = r2.get(r1);	 Catch:{ Exception -> 0x00e5 }
        r2 = (com.google.android.finsky.setup.ay) r2;	 Catch:{ Exception -> 0x00e5 }
        if (r2 == 0) goto L_0x00f5;
    L_0x00a4:
        r10 = r2.f20816i;	 Catch:{ Exception -> 0x00e5 }
        r12 = 0;
        r9 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1));
        if (r9 == 0) goto L_0x00c3;
    L_0x00ac:
        r10 = r2.f20816i;	 Catch:{ Exception -> 0x00e5 }
        r2 = com.google.android.finsky.aa.C0955b.bm;	 Catch:{ Exception -> 0x00e5 }
        r2 = r2.m28964b();	 Catch:{ Exception -> 0x00e5 }
        r2 = (java.lang.Long) r2;	 Catch:{ Exception -> 0x00e5 }
        r12 = r2.longValue();	 Catch:{ Exception -> 0x00e5 }
        r10 = r10 + r12;
        r12 = java.lang.System.currentTimeMillis();	 Catch:{ Exception -> 0x00e5 }
        r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1));
        if (r2 < 0) goto L_0x00f5;
    L_0x00c3:
        r2 = "Overdue alarm for %s so retry immediately";
        r9 = 1;
        r9 = new java.lang.Object[r9];	 Catch:{ Exception -> 0x00e5 }
        r10 = 0;
        r9[r10] = r1;	 Catch:{ Exception -> 0x00e5 }
        com.google.android.finsky.utils.FinskyLog.m21659a(r2, r9);	 Catch:{ Exception -> 0x00e5 }
        r2 = r14.m19090a(r1);	 Catch:{ Exception -> 0x00e5 }
        if (r2 != 0) goto L_0x00d9;
    L_0x00d4:
        r2 = r14.f20572e;	 Catch:{ Exception -> 0x00e5 }
        r2.m19262c(r1);	 Catch:{ Exception -> 0x00e5 }
    L_0x00d9:
        r2 = r5;
        goto L_0x007c;
    L_0x00db:
        r0 = r4;
    L_0x00dc:
        if (r0 == 0) goto L_0x000f;
    L_0x00de:
        r1 = r14.f20572e;	 Catch:{ Exception -> 0x00e5 }
        r1.m19260b();	 Catch:{ Exception -> 0x00e5 }
        goto L_0x000f;
    L_0x00e5:
        r0 = move-exception;
        r1 = "Exception restarting: %s";
        r2 = new java.lang.Object[r6];
        r2[r3] = r0;
        com.google.android.finsky.utils.FinskyLog.m21665c(r1, r2);
        m19089a(r14);
        r0 = r3;
        goto L_0x000f;
    L_0x00f5:
        r2 = r5;
        goto L_0x007c;
    L_0x00f7:
        r0 = r1;
        goto L_0x00dc;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.setup.RestoreService.c():boolean");
    }

    private final boolean m19090a(String str) {
        C3300k o = C1473m.f7980a.mo2256o();
        C3340g bw = C1473m.f7980a.bw();
        if (this.f20572e.m19263d(str)) {
            ay ayVar = (ay) this.f20572e.f20855d.get(str);
            if (m19100a(str, ayVar.f20809b, ayVar.f20810c, ayVar.f20817j, bw, ayVar.f20819l)) {
                m19096a(str, ayVar.f20818k, ayVar.f20817j);
                this.f20572e.m19258a(str, ayVar.f20809b, ayVar.f20810c, ayVar.f20811d, ayVar.f20812e, ayVar.f20813f, ayVar.f20814g, ayVar.f20815h, ayVar.f20817j, ayVar.f20818k, ayVar.f20819l);
                o.mo3440a(str, m19092b(), false, false);
                if (!TextUtils.isEmpty(ayVar.f20813f)) {
                    o.mo3437a(str, ayVar.f20813f);
                }
                C2495w a = this.f20568a.m13184a(ayVar.f20817j ? "restore_vpa" : "restore");
                if (ayVar.f20817j) {
                    o.mo3455i(str);
                }
                if (ayVar.f20812e == 1) {
                    o.mo3452f(str);
                }
                o.mo3432a(str, ayVar.f20809b, ayVar.f20810c, ayVar.f20811d, ayVar.f20812e, ayVar.f20819l, a);
                if (!TextUtils.isEmpty(ayVar.f20815h)) {
                    m19098a(str, ayVar.f20815h);
                }
                return true;
            }
            this.f20572e.m19262c(str);
            return false;
        }
        this.f20572e.m19262c(str);
        return false;
    }

    final void m19096a(String str, int i, boolean z) {
        int i2 = (C1503a.m8831b(getApplicationContext()) && C2968a.m15380a(this).m15384c() && z) ? 1 : 0;
        if (!((Boolean) C0955b.hv.m28964b()).booleanValue() || i2 != 0) {
            C3300k o = C1473m.f7980a.mo2256o();
            switch (i) {
                case 0:
                    o.mo3444b(str);
                    if (i2 != 0) {
                        C1473m.f7980a.cP().mo3210a(str);
                        return;
                    }
                    return;
                case 1:
                    o.mo3431a(str);
                    return;
                default:
                    String str2 = "Unknown network type restriction for ";
                    String valueOf = String.valueOf(str);
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    FinskyLog.m21665c(valueOf, new Object[0]);
                    return;
            }
        }
    }

    private final void m19091b(String str, String str2) {
        aw awVar = (aw) this.f20572e.f20854c.get(str2);
        boolean z = awVar != null && awVar.f20806c;
        if (z) {
            FinskyLog.m21659a("Skip restore acct:%s already started", FinskyLog.m21655a(str2));
            return;
        }
        try {
            long parseLong = Long.parseLong(str, 16);
            C1473m.f7980a.aS().mo3962c(str2, this.f20572e.m19255a(str2));
            FinskyLog.m21659a("Start restore aid:%s acct:%s", FinskyLog.m21655a(str), FinskyLog.m21655a(str2));
            bb bbVar = this.f20572e;
            awVar = (aw) bbVar.f20854c.get(str2);
            if (awVar == null) {
                awVar = new aw();
                awVar.f20804a = 0;
                bbVar.f20854c.put(str2, awVar);
            }
            awVar.f20804a++;
            awVar.f20805b = str;
            awVar.f20806c = true;
            bbVar.m19261b(str2);
            C1473m.f7980a.bJ().m21190a(C1473m.f7980a.mo2112b(str2), C2693e.m14552a(), parseLong, new ba(this, str2), new at(this, str2, str));
        } catch (NumberFormatException e) {
            C1473m.f7980a.aS().mo3945a(1);
            FinskyLog.m21667d("Provided aid can't be parsed as long: %s", FinskyLog.m21655a(str));
        }
    }

    final boolean m19100a(String str, int i, String str2, boolean z, C3340g c3340g, es esVar) {
        ay ayVar = (ay) this.f20572e.f20855d.get(str);
        if (ayVar != null && !this.f20572e.m19263d(str)) {
            this.f20578l++;
            C1473m.f7980a.aS().mo3953a(str2, str, i, z, "retry-expired");
            return false;
        } else if (ayVar == null || ad.m21692a(str2, ayVar.f20810c)) {
            C1473m.f7980a.bu();
            if (C3028c.m15628a(c3340g.mo3482b(str))) {
                this.f20575i++;
                C1473m.f7980a.aS().mo3953a(str2, str, i, z, "is-tracked");
                FinskyLog.m21659a("Skipping restore of %s because already restoring", str);
                return false;
            }
            C2322b a = C1473m.f7980a.mo2032L().mo2854a(str);
            if (new C3654j(this.f20569b).m17260a(i, esVar, null).m17262a(a).m17269e()) {
                C1473m.f7980a.mo2266y().mo3823a(str);
                this.f20577k++;
                C1473m.f7980a.aS().mo3952a(str2, str, i, z, a.f11419d);
                FinskyLog.m21659a("Skipping restore of %s v:%d because v:%d is installed", str, Integer.valueOf(i), Integer.valueOf(a.f11419d));
                ayVar = new ay();
                ayVar.f20810c = str2;
                ayVar.f20809b = a.f11419d;
                return false;
            } else if (a == null || ((Boolean) C0955b.gu.m28964b()).booleanValue() || !C3028c.m15629a(a)) {
                FinskyLog.m21659a("Should attempt restore of %s", str);
                return true;
            } else {
                C1473m.f7980a.aS().mo3953a(str2, str, i, z, "is-preview");
                FinskyLog.m21659a("Skipping restore of %s because installed v=%d is preview (targetSdk=%d)", str, Integer.valueOf(a.f11419d), Integer.valueOf(a.f11427l));
                ayVar = new ay();
                ayVar.f20810c = str2;
                ayVar.f20809b = a.f11419d;
                return false;
            }
        } else {
            this.f20576j++;
            C1473m.f7980a.aS().mo3953a(str2, str, i, z, "other-account");
            FinskyLog.m21659a("Skipping restore of %s v:%d because already restoring for another account", str, Integer.valueOf(i));
            return false;
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    final void m19098a(String str, String str2) {
        if (this.f20582p < 0 || TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.f20583q.containsKey(str)) {
            FinskyLog.m21665c("Request for already-downloading bitmap for %s", str);
            return;
        }
        bb bbVar = this.f20572e;
        ax axVar = (ax) bbVar.f20856e.get(str);
        if (axVar == null) {
            axVar = new ax();
            axVar.f20807a = 0;
            bbVar.f20856e.put(str, axVar);
        }
        r0.f20807a++;
        x b = C1473m.f7980a.be().mo1677b(str2, this.f20582p, this.f20582p, new au(this, str));
        Bitmap b2 = b.b();
        if (b2 != null) {
            FinskyLog.m21659a("Received cached bitmap for %s", str);
            m19097a(str, b2);
            return;
        }
        FinskyLog.m21659a("Waiting for bitmap for %s", str);
        this.f20583q.put(str, b);
    }

    final void m19097a(String str, Bitmap bitmap) {
        this.f20581o.mo2844a(str, bitmap);
        this.f20572e.m19265f(str);
    }

    final void m19095a(int i, String str) {
        if (this.f20570c != null) {
            this.f20570c.mo3913a(i, str);
            if (i == 1) {
                this.f20570c = null;
            }
        }
    }

    protected void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f20580n.m21834a(printWriter);
    }

    static boolean m19092b() {
        return C4671b.m21788e() && !((Boolean) C0955b.fc.m28964b()).booleanValue();
    }
}
