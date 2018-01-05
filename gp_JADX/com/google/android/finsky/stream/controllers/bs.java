package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.bn.C2127b;
import com.google.android.finsky.bn.C2129c;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p142j.C3623a;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.playcard.PlayCardViewMyAppsV2;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.myapps.C4344x;
import com.google.android.finsky.stream.myapps.C4560y;
import com.google.android.finsky.stream.myapps.C4561z;
import com.google.android.finsky.stream.myapps.aa;
import com.google.android.finsky.stream.myapps.ab;
import com.google.android.finsky.stream.myapps.view.C4558d;
import com.google.android.finsky.stream.myapps.view.MyAppsClusterWithSortingHeader;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class bs extends C4344x {
    public final C2127b f21952a;
    public final ao f21953b;
    public C4558d f21954o;

    public bs(Context context, C3748a c3748a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C2495w c2495w, C3646a c3646a, C3340g c3340g, C1461c c1461c, C3851f c3851f, C3028c c3028c, C2266a c2266a, C0988c c0988c, C2127b c2127b, ao aoVar, aa aaVar, C2171b c2171b, ab abVar) {
        super(context, c3748a, adVar, c4230c, c1611k, c1556d, c2495w, c3646a, c3340g, c1461c, c3851f, c3028c, c2266a, c0988c, aaVar, c2171b, abVar);
        this.f21952a = c2127b;
        this.f21953b = aoVar;
    }

    protected final void mo4130a(View view) {
        if (this.f21954o == null) {
            C4558d c4558d = new C4558d();
            c4558d.f23301a = m20122a(this.g.f14908a);
            c4558d.f23303c = false;
            c4558d.f23302b = null;
            c4558d.f23304d = null;
            this.f21954o = c4558d;
        }
        ((MyAppsClusterWithSortingHeader) view).m21177a(this.f21954o, null);
    }

    protected final int mo4139d() {
        return C7582R.layout.my_apps_cluster_with_sorting_header;
    }

    protected final void mo4132a(PlayCardViewMyAppsV2 playCardViewMyAppsV2, int i) {
        CharSequence H;
        Document document = (Document) this.K.get(i);
        this.f21953b.m18518a((d) playCardViewMyAppsV2, document, "my_apps:recently_updated", this.f, (ad) this, this.i);
        String a = ab.m21144a(this.e, document, this.z);
        String string = this.e.getResources().getString(C7582R.string.open);
        if (document.m14618G()) {
            H = document.m14619H();
        } else {
            H = this.e.getString(C7582R.string.myapps_whats_new_missing);
        }
        playCardViewMyAppsV2.m18460a(1, false, a, null, string, H, ((C4561z) this.D).f23317a.contains(document));
        playCardViewMyAppsV2.setActionListener(this);
    }

    public final void m_() {
        m19722h();
        super.m_();
    }

    protected final int mo4135b() {
        return 2807;
    }

    protected final List mo4129a(List list) {
        List list2;
        int i = 0;
        this.O = list;
        if (list == null) {
            list2 = null;
        } else {
            List arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                Document document = (Document) list.get(i2);
                String cf = document.cf();
                if (!C3028c.m15628a(this.A.mo3482b(cf)) && !this.Q.m21146a(this.y, document) && this.y.m15634a(document) && m20313a(cf)) {
                    arrayList.add(document);
                }
            }
            list2 = arrayList;
        }
        if (list2 != null) {
            while (i < list2.size()) {
                this.y.m15637b((Document) list2.get(i));
                i++;
            }
        }
        return list2;
    }

    protected final void mo4137c() {
        if (this.K != null) {
            Collections.sort(this.K, C3623a.f17983f);
        }
    }

    private final boolean m20313a(String str) {
        long currentTimeMillis = System.currentTimeMillis() - ((Long) C0955b.dm.m28964b()).longValue();
        C2129c a = this.f21952a.mo2657a(str);
        if (a == null || a.f10821o <= currentTimeMillis) {
            return false;
        }
        return true;
    }

    public final void mo1176c(String str, boolean z) {
        if (!z) {
            Document h = m20159h(str);
            if (h != null) {
                this.O.remove(h);
            }
        }
        super.mo1176c(str, z);
    }

    public final void mo1205a(C3369m c3369m) {
        if (c3369m.f17273c.f17153d != 8) {
            Document b = mo4136b(c3369m.m16819a());
            C4560y v = m20167v();
            if (b != null && (c3369m.f17273c.f17153d == 11 || c3369m.f17273c.f17153d == 0 || c3369m.f17273c.f17153d == 1 || c3369m.f17273c.f17153d == 4)) {
                this.K.remove(b);
            } else if (b == null && c3369m.f17273c.f17153d == 6) {
                b = m20159h(c3369m.m16819a());
                if (b != null && m20313a(c3369m.m16819a())) {
                    this.K.add(b);
                }
            }
            if (b != null) {
                mo4137c();
                m20134a(v);
            }
        }
    }

    public final boolean mo4153i() {
        return true;
    }
}
