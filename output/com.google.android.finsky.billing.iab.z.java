package com.google.android.finsky.billing.iab;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.finsky.as.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.billing.acquire.f;
import com.google.android.finsky.billing.common.PurchaseParams;
import com.google.android.finsky.billing.lightpurchase.IabV3Activity;
import com.google.android.finsky.billing.lightpurchase.vr.VrPurchaseActivity;
import com.google.android.finsky.br.b;
import com.google.android.finsky.cv.a.ax;
import com.google.android.finsky.dfemodel.q;
import com.google.android.finsky.m;
import com.google.vr.b.a.e;

public final class com.google.android.finsky.billing.iab.z implements com.google.android.finsky.billing.iab.y
{

    z() {
    }

    public final Intent a(Account p0, PurchaseParams p1) {
        v4 = 0;
        v0 = com.google.android.finsky.m.a.bo();
        v3 = com.google.android.finsky.m.a.j(p0.name);
        if (com.google.android.finsky.as.a.a(com.google.android.finsky.m.a.b))
            v4 = v0.a(p0, com.google.android.finsky.m.a.b, p1, v3);
        else if (com.google.android.finsky.as.a.b(com.google.android.finsky.m.a.b))
            v4 = v0.a(p0, p1);
        else {
            if (p1.a != 0)
                v1 = p1.a.c;
            else
                v1 = 0;
            if (com.google.android.finsky.dfemodel.q.a(v1) && !v3.a(12633472))
                v5 = 1;
            else
                v5 = 0;
            if (com.google.android.finsky.dfemodel.q.b(v1) && !v3.a(12633473))
                v1 = 1;
            else
                v1 = 0;
            if (v3.a(12626591) && (v5 != 0 || v1 != 0))
                v1 = 1;
            else
                v1 = 0;
            if (p1.o != 0 && ((!v3.a(12637988)) || (!com.google.android.finsky.billing.acquire.f.a()) || v1 == 0)) {
                if (com.google.vr.b.a.e.a(com.google.android.finsky.m.a.b) == 0)
                    v4 = VrPurchaseActivity.a(p0, p1, 0);
            }
            else if (v1 != 0)
                v4 = v0.a(p0, com.google.android.finsky.m.a.b, v3, 0, 0, p1, 0, 0, 1);
            else
                v4 = IabV3Activity.a(p0, p1);
        }
        return v4;
    }

}
