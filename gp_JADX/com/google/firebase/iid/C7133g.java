package com.google.firebase.iid;

import android.content.Intent;

final class C7133g implements Runnable {
    public /* synthetic */ Intent f34862a;
    public /* synthetic */ Intent f34863b;
    public /* synthetic */ C7127f f34864c;

    C7133g(C7127f c7127f, Intent intent, Intent intent2) {
        this.f34864c = c7127f;
        this.f34862a = intent;
        this.f34863b = intent2;
    }

    public final void run() {
        this.f34864c.mo6018b(this.f34862a);
        this.f34864c.m32362d(this.f34863b);
    }
}
