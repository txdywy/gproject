package com.google.android.finsky.playpass;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.v4.p028a.p029a.C0206f;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
import com.android.volley.C0660x;
import com.google.android.finsky.bg.C1608h;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.iab.C1867w;
import com.google.android.finsky.billing.iab.C1869y;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.frameworkviews.InsetsFrameLayout;
import com.google.android.finsky.frameworkviews.PlayActionButtonV2;
import com.google.android.finsky.headerlistlayout.FinskyHeaderListLayout;
import com.google.android.finsky.p106a.C0948a;
import com.google.android.finsky.p111d.C2475d;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.C1052j;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.volley.C4774e;
import com.google.android.play.utils.k;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.dfe.k.a.a;
import com.google.wireless.android.finsky.dfe.k.a.c;
import com.google.wireless.android.finsky.dfe.nano.gm;
import com.squareup.leakcanary.C7582R;

public final class C3923a extends C1052j implements OnClickListener, C0660x {
    public C1867w f19873a;
    public gm ag;
    public FinskyHeaderListLayout ah;
    public RecyclerView ai;
    public PlayPassHeaderView aj;
    public PlayActionButtonV2 ak;
    public PlayActionButtonV2 al;
    public int am;
    public C1869y f19874c;
    public C4774e f19875f;
    public a f19876h;

    public static C3923a m18597a(DfeToc dfeToc, String str, C2495w c2495w) {
        if (str == null) {
            FinskyLog.m21669e("benefit url is null", new Object[0]);
        }
        C1045b c3923a = new C3923a();
        c3923a.m6319a(dfeToc, str);
        c3923a.mo2580a(c2495w);
        return c3923a;
    }

    public final void mo1292a(Activity activity) {
        ((C1409f) C3947d.m18649a(C1409f.class)).mo1892a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.f740L = true;
        this.ag = this.k_.f14881a.f31781x;
        if (bundle == null) {
            this.bw.m13370a(new C2488p().m13345b(this));
        }
    }

    protected final int mo1298Z() {
        return C7582R.layout.header_list_container;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        this.am = m605i().getDimensionPixelSize(C7582R.dimen.family_benefit_v2_header_height);
        if (InsetsFrameLayout.f14024a) {
            this.am -= k.e(m601g());
        }
        this.ah = (FinskyHeaderListLayout) this.bt;
        this.ah.a(new C3926d(m601g(), this.am));
        this.ah.setBackgroundColor(C0206f.m1066b(m605i(), C7582R.color.play_white, null));
        this.ai = (RecyclerView) this.ah.findViewById(C7582R.id.recycler_view);
        this.aj = (PlayPassHeaderView) this.ah.findViewById(C7582R.id.benefit_header_view);
        return a;
    }

    public final int af() {
        return C1608h.m9243a(this.bn, 3);
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        ac();
        if ((this.f19876h != null ? 1 : null) != null) {
            cg_();
            return;
        }
        au();
        aa();
    }

    public final void mo138d() {
        super.mo138d();
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.ak = null;
        this.al = null;
    }

    public final void ac() {
        this.bm.mo1243l().mo1259a();
        this.bm.mo1243l().mo1269d();
        Object c0948a = new C0948a(m603h().getWindow(), this.ah);
        this.ah.setOnLayoutChangedListener(c0948a);
        c0948a.m5719b();
        if (this.ag != null) {
            this.bm.mo1241c(this.ag.b);
        }
        this.bm.mo1237a(3, true);
        this.bm.mo1246z();
    }

    protected final void aa() {
        if (this.ag == null) {
            mo1345a(m592c((int) C7582R.string.availability_restriction_generic));
        } else {
            this.bo.mo1659l(this.bF, this, this);
        }
    }

    protected final void cg_() {
        PlayPassHeaderView playPassHeaderView = this.aj;
        CharSequence charSequence = this.f19876h.d;
        CharSequence charSequence2 = this.f19876h.e;
        bd bdVar = this.f19876h.b;
        bd bdVar2 = this.f19876h.c;
        playPassHeaderView.f19867b.setText(charSequence);
        playPassHeaderView.f19868c.setText(charSequence2);
        playPassHeaderView.f19866a.m9287a(playPassHeaderView.f19869d, bdVar, -1);
        playPassHeaderView.f19866a.m9287a(playPassHeaderView.f19870e, bdVar2, -1);
        this.ai.setLayoutManager(new LinearLayoutManager());
        this.ai.setAdapter(new C3927e(this, this.am));
    }

    public final void onClick(View view) {
        if (view == this.ak) {
            m18598b(6521);
            ao();
        } else if (view == this.al) {
            m18598b(6522);
            aj();
        }
    }

    final void aj() {
        c cVar = this.f19876h.k;
        PurchaseParams a = this.f19873a.m9992a(m601g(), 3, cVar.b, null, cVar.c, "subs", "", null, false, this.n_.dj(), Integer.valueOf(Process.myUid()), true, 3, null);
        if (a != null) {
            Intent a2 = this.f19874c.mo2489a(this.bo.mo1620b(), a);
            if (a2 != null) {
                this.bw.m13376a(a2);
                startActivityForResult(a2, 1);
                return;
            }
        }
        Toast.makeText(m601g(), C7582R.string.generic_error, 1).show();
    }

    public final void mo2342a(int i, int i2, Intent intent) {
        if (i2 == -1) {
            this.f19875f.mo4380a(new C3925c(this), "playpass subscription");
        }
    }

    public final ce getPlayStoreUiElement() {
        return C2482j.m13283a(6520);
    }

    private final void m18598b(int i) {
        this.bw.m13379b(new C2475d(this).m13256a(i));
    }

    final void ao() {
        this.bp.mo3673a(this.ag.c, null, 3, 0, this.k_, (ad) this, this.bw);
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f19876h = (a) obj;
        if (this.f19876h.l) {
            new Handler().post(new C3924b(this));
        } else if (this.f19876h.m) {
            this.bp.mo3717t();
            ao();
            return;
        }
        m_();
    }
}
