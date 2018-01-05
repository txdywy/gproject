package com.google.android.finsky.cm;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInstaller.Session;
import android.content.pm.PackageInstaller.SessionInfo;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;

final class C2300g implements Runnable {
    public final /* synthetic */ String f11342a;
    public final /* synthetic */ C2297d f11343b;
    public final /* synthetic */ C2298e f11344c;

    C2300g(C2298e c2298e, String str, C2297d c2297d) {
        this.f11344c = c2298e;
        this.f11342a = str;
        this.f11343b = c2297d;
    }

    public final void run() {
        int i = 1;
        SessionInfo sessionInfo = (SessionInfo) this.f11344c.f11332c.get(this.f11342a);
        Session session = (Session) this.f11344c.f11333d.get(this.f11342a);
        if (sessionInfo == null || session == null) {
            FinskyLog.m21669e("Unexpected missing open session for %s", this.f11342a);
            this.f11344c.f11335f.post(new C2301h(this));
            return;
        }
        if (this.f11344c.f11338i.dj().mo2294a(12642050)) {
            try {
                if (session.getNames().length <= 0) {
                    i = 0;
                }
            } catch (IOException e) {
                FinskyLog.m21665c("Error calling getNames() on session for: %s", this.f11342a);
            }
        }
        if (i != 0) {
            C2298e c2298e = this.f11344c;
            Account b = c2298e.f11340k.mo1196b();
            long a = c2298e.f11339j.mo2875a("SaturnV", "delay_installation_ms", b == null ? null : b.name);
            if (a > 0) {
                try {
                    Thread.sleep(a);
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    FinskyLog.m21665c("Install delay (experiment) interrupted", new Object[0]);
                }
            }
            c2298e = this.f11344c;
            String str = this.f11342a;
            BroadcastReceiver c2303j = new C2303j(c2298e, str, sessionInfo.getSessionId(), this.f11343b);
            String valueOf = String.valueOf("com.android.vending.INTENT_PACKAGE_INSTALL_COMMIT.");
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                valueOf2 = valueOf.concat(valueOf2);
            } else {
                valueOf2 = new String(valueOf);
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(valueOf2);
            c2298e.f11330a.registerReceiver(c2303j, intentFilter);
            session.commit(PendingIntent.getBroadcast(c2298e.f11330a, str.hashCode(), new Intent(valueOf2), 1207959552).getIntentSender());
            session.close();
            this.f11344c.f11333d.remove(this.f11342a);
            return;
        }
        this.f11344c.m11845b(sessionInfo.getSessionId(), this.f11342a);
        this.f11344c.m11832a(new C2302i(this));
    }
}
