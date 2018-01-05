package com.google.android.finsky.stream.p248a.p249a;

import android.app.Application;
import android.content.Context;
import android.support.v7.widget.ff;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.actionbuttons.C1011h;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bf.C1600a;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bg.af;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.ck.C2288b;
import com.google.android.finsky.cv.p177a.ko;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.C2730u;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dk.C2824a;
import com.google.android.finsky.dk.C2826c;
import com.google.android.finsky.ee.C2974a;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.layout.C3676f;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p147y.C4808a;
import com.google.android.finsky.p148b.C1542f;
import com.google.android.finsky.p198f.C3027b;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.playcard.ac;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.playcard.cu;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4239i;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4254d;
import com.google.android.finsky.stream.base.playcluster.C4283e;
import com.google.android.finsky.stream.controllers.C4301a;
import com.google.android.finsky.stream.controllers.C4375d;
import com.google.android.finsky.stream.controllers.C4388f;
import com.google.android.finsky.stream.controllers.C4414i;
import com.google.android.finsky.stream.controllers.C4431j;
import com.google.android.finsky.stream.controllers.C4471p;
import com.google.android.finsky.stream.controllers.C4484r;
import com.google.android.finsky.stream.controllers.C4493t;
import com.google.android.finsky.stream.controllers.C4500v;
import com.google.android.finsky.stream.controllers.ai;
import com.google.android.finsky.stream.controllers.ak;
import com.google.android.finsky.stream.controllers.an;
import com.google.android.finsky.stream.controllers.ap;
import com.google.android.finsky.stream.controllers.assist.C4311b;
import com.google.android.finsky.stream.controllers.assist.p253a.C4305a;
import com.google.android.finsky.stream.controllers.assist.p253a.C4308d;
import com.google.android.finsky.stream.controllers.assist.security.C4322b;
import com.google.android.finsky.stream.controllers.assist.security.C4324f;
import com.google.android.finsky.stream.controllers.au;
import com.google.android.finsky.stream.controllers.aw;
import com.google.android.finsky.stream.controllers.ay;
import com.google.android.finsky.stream.controllers.bc;
import com.google.android.finsky.stream.controllers.bf;
import com.google.android.finsky.stream.controllers.bi;
import com.google.android.finsky.stream.controllers.bn;
import com.google.android.finsky.stream.controllers.bp;
import com.google.android.finsky.stream.controllers.br;
import com.google.android.finsky.stream.controllers.bs;
import com.google.android.finsky.stream.controllers.bt;
import com.google.android.finsky.stream.controllers.bv;
import com.google.android.finsky.stream.controllers.bw;
import com.google.android.finsky.stream.controllers.bx;
import com.google.android.finsky.stream.controllers.cb;
import com.google.android.finsky.stream.controllers.ci;
import com.google.android.finsky.stream.controllers.cj;
import com.google.android.finsky.stream.controllers.collection.C4355a;
import com.google.android.finsky.stream.controllers.collectionassistcard.C4357a;
import com.google.android.finsky.stream.controllers.comboassistcard.C4359a;
import com.google.android.finsky.stream.controllers.compactassistcard.C4361a;
import com.google.android.finsky.stream.controllers.contentassistcard.C4363a;
import com.google.android.finsky.stream.controllers.ctaassistcard.C4365a;
import com.google.android.finsky.stream.controllers.dataassistcard.C4376a;
import com.google.android.finsky.stream.controllers.editorial.C4380a;
import com.google.android.finsky.stream.controllers.editorschoice.C4383a;
import com.google.android.finsky.stream.controllers.emptycluster.C4386a;
import com.google.android.finsky.stream.controllers.flatavatarcollection.C4389a;
import com.google.android.finsky.stream.controllers.floatinghighlights.C4394c;
import com.google.android.finsky.stream.controllers.genericcluster.C4409a;
import com.google.android.finsky.stream.controllers.illustrationassistcard.C4415a;
import com.google.android.finsky.stream.controllers.inlinetopcharts.C4419b;
import com.google.android.finsky.stream.controllers.jpkreditorialcard.C4432a;
import com.google.android.finsky.stream.controllers.jpkrquicklinks.C4434a;
import com.google.android.finsky.stream.controllers.merchbanner.C4442a;
import com.google.android.finsky.stream.controllers.minicategories.C4448c;
import com.google.android.finsky.stream.controllers.musicmerchbanner.C4458a;
import com.google.android.finsky.stream.controllers.notification.C4462b;
import com.google.android.finsky.stream.controllers.p145d.C4372f;
import com.google.android.finsky.stream.controllers.p256c.C4353a;
import com.google.android.finsky.stream.controllers.paddedcollection.C4472a;
import com.google.android.finsky.stream.controllers.prereggames.C4473a;
import com.google.android.finsky.stream.controllers.promotioncampaign.C4476a;
import com.google.android.finsky.stream.controllers.quicklinks.C4480a;
import com.google.android.finsky.stream.controllers.searchlistresults.C4486a;
import com.google.android.finsky.stream.controllers.taglinks.C4494a;
import com.google.android.finsky.stream.controllers.warmwelcome.C4524a;
import com.google.android.finsky.stream.controllers.warmwelcomev3.C4528a;
import com.google.android.finsky.stream.myapps.aa;
import com.google.android.finsky.stream.myapps.ab;
import com.google.android.finsky.stream.p248a.C4227e;
import com.google.android.finsky.stream.p248a.C4237g;
import com.google.android.finsky.stream.p251b.C4241a;
import com.google.android.play.image.C1294w;
import com.google.wireless.android.finsky.dfe.nano.ag;
import p002a.C0002a;

public final class C4228b implements C4227e {
    public final aa f21347A;
    public final ab f21348B;
    public final C2266a f21349C;
    public final C3851f f21350D;
    public final ac f21351E;
    public final ao f21352F;
    public final C2826c f21353G;
    public final C1600a f21354H;
    public final af f21355I;
    public final com.google.android.finsky.dfemodel.ab f21356J;
    public final C4241a f21357K;
    public final C2288b f21358L;
    public final cu f21359M;
    public final C2974a f21360N;
    @Deprecated
    public C3676f f21361O;
    @Deprecated
    public C4283e f21362P = new C4283e();
    public final C0986a f21363a;
    public final C0988c f21364b;
    public final C1011h f21365c;
    public final C1542f f21366d;
    public final C3027b f21367e;
    public final C3028c f21368f;
    public final Application f21369g;
    public final C3646a f21370h;
    public final C1294w f21371i;
    public final C4254d f21372j;
    public final C1287h f21373k;
    public final C2721l f21374l;
    public final C2824a f21375m;
    public final C1611k f21376n;
    public final C1531a f21377o;
    public final C1461c f21378p;
    public final C1556d f21379q;
    public final C2127b f21380r;
    public final C3340g f21381s;
    public final C2171b f21382t;
    public final C4237g f21383u;
    public final C0002a f21384v;
    public final C0002a f21385w;
    public final C0002a f21386x;
    public final C0002a f21387y;
    public final C2206c f21388z;

    public C4228b(C0986a c0986a, C0988c c0988c, C1011h c1011h, C1542f c1542f, C3027b c3027b, C3028c c3028c, Application application, C3646a c3646a, C1294w c1294w, C4254d c4254d, C1287h c1287h, C2721l c2721l, C2824a c2824a, C1611k c1611k, C1531a c1531a, C1461c c1461c, C1556d c1556d, C2127b c2127b, C3340g c3340g, C2171b c2171b, C4237g c4237g, C0002a c0002a, C0002a c0002a2, C0002a c0002a3, C0002a c0002a4, C2206c c2206c, aa aaVar, ab abVar, C2266a c2266a, C3851f c3851f, ac acVar, ao aoVar, C2826c c2826c, C1600a c1600a, af afVar, com.google.android.finsky.dfemodel.ab abVar2, C4241a c4241a, C2288b c2288b, cu cuVar, C2974a c2974a, Context context) {
        this.f21363a = c0986a;
        this.f21364b = c0988c;
        this.f21365c = c1011h;
        this.f21366d = c1542f;
        this.f21367e = c3027b;
        this.f21368f = c3028c;
        this.f21369g = application;
        this.f21370h = c3646a;
        this.f21371i = c1294w;
        this.f21372j = c4254d;
        this.f21373k = c1287h;
        this.f21374l = c2721l;
        this.f21375m = c2824a;
        this.f21376n = c1611k;
        this.f21377o = c1531a;
        this.f21378p = c1461c;
        this.f21379q = c1556d;
        this.f21380r = c2127b;
        this.f21381s = c3340g;
        this.f21382t = c2171b;
        this.f21383u = c4237g;
        this.f21384v = c0002a;
        this.f21385w = c0002a2;
        this.f21386x = c0002a3;
        this.f21387y = c0002a4;
        this.f21388z = c2206c;
        this.f21347A = aaVar;
        this.f21348B = abVar;
        this.f21349C = c2266a;
        this.f21350D = c3851f;
        this.f21351E = acVar;
        this.f21352F = aoVar;
        this.f21353G = c2826c;
        this.f21354H = c1600a;
        this.f21355I = afVar;
        this.f21356J = abVar2;
        this.f21357K = c4241a;
        this.f21358L = c2288b;
        this.f21359M = cuVar;
        this.f21360N = c2974a;
        this.f21361O = new C3676f(context);
    }

    public final C4250b mo4028a(Document document, C4239i c4239i, C4230c c4230c, ff ffVar, C4808a c4808a, Context context, boolean z, C2495w c2495w, C2730u c2730u, C3748a c3748a, ad adVar, ag[] agVarArr) {
        if (document.bD()) {
            return mo4026a(context, ffVar, c2495w, c2730u, c3748a, adVar);
        }
        Object obj = (document.bg() == null || document.bg().f12925d == null) ? null : 1;
        if (obj != null) {
            return new C4442a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w);
        } else if (document.aw()) {
            return new C4458a(context, c3748a, c4808a, adVar, this.f21376n, this.f21379q, c2495w);
        } else {
            obj = (document.bg() == null || document.bg().f12926e == null) ? null : 1;
            if (obj != null) {
                return new bx(context, c3748a, c4808a, adVar, this.f21362P, this.f21376n, this.f21379q, c2495w, this.f21373k);
            }
            obj = (document.bg() == null || document.bg().f12945x == null) ? null : 1;
            if (obj != null) {
                return new br(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w);
            }
            obj = (document.bg() == null || document.bg().f12927f == null) ? null : 1;
            if (obj != null) {
                return new bw(context, c3748a, c4808a, adVar, this.f21362P, this.f21376n, this.f21379q, c2495w, this.f21373k);
            } else if (document.ax()) {
                return new C4431j(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21352F, this.f21372j, z, this.f21351E);
            } else if (document.ay()) {
                return new C4389a(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E);
            } else {
                obj = (document.bg() == null || document.bg().f12932k == null) ? null : 1;
                if (obj != null) {
                    return new C4386a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w);
                } else if (document.aV()) {
                    return new C4524a(context, c3748a, c4808a, adVar, this.f21376n, this.f21379q, c2495w);
                } else if (document.aW()) {
                    return new ci(context, c3748a, c4808a, adVar, this.f21376n, this.f21379q, c2495w);
                } else {
                    obj = (document.bg() == null || document.bg().f12899D == null) ? null : 1;
                    if (obj == null) {
                        ko bg = document.bg();
                        obj = (bg == null || bg.f12904I == null) ? null : 1;
                        if (obj != null) {
                            return new C4375d(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21356J, this.f21378p);
                        }
                        obj = (document.bg() == null || document.bg().f12905J == null) ? null : 1;
                        if (obj != null) {
                            return new C4353a(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E, this.f21372j);
                        }
                        if (this.f21378p.dj().mo2294a(12624692)) {
                            bg = document.bg();
                            obj = (bg == null || bg.aG == null) ? null : 1;
                            if (obj != null) {
                                return new com.google.android.finsky.stream.controllers.ag(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21352F, this.f21356J, this.f21372j, z, this.f21351E);
                            }
                        }
                        obj = (document.bg() == null || document.bg().f12897B == null) ? null : 1;
                        if (obj != null) {
                            return new C4500v(context, c3748a, ffVar, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I);
                        } else if (document.bt()) {
                            return new C4355a(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E);
                        } else if (document.bv()) {
                            return new bv(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21378p, this.f21357K, this.f21374l, this.f21356J, this.f21381s, this.f21373k, this.f21368f, this.f21352F, this.f21351E);
                        } else if (document.aT()) {
                            return new cb(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21378p, this.f21357K, this.f21356J, this.f21381s, this.f21373k, this.f21368f, this.f21352F, this.f21351E);
                        } else if (document.aC()) {
                            return new C4380a(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E);
                        } else {
                            bg = document.bg();
                            obj = (bg == null || bg.f12946y == null) ? null : 1;
                            if (obj != null) {
                                return new C4480a(context, c3748a, agVarArr, adVar, this.f21376n, this.f21379q, c2495w, this.f21356J);
                            }
                            bg = document.bg();
                            obj = (bg == null || bg.f12896A == null) ? null : 1;
                            if (obj != null) {
                                return new C4494a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21356J);
                            }
                            obj = (document.bg() == null || document.bg().f12907L == null) ? null : 1;
                            if (obj != null) {
                                return new C4486a(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E, this.f21372j);
                            } else if (document.az()) {
                                return new cj(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E, this.f21360N);
                            } else if (document.bu()) {
                                return new C4414i(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E);
                            } else if (document.aA()) {
                                return new C4484r(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21352F, this.f21372j, z, this.f21351E);
                            } else {
                                obj = (document.bg() == null || document.bg().ao == null) ? null : 1;
                                if (obj != null) {
                                    return new C4476a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21356J, this.f21378p);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.f12911P == null) ? null : 1;
                                if (obj != null) {
                                    return new ay(context, c3748a, ffVar, adVar, this.f21376n, this.f21379q, c2495w);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.f12914S == null) ? null : 1;
                                if (obj != null) {
                                    return new C4434a(context, c3748a, agVarArr, adVar, this.f21376n, this.f21379q, c2495w, this.f21356J);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.f12912Q == null) ? null : 1;
                                if (obj != null) {
                                    return new bf(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21356J, this.f21372j);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.f12913R == null) ? null : 1;
                                if (obj != null) {
                                    return new bc(context, c3748a, adVar, this.f21362P, this.f21376n, this.f21379q, c2495w, this.f21356J, this.f21357K, this.f21367e);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.f12918W == null) ? null : 1;
                                if (obj != null) {
                                    return new C4305a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21364b, this.f21353G);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.f12917V == null) ? null : 1;
                                if (obj != null) {
                                    return new C4308d(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21364b, this.f21353G);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.ac == null) ? null : 1;
                                if (obj != null) {
                                    return new C4311b(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21364b);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.ad == null) ? null : 1;
                                if (obj != null) {
                                    return new aw(context, c3748a, adVar, c4230c, this.f21376n, this.f21379q, c2495w, this.f21370h, this.f21381s, this.f21378p, this.f21350D, this.f21368f, this.f21349C, this.f21364b, this.f21352F, this.f21347A, this.f21382t, this.f21348B);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.f12915T == null) ? null : 1;
                                if (obj != null) {
                                    return new au(context, c3748a, adVar, c4230c, this.f21376n, this.f21379q, c2495w, this.f21384v, this.f21375m, this.f21370h, this.f21381s, this.f21378p, this.f21350D, this.f21368f, this.f21349C, this.f21364b, this.f21352F, this.f21347A, this.f21382t, this.f21348B);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.ab == null) ? null : 1;
                                if (obj != null) {
                                    return new bt(context, c3748a, adVar, c4230c, this.f21376n, this.f21379q, c2495w, this.f21370h, this.f21381s, this.f21378p, this.f21350D, this.f21368f, this.f21349C, this.f21364b, this.f21377o, this.f21352F, this.f21347A, this.f21382t, this.f21348B);
                                }
                                bg = document.bg();
                                obj = (bg == null || bg.f12919X == null) ? null : 1;
                                if (obj != null) {
                                    return new bs(context, c3748a, adVar, c4230c, this.f21376n, this.f21379q, c2495w, this.f21370h, this.f21381s, this.f21378p, this.f21350D, this.f21368f, this.f21349C, this.f21364b, this.f21380r, this.f21352F, this.f21347A, this.f21382t, this.f21348B);
                                } else if (document.cg()) {
                                    return new C4372f(context, c3748a, adVar, c4230c, this.f21376n, this.f21379q, c2495w, this.f21368f, this.f21387y, this.f21388z, this.f21381s, this.f21350D, this.f21364b, this.f21363a, this.f21349C, this.f21352F);
                                } else {
                                    bg = document.bg();
                                    obj = (bg == null || bg.aa == null) ? null : 1;
                                    if (obj != null) {
                                        return new C4324f(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w);
                                    }
                                    bg = document.bg();
                                    obj = (bg == null || bg.f12920Y == null) ? null : 1;
                                    if (obj != null) {
                                        return new C4322b(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w);
                                    } else if (document.cj()) {
                                        return new C4415a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21385w);
                                    } else if (document.cl()) {
                                        return new C4365a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21385w);
                                    } else if (document.cp()) {
                                        return new C4376a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21385w);
                                    } else if (document.ct()) {
                                        return new C4357a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21385w);
                                    } else if (document.cn()) {
                                        return new C4359a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21385w);
                                    } else if (document.cr()) {
                                        return new C4363a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21385w);
                                    } else if (document.ch()) {
                                        return new C4361a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21385w);
                                    } else if (document.cv()) {
                                        return new com.google.android.finsky.stream.controllers.ab(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21352F, this.f21372j, z, this.f21351E);
                                    } else {
                                        bg = document.bg();
                                        obj = (bg == null || bg.aD == null) ? null : 1;
                                        if (obj != null || document.cA()) {
                                            return new C4471p(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21378p, this.f21352F, this.f21372j, z, this.f21351E);
                                        }
                                        obj = (document.bg() == null || document.bg().as == null) ? null : 1;
                                        if (obj != null) {
                                            return new bn(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E, this.f21365c, this.f21359M);
                                        } else if (document.aX()) {
                                            if (!this.f21378p.dj().mo2294a(12636298) || z) {
                                                return new ai(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21352F, this.f21372j, z, this.f21351E, this.f21386x);
                                            }
                                            return new ak(context, c3748a, c4808a, adVar, this.f21376n, this.f21379q, c2495w, this.f21352F, this.f21355I, this.f21372j, z, this.f21371i, this.f21386x);
                                        } else if (document.cz()) {
                                            return new C4493t(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21378p, this.f21352F, this.f21372j, z, this.f21351E);
                                        } else if (this.f21378p.dj().mo2294a(12638215) && document.cy()) {
                                            return new com.google.android.finsky.stream.controllers.ad(context, c3748a, ffVar, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21352F, this.f21372j, z, this.f21368f);
                                        } else {
                                            bg = document.bg();
                                            obj = (bg == null || bg.ap == null) ? null : 1;
                                            if (obj != null) {
                                                return new C4432a(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E);
                                            }
                                            bg = document.bg();
                                            obj = (bg == null || bg.at == null) ? null : 1;
                                            if (obj != null) {
                                                return new C4383a(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21356J, this.f21378p);
                                            }
                                            if ((document.cx() != null ? 1 : null) != null) {
                                                return new C4528a(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w);
                                            }
                                            bg = document.bg();
                                            obj = (bg == null || bg.aw == null) ? null : 1;
                                            if (obj != null) {
                                                return new C4473a(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21372j, this.f21351E);
                                            } else if (document.bZ()) {
                                                return new C4419b(context, this.f21378p, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21368f);
                                            } else {
                                                bg = document.bg();
                                                obj = (bg == null || bg.f12947z == null) ? null : 1;
                                                if (obj != null) {
                                                    return new C4388f(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w, this.f21356J);
                                                }
                                                bg = document.bg();
                                                obj = (bg == null || bg.aH == null) ? null : 1;
                                                if (obj != null) {
                                                    return new C4472a(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E, this.f21372j);
                                                } else if (document.ba()) {
                                                    return new C4462b(context, c3748a, adVar, this.f21376n, this.f21379q, c2495w, this.f21378p);
                                                } else {
                                                    bg = document.bg();
                                                    obj = (bg == null || bg.aK == null) ? null : 1;
                                                    if (obj != null) {
                                                        return new C4448c(context, c3748a, this.f21371i, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21372j, this.f21356J);
                                                    } else if (document.m14660o() && document.m14647d(14)) {
                                                        return new bp(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w);
                                                    } else {
                                                        obj = (document.bg() == null || document.bg().aI == null) ? null : 1;
                                                        if (obj != null) {
                                                            return new C4394c(context, c3748a, this.f21371i, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21358L, this.f21364b, this.f21356J, this.f21388z, z);
                                                        } else if (!this.f21378p.dj().mo2294a(12636298) || z) {
                                                            return new com.google.android.finsky.stream.controllers.aa(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21352F, this.f21372j, z, this.f21351E);
                                                        } else {
                                                            return new C4409a(context, c3748a, c4808a, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21371i, this.f21372j, this.f21352F, this.f21351E);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else if (this.f21378p.dj().mo2294a(12629585) || this.f21378p.dj().mo2294a(12629849)) {
                        return new ap(context, c3748a, c4808a, ffVar, this.f21361O, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I, this.f21381s, this.f21369g, this.f21373k, this.f21356J, this.f21378p, this.f21352F, this.f21372j);
                    } else {
                        return new C4301a(context, c3748a, c4808a, adVar, c4230c, this.f21376n, this.f21379q, c4239i, c2495w, this.f21381s, this.f21373k, this.f21378p, this.f21352F, this.f21351E);
                    }
                }
            }
        }
    }

    public final C4250b mo4026a(Context context, ff ffVar, C2495w c2495w, C2730u c2730u, C3748a c3748a, ad adVar) {
        if (this.f21383u.m19668a(c3748a.mo3683b(), c2730u)) {
            return new bi(context, c3748a, ffVar, adVar, this.f21376n, this.f21379q, c2495w, this.f21355I);
        }
        return new an(context, c3748a, ffVar, adVar, this.f21376n, this.f21379q, c2495w);
    }

    public final C4250b mo4027a(Context context, C2495w c2495w, C2730u c2730u, C3748a c3748a, ad adVar, ag[] agVarArr) {
        if (this.f21383u.m19669a(c3748a.mo3683b(), c2730u, agVarArr)) {
            return new C4434a(context, c3748a, agVarArr, adVar, this.f21376n, this.f21379q, c2495w, this.f21356J);
        }
        return new C4480a(context, c3748a, agVarArr, adVar, this.f21376n, this.f21379q, c2495w, this.f21356J);
    }
}
