package com.google.android.finsky.be;

import android.accounts.Account;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.volley.C0656n;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.am.C1226a;
import com.google.android.finsky.am.C1229c;
import com.google.android.finsky.api.C1228w;
import com.google.android.finsky.bd.C1592a;
import com.google.android.finsky.cv.p177a.ih;
import com.google.android.finsky.cv.p177a.ip;
import com.google.android.finsky.datasync.C2535y;
import com.google.android.finsky.dfemodel.C2726q;
import com.google.android.finsky.externalreferrer.C3012d;
import com.google.android.finsky.p111d.C2473o;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2476e;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2488p;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1052j;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;

public final class C1593a extends C1052j implements C0660x, C1228w {
    public C2535y f8478a;
    public C3012d ag;
    public C0656n ah;
    public ip ai;
    public Uri aj;
    public String ak;
    public String al;
    public boolean am;
    public View an;
    public View ao;
    public boolean ap;
    public ad aq = new C2473o(6380, getParentNode());
    public ad ar = new C2473o(6381, getParentNode());
    public C2473o as = new C2473o(6382, this.aq);
    public C1226a f8479c;
    public C1229c f8480f;
    public final ce f8481h = C2482j.m13283a(18);

    public final void mo1292a(Activity activity) {
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1720a(this);
        super.mo1292a(activity);
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        m6264i(5);
        Bundle bundle2 = this.f760q;
        this.aj = Uri.parse(this.bF);
        this.ag = C1473m.f7980a.mo2025E();
        this.al = this.ag.m15594a(this.aj);
        this.ak = bundle2.getString("DeepLinkShimFragment.referringPackage");
        this.am = bundle2.getBoolean("DeepLinkShimFragment.overrideAccountMissing", false);
        Object string = bundle2.getString("DeepLinkShimFragment.overrideAccount");
        if (TextUtils.isEmpty(string)) {
            C1473m.f7980a.dc();
        } else {
            C1473m.f7980a.mo2242f(string);
        }
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        aa();
    }

    public final boolean an() {
        if (!this.f8479c.m7216a()) {
            return super.an();
        }
        this.bp.mo3646a(this.k_, this.bw);
        return true;
    }

    public final View mo970a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View a = super.mo970a(layoutInflater, viewGroup, bundle);
        if (this.f8479c.m7216a()) {
            boolean z;
            FrameLayout frameLayout = (FrameLayout) a;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(C7582R.id.page_error_indicator);
            frameLayout2.removeAllViews();
            LayoutInflater from = LayoutInflater.from(frameLayout.getContext());
            this.ao = from.inflate(C1592a.f8469r.intValue(), frameLayout2, false);
            frameLayout2.addView(this.ao);
            this.an = from.inflate(C1592a.f8470s.intValue(), frameLayout2, false);
            frameLayout2.addView(this.an);
            this.an.findViewById(C7582R.id.connectivity_icon).setVisibility(0);
            TextView textView = (TextView) this.an.findViewById(C7582R.id.error_title);
            textView.setVisibility(0);
            textView.setText(C7582R.string.deeplink_loading_network_error_title);
            ((TextView) this.an.findViewById(C7582R.id.error_msg)).setText(C7582R.string.deeplink_loading_network_error_body);
            this.an.findViewById(C7582R.id.error_logo).setVisibility(0);
            if (bundle == null || !bundle.getBoolean("notification_requested", false)) {
                z = false;
            } else {
                z = true;
            }
            this.ap = z;
        }
        return a;
    }

    public final void mo138d() {
        super.mo138d();
        ao();
    }

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        if (this.f8479c.m7216a()) {
            bundle.putBoolean("notification_requested", this.ap);
        }
    }

    protected final boolean mo1343X() {
        return true;
    }

    protected final int mo1298Z() {
        return 0;
    }

    protected final void cg_() {
    }

    protected final void aa() {
        mo1294k(1718);
        m9173a(12, null);
        ao();
        if (C1473m.f7980a.dj().mo2294a(12611365)) {
            this.ah = this.f8478a.m13494a(this.bF, this.ak, this, this, this, this.bo, this.bw);
        } else {
            this.ah = this.bo.mo1592a(this.bF, this.ak, (C0660x) this, (C0657w) this, (C1228w) this);
        }
        this.bo.mo1657j(this.bF, new C1594b(this), new C1595c(this));
        au();
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21667d("Error on resolveLink: %s", volleyError);
        m9177a(1104, volleyError);
        if (m603h() == null || !this.f8479c.m7216a() || !C1229c.m7218b(volleyError)) {
            this.bp.mo3646a(this.k_, this.bw);
        } else if (m603h() != null) {
            this.bm.mo1241c(m592c((int) C7582R.string.app_long_name));
            this.bm.mo1236a(0, 0, false);
            this.bm.mo1246z();
            mo1345a(m592c(C1592a.f8472u.intValue()));
            if (this.ap) {
                aj();
            } else if (this.an.getVisibility() == 0) {
                Snackbar.m500a(this.f746R, m592c((int) C7582R.string.deeplink_loading_network_error_snackbar_message), 0).m493a();
            } else {
                this.an.setVisibility(0);
                this.an.findViewById(C1592a.f8471t.intValue()).setOnClickListener(new C1596d(this, m603h().getIntent()));
                this.bw.m13370a(new C2488p().m13345b(this.aq));
            }
        }
    }

    final void m9177a(int i, VolleyError volleyError) {
        this.bw.m13367a(new C2474c(i).m13249d(this.bF).m13238a((Throwable) volleyError).m13251e(this.al).m13210a(1)).m13382d().m13333d();
    }

    public final void ah_() {
        this.bw.m13367a(new C2474c(1104).m13249d(this.bF).m13251e(this.al).m13210a(2)).m13382d().m13333d();
    }

    public final void m_() {
        int i = 0;
        String str = null;
        if (this.n_.dj().mo2294a(12631400) && !this.bp.mo3700d()) {
            this.bv = true;
        } else if (this.ai != null && at()) {
            if (this.f8479c.m7216a()) {
                this.f8480f.m7226a(this.bw, m603h().getIntent());
            }
            this.bp.mo3717t();
            mo1294k(1719);
            byte[] bArr = this.ai.f12674G;
            if (this.ai.f12679b.length() > 0) {
                m9173a(1, bArr);
                this.ag.m15596a(this.al, this.ak, this.ai.f12673F, "deeplink");
                ip ipVar = this.ai;
                if (C1473m.f7980a.dj().mo2294a(12629614)) {
                    ipVar.m12805a(Uri.parse(ipVar.f12679b).buildUpon().appendQueryParameter("nocache_irl", Boolean.toString(true)).build().toString());
                }
                this.bp.mo3665a(this.ai.f12679b, this.ai.f12673F, C1593a.m9172a(this.aj), this.f760q.getString("DeepLinkShimFragment.overrideAccount"), this.bF, this.bw);
            } else if (this.ai.f12680c.length() > 0) {
                m9173a(14, bArr);
                this.ag.m15596a(this.al, this.ak, this.ai.f12673F, "deeplink");
                this.bp.mo3675a(this.ai.f12680c, C1593a.m9172a(this.aj), this.f760q.getString("DeepLinkShimFragment.overrideAccount"), this.bF);
            } else if (this.ai.f12681d.length() > 0) {
                m9173a(2, bArr);
                if (this.ai.bo_()) {
                    i = this.ai.f12677J;
                }
                this.bp.mo3677a(this.ai.f12681d, null, true, -1, i, this.k_, null, this.bw);
            } else if (this.ai.f12682e.length() > 0) {
                int i2;
                m9173a(3, bArr);
                if (this.ai.bo_()) {
                    i2 = this.ai.f12677J;
                } else {
                    i2 = 0;
                }
                this.bp.mo3672a(this.ai.f12682e, this.ai.f12676I, this.ai.f12675H, i2, null, 3, this.bw);
            } else if (this.ai.f12683f.length() > 0) {
                m9173a(8, bArr);
                this.bp.mo3701e();
            } else if (this.ai.f12684g.length() > 0) {
                m9173a(10, bArr);
                this.bp.mo3629a(0, this.bw);
            } else if (this.ai.f12691n != null) {
                FinskyLog.m21659a("Direct purchase deprecated.", new Object[0]);
                ih ihVar = this.ai.f12691n;
                m9173a(4, bArr);
                this.ag.m15597a(this.al, this.ak, this.ai.f12691n.f12655c, "deeplink");
                this.bp.mo3676a(ihVar.f12654b, C1593a.m9172a(this.aj), this.f760q.getString("DeepLinkShimFragment.overrideAccount"), this.bF, this.bw);
            } else if (this.ai.f12693p.length() > 0) {
                m9173a(5, bArr);
                this.bp.mo3649a(this.k_, this.ai.f12693p, this.bw);
            } else if (this.ai.f12692o != null) {
                this.bp.mo3646a(this.k_, this.bw);
                this.bp.mo3669a(this.bo.mo1636c(), this.ai.f12692o, this.bw);
            } else if (this.ai.f12694q != null) {
                m9173a(6, bArr);
                this.bp.mo3646a(this.k_, this.bw);
                this.bp.mo3670a(this.bo.mo1636c(), this.ai.f12694q, this.bw);
            } else if (this.ai.f12695r.length() > 0) {
                m9173a(13, bArr);
                this.bp.mo3645a(this.bw);
            } else if (this.ai.f12685h.length() > 0) {
                m9173a(15, bArr);
                this.bp.mo3629a(4, this.bw);
            } else if (this.ai.f12686i.length() > 0) {
                m9173a(16, bArr);
                this.bp.mo3628a(1, this.ai.f12673F, this.bw, this.bo.mo1636c());
            } else if (this.ai.f12687j.length() > 0) {
                m9173a(17, bArr);
                this.bp.mo3628a(3, this.ai.f12673F, this.bw, this.bo.mo1636c());
            } else if (this.ai.f12688k.length() > 0) {
                m9173a(18, bArr);
                String c = this.bo.mo1636c();
                if (this.f760q.containsKey("DeepLinkShimFragment.overrideAccount") && !TextUtils.isEmpty(this.f760q.getString("DeepLinkShimFragment.overrideAccount"))) {
                    str = this.f760q.getString("DeepLinkShimFragment.overrideAccount");
                } else if (this.ai.f12673F != null) {
                    Account b = C1473m.f7980a.aE().m9995b(C2726q.m14752b(this.ai.f12673F.f11833b));
                    if (b != null) {
                        str = b.name;
                    }
                } else {
                    str = c;
                }
                this.bp.mo3628a(2, this.ai.f12673F, this.bw, str);
            } else if (this.ai.f12689l.length() > 0) {
                m9173a(19, bArr);
                this.bp.mo3667a(this.bo.mo1636c(), this.ai.f12673F, this.am, 0, null, this.bw);
            } else if (this.ai.f12690m.length() > 0) {
                m9173a(28, bArr);
                this.bp.mo3668a(this.bo.mo1636c(), this.ai.f12673F, this.am, this.bw);
            } else if (this.ai.f12698u != null) {
                m9173a(20, bArr);
                this.bp.mo3699d(this.bw);
            } else if (this.ai.f12699v != null) {
                m9173a(21, bArr);
                this.bp.mo3629a(5, this.bw);
            } else if (this.ai.f12700w != null) {
                m9173a(23, bArr);
                this.bp.mo3642a(this.ai.f12700w);
            } else if (!TextUtils.isEmpty(this.ai.f12668A)) {
                m9173a(26, bArr);
                this.bp.mo3689b(C1473m.f7980a.dn(), this.ai.f12668A, this.bw);
            } else if (!TextUtils.isEmpty(this.ai.f12703z)) {
                m9173a(27, bArr);
                this.bp.mo3671a(this.ai.f12703z, this.bw);
            } else if (this.ai.f12702y != null) {
                this.bp.mo3629a(7, this.bw);
            } else if (C1473m.f7980a.dj().mo2294a(12622982) && this.ai.f12697t.length() > 0) {
                m9173a(22, bArr);
                this.bp.mo3644a(this.ai, null, null, -1, this.bw);
            } else if (this.ai.bn_()) {
                m9173a(29, bArr);
                this.bp.mo3650a(C1473m.f7980a.dn(), this.ai.f12672E, false, this.bw);
            } else {
                m9173a(0, bArr);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(this.bF));
                intent.addFlags(268435456);
                intent.putExtra("dont_resolve_again", true);
                C1473m.f7980a.bn().mo2698a(m603h(), intent);
            }
        }
    }

    private static String m9172a(Uri uri) {
        Object queryParameter = uri.getQueryParameter("url");
        return !TextUtils.isEmpty(queryParameter) ? queryParameter : null;
    }

    private final void m9173a(int i, byte[] bArr) {
        C2476e a = new C2476e(i).m13262a(this.bF).m13265c(this.al).m13266d(this.ak).m13263a(bArr);
        if (i == 1 && ((bArr == null || bArr.length == 0) && this.ai.f12673F != null)) {
            a.m13264b(this.ai.f12673F.f11833b);
        }
        this.bw.m13369a(a).m13382d().m13333d();
    }

    final void aj() {
        this.ao.setVisibility(0);
        this.an.setVisibility(8);
        this.bw.m13370a(new C2488p().m13345b(this.ar));
    }

    private final void ao() {
        if (this.ah != null && C1473m.f7980a.dj().mo2294a(12643017)) {
            this.ah.mo1057f();
            this.ah = null;
        }
    }

    public final ce getPlayStoreUiElement() {
        return this.f8481h;
    }

    public final /* synthetic */ void b_(Object obj) {
        ip ipVar = (ip) obj;
        this.ai = ipVar;
        this.bw.m13367a(new C2474c(1104).m13249d(this.bF).m13251e(this.al).m13240a(ipVar.f12674G)).m13382d().m13333d();
        m_();
    }
}
