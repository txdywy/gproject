package com.google.android.wallet.p369c.p375c;

import android.os.Bundle;
import com.google.android.wallet.common.p374d.C6532b;
import com.google.android.wallet.common.util.ParcelableProto;
import com.google.p443h.p451c.p457c.p470c.p471a.C7189g;
import com.google.p443h.p451c.p457c.p470c.p471a.C7190h;

public final class C6533a extends C6532b {
    public C7190h af;
    public C7189g f32607i;

    public final void mo5508e(Bundle bundle) {
        super.mo5508e(bundle);
        if (this.f32607i != null) {
            bundle.putParcelable("submitRequest", ParcelableProto.m29885a(this.f32607i));
        }
        if (this.af != null) {
            bundle.putParcelable("submitResponse", ParcelableProto.m29885a(this.af));
        }
    }

    protected final void mo5506a(Bundle bundle) {
        super.mo5506a(bundle);
        this.f32607i = (C7189g) ParcelableProto.m29887a(bundle, "submitRequest");
        this.af = (C7190h) ParcelableProto.m29887a(bundle, "submitResponse");
    }

    protected final void mo5505W() {
        this.f32607i = null;
        this.af = null;
    }
}
