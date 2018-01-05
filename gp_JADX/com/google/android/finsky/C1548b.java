package com.google.android.finsky;

import com.google.wireless.android.finsky.b.ab;

final class C1548b implements Runnable {
    public final /* synthetic */ ab f8315a;
    public final /* synthetic */ DfeNotificationManagerImpl f8316b;

    C1548b(DfeNotificationManagerImpl dfeNotificationManagerImpl, ab abVar) {
        this.f8316b = dfeNotificationManagerImpl;
        this.f8315a = abVar;
    }

    public final void run() {
        this.f8316b.m5712b(this.f8315a);
    }
}
