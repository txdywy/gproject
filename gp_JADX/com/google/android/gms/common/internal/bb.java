package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

public final class bb extends as {
    public /* synthetic */ ar f26001c;
    public IBinder f26002f;

    public bb(ar arVar, int i, IBinder iBinder, Bundle bundle) {
        this.f26001c = arVar;
        super(arVar, i, bundle);
        this.f26002f = iBinder;
    }

    protected final void mo4616a(ConnectionResult connectionResult) {
        if (this.f26001c.f25430w != null) {
            this.f26001c.f25430w.mo4621a(connectionResult);
        }
        this.f26001c.m23010a(connectionResult);
    }

    protected final boolean mo4617a() {
        try {
            String interfaceDescriptor = this.f26002f.getInterfaceDescriptor();
            if (this.f26001c.mo4483b().equals(interfaceDescriptor)) {
                IInterface a = this.f26001c.mo4482a(this.f26002f);
                if (a == null) {
                    return false;
                }
                if (!this.f26001c.m22992a(2, 4, a) && !this.f26001c.m22992a(3, 4, a)) {
                    return false;
                }
                this.f26001c.f25433z = null;
                if (this.f26001c.f25429v != null) {
                    this.f26001c.f25429v.mo4619a();
                }
                return true;
            }
            String b = this.f26001c.mo4483b();
            Log.e("GmsClient", new StringBuilder((String.valueOf(b).length() + 34) + String.valueOf(interfaceDescriptor).length()).append("service descriptor mismatch: ").append(b).append(" vs. ").append(interfaceDescriptor).toString());
            return false;
        } catch (RemoteException e) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
