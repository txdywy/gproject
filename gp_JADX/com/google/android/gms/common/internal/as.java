package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

abstract class as extends aw {
    public int f25992a;
    public Bundle f25993b;
    public /* synthetic */ ar f25994c;

    protected as(ar arVar, int i, Bundle bundle) {
        this.f25994c = arVar;
        super(arVar, Boolean.valueOf(true));
        this.f25992a = i;
        this.f25993b = bundle;
    }

    protected abstract void mo4616a(ConnectionResult connectionResult);

    protected final /* synthetic */ void mo4612a(Object obj) {
        PendingIntent pendingIntent = null;
        if (((Boolean) obj) == null) {
            this.f25994c.m22989a(1, null);
            return;
        }
        switch (this.f25992a) {
            case 0:
                if (!mo4617a()) {
                    this.f25994c.m22989a(1, null);
                    mo4616a(new ConnectionResult(8, null));
                    return;
                }
                return;
            case 10:
                this.f25994c.m22989a(1, null);
                throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
            default:
                this.f25994c.m22989a(1, null);
                if (this.f25993b != null) {
                    pendingIntent = (PendingIntent) this.f25993b.getParcelable("pendingIntent");
                }
                mo4616a(new ConnectionResult(this.f25992a, pendingIntent));
                return;
        }
    }

    protected abstract boolean mo4617a();

    protected final void mo4613b() {
    }
}
