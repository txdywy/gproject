package com.google.android.finsky.stream.controllers;

import android.content.Context;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.activities.myapps.C1117q;
import com.google.android.finsky.aw.C1531a;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.installqueue.C3371p;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.playcard.PlayCardViewMyAppsV2;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.controllers.view.C4346u;
import com.google.android.finsky.stream.controllers.view.C4352w;
import com.google.android.finsky.stream.controllers.view.C4517t;
import com.google.android.finsky.stream.controllers.view.MyAppsUpdateClusterHeader;
import com.google.android.finsky.stream.controllers.view.MyAppsUpdatesEmptyView;
import com.google.android.finsky.stream.myapps.C4344x;
import com.google.android.finsky.stream.myapps.C4560y;
import com.google.android.finsky.stream.myapps.C4561z;
import com.google.android.finsky.stream.myapps.aa;
import com.google.android.finsky.stream.myapps.ab;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class bt extends C4344x implements C1117q, C4346u, C4352w {
    public final Comparator f21955a = new bu(this);
    public boolean f21956b;
    public final C1531a f21957o;
    public final ao f21958p;
    public C4517t f21959q;

    public bt(Context context, C3748a c3748a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C2495w c2495w, C3646a c3646a, C3340g c3340g, C1461c c1461c, C3851f c3851f, C3028c c3028c, C2266a c2266a, C0988c c0988c, C1531a c1531a, ao aoVar, aa aaVar, C2171b c2171b, ab abVar) {
        super(context, c3748a, adVar, c4230c, c1611k, c1556d, c2495w, c3646a, c3340g, c1461c, c3851f, c3028c, c2266a, c0988c, aaVar, c2171b, abVar);
        this.f21957o = c1531a;
        this.f21958p = aoVar;
    }

    public final void m_() {
        m19722h();
        super.m_();
        if (this.f21956b) {
            cb_();
        }
    }

    protected final void mo4130a(View view) {
        if (this.f21959q == null) {
            C4517t c4517t = new C4517t();
            if (C1473m.f7980a.mo2265x().m18668a()) {
                c4517t.f23121a = this.e.getString(C7582R.string.my_apps_updates_available_auto_update_enabled, new Object[]{Integer.valueOf(this.K.size())});
                c4517t.f23122b = this.e.getString(C7582R.string.my_apps_auto_update_enabled);
            } else {
                c4517t.f23121a = this.e.getString(C7582R.string.my_apps_updates_available_auto_update_disabled, new Object[]{Integer.valueOf(this.K.size())});
                c4517t.f23122b = this.e.getString(C7582R.string.my_apps_auto_update_disabled);
            }
            if (m20165t()) {
                c4517t.f23123c = this.e.getString(C7582R.string.stop_all_downloads);
            } else if (this.K != null && this.K.size() == 1 && m20139a(((Document) this.K.get(0)).cf(), 6)) {
                c4517t.f23123c = null;
            } else {
                c4517t.f23123c = this.e.getString(C7582R.string.my_apps_update_all);
            }
            c4517t.f23124d = this.J.f23290q;
            this.f21959q = c4517t;
        }
        ((MyAppsUpdateClusterHeader) view).m21029a(this.f21959q, this);
    }

    protected final void mo4154b(View view) {
        ((MyAppsUpdatesEmptyView) view).m21030a(false, false, this);
    }

    protected final void mo4155c(View view) {
        ((MyAppsUpdatesEmptyView) view).m21030a(true, false, this);
    }

    protected final void mo4157d(View view) {
        ((MyAppsUpdatesEmptyView) view).m21030a(false, true, this);
    }

    protected final int mo4139d() {
        return C7582R.layout.my_apps_update_cluster_header;
    }

    protected final Integer mo4158l() {
        return Integer.valueOf(C7582R.layout.my_apps_updates_empty);
    }

    protected final Integer mo4159n() {
        return Integer.valueOf(C7582R.layout.my_apps_updates_empty);
    }

    protected final Integer mo4160o() {
        return Integer.valueOf(C7582R.layout.my_apps_updates_empty);
    }

    protected final void mo4132a(PlayCardViewMyAppsV2 playCardViewMyAppsV2, int i) {
        Document document = (Document) this.K.get(i);
        String cf = document.cf();
        if (m20139a(cf, 0) || m20139a(cf, 6) || m20139a(cf, 3) || m20139a(cf, 7)) {
            d dVar = playCardViewMyAppsV2;
            this.f21958p.m18519a(dVar, document, "my_apps:updates", this.f, (ad) this, this.i, this.A.mo3485c(cf));
            playCardViewMyAppsV2.m18460a(m20157f(cf).intValue(), false, null, null, null, null, false);
        } else {
            CharSequence H;
            this.f21958p.m18518a((d) playCardViewMyAppsV2, document, "my_apps:updates", this.f, (ad) this, this.i);
            String a = this.f21957o.m8958a(this.e, document);
            String a2 = ab.m21144a(this.e, document, this.z);
            String string = this.e.getResources().getString(C7582R.string.update);
            if (document.m14618G()) {
                H = document.m14619H();
            } else {
                H = this.e.getString(C7582R.string.myapps_whats_new_missing);
            }
            playCardViewMyAppsV2.m18460a(2, false, a, a2, string, H, ((C4561z) this.D).f23317a.contains(document));
        }
        playCardViewMyAppsV2.setActionListener(this);
    }

    protected final int mo4135b() {
        return 2806;
    }

    protected final List mo4129a(List list) {
        List list2;
        this.O = list;
        if (list == null) {
            list2 = null;
        } else {
            List arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Document document = (Document) list.get(i);
                String str = document.m14625N().f13171k;
                if (this.Q.m21146a(this.y, document)) {
                    arrayList.add(document);
                    m20135a(str, document, C3371p.m16828a(this.A.mo3482b(str)));
                }
            }
            list2 = arrayList;
        }
        if (list2 != null) {
            ArrayList arrayList2 = (ArrayList) list2;
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                this.y.m15637b((Document) obj);
            }
        }
        return list2;
    }

    protected final void mo4137c() {
        if (this.K != null) {
            Collections.sort(this.K, this.f21955a);
        }
    }

    public final void mo4127b(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
        super.mo4127b(playCardViewMyAppsV2);
        m20324w();
    }

    public final void mo1205a(C3369m c3369m) {
        Document b = mo4136b(c3369m.m16819a());
        if (b != null) {
            C4560y v = m20167v();
            if (c3369m.f17273c.f17153d == 6) {
                m20151c(c3369m.m16819a());
                this.K.remove(b);
            } else {
                m20135a(c3369m.m16819a(), b, c3369m.f17273c.f17153d);
            }
            mo4137c();
            m20134a(v);
            m20324w();
        }
    }

    public final void mo4061q() {
        this.J.f23290q = false;
        super.mo4061q();
    }

    public final void mo4161p() {
        C4344x.m20118a(this.i, (ad) this, 2931);
        m20137a(true);
        m20324w();
    }

    public final void cb_() {
        if (this.K == null || !this.J.m21174d()) {
            this.f21956b = true;
            return;
        }
        C4560y v = m20167v();
        Collection arrayList = new ArrayList();
        for (Document document : this.K) {
            if (m20139a(document.cf(), 2)) {
                arrayList.add(document);
                super.m20136a(document.cf(), Integer.valueOf(7));
            }
        }
        m20134a(v);
        this.e.startActivity(this.P.mo2752a(this.e, arrayList, this.i, this.L));
        m20324w();
        this.f21956b = false;
    }

    public final boolean mo4153i() {
        return true;
    }

    public final void mo1176c(String str, boolean z) {
        C4560y v = m20167v();
        Document b = mo4136b(str);
        if (b == null) {
            b = m20159h(str);
            if (b != null) {
                if (!z) {
                    this.O.remove(b);
                } else if (this.Q.m21146a(this.y, b)) {
                    this.K.add(b);
                    m20135a(str, b, C3371p.m16828a(this.A.mo3482b(str)));
                }
            }
        } else if (!z) {
            this.K.remove(b);
            m20151c(str);
        }
        m20134a(v);
    }

    public final void mo4141m() {
        if (m20165t()) {
            this.i.m13379b(new C2475d(this).m13256a(2918));
            if (this.K != null) {
                for (int i = 0; i < this.K.size(); i++) {
                    String cf = ((Document) this.K.get(i)).cf();
                    if (C3028c.m15628a(this.A.mo3482b(cf))) {
                        this.A.m16742a(cf).mo4398a(C4831h.f25111a);
                        m20151c(cf);
                    }
                }
            }
            m20324w();
            return;
        }
        this.i.m13379b(new C2475d(this).m13256a(2805));
        cb_();
    }

    private final void m20324w() {
        this.f21959q = null;
        if (this.C != null) {
            this.C.mo4087a(this, 0, 1, false);
        }
    }
}
