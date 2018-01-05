package com.android.vending.e;

import android.os.Parcel;
import com.google.android.a.b;
import com.google.android.a.c;

public class com.android.vending.e.b extends com.google.android.a.b implements com.android.vending.e.a
{

    b() {
        com.google.android.a.b();
        this.attachInterface(this, "com.android.vending.reviews.IReviewsService");
    }

    public boolean onTransact(int p0, Parcel p1, Parcel p2, int p3) {
        v0 = 1;
        if (!this.routeToSuperOrEnforceInterface(p0, p1, p2, p3)) {
            if (p0 == 1) {
                p2.writeNoException();
                com.google.android.a.c.b(p2, this.a(p1.readString(), p1.readString()));
            }
            else
                v0 = 0;
        }
        return v0;
    }

}
