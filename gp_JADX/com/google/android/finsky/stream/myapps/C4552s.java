package com.google.android.finsky.stream.myapps;

import android.app.Application;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dv.C2899a;
import com.google.android.finsky.dv.C2906h;
import com.google.android.finsky.p107l.C3646a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class C4552s implements C0999d {
    public static final Map f23274a = new HashMap();
    public boolean f23275b;
    public final C1031w f23276c;
    public final C0657w f23277d;
    public final String f23278e;
    public final boolean f23279f;
    public final C2206c f23280g;
    public final C1461c f23281h;
    public final C2906h f23282i;
    public final C3646a f23283j;
    public AsyncTask f23284k;
    public VolleyError f23285l;
    public C2899a f23286m;
    public Map f23287n;
    public Set f23288o = new HashSet();
    public Set f23289p = new HashSet();
    public boolean f23290q;

    public static synchronized C4552s m21168a(String str, Application application, C1461c c1461c, C2206c c2206c, C2906h c2906h, C3646a c3646a) {
        C4552s c4552s;
        synchronized (C4552s.class) {
            WeakReference weakReference = (WeakReference) f23274a.get(str);
            c4552s = weakReference == null ? null : (C4552s) weakReference.get();
            if (c4552s == null) {
                c4552s = new C4552s(str, application, c1461c, c2206c, c2906h, c3646a);
                f23274a.put(str, new WeakReference(c4552s));
                c4552s.m21172b();
            }
        }
        return c4552s;
    }

    private C4552s(String str, Application application, C1461c c1461c, C2206c c2206c, C2906h c2906h, C3646a c3646a) {
        this.f23278e = str;
        this.f23281h = c1461c;
        this.f23280g = c2206c;
        this.f23282i = c2906h;
        this.f23283j = c3646a;
        this.f23279f = this.f23281h.dj().mo2294a(12611069);
        this.f23280g.mo2814a((C0999d) this);
        this.f23276c = new C4553t(this);
        this.f23277d = new C4554u(this);
        application.registerReceiver(new C4559w(str, application), new IntentFilter("com.google.android.finsky.action.CONTENT_FILTERS_CHANGED"));
    }

    final void m21169a() {
        int i = 0;
        this.f23285l = null;
        this.f23275b = false;
        C1031w[] c1031wArr = (C1031w[]) this.f23288o.toArray(new C1031w[this.f23288o.size()]);
        int length = c1031wArr.length;
        while (i < length) {
            c1031wArr[i].m_();
            i++;
        }
    }

    public final void m21172b() {
        if (this.f23284k == null || this.f23284k.getStatus() == Status.FINISHED || this.f23284k.isCancelled()) {
            this.f23285l = null;
            this.f23275b = true;
            this.f23284k = new C4555v(this).execute(new Void[0]);
        }
    }

    public final void m21171a(C1031w c1031w) {
        this.f23288o.add(c1031w);
    }

    public final void m21173b(C1031w c1031w) {
        this.f23288o.remove(c1031w);
    }

    public final boolean m21174d() {
        return (this.f23275b || this.f23286m == null || this.f23286m.f15421r == null) ? false : true;
    }

    public final List m21175e() {
        if (this.f23286m == null) {
            return null;
        }
        return this.f23286m.f15421r;
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        this.f23286m = null;
        m21172b();
    }
}
