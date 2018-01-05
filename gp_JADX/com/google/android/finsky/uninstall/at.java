package com.google.android.finsky.uninstall;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.design.widget.C0138g;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.aj.C1190a;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.bg.C1601a;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dk.C2824a;
import com.google.android.finsky.dk.C2830g;
import com.google.android.finsky.frameworkviews.C3141d;
import com.google.android.finsky.headerlistlayout.C3167i;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p107l.C3646a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p142j.C3632i;
import com.google.android.finsky.p142j.C3633l;
import com.google.android.finsky.p142j.C3635n;
import com.google.android.finsky.p225k.C3640a;
import com.google.android.finsky.p226m.C3741b;
import com.google.android.finsky.packagemanager.C0983h;
import com.google.android.finsky.packagemanager.C3851f;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.playcard.C3908i;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.stream.myapps.C4552s;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.finsky.utils.bb;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.a.a.a.a.cr;
import com.google.wireless.android.a.a.a.a.cs;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public final class at extends C1045b implements C0998m, C1031w, C3635n, C0983h, be, br {
    public static final C3632i[] at = new C3632i[]{C3632i.RECOMMENDED, C3632i.SIZE, C3632i.DATA_USAGE, C3632i.ALPHABETICAL};
    public PlayRecyclerView f23513a;
    public ArrayList ag = new ArrayList();
    public ae ah;
    public C3633l ai;
    public C3632i aj;
    public ac ak = new ac();
    public C3646a al;
    public C3741b am;
    public C3640a an;
    public C2824a ao;
    public C4552s ap;
    public C1190a aq;
    public C3851f ar;
    public C2830g as;
    public ce au = C2482j.m13283a(5530);
    public Handler av = new Handler(Looper.getMainLooper());
    public Runnable aw = new au(this);
    public boolean ax = false;
    public bd f23514c;
    public Button f23515f;
    public long f23516h;

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3167i(contentFrame, this);
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ContentFrame contentFrame = (ContentFrame) super.mo970a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.bt;
        finskyHeaderListLayout.a(new av(finskyHeaderListLayout.getContext()));
        this.f23513a = (PlayRecyclerView) this.bt.findViewById(C7582R.id.uninstall_recycler_view);
        this.f23515f = (Button) this.bt.findViewById(C7582R.id.positive_button);
        this.f23513a.setLayoutManager(new LinearLayoutManager());
        this.f23513a.setAdapter(new C3984a());
        this.f23513a.m278a(new C3141d(m601g(), C7582R.color.play_card_light_background));
        this.f23513a.m278a(new C3908i(m601g()));
        return contentFrame;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        this.ai = (C3633l) this.bp.mo3708j().mo283a("uninstall_manager_sorter");
        if (this.ai != null) {
            this.ai.af = this;
        }
        if (this.ah != null) {
            this.ah.mo4269a((C1031w) this);
            this.ah.f23461m = this;
            this.ah.m21283d();
        }
        this.ar = C1473m.f7980a.mo2254m();
        this.ar.mo3818a((C0983h) this);
        this.al = C1473m.f7980a.mo2029I();
        this.am = C1473m.f7980a.bS();
        this.an = C1473m.f7980a.ba();
        this.ao = C1473m.f7980a.bC();
        this.as = C1473m.f7980a.bD();
        this.aq = C1473m.f7980a.at();
        this.ap = C1473m.f7980a.cq().m21141a(C1473m.f7980a.cZ());
        Object obj = (this.ah == null || !this.ah.m21287h()) ? null : 1;
        if (obj == null) {
            au();
            aa();
            ac();
        } else {
            cg_();
        }
        this.bq.mo1259a();
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
    }

    public final ce getPlayStoreUiElement() {
        return this.au;
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    protected final void aa() {
        if (this.ah == null) {
            this.ah = new ae(this.al, this.an, this.ao, this.am, this.aq, this.ap, this.bw, new ArrayList(), m603h().getApplicationContext(), this.as);
            this.ah.mo4269a((C1031w) this);
            this.ah.f23461m = this;
        }
        this.ah.mo4275g();
    }

    protected final void cg_() {
        O_();
        ac();
        if (this.ah != null) {
            aj();
            this.aj = C3632i.m17226a(((Integer) C0954a.aX.m5760a()).intValue());
            if (this.f23513a == null) {
                FinskyLog.m21665c("Recycler view null, ignoring.", new Object[0]);
            } else {
                boolean c = ba.m21342c(this.ak);
                if (this.f23514c == null) {
                    this.f23514c = new bd(this.bn, this, this.an, this.am, this.aq);
                    this.f23514c.f23536c = this.aj;
                    this.f23513a.setAdapter(this.f23514c);
                    this.f23514c.f23542i = this;
                    this.f23514c.f23543j = new ax(this);
                    if (c) {
                        bd bdVar = this.f23514c;
                        ac acVar = this.ak;
                        bdVar.f23538e = (ArrayList) acVar.m21690b("uninstall_manager__adapter_docs");
                        bdVar.f23539f = (ArrayList) acVar.m21690b("uninstall_manager__adapter_checked");
                        this.ak.clear();
                    } else {
                        this.f23514c.m21358a(false, this.ah.m21285f());
                    }
                    this.f23513a.setEmptyView(this.bt.findViewById(C7582R.id.no_results_view));
                } else {
                    this.f23514c.m21358a(false, this.ah.m21285f());
                }
            }
            this.f23515f.setOnClickListener(new aw(this));
            this.f23516h = this.f23514c.m21361c();
            ap();
            return;
        }
        FinskyLog.m21669e("Binding null data model", new Object[0]);
    }

    public final void ac() {
        this.bm.mo1241c(m605i().getString(C7582R.string.uninstall_manager_title_v2));
        this.bm.mo1237a(3, true);
        this.bm.mo1246z();
    }

    public final void m_() {
        this.av.removeCallbacks(this.aw);
        this.av.postDelayed(this.aw, ((Long) C0955b.gi.m28964b()).longValue());
    }

    public final void mo138d() {
        this.av.removeCallbacks(this.aw);
        this.ah.mo4272b(this);
        this.ar.mo3819b(this);
        ae aeVar = this.ah;
        aeVar.f23466r.m17238b(aeVar);
        aeVar.f23450b.m17621b(aeVar);
        aeVar.f23451c.f7290c.remove(aeVar);
        aeVar.f23449a.m21173b(aeVar);
        aeVar.f23469u.removeCallbacks(aeVar.f23471w);
        if (this.ai != null) {
            this.ai.af = null;
        }
        if (this.aj != null) {
            C0954a.aX.m5763a(Integer.valueOf(this.aj.f17997g));
        }
        if (!(this.f23513a == null || this.f23513a.getVisibility() != 0 || this.f23514c == null)) {
            bd bdVar = this.f23514c;
            ac acVar = this.ak;
            acVar.m21688a("uninstall_manager__adapter_docs", bdVar.f23538e);
            acVar.m21688a("uninstall_manager__adapter_checked", bdVar.f23539f);
        }
        this.f23513a = null;
        if (this.f23514c != null) {
            this.f23514c.f23542i = null;
            this.f23514c = null;
        }
        this.bt = null;
        super.mo138d();
    }

    public final int af() {
        return C1608h.m9243a(m603h(), 3);
    }

    final boolean aj() {
        boolean z = false;
        if (!C3632i.LAST_USAGE.f18001k && this.am.m17620a()) {
            C3632i.LAST_USAGE.f18001k = true;
            z = true;
        }
        if (!C3632i.SIZE.f18001k && this.an.m17237a()) {
            C3632i.SIZE.f18001k = true;
            z = true;
        }
        if (!C3632i.DATA_USAGE.f18001k && this.aq.m7144a()) {
            C3632i.DATA_USAGE.f18001k = true;
            z = true;
        }
        if (C3632i.RECOMMENDED.f18001k || !this.am.m17620a() || !this.an.m17237a()) {
            return z;
        }
        C3632i.RECOMMENDED.f18001k = true;
        return true;
    }

    public final void mo1175b(String str, boolean z) {
        aa();
    }

    public final void mo1176c(String str, boolean z) {
        if (!z) {
            ArrayList arrayList = this.ag;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                Document document = (Document) obj;
                if (document.cf().equals(str)) {
                    this.ag.remove(document);
                    break;
                }
            }
            this.ah.f23460l.remove(str);
            if (this.ah.f23460l.size() <= 0 && this.ax) {
                aq();
                this.ax = false;
            }
            if (this.f23514c != null) {
                this.f23516h = this.f23514c.m21361c();
                ap();
            }
        }
        aa();
    }

    public final void mo1177d(String str) {
    }

    public final void mo1174a(String[] strArr) {
    }

    public final void mo1178e(String str) {
    }

    public final void mo968W() {
    }

    public final void a_(VolleyError volleyError) {
    }

    public final void ao() {
        this.f23516h = this.f23514c.m21361c();
        ap();
    }

    private final void ap() {
        this.f23515f.setText(m605i().getString(C7582R.string.uninstall_manager_space_to_be_freed, new Object[]{m21322a(this.f23516h)}));
        if (C1601a.m9200a(m603h())) {
            C1601a.m9199a(m603h(), this.f23515f.getText(), this.f23515f, false);
        }
        if (this.f23516h > 0) {
            this.f23515f.setEnabled(true);
        } else {
            this.f23515f.setEnabled(false);
        }
    }

    public final void mo1202a(int i, Bundle bundle) {
        aq();
        C2495w c2495w = this.bw;
        C2474c c2474c = new C2474c(192);
        List arrayList = new ArrayList(this.ag.size());
        ArrayList arrayList2 = this.ag;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            Document document = (Document) obj;
            cr crVar = new cr();
            String cf = document.cf();
            if (cf == null) {
                throw new NullPointerException();
            }
            crVar.b |= 1;
            crVar.c = cf;
            long a = this.an.m17234a(document.cf());
            crVar.b |= 2;
            crVar.d = a;
            arrayList.add(crVar);
        }
        cs csVar = new cs();
        long j = this.f23516h;
        csVar.a |= 1;
        csVar.b = j;
        int size2 = this.ag.size();
        csVar.a |= 2;
        csVar.c = size2;
        String a2 = this.aj.m17227a(m601g());
        if (a2 == null) {
            throw new NullPointerException();
        }
        csVar.a |= 4;
        csVar.d = a2;
        csVar.e = (cr[]) arrayList.toArray(new cr[0]);
        c2474c.f13342a.aF = csVar;
        c2495w.m13367a(c2474c);
        C1473m.f7980a.mo2030J().m15136a(this.ag);
        this.ag = new ArrayList();
        if (this.f746R != null) {
            C0138g a3 = Snackbar.m500a(this.f746R, m572a((int) C7582R.string.uninstall_manager_space_removed, m21322a(this.f23516h)), 0);
            View view = a3.f659e;
            LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = m605i().getDimensionPixelSize(C7582R.dimen.uninstall_manager_v3_button_snackbar_height);
            view.setLayoutParams(layoutParams);
            a3.m493a();
        }
        this.ah.m21278a(this.f23514c.m21360b());
        m_();
        this.ax = true;
    }

    private final void aq() {
        bb.m21792a(new ay(this), new Void[0]);
    }

    public final void mo1211b(int i, Bundle bundle) {
    }

    public final void mo4131a(C3632i c3632i) {
        if (!c3632i.equals(this.aj)) {
            this.aj = c3632i;
            if (this.bw != null) {
                this.bw.m13379b(new C2475d(this).m13256a(this.aj.f17999i));
            }
            this.f23514c.f23536c = this.aj;
            this.f23514c.m21358a(true, null);
            if (this.aj != null) {
                C0954a.aX.m5763a(Integer.valueOf(this.aj.f17997g));
            }
        }
    }

    final String m21322a(long j) {
        return Formatter.formatShortFileSize(m601g(), j);
    }
}
