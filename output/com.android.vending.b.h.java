package com.android.vending.b;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.android.vending.b.h extends com.google.android.a.b implements com.android.vending.b.g
{

    h() {
        com.google.android.a.b();
        this.attachInterface(this, "com.android.vending.billing.IInAppBillingService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
  5:    if (!this.routeToSuperOrEnforceInterface(p0, p1, p2, p3)) goto 9;
  7:    v0 = 1;
  8:    return v0;
  9:    switch (p0) {
            case 1:
  9:            goto 14;
            case 2:
  9:            goto 38;
            case 3:
  9:            goto 69;
            case 4:
  9:            goto 101;
            case 5:
  9:            goto 128;
            case 6:
  9:            goto 151;
            case 7:
  9:            goto 172;
            case 8:
  9:            goto 209;
            case 9:
  9:            goto 250;
            case 10:
  9:            goto 287;
            case 11:
  9:            goto 319;
            case 12:
  9:            goto 356;
            default:
        }
 12:    v0 = 0;
 13:    goto 8;
 30:    p2.writeNoException();
 33:    p2.writeInt(this.a(p1.readInt(), p1.readString(), p1.readString()));
 36:    v0 = 1;
 37:    goto 8;
 62:    p2.writeNoException();
 65:    com.google.android.a.c.b(p2, this.a(p1.readInt(), p1.readString(), p1.readString(), (Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
 68:    goto 36;
 94:    p2.writeNoException();
 97:    com.google.android.a.c.b(p2, this.a(p1.readInt(), p1.readString(), p1.readString(), p1.readString(), p1.readString()));
100:    goto 36;
121:    p2.writeNoException();
124:    com.google.android.a.c.b(p2, this.a(p1.readInt(), p1.readString(), p1.readString(), p1.readString()));
127:    goto 36;
144:    p2.writeNoException();
147:    p2.writeInt(this.b(p1.readInt(), p1.readString(), p1.readString()));
150:    goto 36;
151:    p1.readInt();
154:    p1.readString();
157:    p1.readString();
164:    p2.writeNoException();
167:    p2.writeInt(this.a());
170:    goto 36;
201:    p2.writeNoException();
204:    com.google.android.a.c.b(p2, this.a(p1.readInt(), p1.readString(), p1.createStringArrayList(), p1.readString(), p1.readString(), p1.readString()));
207:    goto 36;
242:    p2.writeNoException();
245:    com.google.android.a.c.b(p2, this.a(p1.readInt(), p1.readString(), p1.readString(), p1.readString(), p1.readString(), (Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
248:    goto 36;
279:    p2.writeNoException();
282:    com.google.android.a.c.b(p2, this.a(p1.readInt(), p1.readString(), p1.readString(), p1.readString(), (Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
285:    goto 36;
311:    p2.writeNoException();
314:    p2.writeInt(this.b(p1.readInt(), p1.readString(), p1.readString(), (Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
317:    goto 36;
348:    p2.writeNoException();
351:    com.google.android.a.c.b(p2, this.b(p1.readInt(), p1.readString(), p1.readString(), p1.readString(), (Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
354:    goto 36;
380:    p2.writeNoException();
383:    p2.writeInt(this.c(p1.readInt(), p1.readString(), p1.readString(), (Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
386:    goto 36;
    }

}
