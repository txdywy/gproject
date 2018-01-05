package com.google.android.finsky.billing.updatesubscriptioninstrument;

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
import com.google.protobuf.nano.C0757i;
import com.google.wireless.android.finsky.a.a.bc;
import com.google.wireless.android.finsky.a.a.bd;

public final class C2100c extends C1089s implements C0657w, C0660x {
    public C1287h f10701a;
    public C1254c f10702b;
    public final bc f10703c = new bc();
    public bd f10704d;
    public VolleyError f10705e;

    public static C2100c m10986a(String str, ax axVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("accountName is required");
        } else if (axVar == null) {
            throw new IllegalArgumentException("docid is required");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("UpdateSubscriptionInstrument.authAccount", str);
            bundle.putParcelable("UpdateSubscriptionInstrument.docid", ParcelableProto.m21671a((C0757i) axVar));
            Fragment c2100c = new C2100c();
            c2100c.m600f(bundle);
            return c2100c;
        }
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        ((C1359a) C3947d.m18649a(C1359a.class)).mo1775a(this);
        Bundle bundle2 = this.f760q;
        this.f10702b = this.f10701a.mo2016a(bundle2.getString("UpdateSubscriptionInstrument.authAccount"));
        this.f10703c.f = (ax) ParcelableProto.m21673a(bundle2, "UpdateSubscriptionInstrument.docid");
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f10705e = volleyError;
        m6758b(3, 0);
    }

    final void m10987a(int i) {
        if (i != 0) {
            bc bcVar = this.f10703c;
            bcVar.h = bc.a(i);
            bcVar.b |= 16;
        }
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f10704d = (bd) obj;
        m6758b(2, 0);
    }
}
