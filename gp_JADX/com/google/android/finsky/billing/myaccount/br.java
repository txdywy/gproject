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
import com.google.wireless.android.finsky.b.w;

public final class br extends C1089s implements C0657w {
    public C1287h f10266a;
    public final C0660x ah = new bt(this);
    public C1254c f10267b;
    public String f10268c;
    public ax f10269d;
    public w f10270e;
    public VolleyError f10271f;
    public final C0660x f10272g = new bs(this);

    public static br m10617a(String str, String str2, ax axVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("accountName is required");
        } else if (str2 == null) {
            throw new IllegalArgumentException("docidStr is required");
        } else if (axVar == null) {
            throw new IllegalArgumentException("fullDocid is required");
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", str);
            bundle.putString("SubscriptionActionSidecar.docidStr", str2);
            bundle.putParcelable("SubscriptionActionSidecar.docid", ParcelableProto.m21671a((C0757i) axVar));
            Fragment brVar = new br();
            brVar.m600f(bundle);
            return brVar;
        }
    }

    public final void mo136b(Bundle bundle) {
        super.mo136b(bundle);
        ((C1356s) C3947d.m18649a(C1356s.class)).mo1755a(this);
        Bundle bundle2 = this.f760q;
        this.f10267b = this.f10266a.mo2016a(bundle2.getString("authAccount"));
        this.f10268c = bundle2.getString("SubscriptionActionSidecar.docidStr");
        this.f10269d = (ax) ParcelableProto.m21673a(bundle2, "SubscriptionActionSidecar.docid");
    }

    public final void mo1062a(VolleyError volleyError) {
        this.f10271f = volleyError;
        m6758b(3, 0);
    }
}
