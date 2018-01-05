package com.google.android.finsky.splitinstallservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInstaller.Session;
import java.util.concurrent.Executor;

final class C4209l extends BroadcastReceiver {
    public final /* synthetic */ String f21249a;
    public final /* synthetic */ Session f21250b;
    public final /* synthetic */ Executor f21251c;
    public final /* synthetic */ C4198m f21252d;
    public final /* synthetic */ C4207j f21253e;

    C4209l(C4207j c4207j, String str, Session session, Executor executor, C4198m c4198m) {
        this.f21253e = c4207j;
        this.f21249a = str;
        this.f21250b = session;
        this.f21251c = executor;
        this.f21252d = c4198m;
    }

    public final void onReceive(Context context, Intent intent) {
        this.f21253e.f21241a.unregisterReceiver(this);
        Intent intent2 = intent;
        this.f21251c.execute(new C4208k(this.f21253e, intent2, this.f21249a, this.f21250b, this.f21252d));
    }
}
