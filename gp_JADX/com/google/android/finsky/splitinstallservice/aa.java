package com.google.android.finsky.splitinstallservice;

import com.google.android.finsky.p108z.C4809e;
import com.google.android.play.p122c.p246b.p247a.C6279c;
import java.util.concurrent.ExecutionException;

final /* synthetic */ class aa implements Runnable {
    public final C4809e f21150a;
    public final C6279c f21151b;
    public final ao f21152c;

    aa(C4809e c4809e, C6279c c6279c, ao aoVar) {
        this.f21150a = c4809e;
        this.f21151b = c6279c;
        this.f21152c = aoVar;
    }

    public final void run() {
        try {
            this.f21152c.mo4017a(this.f21150a.get());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            C4215q.m19610c(this.f21151b, -100);
        }
    }
}
