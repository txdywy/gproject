package com.google.android.finsky.billing.myaccount;

import android.accounts.Account;
import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.bx;
import android.support.v7.widget.em;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.google.android.finsky.accounts.C0988c;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.billing.common.C1801q;
import com.google.android.finsky.billing.profile.C2056m;
import com.google.android.finsky.headerlistlayout.C3167i;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.squareup.leakcanary.C7582R;

public final class C2028q extends C1045b implements OnClickListener, C1087t {
    public boolean f10472a;
    public ad ag;
    public ad ah;
    public int ai;
    public C2056m aj;
    public int ak = -1;
    public u al;
    public PlayRecyclerView am;
    public FloatingActionButton an;
    public C2011l ao;
    public C0988c f10473b;
    public C1557b f10474c;
    public C1612l f10475e;
    public C1801q f10476f;
    public final ce f10477h = C2482j.m13283a(19);
    public C1461c n_;

    public final void mo1292a(Activity activity) {
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1764a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        this.f10472a = this.n_.dj().mo2294a(12622358);
        this.ag = new C2473o(2621, this);
        this.ah = new C2473o(2622, this);
        if (this.f10472a) {
            this.ai = 2;
        } else {
            this.ai = 0;
        }
        ab H_ = m603h().H_();
        Fragment a = H_.mo283a("billing_profile_sidecar");
        if (a != null) {
            H_.mo284a().mo327a(a).mo334c();
        }
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.bt;
        finskyHeaderListLayout.a(new C2029r(finskyHeaderListLayout.getContext()));
        this.am = (PlayRecyclerView) this.bt.findViewById(C7582R.id.recycler_view);
        this.am.setSaveEnabled(false);
        if (this.f10472a) {
            this.am.setBackgroundResource(17170445);
        }
        this.am.setLayoutManager(new LinearLayoutManager());
        this.am.setAdapter(new C3984a());
        this.am.setItemAnimator(new bx());
        this.an = (FloatingActionButton) this.bt.findViewById(C7582R.id.floating_action_button);
        if (this.f10472a) {
            this.an.setVisibility(8);
        } else {
            this.an.setOnClickListener(this);
        }
        return a;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        ac();
        if (this.aj == null) {
            Account b = this.bo.mo1620b();
            this.aj = C2056m.m10807a(b, null, null, this.f10476f.mo2637a(b.name, 5, null, this.bw), 4, 0);
            m603h().H_().mo284a().mo328a(this.aj, "billing_profile_sidecar").mo334c();
        }
        this.aj.m6757a((C1087t) this);
        if (aj()) {
            cg_();
        }
        this.bq.mo1259a();
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3167i(contentFrame, this);
    }

    public final void ac() {
        switch (this.ai) {
            case 0:
            case 2:
                this.bm.mo1241c(m592c((int) C7582R.string.payment_methods));
                break;
            case 1:
                this.bm.mo1241c(m592c((int) C7582R.string.add_payment_method));
                break;
            default:
                throw new IllegalStateException("Unknown view state: " + this.ai);
        }
        this.bm.mo1237a(0, true);
        this.bm.mo1246z();
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    private final boolean aj() {
        return this.al != null;
    }

    protected final void aa() {
        this.al = null;
        C2056m c2056m = this.aj;
        c2056m.m10816a(c2056m.mo968W(), null, 0, this.bw);
    }

    protected final void cg_() {
        if (this.ao == null) {
            this.ao = new C2011l(this.bn, this.aj, this.f10473b, this.f10474c, this.f10475e, this.n_, this.ag, this.ah, this.bw);
            this.am.setAdapter(this.ao);
        }
        switch (this.ai) {
            case 0:
                if (!ar()) {
                    ap();
                    return;
                } else if (this.al.b == null || this.al.b.length == 0) {
                    throw new IllegalArgumentException("No existing instruments to show.");
                } else {
                    this.ao.m10676a(this.al.b);
                    O_();
                    this.an.m485a(null, true);
                    this.ag.mo1219a(new C2473o(2624, this.ag));
                    return;
                }
            case 1:
                aq();
                return;
            case 2:
                this.ao.m10677a(this.al.b, this.al.d);
                O_();
                return;
            default:
                throw new IllegalStateException("Unknown view state: " + this.ai);
        }
    }

    public final void mo138d() {
        if (this.aj != null) {
            this.aj.m6757a(null);
        }
        this.am = null;
        this.an = null;
        this.ao = null;
        super.mo138d();
    }

    public final boolean am() {
        if (this.ai != 1 || !aj() || !ar()) {
            return super.am();
        }
        this.bw.m13379b(new C2475d(this.ah).m13256a(600));
        ao();
        return true;
    }

    public final void n_() {
        this.bw.m13379b(new C2475d(this).m13256a(2628));
        super.n_();
    }

    protected final int ak() {
        return 3;
    }

    public final ad al() {
        switch (this.ai) {
            case 0:
                return this.ag;
            case 1:
                return this.ah;
            case 2:
                return this;
            default:
                throw new IllegalStateException("Unknown view state: " + this.ai);
        }
    }

    private final void ao() {
        if (this.f10472a) {
            this.ai = 2;
        } else {
            this.ai = 0;
        }
        ac();
        if (aj()) {
            cg_();
        }
    }

    private final void ap() {
        this.ai = 1;
        ac();
        if (aj()) {
            aq();
        }
    }

    private final void aq() {
        if (this.al.d == null || this.al.d.length == 0) {
            throw new IllegalArgumentException("No creatable instruments to show.");
        }
        em emVar = this.ao;
        Object[] objArr = this.al.d;
        emVar.f10327w = null;
        emVar.f10328x = false;
        emVar.m10678b();
        emVar.m10674a(2, objArr);
        emVar.f3433a.m3638b();
        O_();
        this.an.m489b(null, true);
    }

    private final boolean ar() {
        if (aj()) {
            return this.al.b != null && this.al.b.length > 0;
        } else {
            throw new IllegalStateException("Cannot check for existing instruments without a billing profile.");
        }
    }

    public final void mo1423a(C1089s c1089s) {
        if (c1089s.ag != this.ak || c1089s.f6948l == 1) {
            this.ak = c1089s.ag;
            switch (c1089s.f6948l) {
                case 0:
                    aa();
                    return;
                case 1:
                    au();
                    this.an.m489b(null, true);
                    return;
                case 2:
                    this.al = this.aj.al;
                    cg_();
                    return;
                case 3:
                    switch (c1089s.af) {
                        case 1:
                            mo1345a(Html.fromHtml(this.aj.am).toString());
                            return;
                        case 2:
                            mo1345a(C1290m.m7702a(this.bn, this.aj.an));
                            return;
                        default:
                            FinskyLog.m21665c("Unhandled state: %s substate: %s", Integer.valueOf(c1089s.f6948l), Integer.valueOf(c1089s.af));
                            mo1345a(m592c((int) C7582R.string.error));
                            return;
                    }
                case 4:
                case 5:
                case 6:
                    aa();
                    ao();
                    return;
                default:
                    FinskyLog.m21665c("Unhandled state: " + c1089s.f6948l, new Object[0]);
                    return;
            }
        }
    }

    public final void onClick(View view) {
        if (view == this.an) {
            this.bw.m13379b(new C2475d(this.ag).m13256a(2624));
            ap();
            return;
        }
        String valueOf = String.valueOf(view);
        FinskyLog.m21669e(new StringBuilder(String.valueOf(valueOf).length() + 32).append("Click received on unknown view: ").append(valueOf).toString(), new Object[0]);
    }

    public final ce getPlayStoreUiElement() {
        return this.f10477h;
    }
}
