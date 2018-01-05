package com.google.android.finsky.uninstall;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aj.C1190a;
import com.google.android.finsky.aj.C1193d;
import com.google.android.finsky.aj.C1194e;
import com.google.android.finsky.api.C1283d;
import com.google.android.finsky.api.C1289l;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2718h;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dk.C2824a;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p225k.C3640a;
import com.google.android.finsky.p225k.C3641b;
import com.google.android.finsky.p226m.C3741b;
import com.google.android.finsky.p226m.C3742c;
import com.google.android.finsky.stream.myapps.C4552s;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class ae implements C1193d, C1031w, C3641b, C3742c, bq {
    public final C4552s f23449a;
    public final C3741b f23450b;
    public final C1190a f23451c;
    public boolean f23452d = false;
    public boolean f23453e = false;
    public long f23454f;
    public long f23455g;
    public long f23456h;
    public ArrayList f23457i = new ArrayList();
    public List f23458j = null;
    public List f23459k = new ArrayList();
    public Set f23460l = new HashSet();
    public br f23461m;
    public HashSet f23462n = new HashSet();
    public Context f23463o;
    public C2495w f23464p;
    public C3646a f23465q;
    public C3640a f23466r;
    public C2824a f23467s;
    public final C2830g f23468t;
    public Handler f23469u = new Handler(Looper.getMainLooper());
    public boolean f23470v = false;
    public Runnable f23471w = new af(this);
    public boolean f23472x = false;
    public boolean f23473y = false;
    public boolean f23474z = true;

    ae(C3646a c3646a, C3640a c3640a, C2824a c2824a, C3741b c3741b, C1190a c1190a, C4552s c4552s, C2495w c2495w, ArrayList arrayList, Context context, C2830g c2830g) {
        this.f23463o = context;
        this.f23464p = c2495w;
        this.f23465q = c3646a;
        this.f23466r = c3640a;
        this.f23467s = c2824a;
        this.f23468t = c2830g;
        this.f23450b = c3741b;
        this.f23451c = c1190a;
        this.f23449a = c4552s;
        m21283d();
        if (arrayList.size() == 0) {
            this.f23472x = true;
        } else if (arrayList.size() == 1) {
            C2335k c2719i = new C2719i(C1473m.f7980a.ap(), C1289l.m7694a((String) arrayList.get(0)));
            c2719i.m11918a(new ai(this, c2719i));
            c2719i.m11917a(new aj(this));
        } else {
            C2335k c2718h = new C2718h(C1473m.f7980a.ap(), C1283d.m7689a(arrayList), false);
            c2718h.m11918a(new ag(this, c2718h));
            c2718h.m11917a(new ah(this));
        }
    }

    final void m21283d() {
        this.f23466r.m17236a((C3641b) this);
        this.f23450b.m17619a((C3742c) this);
        this.f23451c.f7290c.add(this);
        this.f23449a.m21171a((C1031w) this);
    }

    public final long mo4267a() {
        return this.f23455g;
    }

    public final long mo4271b() {
        return this.f23456h;
    }

    public final List mo4273c() {
        FinskyLog.m21669e("getDocsForSelection() Should not be called.", new Object[0]);
        return null;
    }

    final List m21285f() {
        if (this.f23460l.isEmpty()) {
            return this.f23458j;
        }
        List arrayList = new ArrayList();
        for (Document document : this.f23458j) {
            if (!this.f23460l.contains(document.cf())) {
                arrayList.add(document);
            }
        }
        return arrayList;
    }

    public final ArrayList mo4274e() {
        return this.f23457i;
    }

    public final boolean m21287h() {
        if (this.f23474z) {
            return this.f23449a.m21174d() && this.f23453e && this.f23452d && this.f23450b.m17620a() && this.f23451c.m7144a() && this.f23466r.m17237a();
        } else {
            return m21270j();
        }
    }

    private final boolean m21270j() {
        return this.f23449a.m21174d() && this.f23466r.m17237a();
    }

    public final void mo4270a(br brVar) {
        this.f23461m = brVar;
    }

    public final void mo4269a(C1031w c1031w) {
        if (!this.f23462n.contains(c1031w)) {
            this.f23462n.add(c1031w);
        }
    }

    public final void mo4272b(C1031w c1031w) {
        this.f23462n.remove(c1031w);
    }

    private final void m21271l() {
        int i = 0;
        this.f23474z = false;
        C1031w[] c1031wArr = (C1031w[]) this.f23462n.toArray(new C1031w[this.f23462n.size()]);
        int length = c1031wArr.length;
        while (i < length) {
            c1031wArr[i].m_();
            i++;
        }
    }

    final void m21273a(VolleyError volleyError) {
        this.f23473y = false;
        if (this.f23461m != null) {
            this.f23461m.a_(volleyError);
        }
    }

    final void m21288i() {
        if (m21287h() || (m21270j() && this.f23470v)) {
            this.f23469u.removeCallbacks(this.f23471w);
            this.f23458j = new ArrayList(this.f23459k);
            m21271l();
        }
    }

    public final void mo4275g() {
        if (!this.f23457i.isEmpty() || this.f23472x) {
            this.f23453e = false;
            if (this.f23459k != null) {
                this.f23459k.clear();
            }
            if (!this.f23452d) {
                bb.m21792a(new al(this), new Void[0]);
            }
            this.f23450b.m17618a(this.f23463o, this.f23464p);
            this.f23449a.m21172b();
            bb.m21792a(new ak(this), new Void[0]);
            this.f23470v = false;
            this.f23469u.postDelayed(this.f23471w, ((Long) C0955b.gj.m28964b()).longValue());
            return;
        }
        this.f23473y = true;
    }

    public final void mo4134a(Map map) {
        m21288i();
    }

    public final void m_() {
        List<Document> e = this.f23449a.m21175e();
        this.f23459k = new ArrayList();
        List arrayList = new ArrayList();
        ArrayList arrayList2 = this.f23457i;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            arrayList.add(((Document) obj).m14625N().f13171k);
        }
        for (Document document : e) {
            CharSequence cf = document.cf();
            C2322b a = this.f23465q.f18023c.mo2854a(cf);
            if (!(a == null || a.f11424i || a.f11422g || TextUtils.equals(cf, "com.google.android.instantapps.supervisor") || arrayList.contains(cf) || "com.google.android.gms".equals(cf) || this.f23460l.contains(document.cf()))) {
                this.f23459k.add(document);
            }
        }
        this.f23466r.m17235a(this.f23467s, this.f23464p, this.f23459k);
        m21288i();
        this.f23451c.m7143a(this.f23459k);
        m21288i();
    }

    public final void mo4268a(C1194e c1194e) {
        String str = "Data model got stats for ";
        String valueOf = String.valueOf(c1194e.f7296a);
        FinskyLog.m21659a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        m21288i();
    }

    final void m21278a(List list) {
        for (Document cf : list) {
            this.f23460l.add(cf.cf());
        }
    }

    public final void mo4133a(String str) {
        m21288i();
    }
}
