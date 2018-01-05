package com.google.android.finsky.be;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1406o;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.am.C1226a;
import com.google.android.finsky.am.C1229c;
import com.google.android.finsky.api.DfeServerError;
import com.google.android.finsky.at.C0998m;
import com.google.android.finsky.at.C1507b;
import com.google.android.finsky.at.C1508k;
import com.google.android.finsky.billing.common.C1804v;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.pagesystem.C1037e;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.pagesystem.C1052j;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ba;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.Collection;

public final class C1597e extends C1052j implements C0998m {
    public C1226a f8486a;
    public C1229c f8487c;
    public final ce f8488f = C2482j.m13283a(0);
    public C2719i f8489h;

    public static C1597e m9185a(String str, String str2, String str3, String str4, String str5, C2495w c2495w) {
        C1045b c1597e = new C1597e();
        c1597e.m6259c(str3);
        c1597e.m6319a(C1473m.f7980a.dn(), str);
        c1597e.m6258b("finsky.DetailsFragment.continueUrl", str2);
        c1597e.m6258b("finsky.DetailsFragment.overrideAccount", str3);
        c1597e.m6258b("finsky.DetailsShimFragment.originalUrl", str4);
        c1597e.m6258b("finsky.DetailsShimFragment.docid", str5);
        c1597e.mo2580a(c2495w);
        return c1597e;
    }

    public final void mo1292a(Activity activity) {
        ((C1406o) C3947d.m18649a(C1406o.class)).mo1721a(this);
        super.mo1292a(activity);
    }

    public final void mo139d(Bundle bundle) {
        super.mo139d(bundle);
        aa();
    }

    public final void mo138d() {
        super.mo138d();
        if (this.f8489h != null) {
            this.f8489h.m11922b((C1031w) this);
            this.f8489h.m11921b((C0657w) this);
        }
    }

    protected final int mo1298Z() {
        return 0;
    }

    protected final void cg_() {
    }

    protected final void aa() {
        if (this.f8489h != null) {
            this.f8489h.m11922b((C1031w) this);
            this.f8489h.m11921b((C0657w) this);
        }
        C1473m.f7980a.ab();
        Collection b = C1804v.m9805b(C1473m.f7980a.ah().mo2811a(this.bo.mo1620b()));
        this.f8489h = new C2719i(this.bo, this.bF, false, this.f760q.getString("finsky.DetailsShimFragment.docid"), b);
        this.f8489h.m11918a((C1031w) this);
        this.f8489h.m11917a((C0657w) this);
        this.bs.m16127a(3, null);
        au();
    }

    public final void m_() {
        if (!this.bp.mo3700d()) {
            this.bv = this.n_.dj().mo2294a(12631400);
        } else if (this.f8489h.m14722b() == null) {
            C1507b.m8844a(this.f730B, this, null, this.bn.getString(C7582R.string.details_page_error), this.bw, 10);
        } else {
            if (this.f8486a.m7216a()) {
                this.f8487c.m7227a(this.f8489h.m14722b().f14885a.f12097d);
            }
            this.bp.mo3659a(this.f8489h.m14722b(), this.bF, this.f760q.getString("finsky.DetailsFragment.continueUrl"), this.f760q.getString("finsky.DetailsFragment.overrideAccount"), this.f760q.getString("finsky.DetailsShimFragment.originalUrl") != null, this.bw);
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        super.mo1062a(volleyError);
        if ((volleyError instanceof DfeServerError) && C1473m.f7980a.mo2035O().m8839b()) {
            CharSequence a = ba.m21789a("finsky.sw_home_url");
            CharSequence authority = Uri.parse(Uri.decode(this.f760q.getString("finsky.DetailsShimFragment.originalUrl"))).getAuthority();
            if (!TextUtils.isEmpty(a) && TextUtils.equals(authority, "play.google.com")) {
                C1508k c1508k = new C1508k();
                c1508k.m8848a((int) C7582R.string.app_unavailable_message).m8860d((int) C7582R.string.yes).m8862e((int) C7582R.string.no).m8853a(true).m8851a(this, 1, null);
                c1508k.mo2272a().m625a(this.f730B, "DetailsShimFragment.errorDialog");
            }
        }
    }

    public final void mo1202a(int i, Bundle bundle) {
        if (i == 1) {
            this.bp.mo3662a(ba.m21789a("finsky.sw_home_url"));
        }
    }

    public final void f_(int i) {
        if (i == 10 && m603h() != null) {
            if (m603h() instanceof C1037e) {
                ((C1037e) m603h()).mo1244m();
            } else {
                FinskyLog.m21669e("Dialog not hosted by PageFragmentHost. Cannot navigate back.", new Object[0]);
            }
        }
    }

    public final void mo1211b(int i, Bundle bundle) {
    }

    public final ce getPlayStoreUiElement() {
        return this.f8488f;
    }
}
