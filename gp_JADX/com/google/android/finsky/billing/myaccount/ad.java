package com.google.android.finsky.billing.myaccount;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.ab;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.bx;
import android.support.v7.widget.ci;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.billing.common.C1087t;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.headerlistlayout.C3167i;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.layoutswitcher.C3166e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.ContentFrame;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.recyclerview.C3984a;
import com.google.android.finsky.recyclerview.PlayRecyclerView;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.c.a.ba;
import com.google.wireless.android.finsky.dfe.c.a.bf;
import com.google.wireless.android.finsky.dfe.c.a.bh;
import com.squareup.leakcanary.C7582R;

public final class ad extends C1045b implements C1087t {
    public final ce f10177a = C2482j.m13283a(28);
    public C1612l f10178b;
    public C2033w f10179c;
    public PlayRecyclerView f10180e;
    public af f10181f;
    public bh[] f10182h = null;

    public final ce getPlayStoreUiElement() {
        return this.f10177a;
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    protected final void aa() {
        this.f10182h = null;
        this.f10181f.m10582a(null);
    }

    protected final C3166e mo1299a(ContentFrame contentFrame) {
        return new C3167i(contentFrame, this);
    }

    protected final void cg_() {
        int i = 0;
        if (this.f10179c == null) {
            this.f10179c = new C2033w(m601g(), this.f10178b, this.bw, this);
        }
        this.f10180e.setAdapter(this.f10179c);
        this.f10179c.f10491i = this.f10181f;
        if (this.f10182h != null) {
            C2033w c2033w = this.f10179c;
            bh[] bhVarArr = this.f10182h;
            c2033w.f10492j = new ab[(bhVarArr.length + 1)];
            c2033w.f10492j[0] = new ab();
            while (i < bhVarArr.length) {
                c2033w.f10492j[i + 1] = new ab(bhVarArr[i]);
                i++;
            }
            this.f10179c.f3433a.m3638b();
            O_();
            return;
        }
        au();
    }

    public final void ac() {
        this.bm.mo1241c(m592c((int) C7582R.string.account_country_page_title));
        this.bm.mo1237a(0, true);
        this.bm.mo1246z();
    }

    public final void mo1292a(Activity activity) {
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1750a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        ab H_ = m603h().H_();
        Fragment a = H_.mo283a("country_profile_sidecar");
        if (a != null) {
            H_.mo284a().mo327a(a).mo334c();
        }
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        FinskyHeaderListLayout finskyHeaderListLayout = (FinskyHeaderListLayout) this.bt;
        finskyHeaderListLayout.a(new ae(finskyHeaderListLayout.getContext()));
        this.f10180e = (PlayRecyclerView) this.bt.findViewById(C7582R.id.recycler_view);
        this.f10180e.setSaveEnabled(false);
        this.f10180e.setBackgroundResource(C7582R.color.play_main_background);
        this.f10180e.setLayoutManager(new LinearLayoutManager());
        this.f10180e.setAdapter(new C3984a());
        this.f10180e.setItemAnimator(new bx());
        this.f10180e.m278a(new ci(m601g()));
        return a;
    }

    public final void mo138d() {
        super.mo138d();
        this.f10181f.m6757a(null);
        this.f10180e = null;
        this.f10179c = null;
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        ac();
        if (this.f10181f == null) {
            String str = this.bo.mo1620b().name;
            C2495w c2495w = this.bw;
            Bundle bundle2 = new Bundle();
            bundle2.putString("authAccount", str);
            c2495w.m13377a(bundle2);
            Fragment afVar = new af();
            afVar.m600f(bundle2);
            this.f10181f = afVar;
            m603h().H_().mo284a().mo328a(this.f10181f, "country_profile_sidecar").mo334c();
        }
        this.f10181f.m6757a((C1087t) this);
        cg_();
        this.bq.mo1259a();
    }

    public final void mo1423a(C1089s c1089s) {
        int i = 0;
        switch (c1089s.f6948l) {
            case 0:
                aa();
                return;
            case 1:
                au();
                return;
            case 2:
                ba baVar;
                af afVar = this.f10181f;
                if (afVar.ak != null) {
                    bf[] bfVarArr = afVar.ak.a;
                    int length = bfVarArr.length;
                    while (i < length) {
                        bf bfVar = bfVarArr[i];
                        if (bfVar.c.equals(afVar.al.peek())) {
                            baVar = bfVar.d;
                            this.f10182h = baVar.a;
                            cg_();
                            return;
                        }
                        i++;
                    }
                }
                baVar = null;
                this.f10182h = baVar.a;
                cg_();
                return;
            case 3:
                mo1345a(C1290m.m7702a(this.bn, this.f10181f.aj));
                return;
            default:
                FinskyLog.m21665c("Unhandled state: %s", Integer.valueOf(c1089s.f6948l));
                mo1345a(m592c((int) C7582R.string.error));
                return;
        }
    }

    public final boolean am() {
        int i = 0;
        C1089s c1089s = this.f10181f;
        if (!c1089s.al.empty()) {
            c1089s.al.pop();
        }
        if (!c1089s.al.empty()) {
            c1089s.m6758b(2, 0);
            i = 1;
        }
        if (i != 0) {
            return true;
        }
        return super.am();
    }
}
