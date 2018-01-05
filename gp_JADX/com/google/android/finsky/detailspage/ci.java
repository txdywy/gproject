package com.google.android.finsky.detailspage;

import android.view.View;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.aa.C0954a;
import com.google.android.finsky.bb.C1557b;
import com.google.android.finsky.bb.C1565a;
import com.google.android.finsky.bb.C1566d;
import com.google.android.finsky.by.C0999d;
import com.google.android.finsky.by.C2197a;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.wireless.android.finsky.dfe.h.a.f;
import com.squareup.leakcanary.C7582R;

public class ci extends ck implements C1566d, C0999d, ch {
    public final C1557b f14360d = C1473m.f7980a.aY();
    public boolean f14361e;
    public boolean f14362f;

    public final int mo2978e() {
        return 1;
    }

    public final int mo2977c(int i) {
        return C7582R.layout.family_share_module_layout;
    }

    public final boolean mo2979f() {
        return (this.b == null || ((cj) this.b).f14363a == null) ? false : true;
    }

    public final void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null) {
            this.b = new cj();
            ((cj) this.b).f14364b = document;
            ((cj) this.b).f14363a = this.f14360d.mo2305a(this.t, document);
            this.f14360d.mo2309a((C1566d) this);
            this.D.mo2814a((C0999d) this);
        } else if (z && document.f14885a.f12091H) {
            ((cj) this.b).f14364b = document;
            ((cj) this.b).f14363a = this.f14360d.mo2305a(this.t, document);
            m14040a();
        }
    }

    public final void mo2980h() {
        this.f14361e = true;
        this.f14360d.mo2312b((C1566d) this);
        this.D.mo2819b(this);
    }

    public final void mo2976b(View view, int i) {
        FamilyShareLayout familyShareLayout = (FamilyShareLayout) view;
        if (!familyShareLayout.f14012d || this.f14362f) {
            this.f14362f = false;
            familyShareLayout.m13769a(this, ((cj) this.b).f14363a);
        }
    }

    public final void mo3056a(C1565a c1565a, boolean z) {
        int i;
        this.f14360d.mo2308a(this.A, ((cj) this.b).f14363a, z);
        if (z) {
            i = 5225;
        } else {
            i = 5226;
        }
        C1473m.f7980a.mo2049a(C1473m.f7980a.cY()).m13325a(i, ((cj) this.b).f14364b.f14885a.f12087D, this.I);
    }

    public final void mo3055a(C1565a c1565a) {
        this.f14360d.mo2311b(C0954a.aC);
        if (c1565a != null) {
            c1565a.f8375f = false;
        }
    }

    public final void mo3061d() {
        this.z.mo3629a(4, this.J);
    }

    public final void mo3062i() {
        this.u.mo3032a(this);
        this.f14360d.mo2313c().mo2334o();
    }

    public final boolean mo3059a(String str, String str2, f fVar) {
        return m14041b(str, str2);
    }

    public final boolean mo3058a(String str, String str2) {
        if (!m14041b(str, str2)) {
            return false;
        }
        m14040a();
        return true;
    }

    public final void ab_() {
    }

    public final void mo1204a(C2197a c2197a) {
        ((cj) this.b).f14363a = this.f14360d.mo2305a(this.t, ((cj) this.b).f14364b);
        m14040a();
    }

    private final boolean m14041b(String str, String str2) {
        return !this.f14361e && ((cj) this.b).f14364b.f14885a.f12096c.equals(str2) && C1473m.f7980a.cZ().equals(str);
    }

    private final void m14040a() {
        if (mo2979f()) {
            this.f14362f = true;
            this.u.mo3033a(this, false);
            return;
        }
        this.u.mo3032a(this);
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((cj) c2600d);
        if (this.b != null) {
            this.f14360d.mo2309a((C1566d) this);
            this.D.mo2814a((C0999d) this);
        }
    }
}
