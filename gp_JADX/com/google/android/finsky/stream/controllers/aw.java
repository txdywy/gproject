package com.google.android.finsky.stream.controllers;

import android.app.NotificationManager;
import android.content.Context;
import android.support.v4.p037h.C0305a;
import android.support.v4.p037h.C0308c;
import android.view.View;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.ba.C1556d;
import com.google.android.finsky.bg.C1611k;
import com.google.android.finsky.br.C2171b;
import com.google.android.finsky.ce.C2266a;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.installqueue.C3340g;
import com.google.android.finsky.installqueue.C3363f;
import com.google.android.finsky.installqueue.C3369m;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.p108z.C4831h;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.p142j.C3623a;
import com.google.android.finsky.p198f.C3028c;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.playcard.PlayCardViewMyAppsV2;
import com.google.android.finsky.playcard.ao;
import com.google.android.finsky.stream.base.C4230c;
import com.google.android.finsky.stream.controllers.view.C4346u;
import com.google.android.finsky.stream.controllers.view.C4517t;
import com.google.android.finsky.stream.controllers.view.MyAppsUpdateClusterHeader;
import com.google.android.finsky.stream.myapps.C4344x;
import com.google.android.finsky.stream.myapps.C4560y;
import com.google.android.finsky.stream.myapps.aa;
import com.google.android.finsky.stream.myapps.ab;
import com.google.android.play.layout.d;
import com.squareup.leakcanary.C7582R;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class aw extends C4344x implements C4346u {
    public final ao f21872a;
    public C4517t f21873b;
    public NotificationManager f21874o = ((NotificationManager) this.e.getSystemService("notification"));
    public C4809e f21875p;
    public Set f21876q = new C0308c();

    public aw(Context context, C3748a c3748a, ad adVar, C4230c c4230c, C1611k c1611k, C1556d c1556d, C2495w c2495w, C3646a c3646a, C3340g c3340g, C1461c c1461c, C3851f c3851f, C3028c c3028c, C2266a c2266a, C0988c c0988c, ao aoVar, aa aaVar, C2171b c2171b, ab abVar) {
        super(context, c3748a, adVar, c4230c, c1611k, c1556d, c2495w, c3646a, c3340g, c1461c, c3851f, c3028c, c2266a, c0988c, aaVar, c2171b, abVar);
        this.f21872a = aoVar;
        this.f21876q.add(Integer.valueOf(1));
        this.f21876q.add(Integer.valueOf(4));
        this.f21876q.add(Integer.valueOf(0));
        if (this.M) {
            this.f21876q.add(Integer.valueOf(3));
            this.f21876q.add(Integer.valueOf(5));
        }
    }

    protected final int mo4139d() {
        return C7582R.layout.my_apps_update_cluster_header;
    }

    protected final int mo4135b() {
        return 2800;
    }

    protected final void mo4137c() {
        if (this.K != null) {
            Collections.sort(this.K, C3623a.f17985h);
        }
    }

    protected final void mo4130a(View view) {
        if (this.f21873b == null) {
            C4517t c4517t = new C4517t();
            c4517t.f23121a = this.e.getResources().getString(C7582R.string.my_apps_pending_installs_title);
            c4517t.f23122b = null;
            if (m20165t()) {
                c4517t.f23123c = this.e.getResources().getString(C7582R.string.my_apps_cancel_all);
            } else {
                c4517t.f23123c = null;
            }
            c4517t.f23124d = false;
            this.f21873b = c4517t;
        }
        ((MyAppsUpdateClusterHeader) view).m21029a(this.f21873b, this);
    }

    protected final void mo4132a(PlayCardViewMyAppsV2 playCardViewMyAppsV2, int i) {
        Document document = (Document) this.K.get(i);
        String cf = document.cf();
        d dVar = playCardViewMyAppsV2;
        this.f21872a.m18519a(dVar, document, "my_apps2:pending_installs", this.f, (ad) this, this.i, this.A.mo3485c(cf));
        playCardViewMyAppsV2.m18460a(m20157f(cf).intValue(), false, null, null, null, null, false);
        playCardViewMyAppsV2.setActionListener(this);
    }

    protected final void bZ_() {
        List<Document> e = this.J.m21175e();
        if (e != null) {
            m20187p();
            Map c0305a = new C0305a();
            for (Document document : e) {
                c0305a.put(document.cf(), document);
            }
            C3340g c3340g = this.A;
            C3363f b = new C3363f().m16804b(this.f21876q);
            b.f17263c = new C0308c(c0305a.keySet());
            this.f21875p = c3340g.mo3479a(b.m16800a());
            this.f21875p.mo4398a(new ax(this, c0305a));
        }
    }

    public final void mo1205a(C3369m c3369m) {
        Document b = mo4136b(c3369m.m16819a());
        if (b == null || c3369m.f17273c.f17153d != 6) {
            C4560y v = m20167v();
            m20135a(c3369m.m16819a(), b, c3369m.f17273c.f17153d);
            if (this.K != null && this.K.size() == 1 && c3369m.f17273c.f17153d == 4) {
                ca_();
            }
            m20134a(v);
            return;
        }
        m20186b(b);
    }

    final void ca_() {
        if (this.C != null) {
            this.f21873b = null;
            this.C.mo4087a(this, 0, 1, false);
        }
    }

    public final void mo4061q() {
        super.mo4061q();
        m20187p();
    }

    protected final List mo4129a(List list) {
        return null;
    }

    private final void m20187p() {
        if (this.f21875p != null) {
            this.f21875p.cancel(true);
            this.f21875p = null;
        }
    }

    private final void m20186b(Document document) {
        C4560y v = m20167v();
        this.K.remove(document);
        m20134a(v);
    }

    public final void mo4128c(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
        super.mo4128c(playCardViewMyAppsV2);
        this.f21874o.cancel("SetupProgressNotifier", -555892993);
        this.f.mo3631a(this.g.f14909b.mo1620b(), (Document) playCardViewMyAppsV2.getData(), 1, null, null, false, this.i);
    }

    public final void mo4127b(PlayCardViewMyAppsV2 playCardViewMyAppsV2) {
        super.mo4127b(playCardViewMyAppsV2);
        m20186b((Document) playCardViewMyAppsV2.getData());
    }

    public final void mo4141m() {
        this.i.m13379b(new C2475d(this).m13256a(2918));
        if (this.K != null) {
            for (Document cf : this.K) {
                String cf2 = cf.cf();
                if (C3028c.m15628a(this.A.mo3482b(cf2))) {
                    this.A.m16742a(cf2).mo4398a(C4831h.f25111a);
                }
            }
        }
        C4560y v = m20167v();
        this.K.clear();
        m20134a(v);
    }
}
