package com.google.android.finsky.billing.lightpurchase;

import android.os.Bundle;
import com.android.volley.VolleyError;
import com.google.android.finsky.billing.common.s;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.dfemodel.i;

public final class com.google.android.finsky.billing.lightpurchase.p extends com.google.android.finsky.billing.common.s implements com.android.volley.w, com.google.android.finsky.dfemodel.w
{

    public com.google.android.finsky.dfemodel.i a;
    public Document b;

    p() {
        com.google.android.finsky.billing.common.s();
    }

    protected final void a(Bundle p0) {
        super.a(p0);
        this.b = (Document)p0.getParcelable("DocumentSidecar.document");
    }

    public final void a(VolleyError p0) {
        this.b(3, 0);
    }

    public final void e(Bundle p0) {
        super.e(p0);
        p0.putParcelable("DocumentSidecar.document", this.b);
    }

    public final void m_() {
        this.b = this.a.b();
        if (this.b != 0)
            v0 = 2;
        else
            v0 = 3;
        this.b(v0, 0);
    }

}
