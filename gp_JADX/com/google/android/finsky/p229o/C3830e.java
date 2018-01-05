package com.google.android.finsky.p229o;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.C4678i;
import com.google.android.finsky.utils.FinskyLog;
import com.google.wireless.android.a.a.a.a.y;
import com.google.wireless.android.finsky.dfe.b.a.a.a;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class C3830e implements C0978f {
    public final y f19180a;
    public final long f19181b;
    public final C4809e f19182c;
    public final C3826a f19183d;
    public final a f19184e;
    public final CountDownLatch f19185f;

    C3830e(y yVar, long j, C4809e c4809e, C3826a c3826a, a aVar, CountDownLatch countDownLatch) {
        this.f19180a = yVar;
        this.f19181b = j;
        this.f19182c = c4809e;
        this.f19183d = c3826a;
        this.f19184e = aVar;
        this.f19185f = countDownLatch;
    }

    public final void mo1172a(C4809e c4809e) {
        y yVar = this.f19180a;
        long j = this.f19181b;
        C4809e c4809e2 = this.f19182c;
        C3826a c3826a = this.f19183d;
        a aVar = this.f19184e;
        CountDownLatch countDownLatch = this.f19185f;
        j = C4678i.m21813b() - j;
        yVar.b |= 2;
        yVar.d = j;
        try {
            if (((Boolean) c4809e2.get()).booleanValue()) {
                c3826a.mo3814a(aVar);
            } else {
                yVar.a(1903);
            }
        } catch (ExecutionException e) {
            FinskyLog.m21665c("Exception while adding data to request", e);
            yVar.a(1901);
        } catch (InterruptedException e2) {
            FinskyLog.m21665c("Interrupted while adding data to request", e2);
            yVar.a(1902);
        }
        countDownLatch.countDown();
    }
}
