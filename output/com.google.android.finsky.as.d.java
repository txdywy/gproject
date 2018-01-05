package com.google.android.finsky.as;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.e.a;
import com.google.android.e.b;
import com.google.android.finsky.utils.FinskyLog;

public final class com.google.android.finsky.as.d implements ServiceConnection
{

    public final com.google.android.finsky.as.c a;
    public final Context b;
    public final com.google.android.finsky.as.b c;

    d(com.google.android.finsky.as.b p0, Context p1, com.google.android.finsky.as.c p2) {
        this.c = p0;
        this.b = p1;
        this.a = p2;
    }

    public final void onServiceConnected(ComponentName p0, IBinder p1) {
  2:    enter com.google.android.finsky.as.b;
  3:    if (p1 == 0)
  5:        v0 = 0;
        else {
 40:        v0 = p1.queryLocalInterface("com.google.android.nfcprovision.ISchoolOwnedService");
 46:        if (v0 instanceof com.google.android.e.a)
 48:            v0 = (com.google.android.e.a)v0;
            else
 53:            v0 = new com.google.android.e.b(p1);
        }
 16:    this.c.b = Boolean.valueOf(v0.a());
 20:    this.b.unbindService(this);
 33:    this.a.a(this.c.b.booleanValue());
 36:    exit com.google.android.finsky.as.b;
 37:    return;
 58:    exit com.google.android.finsky.as.b;
 59:    throw ex;
 61:    try {
 66:        FinskyLog.e("Error calling school-ownership service; assume not school-owned", new Object[0]);
 76:        this.c.b = Boolean.valueOf(0);
        }
        catch (Throwable ex) {
100:        this.b.unbindService(this);
113:        this.a.a(this.c.b.booleanValue());
116:        throw ex;
        }
 80:    this.b.unbindService(this);
 93:    this.a.a(this.c.b.booleanValue());
 96:    goto 36;
100:    this.b.unbindService(this);
113:    this.a.a(this.c.b.booleanValue());
116:    throw ex;
117:    try
            run 78...117
        catch (Throwable ex) {
 78:        goto 57;
        }
119:    try
            run 18...59
        catch (Throwable ex) {
 18:        goto 57;
        }
120:    try
            run 6...18
        catch (RemoteException ex) {
  6:        goto 60;
        }
        catch (Throwable ex) {
  6:        goto 97;
        }
    }

    public final void onServiceDisconnected(ComponentName p0) {
    }

}
