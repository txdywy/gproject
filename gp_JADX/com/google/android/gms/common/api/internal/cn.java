package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.C4948f;
import com.google.android.gms.common.api.C5053a;
import com.google.android.gms.common.api.C5056g;
import com.google.android.gms.common.api.C5058o;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.am;

public abstract class cn extends ct implements co {
    public final C5056g f25455b;
    public final C5053a f25456c;

    public cn(C5053a c5053a, C5058o c5058o) {
        super((C5058o) am.m23734a((Object) c5058o, (Object) "GoogleApiClient must not be null"));
        this.f25455b = c5053a.m23274b();
        this.f25456c = c5053a;
    }

    private final void m23081a(RemoteException remoteException) {
        m23084b(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    public abstract void mo4496a(C4948f c4948f);

    public final void m23084b(Status status) {
        am.m23743b(!status.m23271a(), "Failed result must not be success");
        m23071a(mo4495a(status));
    }

    public final void m23085b(C4948f c4948f) {
        try {
            mo4496a(c4948f);
        } catch (RemoteException e) {
            m23081a(e);
            throw e;
        } catch (RemoteException e2) {
            m23081a(e2);
        }
    }
}
