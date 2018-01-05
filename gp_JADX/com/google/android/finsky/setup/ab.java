package com.google.android.finsky.setup;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.dfemodel.Document;
import com.google.android.finsky.utils.FinskyLog;
import java.util.List;

final class ab implements C1091e {
    public final /* synthetic */ List f20758a;
    public final /* synthetic */ aa f20759b;

    ab(aa aaVar, List list) {
        this.f20759b = aaVar;
        this.f20758a = list;
    }

    public final void mo1425a(Account account, Document document) {
        FinskyLog.m21659a("Successfully acquired document: %s", document.f14885a.f12100g);
        this.f20758a.add((Bundle) this.f20759b.f20756a.get(document.f14885a.f12097d));
    }

    public final void S_() {
        FinskyLog.m21659a("Failed to acquire document.", new Object[0]);
    }
}
