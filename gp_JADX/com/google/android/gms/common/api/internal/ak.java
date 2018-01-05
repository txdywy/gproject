package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.C5095d;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C4931e;
import com.google.android.gms.common.api.C4949i;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.internal.bd;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public final class ak implements bd, cy {
    public final Lock f25679a;
    public final Condition f25680b;
    public final Context f25681c;
    public final C5095d f25682d;
    public final am f25683e;
    public final Map f25684f;
    public final Map f25685g = new HashMap();
    public bd f25686h;
    public Map f25687i;
    public C4931e f25688j;
    public volatile aj f25689k;
    public ConnectionResult f25690l = null;
    public int f25691m;
    public final ac f25692n;
    public final be f25693o;

    public ak(Context context, ac acVar, Lock lock, Looper looper, C5095d c5095d, Map map, bd bdVar, Map map2, C4931e c4931e, ArrayList arrayList, be beVar) {
        this.f25681c = context;
        this.f25679a = lock;
        this.f25682d = c5095d;
        this.f25684f = map;
        this.f25686h = bdVar;
        this.f25687i = map2;
        this.f25688j = c4931e;
        this.f25692n = acVar;
        this.f25693o = beVar;
        arrayList = arrayList;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((cx) obj).f25826c = this;
        }
        this.f25683e = new am(this, looper);
        this.f25680b = lock.newCondition();
        this.f25689k = new ab(this);
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
            toNanos = this.f25680b.awaitNanos(toNanos);
        }
        return mo4576d() ? ConnectionResult.f25609a : this.f25690l != null ? this.f25690l : new ConnectionResult(13, null);
    }

    public final cn mo4568a(cn cnVar) {
        cnVar.m23079g();
        return this.f25689k.mo4534a(cnVar);
    }

    public final void mo4569a() {
        this.f25689k.mo4541c();
    }

    public final void mo2362a(int i) {
        this.f25679a.lock();
        try {
            this.f25689k.mo4536a(i);
        } finally {
            this.f25679a.unlock();
        }
    }

    public final void mo2363a(Bundle bundle) {
        this.f25679a.lock();
        try {
            this.f25689k.mo4537a(bundle);
        } finally {
            this.f25679a.unlock();
        }
    }

    final void m23390a(ConnectionResult connectionResult) {
        this.f25679a.lock();
        try {
            this.f25690l = connectionResult;
            this.f25689k = new ab(this);
            this.f25689k.mo4535a();
            this.f25680b.signalAll();
        } finally {
            this.f25679a.unlock();
        }
    }

    public final void mo4570a(ConnectionResult connectionResult, C5053a c5053a, boolean z) {
        this.f25679a.lock();
        try {
            this.f25689k.mo4538a(connectionResult, c5053a, z);
        } finally {
            this.f25679a.unlock();
        }
    }

    final void m23392a(al alVar) {
        this.f25683e.sendMessage(this.f25683e.obtainMessage(1, alVar));
    }

    public final boolean mo4572a(bo boVar) {
        return false;
    }

    public final ConnectionResult mo4573b() {
        mo4569a();
        while (mo4577e()) {
            try {
                this.f25680b.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return new ConnectionResult(15, null);
            }
        }
        return mo4576d() ? ConnectionResult.f25609a : this.f25690l != null ? this.f25690l : new ConnectionResult(13, null);
    }

    public final cn mo4574b(cn cnVar) {
        cnVar.m23079g();
        return this.f25689k.mo4539b(cnVar);
    }

    public final void mo4575c() {
        if (this.f25689k.mo4540b()) {
            this.f25685g.clear();
        }
    }

    public final boolean mo4576d() {
        return this.f25689k instanceof C5072m;
    }

    public final boolean mo4577e() {
        return this.f25689k instanceof C5075p;
    }

    public final void mo4578f() {
    }

    public final void mo4571a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append(str).append("mState=").println(this.f25689k);
        for (C5053a c5053a : this.f25687i.keySet()) {
            printWriter.append(str).append(c5053a.f25636c).println(":");
            ((C4949i) this.f25684f.get(c5053a.m23274b())).m23036a(concat, printWriter);
        }
    }
}
