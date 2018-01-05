package com.google.android.finsky.verifier.impl;

import android.os.RemoteException;
import com.google.android.finsky.utils.FinskyLog;
import java.util.concurrent.Callable;

final class as implements Callable {
    public final /* synthetic */ String f24401a;
    public final /* synthetic */ ar f24402b;

    as(ar arVar, String str) {
        this.f24402b = arVar;
        this.f24401a = str;
    }

    private final Boolean m22084a() {
        try {
            if (this.f24402b.f24399c != null) {
                return Boolean.valueOf(this.f24402b.f24399c.mo4332a(this.f24401a));
            }
            FinskyLog.m21667d("Should not happen, single user settings service is null", new Object[0]);
            return Boolean.valueOf(false);
        } catch (RemoteException e) {
            FinskyLog.m21667d("Unable to connect coordinator service", new Object[0]);
            return Boolean.valueOf(false);
        }
    }

    public final /* synthetic */ Object call() {
        return m22084a();
    }
}
