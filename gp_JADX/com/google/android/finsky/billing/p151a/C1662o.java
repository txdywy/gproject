package com.google.android.finsky.billing.p151a;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

final class C1662o implements C0978f {
    C1662o() {
    }

    public final void mo1172a(C4809e c4809e) {
        InterruptedException e;
        try {
            if (((Long) c4809e.get()).longValue() <= 0) {
                FinskyLog.m21665c("Couldn't schedule a Janitor", new Object[0]);
            }
        } catch (ExecutionException e2) {
            e = e2;
            FinskyLog.m21665c("Got an exception scheduling a Janitor: %s", e);
        } catch (InterruptedException e3) {
            e = e3;
            FinskyLog.m21665c("Got an exception scheduling a Janitor: %s", e);
        }
    }
}
