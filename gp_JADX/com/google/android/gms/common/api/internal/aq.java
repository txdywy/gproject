package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C1634r;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.C5022m;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.ap;
import com.google.android.gms.internal.mt;
import com.google.android.gms.tasks.C5588e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class aq implements cy, C1632q, C1634r {
    public final Queue f25715a = new LinkedList();
    public final C4949i f25716b;
    public final ch f25717c;
    public final C5067h f25718d;
    public final Set f25719e = new HashSet();
    public final Map f25720f = new HashMap();
    public final int f25721g;
    public final bp f25722h;
    public boolean f25723i;
    public ConnectionResult f25724j = null;
    public /* synthetic */ ao f25725k;

    public aq(ao aoVar, C5022m c5022m) {
        this.f25725k = aoVar;
        this.f25716b = c5022m.mo4602a(aoVar.f25713q.getLooper(), this);
        if (this.f25716b instanceof ap) {
            ap.m23746f();
        }
        this.f25717c = c5022m.f25588d;
        this.f25718d = new C5067h();
        this.f25721g = c5022m.f25590f;
        if (this.f25716b.mo4826l()) {
            this.f25722h = c5022m.mo4603a(aoVar.f25704h, aoVar.f25713q);
        } else {
            this.f25722h = null;
        }
    }

    private final void m23425b(ConnectionResult connectionResult) {
        for (ck a : this.f25719e) {
            a.m23547a(this.f25717c, connectionResult);
        }
        this.f25719e.clear();
    }

    private final void m23426b(C5057a c5057a) {
        c5057a.mo4585a(this.f25718d, m23442j());
        try {
            c5057a.mo4584a(this);
        } catch (DeadObjectException e) {
            mo2362a(1);
            this.f25716b.mo4510e();
        }
    }

    final void m23427a() {
        m23436d();
        m23425b(ConnectionResult.f25609a);
        m23438f();
        for (bn bnVar : this.f25720f.values()) {
            try {
                bm bmVar = bnVar.f25761a;
                C5588e c5588e = new C5588e();
                bmVar.m23484a();
            } catch (DeadObjectException e) {
                mo2362a(1);
                this.f25716b.mo4510e();
            } catch (RemoteException e2) {
            }
        }
        while (this.f25716b.m23040j() && !this.f25715a.isEmpty()) {
            m23426b((C5057a) this.f25715a.remove());
        }
        m23439g();
    }

    public final void mo2362a(int i) {
        if (Looper.myLooper() == this.f25725k.f25713q.getLooper()) {
            m23434b();
        } else {
            this.f25725k.f25713q.post(new as(this));
        }
    }

    public final void mo2363a(Bundle bundle) {
        if (Looper.myLooper() == this.f25725k.f25713q.getLooper()) {
            m23427a();
        } else {
            this.f25725k.f25713q.post(new ar(this));
        }
    }

    public final void mo4570a(ConnectionResult connectionResult, C5053a c5053a, boolean z) {
        if (Looper.myLooper() == this.f25725k.f25713q.getLooper()) {
            mo2364a(connectionResult);
        } else {
            this.f25725k.f25713q.post(new at(this, connectionResult));
        }
    }

    public final void m23432a(Status status) {
        am.m23737a(this.f25725k.f25713q);
        for (C5057a a : this.f25715a) {
            a.mo4583a(status);
        }
        this.f25715a.clear();
    }

    public final void m23433a(C5057a c5057a) {
        am.m23737a(this.f25725k.f25713q);
        if (this.f25716b.m23040j()) {
            m23426b(c5057a);
            m23439g();
            return;
        }
        this.f25715a.add(c5057a);
        if (this.f25724j == null || !this.f25724j.m23263a()) {
            m23440h();
        } else {
            mo2364a(this.f25724j);
        }
    }

    public final void m23436d() {
        am.m23737a(this.f25725k.f25713q);
        this.f25724j = null;
    }

    public final ConnectionResult m23437e() {
        am.m23737a(this.f25725k.f25713q);
        return this.f25724j;
    }

    final void m23438f() {
        if (this.f25723i) {
            this.f25725k.f25713q.removeMessages(11, this.f25717c);
            this.f25725k.f25713q.removeMessages(9, this.f25717c);
            this.f25723i = false;
        }
    }

    final void m23439g() {
        this.f25725k.f25713q.removeMessages(12, this.f25717c);
        this.f25725k.f25713q.sendMessageDelayed(this.f25725k.f25713q.obtainMessage(12, this.f25717c), this.f25725k.f25703e);
    }

    final boolean m23441i() {
        return this.f25716b.m23040j();
    }

    public final boolean m23442j() {
        return this.f25716b.mo4826l();
    }

    final void m23434b() {
        m23436d();
        this.f25723i = true;
        this.f25718d.m23596a(true, bz.f25780a);
        this.f25725k.f25713q.sendMessageDelayed(Message.obtain(this.f25725k.f25713q, 9, this.f25717c), this.f25725k.f25701c);
        this.f25725k.f25713q.sendMessageDelayed(Message.obtain(this.f25725k.f25713q, 11, this.f25717c), this.f25725k.f25702d);
        this.f25725k.f25706j = -1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2364a(com.google.android.gms.common.ConnectionResult r6) {
        /*
        r5 = this;
        r0 = r5.f25725k;
        r0 = r0.f25713q;
        com.google.android.gms.common.internal.am.m23737a(r0);
        r0 = r5.f25722h;
        if (r0 == 0) goto L_0x0018;
    L_0x000d:
        r0 = r5.f25722h;
        r1 = r0.f25769g;
        if (r1 == 0) goto L_0x0018;
    L_0x0013:
        r0 = r0.f25769g;
        r0.mo4510e();
    L_0x0018:
        r5.m23436d();
        r0 = r5.f25725k;
        r1 = -1;
        r0.f25706j = r1;
        r5.m23425b(r6);
        r0 = r6.f25611c;
        r1 = 4;
        if (r0 != r1) goto L_0x002f;
    L_0x0029:
        r0 = com.google.android.gms.common.api.internal.ao.f25698b;
        r5.m23432a(r0);
    L_0x002e:
        return;
    L_0x002f:
        r0 = r5.f25715a;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x003a;
    L_0x0037:
        r5.f25724j = r6;
        goto L_0x002e;
    L_0x003a:
        r1 = com.google.android.gms.common.api.internal.ao.f25699f;
        monitor-enter(r1);
        r0 = r5.f25725k;	 Catch:{ all -> 0x0060 }
        r0 = r0.f25710n;	 Catch:{ all -> 0x0060 }
        if (r0 == 0) goto L_0x0063;
    L_0x0045:
        r0 = r5.f25725k;	 Catch:{ all -> 0x0060 }
        r0 = r0.f25711o;	 Catch:{ all -> 0x0060 }
        r2 = r5.f25717c;	 Catch:{ all -> 0x0060 }
        r0 = r0.contains(r2);	 Catch:{ all -> 0x0060 }
        if (r0 == 0) goto L_0x0063;
    L_0x0053:
        r0 = r5.f25725k;	 Catch:{ all -> 0x0060 }
        r0 = r0.f25710n;	 Catch:{ all -> 0x0060 }
        r2 = r5.f25721g;	 Catch:{ all -> 0x0060 }
        r0.m23536b(r6, r2);	 Catch:{ all -> 0x0060 }
        monitor-exit(r1);	 Catch:{ all -> 0x0060 }
        goto L_0x002e;
    L_0x0060:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0060 }
        throw r0;
    L_0x0063:
        monitor-exit(r1);	 Catch:{ all -> 0x0060 }
        r0 = r5.f25725k;
        r1 = r5.f25721g;
        r0 = r0.m23420a(r6, r1);
        if (r0 != 0) goto L_0x002e;
    L_0x006e:
        r0 = r6.f25611c;
        r1 = 18;
        if (r0 != r1) goto L_0x0077;
    L_0x0074:
        r0 = 1;
        r5.f25723i = r0;
    L_0x0077:
        r0 = r5.f25723i;
        if (r0 == 0) goto L_0x0099;
    L_0x007b:
        r0 = r5.f25725k;
        r0 = r0.f25713q;
        r1 = r5.f25725k;
        r1 = r1.f25713q;
        r2 = 9;
        r3 = r5.f25717c;
        r1 = android.os.Message.obtain(r1, r2, r3);
        r2 = r5.f25725k;
        r2 = r2.f25701c;
        r0.sendMessageDelayed(r1, r2);
        goto L_0x002e;
    L_0x0099:
        r0 = new com.google.android.gms.common.api.Status;
        r1 = 17;
        r2 = r5.f25717c;
        r2 = r2.f25798c;
        r2 = r2.f25636c;
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 38;
        r4 = new java.lang.StringBuilder;
        r4.<init>(r3);
        r3 = "API: ";
        r3 = r4.append(r3);
        r2 = r3.append(r2);
        r3 = " is not available on this device.";
        r2 = r2.append(r3);
        r2 = r2.toString();
        r0.<init>(r1, r2);
        r5.m23432a(r0);
        goto L_0x002e;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.aq.a(com.google.android.gms.common.ConnectionResult):void");
    }

    public final void m23435c() {
        am.m23737a(this.f25725k.f25713q);
        m23432a(ao.f25697a);
        this.f25718d.m23596a(false, ao.f25697a);
        for (bj cfVar : this.f25720f.keySet()) {
            m23433a(new cf(cfVar, new C5588e()));
        }
        m23425b(new ConnectionResult(4));
        this.f25716b.mo4510e();
    }

    public final void m23440h() {
        am.m23737a(this.f25725k.f25713q);
        if (!this.f25716b.m23040j() && !this.f25716b.m23041k()) {
            if (this.f25716b.mo5112m() && this.f25725k.f25706j != 0) {
                ao aoVar = this.f25725k;
                this.f25725k.f25705i;
                aoVar.f25706j = C5095d.m23655a(this.f25725k.f25704h);
                if (this.f25725k.f25706j != 0) {
                    mo2364a(new ConnectionResult(this.f25725k.f25706j, null));
                    return;
                }
            }
            Object auVar = new au(this.f25725k, this.f25716b, this.f25717c);
            if (this.f25716b.mo4826l()) {
                bp bpVar = this.f25722h;
                if (bpVar.f25769g != null) {
                    bpVar.f25769g.mo4510e();
                }
                bpVar.f25768f.f26011h = Integer.valueOf(System.identityHashCode(bpVar));
                bpVar.f25769g = (mt) bpVar.f25766d.mo4472a(bpVar.f25764b, bpVar.f25765c.getLooper(), bpVar.f25768f, bpVar.f25768f.f26010g, bpVar, bpVar);
                bpVar.f25770h = auVar;
                bpVar.f25769g.mo4512g();
            }
            this.f25716b.mo4509a(auVar);
        }
    }
}
