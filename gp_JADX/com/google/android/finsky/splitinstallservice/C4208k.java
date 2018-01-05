package com.google.android.finsky.splitinstallservice;

import android.content.Intent;
import android.content.pm.PackageInstaller.Session;
import com.google.android.finsky.utils.FinskyLog;

final /* synthetic */ class C4208k implements Runnable {
    public final C4207j f21244a;
    public final Intent f21245b;
    public final String f21246c;
    public final Session f21247d;
    public final C4198m f21248e;

    C4208k(C4207j c4207j, Intent intent, String str, Session session, C4198m c4198m) {
        this.f21244a = c4207j;
        this.f21245b = intent;
        this.f21246c = str;
        this.f21247d = session;
        this.f21248e = c4198m;
    }

    public final void run() {
        C4207j c4207j = this.f21244a;
        Intent intent = this.f21245b;
        String str = this.f21246c;
        Session session = this.f21247d;
        C4198m c4198m = this.f21248e;
        String stringExtra = intent.getStringExtra("android.content.pm.extra.STATUS_MESSAGE");
        if (intent.getIntExtra("android.content.pm.extra.STATUS", Integer.MIN_VALUE) == 0) {
            c4207j.f21243c.mo2856b(str);
            C4207j.m19587a(session);
            c4198m.mo4018a();
            return;
        }
        String str2 = "Error committing session: ";
        String valueOf = String.valueOf(stringExtra);
        FinskyLog.m21667d(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), new Object[0]);
        C4207j.m19587a(session);
        c4198m.mo4019b();
    }
}
