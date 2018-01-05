package com.google.android.instantapps.common.gms;

import com.google.android.gms.common.api.C1643x;
import java.util.concurrent.Executor;

public abstract class ak implements aj {
    public final Executor f29201e;
    public final C1643x f29202f;

    ak(Executor executor, C1643x c1643x) {
        this.f29201e = executor;
        this.f29202f = c1643x;
    }

    public final void mo5161b() {
        this.f29201e.execute(new al(this));
    }
}
