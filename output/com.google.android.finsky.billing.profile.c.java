package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.p;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.api.c;
import com.google.android.finsky.at.k;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.bg.l;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.billing.common.m;
import com.google.android.finsky.billing.common.q;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.cv.a.bd;
import com.google.android.finsky.d.ad;
import com.google.android.finsky.d.j;
import com.google.android.finsky.d.p;
import com.google.android.finsky.d.w;
import com.google.android.finsky.frameworkviews.SeparatorLinearLayout;
import com.google.android.finsky.providers.d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.ak;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.google.wireless.android.finsky.dfe.nano.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class com.google.android.finsky.billing.profile.c extends com.google.android.finsky.billing.profile.a implements com.google.android.finsky.at.m
{

    public com.google.android.finsky.ba.c aj;
    public com.google.android.finsky.bg.l ak;
    public com.google.android.finsky.billing.common.m al;
    public com.google.android.finsky.billing.common.q am;
    public final com.google.wireless.android.a.a.a.a.ce an;
    public final ArrayList ao;
    public ViewGroup ap;
    public ViewGroup aq;
    public TextView ar;
    public View as;
    public TextView at;
    public com.google.wireless.android.finsky.dfe.nano.u au;
    public boolean av;
    public boolean aw;
    public boolean ax;

    c() {
        com.google.android.finsky.billing.profile.a();
        this.an = com.google.android.finsky.d.j.a(this.af());
        this.ao = new ArrayList();
        this.ax = 1;
    }

    public static Bundle a(Account p0, String p1, com.google.android.finsky.cv.a.ax p2, int p3, int p4, int p5, com.google.wireless.android.finsky.dfe.nano.u p6, PurchaseFlowConfig p7, boolean p8) {
        v1 = new Bundle();
        v1.putParcelable("BillingProfileFragment.account", p0);
        v1.putString("BillingProfileFragment.purchaseContextToken", p1);
        v1.putParcelable("BillingProfileFragment.docid", ParcelableProto.a(p2));
        v1.putInt("BillingProfileFragment.instrumentRank", p3);
        v1.putInt("BillingProfileFragment.offerType", p4);
        v1.putInt("BillingProfileFragment.redemptionContext", p5);
        if (p2 != 0)
            v0 = p2.d;
        else
            v0 = 0;
        v1.putInt("BillingProfileFragment.backendId", v0);
        v1.putParcelable("BillingProfileFragment.prefetchedBillingProfile", ParcelableProto.a(p6));
        v1.putBoolean("BillingProfileFragment.usingCachedBillingProfile", p8);
        com.google.android.finsky.billing.common.m.a(v1, p7);
        return v1;
    }

    public static com.google.android.finsky.billing.profile.c a(Account p0, String p1, com.google.android.finsky.cv.a.ax p2, int p3, int p4, com.google.wireless.android.finsky.dfe.nano.u p5, PurchaseFlowConfig p6, com.google.android.finsky.d.w p7, boolean p8) {
        v1 = com.google.android.finsky.billing.profile.c.a(p0, p1, p2, 0, p3, p4, p5, p6, p8);
        p7.a(p0).a(v1);
        v2 = new com.google.android.finsky.billing.profile.c();
        v2.f(v1);
        return v2;
    }

    private final void a(ViewGroup p0, com.google.android.finsky.billing.profile.w p1, boolean p2, String p3, byte[] p4) {
        v0 = LayoutInflater.from(p0.getContext());
        if (p3 == 0) {
            v0 = v0.inflate(2130968652, p0, 0);
            v0.setOnClickListener(p1.f);
            v2 = v0;
        }
        else {
            v1 = v0.inflate(2130968651, p0, 0);
            v0 = (TextView)v1.findViewById(2131755308);
            if (!TextUtils.isEmpty(p3)) {
                v0.setText(p3);
                v0.setVisibility(0);
            }
            v2 = v1;
        }
        if (p2 != 0)
            v2.findViewById(2131755389).setVisibility(0);
        v0 = (TextView)v2.findViewById(2131755114);
        v0.setText(p1.a);
        v1 = (TextView)v2.findViewById(2131755307);
        if (!TextUtils.isEmpty(p1.b)) {
            v1.setText(p1.b);
            v1.setVisibility(0);
        }
        v1 = (FifeImageView)v2.findViewById(2131755305);
        if (p1.c == 0)
            v1.setVisibility(8);
        else
            this.ak.a(v1, p1.c.f, p1.c.i);
        p0.addView(v2);
        this.ao.add(new com.google.android.finsky.billing.profile.d(this, p1));
        if (!TextUtils.isEmpty(p1.d) && p1.e != 0 && p1.e.length > 0) {
            v1 = (TextView)v2.findViewById(2131755309);
            v1.setText(p1.d.toUpperCase());
            v2.setOnClickListener(new com.google.android.finsky.billing.profile.e(this, p1, p4));
            v1.setVisibility(0);
        }
        this.a(v0);
    }

    private final void a(TextView p0) {
        this.al.a("PROFILE_OPTION", p0, this.al.a(com.google.android.finsky.billing.common.m.a(this.q)));
    }

    private final void a(String p0, int p1) {
        this.Y();
        v0 = new com.google.android.finsky.at.k();
        v0.b(p0).d(2131952688).a(this, p1, 0);
        v0.a().a(this.B, "BillingProfileFragment.errorDialog");
    }

    private final void ag() {
        v0 = this.ah();
        if (v0 != 0)
            v0.k();
    }

    private final com.google.android.finsky.billing.profile.j ah() {
        if (this.h() instanceof com.google.android.finsky.billing.profile.j)
            v0 = (com.google.android.finsky.billing.profile.j)this.h();
        else {
            FinskyLog.e("No listener registered.", new Object[0]);
            v0 = 0;
        }
        return v0;
    }

    static int b(int p0) {
        v0 = 0;
        switch (p0) {
            case 3:
                v0 = 815;
                break;
            case 4:
                v0 = 816;
                break;
            case 5:
                v2 = new Object[1];
                v2[0] = Integer.valueOf(p0);
                FinskyLog.e("Invalid UiElementType for option type %d", v2);
                break;
            case 6:
                v0 = 817;
                break;
            default:
                v2 = new Object[1];
                v2[0] = Integer.valueOf(p0);
                FinskyLog.e("Invalid UiElementType for option type %d", v2);
                break;
        }
        return v0;
    }

    protected final void W() {
        this.af.a(new com.google.android.finsky.d.p().b(this).a(213));
    }

    protected final void X() {
        switch (this.e.af) {
            case 3:
                this.a(this.c(2131951796), 2);
                break;
            default:
                super.X();
                break;
        }
    }

    protected final void Y() {
        if (this.aw != 0) {
            if (this.ax != 0) {
                this.ax = 0;
                this.aa();
                this.ar.setVisibility(8);
                this.as.setVisibility(8);
                this.b(this.au.i);
                v2 = 0;
                while (v2 < this.au.d.length) {
                    v9 = LayoutInflater.from(this.aq.getContext()).inflate(2130968652, this.aq, 0);
                    v9.setOnClickListener(new com.google.android.finsky.billing.profile.h(this, v9, this.au.d[v2]));
                    v0 = (TextView)v9.findViewById(2131755114);
                    v0.setText(this.au.d[v2].e);
                    v1 = (FifeImageView)v9.findViewById(2131755305);
                    if (this.au.d[v2].f == 0)
                        v1.setVisibility(8);
                    else
                        this.ak.a(v1, this.au.d[v2].f.f, this.au.d[v2].f.i);
                    this.aq.addView(v9);
                    this.ao.add(new com.google.android.finsky.billing.profile.i(this, this.au.d[v2]));
                    this.a(v0);
                    v2 = v2 + 1;
                }
                if (this.aq.getChildCount() > 0)
                    ((SeparatorLinearLayout)this.aq.getChildAt(this.aq.getChildCount() - 1)).a();
                this.ah.setVisibility(8);
                this.ag.setVisibility(0);
                this.ag.requestFocus();
                this.Z();
            }
        }
        else
            super.Y();
    }

    protected final void Z() {
        this.af.a(new com.google.android.finsky.d.p().b(this).a(801));
        v2 = 0;
        while (v2 < ((ArrayList)this.ao).size()) {
            v1 = ((ArrayList)this.ao).get(v2);
            v2 = v2 + 1;
            ((Runnable)v1).run();
        }
    }

    public final View a(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        v0 = (ViewGroup)p0.inflate(2130968649, p1, 0);
        this.ap = (ViewGroup)v0.findViewById(2131755384);
        this.aq = (ViewGroup)v0.findViewById(2131755387);
        this.ah = v0.findViewById(2131755388);
        this.ag = v0.findViewById(2131755383);
        this.ar = (TextView)v0.findViewById(2131755385);
        this.ar.setText(this.c(2131951769).toUpperCase());
        this.as = v0.findViewById(2131755386);
        this.at = (TextView)v0.findViewById(2131755312);
        return v0;
    }

    protected final com.google.android.finsky.billing.profile.w a(com.google.wireless.android.finsky.dfe.nano.v p0) {
        return new com.google.android.finsky.billing.profile.w(p0, new com.google.android.finsky.billing.profile.f(this, p0), 809);
    }

    public final void a(int p0, Bundle p1) {
        if (p0 == 1)
            this.ag();
        else if (p0 == 2) {
            this.aw = 0;
            this.Y();
        }
    }

    public void a(Activity p0) {
        ((com.google.android.finsky.billing.profile.l)com.google.android.finsky.providers.d.a(com.google.android.finsky.billing.profile.l)).a(this);
        super.a(p0);
    }

    protected final void a(RedeemCodeResult p0) {
        v0 = this.ah();
        if (v0 != 0)
            v0.a(p0);
    }

    protected final void a(String p0) {
        this.a(p0, 1);
    }

    protected final void a(String p0, byte[] p1) {
        this.b(p0, p1);
    }

    protected final void a(List p0) {
        if (p0.isEmpty()) {
            this.ar.setVisibility(8);
            this.as.setVisibility(8);
        }
        v6 = p0.iterator();
        while (v6.hasNext())
            this.a(this.aq, (com.google.android.finsky.billing.profile.w)v6.next(), 0, 0, 0);
        if (this.aq.getChildCount() > 0)
            ((SeparatorLinearLayout)this.aq.getChildAt(this.aq.getChildCount() - 1)).a();
    }

    protected final void a(ao[] p0, byte[] p1) {
        if (p0.length == 0) {
            this.ar.setVisibility(8);
            this.as.setVisibility(8);
        }
        else {
            this.ar.setVisibility(0);
            this.as.setVisibility(0);
        }
        v10 = 0;
        while (v10 < p0.length) {
            if (p0[v10].r.length > 0)
                v9 = p0[v10].r[0].d;
            else
                v9 = 0;
            this.a(this.ap, new com.google.android.finsky.billing.profile.w(p0[v10].d, p0[v10].x, p0[v10].e, p0[v10].u, p0[v10].t, new com.google.android.finsky.billing.profile.g(this, p0[v10], p0[v10].c), p0[v10].v, 818), p0[v10].c.equals(this.f.c), v9, p1);
            v10 = v10 + 1;
        }
        if (this.ap.getChildCount() > 0)
            ((SeparatorLinearLayout)this.ap.getChildAt(this.ap.getChildCount() - 1)).a();
    }

    protected final void aa() {
        this.ap.removeAllViews();
        this.aq.removeAllViews();
        this.ao.clear();
    }

    protected final Intent ac() {
        if (this.aj.j(this.g.name).a(12619928))
            v5 = com.google.android.finsky.billing.common.m.a(this.q);
        else
            v5 = PurchaseFlowConfig.a;
        return this.am.a(this.g.name, this.q.getInt("BillingProfileFragment.redemptionContext"), (com.google.android.finsky.cv.a.ax)ParcelableProto.a(this.q, "BillingProfileFragment.docid"), this.q.getInt("BillingProfileFragment.offerType"), v5, this.af);
    }

    public int ad() {
        return 1;
    }

    public void ae() {
        if (this.aw != 0) {
            this.e.a(this.e.W(), 0, 0);
            this.af.a(this.e.a(343));
            this.e.at.a(this.e.ai, this.e.ao, new com.google.android.finsky.billing.profile.s(this.e, this.af, 7, 8), new com.google.android.finsky.billing.profile.r(this.e, this.af, 8));
        }
        else
            super.ae();
    }

    public int af() {
        return 800;
    }

    public final void b(int p0, Bundle p1) {
        if (p0 == 1)
            this.ag();
    }

    public final void b(Bundle p0) {
        super.b(p0);
        this.au = (com.google.wireless.android.finsky.dfe.nano.u)ParcelableProto.a(this.q, "BillingProfileFragment.prefetchedBillingProfile");
        this.av = this.q.getBoolean("BillingProfileFragment.usingCachedBillingProfile");
        this.h = this.q.getInt("BillingProfileFragment.backendId");
        if (p0 == 0) {
            this.af.a(new com.google.android.finsky.d.p().b(this));
            this.aw = this.av;
        }
        else
            this.aw = p0.getBoolean("BillingProfileFragment.usingCachedBillingProfile");
    }

    protected final void b(String p0) {
        if (!TextUtils.isEmpty(p0)) {
            com.google.android.finsky.bg.ae.a(this.at, p0);
            this.at.setVisibility(0);
        }
        else if (this.av != 0) {
            com.google.android.finsky.bg.ae.a(this.at, this.c(2131951797));
            this.at.setVisibility(0);
        }
    }

    final void b(String p0, byte[] p1) {
        v0 = this.ah();
        if (v0 != 0)
            v0.a(p0, p1);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putBoolean("BillingProfileFragment.usingCachedBillingProfile", this.aw);
    }

    public final void f_(int p0) {
    }

    public com.google.android.finsky.d.ad getParentNode() {
        return 0;
    }

    public com.google.wireless.android.a.a.a.a.ce getPlayStoreUiElement() {
        return this.an;
    }

    public final void w() {
        if (this.af != 0)
            this.af.a(new com.google.android.finsky.d.p().b(this).a(603));
        super.w();
    }

}
