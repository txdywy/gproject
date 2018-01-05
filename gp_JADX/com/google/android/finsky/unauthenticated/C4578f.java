package com.google.android.finsky.unauthenticated;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import com.google.android.finsky.p108z.C1207b;
import com.google.android.finsky.p111d.C2495w;
import java.util.List;

final /* synthetic */ class C4578f implements C1207b {
    public final UnauthenticatedMainActivity f23394a;

    C4578f(UnauthenticatedMainActivity unauthenticatedMainActivity) {
        this.f23394a = unauthenticatedMainActivity;
    }

    public final Object mo1528a(Object obj) {
        UnauthenticatedMainActivity unauthenticatedMainActivity = this.f23394a;
        List list = (List) obj;
        unauthenticatedMainActivity.f23381v.setVisibility(8);
        unauthenticatedMainActivity.f23382w.setVisibility(0);
        if (list.isEmpty()) {
            unauthenticatedMainActivity.mo4265b(C4574a.m21211a(unauthenticatedMainActivity.f23380u));
        } else {
            C2495w c2495w = unauthenticatedMainActivity.f23380u;
            Fragment c4579g = new C4579g();
            Bundle bundle = new Bundle();
            c2495w.m13377a(bundle);
            c4579g.m600f(bundle);
            unauthenticatedMainActivity.mo4265b(c4579g);
        }
        return null;
    }
}
