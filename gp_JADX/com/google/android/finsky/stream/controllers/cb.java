package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import com.android.volley.C0657w;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.cv.p177a.ce;
import com.google.android.finsky.cv.p177a.cv;
import com.google.android.finsky.cv.p177a.jj;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2732y;
import com.google.android.finsky.dfemodel.C2733z;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.ab;
import com.google.android.finsky.frameworkviews.BucketRowLayout;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4253a;
import com.google.android.finsky.stream.controllers.view.TopChartsClusterHeaderView;
import com.google.android.finsky.stream.controllers.view.TopChartsRowLayout;
import com.google.android.finsky.stream.controllers.view.ap;
import com.google.android.finsky.stream.p251b.C4241a;
import com.google.android.finsky.stream.p251b.C4242b;
import com.google.android.finsky.stream.p251b.C4243c;
import com.google.android.finsky.utils.FinskyLog;
import com.squareup.leakcanary.C7582R;

public class cb extends C4253a implements C2732y, C2733z, C4243c, ap {
    public final C1461c f21961E;
    public final C4241a f21962F;
    public final ab f21963G;
    public final C3028c f21964H;
    public jj f21965I;
    public boolean f21966J;
    public boolean f21967K;
    public boolean f21968L;
    public int f21969M;
    public Handler f21970N;
    public boolean f21971O = false;
    public Document f21972P;
    public int f21973Q;

    public cb(Context context, C3748a c3748a, C4808a c4808a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C4239i c4239i, C2495w c2495w, C1461c c1461c, C4241a c4241a, ab abVar, C3340g c3340g, C1287h c1287h, C3028c c3028c, ao aoVar, ac acVar) {
        super(context, c3748a, c4808a, adVar, c4230c, c1611k, c1556d, c4239i, c2495w, c3340g, c1287h, c1461c, aoVar, acVar);
        this.f21961E = c1461c;
        this.f21962F = c4241a;
        this.f21963G = abVar;
        this.f21964H = c3028c;
    }

    public final void mo4050a(C2720j c2720j) {
        Document document;
        boolean z;
        jj jjVar;
        cv cvVar;
        boolean z2 = true;
        this.f21972P = c2720j.f14908a;
        if (this.f21972P != null) {
            document = this.f21972P;
            z = document.m14660o() && document.f14885a.f12111r.f12022h.length > 0;
            if (z) {
                z = true;
                this.f21966J = z;
                document = this.f21972P;
                if (document == null && document.aT()) {
                    jjVar = document.aU().f12963b;
                } else {
                    jjVar = null;
                }
                this.f21965I = jjVar;
                if (this.f21965I != null || this.f21965I.f12788a.length <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                this.f21967K = z;
                this.f21969M = mo4173u();
                this.f21968L = mo4172t();
                if (this.f21961E.dj().mo2294a(12607749) && this.f21972P != null) {
                    cvVar = this.f21972P.f14885a;
                }
                if (this.f21969M != 2) {
                    z2 = false;
                }
                this.f21971O = z2;
                if (this.f21971O) {
                    this.f21970N = new Handler();
                }
                super.mo4050a(c2720j);
                m20353v();
            }
        }
        z = false;
        this.f21966J = z;
        document = this.f21972P;
        if (document == null) {
        }
        jjVar = null;
        this.f21965I = jjVar;
        if (this.f21965I != null) {
        }
        z = false;
        this.f21967K = z;
        this.f21969M = mo4173u();
        this.f21968L = mo4172t();
        cvVar = this.f21972P.f14885a;
        if (this.f21969M != 2) {
            z2 = false;
        }
        this.f21971O = z2;
        if (this.f21971O) {
            this.f21970N = new Handler();
        }
        super.mo4050a(c2720j);
        m20353v();
    }

    private final void m20353v() {
        boolean z;
        int i;
        this.D = new cf();
        this.f21973Q = this.e.getResources().getDimensionPixelSize(C7582R.dimen.flat_top_charts_header_edge_padding);
        if (this.f21971O) {
            C4241a c4241a = this.f21962F;
            if (!c4241a.f21463b.contains(this)) {
                c4241a.f21463b.add(this);
            }
        }
        if (this.f21966J) {
            C1254c c1254c = this.g.f14909b;
            ce[] p = this.f21972P.m14661p();
            z = false;
            for (boolean z2 = false; z2 < p.length; z2++) {
                String str = p[z2].f12028e;
                if (p[z2].f12026c) {
                    ((cf) this.D).f22009h.add(this.g);
                    z = z2;
                } else {
                    ((cf) this.D).f22009h.add(C2721l.m14733a(c1254c, str, true, true));
                }
            }
        } else {
            z = false;
        }
        if (((cf) this.D).f22009h.isEmpty()) {
            ((cf) this.D).f22009h.add(this.g);
        }
        ((cf) this.D).f22007f = this.f21961E.dj().mo2294a(12613101);
        if (this.f21971O) {
            m20354w();
        }
        if (this.f21968L) {
            m20351c(false);
        }
        if (((cf) this.D).f22006e != z) {
            m20352f(((cf) this.D).f22006e);
        }
        cf cfVar = (cf) this.D;
        jj jjVar = this.f21965I;
        if (jjVar != null) {
            i = 0;
            while (i < jjVar.f12788a.length) {
                if (jjVar.f12788a[i].m12870d() && jjVar.f12788a[i].by_().f12783d) {
                    break;
                }
                i++;
            }
        }
        i = 0;
        cfVar.f22008g = i;
        m19762r();
    }

    private final void m20354w() {
        C4242b d = this.f21962F.m19702d();
        if (d != null) {
            ((cf) this.D).f22007f = !d.f21466a;
            ((cf) this.D).f22006e = d.f21467b;
            if (((cf) this.D).f22006e >= ((cf) this.D).f22009h.size()) {
                ((cf) this.D).f22006e = ((cf) this.D).f22009h.size() - 1;
            }
        }
    }

    protected boolean mo4172t() {
        return this.f21972P != null && this.f21972P.f14885a.f12099f == 3;
    }

    protected int mo4173u() {
        return this.f21972P.aU().f12964c;
    }

    private final void m20349a(cf cfVar) {
        int i = ((cf) this.D).f22006e;
        this.D = cfVar;
        if (this.f21971O) {
            m20354w();
        }
        if (this.f21968L) {
            m20351c(false);
        }
        if (((cf) this.D).f22006e != i) {
            m20352f(((cf) this.D).f22006e);
        }
        m19762r();
    }

    private final void m20352f(int i) {
        C2335k c2335k = this.g;
        if (c2335k != null) {
            c2335k.m11922b((C1031w) this);
            c2335k.m11921b((C0657w) this);
            c2335k.m14690b((C2733z) this);
        }
        this.g = (C2720j) ((cf) this.D).f22009h.get(i);
        if (this.f21968L) {
            m20351c(false);
        }
        this.g.m11918a((C1031w) this);
        this.g.m11917a((C0657w) this);
        int a = mo1508a();
        m19762r();
        m20347a(m19768c(), a, mo1508a());
        if (!this.g.mo2861a()) {
            this.g.m14699n();
        }
        ((cf) this.D).f22006e = i;
    }

    private final void m20351c(boolean z) {
        this.g.m14681a((C2732y) this);
        if (z) {
            this.g.m14682a((C2733z) this);
        } else {
            this.g.m14690b((C2733z) this);
        }
        if (((cf) this.D).f22007f) {
            this.g.m14701p();
        } else {
            this.g.m14689b(0);
        }
        this.g.m14690b((C2733z) this);
    }

    protected final int mo4151n() {
        if (this.f21967K || this.f21966J || this.f21968L) {
            return C7582R.layout.top_charts_cluster_header;
        }
        return -1;
    }

    protected int mo4096m() {
        return C7582R.layout.top_charts_cluster_row;
    }

    protected int mo4094d() {
        return C7582R.layout.flat_card_listing;
    }

    protected boolean mo4167b() {
        return true;
    }

    protected int mo4095l() {
        return 1;
    }

    protected final void mo4150b(View view) {
        ((TopChartsClusterHeaderView) view).m20714a(this.f21966J, ((cf) this.D).f22006e, this.f21967K, ((cf) this.D).f22008g, this.f21965I, this.f21968L, ((cf) this.D).f22007f, this.f21972P, this, this.f21973Q, this.h, this.i);
    }

    public final void mo4061q() {
        super.mo4061q();
        if (this.f21971O) {
            this.f21962F.f21463b.remove(this);
        }
    }

    public final void mo4168c(int i) {
        m20348a(i, true);
    }

    public final void mo4169d(int i) {
        if (i != ((cf) this.D).f22008g) {
            String str;
            if (this.f21965I == null || i >= this.f21965I.f12788a.length || !this.f21965I.f12788a[i].m12870d()) {
                str = null;
            } else {
                str = this.f21965I.f12788a[i].by_().f12782c;
            }
            if (str == null) {
                FinskyLog.m21669e("url for category[position] should not be null", new Object[0]);
                return;
            }
            this.f21962F.m19703e();
            this.f.mo3673a(str, null, this.f21972P.f14885a.f12099f, this.f21972P.m14648e(), this.f21963G.dn(), (ad) this, this.i);
        }
    }

    public final void mo4164a(boolean z) {
        m20350a(z, true);
    }

    public final void mo4171e(int i) {
        m20348a(i, false);
    }

    public final void mo4166b(boolean z) {
        m20350a(z, false);
    }

    private final void m20348a(int i, boolean z) {
        if (((cf) this.D).f22006e != i) {
            m20352f(i);
            if (!this.f21971O) {
                return;
            }
            if (z) {
                this.f21970N.post(new cc(this, i));
            } else {
                m20355x();
            }
        }
    }

    private final void m20350a(boolean z, boolean z2) {
        boolean z3 = false;
        if (((cf) this.D).f22007f != (!z)) {
            cf cfVar = (cf) this.D;
            if (!z) {
                z3 = true;
            }
            cfVar.f22007f = z3;
            m20351c(true);
            if (!this.f21971O) {
                return;
            }
            if (z2) {
                this.f21970N.post(new cd(this, z));
            } else {
                m20355x();
            }
        }
    }

    private final void m20355x() {
        this.f21970N.post(new ce(this));
    }

    public final void mo4162a(int i, int i2) {
        if (mo4095l() == 1) {
            this.C.mo4088b(this, m19768c() + i, i2);
        }
    }

    public final void mo4165b(int i, int i2) {
        if (mo4095l() == 1) {
            this.C.mo4086a(this, m19768c() + i, i2);
        }
    }

    public final void mo4170e() {
        int a = mo1508a();
        m19762r();
        if (mo4095l() != 1) {
            m20347a(m19768c(), a, mo1508a());
        }
    }

    protected int mo4097o() {
        return 445;
    }

    protected void mo4064a(BucketRowLayout bucketRowLayout, int i) {
        if (bucketRowLayout instanceof TopChartsRowLayout) {
            TopChartsRowLayout topChartsRowLayout = (TopChartsRowLayout) bucketRowLayout;
            boolean z = mo4094d() == C7582R.layout.flat_card_listing;
            Resources resources = topChartsRowLayout.getResources();
            if (z) {
                topChartsRowLayout.f23066g = resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_card_to_card_vpadding);
                topChartsRowLayout.f23067h = 0;
                topChartsRowLayout.f23069j = 0;
            } else {
                topChartsRowLayout.f23067h = resources.getDimensionPixelSize(C7582R.dimen.flat_grid_card_to_card_vpadding);
                topChartsRowLayout.f23069j = topChartsRowLayout.f23067h - resources.getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
                topChartsRowLayout.f23066g = 0;
            }
            topChartsRowLayout.setContentHorizontalPadding(topChartsRowLayout.f23068i);
            topChartsRowLayout.m19906a(topChartsRowLayout.f23069j, true);
            topChartsRowLayout.m19906a(0, false);
            topChartsRowLayout.setBottomPadding(topChartsRowLayout.f23067h);
            topChartsRowLayout.setDividerSize(topChartsRowLayout.f23066g);
        }
    }

    private final void m20347a(int i, int i2, int i3) {
        if (this.C != null) {
            if (i2 < i3) {
                this.C.mo4086a(this, i2, i3 - i2);
            } else if (i2 > i3) {
                this.C.mo4088b(this, i3, i2 - i3);
                this.C.mo4087a(this, i, i3 - i, true);
                return;
            }
            this.C.mo4087a(this, i, i2 - i, true);
        }
    }

    public final /* synthetic */ boolean mo4145b(Object obj) {
        return this.f21964H.m15634a((Document) obj);
    }
}
