package org.chromium.net.impl;

import java.util.concurrent.Executor;
import org.chromium.net.C7938k;
import org.chromium.net.C7944n;
import org.chromium.net.av;
import org.chromium.net.aw;

public abstract class C7939d extends C7938k {
    protected abstract bv mo6604a(String str, aw awVar, Executor executor, int i, boolean z, boolean z2, boolean z3);

    public final C7944n mo6601b(String str, aw awVar, Executor executor) {
        return new bw(str, awVar, executor, this);
    }

    public final /* synthetic */ av mo6600a(String str, aw awVar, Executor executor) {
        return mo6601b(str, awVar, executor);
    }
}
