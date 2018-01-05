package com.android.vending.setup;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.android.vending.setup.b extends com.google.android.a.b implements com.android.vending.setup.a
{

    b() {
        com.google.android.a.b();
        this.attachInterface(this, "com.android.vending.setup.IPlaySetupService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
  5:    if (!this.routeToSuperOrEnforceInterface(p0, p1, p2, p3)) goto 9;
  7:    v0 = 1;
  8:    return v0;
  9:    switch (p0) {
            case 1:
  9:            goto 14;
            case 2:
  9:            goto 26;
            case 3:
  9:            goto 33;
            case 4:
  9:            goto 44;
            case 5:
  9:            goto 59;
            case 6:
  9:            goto 66;
            case 7:
  9:            goto 77;
            case 8:
  9:            goto 84;
            case 9:
  9:            goto 103;
            case 10:
  9:            goto 122;
            case 11:
  9:            goto 177;
            case 12:
  9:            goto 157;
            case 13:
  9:            goto 141;
            default:
        }
 12:    v0 = 0;
 13:    goto 8;
 18:    p2.writeNoException();
 21:    com.google.android.a.c.b(p2, this.a());
 24:    v0 = 1;
 25:    goto 8;
 26:    this.b();
 29:    p2.writeNoException();
 32:    goto 24;
 37:    p2.writeNoException();
 40:    com.google.android.a.c.a(p2, this.c());
 43:    goto 24;
 52:    p2.writeNoException();
 55:    com.google.android.a.c.b(p2, this.a(p1.readString()));
 58:    goto 24;
 59:    this.d();
 62:    p2.writeNoException();
 65:    goto 24;
 70:    p2.writeNoException();
 73:    com.google.android.a.c.b(p2, this.e());
 76:    goto 24;
 77:    this.f();
 80:    p2.writeNoException();
 83:    goto 24;
 96:    p2.writeNoException();
 99:    com.google.android.a.c.b(p2, this.a((RestoreConfig)com.google.android.a.c.a(p1, RestoreConfig.CREATOR)));
102:    goto 24;
115:    p2.writeNoException();
118:    com.google.android.a.c.b(p2, this.a(p1.readString(), p1.readLong()));
121:    goto 24;
134:    this.a(p1.readString(), (Bundle[])p1.createTypedArray(Bundle.CREATOR));
137:    p2.writeNoException();
140:    goto 24;
149:    this.a((ResultReceiver)com.google.android.a.c.a(p1, ResultReceiver.CREATOR));
152:    p2.writeNoException();
155:    goto 24;
169:    p2.writeNoException();
172:    com.google.android.a.c.b(p2, this.a(p1.readString(), p1.createStringArray()));
175:    goto 24;
181:    p2.writeNoException();
184:    com.google.android.a.c.b(p2, this.g());
187:    goto 24;
    }

}
