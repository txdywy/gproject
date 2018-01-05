package com.google.android.finsky.splitinstallservice;

import android.annotation.TargetApi;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.Session;
import android.content.pm.PackageInstaller.SessionInfo;
import android.content.pm.PackageInstaller.SessionParams;
import com.google.android.finsky.cn.C2320a;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.C4692x;
import com.google.android.finsky.utils.FinskyLog;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

@TargetApi(21)
final class C4207j {
    public final Context f21241a;
    public final PackageInstaller f21242b;
    public final C2320a f21243c;

    C4207j(Context context, C2320a c2320a) {
        this.f21241a = context;
        this.f21242b = C4671b.m21787d() ? this.f21241a.getPackageManager().getPackageInstaller() : null;
        this.f21243c = c2320a;
    }

    public final void m19588a(String str, long j, Collection collection, Executor executor, C4198m c4198m) {
        if (this.f21242b != null) {
            SessionParams sessionParams = new SessionParams(2);
            sessionParams.setAppPackageName(str);
            sessionParams.setInstallLocation(0);
            if (j != 0) {
                sessionParams.setSize(j);
            }
            SessionInfo sessionInfo = this.f21242b.getSessionInfo(this.f21242b.createSession(sessionParams));
            Session openSession = this.f21242b.openSession(sessionInfo.getSessionId());
            for (File file : collection) {
                OutputStream openWrite = openSession.openWrite(file.getName(), 0, file.length());
                C4692x.m21843a(new FileInputStream(file), openWrite);
                openWrite.flush();
                openWrite.close();
            }
            int sessionId = sessionInfo.getSessionId();
            BroadcastReceiver c4209l = new C4209l(this, str, openSession, executor, c4198m);
            String stringBuilder = new StringBuilder(String.valueOf(str).length() + 69).append("com.android.vending.INTENT_SPLIT_COMPLETE_INSTALL_COMMIT.").append(str).append(".").append(sessionId).toString();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction(stringBuilder);
            this.f21241a.registerReceiver(c4209l, intentFilter);
            openSession.commit(PendingIntent.getBroadcast(this.f21241a, str.hashCode(), new Intent(stringBuilder), 1207959552).getIntentSender());
        }
    }

    static void m19587a(Session session) {
        try {
            session.close();
        } catch (Exception e) {
            String str = "Error closing session: ";
            String valueOf = String.valueOf(e.getMessage());
            FinskyLog.m21667d(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), new Object[0]);
        }
        try {
            session.abandon();
        } catch (SecurityException e2) {
        }
    }
}
