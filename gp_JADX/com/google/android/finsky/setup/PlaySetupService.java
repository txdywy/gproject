package com.google.android.finsky.setup;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.os.StrictMode;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.cq.C2361b;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.play.utils.c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6331c;
import com.google.p169b.p170a.p171a.p172a.p173a.p174a.C6332e;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.nano.bx;
import com.google.wireless.android.finsky.dfe.nano.ci;
import com.google.wireless.android.finsky.dfe.nano.ck;
import com.google.wireless.android.finsky.dfe.nano.fp;
import com.google.wireless.android.finsky.dfe.nano.fr;
import com.google.wireless.android.p360b.p361a.C6333b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class PlaySetupService extends Service implements C1003o {
    public final C2471a f20548a = C1473m.f7980a.aR();
    public int f20549b;
    public int f20550c = 0;
    public Bundle f20551d;
    public String f20552e;
    public Semaphore f20553f = null;
    public boolean f20554g;
    public boolean f20555h;
    public C4191x f20556i;
    public bw f20557j;

    class C41135 extends ResultReceiver {
        public final /* synthetic */ CountDownLatch f20547a;

        C41135(Handler handler, CountDownLatch countDownLatch) {
            this.f20547a = countDownLatch;
            super(handler);
        }

        protected void onReceiveResult(int i, Bundle bundle) {
            if (i == 1) {
                this.f20547a.countDown();
            }
        }
    }

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
        if (!((Boolean) C0954a.bj.m5760a()).booleanValue()) {
            C1473m.f7980a.aS().mo3944a();
            C0954a.bj.m5763a(Boolean.valueOf(true));
        }
        return new C4183p(this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        this.f20549b = i2;
        this.f20550c++;
        C1473m.f7980a.mo2029I().m17248a(new C4184q(this, intent));
        return 3;
    }

    final void m19076a() {
        bb.m21791a();
        if (this.f20550c == 0 && this.f20552e == null) {
            if (this.f20555h) {
                C1473m.f7980a.bw().mo3484b((C1003o) this);
                this.f20555h = false;
            }
            stopSelf(this.f20549b);
        }
    }

    public void onCreate() {
        this.f20553f = new Semaphore(1);
        this.f20556i = new C4191x(getPackageManager());
        this.f20557j = C1473m.f7980a.cL();
    }

    public void onDestroy() {
        if (this.f20555h) {
            C1473m.f7980a.bw().mo3484b((C1003o) this);
            this.f20555h = false;
        }
        this.f20553f = null;
        this.f20557j = null;
    }

    final Bundle m19079b() {
        StrictMode.noteSlowCall("PlaySetupService.doGetEarlyUpdate");
        if (!((Boolean) C0955b.ek.m28964b()).booleanValue()) {
            return null;
        }
        int i;
        C6333b c;
        try {
            this.f20553f.tryAcquire(((Long) C0955b.el.m28964b()).longValue(), TimeUnit.MILLISECONDS);
            this.f20553f.release();
        } catch (InterruptedException e) {
            FinskyLog.m21669e("Deadlocked - race condition longer than expected?", new Object[0]);
        }
        synchronized (this) {
            if (this.f20551d == null) {
                i = 1;
            } else {
                i = 0;
            }
            this.f20551d = null;
        }
        if (i != 0) {
            C1473m.f7980a.aS().mo3949a(null, 3);
        }
        try {
            c = C2693e.m14552a().mo3115c();
        } catch (Throwable e2) {
            FinskyLog.m21663b(e2, "Exception while getting device configuration.", new Object[0]);
            c = null;
        }
        C1254c ao = C1473m.f7980a.ao();
        C0660x agVar = new ag();
        ao.mo1559a(c, agVar, (C0657w) agVar);
        ck ckVar = (ck) this.f20557j.m19364a(ao, agVar, "Error while loading early update");
        if (ckVar == null) {
            C1473m.f7980a.aS().mo3960b(null, 3);
            return null;
        }
        FinskyLog.m21659a("Received EarlyUpdate with %d entries", Integer.valueOf(ckVar.a.length));
        PackageManager packageManager = C1473m.f7980a.f7981b.getPackageManager();
        ci[] ciVarArr = ckVar.a;
        int length = ciVarArr.length;
        int i2 = 0;
        Bundle bundle = null;
        int i3 = 0;
        while (i2 < length) {
            Bundle bundle2;
            int i4;
            ci ciVar = ciVarArr[i2];
            String str = ciVar.c.f11833b;
            if (!((Boolean) C0954a.ba.m5777b(str).m5760a()).booleanValue()) {
                try {
                    i = packageManager.getPackageInfo(str, 0).versionCode;
                } catch (NameNotFoundException e3) {
                    i = 0;
                }
                if (i < ciVar.e) {
                    i3++;
                    if (bundle == null) {
                        bundle2 = new Bundle();
                        bundle2.putString("package_name", str);
                        bundle2.putInt("version_code", ciVar.e);
                        bundle2.putString("title", ciVar.d);
                        bundle2.putBoolean("critical", ciVar.g);
                        i4 = i3;
                        i2++;
                        i3 = i4;
                        bundle = bundle2;
                    }
                }
            }
            bundle2 = bundle;
            i4 = i3;
            i2++;
            i3 = i4;
            bundle = bundle2;
        }
        if (bundle == null) {
            C1473m.f7980a.aS().mo3960b(null, 3);
        } else {
            bundle.putInt("package_count", i3);
        }
        synchronized (this) {
            this.f20551d = bundle;
        }
        return bundle;
    }

    final boolean m19080c() {
        if (((Boolean) C0955b.ek.m28964b()).booleanValue()) {
            Object futureTask = new FutureTask(new C4185r(this));
            new Handler(getMainLooper()).post(futureTask);
            try {
                return ((Boolean) futureTask.get()).booleanValue();
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Canceler interrupted", new Object[0]);
                return true;
            } catch (Throwable e2) {
                FinskyLog.m21663b(e2, "Canceler crashed", new Object[0]);
                return true;
            }
        }
        FinskyLog.m21669e("Canceled early-update when disabled", new Object[0]);
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1205a(com.google.android.finsky.installqueue.C3369m r7) {
        /*
        r6 = this;
        r5 = 2;
        r0 = 0;
        r1 = 1;
        r2 = r6.f20552e;
        if (r2 == 0) goto L_0x0013;
    L_0x0007:
        r2 = r6.f20552e;
        r3 = r7.m16819a();
        r2 = r2.equals(r3);
        if (r2 != 0) goto L_0x0014;
    L_0x0013:
        return;
    L_0x0014:
        r2 = "EarlyUpdate %s: %s";
        r3 = new java.lang.Object[r5];
        r4 = r7.m16819a();
        r3[r0] = r4;
        r4 = r7.f17273c;
        r4 = r4.f17153d;
        r4 = java.lang.Integer.valueOf(r4);
        r3[r1] = r4;
        com.google.android.finsky.utils.FinskyLog.m21659a(r2, r3);
        r2 = r7.f17273c;
        r2 = r2.f17153d;
        switch(r2) {
            case 0: goto L_0x0056;
            case 1: goto L_0x006d;
            case 2: goto L_0x006f;
            case 3: goto L_0x0071;
            case 4: goto L_0x006d;
            case 5: goto L_0x007d;
            case 6: goto L_0x0080;
            case 7: goto L_0x0082;
            case 8: goto L_0x0082;
            case 9: goto L_0x0032;
            case 10: goto L_0x0032;
            case 11: goto L_0x0054;
            default: goto L_0x0032;
        };
    L_0x0032:
        r2 = r0;
    L_0x0033:
        if (r0 == 0) goto L_0x0046;
    L_0x0035:
        r0 = com.google.android.finsky.aa.C0954a.ba;
        r3 = r7.m16819a();
        r0 = r0.m5777b(r3);
        r1 = java.lang.Boolean.valueOf(r1);
        r0.m5763a(r1);
    L_0x0046:
        if (r2 == 0) goto L_0x0013;
    L_0x0048:
        r0 = 0;
        r6.f20552e = r0;
        r0 = r6.f20553f;
        r0.release();
        r6.m19076a();
        goto L_0x0013;
    L_0x0054:
        r2 = r0;
        goto L_0x0033;
    L_0x0056:
        r2 = r6.f20553f;
        r2 = r2.tryAcquire();
        if (r2 != 0) goto L_0x0032;
    L_0x005e:
        r2 = "Couldn't acquire mutex for pending %s";
        r3 = new java.lang.Object[r1];
        r4 = r7.m16819a();
        r3[r0] = r4;
        com.google.android.finsky.utils.FinskyLog.m21669e(r2, r3);
        r2 = r0;
        goto L_0x0033;
    L_0x006d:
        r2 = r0;
        goto L_0x0033;
    L_0x006f:
        r2 = r1;
        goto L_0x0033;
    L_0x0071:
        monitor-enter(r6);
        r2 = r6.f20554g;	 Catch:{ all -> 0x007a }
        if (r2 != 0) goto L_0x0077;
    L_0x0076:
        r0 = r1;
    L_0x0077:
        monitor-exit(r6);	 Catch:{ all -> 0x007a }
        r2 = r1;
        goto L_0x0033;
    L_0x007a:
        r0 = move-exception;
        monitor-exit(r6);	 Catch:{ all -> 0x007a }
        throw r0;
    L_0x007d:
        r0 = r1;
        r2 = r1;
        goto L_0x0033;
    L_0x0080:
        r2 = r1;
        goto L_0x0033;
    L_0x0082:
        r2 = "EarlyUpdate %s: unexpected %d";
        r3 = new java.lang.Object[r5];
        r4 = r7.m16819a();
        r3[r0] = r4;
        r4 = r7.f17273c;
        r4 = r4.f17153d;
        r4 = java.lang.Integer.valueOf(r4);
        r3[r1] = r4;
        com.google.android.finsky.utils.FinskyLog.m21665c(r2, r3);
        goto L_0x0032;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.finsky.setup.PlaySetupService.a(com.google.android.finsky.installqueue.m):void");
    }

    final Bundle m19074a(String str, long j) {
        Exception e;
        C1254c b = C1473m.f7980a.mo2112b(str);
        if (b == null) {
            return m19073a("no_account", null);
        }
        C1473m.f7980a.aS().mo3949a(str, 1);
        C0657w agVar = new ag();
        C1473m.f7980a.bJ().m21191a(b, C2693e.m14552a(), j, agVar, agVar, true);
        try {
            Object[] objArr;
            fr frVar = (fr) this.f20557j.m19365b(b, agVar, "Unable to fetch backup document choices");
            FinskyLog.m21659a("getBackupDocumentChoices returned with %d documents", Integer.valueOf(frVar.b.length));
            fp[] fpVarArr = frVar.b;
            int intValue = ((Integer) C0955b.jl.m28964b()).intValue();
            if (intValue < 0 || intValue > fpVarArr.length) {
                objArr = fpVarArr;
            } else {
                FinskyLog.m21667d("Truncating array of length %d to %d", Integer.valueOf(fpVarArr.length), Integer.valueOf(intValue));
                objArr = Arrays.copyOf(fpVarArr, intValue);
            }
            frVar.b = (fp[]) objArr;
            ArrayList arrayList = new ArrayList(frVar.b.length);
            for (intValue = 0; intValue < frVar.b.length; intValue++) {
                if (frVar.b[intValue] == null) {
                    FinskyLog.m21665c("response.backupDocumentInfo[%d] was null", Integer.valueOf(intValue));
                } else {
                    C0757i c0757i = frVar.b[intValue];
                    if (!(c0757i.c == null || c0757i.c.f12112s == null || c0757i.c.f12112s.f12048a == null)) {
                        c0757i.c.f12112s.f12048a.f13167g = null;
                    }
                    Object a = m19072a(c0757i.c, false);
                    if (a == null) {
                        a = null;
                    } else {
                        a.putByteArray("backup_document_info", C0757i.m4909a(c0757i));
                        a.putInt("priority", c0757i.d);
                    }
                    if (a == null) {
                        FinskyLog.m21665c("getBackupDocumentChoices didn't return correct doc for '%s'", frVar.b[intValue].c.f12097d);
                    } else {
                        arrayList.add(a);
                    }
                }
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("packages", (Parcelable[]) arrayList.toArray(new Bundle[arrayList.size()]));
            return bundle;
        } catch (VolleyError e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            e = e4;
        }
        FinskyLog.m21667d("Error in getPackagesForDevice: %s", e);
        return m19073a(null, e);
    }

    private static Bundle m19073a(String str, Exception exception) {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        if (str != null) {
            bundle2.putString("reason", str);
        } else {
            bundle2.putString("reason", "unknown");
        }
        if (exception != null) {
            bundle2.putString("exception_type", exception.getClass().getSimpleName());
            if (str == null && ((exception instanceof VolleyError) || (exception instanceof InterruptedException))) {
                bundle2.putString("reason", "network_failure");
            }
        }
        bundle.putBundle("error", bundle2);
        return bundle;
    }

    final Bundle m19075a(String str, String[] strArr) {
        Exception e;
        C1254c b = C1473m.f7980a.mo2112b(str);
        if (b == null) {
            return m19073a("no_account", null);
        }
        C0660x agVar = new ag();
        b.mo1605a(C1283d.m7689a(Arrays.asList(strArr)), false, agVar, (C0657w) agVar);
        try {
            bx bxVar = (bx) this.f20557j.m19365b(b, agVar, "Unable to fetch apps corresponding to iOS apps");
            FinskyLog.m21659a("getBulkDetails returned with %d documents", Integer.valueOf(bxVar.a.length));
            ArrayList arrayList = new ArrayList(bxVar.a.length);
            for (int i = 0; i < bxVar.a.length; i++) {
                if (bxVar.a[i] == null) {
                    FinskyLog.m21665c("getBulkDetails returned null entry for '%s'", strArr[i]);
                } else {
                    Bundle a = m19072a(bxVar.a[i].b, true);
                    if (a == null) {
                        FinskyLog.m21665c("getBulkDetails didn't return correct doc for '%s'", strArr[i]);
                    } else {
                        arrayList.add(a);
                    }
                }
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("packages", (Parcelable[]) arrayList.toArray(new Bundle[arrayList.size()]));
            return bundle;
        } catch (VolleyError e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        } catch (ExecutionException e4) {
            e = e4;
        }
        FinskyLog.m21667d("Error in getCompatiblePackages: %s", e);
        return m19073a(null, e);
    }

    private final Bundle m19072a(cv cvVar, boolean z) {
        if (cvVar == null) {
            return null;
        }
        bd a = c.a(cvVar, 4);
        if (a == null || cvVar.f12112s == null || cvVar.f12112s.f12048a == null || cvVar.f12112s.f12048a.f13153B == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (z) {
            bundle.putByteArray("doc", C0757i.m4909a((C0757i) cvVar));
        }
        bundle.putString("title", cvVar.f12100g);
        bundle.putString("package", cvVar.f12097d);
        bundle.putString("icon", a.f11860f);
        bundle.putBoolean("has_purchases", cvVar.f12112s.f12048a.f13180t);
        bundle.putLong("install_size", cvVar.f12112s.f12048a.f13153B.f12311c);
        bundle.putString("developer_name", cvVar.f12102i);
        if (VERSION.SDK_INT <= 22 || cvVar.f12112s.f12048a.f13153B.f12313e <= 22) {
            bundle.putBoolean("has_runtime_permissions", false);
            if (cvVar.f12112s.f12048a.f13167g != null) {
                List a2 = C1473m.f7980a.aV().m11994a(cvVar.f12112s.f12048a.f13167g, null, false).m11987a();
                Parcelable[] parcelableArr = new Bundle[a2.size()];
                for (int i = 0; i < a2.size(); i++) {
                    C2361b c2361b = (C2361b) a2.get(i);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("permission_title", getString(c2361b.f11584b));
                    parcelableArr[i] = bundle2;
                }
                bundle.putParcelableArray("permissions", parcelableArr);
            }
        } else {
            bundle.putBoolean("has_runtime_permissions", true);
        }
        return bundle;
    }

    final Bundle m19081d() {
        Bundle bundle = new Bundle();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        m19077a(new C41135(new Handler(getMainLooper()), countDownLatch));
        FinskyLog.m21659a("Blocking for Final Hold...", new Object[0]);
        try {
            countDownLatch.await(((Long) C0955b.dV.m28964b()).longValue(), TimeUnit.MILLISECONDS);
            FinskyLog.m21659a("Final hold complete", new Object[0]);
            return bundle;
        } catch (Exception e) {
            return m19073a("Timed out waiting for final hold", e);
        }
    }

    final void m19077a(ResultReceiver resultReceiver) {
        Bundle bundle = new Bundle();
        m19082e();
        FinskyLog.m21659a("Performing final hold silently", new Object[0]);
        if (VpaService.m19146d()) {
            VpaService.m19144b(C1473m.f7980a.f7981b, C1473m.f7980a.bn());
        }
        if (VpaService.m19145c() || C1473m.f7980a.cK().mo3929a()) {
            FinskyLog.m21659a("Blocking for Final Hold...", new Object[0]);
            bx c4189v = new C4189v(resultReceiver, bundle);
            if (C1473m.f7980a.cK().mo3930a(c4189v) || VpaService.m19142a(c4189v)) {
                return;
            }
        }
        FinskyLog.m21659a("Sending final hold complete", new Object[0]);
        resultReceiver.send(1, bundle);
    }

    final void m19082e() {
        C1473m.f7980a.bP().m14778c();
        new Handler(getMainLooper()).post(new C4190w());
    }
}
