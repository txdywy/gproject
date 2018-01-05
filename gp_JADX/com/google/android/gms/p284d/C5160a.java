package com.google.android.gms.p284d;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.at;
import com.google.android.gms.common.internal.au;
import com.google.android.gms.internal.ci;
import com.google.android.gms.internal.ev;
import com.google.android.gms.internal.ey;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class C5160a implements at, au {
    public ev f26100a;
    public final String f26101b;
    public final String f26102c;
    public final LinkedBlockingQueue f26103d;
    public final HandlerThread f26104e = new HandlerThread("GassClient");

    public C5160a(Context context, String str, String str2) {
        this.f26101b = str;
        this.f26102c = str2;
        this.f26104e.start();
        this.f26100a = new ev(context, this.f26104e.getLooper(), this, this);
        this.f26103d = new LinkedBlockingQueue();
        this.f26100a.m23030s();
    }

    private final ey m23898c() {
        try {
            return this.f26100a.mo4511f();
        } catch (IllegalStateException e) {
            return null;
        } catch (DeadObjectException e2) {
            return null;
        }
    }

    private final void m23899d() {
        if (this.f26100a == null) {
            return;
        }
        if (this.f26100a.m23021j() || this.f26100a.m23022k()) {
            this.f26100a.mo4510e();
        }
    }

    private static ci m23900e() {
        ci ciVar = new ci();
        ciVar.f26598t = Long.valueOf(32768);
        return ciVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4619a() {
        /*
        r4 = this;
        r0 = r4.m23898c();
        if (r0 == 0) goto L_0x0024;
    L_0x0006:
        r1 = new com.google.android.gms.internal.zzclf;	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r2 = r4.f26101b;	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r3 = r4.f26102c;	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r1.<init>(r2, r3);	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r0 = r0.mo4718a(r1);	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r0 = r0.m26052a();	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r1 = r4.f26103d;	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r1.put(r0);	 Catch:{ Throwable -> 0x0025, all -> 0x0038 }
        r4.m23899d();
        r0 = r4.f26104e;
        r0.quit();
    L_0x0024:
        return;
    L_0x0025:
        r0 = move-exception;
        r0 = r4.f26103d;	 Catch:{ InterruptedException -> 0x0042, all -> 0x0038 }
        r1 = com.google.android.gms.p284d.C5160a.m23900e();	 Catch:{ InterruptedException -> 0x0042, all -> 0x0038 }
        r0.put(r1);	 Catch:{ InterruptedException -> 0x0042, all -> 0x0038 }
    L_0x002f:
        r4.m23899d();
        r0 = r4.f26104e;
        r0.quit();
        goto L_0x0024;
    L_0x0038:
        r0 = move-exception;
        r4.m23899d();
        r1 = r4.f26104e;
        r1.quit();
        throw r0;
    L_0x0042:
        r0 = move-exception;
        goto L_0x002f;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.d.a.a():void");
    }

    public final void mo4620a(int i) {
        try {
            this.f26103d.put(C5160a.m23900e());
        } catch (InterruptedException e) {
        }
    }

    public final void mo4621a(ConnectionResult connectionResult) {
        try {
            this.f26103d.put(C5160a.m23900e());
        } catch (InterruptedException e) {
        }
    }

    public final ci m23904b() {
        ci ciVar;
        try {
            ciVar = (ci) this.f26103d.poll(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            ciVar = null;
        }
        return ciVar == null ? C5160a.m23900e() : ciVar;
    }
}
