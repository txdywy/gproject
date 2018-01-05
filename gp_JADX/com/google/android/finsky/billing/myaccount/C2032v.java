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
import com.google.wireless.android.finsky.dfe.nano.fw;

public final class C2032v extends C1089s implements C0657w, C0660x {
    public C1287h f10479a;
    public C1254c f10480b;
    public String f10481c;
    public ax f10482d;
    public fw f10483e;
    public VolleyError f10484f;

    public static C2032v m10714a(String str, String str2, ax axVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("accountName is required");
        } else if (str2 == null) {
            throw new IllegalArgumentException("docidStr is required");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("CancelSubscription.authAccount", str);
            bundle.putString("CancelSubscription.docidStr", str2);
            bundle.putParcelable("CancelSubscription.docid", ParcelableProto.m21671a((C0757i) axVar));
            Fragment c2032v = new C2032v();
            c2032v.m600f(bundle);
            return c2032v;
        }
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1765a(this);
        Bundle bundle2 = this.f760q;
        this.f10480b = this.f10479a.mo2016a(bundle2.getString("CancelSubscription.authAccount"));
        this.f10481c = bundle2.getString("CancelSubscription.docidStr");
        this.f10482d = (ax) ParcelableProto.m21673a(bundle2, "CancelSubscription.docid");
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f10484f = volleyError;
        m6758b(3, 0);
    }

    public final /* synthetic */ void b_(Object obj) {
        this.f10483e = (fw) obj;
        m6758b(2, 0);
    }
}
