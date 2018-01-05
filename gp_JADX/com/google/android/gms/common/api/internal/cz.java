package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p037h.C0305a;
import android.util.Log;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.C5056g;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.bd;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

final class cz implements bd {
    public final Context f25827a;
    public final ac f25828b;
    public final Looper f25829c;
    public final ak f25830d;
    public final ak f25831e;
    public final Map f25832f;
    public final Set f25833g = Collections.newSetFromMap(new WeakHashMap());
    public final C4949i f25834h;
    public Bundle f25835i;
    public ConnectionResult f25836j = null;
    public ConnectionResult f25837k = null;
    public boolean f25838l = false;
    public final Lock f25839m;
    public int f25840n = 0;

    private cz(Context context, ac acVar, Lock lock, Looper looper, C5095d c5095d, Map map, Map map2, bd bdVar, C4931e c4931e, C4949i c4949i, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f25827a = context;
        this.f25828b = acVar;
        this.f25839m = lock;
        this.f25829c = looper;
        this.f25834h = c4949i;
        this.f25830d = new ak(context, this.f25828b, lock, looper, c5095d, map2, null, map4, null, arrayList2, new C5060b(this));
        this.f25831e = new ak(context, this.f25828b, lock, looper, c5095d, map, bdVar, map3, c4931e, arrayList, new C5061c(this));
        Object c0305a = new C0305a();
        for (C5056g put : map2.keySet()) {
            c0305a.put(put, this.f25830d);
        }
        for (C5056g put2 : map.keySet()) {
            c0305a.put(put2, this.f25831e);
        }
        this.f25832f = Collections.unmodifiableMap(c0305a);
    }

    public static cz m23555a(Context context, ac acVar, Lock lock, Looper looper, C5095d c5095d, Map map, bd bdVar, Map map2, C4931e c4931e, ArrayList arrayList) {
        C4949i c4949i = null;
        Map c0305a = new C0305a();
        Map c0305a2 = new C0305a();
        for (Entry entry : map.entrySet()) {
            C4949i c4949i2 = (C4949i) entry.getValue();
            if (c4949i2.mo4484c()) {
                c4949i = c4949i2;
            }
            if (c4949i2.mo4826l()) {
                c0305a.put((C5056g) entry.getKey(), c4949i2);
            } else {
                c0305a2.put((C5056g) entry.getKey(), c4949i2);
            }
        }
        am.m23739a(!c0305a.isEmpty(), (Object) "CompositeGoogleApiClient should not be used without any APIs that require sign-in.");
        Map c0305a3 = new C0305a();
        Map c0305a4 = new C0305a();
        for (C5053a c5053a : map2.keySet()) {
            C5056g b = c5053a.m23274b();
            if (c0305a.containsKey(b)) {
                c0305a3.put(c5053a, (Boolean) map2.get(c5053a));
            } else if (c0305a2.containsKey(b)) {
                c0305a4.put(c5053a, (Boolean) map2.get(c5053a));
            } else {
                throw new IllegalStateException("Each API in the isOptionalMap must have a corresponding client in the clients map.");
            }
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            cx cxVar = (cx) obj;
            if (c0305a3.containsKey(cxVar.f25824a)) {
                arrayList2.add(cxVar);
            } else if (c0305a4.containsKey(cxVar.f25824a)) {
                arrayList3.add(cxVar);
            } else {
                throw new IllegalStateException("Each ClientCallbacks must have a corresponding API in the isOptionalMap");
            }
        }
        return new cz(context, acVar, lock, looper, c5095d, c0305a, c0305a2, bdVar, c4931e, c4949i, arrayList2, arrayList3, c0305a3, c0305a4);
    }

    static boolean m23556b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.m23264b();
    }

    private final PendingIntent m23558i() {
        return this.f25834h == null ? null : PendingIntent.getActivity(this.f25827a, System.identityHashCode(this.f25828b), this.f25834h.mo4486d(), 134217728);
    }

    public final ConnectionResult mo4567a(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    public final cn mo4568a(cn cnVar) {
        if (!m23557c(cnVar)) {
            return this.f25830d.mo4568a(cnVar);
        }
        if (!m23572h()) {
            return this.f25831e.mo4568a(cnVar);
        }
        cnVar.m23084b(new Status(4, null, m23558i()));
        return cnVar;
    }

    public final void mo4569a() {
        this.f25840n = 2;
        this.f25838l = false;
        this.f25837k = null;
        this.f25836j = null;
        this.f25830d.mo4569a();
        this.f25831e.mo4569a();
    }

    final void m23562a(ConnectionResult connectionResult) {
        switch (this.f25840n) {
            case 1:
                break;
            case 2:
                this.f25828b.mo4548a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m23571g();
        this.f25840n = 0;
    }

    public final void mo4571a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f25831e.mo4571a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f25830d.mo4571a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public final boolean mo4572a(bo boVar) {
        this.f25839m.lock();
        try {
            if ((mo4577e() || mo4576d()) && !this.f25831e.mo4576d()) {
                this.f25833g.add(boVar);
                if (this.f25840n == 0) {
                    this.f25840n = 1;
                }
                this.f25837k = null;
                this.f25831e.mo4569a();
                return true;
            }
            this.f25839m.unlock();
            return false;
        } finally {
            this.f25839m.unlock();
        }
    }

    public final ConnectionResult mo4573b() {
        throw new UnsupportedOperationException();
    }

    public final cn mo4574b(cn cnVar) {
        if (!m23557c(cnVar)) {
            return this.f25830d.mo4574b(cnVar);
        }
        if (!m23572h()) {
            return this.f25831e.mo4574b(cnVar);
        }
        cnVar.m23084b(new Status(4, null, m23558i()));
        return cnVar;
    }

    public final void mo4575c() {
        this.f25837k = null;
        this.f25836j = null;
        this.f25840n = 0;
        this.f25830d.mo4575c();
        this.f25831e.mo4575c();
        m23571g();
    }

    public final boolean mo4576d() {
        boolean z = true;
        this.f25839m.lock();
        try {
            if (!(this.f25830d.mo4576d() && (this.f25831e.mo4576d() || m23572h() || this.f25840n == 1))) {
                z = false;
            }
            this.f25839m.unlock();
            return z;
        } catch (Throwable th) {
            this.f25839m.unlock();
        }
    }

    public final boolean mo4577e() {
        this.f25839m.lock();
        try {
            boolean z = this.f25840n == 2;
            this.f25839m.unlock();
            return z;
        } catch (Throwable th) {
            this.f25839m.unlock();
        }
    }

    public final void mo4578f() {
        this.f25839m.lock();
        try {
            boolean e = mo4577e();
            this.f25831e.mo4575c();
            this.f25837k = new ConnectionResult(4);
            if (e) {
                new Handler(this.f25829c).post(new da(this));
            } else {
                m23571g();
            }
            this.f25839m.unlock();
        } catch (Throwable th) {
            this.f25839m.unlock();
        }
    }

    final void m23571g() {
        for (bo f : this.f25833g) {
            f.mo4477f();
        }
        this.f25833g.clear();
    }

    final boolean m23572h() {
        return this.f25837k != null && this.f25837k.f25611c == 4;
    }

    private final boolean m23557c(cn cnVar) {
        C5056g c5056g = cnVar.f25455b;
        am.m23743b(this.f25832f.containsKey(c5056g), "GoogleApiClient is not configured to use the API required for this call.");
        return ((ak) this.f25832f.get(c5056g)).equals(this.f25831e);
    }
}
