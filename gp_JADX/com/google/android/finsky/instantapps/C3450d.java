package com.google.android.finsky.instantapps;

import android.app.ApplicationErrorReport.CrashInfo;
import android.util.Log;
import java.io.IOException;
import java.lang.Thread.UncaughtExceptionHandler;

final /* synthetic */ class C3450d implements UncaughtExceptionHandler {
    public final EphemeralInstallerActivity f17625a;

    C3450d(EphemeralInstallerActivity ephemeralInstallerActivity) {
        this.f17625a = ephemeralInstallerActivity;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        EphemeralInstallerActivity ephemeralInstallerActivity = this.f17625a;
        try {
            ephemeralInstallerActivity.f17283A.m27042a(th);
        } catch (Throwable th2) {
            Log.e("EphemeralInstallerAct", "Could not log launch result as exception", th2);
        }
        try {
            ephemeralInstallerActivity.f17305w.m27012a(new CrashInfo(th));
        } catch (IOException e) {
            Log.e("EphemeralInstallerAct", "Could not write crash to disk");
        }
        if (ephemeralInstallerActivity.f17299q != null) {
            ephemeralInstallerActivity.f17299q.uncaughtException(thread, th);
        }
    }
}
