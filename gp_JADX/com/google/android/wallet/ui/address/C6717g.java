package com.google.android.wallet.ui.address;

import android.os.Bundle;
import com.android.volley.VolleyError;
import com.android.volley.w;
import com.google.android.wallet.common.util.C6595g;
import com.google.android.wallet.p383e.C6625i;

final class C6717g implements w {
    public final /* synthetic */ C6713c f33160a;

    C6717g(C6713c c6713c) {
        this.f33160a = c6713c;
    }

    public final void m30455a(VolleyError volleyError) {
        String str;
        this.f33160a.m30437a(false);
        Bundle bundle = new Bundle();
        String str2 = "EventListener.EXTRA_FORM_ID";
        if (this.f33160a.f33128U.a != null) {
            str = this.f33160a.f33128U.a.a;
        } else {
            str = this.f33160a.f33128U.b;
        }
        bundle.putString(str2, str);
        if (this.f33160a.f33115H != null) {
            this.f33160a.f33115H.mo5469a(5, C6595g.m29923a(bundle, 1000, this.f33160a.f33136f.getString(C6625i.wallet_uic_network_error_title), this.f33160a.f33136f.getString(C6625i.wallet_uic_network_error_message), null, null, this.f33160a.f33136f.getString(C6625i.wallet_uic_retry)));
        }
    }
}
