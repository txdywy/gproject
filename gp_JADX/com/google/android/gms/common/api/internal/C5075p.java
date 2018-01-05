package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C1632q;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.C5056g;
import com.google.android.gms.common.internal.C5110o;
import com.google.android.gms.common.internal.bd;
import com.google.android.gms.internal.mt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

public final class C5075p implements aj {
    public final ak f25878a;
    public final Lock f25879b;
    public final Context f25880c;
    public ConnectionResult f25881d;
    public int f25882e;
    public int f25883f = 0;
    public int f25884g;
    public final Bundle f25885h = new Bundle();
    public final Set f25886i = new HashSet();
    public mt f25887j;
    public boolean f25888k;
    public boolean f25889l;
    public boolean f25890m;
    public C5110o f25891n;
    public boolean f25892o;
    public boolean f25893p;
    public final bd f25894q;
    public final Map f25895r;
    public final C4931e f25896s;
    public ArrayList f25897t = new ArrayList();

    public C5075p(ak akVar, bd bdVar, Map map, C4931e c4931e, Lock lock, Context context) {
        this.f25878a = akVar;
        this.f25894q = bdVar;
        this.f25895r = map;
        this.f25896s = c4931e;
        this.f25879b = lock;
        this.f25880c = context;
    }

    private final void m23616a(boolean z) {
        if (this.f25887j != null) {
            if (this.f25887j.m23040j() && z) {
                this.f25887j.mo4511f();
            }
            this.f25887j.mo4510e();
            this.f25891n = null;
        }
    }

    private static String m23617c(int i) {
        switch (i) {
            case 0:
                return "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
            case 1:
                return "STEP_GETTING_REMOTE_SERVICE";
            default:
                return "UNKNOWN";
        }
    }

    private final void m23619h() {
        ArrayList arrayList = this.f25897t;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Future) obj).cancel(true);
        }
        this.f25897t.clear();
    }

    public final cn mo4534a(cn cnVar) {
        this.f25878a.f25692n.f25650i.add(cnVar);
        return cnVar;
    }

    public final void mo4535a() {
        this.f25878a.f25685g.clear();
        this.f25889l = false;
        this.f25881d = null;
        this.f25883f = 0;
        this.f25888k = true;
        this.f25890m = false;
        this.f25892o = false;
        Map hashMap = new HashMap();
        for (C5053a c5053a : this.f25895r.keySet()) {
            C4949i c4949i = (C4949i) this.f25878a.f25684f.get(c5053a.m23274b());
            boolean booleanValue = ((Boolean) this.f25895r.get(c5053a)).booleanValue();
            if (c4949i.mo4826l()) {
                this.f25889l = true;
                if (booleanValue) {
                    this.f25886i.add(c5053a.m23274b());
                } else {
                    this.f25888k = false;
                }
            }
            hashMap.put(c4949i, new C5077r(this, c5053a, booleanValue));
        }
        if (this.f25889l) {
            this.f25894q.f26011h = Integer.valueOf(System.identityHashCode(this.f25878a.f25692n));
            C1632q c5084z = new C5084z(this);
            this.f25887j = (mt) this.f25896s.mo4472a(this.f25880c, this.f25878a.f25692n.mo4555c(), this.f25894q, this.f25894q.f26010g, c5084z, c5084z);
        }
        this.f25884g = this.f25878a.f25684f.size();
        this.f25897t.add(an.f25696a.submit(new C5078s(this, hashMap)));
    }

    public final void mo4536a(int i) {
        m23627b(new ConnectionResult(8, null));
    }

    public final void mo4537a(Bundle bundle) {
        if (m23630b(1)) {
            if (bundle != null) {
                this.f25885h.putAll(bundle);
            }
            if (m23632d()) {
                m23618g();
            }
        }
    }

    public final void mo4538a(ConnectionResult connectionResult, C5053a c5053a, boolean z) {
        if (m23630b(1)) {
            m23628b(connectionResult, c5053a, z);
            if (m23632d()) {
                m23618g();
            }
        }
    }

    final boolean m23625a(ConnectionResult connectionResult) {
        return this.f25888k && !connectionResult.m23263a();
    }

    public final cn mo4539b(cn cnVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    final void m23627b(ConnectionResult connectionResult) {
        m23619h();
        m23616a(!connectionResult.m23263a());
        this.f25878a.m23390a(connectionResult);
        this.f25878a.f25693o.mo4548a(connectionResult);
    }

    public final boolean mo4540b() {
        m23619h();
        m23616a(true);
        this.f25878a.m23390a(null);
        return true;
    }

    final boolean m23630b(int i) {
        if (this.f25883f == i) {
            return true;
        }
        Log.w("GoogleApiClientConnecting", this.f25878a.f25692n.m23364n());
        String valueOf = String.valueOf(this);
        Log.w("GoogleApiClientConnecting", new StringBuilder(String.valueOf(valueOf).length() + 23).append("Unexpected callback in ").append(valueOf).toString());
        Log.w("GoogleApiClientConnecting", "mRemainingConnections=" + this.f25884g);
        valueOf = C5075p.m23617c(this.f25883f);
        String c = C5075p.m23617c(i);
        Log.wtf("GoogleApiClientConnecting", new StringBuilder((String.valueOf(valueOf).length() + 70) + String.valueOf(c).length()).append("GoogleApiClient connecting is in step ").append(valueOf).append(" but received callback for step ").append(c).toString(), new Exception());
        m23627b(new ConnectionResult(8, null));
        return false;
    }

    public final void mo4541c() {
    }

    final boolean m23632d() {
        this.f25884g--;
        if (this.f25884g > 0) {
            return false;
        }
        if (this.f25884g < 0) {
            Log.w("GoogleApiClientConnecting", this.f25878a.f25692n.m23364n());
            Log.wtf("GoogleApiClientConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            m23627b(new ConnectionResult(8, null));
            return false;
        } else if (this.f25881d == null) {
            return true;
        } else {
            this.f25878a.f25691m = this.f25882e;
            m23627b(this.f25881d);
            return false;
        }
    }

    final void m23634f() {
        this.f25889l = false;
        this.f25878a.f25692n.f25658q = Collections.emptySet();
        for (C5056g c5056g : this.f25886i) {
            if (!this.f25878a.f25685g.containsKey(c5056g)) {
                this.f25878a.f25685g.put(c5056g, new ConnectionResult(17, null));
            }
        }
    }

    final void m23633e() {
        if (this.f25884g == 0) {
            if (!this.f25889l || this.f25890m) {
                ArrayList arrayList = new ArrayList();
                this.f25883f = 1;
                this.f25884g = this.f25878a.f25684f.size();
                for (C5056g c5056g : this.f25878a.f25684f.keySet()) {
                    if (!this.f25878a.f25685g.containsKey(c5056g)) {
                        arrayList.add((C4949i) this.f25878a.f25684f.get(c5056g));
                    } else if (m23632d()) {
                        m23618g();
                    }
                }
                if (!arrayList.isEmpty()) {
                    this.f25897t.add(an.f25696a.submit(new C5081v(this, arrayList)));
                }
            }
        }
    }

    private final void m23618g() {
        ak akVar = this.f25878a;
        akVar.f25679a.lock();
        try {
            akVar.f25692n.m23362l();
            akVar.f25689k = new C5072m(akVar);
            akVar.f25689k.mo4535a();
            akVar.f25680b.signalAll();
            an.f25696a.execute(new C5076q(this));
            if (this.f25887j != null) {
                if (this.f25892o) {
                    this.f25887j.mo4824a(this.f25891n, this.f25893p);
                }
                m23616a(false);
            }
            for (C5056g c5056g : this.f25878a.f25685g.keySet()) {
                ((C4949i) this.f25878a.f25684f.get(c5056g)).mo4510e();
            }
            this.f25878a.f25693o.mo4547a(this.f25885h.isEmpty() ? null : this.f25885h);
        } finally {
            akVar.f25679a.unlock();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    final void m23628b(com.google.android.gms.common.ConnectionResult r6, com.google.android.gms.common.api.C5053a r7, boolean r8) {
        /*
        r5 = this;
        r4 = 0;
        r3 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = 0;
        r0 = 1;
        if (r8 == 0) goto L_0x0011;
    L_0x0008:
        r2 = r6.m23263a();
        if (r2 == 0) goto L_0x002b;
    L_0x000e:
        r2 = r0;
    L_0x000f:
        if (r2 == 0) goto L_0x0037;
    L_0x0011:
        r2 = r5.f25881d;
        if (r2 == 0) goto L_0x0019;
    L_0x0015:
        r2 = r5.f25882e;
        if (r3 >= r2) goto L_0x0037;
    L_0x0019:
        if (r0 == 0) goto L_0x001f;
    L_0x001b:
        r5.f25881d = r6;
        r5.f25882e = r3;
    L_0x001f:
        r0 = r5.f25878a;
        r0 = r0.f25685g;
        r1 = r7.m23274b();
        r0.put(r1, r6);
        return;
    L_0x002b:
        r2 = r6.f25611c;
        r2 = com.google.android.gms.common.C5095d.m23656a(r4, r2, r4);
        if (r2 == 0) goto L_0x0035;
    L_0x0033:
        r2 = r0;
        goto L_0x000f;
    L_0x0035:
        r2 = r1;
        goto L_0x000f;
    L_0x0037:
        r0 = r1;
        goto L_0x0019;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.p.b(com.google.android.gms.common.ConnectionResult, com.google.android.gms.common.api.a, boolean):void");
    }
}
