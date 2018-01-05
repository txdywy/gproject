package com.google.android.finsky.billing.storedvalue;

import android.content.Intent;
import com.google.android.finsky.C1473m;
import com.google.android.finsky.billing.common.C1803u;
import com.google.android.finsky.p111d.C2495w;

public final class C2098b implements C1803u {
    public final Intent mo2639a(String str, String str2, C2495w c2495w) {
        C1473m c1473m = C1473m.f7980a;
        if (c1473m.mo2249j(str).mo2294a(12634793)) {
            return C1473m.f7980a.bo().mo2726a(c1473m.mo2041U().mo1183b(str), c1473m.f7981b, c1473m.mo2249j(str), null, c2495w, null, null, true, false);
        }
        Intent intent = new Intent(c1473m.f7981b, StoredValueTopUpActivity.class);
        intent.putExtra("authAccount", str);
        intent.putExtra("list_url", str2);
        c2495w.m13380b(str).m13376a(intent);
        return intent;
    }
}
