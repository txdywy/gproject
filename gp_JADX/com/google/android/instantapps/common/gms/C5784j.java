package com.google.android.instantapps.common.gms;

import com.google.common.f.a.aw;
import com.google.common.f.a.bb;
import com.google.common.f.a.bc;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import p000c.p001a.C0000a;
import p002a.p003a.C0004c;

public final class C5784j implements C0000a {
    public final C0000a f29222a;

    public C5784j(C0000a c0000a) {
        this.f29222a = c0000a;
    }

    public final /* synthetic */ Object mo1a() {
        Object obj;
        ExecutorService executorService = (ExecutorService) this.f29222a.mo1a();
        if (executorService instanceof aw) {
            obj = (aw) executorService;
        } else if (executorService instanceof ScheduledExecutorService) {
            bc bcVar = new bc((ScheduledExecutorService) executorService);
        } else {
            bb bbVar = new bb(executorService);
        }
        return (aw) C0004c.m7a(obj, "Cannot return null from a non-@Nullable @Provides method");
    }
}
