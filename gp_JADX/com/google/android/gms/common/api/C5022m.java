package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.p037h.C0308c;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.C4966t;
import com.google.android.gms.common.api.internal.C5071k;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.ao;
import com.google.android.gms.common.api.internal.aq;
import com.google.android.gms.common.api.internal.aw;
import com.google.android.gms.common.api.internal.az;
import com.google.android.gms.common.api.internal.bg;
import com.google.android.gms.common.api.internal.bl;
import com.google.android.gms.common.api.internal.bp;
import com.google.android.gms.common.api.internal.bs;
import com.google.android.gms.common.api.internal.bw;
import com.google.android.gms.common.api.internal.ce;
import com.google.android.gms.common.api.internal.cg;
import com.google.android.gms.common.api.internal.ch;
import com.google.android.gms.common.api.internal.cn;
import com.google.android.gms.common.internal.am;
import com.google.android.gms.common.internal.be;
import com.google.android.gms.tasks.C5587d;
import com.google.android.gms.tasks.C5588e;
import java.util.Collection;

public class C5022m {
    public final Context f25585a;
    public final C5053a f25586b;
    public final C4925b f25587c;
    public final ch f25588d;
    public final Looper f25589e;
    public final int f25590f;
    public final C5058o f25591g;
    public final bs f25592h;
    public final ao f25593i;

    public C5022m(Context context, C5053a c5053a, Looper looper) {
        am.m23734a((Object) context, (Object) "Null context is not permitted.");
        am.m23734a((Object) c5053a, (Object) "Api must not be null.");
        am.m23734a((Object) looper, (Object) "Looper must not be null.");
        this.f25585a = context.getApplicationContext();
        this.f25586b = c5053a;
        this.f25587c = null;
        this.f25589e = looper;
        this.f25588d = new ch(c5053a);
        this.f25591g = new aw(this);
        this.f25593i = ao.m23405a(this.f25585a);
        this.f25590f = this.f25593i.f25707k.getAndIncrement();
        this.f25592h = new cg();
    }

    public C5022m(Activity activity, C5053a c5053a, C5088n c5088n) {
        am.m23734a((Object) activity, (Object) "Null activity is not permitted.");
        am.m23734a((Object) c5053a, (Object) "Api must not be null.");
        am.m23734a((Object) c5088n, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f25585a = activity.getApplicationContext();
        this.f25586b = c5053a;
        this.f25587c = null;
        this.f25589e = c5088n.f25915c;
        this.f25588d = ch.m23529a(this.f25586b, this.f25587c);
        this.f25591g = new aw(this);
        this.f25593i = ao.m23405a(this.f25585a);
        this.f25590f = this.f25593i.f25707k.getAndIncrement();
        this.f25592h = c5088n.f25914b;
        ao aoVar = this.f25593i;
        Object obj = this.f25588d;
        LifecycleCallback.m23277a(activity);
        bg a = LifecycleCallback.m23277a(activity);
        C5071k c5071k = (C5071k) a.mo4586a("ConnectionlessLifecycleHelper", C5071k.class);
        if (c5071k == null) {
            c5071k = new C5071k(a);
        }
        c5071k.f25873c = aoVar;
        am.m23734a(obj, (Object) "ApiKey cannot be null");
        c5071k.f25872b.add(obj);
        aoVar.m23418a(c5071k);
        this.f25593i.m23419a(this);
    }

    public C5022m(Context context, C5053a c5053a, C5088n c5088n) {
        am.m23734a((Object) context, (Object) "Null context is not permitted.");
        am.m23734a((Object) c5053a, (Object) "Api must not be null.");
        am.m23734a((Object) c5088n, (Object) "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.f25585a = context.getApplicationContext();
        this.f25586b = c5053a;
        this.f25587c = null;
        this.f25589e = c5088n.f25915c;
        this.f25588d = ch.m23529a(this.f25586b, this.f25587c);
        this.f25591g = new aw(this);
        this.f25593i = ao.m23405a(this.f25585a);
        this.f25590f = this.f25593i.f25707k.getAndIncrement();
        this.f25592h = c5088n.f25914b;
        this.f25593i.m23419a(this);
    }

    @Deprecated
    public C5022m(Context context, C5053a c5053a, bs bsVar) {
        ab abVar = new ab();
        am.m23734a((Object) bsVar, (Object) "StatusExceptionMapper must not be null.");
        abVar.f25637a = bsVar;
        this(context, c5053a, abVar.m23275a());
    }

    public final cn m23219a(cn cnVar) {
        cnVar.m23079g();
        ao aoVar = this.f25593i;
        aoVar.f25713q.sendMessage(aoVar.f25713q.obtainMessage(4, new bl(new az(cnVar), aoVar.f25708l.get(), this)));
        return cnVar;
    }

    public final C5587d m23220a(bw bwVar) {
        C5588e c5588e = new C5588e();
        ao aoVar = this.f25593i;
        aoVar.f25713q.sendMessage(aoVar.f25713q.obtainMessage(4, new bl(new ce(bwVar, c5588e, this.f25592h), aoVar.f25708l.get(), this)));
        return c5588e.f28505a;
    }

    public C4949i mo4602a(Looper looper, aq aqVar) {
        be a = mo5051a();
        a.f26014c = this.f25585a.getPackageName();
        a.f26015d = this.f25585a.getClass().getName();
        return this.f25586b.m23273a().mo4472a(this.f25585a, looper, a.m23771a(), this.f25587c, aqVar, aqVar);
    }

    private final be mo5051a() {
        be beVar = new be();
        beVar.f26012a = this.f25587c instanceof C5054c ? ((C5054c) this.f25587c).m23276a() : null;
        return beVar;
    }

    public bp mo4603a(Context context, Handler handler) {
        be a = mo5051a();
        GoogleSignInOptions b = C4966t.m23100a(this.f25585a).m23107b();
        if (b != null) {
            Collection a2 = b.m22964a();
            if (a.f26013b == null) {
                a.f26013b = new C0308c();
            }
            a.f26013b.addAll(a2);
        }
        return new bp(context, handler, a.m23771a());
    }
}
