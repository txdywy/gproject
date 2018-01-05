package com.google.android.finsky.billing.d;

import android.accounts.Account;
import com.google.android.finsky.dfemodel.Document;
import com.google.wireless.android.finsky.dfe.nano.ee;
import java.util.HashMap;
import java.util.Map;

public class com.google.android.finsky.billing.d.c
{

    public final Account a;
    public final Document b;
    public final Map c;
    public final com.google.android.finsky.billing.d.e d;
    public final boolean e;
    public final boolean f;

    c(Account p0, Document p1) {
        com.google.android.finsky.billing.d.c(p0, p1, 0);
    }

    c(Account p0, Document p1, com.google.android.finsky.billing.d.e p2) {
        com.google.android.finsky.billing.d.c(p0, p1, 0, p2);
    }

    c(Account p0, Document p1, Map p2, com.google.android.finsky.billing.d.e p3) {
        this.a = p0;
        this.b = p1;
        this.c = p2;
        this.d = p3;
        this.e = 0;
        this.f = 0;
    }

    c(Account p0, com.google.wireless.android.finsky.dfe.nano.ee p1, com.google.android.finsky.billing.d.e p2) {
        v1 = new HashMap();
        v1.put("papci", p1.q);
        com.google.android.finsky.billing.d.c(p0, new Document(p1.n), v1, p2);
    }

}
