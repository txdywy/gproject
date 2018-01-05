package org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class C7970q extends BroadcastReceiver {
    public final /* synthetic */ Context f40945a;
    public final /* synthetic */ C7969p f40946b;

    C7970q(C7969p c7969p, Context context) {
        this.f40946b = c7969p;
        this.f40945a = context;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f40945a.unregisterReceiver(this);
        this.f40946b.f40943a.f40948b.getAuthToken(this.f40946b.f40943a.f40951e, this.f40946b.f40943a.f40950d, this.f40946b.f40943a.f40949c, true, new C7969p(this.f40946b.f40944b, this.f40946b.f40943a), null);
    }
}
