package com.google.android.finsky.instantapps.install;

import android.annotation.TargetApi;
import java.util.concurrent.CompletableFuture;

final class af implements C3501e {
    public final /* synthetic */ CompletableFuture f17716a;

    af(CompletableFuture completableFuture) {
        this.f17716a = completableFuture;
    }

    @TargetApi(26)
    public final void mo3538a() {
        this.f17716a.complete(Boolean.valueOf(true));
    }

    @TargetApi(26)
    public final void mo3539b() {
        this.f17716a.complete(Boolean.valueOf(false));
    }
}
