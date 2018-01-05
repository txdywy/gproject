package com.google.android.gms.common.api;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p037h.C0305a;
import android.util.Log;
import com.google.android.gms.common.C5096b;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.ac;
import com.google.android.gms.common.api.internal.bf;
import com.google.android.gms.common.api.internal.bg;
import com.google.android.gms.common.api.internal.ci;
import com.google.android.gms.common.api.internal.cj;
import com.google.android.gms.common.api.internal.cq;
import com.google.android.gms.common.api.internal.cx;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.bd;
import com.google.android.gms.internal.mq;
import com.google.android.gms.internal.mu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class C5089p {
    public Account f25916a;
    public final Set f25917b;
    public final Set f25918c;
    public String f25919d;
    public String f25920e;
    public final Map f25921f;
    public final Context f25922g;
    public final Map f25923h;
    public bf f25924i;
    public int f25925j;
    public C1634r f25926k;
    public Looper f25927l;
    public C5096b f25928m;
    public C4931e f25929n;
    public final ArrayList f25930o;
    public final ArrayList f25931p;

    public C5089p(Context context) {
        this.f25917b = new HashSet();
        this.f25918c = new HashSet();
        this.f25921f = new C0305a();
        this.f25923h = new C0305a();
        this.f25925j = -1;
        this.f25928m = C5096b.f25938a;
        this.f25929n = mq.f27193c;
        this.f25930o = new ArrayList();
        this.f25931p = new ArrayList();
        this.f25922g = context;
        this.f25927l = context.getMainLooper();
        this.f25919d = context.getPackageName();
        this.f25920e = context.getClass().getName();
    }

    public C5089p(Context context, C1632q c1632q, C1634r c1634r) {
        this(context);
        am.m23734a((Object) c1632q, (Object) "Must provide a connected listener");
        this.f25930o.add(c1632q);
        am.m23734a((Object) c1634r, (Object) "Must provide a connection failed listener");
        this.f25931p.add(c1634r);
    }

    public final C5089p m23646a(Handler handler) {
        am.m23734a((Object) handler, (Object) "Handler must not be null");
        this.f25927l = handler.getLooper();
        return this;
    }

    public final C5089p m23649a(C1632q c1632q) {
        am.m23734a((Object) c1632q, (Object) "Listener must not be null");
        this.f25930o.add(c1632q);
        return this;
    }

    public final C5089p m23650a(C1634r c1634r) {
        am.m23734a((Object) c1634r, (Object) "Listener must not be null");
        this.f25931p.add(c1634r);
        return this;
    }

    public final bd m23651a() {
        mu muVar = mu.f27196a;
        if (this.f25923h.containsKey(mq.f27195e)) {
            muVar = (mu) this.f25923h.get(mq.f27195e);
        }
        return new bd(this.f25916a, this.f25917b, this.f25921f, this.f25919d, this.f25920e, muVar);
    }

    public final C5089p m23647a(C5053a c5053a) {
        am.m23734a((Object) c5053a, (Object) "Api must not be null");
        this.f25923h.put(c5053a, null);
        Collection a = c5053a.f25634a.mo4473a(null);
        this.f25918c.addAll(a);
        this.f25917b.addAll(a);
        return this;
    }

    public final C5089p m23648a(C5053a c5053a, C5055d c5055d) {
        am.m23734a((Object) c5053a, (Object) "Api must not be null");
        am.m23734a((Object) c5055d, (Object) "Null options are not permitted for this Api");
        this.f25923h.put(c5053a, c5055d);
        Collection a = c5053a.f25634a.mo4473a(c5055d);
        this.f25918c.addAll(a);
        this.f25917b.addAll(a);
        return this;
    }

    public final C5058o m23652b() {
        Object obj;
        am.m23743b(!this.f25923h.isEmpty(), "must call addApi() to add at least one API");
        bd a = m23651a();
        C5053a c5053a = null;
        Map map = a.f26007d;
        Map c0305a = new C0305a();
        Map c0305a2 = new C0305a();
        ArrayList arrayList = new ArrayList();
        for (C5053a c5053a2 : this.f25923h.keySet()) {
            C5053a c5053a22;
            obj = this.f25923h.get(c5053a22);
            boolean z = map.get(c5053a22) != null;
            c0305a.put(c5053a22, Boolean.valueOf(z));
            C1632q cxVar = new cx(c5053a22, z);
            arrayList.add(cxVar);
            C4949i a2 = c5053a22.m23273a().mo4472a(this.f25922g, this.f25927l, a, obj, cxVar, cxVar);
            c0305a2.put(c5053a22.m23274b(), a2);
            if (!a2.mo4484c()) {
                c5053a22 = c5053a;
            } else if (c5053a != null) {
                String str = c5053a22.f25636c;
                String str2 = c5053a.f25636c;
                throw new IllegalStateException(new StringBuilder((String.valueOf(str).length() + 21) + String.valueOf(str2).length()).append(str).append(" cannot be used with ").append(str2).toString());
            }
            c5053a = c5053a22;
        }
        if (c5053a != null) {
            am.m23740a(this.f25916a == null, "Must not set an account in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead", c5053a.f25636c);
            am.m23740a(this.f25917b.equals(this.f25918c), "Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", c5053a.f25636c);
        }
        obj = new ac(this.f25922g, new ReentrantLock(), this.f25927l, a, this.f25928m, this.f25929n, c0305a, this.f25930o, this.f25931p, c0305a2, this.f25925j, ac.m23331a(c0305a2.values(), true), arrayList);
        synchronized (C5058o.f25642a) {
            C5058o.f25642a.add(obj);
        }
        if (this.f25925j >= 0) {
            bg a3 = LifecycleCallback.m23278a(this.f25924i);
            ci ciVar = (ci) a3.mo4586a("AutoManageHelper", ci.class);
            ci ciVar2 = ciVar != null ? ciVar : new ci(a3);
            int i = this.f25925j;
            C1634r c1634r = this.f25926k;
            am.m23734a(obj, (Object) "GoogleApiClient instance cannot be null");
            am.m23739a(ciVar2.f25803b.indexOfKey(i) < 0, "Already managing a GoogleApiClient with id " + i);
            cq cqVar = (cq) ciVar2.e.get();
            boolean z2 = ciVar2.d;
            String valueOf = String.valueOf(cqVar);
            Log.d("AutoManageHelper", new StringBuilder(String.valueOf(valueOf).length() + 49).append("starting AutoManage for client ").append(i).append(" ").append(z2).append(" ").append(valueOf).toString());
            ciVar2.f25803b.put(i, new cj(ciVar2, i, obj, c1634r));
            if (ciVar2.d && cqVar == null) {
                str = String.valueOf(obj);
                Log.d("AutoManageHelper", new StringBuilder(String.valueOf(str).length() + 11).append("connecting ").append(str).toString());
                obj.mo4557e();
            }
        }
        return obj;
    }
}
