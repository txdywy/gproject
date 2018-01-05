package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cn.C2322b;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dk.C2824a;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p142j.C3632i;
import com.google.android.finsky.p142j.C3633l;
import com.google.android.finsky.p142j.C3635n;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.p225k.C3640a;
import com.google.android.finsky.p225k.C3641b;
import com.google.android.finsky.p226m.C3740a;
import com.google.android.finsky.p226m.C3741b;
import com.google.android.finsky.p226m.C3742c;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.playcard.PlayCardViewMyAppsV2;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4255t;
import com.google.android.finsky.stream.myapps.C4344x;
import com.google.android.finsky.stream.myapps.C4560y;
import com.google.android.finsky.stream.myapps.C4561z;
import com.google.android.finsky.stream.myapps.aa;
import com.google.android.finsky.stream.myapps.ab;
import com.google.android.finsky.stream.myapps.view.C4345e;
import com.google.android.finsky.stream.myapps.view.C4558d;
import com.google.android.finsky.stream.myapps.view.MyAppsClusterWithSortingHeader;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import p002a.C0002a;

public final class au extends C4344x implements C3635n, C3641b, C3742c, C4345e {
    public static final C3632i[] f21859a = new C3632i[]{C3632i.ALPHABETICAL, C3632i.LAST_UPDATED, C3632i.LAST_USAGE, C3632i.SIZE};
    public final C0002a f21860b;
    public final C2824a f21861o;
    public final ao f21862p;
    public WeakHashMap f21863q = new WeakHashMap();
    public C3633l f21864r;
    public C3632i f21865s;
    public long f21866t;
    public C3640a f21867u;
    public Handler f21868v = new Handler(Looper.getMainLooper());
    public C4558d f21869w;
    public Runnable f21870x = new av(this);

    public au(Context context, C3748a c3748a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C2495w c2495w, C0002a c0002a, C2824a c2824a, C3646a c3646a, C3340g c3340g, C1461c c1461c, C3851f c3851f, C3028c c3028c, C2266a c2266a, C0988c c0988c, ao aoVar, aa aaVar, C2171b c2171b, ab abVar) {
        super(context, c3748a, adVar, c4230c, c1611k, c1556d, c2495w, c3646a, c3340g, c1461c, c3851f, c3028c, c2266a, c0988c, aaVar, c2171b, abVar);
        this.f21860b = c0002a;
        this.f21861o = c2824a;
        this.f21862p = aoVar;
    }

    public final void mo4050a(C2720j c2720j) {
        this.f21865s = C3632i.m17226a(((Integer) C0954a.aT.m5760a()).intValue());
        this.f21867u = C1473m.f7980a.ba();
        this.f21867u.m17236a((C3641b) this);
        super.mo4050a(c2720j);
        ((C3741b) this.f21860b.mo1a()).m17619a((C3742c) this);
        ((C3741b) this.f21860b.mo1a()).m17618a(this.e, this.i);
    }

    protected final int mo4135b() {
        return 2808;
    }

    protected final void mo4137c() {
        if (this.K != null) {
            Collections.sort(this.K, this.f21865s.f18000j);
        }
    }

    public final void mo4061q() {
        super.mo4061q();
        C0954a.aT.m5763a(Integer.valueOf(this.f21865s.f17997g));
        if (this.f21864r != null) {
            this.f21864r.af = null;
        }
        ((C3741b) this.f21860b.mo1a()).m17621b(this);
        this.f21868v.removeCallbacks(this.f21870x);
        if (this.f21867u != null) {
            this.f21867u.m17238b(this);
        }
    }

    public final void mo4133a(String str) {
        if (C3632i.SIZE.equals(this.f21865s)) {
            this.f21868v.removeCallbacks(this.f21870x);
            this.f21868v.postDelayed(this.f21870x, ((Long) C0955b.hI.m28964b()).longValue());
            return;
        }
        m20158g(str);
    }

    public final void mo4134a(Map map) {
        if (!(this.C == null || this.K == null || m20170p())) {
            if (C3632i.LAST_USAGE.equals(this.f21865s)) {
                mo4137c();
            }
            for (C3740a c3740a : map.values()) {
                if (c3740a.f18883b > this.f21866t) {
                    m20158g(c3740a.f18882a);
                }
            }
        }
        this.f21866t = System.currentTimeMillis();
    }

    protected final void mo4130a(View view) {
        if (this.f21869w == null) {
            this.f21869w = m20169m();
        }
        ((MyAppsClusterWithSortingHeader) view).m21177a(this.f21869w, this);
    }

    protected final int mo4139d() {
        return C7582R.layout.my_apps_cluster_with_sorting_header;
    }

    private final C4558d m20169m() {
        C4558d c4558d = new C4558d();
        c4558d.f23301a = m20122a(this.g.f14908a);
        c4558d.f23302b = null;
        c4558d.f23303c = true;
        c4558d.f23304d = this.f21865s.m17227a(this.e);
        return c4558d;
    }

    protected final void mo4132a(PlayCardViewMyAppsV2 playCardViewMyAppsV2, int i) {
        if (!m20170p()) {
            ((C3741b) this.f21860b.mo1a()).m17618a(this.e, this.i);
        }
        Document document = (Document) this.K.get(i);
        String cf = document.cf();
        int intValue = m20157f(cf) != null ? m20157f(cf).intValue() : 1;
        switch (intValue) {
            case 0:
            case 3:
            case 6:
                this.f21862p.m18519a((d) playCardViewMyAppsV2, document, "my_apps2:installed", this.f, (ad) this, this.i, this.A.mo3485c(document.m14625N().f13171k));
                playCardViewMyAppsV2.m18460a(intValue, false, null, null, null, null, false);
                break;
            case 2:
                this.f21862p.m18518a((d) playCardViewMyAppsV2, document, "my_apps2:installed", this.f, (ad) this, this.i);
                playCardViewMyAppsV2.m18460a(2, false, ab.m21143a(this.e, document, this.f21867u), m20168b(document), this.e.getResources().getString(C7582R.string.update), null, false);
                break;
            default:
                this.f21862p.m18518a((d) playCardViewMyAppsV2, document, "my_apps2:installed", this.f, (ad) this, this.i);
                playCardViewMyAppsV2.m18460a(1, false, ab.m21143a(this.e, document, this.f21867u), m20168b(document), this.e.getResources().getString(C7582R.string.open), null, false);
                break;
        }
        playCardViewMyAppsV2.setActionListener(this);
    }

    private final String m20168b(Document document) {
        if (m20170p()) {
            return ab.m21144a(this.e, document, this.z);
        }
        return ab.m21145a(this.e, document, (C3741b) this.f21860b.mo1a());
    }

    private final boolean m20170p() {
        return C3632i.LAST_UPDATED.equals(this.f21865s);
    }

    public final void mo1205a(C3369m c3369m) {
        Document b = mo4136b(c3369m.m16819a());
        if (b == null) {
            m20137a(false);
            return;
        }
        C4560y v = m20167v();
        switch (c3369m.f17273c.f17153d) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 10:
            case 11:
                m20135a(c3369m.m16819a(), b, c3369m.f17273c.f17153d);
                m20134a(v);
                return;
            default:
                return;
        }
    }

    protected final List mo4129a(List list) {
        m20164r();
        this.f21863q.clear();
        List arrayList = new ArrayList();
        if (list != null) {
            for (Document document : list) {
                this.y.m15637b(document);
                String str = document.m14625N().f13171k;
                C2322b a = this.z.f18023c.mo2854a(str);
                if (!(a == null || a.f11424i)) {
                    arrayList.add(document);
                    this.f21863q.put(document.m14625N().f13171k, document);
                    m20135a(str, document, C3371p.m16828a(this.A.mo3482b(str)));
                }
            }
            this.f21867u.m17235a(this.f21861o, this.i, arrayList);
        }
        return arrayList;
    }

    protected final Document mo4136b(String str) {
        if (this.f21863q.containsKey(str)) {
            return (Document) this.f21863q.get(str);
        }
        return null;
    }

    public final void mo4131a(C3632i c3632i) {
        if (this.f21865s != c3632i) {
            boolean p = m20170p();
            this.f21865s = c3632i;
            C4344x.m20118a(this.i, (ad) this, this.f21865s.f17999i);
            this.f21869w = m20169m();
            if (this.C != null) {
                this.C.mo4087a(this, 0, 1, false);
            }
            C4560y v = m20167v();
            if (p || m20170p()) {
                v.f23316j = true;
            }
            mo4137c();
            m20134a(v);
        }
    }

    public final void cd_() {
        boolean z;
        android.support.v4.app.ab j = this.f.mo3708j();
        if (C3632i.LAST_USAGE.f18001k || !((C3741b) this.f21860b.mo1a()).m17620a()) {
            z = false;
        } else {
            C3632i.LAST_USAGE.f18001k = true;
            z = true;
        }
        if (!C3632i.SIZE.f18001k && this.f21867u.m17237a()) {
            C3632i.SIZE.f18001k = true;
            z = true;
        }
        if (z) {
            this.f21864r = C3633l.m17228a(f21859a, C3632i.ALPHABETICAL);
        }
        if (this.f21864r == null) {
            this.f21864r = (C3633l) j.mo283a("myapps_installed_sorter");
            if (this.f21864r == null) {
                this.f21864r = C3633l.m17228a(f21859a, C3632i.ALPHABETICAL);
            }
        }
        this.f21864r.af = this;
        this.f21864r.m17230a(this.f21865s);
        this.f21864r.m625a(j, "myapps_installed_sorter");
    }

    public final /* synthetic */ void mo4052a(C4255t c4255t) {
        super.mo4052a((C4255t) (C4561z) c4255t);
        this.f21864r = (C3633l) this.f.mo3708j().mo283a("myapps_installed_sorter");
        if (this.f21864r != null) {
            this.f21864r.af = this;
        }
    }
}
