package com.google.android.finsky.detailspage;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.detailsmodules.p183a.C2600d;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2335k;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.C2721l;
import com.google.android.finsky.dfemodel.Document;

public abstract class ej extends ck implements C0657w, C1031w {
    protected abstract ek mo3047a(Document document);

    public boolean mo2979f() {
        return (this.b == null || ((ek) this.b).f14358e == null || !((ek) this.b).f14358e.mo2861a()) ? false : true;
    }

    public void mo2974a(boolean z, Document document, C2719i c2719i, Document document2, C2719i c2719i2) {
        if (this.b == null) {
            this.b = mo3047a(document);
            if (this.b != null) {
                aa_();
            }
        }
    }

    protected void aa_() {
        C2335k c2335k = ((ek) this.b).f14358e;
        if (c2335k == null) {
            C1473m.f7980a.aO();
            C2335k a = C2721l.m14733a(this.w, ((ek) this.b).f14357d, false, true);
            ((ek) this.b).f14358e = a;
            c2335k = a;
        }
        c2335k.m11918a((C1031w) this);
        c2335k.m11917a((C0657w) this);
        if (!c2335k.mo2861a()) {
            c2335k.m14699n();
        }
    }

    public void mo2980h() {
        if (this.b != null && ((ek) this.b).f14358e != null) {
            ((ek) this.b).f14358e.m11922b((C1031w) this);
            ((ek) this.b).f14358e.m11921b((C0657w) this);
        }
    }

    public final void mo1062a(VolleyError volleyError) {
    }

    public final /* synthetic */ void mo2973a(C2600d c2600d) {
        super.mo2973a((ek) c2600d);
        if (this.b != null) {
            aa_();
        }
    }
}
