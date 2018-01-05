package com.google.android.finsky.ak;

import java.util.concurrent.Callable;

public final /* synthetic */ class C1199b implements Callable {
    public final C1198a f7307a;

    public C1199b(C1198a c1198a) {
        this.f7307a = c1198a;
    }

    public final Object call() {
        C1198a c1198a = this.f7307a;
        c1198a.f7305c.close();
        c1198a.f7303a.deleteDatabase(c1198a.f7305c.getDatabaseName());
        return Boolean.valueOf(true);
    }
}
