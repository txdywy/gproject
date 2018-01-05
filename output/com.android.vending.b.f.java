package com.android.vending.b;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.android.vending.b.f extends com.google.android.a.b implements com.android.vending.b.e
{

    f() {
        com.google.android.a.b();
        this.attachInterface(this, "com.android.vending.billing.IFirstPartyInAppBillingService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
  5:    if (!this.routeToSuperOrEnforceInterface(p0, p1, p2, p3)) goto 9;
  7:    v0 = 1;
  8:    return v0;
  9:    switch (p0) {
            case 1:
  9:            goto 14;
            case 2:
  9:            goto 42;
            case 3:
  9:            goto 78;
            case 4:
  9:            goto 114;
            case 5:
  9:            goto 146;
            case 6:
  9:            goto 174;
            case 7:
  9:            goto 198;
            default:
        }
 12:    v0 = 0;
 13:    goto 8;
 34:    p2.writeNoException();
 37:    p2.writeInt(this.a(p1.readString(), p1.readInt(), p1.readString(), p1.readString()));
 40:    v0 = 1;
 41:    goto 8;
 71:    p2.writeNoException();
 74:    com.google.android.a.c.b(p2, this.a(p1.readString(), p1.readInt(), p1.readString(), p1.readString(), (Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
 77:    goto 40;
107:    p2.writeNoException();
110:    com.google.android.a.c.b(p2, this.a(p1.readString(), p1.readInt(), p1.readString(), p1.readString(), p1.readString(), p1.readString()));
113:    goto 40;
139:    p2.writeNoException();
142:    com.google.android.a.c.b(p2, this.a(p1.readString(), p1.readInt(), p1.readString(), p1.readString(), p1.readString()));
145:    goto 40;
166:    p2.writeNoException();
169:    p2.writeInt(this.b(p1.readString(), p1.readInt(), p1.readString(), p1.readString()));
172:    goto 40;
174:    p1.readString();
177:    p1.readInt();
180:    p1.readString();
183:    p1.readString();
190:    p2.writeNoException();
193:    p2.writeInt(this.a());
196:    goto 40;
231:    p2.writeNoException();
234:    com.google.android.a.c.b(p2, this.a(p1.readString(), p1.readInt(), p1.readString(), p1.createStringArrayList(), p1.readString(), p1.readString(), p1.readString()));
237:    goto 40;
    }

}
