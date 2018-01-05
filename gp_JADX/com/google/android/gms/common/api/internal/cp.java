package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicReference;

public abstract class cp extends LifecycleCallback implements OnCancelListener {
    public volatile boolean f25800d;
    public final AtomicReference f25801e;
    public final Handler f25802f;

    private cp(bg bgVar, byte b) {
        super(bgVar);
        this.f25801e = new AtomicReference(null);
        this.f25802f = new Handler(Looper.getMainLooper());
    }

    public final void mo4595a(Bundle bundle) {
        super.mo4595a(bundle);
        if (bundle != null) {
            this.f25801e.set(bundle.getBoolean("resolving_error", false) ? new cq(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    protected abstract void mo4599a(ConnectionResult connectionResult, int i);

    public void mo4596b() {
        super.mo4596b();
        this.f25800d = true;
    }

    public final void m23536b(ConnectionResult connectionResult, int i) {
        cq cqVar = new cq(connectionResult, i);
        if (this.f25801e.compareAndSet(null, cqVar)) {
            this.f25802f.post(new cr(this, cqVar));
        }
    }

    public void mo4598d() {
        super.mo4598d();
        this.f25800d = false;
    }

    protected abstract void mo4601e();

    protected final void m23539f() {
        this.f25801e.set(null);
        mo4601e();
    }

    public void onCancel(DialogInterface dialogInterface) {
        mo4599a(new ConnectionResult(13, null), m23530a((cq) this.f25801e.get()));
        m23539f();
    }

    protected cp(bg bgVar) {
        this(bgVar, (byte) 0);
    }

    public final void mo4597b(Bundle bundle) {
        super.mo4597b(bundle);
        cq cqVar = (cq) this.f25801e.get();
        if (cqVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", cqVar.f25817a);
            bundle.putInt("failed_status", cqVar.f25818b.f25611c);
            bundle.putParcelable("failed_resolution", cqVar.f25818b.f25612d);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4594a(int r7, int r8, android.content.Intent r9) {
        /*
        r6 = this;
        r5 = 18;
        r1 = 13;
        r2 = 1;
        r3 = 0;
        r0 = r6.f25801e;
        r0 = r0.get();
        r0 = (com.google.android.gms.common.api.internal.cq) r0;
        switch(r7) {
            case 1: goto L_0x002e;
            case 2: goto L_0x0018;
            default: goto L_0x0011;
        };
    L_0x0011:
        r1 = r3;
    L_0x0012:
        if (r1 == 0) goto L_0x0054;
    L_0x0014:
        r6.m23539f();
    L_0x0017:
        return;
    L_0x0018:
        r1 = r6.m23279a();
        r4 = com.google.android.gms.common.C5095d.m23655a(r1);
        if (r4 != 0) goto L_0x005e;
    L_0x0022:
        r1 = r2;
    L_0x0023:
        if (r0 == 0) goto L_0x0017;
    L_0x0025:
        r2 = r0.f25818b;
        r2 = r2.f25611c;
        if (r2 != r5) goto L_0x0012;
    L_0x002b:
        if (r4 != r5) goto L_0x0012;
    L_0x002d:
        goto L_0x0017;
    L_0x002e:
        r4 = -1;
        if (r8 != r4) goto L_0x0033;
    L_0x0031:
        r1 = r2;
        goto L_0x0012;
    L_0x0033:
        if (r8 != 0) goto L_0x0011;
    L_0x0035:
        if (r9 == 0) goto L_0x003d;
    L_0x0037:
        r2 = "<<ResolutionFailureErrorDetail>>";
        r1 = r9.getIntExtra(r2, r1);
    L_0x003d:
        r2 = new com.google.android.gms.common.api.internal.cq;
        r4 = new com.google.android.gms.common.ConnectionResult;
        r5 = 0;
        r4.<init>(r1, r5);
        r0 = m23530a(r0);
        r2.<init>(r4, r0);
        r0 = r6.f25801e;
        r0.set(r2);
        r0 = r2;
        r1 = r3;
        goto L_0x0012;
    L_0x0054:
        if (r0 == 0) goto L_0x0017;
    L_0x0056:
        r1 = r0.f25818b;
        r0 = r0.f25817a;
        r6.mo4599a(r1, r0);
        goto L_0x0017;
    L_0x005e:
        r1 = r3;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.cp.a(int, int, android.content.Intent):void");
    }

    private static int m23530a(cq cqVar) {
        if (cqVar == null) {
            return -1;
        }
        return cqVar.f25817a;
    }
}
