package com.google.android.finsky.billing.myaccount;

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
import com.google.wireless.android.finsky.dfe.c.a.dz;

public final class bm extends C1089s implements C0657w, C0660x {
    public C1287h f10256a;
    public C1254c f10257b;
    public ax f10258c;
    public dz f10259d;
    public VolleyError f10260e;

    public static bm m10613a(String str, ax axVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("accountName is required");
        } else if (axVar == null) {
            throw new IllegalArgumentException("fullDocid is required");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("ReactivateSubscription.authAccount", str);
            bundle.putParcelable("ReactivateSubscription.docid", ParcelableProto.m21671a((C0757i) axVar));
            Fragment bmVar = new bm();
            bmVar.m600f(bundle);
            return bmVar;
        }
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1753a(this);
        Bundle bundle2 = this.f760q;
        this.f10257b = this.f10256a.mo2016a(bundle2.getString("ReactivateSubscription.authAccount"));
        this.f10258c = (ax) ParcelableProto.m21673a(bundle2, "ReactivateSubscription.docid");
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f10260e = volleyError;
        m6758b(3, 0);
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f10259d = (dz) obj;
        m6758b(2, 0);
    }
}
