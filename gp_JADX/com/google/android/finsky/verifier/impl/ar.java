package com.google.android.finsky.verifier.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.finsky.aa.C0955b;
import com.google.android.finsky.providers.C3947d;
import com.google.android.finsky.utils.C4671b;
import com.google.android.finsky.utils.FinskyLog;
import com.google.android.finsky.utils.bb;
import com.google.android.finsky.verifier.C4723a;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class ar {
    public Context f24397a;
    public au f24398b = null;
    public C4723a f24399c;
    public ArrayList f24400d = new ArrayList();

    private final void m22080a(Runnable runnable) {
        if (this.f24399c != null) {
            FinskyLog.m21659a("Single user settings service already running", new Object[0]);
            runnable.run();
            return;
        }
        FinskyLog.m21659a("Single user settings service is not running, bind it now", new Object[0]);
        synchronized (this.f24400d) {
            this.f24400d.add(runnable);
            if (this.f24398b == null) {
                this.f24398b = new au(this);
                if (!this.f24397a.bindService(new Intent(this.f24397a, SingleUserSettingsService.class), this.f24398b, 5)) {
                    FinskyLog.m21669e("Couldn't start service for %s", new Intent(this.f24397a, SingleUserSettingsService.class));
                }
            }
        }
    }

    private final boolean m22081a() {
        if (C4671b.m21787d()) {
            boolean z;
            if (this.f24397a.checkPermission("android.permission.INTERACT_ACROSS_USERS", Process.myPid(), Process.myUid()) == 0) {
                z = true;
            } else {
                FinskyLog.m21667d("Should not happen, INTERACT_ACROSS_USERS is not granted", new Object[0]);
                z = false;
            }
            if (!z) {
                FinskyLog.m21667d("Should not happen, INTERACT_ACROSS_USERS is not granted", new Object[0]);
                return false;
            } else if (!bb.m21795c()) {
                return true;
            } else {
                FinskyLog.m21669e("This method should not be running on main thread!", new Object[0]);
                return false;
            }
        }
        FinskyLog.m21669e("This API is for L+ only", new Object[0]);
        return false;
    }

    public final boolean m22082a(String str) {
        if (!m22081a()) {
            return false;
        }
        Runnable futureTask = new FutureTask(new as(this, str));
        m22080a(futureTask);
        try {
            return ((Boolean) futureTask.get((long) ((Integer) C0955b.cs.m28964b()).intValue(), TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException e) {
            FinskyLog.m21667d("Unable to connect coordinator service", new Object[0]);
            return false;
        } catch (ExecutionException e2) {
            FinskyLog.m21667d("Unable to connect coordinator service", new Object[0]);
            return false;
        } catch (TimeoutException e3) {
            FinskyLog.m21667d("Unable to connect coordinator service", new Object[0]);
            return false;
        }
    }

    public final long m22083b(String str) {
        if (!m22081a()) {
            return 0;
        }
        Runnable futureTask = new FutureTask(new at(this, str));
        m22080a(futureTask);
        try {
            return ((Long) futureTask.get((long) ((Integer) C0955b.cs.m28964b()).intValue(), TimeUnit.SECONDS)).longValue();
        } catch (InterruptedException e) {
            FinskyLog.m21667d("Unable to connect coordinator service", new Object[0]);
            return 0;
        } catch (ExecutionException e2) {
            FinskyLog.m21667d("Unable to connect coordinator service", new Object[0]);
            return 0;
        } catch (TimeoutException e3) {
            FinskyLog.m21667d("Unable to connect coordinator service", new Object[0]);
            return 0;
        }
    }

    public ar() {
        ((ac) C3947d.m18649a(ac.class)).mo1981a(this);
    }
}
