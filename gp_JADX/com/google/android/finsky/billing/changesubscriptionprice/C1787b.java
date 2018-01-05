package com.google.android.finsky.billing.changesubscriptionprice;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.android.volley.C0657w;
import com.android.volley.C0660x;
import com.android.volley.VolleyError;
import com.google.android.finsky.api.C1254c;
import com.google.android.finsky.api.C1287h;
import com.google.android.finsky.billing.common.C1089s;
import com.google.android.finsky.cv.p177a.ax;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.ParcelableProto;
import com.google.common.a.m;
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.dfe.c.a.as;
import com.google.wireless.android.finsky.dfe.c.a.at;

public final class C1787b extends C1089s implements C0657w, C0660x {
    public C1287h f9253a;
    public C1254c f9254b;
    public final as f9255c = new as();
    public at f9256d;
    public VolleyError f9257e;

    public static C1787b m9738a(String str, ax axVar) {
        String str2 = "accountName is required";
        if ((!TextUtils.isEmpty(str) ? 1 : null) == null) {
            throw new IllegalArgumentException(String.valueOf(str2));
        }
        m.a(axVar);
        Bundle bundle = new Bundle();
        bundle.putString("account_name", str);
        bundle.putParcelable("docid", ParcelableProto.m21671a((C0757i) axVar));
        Fragment c1787b = new C1787b();
        c1787b.m600f(bundle);
        return c1787b;
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        ((C1350a) C3947d.m18649a(C1350a.class)).mo1732a(this);
        Bundle bundle2 = this.f760q;
        this.f9254b = this.f9253a.mo2016a(bundle2.getString("account_name"));
        this.f9255c.a = (ax) ParcelableProto.m21673a(bundle2, "docid");
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f9257e = volleyError;
        m6758b(3, 0);
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f9256d = (at) obj;
        m6758b(2, 0);
    }
}
