package com.google.android.finsky.setup.p242d.p244a;

import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.ResultReceiver;
import android.os.StrictMode;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.android.volley.p060a.ag;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.deviceconfig.C2693e;
import com.google.android.finsky.installer.C3300k;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.setup.bs;
import com.google.android.finsky.setup.bw;
import com.google.android.finsky.setup.p240a.C4122i;
import com.google.android.finsky.setup.p242d.C4146c;
import com.google.android.finsky.utils.C4674e;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.utils.p188a.C2918a;
import com.google.wireless.android.finsky.dfe.nano.ci;
import com.google.wireless.android.finsky.dfe.nano.ck;
import com.google.wireless.android.p360b.p361a.C6333b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public final class C4147d implements C4146c {
    public final Handler f20984a = new Handler(Looper.getMainLooper());
    public Handler f20985b;
    public final C2471a f20986c;
    public final C2918a f20987d = new C4122i();
    public C4154k f20988e;
    public ci f20989f;
    public int f20990g;
    public ResultReceiver f20991h;
    public C3340g f20992i;
    public C3300k f20993j;
    public bs f20994k;
    public PackageManager f20995l;
    public bw f20996m;
    public C1287h f20997n;

    public C4147d(C3340g c3340g, C3300k c3300k, C2471a c2471a, bs bsVar, PackageManager packageManager, bw bwVar, C1287h c1287h) {
        this.f20992i = c3340g;
        this.f20993j = c3300k;
        this.f20986c = c2471a;
        this.f20994k = bsVar;
        this.f20995l = packageManager;
        this.f20996m = bwVar;
        this.f20997n = c1287h;
    }

    public final boolean mo3971a() {
        return m19433d() != null;
    }

    public final void mo3970a(ResultReceiver resultReceiver) {
        if (resultReceiver == null) {
            FinskyLog.m21669e("Result receiver is required to start early update", new Object[0]);
        } else {
            this.f20984a.post(new C4148e(this, resultReceiver));
        }
    }

    public final boolean mo3972b() {
        Handler handler = true;
        if (((Boolean) C0955b.ek.m28964b()).booleanValue()) {
            boolean booleanValue;
            Object futureTask = new FutureTask(new C4149f(this));
            this.f20984a.post(futureTask);
            try {
                booleanValue = ((Boolean) futureTask.get()).booleanValue();
            } catch (Throwable e) {
                FinskyLog.m21663b(e, "Cancel task interrupted", new Object[0]);
                return r1;
            } catch (Throwable e2) {
                FinskyLog.m21663b(e2, "Cancel task crashed", new Object[0]);
                return handler;
            } finally {
                handler = this.f20984a;
                handler.post(new C4150g(this));
            }
            return booleanValue;
        }
        FinskyLog.m21669e("Canceled early-update when disabled", new Object[0]);
        return true;
    }

    final void m19432c() {
        FinskyLog.m21659a("Scheduling early update", new Object[0]);
        if (this.f20985b == null) {
            HandlerThread a = C4674e.m21808a("early-update-thread");
            a.start();
            this.f20985b = new Handler(a.getLooper());
        }
        this.f20985b.post(new C4151h(this));
    }

    final ci m19433d() {
        ck e = m19426e();
        if (e == null) {
            return null;
        }
        for (ci ciVar : e.a) {
            String str = ciVar.c != null ? ciVar.c.f11833b : null;
            if (TextUtils.isEmpty(str)) {
                FinskyLog.m21669e("Received early update document without package name", new Object[0]);
            } else if (((Boolean) C0954a.ba.m5777b(str).m5760a()).booleanValue()) {
                continue;
            } else {
                try {
                    if (this.f20995l.getPackageInfo(str, 0).versionCode < ciVar.e) {
                        return ciVar;
                    }
                } catch (NameNotFoundException e2) {
                }
            }
        }
        return null;
    }

    private final ck m19426e() {
        if (!((Boolean) C0955b.ek.m28964b()).booleanValue()) {
            return null;
        }
        C6333b c;
        StrictMode.noteSlowCall("EarlyUpdateSession.getEarlyUpdates");
        try {
            c = C2693e.m14552a().mo3115c();
        } catch (Throwable e) {
            FinskyLog.m21663b(e, "Exception while getting device configuration.", new Object[0]);
            c = null;
        }
        C1254c b = this.f20997n.mo2017b();
        C0660x agVar = new ag();
        b.mo1559a(c, agVar, (C0657w) agVar);
        try {
            ck ckVar = (ck) this.f20996m.m19365b(b, agVar, "Error while loading early update");
            if (ckVar != null) {
                FinskyLog.m21659a("Received EarlyUpdate with %d entries", Integer.valueOf(ckVar.a.length));
            }
            return ckVar;
        } catch (VolleyError e2) {
            return null;
        } catch (InterruptedException e3) {
            return null;
        } catch (ExecutionException e4) {
            return null;
        }
    }

    final void m19427a(int i, Bundle bundle) {
        bb.m21791a();
        this.f20994k.mo3960b(null, 3);
        m19430b(i, bundle);
        this.f20992i.mo3484b(this.f20988e);
        this.f20988e = null;
        this.f20991h = null;
        this.f20989f = null;
        this.f20990g = 0;
    }

    final void m19430b(int i, Bundle bundle) {
        bb.m21791a();
        if (this.f20991h != null) {
            this.f20984a.post(new C4153j(this.f20991h, i, bundle));
        }
    }

    static void m19425a(ci ciVar) {
        C0954a.ba.m5777b(ciVar.c.f11833b).m5763a(Boolean.valueOf(true));
    }
}
