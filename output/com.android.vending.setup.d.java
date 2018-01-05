package com.android.vending.setup;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ResultReceiver;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.android.vending.setup.d extends com.google.android.a.b implements com.android.vending.setup.c
{

    d() {
        com.google.android.a.b();
        this.attachInterface(this, "com.android.vending.setup.IPlaySetupServiceV2");
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
            case 3:
  9:            goto 37;
            case 4:
  9:            goto 48;
            case 5:
  9:            goto 63;
            case 6:
  9:            goto 78;
            case 7:
  9:            goto 97;
            case 8:
  9:            goto 116;
            case 9:
  9:            goto 131;
            case 10:
  9:            goto 12;
            case 11:
  9:            goto 12;
            case 12:
  9:            goto 146;
            case 13:
  9:            goto 166;
            case 14:
  9:            goto 194;
            default:
        }
 12:    v0 = 0;
 13:    goto 8;
 22:    this.a((ResultReceiver)com.google.android.a.c.a(p1, ResultReceiver.CREATOR));
 25:    p2.writeNoException();
 28:    v0 = 1;
 29:    goto 8;
 30:    this.a();
 33:    p2.writeNoException();
 36:    goto 28;
 41:    p2.writeNoException();
 44:    com.google.android.a.c.a(p2, this.b());
 47:    goto 28;
 56:    p2.writeNoException();
 59:    com.google.android.a.c.b(p2, this.a(p1.readString()));
 62:    goto 28;
 71:    p2.writeNoException();
 74:    com.google.android.a.c.b(p2, this.b(p1.readString()));
 77:    goto 28;
 90:    p2.writeNoException();
 93:    com.google.android.a.c.b(p2, this.a(p1.readString(), p1.readLong()));
 96:    goto 28;
109:    p2.writeNoException();
112:    com.google.android.a.c.b(p2, this.a(p1.readString(), p1.createStringArray()));
115:    goto 28;
124:    this.a((Bundle[])p1.createTypedArray(Bundle.CREATOR));
127:    p2.writeNoException();
130:    goto 28;
139:    this.b((ResultReceiver)com.google.android.a.c.a(p1, ResultReceiver.CREATOR));
142:    p2.writeNoException();
145:    goto 28;
158:    p2.writeNoException();
161:    com.google.android.a.c.b(p2, this.a((Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
164:    goto 28;
186:    p2.writeNoException();
189:    com.google.android.a.c.b(p2, this.a((ResultReceiver)com.google.android.a.c.a(p1, ResultReceiver.CREATOR), (Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
192:    goto 28;
206:    p2.writeNoException();
209:    com.google.android.a.c.b(p2, this.b((Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
212:    goto 28;
    }

}
