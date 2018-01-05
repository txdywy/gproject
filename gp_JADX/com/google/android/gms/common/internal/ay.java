package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

public final class ay extends C5114w {
    public ar f25996a;
    public final int f25997b;

    public ay(ar arVar, int i) {
        this.f25996a = arVar;
        this.f25997b = i;
    }

    public final void mo4614a() {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    public final void mo4615a(int i, IBinder iBinder, Bundle bundle) {
        am.m23734a(this.f25996a, (Object) "onPostInitComplete can be called only once per call to getRemoteService");
        this.f25996a.mo5111a(i, iBinder, bundle, this.f25997b);
        this.f25996a = null;
    }
}
