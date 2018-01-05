package com.google.android.finsky.ca;

import android.content.ComponentName;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.google.android.finsky.bn.b;
import com.google.android.finsky.utils.aj;
import com.google.wireless.android.finsky.dfe.nano.dc;

public final class com.google.android.finsky.ca.b implements ServiceConnection
{

    public final dc[] a;
    public final String b;
    public final com.google.android.finsky.ca.a c;

    b(com.google.android.finsky.ca.a p0, dc[] p1, String p2) {
        this.c = p0;
        this.a = (dc[])com.google.android.finsky.utils.aj.a(p1);
        this.b = (String)com.google.android.finsky.utils.aj.a(p2);
    }

    public final void onServiceConnected(ComponentName p0, IBinder p1) {
        v7 = 0;
        while (v7 < this.a.length) {
            try {
                v2 = new Bundle();
                v2.putString("packageName", this.a[v7].c);
                v2.putBundle("applicationRestrictions", this.c.a(this.a[v7].d));
                v1 = Message.obtain(0, 1);
                v1.setData(v2);
                new Messenger(p1).send(v1);
                this.c.c.a(this.a[v7].c, this.a[v7].e);
                com.google.android.finsky.ca.a.a(this.c, this.b, 1302, "via-dpc-proxy", 0, 0, this.a[v7].c);
            }
            catch (RemoteException ex) {
                com.google.android.finsky.ca.a.a(this.c, this.b, 1304, "via-dpc-proxy", 5, ex, this.a[v7].c);
            }
            v7 = v7 + 1;
        }
        this.c.b.unbindService(this);
    }

    public final void onServiceDisconnected(ComponentName p0) {
        com.google.android.finsky.ca.a.a(this.c, this.b, 1304, "via-dpc-proxy", 4, 0, 0);
    }

}
