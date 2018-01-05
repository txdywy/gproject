package com.google.android.finsky.services;

import android.accounts.Account;
import android.os.StrictMode;
import com.google.android.finsky.C1473m;
import java.util.concurrent.Semaphore;

final class C4080n extends C4072f {
    public final /* synthetic */ MarketCatalogService f20441a;

    C4080n(MarketCatalogService marketCatalogService) {
        this.f20441a = marketCatalogService;
    }

    public final boolean mo3904a(String str, int i) {
        StrictMode.noteSlowCall("MarketCatalogService.isBackendEnabled");
        Semaphore semaphore = new Semaphore(0);
        boolean[] zArr = new boolean[1];
        Account b = C1473m.f7980a.mo2041U().mo1183b(str);
        if (b == null) {
            return false;
        }
        C1473m.f7980a.mo2038R().m15108a(C1473m.f7980a.mo2112b(b.name), false, false, new C4081o(i, zArr, semaphore));
        semaphore.acquireUninterruptibly();
        this.f20441a.stopSelf();
        return zArr[0];
    }
}
