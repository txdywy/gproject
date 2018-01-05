package com.google.android.finsky.detailspage;

import android.content.Context;
import android.support.v7.widget.eo;
import android.support.v7.widget.ff;
import android.text.TextUtils;
import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.by.C2206c;
import com.google.android.finsky.detailsmodules.p183a.C2599c;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2711x;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.DfeToc;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.navigationmanager.C3748a;
import com.google.android.finsky.p111d.C2482j;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.p111d.ad;
import com.google.android.finsky.pagesystem.C1045b;
import com.google.android.finsky.stream.base.C4279n;
import com.google.android.finsky.stream.base.C4292r;
import com.google.android.finsky.stream.p248a.C4234b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.ac;
import com.google.android.play.image.C1294w;
import com.google.wireless.android.a.a.a.a.ce;
import com.squareup.leakcanary.C7582R;
import java.util.ArrayList;
import java.util.List;

public abstract class C2637r extends ck implements ad, co, C1031w {
    public ce f14382d = C2482j.m13283a(408);
    public C4279n f14383e;
    public C4234b f14384f;
    public eo f14385g;
    public List f14386h = new ArrayList();
    public int f14387i;

    public C2637r() {
        C1473m.f7980a.aO();
    }

    protected abstract String mo3066a();

    public final void mo3029a(Context context, C2599c c2599c, DfeToc dfeToc, C1254c c1254c, C1254c c1254c2, C1294w c1294w, C3748a c3748a, C1045b c1045b, String str, String str2, C2206c c2206c, boolean z, String str3, boolean z2, ff ffVar, ad adVar, C2495w c2495w) {
        super.mo3029a(context, c2599c, dfeToc, c1254c, c1254c2, c1294w, c3748a, c1045b, str, str2, c2206c, z, str3, z2, ffVar, adVar, c2495w);
        this.f14387i = this.t.getResources().getDimensionPixelSize(C7582R.dimen.flat_cluster_to_cluster_bottom_margin);
    }

    public final boolean mo2979f() {
        if (this.b == null || this.f14383e == null || this.f14383e.mo1039a() == 0) {
            return false;
        }
        return true;
    }

    public final int mo2978e() {
        if (this.f14383e != null) {
            return this.f14383e.mo1039a();
        }
        return 0;
    }

    public final int mo2977c(int i) {
        return this.f14383e.mo1040a(i);
    }

    public final void mo2976b(View view, int i) {
        C4292r c4292r;
        for (int i2 = 0; i2 < this.f14386h.size(); i2++) {
            c4292r = (C4292r) this.f14386h.get(i2);
            if (c4292r.a == view) {
                this.f14383e.m19851a(c4292r, i);
                return;
            }
        }
        c4292r = new C4292r(view);
        this.f14386h.add(c4292r);
        this.f14383e.m19851a(c4292r, i);
    }

    public final void mo3037c(View view, int i) {
        for (int i2 = 0; i2 < this.f14386h.size(); i2++) {
            C4292r c4292r = (C4292r) this.f14386h.get(i2);
            if (c4292r.a == view) {
                this.f14383e.m19850a(c4292r);
                this.f14386h.remove(c4292r);
                return;
            }
        }
        FinskyLog.m21669e("Recycled view more than one time", new Object[0]);
    }

    public void mo2980h() {
        if (this.f14383e != null) {
            if (((C2672t) this.b).f14754b == null) {
                ((C2672t) this.b).f14754b = new ac();
            }
            this.f14383e.m19859b(((C2672t) this.b).f14754b);
        }
        if (this.f14384f != null) {
            this.f14384f.m19660d();
            this.f14384f = null;
        }
        if (this.b != null) {
            if (((C2672t) this.b).f14753a != null) {
                ((C2672t) this.b).f14753a.m11922b((C1031w) this);
            }
            C2711x.m14674a(((C2672t) this.b).f14753a);
        }
    }

    protected final void m14094b() {
        if (!TextUtils.isEmpty(mo3066a()) && this.b == null) {
            this.b = new C2672t();
            ((C2672t) this.b).f14753a = C2721l.m14731a(this.x, mo3066a());
            ((C2672t) this.b).f14753a.f14930f = true;
            ((C2672t) this.b).f14753a.m11918a((C1031w) this);
            m14088c();
        }
    }

    private final void m14088c() {
        if (this.f14383e == null) {
            this.f14383e = new C4279n(true);
            this.f14385g = new C2662s(this, this);
            this.f14383e.mo5196a(this.f14385g);
            this.f14384f = C1473m.f7980a.co().m19665a(C2721l.m14735a(((C2672t) this.b).f14753a), this.f14383e, null, this.t, this.z, this, this.J, 2, null, null, null, false, null, true, false, null, null, true);
        }
    }

    final void m14098d() {
        Document document = ((C2672t) this.b).f14753a.f14908a;
        if (document != null && document.f14885a.f12087D != null) {
            C2482j.m13285a(this.f14382d, document.f14885a.f12087D);
        }
    }

    public void m_() {
    }

    public ce getPlayStoreUiElement() {
        return this.f14382d;
    }

    public ad getParentNode() {
        return this.I;
    }

    public final void mo1219a(ad adVar) {
        C2482j.m13291a((ad) this, adVar);
    }

    public final int mo3053a(int i, int i2) {
        return i == 0 ? this.f14387i : 0;
    }

    public final int mo3054i() {
        return 0;
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((C2672t) c2600d);
        if (this.b != null) {
            m14098d();
            m14088c();
            this.f14383e.m19845a(((C2672t) this.b).f14754b);
        }
    }
}
