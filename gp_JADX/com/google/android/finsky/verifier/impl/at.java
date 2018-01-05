package com.google.android.finsky.verifier.impl;

import android.os.RemoteException;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Callable;

final class at implements Callable {
    public final /* synthetic */ String f24403a;
    public final /* synthetic */ ar f24404b;

    at(ar arVar, String str) {
        this.f24404b = arVar;
        this.f24403a = str;
    }

    private final Long m22085a() {
        try {
            if (this.f24404b.f24399c != null) {
                return Long.valueOf(this.f24404b.f24399c.mo4333b(this.f24403a));
            }
            FinskyLog.m21667d("Should not happen, single user settings service is null", new Object[0]);
            return Long.valueOf(0);
        } catch (RemoteException e) {
            FinskyLog.m21667d("Unable to connect coordinator service", new Object[0]);
            return Long.valueOf(0);
        }
    }

    public final /* synthetic */ Object call() {
        return m22085a();
    }
}
