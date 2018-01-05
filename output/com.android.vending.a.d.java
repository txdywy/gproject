package com.android.vending.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.android.vending.a.d extends com.google.android.a.b implements com.android.vending.a.c
{

    d() {
        com.google.android.a.b();
        this.attachInterface(this, "com.android.vending.appdiscoveryservice.IAppDiscoveryService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
  5:    if (!this.routeToSuperOrEnforceInterface(p0, p1, p2, p3)) goto 9;
  7:    v0 = 1;
  8:    return v0;
  9:    switch (p0) {
            case 1:
  9:            goto 14;
            case 2:
  9:            goto 70;
            default:
        }
 12:    v0 = 0;
 13:    goto 8;
 34:    v8 = p1.readStrongBinder();
 38:    if (v8 == 0)
 40:        v6 = 0;
        else {
 52:        v0 = v8.queryLocalInterface("com.android.vending.appdiscoveryservice.IAppDiscoveryReceiver");
 58:        if (v0 instanceof com.android.vending.a.a)
 62:            v6 = (com.android.vending.a.a)v0;
            else
 66:            v6 = new com.android.vending.a.b(v8);
        }
 42:    this.a(p1.readInt(), p1.readInt(), p1.readInt(), com.google.android.a.c.a(p1), p1.readString(), v6);
 45:    p2.writeNoException();
 48:    v0 = 1;
 49:    goto 8;
 74:    this.a(p1.readInt());
 77:    goto 45;
    }

}
