package com.google.android.finsky.billing.lightpurchase;

import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.squareup.leakcanary.C7582R;

final class au implements C0657w {
    public final /* synthetic */ C2495w f9793a;
    public final /* synthetic */ String f9794b;
    public final /* synthetic */ int f9795c;
    public final /* synthetic */ boolean f9796d;
    public final /* synthetic */ Document f9797e;
    public final /* synthetic */ C1091e f9798f;

    au(C2495w c2495w, String str, int i, boolean z, Document document, C1091e c1091e) {
        this.f9793a = c2495w;
        this.f9794b = str;
        this.f9795c = i;
        this.f9796d = z;
        this.f9797e = document;
        this.f9798f = c1091e;
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f9793a.m13367a(new C2474c(301).m13236a(this.f9794b).m13241b(this.f9795c).m13238a((Throwable) volleyError).m13210a(volleyError.f4022b != null ? volleyError.f4022b.f4166a : 0).m13242b(volleyError.f4023c));
        if (this.f9796d) {
            String a = C1473m.f7980a.m8582a((int) C7582R.string.error);
            String a2 = C1290m.m7702a(C1473m.f7980a.f7981b, volleyError);
            C1473m.f7980a.mo2259r().mo3793a(a, a2, a2, this.f9794b, this.f9797e.f14885a.f12116w, this.f9793a.m13365a());
        }
        if (this.f9798f != null) {
            this.f9798f.S_();
        }
    }
}
