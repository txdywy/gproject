package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Looper;
import android.support.v4.p037h.C0305a;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.C5056g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.bd;
import com.google.android.gms.common.internal.bf;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.mt;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class C5064e implements bd {
    public final Map f25846a = new HashMap();
    public final Map f25847b = new HashMap();
    public final Map f25848c;
    public final ao f25849d;
    public final ac f25850e;
    public final Lock f25851f;
    public final Looper f25852g;
    public final Condition f25853h;
    public final bd f25854i;
    public final boolean f25855j;
    public final boolean f25856k;
    public final Queue f25857l = new LinkedList();
    public boolean f25858m;
    public Map f25859n;
    public Map f25860o;
    public C5066g f25861p;
    public ConnectionResult f25862q;

    public C5064e(Context context, Lock lock, Looper looper, Map map, bd bdVar, Map map2, C4931e c4931e, ArrayList arrayList, ac acVar, boolean z) {
        this.f25851f = lock;
        this.f25852g = looper;
        this.f25853h = lock.newCondition();
        this.f25850e = acVar;
        this.f25848c = map2;
        this.f25854i = bdVar;
        this.f25855j = z;
        Map hashMap = new HashMap();
        for (C5053a c5053a : map2.keySet()) {
            hashMap.put(c5053a.m23274b(), c5053a);
        }
        Map hashMap2 = new HashMap();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            cx cxVar = (cx) obj;
            hashMap2.put(cxVar.f25824a, cxVar);
        }
        Object obj2 = 1;
        Object obj3 = null;
        Object obj4 = null;
        for (Entry entry : map.entrySet()) {
            Object obj5;
            Object obj6;
            Object obj7;
            C5053a c5053a2 = (C5053a) hashMap.get(entry.getKey());
            C4949i c4949i = (C4949i) entry.getValue();
            if (c4949i.mo5112m()) {
                obj5 = 1;
                if (((Boolean) this.f25848c.get(c5053a2)).booleanValue()) {
                    obj6 = obj2;
                    obj7 = obj3;
                } else {
                    obj6 = obj2;
                    obj7 = 1;
                }
            } else {
                obj5 = obj4;
                obj6 = null;
                obj7 = obj3;
            }
            C5063d c5063d = new C5063d(context, c5053a2, looper, c4949i, (cx) hashMap2.get(c5053a2), bdVar, c4931e);
            this.f25846a.put((C5056g) entry.getKey(), c5063d);
            if (c4949i.mo4826l()) {
                this.f25847b.put((C5056g) entry.getKey(), c5063d);
            }
            obj4 = obj5;
            obj2 = obj6;
            obj3 = obj7;
        }
        boolean z2 = obj4 != null && obj2 == null && obj3 == null;
        this.f25856k = z2;
        this.f25849d = ao.m23404a();
    }

    private final boolean m23581g() {
        this.f25851f.lock();
        try {
            if (this.f25858m && this.f25855j) {
                for (C5056g a : this.f25847b.keySet()) {
                    ConnectionResult a2 = m23575a(a);
                    if (a2 != null) {
                        if (!a2.m23264b()) {
                        }
                    }
                    this.f25851f.unlock();
                    return false;
                }
                this.f25851f.unlock();
                return true;
            }
            this.f25851f.unlock();
            return false;
        } catch (Throwable th) {
            this.f25851f.unlock();
        }
    }

    public final ConnectionResult mo4567a(long j, TimeUnit timeUnit) {
        mo4569a();
        long toNanos = timeUnit.toNanos(j);
        while (mo4577e()) {
            if (toNanos <= 0) {
                try {
                    mo4575c();
                    return new ConnectionResult(14, null);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return new ConnectionResult(15, null);
                }
            }
            toNanos = this.f25853h.awaitNanos(toNanos);
        }
        return mo4576d() ? ConnectionResult.f25609a : this.f25862q != null ? this.f25862q : new ConnectionResult(13, null);
    }

    public final cn mo4568a(cn cnVar) {
        if (this.f25855j && m23580c(cnVar)) {
            return cnVar;
        }
        if (mo4576d()) {
            this.f25850e.f25666y.m23509a((ct) cnVar);
            return ((C5063d) this.f25846a.get(cnVar.f25455b)).m23219a(cnVar);
        }
        this.f25857l.add(cnVar);
        return cnVar;
    }

    public final void mo4571a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public final boolean mo4572a(bo boVar) {
        this.f25851f.lock();
        try {
            if (!this.f25858m || m23581g()) {
                this.f25851f.unlock();
                return false;
            }
            this.f25849d.m23421b();
            this.f25861p = new C5066g(this, boVar);
            this.f25849d.m23417a(this.f25847b.values()).mo5056a(new dm(this.f25852g), this.f25861p);
            return true;
        } finally {
            this.f25851f.unlock();
        }
    }

    public final ConnectionResult mo4573b() {
        mo4569a();
        while (mo4577e()) {
            try {
                this.f25853h.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return mo4576d() ? ConnectionResult.f25609a : this.f25862q != null ? this.f25862q : new ConnectionResult(13, null);
    }

    public final void mo4575c() {
        this.f25851f.lock();
        try {
            this.f25858m = false;
            this.f25859n = null;
            this.f25860o = null;
            if (this.f25861p != null) {
                this.f25861p.m23594a();
                this.f25861p = null;
            }
            this.f25862q = null;
            while (!this.f25857l.isEmpty()) {
                cn cnVar = (cn) this.f25857l.remove();
                cnVar.m23069a(null);
                cnVar.mo4491b();
            }
            this.f25853h.signalAll();
        } finally {
            this.f25851f.unlock();
        }
    }

    public final boolean mo4576d() {
        this.f25851f.lock();
        try {
            boolean z = this.f25859n != null && this.f25862q == null;
            this.f25851f.unlock();
            return z;
        } catch (Throwable th) {
            this.f25851f.unlock();
        }
    }

    public final boolean mo4577e() {
        this.f25851f.lock();
        try {
            boolean z = this.f25859n == null && this.f25858m;
            this.f25851f.unlock();
            return z;
        } catch (Throwable th) {
            this.f25851f.unlock();
        }
    }

    public final cn mo4574b(cn cnVar) {
        C5056g c5056g = cnVar.f25455b;
        if (this.f25855j && m23580c(cnVar)) {
            return cnVar;
        }
        this.f25850e.f25666y.m23509a((ct) cnVar);
        return ((C5063d) this.f25846a.get(c5056g)).m23219a(cnVar);
    }

    private final boolean m23580c(cn cnVar) {
        C5056g c5056g = cnVar.f25455b;
        ConnectionResult a = m23575a(c5056g);
        if (a == null || a.f25611c != 4) {
            return false;
        }
        PendingIntent pendingIntent;
        ao aoVar = this.f25849d;
        ch chVar = ((C5063d) this.f25846a.get(c5056g)).f25588d;
        int identityHashCode = System.identityHashCode(this.f25850e);
        aq aqVar = (aq) aoVar.f25709m.get(chVar);
        if (aqVar == null) {
            pendingIntent = null;
        } else {
            mt mtVar;
            if (aqVar.f25722h == null) {
                mtVar = null;
            } else {
                mtVar = aqVar.f25722h.f25769g;
            }
            pendingIntent = mtVar == null ? null : PendingIntent.getActivity(aoVar.f25704h, identityHashCode, mtVar.mo4486d(), 134217728);
        }
        cnVar.m23084b(new Status(4, null, pendingIntent));
        return true;
    }

    public final void mo4569a() {
        this.f25851f.lock();
        try {
            if (!this.f25858m) {
                this.f25858m = true;
                this.f25859n = null;
                this.f25860o = null;
                this.f25861p = null;
                this.f25862q = null;
                this.f25849d.m23421b();
                this.f25849d.m23417a(this.f25846a.values()).mo5056a(new dm(this.f25852g), new C5065f(this));
                this.f25851f.unlock();
            }
        } finally {
            this.f25851f.unlock();
        }
    }

    private final ConnectionResult m23575a(C5056g c5056g) {
        this.f25851f.lock();
        try {
            C5063d c5063d = (C5063d) this.f25846a.get(c5056g);
            if (this.f25859n == null || c5063d == null) {
                this.f25851f.unlock();
                return null;
            }
            ConnectionResult connectionResult = (ConnectionResult) this.f25859n.get(c5063d.f25588d);
            return connectionResult;
        } finally {
            this.f25851f.unlock();
        }
    }

    public final void mo4578f() {
        this.f25851f.lock();
        try {
            ao aoVar = this.f25849d;
            aoVar.f25708l.incrementAndGet();
            aoVar.f25713q.sendMessage(aoVar.f25713q.obtainMessage(10));
            if (this.f25861p != null) {
                this.f25861p.m23594a();
                this.f25861p = null;
            }
            if (this.f25860o == null) {
                this.f25860o = new C0305a(this.f25847b.size());
            }
            ConnectionResult connectionResult = new ConnectionResult(4);
            for (C5063d c5063d : this.f25847b.values()) {
                this.f25860o.put(c5063d.f25588d, connectionResult);
            }
            if (this.f25859n != null) {
                this.f25859n.putAll(this.f25860o);
            }
            this.f25851f.unlock();
        } catch (Throwable th) {
            this.f25851f.unlock();
        }
    }

    static /* synthetic */ boolean m23577a(C5064e c5064e, C5063d c5063d, ConnectionResult connectionResult) {
        return !connectionResult.m23264b() && !connectionResult.m23263a() && ((Boolean) c5064e.f25848c.get(c5063d.f25586b)).booleanValue() && c5063d.f25841j.mo5112m() && C5095d.m23658a(connectionResult.f25611c);
    }

    static /* synthetic */ ConnectionResult m23576a(C5064e c5064e) {
        Object obj = null;
        ConnectionResult connectionResult = null;
        Object obj2 = null;
        ConnectionResult connectionResult2 = null;
        for (C5063d c5063d : c5064e.f25846a.values()) {
            C5053a c5053a = c5063d.f25586b;
            ConnectionResult connectionResult3 = (ConnectionResult) c5064e.f25859n.get(c5063d.f25588d);
            if (!connectionResult3.m23264b() && (!((Boolean) c5064e.f25848c.get(c5053a)).booleanValue() || connectionResult3.m23263a() || C5095d.m23658a(connectionResult3.f25611c))) {
                if (connectionResult3.f25611c != 4 || !c5064e.f25855j) {
                    ConnectionResult connectionResult4;
                    Object obj3;
                    if (connectionResult2 == null || obj2 > 2147483647) {
                        connectionResult4 = connectionResult3;
                        obj3 = Integer.MAX_VALUE;
                    } else {
                        obj3 = obj2;
                        connectionResult4 = connectionResult2;
                    }
                    obj2 = obj3;
                    connectionResult2 = connectionResult4;
                } else if (connectionResult == null || obj > 2147483647) {
                    obj = Integer.MAX_VALUE;
                    connectionResult = connectionResult3;
                }
            }
        }
        return (connectionResult2 == null || connectionResult == null || obj2 <= obj) ? connectionResult2 : connectionResult;
    }

    static /* synthetic */ void m23578b(C5064e c5064e) {
        if (c5064e.f25854i == null) {
            c5064e.f25850e.f25658q = Collections.emptySet();
            return;
        }
        Set hashSet = new HashSet(c5064e.f25854i.f26005b);
        Map map = c5064e.f25854i.f26007d;
        for (C5053a c5053a : map.keySet()) {
            ConnectionResult a = c5064e.m23575a(c5053a.m23274b());
            if (a != null && a.m23264b()) {
                hashSet.addAll(((bf) map.get(c5053a)).f26017a);
            }
        }
        c5064e.f25850e.f25658q = hashSet;
    }

    static /* synthetic */ void m23579c(C5064e c5064e) {
        while (!c5064e.f25857l.isEmpty()) {
            c5064e.mo4574b((cn) c5064e.f25857l.remove());
        }
        c5064e.f25850e.mo4547a(null);
    }
}
