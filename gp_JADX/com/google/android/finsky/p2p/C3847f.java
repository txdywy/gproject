package com.google.android.finsky.p2p;

import com.google.android.finsky.p108z.C0978f;
import com.google.android.finsky.p108z.C4809e;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.ExecutionException;

public final /* synthetic */ class C3847f implements C0978f {
    public static final C0978f f19222a = new C3847f();

    private C3847f() {
    }

    public final void mo1172a(C4809e c4809e) {
        Throwable e;
        try {
            FinskyLog.m21659a("Wrote row to frosting DB: %d", (Long) c4809e.get());
            return;
        } catch (ExecutionException e2) {
            e = e2;
        } catch (InterruptedException e3) {
            e = e3;
        }
        FinskyLog.m21660a(e, "Failed to store new Frosting via upsertFrosting call", new Object[0]);
    }
}
