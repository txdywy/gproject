package com.google.android.finsky.installer.p207a;

import android.os.RemoteException;
import com.google.android.finsky.utils.FinskyLog;

final class C3307y implements Runnable {
    public final /* synthetic */ String f17109a;
    public final /* synthetic */ C3301s f17110b;

    C3307y(C3301s c3301s, String str) {
        this.f17110b = c3301s;
        this.f17109a = str;
    }

    public final void run() {
        try {
            this.f17110b.f17068K.mo3468b(this.f17109a);
        } catch (RemoteException e) {
            FinskyLog.m21665c("Couldn't release %s *** received %s", this.f17109a, e);
        }
    }
}
