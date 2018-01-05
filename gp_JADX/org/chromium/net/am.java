package org.chromium.net;

import android.content.Intent;

final class am implements Runnable {
    public final /* synthetic */ Intent f40670a;
    public final /* synthetic */ al f40671b;

    am(al alVar, Intent intent) {
        this.f40671b = alVar;
        this.f40670a = intent;
    }

    public final void run() {
        this.f40671b.f40669a.m37854a(this.f40671b, al.m37945a(this.f40670a));
    }
}
