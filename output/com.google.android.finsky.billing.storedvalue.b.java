package com.google.android.finsky.billing.storedvalue;

import android.content.Intent;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.br.b;
import com.google.android.finsky.d.w;
import com.google.android.finsky.m;

public final class com.google.android.finsky.billing.storedvalue.b implements com.google.android.finsky.billing.common.u
{

    b() {
    }

    public final Intent a(String p0, String p1, com.google.android.finsky.d.w p2) {
        if (com.google.android.finsky.m.a.j(p0).a(12634793))
            v0 = com.google.android.finsky.m.a.bo().a(com.google.android.finsky.m.a.U().b(p0), com.google.android.finsky.m.a.b, com.google.android.finsky.m.a.j(p0), 0, p2, 0, 0, 1, 0);
        else {
            v0 = new Intent(com.google.android.finsky.m.a.b, StoredValueTopUpActivity);
            v0.putExtra("authAccount", p0);
            v0.putExtra("list_url", p1);
            p2.b(p0).a(v0);
        }
        return v0;
    }

}
