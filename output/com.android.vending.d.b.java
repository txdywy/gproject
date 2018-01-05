package com.android.vending.d;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.android.vending.d.b extends com.google.android.a.b implements com.android.vending.d.a
{

    b() {
        com.google.android.a.b();
        this.attachInterface(this, "com.android.vending.details.IDetailsService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
  5:    if (!this.routeToSuperOrEnforceInterface(p0, p1, p2, p3)) goto 9;
  7:    v0 = 1;
  8:    return v0;
  9:    switch (p0) {
            case 1:
  9:            goto 14;
            case 2:
  9:            goto 30;
            default:
        }
 12:    v0 = 0;
 13:    goto 8;
 22:    p2.writeNoException();
 25:    com.google.android.a.c.b(p2, this.a(p1.readString()));
 28:    v0 = 1;
 29:    goto 8;
 46:    p2.writeNoException();
 49:    com.google.android.a.c.b(p2, this.a(p1.readString(), (Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
 52:    goto 28;
    }

}
