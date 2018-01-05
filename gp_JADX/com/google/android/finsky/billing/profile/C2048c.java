package com.google.android.finsky.billing.profile;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.ba.C1461c;
import com.google.android.finsky.bg.C1612l;
import com.google.android.finsky.bg.ae;
import com.google.android.finsky.billing.common.C1797m;
import com.google.android.finsky.billing.common.C1801q;
import com.google.android.finsky.billing.common.PurchaseFlowConfig;
import com.google.android.finsky.billing.common.RedeemCodeResult;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.cv.p177a.bd;
import com.google.android.finsky.frameworkviews.SeparatorLinearLayout;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.android.play.image.FifeImageView;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.a.a.a.a.ce;
import com.google.wireless.android.finsky.a.a.ao;
import com.google.wireless.android.finsky.dfe.nano.u;
import com.google.wireless.android.finsky.dfe.nano.v;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public class C2048c extends C2046a implements C0998m {
    public C1461c aj;
    public C1612l ak;
    public C1797m al;
    public C1801q am;
    public final ce an = C2482j.m13283a(af());
    public final ArrayList ao = new ArrayList();
    public ViewGroup ap;
    public ViewGroup aq;
    public TextView ar;
    public View as;
    public TextView at;
    public u au;
    public boolean av;
    public boolean aw;
    public boolean ax = true;

    public static C2048c m10782a(Account account, String str, ax axVar, int i, int i2, u uVar, PurchaseFlowConfig purchaseFlowConfig, C2495w c2495w, boolean z) {
        Bundle a = C2048c.m10781a(account, str, axVar, 0, i, i2, uVar, purchaseFlowConfig, z);
        c2495w.m13366a(account).m13377a(a);
        Fragment c2048c = new C2048c();
        c2048c.m600f(a);
        return c2048c;
    }

    public static Bundle m10781a(Account account, String str, ax axVar, int i, int i2, int i3, u uVar, PurchaseFlowConfig purchaseFlowConfig, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("BillingProfileFragment.account", account);
        bundle.putString("BillingProfileFragment.purchaseContextToken", str);
        bundle.putParcelable("BillingProfileFragment.docid", ParcelableProto.m21671a((C0757i) axVar));
        bundle.putInt("BillingProfileFragment.instrumentRank", i);
        bundle.putInt("BillingProfileFragment.offerType", i2);
        bundle.putInt("BillingProfileFragment.redemptionContext", i3);
        bundle.putInt("BillingProfileFragment.backendId", axVar != null ? axVar.f11835d : 0);
        bundle.putParcelable("BillingProfileFragment.prefetchedBillingProfile", ParcelableProto.m21671a((C0757i) uVar));
        bundle.putBoolean("BillingProfileFragment.usingCachedBillingProfile", z);
        C1797m.m9777a(bundle, purchaseFlowConfig);
        return bundle;
    }

    public void mo1292a(Activity activity) {
        ((C1358l) C3947d.m18649a(C1358l.class)).mo1771a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        this.au = (u) ParcelableProto.m21673a(this.f760q, "BillingProfileFragment.prefetchedBillingProfile");
        this.av = this.f760q.getBoolean("BillingProfileFragment.usingCachedBillingProfile");
        this.h = this.f760q.getInt("BillingProfileFragment.backendId");
        if (bundle == null) {
            this.af.m13370a(new C2488p().m13345b(this));
            this.aw = this.av;
            return;
        }
        this.aw = bundle.getBoolean("BillingProfileFragment.usingCachedBillingProfile");
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C7582R.layout.billing_profile, viewGroup, false);
        this.ap = (ViewGroup) viewGroup2.findViewById(C7582R.id.existing_instruments);
        this.aq = (ViewGroup) viewGroup2.findViewById(C7582R.id.actions);
        this.ah = viewGroup2.findViewById(C7582R.id.loading_indicator);
        this.ag = viewGroup2.findViewById(C7582R.id.profile);
        this.ar = (TextView) viewGroup2.findViewById(C7582R.id.actions_header);
        this.ar.setText(m592c((int) C7582R.string.billing_profile_other_options).toUpperCase());
        this.as = viewGroup2.findViewById(C7582R.id.actions_header_separator);
        this.at = (TextView) viewGroup2.findViewById(C7582R.id.description);
        return viewGroup2;
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putBoolean("BillingProfileFragment.usingCachedBillingProfile", this.aw);
    }

    public final void mo1346w() {
        if (this.af != null) {
            this.af.m13370a(new C2488p().m13345b(this).m13340a(603));
        }
        super.mo1346w();
    }

    private final void m10783a(ViewGroup viewGroup, C2066w c2066w, boolean z, String str, byte[] bArr) {
        View view;
        TextView textView;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (str == null) {
            View inflate = from.inflate(C7582R.layout.billing_profile_entry, viewGroup, false);
            inflate.setOnClickListener(c2066w.f10598f);
            view = inflate;
        } else {
            View inflate2 = from.inflate(C7582R.layout.billing_profile_disabled_entry, viewGroup, false);
            textView = (TextView) inflate2.findViewById(C7582R.id.byline);
            if (!TextUtils.isEmpty(str)) {
                textView.setText(str);
                textView.setVisibility(0);
            }
            view = inflate2;
        }
        if (z) {
            view.findViewById(C7582R.id.checkmark).setVisibility(0);
        }
        textView = (TextView) view.findViewById(C7582R.id.title);
        textView.setText(c2066w.f10593a);
        TextView textView2 = (TextView) view.findViewById(C7582R.id.subtitle);
        if (!TextUtils.isEmpty(c2066w.f10594b)) {
            textView2.setText(c2066w.f10594b);
            textView2.setVisibility(0);
        }
        FifeImageView fifeImageView = (FifeImageView) view.findViewById(C7582R.id.image_icon);
        bd bdVar = c2066w.f10595c;
        if (bdVar == null) {
            fifeImageView.setVisibility(8);
        } else {
            this.ak.m9288a(fifeImageView, bdVar.f11860f, bdVar.f11863i);
        }
        viewGroup.addView(view);
        this.ao.add(new C2049d(this, c2066w));
        if (!(TextUtils.isEmpty(c2066w.f10596d) || c2066w.f10597e == null || c2066w.f10597e.length <= 0)) {
            textView2 = (TextView) view.findViewById(C7582R.id.edit_button);
            textView2.setText(c2066w.f10596d.toUpperCase());
            view.setOnClickListener(new C2050e(this, c2066w, bArr));
            textView2.setVisibility(0);
        }
        m10784a(textView);
    }

    protected final void mo2610b(String str) {
        if (!TextUtils.isEmpty(str)) {
            ae.m9217a(this.at, str);
            this.at.setVisibility(0);
        } else if (this.av) {
            ae.m9217a(this.at, m592c((int) C7582R.string.cached_fop_options_description_html));
            this.at.setVisibility(0);
        }
    }

    protected final void aa() {
        this.ap.removeAllViews();
        this.aq.removeAllViews();
        this.ao.clear();
    }

    protected final C2066w mo2600a(v vVar) {
        return new C2066w(vVar, new C2051f(this, vVar), 809);
    }

    protected final void mo2604a(List list) {
        if (list.isEmpty()) {
            this.ar.setVisibility(8);
            this.as.setVisibility(8);
        }
        for (C2066w a : list) {
            m10783a(this.aq, a, false, null, null);
        }
        if (this.aq.getChildCount() > 0) {
            ((SeparatorLinearLayout) this.aq.getChildAt(this.aq.getChildCount() - 1)).m10858a();
        }
    }

    protected final void mo2605a(ao[] aoVarArr, byte[] bArr) {
        if (aoVarArr.length == 0) {
            this.ar.setVisibility(8);
            this.as.setVisibility(8);
        } else {
            this.ar.setVisibility(0);
            this.as.setVisibility(0);
        }
        String str = this.f.c;
        for (ao aoVar : aoVarArr) {
            String str2;
            if (aoVar.r.length > 0) {
                str2 = aoVar.r[0].d;
            } else {
                str2 = null;
            }
            String str3 = aoVar.c;
            m10783a(this.ap, new C2066w(aoVar.d, aoVar.x, aoVar.e, aoVar.u, aoVar.t, new C2052g(this, aoVar, str3), aoVar.v, 818), str3.equals(str), str2, bArr);
        }
        if (this.ap.getChildCount() > 0) {
            ((SeparatorLinearLayout) this.ap.getChildAt(this.ap.getChildCount() - 1)).m10858a();
        }
    }

    protected final void mo2598Y() {
        if (!this.aw) {
            super.mo2598Y();
        } else if (this.ax) {
            this.ax = false;
            aa();
            this.ar.setVisibility(8);
            this.as.setVisibility(8);
            mo2610b(this.au.i);
            LayoutInflater from = LayoutInflater.from(this.aq.getContext());
            for (v vVar : this.au.d) {
                ViewGroup viewGroup = this.aq;
                View inflate = from.inflate(C7582R.layout.billing_profile_entry, viewGroup, false);
                inflate.setOnClickListener(new C2053h(this, inflate, vVar));
                TextView textView = (TextView) inflate.findViewById(C7582R.id.title);
                textView.setText(vVar.e);
                FifeImageView fifeImageView = (FifeImageView) inflate.findViewById(C7582R.id.image_icon);
                bd bdVar = vVar.f;
                if (bdVar == null) {
                    fifeImageView.setVisibility(8);
                } else {
                    this.ak.m9288a(fifeImageView, bdVar.f11860f, bdVar.f11863i);
                }
                viewGroup.addView(inflate);
                this.ao.add(new C2054i(this, vVar));
                m10784a(textView);
            }
            if (this.aq.getChildCount() > 0) {
                ((SeparatorLinearLayout) this.aq.getChildAt(this.aq.getChildCount() - 1)).m10858a();
            }
            this.ah.setVisibility(8);
            this.ag.setVisibility(0);
            this.ag.requestFocus();
            mo2599Z();
        }
    }

    static int m10786b(int i) {
        switch (i) {
            case 3:
                return 815;
            case 4:
                return 816;
            case 6:
                return 817;
            default:
                FinskyLog.m21669e("Invalid UiElementType for option type %d", Integer.valueOf(i));
                return 0;
        }
    }

    protected final void mo2603a(String str, byte[] bArr) {
        m10803b(str, bArr);
    }

    protected final void mo2601a(RedeemCodeResult redeemCodeResult) {
        C2045j ah = ah();
        if (ah != null) {
            ah.mo2594a(redeemCodeResult);
        }
    }

    protected final void mo2602a(String str) {
        m10785a(str, 1);
    }

    private final void m10785a(String str, int i) {
        mo2598Y();
        C1508k c1508k = new C1508k();
        c1508k.m8856b(str).m8860d((int) C7582R.string.ok).m8851a(this, i, null);
        c1508k.mo2272a().m625a(this.f730B, "BillingProfileFragment.errorDialog");
    }

    final void m10803b(String str, byte[] bArr) {
        C2045j ah = ah();
        if (ah != null) {
            ah.mo2595a(str, bArr);
        }
    }

    private final void ag() {
        C2045j ah = ah();
        if (ah != null) {
            ah.mo2596k();
        }
    }

    private final C2045j ah() {
        if (m603h() instanceof C2045j) {
            return (C2045j) m603h();
        }
        FinskyLog.m21669e("No listener registered.", new Object[0]);
        return null;
    }

    public int af() {
        return 800;
    }

    protected final Intent ac() {
        PurchaseFlowConfig a;
        Bundle bundle = this.f760q;
        int i = bundle.getInt("BillingProfileFragment.redemptionContext");
        ax axVar = (ax) ParcelableProto.m21673a(bundle, "BillingProfileFragment.docid");
        int i2 = bundle.getInt("BillingProfileFragment.offerType");
        if (this.aj.mo2249j(this.g.name).mo2294a(12619928)) {
            a = C1797m.m9774a(this.f760q);
        } else {
            a = PurchaseFlowConfig.f9283a;
        }
        return this.am.mo2636a(this.g.name, i, axVar, i2, a, this.af);
    }

    public int ad() {
        return 1;
    }

    protected final void mo968W() {
        this.af.m13370a(new C2488p().m13345b(this).m13340a(213));
    }

    protected final void mo2599Z() {
        this.af.m13370a(new C2488p().m13345b(this).m13340a(801));
        ArrayList arrayList = this.ao;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((Runnable) obj).run();
        }
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (i == 1) {
            ag();
        } else if (i == 2) {
            this.aw = false;
            mo2598Y();
        }
    }

    public final void f_(int i) {
    }

    public final void mo1211b(int i, Bundle bundle) {
        if (i == 1) {
            ag();
        }
    }

    private final void m10784a(TextView textView) {
        this.al.m9784a("PROFILE_OPTION", textView, this.al.m9781a(C1797m.m9774a(this.f760q)));
    }

    public void ae() {
        if (this.aw) {
            C2056m c2056m = this.e;
            C2495w c2495w = this.af;
            c2056m.m10815a(c2056m.mo968W(), null, 0);
            c2495w.m13367a(c2056m.m10811a(343));
            c2056m.at.mo1595a(c2056m.ai, c2056m.ao, new C2062s(c2056m, c2495w, 7, 8), new C2061r(c2056m, c2495w, 8));
            return;
        }
        super.ae();
    }

    protected final void mo2597X() {
        switch (this.e.af) {
            case 3:
                m10785a(m592c((int) C7582R.string.cached_fop_options_cannot_be_added), 2);
                return;
            default:
                super.mo2597X();
                return;
        }
    }

    public ce getPlayStoreUiElement() {
        return this.an;
    }

    public ad getParentNode() {
        return null;
    }
}
