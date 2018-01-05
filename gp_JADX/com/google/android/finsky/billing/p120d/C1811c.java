package com.google.android.finsky.billing.p120d;

import android.accounts.Account;
import com.google.android.finsky.dfemodel.Document;
import com.google.wireless.android.finsky.dfe.nano.ee;
import java.util.HashMap;
import java.util.Map;

public final class C1811c {
    public final Account f9363a;
    public final Document f9364b;
    public final Map f9365c;
    public final C1091e f9366d;
    public final boolean f9367e;
    public final boolean f9368f;

    private C1811c(Account account, Document document, Map map, C1091e c1091e) {
        this.f9363a = account;
        this.f9364b = document;
        this.f9365c = map;
        this.f9366d = c1091e;
        this.f9367e = false;
        this.f9368f = false;
    }

    public C1811c(Account account, Document document) {
        this(account, document, null);
    }

    public C1811c(Account account, Document document, C1091e c1091e) {
        this(account, document, null, c1091e);
    }

    public C1811c(Account account, ee eeVar, C1091e c1091e) {
        Document document = new Document(eeVar.n);
        Map hashMap = new HashMap();
        hashMap.put("papci", eeVar.q);
        this(account, document, hashMap, c1091e);
    }
}
