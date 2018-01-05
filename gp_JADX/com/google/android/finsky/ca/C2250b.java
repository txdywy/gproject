package com.google.android.finsky.ca;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.finsky.dfe.nano.dc;

final class C2250b implements ServiceConnection {
    public final dc[] f11175a;
    public final String f11176b;
    public final /* synthetic */ C2249a f11177c;

    public C2250b(C2249a c2249a, dc[] dcVarArr, String str) {
        this.f11177c = c2249a;
        this.f11175a = (dc[]) aj.m21700a(dcVarArr);
        this.f11176b = (String) aj.m21700a(str);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Messenger messenger = new Messenger(iBinder);
        for (dc dcVar : this.f11175a) {
            String str = dcVar.c;
            try {
                Bundle a = this.f11177c.m11679a(dcVar.d);
                Bundle bundle = new Bundle();
                bundle.putString("packageName", str);
                bundle.putBundle("applicationRestrictions", a);
                Message obtain = Message.obtain(null, 1);
                obtain.setData(bundle);
                messenger.send(obtain);
                this.f11177c.f11172c.mo2667a(str, dcVar.e);
                this.f11177c.m11680a(this.f11176b, 1302, "via-dpc-proxy", 0, null, str);
            } catch (Exception e) {
                this.f11177c.m11680a(this.f11176b, 1304, "via-dpc-proxy", 5, e, str);
            }
        }
        this.f11177c.f11171b.unbindService(this);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f11177c.m11680a(this.f11176b, 1304, "via-dpc-proxy", 4, null, null);
    }
}
