package com.android.vending.b;

import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.android.vending.b.b extends com.google.android.a.b implements com.android.vending.b.a
{

    b() {
        com.google.android.a.b();
        this.attachInterface(this, "com.android.vending.billing.IBillingAccountService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
        v0 = 1;
        if (this.routeToSuperOrEnforceInterface(p0, p1, p2, p3))
            return v0;
        switch (p0) {
            case 1:
                p2.writeNoException();
                p2.writeInt(this.a(p1.readString()));
                break;
            case 2:
                p2.writeNoException();
                com.google.android.a.c.b(p2, this.b(p1.readString()));
                break;
            default:
                v0 = 0;
                break;
        }
    }

}
