package com.android.vending.b;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.android.vending.b.d extends com.google.android.a.b implements com.android.vending.b.c
{

    d() {
        com.google.android.a.b();
        this.attachInterface(this, "com.android.vending.billing.IBillingService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
        if (this.routeToSuperOrEnforceInterface(p0, p1, p2, p3))
            v0 = 1;
        else if (p0 == 1) {
            p2.writeNoException();
            com.google.android.a.c.b(p2, this.a((Bundle)com.google.android.a.c.a(p1, Bundle.CREATOR)));
            v0 = 1;
        }
        else
            v0 = 0;
        return v0;
    }

}
