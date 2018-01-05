package com.google.android.finsky.cm;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInstaller$Session;
import android.content.pm.PackageInstaller$SessionInfo;
import android.os.Handler;
import com.google.android.finsky.accounts.a;
import com.google.android.finsky.ba.c;
import com.google.android.finsky.ba.e;
import com.google.android.finsky.cs.e;
import com.google.android.finsky.utils.FinskyLog;
import java.io.IOException;
import java.util.HashMap;

public final class com.google.android.finsky.cm.g implements Runnable
{

    public final String a;
    public final com.google.android.finsky.cm.d b;
    public final com.google.android.finsky.cm.e c;

    g(com.google.android.finsky.cm.e p0, String p1, com.google.android.finsky.cm.d p2) {
        this.c = p0;
        this.a = p1;
        this.b = p2;
    }

    public final void run() {
        v2 = 1;
        v0 = (PackageInstaller$SessionInfo)this.c.c.get(this.a);
        v1 = (PackageInstaller$Session)this.c.d.get(this.a);
        if (v0 == 0 || v1 == 0) {
            v1 = new Object[1];
            v1[0] = this.a;
            FinskyLog.e("Unexpected missing open session for %s", v1);
            this.c.f.post(new com.google.android.finsky.cm.h(this));
        }
        else {
            if (this.c.i.dj().a(12642050)) {
                try {
                    if (v1.getNames().length > 0) {
                    }
                    else
                        v2 = 0;
                }
                catch (IOException ex) {
                    v5 = new Object[1];
                    v5[0] = this.a;
                    FinskyLog.c("Error calling getNames() on session for: %s", v5);
                }
            }
            if (v2 != 0) {
                v4 = this.c.k.b();
                if (v4 == 0)
                    v2 = 0;
                else
                    v2 = v4.name;
                v4 = this.c.j.a("SaturnV", "delay_installation_ms", v2);
                if (v4 > 0) {
                    try {
                        Thread.sleep(v4);
                    }
                    catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                        FinskyLog.c("Install delay (experiment) interrupted", new Object[0]);
                    }
                }
                v5 = new com.google.android.finsky.cm.j(this.c, this.a, v0.getSessionId(), this.b);
                v4 = String.valueOf("com.android.vending.INTENT_PACKAGE_INSTALL_COMMIT.");
                v0 = String.valueOf(this.a);
                if (v0.length() != 0)
                    v0 = v4.concat(v0);
                else
                    v0 = new String(v4);
                v4 = new IntentFilter();
                v4.addAction(v0);
                this.c.a.registerReceiver(v5, v4);
                v1.commit(PendingIntent.getBroadcast(this.c.a, this.a.hashCode(), new Intent(v0), 1207959552).getIntentSender());
                v1.close();
                this.c.d.remove(this.a);
            }
            else {
                this.c.b(v0.getSessionId(), this.a);
                this.c.a(new com.google.android.finsky.cm.i(this));
            }
        }
    }

}
