package com.google.android.finsky.wear;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.gms.common.api.C5058o;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import java.util.ArrayList;
import java.util.List;

public class WearSupportService extends Service {
    public int f24754a;
    public List f24755b;
    public ak f24756c;
    public ar f24757d;
    public C4784e f24758e;
    public int f24759f = 0;
    public int f24760g = 0;
    public cc f24761h = new bn(this);
    public C4780a f24762i = new br(this);

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

    public static void m22416a(Context context, String str, boolean z) {
        if (z && !((Boolean) C0955b.ew.m28964b()).booleanValue()) {
            FinskyLog.m21659a("Wear auto install disabled for package %s", str);
        } else if (z || ((Boolean) C0955b.ex.m28964b()).booleanValue()) {
            Context applicationContext = context.getApplicationContext();
            Intent intent = new Intent(applicationContext, WearSupportService.class);
            String str2 = "wearsupportservice://auto_install_uninstall/";
            String valueOf = String.valueOf(str);
            intent.setData(Uri.parse(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2)));
            intent.putExtra("command", z ? "auto_install" : "auto_uninstall");
            intent.putExtra("package_name", str);
            C1473m.f7980a.al().m22452a(applicationContext, intent);
        } else {
            FinskyLog.m21659a("Wear auto uninstall disabled for package %s", str);
        }
    }

    public static void m22415a(Context context) {
        Context applicationContext = context.getApplicationContext();
        Intent intent = new Intent(applicationContext, WearSupportService.class);
        intent.setData(Uri.parse("wearsupportservice://send_installed_apps"));
        intent.putExtra("command", "send_installed_apps");
        C1473m.f7980a.al().m22452a(applicationContext, intent);
    }

    public void onCreate() {
        super.onCreate();
        this.f24756c = C1473m.f7980a.al();
        this.f24757d = C1473m.f7980a.an();
        this.f24758e = C1473m.f7980a.ak();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f24754a = i2;
        if (VERSION.SDK_INT < 18) {
            FinskyLog.m21659a("Not supported on API %d device", Integer.valueOf(VERSION.SDK_INT));
            m22422b();
            return 2;
        }
        FinskyLog.m21659a("Starting WearSupportService for %s", intent.getStringExtra("command"));
        this.f24760g++;
        Runnable bsVar = new bs(this, intent);
        C1473m.f7980a.ah().mo2815a(bsVar);
        this.f24756c.m22457a(bsVar, (Object) this);
        return 3;
    }

    public void onDestroy() {
        this.f24756c.m22455a((Object) this);
    }

    final synchronized void m22420a(String str) {
        if (this.f24755b == null) {
            this.f24755b = new ArrayList();
        }
        this.f24755b.add(str);
    }

    final synchronized void m22423b(String str) {
        this.f24755b.remove(str);
        m22419a();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final synchronized void m22419a() {
        /*
        r5 = this;
        r0 = 1;
        r1 = 0;
        monitor-enter(r5);
        com.google.android.finsky.utils.bb.m21791a();	 Catch:{ all -> 0x0061 }
        r2 = com.google.android.finsky.wear.ak.m22449d();	 Catch:{ all -> 0x0061 }
        if (r2 != 0) goto L_0x0025;
    L_0x000c:
        r2 = r5.f24757d;	 Catch:{ all -> 0x0061 }
        r3 = "hygiene_reason_daily";
        r4 = r2.f24820d;	 Catch:{ all -> 0x0061 }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x0061 }
        if (r3 == 0) goto L_0x0023;
    L_0x0018:
        r2 = r2.m22470a();	 Catch:{ all -> 0x0061 }
        if (r2 != 0) goto L_0x0023;
    L_0x001e:
        r2 = r0;
    L_0x001f:
        if (r2 == 0) goto L_0x0025;
    L_0x0021:
        monitor-exit(r5);
        return;
    L_0x0023:
        r2 = r1;
        goto L_0x001f;
    L_0x0025:
        r2 = r5.f24757d;	 Catch:{ all -> 0x0061 }
        r3 = "hygiene_reason_daily";
        r4 = r2.f24820d;	 Catch:{ all -> 0x0061 }
        r3 = r3.equals(r4);	 Catch:{ all -> 0x0061 }
        if (r3 != 0) goto L_0x0064;
    L_0x0031:
        r2 = r2.m22470a();	 Catch:{ all -> 0x0061 }
        if (r2 != 0) goto L_0x0064;
    L_0x0037:
        if (r0 != 0) goto L_0x0021;
    L_0x0039:
        r0 = r5.f24760g;	 Catch:{ all -> 0x0061 }
        if (r0 > 0) goto L_0x0021;
    L_0x003d:
        r0 = r5.f24755b;	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0049;
    L_0x0041:
        r0 = r5.f24755b;	 Catch:{ all -> 0x0061 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0021;
    L_0x0049:
        r0 = r5.f24756c;	 Catch:{ all -> 0x0061 }
        r0 = r0.f24798h;	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0059;
    L_0x004f:
        r0 = r5.f24756c;	 Catch:{ all -> 0x0061 }
        r0 = r0.f24798h;	 Catch:{ all -> 0x0061 }
        r0 = r0.m22551a();	 Catch:{ all -> 0x0061 }
        if (r0 == 0) goto L_0x0021;
    L_0x0059:
        r0 = r5.f24759f;	 Catch:{ all -> 0x0061 }
        if (r0 > 0) goto L_0x0021;
    L_0x005d:
        r5.m22422b();	 Catch:{ all -> 0x0061 }
        goto L_0x0021;
    L_0x0061:
        r0 = move-exception;
        monitor-exit(r5);
        throw r0;
    L_0x0064:
        r0 = r1;
        goto L_0x0037;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.wear.WearSupportService.a():void");
    }

    final void m22421a(String str, boolean z) {
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        this.f24760g++;
        C5058o c5058o = this.f24756c.f24792b;
        this.f24756c.m22458b();
        this.f24756c.f24797g.m22485a(host, new bt(this, parse, host, c5058o, z, str));
    }

    final void m22422b() {
        FinskyLog.m21659a("Stopping WearSupportService", new Object[0]);
        new Handler(Looper.getMainLooper()).post(new al(this.f24756c));
        stopSelf(this.f24754a);
    }
}
