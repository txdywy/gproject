package com.google.android.finsky.billing.lightpurchase;

import android.os.Bundle;
import com.android.volley.C0657w;
import com.android.volley.VolleyError;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.dfemodel.C1031w;
import com.google.android.finsky.dfemodel.C2719i;
import com.google.android.finsky.dfemodel.Document;

public final class C1957p extends C1089s implements C0657w, C1031w {
    public C2719i f9959a;
    public Document f9960b;

    public final void mo140e(Bundle bundle) {
        super.mo140e(bundle);
        bundle.putParcelable("DocumentSidecar.document", this.f9960b);
    }

    protected final void mo2462a(Bundle bundle) {
        super.mo2462a(bundle);
        this.f9960b = (Document) bundle.getParcelable("DocumentSidecar.document");
    }

    public final void m_() {
        this.f9960b = this.f9959a.m14722b();
        m6758b(this.f9960b != null ? 2 : 3, 0);
    }

    public final void mo1062a(VolleyError volleyError) {
        m6758b(3, 0);
    }
}
