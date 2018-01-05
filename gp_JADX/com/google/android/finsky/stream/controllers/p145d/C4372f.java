package com.google.android.finsky.stream.controllers.p145d;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.view.View;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.accounts.C0986a;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.at.C1128e;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.by.C2215k;
import com.google.android.finsky.by.C2229h;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.cv.p177a.fq;
import com.google.android.finsky.cv.p177a.ji;
import com.google.android.finsky.cv.p177a.jj;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2720j;
import com.google.android.finsky.dfemodel.C2732y;
import com.google.android.finsky.dfemodel.C2733z;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C1003o;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p142j.C3636o;
import com.google.android.finsky.p142j.C3638q;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.playcard.PlayCardViewMyAppsV2;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.playcard.cf;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.base.C4250b;
import com.google.android.finsky.stream.base.C4255t;
import com.google.android.finsky.stream.myapps.view.C4345e;
import com.google.android.finsky.stream.myapps.view.C4558d;
import com.google.android.finsky.stream.myapps.view.MyAppsClusterWithSortingHeader;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.play.layout.d;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import p002a.C0002a;

public final class C4372f extends C4250b implements C0657w, C0999d, ad, C1031w, C2732y, C2733z, C1003o, C3638q, C0983h, cf, C4345e {
    public fq f22170A;
    public C2197a f22171B;
    public C4558d f22172E;
    public int f22173F;
    public final C4371e f22174G = new C4373g(this);
    public final C4230c f22175a;
    public final C3028c f22176b;
    public final C0002a f22177o;
    public final C2206c f22178p;
    public final C3340g f22179q;
    public final C0988c f22180r;
    public final C0986a f22181s;
    public final C2266a f22182t;
    public final C3851f f22183u;
    public final ao f22184v;
    public C3636o f22185w;
    public ce f22186x;
    public ji[] f22187y;
    public int f22188z;

    public final boolean mo4179j() {
        return true;
    }

    public C4372f(Context context, C3748a c3748a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C2495w c2495w, C3028c c3028c, C0002a c0002a, C2206c c2206c, C3340g c3340g, C3851f c3851f, C0988c c0988c, C0986a c0986a, C2266a c2266a, ao aoVar) {
        super(context, c3748a, adVar, c1611k, c1556d, c2495w, false);
        this.f22175a = c4230c;
        this.f22176b = c3028c;
        this.f22177o = c0002a;
        this.f22178p = c2206c;
        this.f22179q = c3340g;
        this.f22180r = c0988c;
        this.f22181s = c0986a;
        this.f22182t = c2266a;
        this.f22183u = c3851f;
        this.f22184v = aoVar;
    }

    public final void mo4050a(C2720j c2720j) {
        super.mo4050a(c2720j);
        C2711x c2711x = this.g;
        if (1 != c2711x.f14907z && c2711x.f14898q.size() > 1) {
            FinskyLog.m21669e("Cannot change pagination mode of a list that has already loaded extra pages", new Object[0]);
        }
        c2711x.f14907z = 1;
        c2711x.m14684a(false);
        this.g.m14681a((C2732y) this);
        this.g.m14701p();
        this.g.f14927c = "com.google.android.gms";
        ((C2215k) this.f22177o.mo1a()).mo2825a(this.g.f14928d);
        this.f22178p.mo2814a((C0999d) this);
        this.f22171B = this.f22178p.mo2811a(this.f22180r.cY());
        this.f22179q.mo3481a((C1003o) this);
        this.D = new C4374h();
        ((C4374h) this.D).f22190a = m20483b();
        this.f22186x = C2482j.m13283a(2809);
        this.f22183u.mo3818a((C0983h) this);
        this.g.m11918a((C1031w) this);
        this.g.m11917a((C0657w) this);
        this.g.m14682a((C2733z) this);
        if (this.g.mo2861a()) {
            m_();
        } else {
            this.f22173F = this.g.m14698m();
        }
    }

    private final long m20483b() {
        return this.f22171B.mo2793g(C2229h.f11120a).mo2794h();
    }

    public final int mo1508a() {
        if (!this.g.mo2861a() || this.g.m14698m() <= 0) {
            return m20484d() ? 2 : 0;
        } else {
            return this.g.m14698m() + 2;
        }
    }

    public final int mo1509a(int i) {
        if (i == 0) {
            if (m20484d()) {
                return C7582R.layout.my_apps_library_empty;
            }
            return C7582R.layout.my_apps_cluster_with_sorting_header;
        } else if (i == mo1508a() - 1) {
            return C7582R.layout.vertical_spacer;
        } else {
            return C7582R.layout.play_card_myapps_v2;
        }
    }

    private final boolean m20484d() {
        return !mo4059g() && this.g.mo2861a() && this.g.m14698m() == 0;
    }

    public final void mo1510a(View view, int i) {
        if (i == 0) {
            if (!m20484d()) {
                MyAppsClusterWithSortingHeader myAppsClusterWithSortingHeader = (MyAppsClusterWithSortingHeader) view;
                if (this.f22172E == null) {
                    this.f22172E = m20485l();
                }
                myAppsClusterWithSortingHeader.m21177a(this.f22172E, this);
            }
        } else if (i == mo1508a() - 1) {
            view.setMinimumHeight(this.e.getResources().getDimensionPixelSize(C7582R.dimen.play_card_myapps_cluster_padding_top));
        } else {
            int i2;
            d dVar = (PlayCardViewMyAppsV2) view;
            Document document = (Document) this.g.m14679a((i + 0) - 1, true);
            String cf = document.cf();
            switch (this.f22179q.mo3482b(cf)) {
                case 1:
                case 2:
                    i2 = 0;
                    break;
                case 3:
                    i2 = 6;
                    break;
                default:
                    if (!this.f22176b.m15636a(cf, this.f22182t.m11719a())) {
                        i2 = 4;
                        break;
                    } else {
                        i2 = 3;
                        break;
                    }
            }
            if (i2 == 4) {
                String string;
                this.f22184v.m18518a(dVar, document, "my_apps2:library", this.f, this.h, this.i);
                C3028c c3028c = this.f22176b;
                boolean z = (c3028c.m15635a(document.cf()) || C3028c.m15628a(this.f22179q.mo3482b(document.cf())) || !c3028c.f15852g.m11649a(document, c3028c.f15850e.dn(), c3028c.f15851f)) ? false : true;
                if (z) {
                    string = this.e.getResources().getString(C7582R.string.install);
                } else {
                    string = null;
                }
                dVar.m18460a(4, false, this.e.getResources().getString(C7582R.string.not_installed), null, string, null, false);
            } else {
                this.f22184v.m18519a(dVar, document, "my_apps2:library", this.f, this.h, this.i, this.f22179q.mo3485c(document.m14625N().f13171k));
                dVar.m18460a(i2, false, null, null, null, null, false);
            }
            dVar.setActionListener(this);
        }
    }

    private final C4558d m20485l() {
        String d;
        C4558d c4558d = new C4558d();
        c4558d.f23301a = this.g.f14908a.f14885a.f12100g;
        c4558d.f23303c = true;
        if (this.f22180r.cX().size() > 1) {
            d = this.f22181s.mo1186d(this.f22180r.cY());
        } else {
            d = null;
        }
        c4558d.f23302b = d;
        if (m20486m()) {
            c4558d.f23304d = this.f22187y[m20487n()].by_().f12781b;
        }
        return c4558d;
    }

    private final boolean m20486m() {
        return this.f22187y != null && this.f22187y.length > 0;
    }

    public final void mo4181b(int i) {
        if (this.f22187y != null && i < this.f22187y.length) {
            ji jiVar = this.f22187y[i];
            if (!jiVar.by_().f12783d) {
                m20482a((ad) this, 2930);
                this.f22187y[m20487n()].by_().m12863a(false);
                jiVar.by_().m12863a(true);
                this.g.mo3118a(jiVar.by_().f12782c);
                this.g.m14699n();
            }
        }
        this.f22172E = m20485l();
    }

    private final void m20482a(ad adVar, int i) {
        if (this.i != null) {
            this.i.m13379b(new C2475d(adVar).m13256a(i));
        }
    }

    private final int m20487n() {
        if (this.f22187y != null) {
            for (int i = 0; i < this.f22187y.length; i++) {
                if (this.f22187y[i].by_().f12783d) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final void mo4125a(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
        Document document = (Document) playCardViewMyAppsV2.getData();
        m20482a((ad) this, 221);
        this.f.mo3631a(this.g.f14909b.mo1620b(), document, 1, null, null, false, this.i);
    }

    public final void mo4127b(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
        Document document = (Document) playCardViewMyAppsV2.getData();
        if (this.f22179q.mo3482b(document.cf()) != 0) {
            String cf = document.cf();
            m20482a((ad) this, 2917);
            C4809e a = this.f22179q.m16742a(cf);
            if (a != null) {
                a.mo4398a(C4831h.f25111a);
            }
            int a2 = m20490a(cf);
            if (a2 >= 0) {
                this.C.mo4087a(this, (a2 + 0) + 1, 1, true);
                return;
            }
            return;
        }
        ab j = this.f.mo3708j();
        if (j.mo283a("archive_confirm") == null) {
            String string = this.e.getString(C7582R.string.archiving_no_uninstall_confirmation, new Object[]{document.f14885a.f12100g});
            C1508k c1508k = new C1508k();
            c1508k.m8852a(string).m8860d((int) C7582R.string.ok).m8862e((int) C7582R.string.cancel);
            c1508k.m8849a(317, document.f14885a.f12087D, 269, 270, this.i);
            C1128e c4367a = new C4367a();
            c1508k.m8854a(c4367a);
            Bundle bundle = c4367a.f760q;
            bundle.putString("docid_list", document.f14885a.f12096c);
            bundle.putString("dfe_account", this.g.f14909b.mo1636c());
            c4367a.an = this.f22174G;
            c4367a.m625a(j, "archive_confirm");
        }
    }

    public final void mo4128c(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
    }

    public final void mo4126a(PlayCardViewMyAppsV2 playCardViewMyAppsV2, boolean z) {
        FinskyLog.m21669e("The What's New button was clicked but should not have been visible", new Object[0]);
    }

    public final void mo1511b(View view, int i) {
        if (view instanceof PlayCardViewMyAppsV2) {
            ao.m18509b((PlayCardViewMyAppsV2) view);
        }
    }

    public final void m_() {
        if (this.g.mo2861a()) {
            int i;
            if (this.f22170A == null) {
                fq fqVar;
                Document document = this.g.f14908a;
                if (document.cg()) {
                    fqVar = document.bg().f12916U;
                } else {
                    fqVar = null;
                }
                this.f22170A = fqVar;
                jj jjVar = this.f22170A.f12391c;
                if (jjVar != null) {
                    this.f22187y = jjVar.f12788a;
                    String[] strArr = new String[(this.f22187y.length + 1)];
                    for (i = 0; i < this.f22187y.length; i++) {
                        strArr[i] = this.f22187y[i].by_().f12782c;
                    }
                    strArr[strArr.length - 1] = this.g.f14928d;
                    ((C2215k) this.f22177o.mo1a()).mo2825a(strArr);
                }
                Integer num = (Integer) C0954a.aU.m5760a();
                if (num != null && num.intValue() >= 0 && this.f22187y != null && num.intValue() < this.f22187y.length) {
                    this.f22188z = num.intValue();
                    mo4181b(this.f22188z);
                }
                C2482j.m13285a(this.f22186x, document.f14885a.f12087D);
            }
            i = this.f22173F == 0 ? 2 : this.f22173F + 2;
            int a = mo1508a();
            this.f22173F = this.g.m14698m();
            if (this.C != null) {
                if (i > a) {
                    this.C.mo4088b(this, a, i - a);
                    this.C.mo4087a(this, mo1508a() - 1, 1, false);
                } else if (i < a) {
                    this.C.mo4087a(this, i - 1, 1, true);
                    this.C.mo4086a(this, i, a - i);
                } else {
                    this.C.mo4087a(this, 1, mo1508a() - 1, false);
                }
                if (!mo4059g()) {
                    this.f22175a.mo4029a();
                }
            }
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f22175a.mo4032b();
    }

    public final void mo4061q() {
        C0954a.aU.m5763a(Integer.valueOf(m20487n()));
        if (this.f22185w != null) {
            this.f22185w.af = null;
        }
        this.g.m11922b((C1031w) this);
        this.g.m11921b((C0657w) this);
        this.g.m14690b((C2733z) this);
        C2711x.m14674a(this.g);
        this.f22179q.mo3484b((C1003o) this);
        this.f22178p.mo2819b(this);
        Fragment a = this.f.mo3708j().mo283a("archive_confirm");
        if (a instanceof C4367a) {
            ((C4367a) a).an = null;
        }
        super.mo4061q();
    }

    public final boolean mo4058f() {
        return true;
    }

    final int m20490a(String str) {
        for (int i = 0; i < this.g.m14698m(); i++) {
            if (str.equals(((Document) this.g.m14679a(i, false)).f14885a.f12096c)) {
                return i;
            }
        }
        return -1;
    }

    public final void mo1205a(C3369m c3369m) {
        int a = m20490a(c3369m.m16819a());
        if (!this.g.m14686a(a) || ((Document) this.g.m14679a(a, true)) == null) {
            return;
        }
        if (c3369m.f17273c.f17153d == 11 || c3369m.f17273c.f17153d == 0 || c3369m.f17273c.f17153d == 1 || c3369m.f17273c.f17153d == 4) {
            this.C.mo4087a(this, (a + 0) + 1, 1, false);
        } else if (c3369m.f17273c.f17153d == 6) {
            this.g.m14701p();
        } else if (c3369m.f17273c.f17153d == 5 || c3369m.f17273c.f17153d == 10 || c3369m.f17273c.f17153d == 3 || c3369m.f17273c.f17153d == 2) {
            this.C.mo4087a(this, (a + 0) + 1, 1, false);
        }
    }

    public final void mo4162a(int i, int i2) {
        if (this.C == null) {
            return;
        }
        if (i2 == this.g.m14698m()) {
            this.C.mo4088b(this, 0, mo1508a());
        } else {
            this.C.mo4088b(this, (i + 0) + 1, i2);
        }
    }

    public final void mo4165b(int i, int i2) {
        if (this.C != null) {
            this.C.mo4086a(this, (i + 0) + 1, i2);
        }
    }

    public final void mo4170e() {
    }

    public final ce getPlayStoreUiElement() {
        return this.f22186x;
    }

    public final ad getParentNode() {
        return this.h;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final void mo1175b(String str, boolean z) {
    }

    public final void mo1176c(String str, boolean z) {
        if (!z && m20490a(str) != -1) {
            this.g.m14701p();
        }
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        if (c2197a.mo2780a().equals(this.f22180r.cY())) {
            long b = m20483b();
            if (((C4374h) this.D).f22190a != b) {
                ((C4374h) this.D).f22190a = b;
                this.g.m14691b(true);
                this.g.m14699n();
                if (m20486m()) {
                    for (ji jiVar : this.f22187y) {
                        if (!jiVar.by_().f12783d) {
                            this.g.f14909b.mo1647e(jiVar.by_().f12782c);
                        }
                    }
                }
            }
        }
    }

    public final void cd_() {
        ab j = this.f.mo3708j();
        if (this.f22185w == null) {
            this.f22185w = (C3636o) j.mo283a("myapps_library_sorter");
            if (this.f22185w == null) {
                ArrayList arrayList = new ArrayList(this.f22187y.length);
                for (ji by_ : this.f22187y) {
                    arrayList.add(by_.by_().f12781b);
                }
                int n = m20487n();
                Fragment c3636o = new C3636o();
                Bundle bundle = new Bundle();
                bundle.putInt("sort_type", n);
                bundle.putStringArrayList("sort_options", arrayList);
                c3636o.m600f(bundle);
                this.f22185w = c3636o;
                this.f22185w.af = this;
            }
        }
        this.f22185w.f760q.putInt("sort_type", m20487n());
        this.f22185w.m625a(j, "myapps_library_sorter");
    }

    public final /* synthetic */ C4255t mo4062s() {
        ((C4374h) this.D).f22190a = m20483b();
        return (C4374h) super.mo4062s();
    }

    public final /* synthetic */ void mo4052a(C4255t c4255t) {
        super.mo4052a((C4255t) (C4374h) c4255t);
        ab j = this.f.mo3708j();
        Fragment a = j.mo283a("archive_confirm");
        if (a instanceof C4367a) {
            ((C4367a) a).an = this.f22174G;
        }
        this.f22185w = (C3636o) j.mo283a("myapps_library_sorter");
        if (this.f22185w != null) {
            this.f22185w.af = this;
        }
        if (((C4374h) this.D).f22190a != m20483b()) {
            ((C4374h) this.D).f22190a = m20483b();
            this.g.m14691b(true);
            this.g.m14699n();
        }
    }

    public final /* synthetic */ boolean mo4145b(Object obj) {
        Document document = (Document) obj;
        return document.f14885a.f12099f != 3 || this.f22176b.m15634a(document);
    }
}
