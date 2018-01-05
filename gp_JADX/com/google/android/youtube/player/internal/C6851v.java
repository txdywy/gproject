package com.google.android.youtube.player.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

public final class C6851v extends C6850x implements C6840d {
    public final String f33875a;
    public final String f33876b;
    public final String f33877c;
    public boolean f33878d;

    public C6851v(Context context, String str, String str2, String str3, aj ajVar, ak akVar) {
        super(context, ajVar, akVar);
        this.f33875a = (String) C6838b.m31127a((Object) str);
        this.f33876b = C6838b.m31129a(str2, (Object) "callingPackage cannot be null or empty");
        this.f33877c = C6838b.m31129a(str3, (Object) "callingAppVersion cannot be null or empty");
    }

    protected final void mo5736a(C6843o c6843o, ac acVar) {
        c6843o.mo5729a(acVar, this.f33876b, this.f33877c, this.f33875a);
    }

    public final void mo5737a(boolean z) {
        if (m31203f()) {
            try {
                ((C6846r) m31207j()).mo5731a(z);
            } catch (RemoteException e) {
            }
            this.f33878d = true;
        }
    }

    protected final String mo5738b() {
        return "com.google.android.youtube.player.internal.IYouTubeService";
    }

    protected final String mo5739c() {
        return "com.google.android.youtube.api.service.START";
    }

    public final void mo5732d() {
        if (!this.f33878d) {
            mo5737a(true);
        }
        super.mo5732d();
    }

    public final IBinder mo5734a() {
        m31206i();
        if (this.f33878d) {
            throw new IllegalStateException("Connection client has been released");
        }
        try {
            return ((C6846r) m31207j()).mo5730a();
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    protected final /* synthetic */ IInterface mo5735a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.youtube.player.internal.IYouTubeService");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof C6846r)) ? new C6847s(iBinder) : (C6846r) queryLocalInterface;
    }
}
