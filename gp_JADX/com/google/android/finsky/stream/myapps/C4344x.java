package com.google.android.finsky.stream.myapps;

import android.content.Context;
import android.support.v7.p045f.C0443j;
import android.support.v7.p045f.C0445b;
import android.view.View;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.playcard.PlayCardViewMyAppsV2;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.playcard.cf;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class C4344x extends C4250b implements C0443j, C0657w, ad, C1031w, C1003o, C0983h, cf {
    public final C3340g f21839A;
    public final C4230c f21840B;
    public final C1461c f21841E;
    public final C3851f f21842F;
    public final C2266a f21843G;
    public final C0988c f21844H;
    public final aa f21845I;
    public C4552s f21846J;
    public List f21847K;
    public boolean f21848L;
    public boolean f21849M;
    public ce f21850N;
    public List f21851O;
    public C2171b f21852P;
    public ab f21853Q;
    public int f21854R;
    public Map f21855S = new HashMap();
    public Integer f21856T;
    public final C3028c f21857y;
    public final C3646a f21858z;

    public C4344x(Context context, C3748a c3748a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C2495w c2495w, C3646a c3646a, C3340g c3340g, C1461c c1461c, C3851f c3851f, C3028c c3028c, C2266a c2266a, C0988c c0988c, aa aaVar, C2171b c2171b, ab abVar) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f21840B = c4230c;
        this.f21858z = c3646a;
        this.f21839A = c3340g;
        this.f21841E = c1461c;
        this.f21842F = c3851f;
        this.f21857y = c3028c;
        this.f21843G = c2266a;
        this.f21844H = c0988c;
        this.f21849M = this.f21841E.dj().mo2294a(12642610);
        this.f21845I = aaVar;
        this.f21852P = c2171b;
        this.f21853Q = abVar;
    }

    public abstract List mo4129a(List list);

    public abstract void mo4130a(View view);

    public abstract void mo4132a(PlayCardViewMyAppsV2 playCardViewMyAppsV2, int i);

    public abstract int mo4135b();

    public abstract void mo4137c();

    public abstract int mo4139d();

    public void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        this.f21846J = this.f21845I.m21141a(this.g.f14909b.mo1636c());
        this.f21839A.mo3481a((C1003o) this);
        this.f21848L = this.f21841E.dj().mo2294a(12611069);
        this.f21850N = C2482j.m13283a(mo4135b());
        Document document = this.g.f14908a;
        if (document != null) {
            C2482j.m13285a(this.f21850N, document.f14885a.f12087D);
        }
        this.f21846J.m21171a((C1031w) this);
        this.f21846J.f23289p.add(this);
        this.f21842F.mo3818a((C0983h) this);
        m20166u();
        if (this.f21846J.m21174d()) {
            m19722h();
            bZ_();
        }
        this.D = new C4561z();
    }

    public final void m20164r() {
        this.f21855S = new HashMap();
    }

    public final void m20151c(String str) {
        this.f21855S.remove(str);
    }

    public final Integer m20157f(String str) {
        return (Integer) this.f21855S.get(str);
    }

    public final void m20136a(String str, Integer num) {
        this.f21855S.put(str, num);
    }

    public final boolean m20139a(String str, int i) {
        Integer f = m20157f(str);
        return f != null && f.intValue() == i;
    }

    public final boolean m20165t() {
        for (String str : this.f21855S.keySet()) {
            if (m20139a(str, 0) || m20139a(str, 3)) {
                return true;
            }
            if (m20139a(str, 7)) {
                return true;
            }
        }
        return false;
    }

    public final void m20135a(String str, Document document, int i) {
        switch (i) {
            case 0:
                m20136a(str, Integer.valueOf(3));
                return;
            case 1:
                m20136a(str, Integer.valueOf(0));
                return;
            case 3:
                if (this.f21849M) {
                    m20136a(str, Integer.valueOf(8));
                    return;
                }
                break;
            case 4:
                m20136a(str, Integer.valueOf(6));
                return;
            case 5:
                break;
        }
        if (this.f21849M) {
            m20136a(str, Integer.valueOf(9));
            return;
        }
        if (document == null) {
            m20151c(str);
        } else if (this.f21857y.m15636a(str, this.f21843G.m11719a())) {
            m20136a(str, Integer.valueOf(3));
        } else if (this.f21853Q.m21146a(this.f21857y, document)) {
            m20136a(str, Integer.valueOf(2));
        } else {
            m20136a(str, Integer.valueOf(1));
        }
    }

    public void mo4155c(View view) {
    }

    public void mo4154b(View view) {
    }

    public void mo4157d(View view) {
    }

    public Integer mo4158l() {
        return null;
    }

    public Integer mo4160o() {
        return null;
    }

    public Integer mo4159n() {
        return null;
    }

    public final void m20166u() {
        if (this.f21847K == null || this.f21847K.isEmpty()) {
            if ((this.f21846J.f23285l != null ? 1 : 0) != 0) {
                this.f21854R = 4;
                return;
            } else if (this.f21846J.m21174d()) {
                this.f21854R = 3;
                return;
            } else {
                this.f21854R = 1;
                return;
            }
        }
        this.f21854R = 2;
    }

    public void bZ_() {
        C4560y v = m20167v();
        m20164r();
        this.f21847K = mo4129a(this.f21846J.m21175e());
        m20166u();
        mo4137c();
        m20134a(v);
    }

    private final int m20119b(int i) {
        switch (i) {
            case 1:
                if (mo4159n() != null) {
                    return 2;
                }
                return 0;
            case 2:
                if (this.f21847K != null) {
                    return this.f21847K.size() + 2;
                }
                FinskyLog.m21669e("Loading state said we have docs, but docs are null", new Object[0]);
                return 0;
            case 3:
                if (mo4158l() != null) {
                    return 2;
                }
                return 0;
            case 4:
                if (mo4160o() != null) {
                    return 2;
                }
                return 0;
            default:
                FinskyLog.m21669e("Unknown loading state: " + i, new Object[0]);
                return 0;
        }
    }

    public final void m20137a(boolean z) {
        this.f21846J.m21172b();
        if (z) {
            C4560y v = m20167v();
            m20166u();
            m20134a(v);
        }
    }

    public final C4560y m20167v() {
        return new C4560y(this.f21839A, mo1508a(), this.f21847K == null ? Collections.EMPTY_LIST : new ArrayList(this.f21847K), new HashMap(this.f21855S), this.f21854R);
    }

    public final void m20134a(C4560y c4560y) {
        m20166u();
        c4560y.f23312f = m20119b(this.f21854R);
        c4560y.f23313g = this.f21847K == null ? Collections.EMPTY_LIST : new ArrayList(this.f21847K);
        c4560y.f23314h = this.f21855S;
        c4560y.f23315i = this.f21854R;
        C0445b.m2665a(c4560y).m2678a((C0443j) this);
    }

    public final int mo1508a() {
        return m20119b(this.f21854R);
    }

    public void m_() {
        if (this.f21846J.m21174d()) {
            bZ_();
            this.f21840B.mo4029a();
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f21840B.mo4032b();
        FinskyLog.m21667d("Got network error: %s", volleyError);
        C4560y v = m20167v();
        m20166u();
        m20134a(v);
    }

    public final int mo1509a(int i) {
        if (i == 0) {
            if (this.f21854R == 4 && mo4160o() != null) {
                return mo4160o().intValue();
            }
            if (this.f21854R == 1 && mo4159n() != null) {
                return mo4159n().intValue();
            }
            if (this.f21854R != 3 || mo4158l() == null) {
                return mo4139d();
            }
            return mo4158l().intValue();
        } else if (i == mo1508a() - 1) {
            return C7582R.layout.vertical_spacer;
        } else {
            return C7582R.layout.play_card_myapps_v2;
        }
    }

    public final void mo1510a(View view, int i) {
        if (i == 0) {
            switch (this.f21854R) {
                case 1:
                    mo4155c(view);
                    return;
                case 2:
                    mo4130a(view);
                    return;
                case 3:
                    mo4154b(view);
                    return;
                case 4:
                    mo4157d(view);
                    return;
                default:
                    FinskyLog.m21669e("Unknown loading state: " + this.f21854R, new Object[0]);
                    return;
            }
        } else if (i == mo1508a() - 1) {
            if (this.f21856T == null) {
                this.f21856T = Integer.valueOf(this.e.getResources().getDimensionPixelSize(C7582R.dimen.play_card_myapps_cluster_padding_top));
            }
            view.setMinimumHeight(this.f21856T.intValue());
        } else {
            mo4132a((PlayCardViewMyAppsV2) view, (i + 0) - 1);
        }
    }

    public final void mo1511b(View view, int i) {
        if (view != null) {
            if (view instanceof d) {
                ao.m18509b((d) view);
            }
            if (view instanceof PlayCardViewMyAppsV2) {
                ((PlayCardViewMyAppsV2) view).setActionListener(null);
            }
        }
    }

    public void mo4061q() {
        super.mo4061q();
        this.f21839A.mo3484b((C1003o) this);
        this.f21842F.mo3819b(this);
        this.f21846J.f23289p.remove(this);
        this.f21846J.m21173b(this);
        this.g.m11922b((C1031w) this);
        this.g.m11921b((C0657w) this);
    }

    public Document mo4136b(String str) {
        if (this.f21847K != null) {
            for (int i = 0; i < this.f21847K.size(); i++) {
                Document document = (Document) this.f21847K.get(i);
                if (str.equals(document.cf())) {
                    return document;
                }
            }
        }
        return null;
    }

    public final void mo4125a(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
        int i;
        Document document = (Document) playCardViewMyAppsV2.getData();
        switch (playCardViewMyAppsV2.getSubType()) {
            case 1:
                this.f.mo3633a(this.f21844H.cY(), document, false);
                i = 218;
                break;
            case 2:
                this.e.startActivity(this.f21852P.mo2752a(this.e, Arrays.asList(new Document[]{document}), this.i, this.f21848L));
                i = 217;
                break;
            default:
                i = 0;
                break;
        }
        C4344x.m20118a(this.i, (ad) this, i);
    }

    public void mo4127b(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
        this.f21839A.m16742a(((Document) playCardViewMyAppsV2.getData()).m14625N().f13171k).mo4398a(C4831h.f25111a);
        C4344x.m20118a(this.i, (ad) this, 2917);
    }

    public void mo4128c(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
        C4344x.m20118a(this.i, (ad) this, 2947);
    }

    public final void mo4126a(PlayCardViewMyAppsV2 playCardViewMyAppsV2, boolean z) {
        Document document = (Document) playCardViewMyAppsV2.getData();
        if (z) {
            ((C4561z) this.D).f23317a.add(document);
            C4344x.m20118a(this.i, (ad) this, 2825);
        } else {
            ((C4561z) this.D).f23317a.remove(document);
            C4344x.m20118a(this.i, (ad) this, 2826);
        }
        playCardViewMyAppsV2.setWhatsNewVisibility(z);
    }

    public ce getPlayStoreUiElement() {
        return this.f21850N;
    }

    public ad getParentNode() {
        return this.h;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void mo620a(int i, int i2) {
        if (this.C != null) {
            this.C.mo4086a(this, i, i2);
        }
    }

    public final void mo622b(int i, int i2) {
        if (this.C != null) {
            this.C.mo4088b(this, i, i2);
        }
    }

    public final void mo623c(int i, int i2) {
        if (this.C != null) {
            this.C.mo4089c(this, i, i2);
        }
    }

    public final void mo621a(int i, int i2, Object obj) {
        if (this.C != null) {
            this.C.mo4087a(this, i, i2, false);
        }
    }

    public final void mo1175b(String str, boolean z) {
    }

    public void mo1176c(String str, boolean z) {
        Document b = mo4136b(str);
        if (b != null) {
            C4560y v = m20167v();
            if (z) {
                m20135a(str, b, C3371p.m16828a(this.f21839A.mo3482b(str)));
            } else {
                this.f21847K.remove(b);
                m20151c(str);
                ((C4561z) this.D).f23317a.remove(b);
            }
            m20134a(v);
        }
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }

    public final void m20158g(String str) {
        if (this.f21847K != null) {
            for (int i = 0; i < this.f21847K.size(); i++) {
                if (((Document) this.f21847K.get(i)).cf().equals(str)) {
                    this.C.mo4087a(this, (i + 0) + 1, 1, false);
                    return;
                }
            }
        }
    }

    public final Document m20159h(String str) {
        if (this.f21851O != null) {
            for (int i = 0; i < this.f21851O.size(); i++) {
                Document document = (Document) this.f21851O.get(i);
                if (str.equals(document.cf())) {
                    return document;
                }
            }
        }
        return null;
    }

    public final String m20122a(Document document) {
        return this.e.getString(C7582R.string.myapps_cluster_title_with_count_format, new Object[]{document.f14885a.f12100g, Integer.valueOf(this.f21847K.size())});
    }

    public static void m20118a(C2495w c2495w, ad adVar, int i) {
        if (c2495w != null) {
            c2495w.m13379b(new C2475d(adVar).m13256a(i));
        }
    }
}
