package com.google.android.finsky.setup;

import android.accounts.Account;
import com.google.android.finsky.billing.p120d.C1091e;
import com.google.android.finsky.dfemodel.Document;
import java.util.concurrent.atomic.AtomicInteger;

final class di implements C1091e {
    public final /* synthetic */ AtomicInteger f21067a;

    di(AtomicInteger atomicInteger) {
        this.f21067a = atomicInteger;
    }

    public final void mo1425a(Account account, Document document) {
    }

    public final void S_() {
        this.f21067a.incrementAndGet();
    }
}
