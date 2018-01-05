package com.google.android.finsky.billing.lightpurchase.p159a;

import android.os.Bundle;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1290m;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.p111d.C2471a;
import com.google.android.finsky.p111d.C2474c;
import com.google.android.finsky.p111d.C2495w;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.finsky.a.a.m;
import com.google.wireless.android.finsky.dfe.nano.au;
import com.squareup.leakcanary.C7582R;

public final class C1896i extends C1089s implements C0657w, C0660x, C1031w {
    public final C2471a f9700a = C1473m.f7980a.aR();
    public C1254c f9701b;
    public m f9702c;
    public String f9703d;
    public C2719i f9704e;
    public C2495w f9705f;

    public final void mo136b(Bundle bundle) {
        this.f9701b = C1473m.f7980a.mo2112b(this.f760q.getString("authAccount"));
        if (bundle != null) {
            this.f9705f = this.f9700a.m13179a(bundle);
        } else {
            this.f9705f = this.f9700a.m13179a(this.f760q);
        }
        super.mo136b(bundle);
    }

    private final void m10129a(int i, Throwable th) {
        C2474c a = new C2474c(518).m13238a(th);
        if (i != -1) {
            a.m13210a(i);
        }
        this.f9705f.m13367a(a);
    }

    public final void m_() {
        Document b = this.f9704e.m14722b();
        if (b == null) {
            this.f9703d = m592c((int) C7582R.string.item_unavailable_message);
            m6758b(3, 0);
        } else if (b.f14885a.f12088E) {
            m6758b(4, 0);
        } else {
            m6758b(7, 0);
        }
    }

    public final void mo1062a(VolleyError volleyError) {
        FinskyLog.m21665c("Volley error received: %s", volleyError);
        m10129a(1, volleyError);
        this.f9703d = C1290m.m7702a(C1473m.f7980a.f7981b, volleyError);
        m6758b(3, 0);
    }

    public final /* synthetic */ void b_(Object obj) {
        au auVar = (au) obj;
        this.f9702c = auVar.b;
        if (this.f9702c == null) {
            if (auVar.c) {
                m10129a(-1, null);
                m6758b(2, 0);
                return;
            }
            throw new IllegalStateException("Received no challenge.");
        } else if (this.f9702c.d != null) {
            m10129a(2, null);
            m6758b(5, 0);
        } else if (this.f9702c.e != null) {
            m10129a(3, null);
            m6758b(6, 0);
        } else if (this.f9702c.n != null) {
            m10129a(4, null);
            m6758b(3, 1);
        } else {
            throw new IllegalStateException("Received unknown challenge.");
        }
    }
}
