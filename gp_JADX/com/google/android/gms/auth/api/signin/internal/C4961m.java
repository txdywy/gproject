package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.internal.nh;

public abstract class C4961m extends nh implements C4960l {
    public C4961m() {
        attachInterface(this, "com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (m22919a(i, parcel, parcel2, i2)) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        mo4498a();
        return true;
    }
}
